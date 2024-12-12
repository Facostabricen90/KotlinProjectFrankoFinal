package org.example.project.data

import org.example.project.model.Expense
import org.example.project.model.ExpenseCategory

object ExpenseManager {
    private var currentId = 1L

    val fakeExpenseList = mutableListOf(
        Expense(
            id = currentId++,
            amount = 70.0,
            category = ExpenseCategory.GROCERIES,
            description = "Weekly buy"
        ),
        Expense(
            id = currentId++,
            amount = 10.2,
            category = ExpenseCategory.SNACKS,
            description = "Oxxo"
        ),
        Expense(
            id = currentId++,
            amount = 21000.2,
            category = ExpenseCategory.CAR,
            description = "Mazda 6"
        ),
        Expense(
            id = currentId++,
            amount = 213.54,
            category = ExpenseCategory.PARTY,
            description = "Weekend party"
        ),
        Expense(
            id = currentId++,
            amount = 708.0,
            category = ExpenseCategory.HOUSE,
            description = "New fridge"
        ),
        Expense(
            id = currentId++,
            amount = 108.0,
            category = ExpenseCategory.OTHER,
            description = "Services"
        )
    )

    fun addNewExpense(expense: Expense){
        fakeExpenseList.add(expense.copy(id = currentId++))
    }

    fun editExpense(expense: Expense){
        val index = fakeExpenseList.indexOfFirst {
            it.id == expense.id
        }
        if (index != -1){
            fakeExpenseList[index] = fakeExpenseList[index].copy(
                amount = expense.amount,
                category = expense.category,
                description = expense.description
            )
        }
    }

    fun deleteExpense(expense: Expense){
        val index = fakeExpenseList.indexOfFirst {
            it.id == expense.id
        }
        fakeExpenseList.removeAt(index)
    }

    fun getCategories(): List<ExpenseCategory> {
        return listOf(
            ExpenseCategory.GROCERIES,
            ExpenseCategory.PARTY,
            ExpenseCategory.SNACKS,
            ExpenseCategory.COFFEE,
            ExpenseCategory.CAR,
            ExpenseCategory.HOUSE,
            ExpenseCategory.OTHER
        )
    }
}