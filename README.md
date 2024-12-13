Nota importante: Si se desea copiar el repositorio, de debera eliminar la palabra FrankoFinal a la carpeta contenedora

This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…#   K o t l i n P r o j e c t F r a n k o F i n a l 
 
# Manual de Usuario - Aplicación de Control de Gastos

Este manual tiene como objetivo explicarte cómo utilizar la aplicación para gestionar tus gastos, detallando las funciones de cada una de las vistas principales: el **Dashboard**, la sección para **Añadir Gasto** y la de **Editar Gasto**. ✅✨✨✨

---

## **Vista Principal: Dashboard**
![GastosUno](https://github.com/user-attachments/assets/e0731dfd-a76a-4929-a6a0-02885553cbdd)


### Descripción:
El **Dashboard** es la vista inicial de la aplicación. Desde aquí puedes consultar tu saldo total y la lista de todos los gastos registrados, categorizados por tipo. 🏠✨✨✨

### Elementos Principales:
1. **Saldo Total**: En la parte superior, se muestra el saldo total disponible, en formato numérico y la moneda configurada. 💰
2. **Lista de Gastos**: Una lista categorizada con el nombre, el monto y una breve descripción de cada gasto. 📋
3. **Botón Flotante (+)**: Ubicado en la esquina inferior derecha, permite acceder a la sección para añadir un nuevo gasto. ➕

### Instrucciones:
- **Añadir un nuevo gasto**:
  - Haz clic en el botón flotante con el símbolo **+**.
  - Serás redirigido a la vista para añadir un nuevo gasto.

- **Editar un gasto existente**:
  - Haz clic en cualquiera de los elementos de la lista de gastos.
  - Serás llevado a la vista de **Editar Gasto**, donde podrás modificar los detalles del gasto seleccionado.

---

## **Vista para Añadir Gasto**
![GastosDos](https://github.com/user-attachments/assets/b84e7ef9-b665-4af7-9fe4-2425c880d060)


### Descripción:
Esta vista te permite registrar un nuevo gasto, especificando la cantidad, la categoría y una descripción opcional. 📝✨✨✨

### Elementos Principales:
1. **Campo de Monto**:
   - Ingresa la cantidad del gasto en formato numérico.
   - La moneda se muestra a un lado para referencia. 💵

2. **Campo de Categoría**:
   - Selecciona una categoría desde el menú desplegable o los iconos disponibles en la parte inferior (por ejemplo, **GROCERIES**, **CAR**, etc.). 🏷️

3. **Campo de Descripción**:
   - Agrega una descripción breve para identificar el gasto (opcional). ✏️

4. **Botón para Guardar**:
   - Al completar los campos, presiona el botón para guardar el nuevo gasto. 💾

### Instrucciones:
1. Presiona el botón flotante **+** desde el **Dashboard**.
2. Completa los campos requeridos:
   - Ingresa el monto del gasto.
   - Selecciona la categoría adecuada.
   - Opcionalmente, agrega una descripción.
3. Presiona el botón de guardar para registrar el gasto.

---

## **Vista para Editar Gasto**
![GastosTres](https://github.com/user-attachments/assets/2acda28c-d6e7-4216-b545-cd3390f2c19d)


### Descripción:
Esta vista te permite modificar los detalles de un gasto previamente registrado. 🛠️✨✨✨

### Elementos Principales:
1. **Campo de Monto**:
   - Muestra el monto actual del gasto. Puedes editarlo según sea necesario. 💵

2. **Campo de Categoría**:
   - Muestra la categoría actual del gasto. Puedes cambiarla seleccionando una nueva. 🏷️

3. **Campo de Descripción**:
   - Permite editar o agregar información adicional sobre el gasto. ✏️

4. **Botón para Actualizar**:
   - Guarda los cambios realizados en el gasto. 💾

### Instrucciones:
1. Desde el **Dashboard**, selecciona un gasto en la lista.
2. Modifica los campos según sea necesario:
   - Cambia el monto.
   - Selecciona una nueva categoría.
   - Edita o agrega una descripción.
3. Presiona el botón de actualizar para guardar los cambios.

---

Con estas instrucciones, podrás utilizar la aplicación de manera eficiente para registrar y gestionar tus gastos. Si tienes dudas adicionales, consulta este manual para aclararlas. ✨✨✨


 
