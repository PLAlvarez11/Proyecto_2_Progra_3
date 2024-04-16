| Nombre  | Carne |
| -------- | -------- |
| Pedro Luis Alvarez     | 7690-22-5839     |

# Manual de Usuario 
Bienvenido al manual de usuario para el Gestor de Parqueos!

### Opciones
[![Menu.png](https://i.postimg.cc/j5YHQYRy/Menu.png)](https://postimg.cc/B8NP4yLv)

1. Insertar Parqueo
 
    Le a pedir que ingrese el número del Parqueo el cual desea ocupar (este debe ser entre el 1 al 100).

    Le va a pedir que ingrese la placa de vehículo, color, línea, modelo y propietario.
    Cuando termine le mostrará el vehículo ingresado 
    
    [![Captura-de-pantalla-2024-04-15-205728.png](https://i.postimg.cc/SR9xpr9B/Captura-de-pantalla-2024-04-15-205728.png)](https://postimg.cc/ctsSRfXh)
   
   
2. Buscar Parqueo
 
    Le a pedir que ingrese el número del Parqueo el cual desea buscar (este debe ser entre el 1 al 100).

    Le mostrará el parqueo encontrado
    
    [![Captura-de-pantalla-2024-04-15-210438.png](https://i.postimg.cc/Nf4w2SQN/Captura-de-pantalla-2024-04-15-210438.png)](https://postimg.cc/N55nWN9T)
    
    
3. Eliminar Parqueo
 
    Le a pedir que ingrese el número del Parqueo el cual desea eliminar (este debe ser entre el 1 al 100).

    Le mostrará el parqueo recientemente eliminado
    
    [![Captura-de-pantalla-2024-04-15-211533.png](https://i.postimg.cc/QMggjQQW/Captura-de-pantalla-2024-04-15-211533.png)](https://postimg.cc/NyM24rPg)
    
    
4. Ver todos los parqueos
 
    Esta opción muestra todos los parqueos disponibles y ocupados.
    
    [![Captura-de-pantalla-2024-04-15-211027.png](https://i.postimg.cc/DZH1gxFH/Captura-de-pantalla-2024-04-15-211027.png)](https://postimg.cc/7G1CPM5n)
 
 
5. Salir
 
    Sale de la aplicación.
    
    [![Captura-de-pantalla-2024-04-15-222412.png](https://i.postimg.cc/X78kMcgG/Captura-de-pantalla-2024-04-15-222412.png)](https://postimg.cc/GH4yGDVd)
    


---

# Manual de Técnico 
Bienvenido al manual técnico para el Gestor de Parqueos!

1. Introducción

Este manual técnico describe el código Java para la implementación de una matriz ortogonal para administrar información de parqueos. La matriz ortogonal utiliza matrices los datos de los parqueos, lo que permite una gestión eficiente de la memoria y un acceso rápido a los datos por línea y placa.

2. Estructura del código

El código se divide en dos clases principales:

Nodo: Representa un nodo individual en la matriz. Cada posicion contiene información sobre un vehículo, como placa, color, línea, modelo y propietario.
MatrizOrtogonal: Gestiona la matriz ortogonal en sí, compuesta por una matriz de punteros a nodos. Cada puntero de la matriz apunta al primer nodo de la columna correspondiente a la línea del vehículo.

3. Funcionalidades del código

El código proporciona las siguientes funcionalidades:

*Inserción de datos:* Permite insertar nuevos nodos en la matriz ortogonal, asignando cada nodo a la columna correspondiente a la línea del vehículo.
*Búsqueda de nodos:* Permite buscar un nodo específico en la matriz ortogonal por su placa y línea.
*Eliminación de nodos: *Permite eliminar un nodo específico de la matriz ortogonal por su placa y línea.
4. Descripción detallada de las funciones

4.1 Insertar nodo

La función insertarNodo recibe como parámetros la información del vehículo (placa, color, línea, modelo y propietario) y la inserta en la matriz ortogonal. La función realiza lo siguiente:

Obtiene la columna correspondiente a la línea del vehículo utilizando la función obtenerColumna.
Recorre la lista de la columna correspondiente hasta encontrar el nodo con la misma placa.
Si el nodo no existe, crea un nuevo nodo con la información del vehículo y lo inserta en la lista.
Si el nodo existe, actualiza la información del nodo existente con la nueva información proporcionada.
4.2 Buscar nodo

La función buscarNodo recibe como parámetros la placa y la línea del vehículo y busca el nodo correspondiente en la matriz ortogonal. La función realiza lo siguiente:

Obtiene la columna correspondiente a la línea del vehículo utilizando la función obtenerColumna.
Recorre la lista de la columna correspondiente hasta encontrar el nodo con la misma placa.
Si el nodo se encuentra, devuelve el nodo.
Si el nodo no se encuentra, devuelve null.
4.3 Eliminar nodo

La función eliminarNodo recibe como parámetros la placa y la línea del vehículo y elimina el nodo correspondiente de la matriz ortogonal. La función realiza lo siguiente:

Obtiene la columna correspondiente a la línea del vehículo utilizando la función obtenerColumna.
Recorre la lista de la columna correspondiente hasta encontrar el nodo con la misma placa.
Si el nodo se encuentra, lo elimina de la lista.
Si el nodo no se encuentra, no se realiza ninguna acción.

5. Consideraciones adicionales

La implementación de la función obtenerColumna depende del esquema de asignación de columnas a líneas que se utilice en la aplicación.
El código no incluye validaciones de entrada de datos. Se recomienda implementar validaciones para garantizar la integridad de los datos.
El código puede optimizarse aún más utilizando técnicas como balanceo de carga y estrategias de búsqueda más eficientes.
