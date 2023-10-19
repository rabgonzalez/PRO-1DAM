<div align="justify">

## Ejercicio 1
## Descripción del ejercicio
Escribe un programa en Java que imprima el patrón siguiente:
1 

2 3 

4 5 6 

7 8 9 10 

## Diagrama de flujos
<div align="center">
<img src="images/ej1.png"/>
</div>

## Pseudocódigo
Pasos=
- Inicio
- Declarar variables: __numero = 1, fila = 1, columna = 1__
- Añadir incremento __columa++__
- Añadir incremento __fila++__
- Imprimir __numero + " "__
- Añadir incremento __numero++__
- Si __fila <= columna__ volver a paso 4
- Fin_Si
- hacer una nueva línea
- Si __columna <= 4__ volver a paso 3
- Fin_si
- Fin


## Referencias
- [Ejercicio 1](src/main/java/ej1.java)

## Ejercicio 2
## Descripción del ejercicio
Escribe un programa en Java que encuentre el máximo común divisor (MCD) de dos números. Se debe solicitar los números por teclado.


## Diagrama de flujos
<div align="center">
<img src="images/ej2.png"/>
</div>

## Pseudocódigo
Pasos=
- Inicio
- Pedir variables: __valorA, valorB__
- Inicializar variable __valorMayor__
- Si __valorA > valorB__ declarar __valorMayor = valorA__
- Sino declarar __valorMayor = valorB__
- Fin_Si
- Declarar variable: __divisor = valorMayor/2__
- Añadir decremento __divisor--__
- Si __valorA % divisor = 0__ o __valorB % divisor = 0__ Escribir: ___divisor+ "Es el divisor más grande"___
- Sino Si __Divisor > 0__ volver a paso 8
- Fin_Si
- Fin_Si
- Fin

## Referencias
- [Ejercicio 2](src/main/java/ej2.java)

## Ejercicio 3
## Descripción del ejercicio
Escribe un programa en Java que encuentre el número de Fibonacci en la posición n.  Se debe solicitar el número por teclado.

## Diagrama de flujos
<div align="center">
<img src="images/ej3.png"/>
</div>

## Pseudocódigo
Pasos=
- Inicio
- Declarar variables: __valorAnterior = 0, fibonacci = 1, n = 1__
- Pedir variable: __numero__
- Asignar incremento __n++__
- Calcular __fibonacci += valorAnterior__
- Calcular __valorAnterior = fibonacci - valorAnterior__
- Si __n < numero__ volver a paso 4
- Sino Escribir ___fibonacci___
- Fin_Si
- Fin

## Referencias
- [Ejercicio 3](src/main/java/ej3.java)


## Ejercicio 4
## Descripción del ejercicio
Escribe un programa en Java que verifique si un número es palíndromo. Se debe solicitar el número por teclado.

## Diagrama de flujos
<div align="center">
<img src="images/ej4.png"/>
</div>

## Pseudocódigo
Pasos=
- Inicio
- Declarar variables: __resto, numeroInvertido = 0__
- Pedir variable __numero__
- Calcular __resto = numero % 10__
- Calcular __numeroInvertido = numeroInvertido * 10 + resto__
- Calcular __numero = numero/10__
- Si __numero > 0__ volver paso 4
- Sino Escribir: ___numeroInvertido___
- Fin_Si
- Fin


## Referencias
- [Ejercicio 4](src/main/java/ej4.java)


## Ejercicio 5
## Descripción del ejercicio
Escribe un programa en Java que imprima los primeros n términos de la secuencia de Fibonacci. Se debe solicitar el número n por teclado.

## Diagrama de flujos
<div align="center">
<img src="images/ej5.png"/>
</div>

## Pseudocódigo
Pasos=
- Inicio
- Declarar variables: __valorAnterior = 0, fibonacci = 1, n = 0__
- Pedir varibale: __posicion__
- Añadir incremento __n++__
- Escribir ___fibonacci___
- Calcular __fibonacci += valorAnterior__
- Calcular __valorAnterior = fibonacci - valorAnterior__
- Si __n < posicion__ volver paso 4
- Fin_Si
- Fin

## Referencias
- [Ejercicio 5](src/main/java/ej5.java)

## Ejercicio 6
## Descripción del ejercicio
Escribe un programa en Java que encuentre todos los números Armstrong entre 1 y 1000.

## Diagrama de flujos
<div align="center">
<img src="images/ej6.png"/>
</div>

## Pseudocódigo
Pasos=
- Inicio
- Declarar variables: __suma = 0, i = 1, n = 1__

## Referencias
- [Ejercicio 6](src/main/java/ej6.java)

## Ejercicio 7
## Descripción del ejercicio
Imprimir el nombre del día de la semana correspondiente a un número ingresado por el usuario utilizando una estructura switch.


## Diagrama de flujos
<div align="center">
<img src="images/ej7.png"/>
</div>

## Pseudocódigo
Pasos=
- Inicio
- Pedir variable: __dia__
- Según dia hacer
- caso 1: Escribir ___Es lunes___
- caso 2: Escribir ___Es martes___
- caso 3: Escribir ___Es miércoles___
- caso 4: Escribir ___Es jueves___
- caso 5: Escribir ___Es viernes___
- caso 6: Escribir ___Es sábado___
- caso 7: Escribir ___Es domingo___
- FinSegún
- Fin

## Referencias
- [Ejercicio 7](src/main/java/ej7.java)

## Ejercicio 8
## Descripción del ejercicio
Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for. Solicita el límite por teclado

## Diagrama de flujos
<div align="center">
<img src="images/ej8.png"/>
</div>

## Pseudocódigo
Pasos=
- Inicio
- Declarar variables: __suma = 0, numero = 1, divisor = 1__
- Pedir variable: __n__
- Añadir incremento __numero++__
- Añadir incremento __divisor++__
- Si __numero % divisor = 0__ Calcular __suma += divisor__
- Fin_Si
- Si __divisor <= numero/2__ volver a paso 5
- Fin_Si
- Si __numero = suma__ Escribir ___suma___ y Calcular __suma = 0__
- Fin_Si
- Si __numero <= n__ volver a paso 4
- Fin_Si
- Fin


## Referencias
- [Ejercicio 8](src/main/java/ej8.java)

## Ejercicio 9
## Descripción del ejercicio
Imprimir la tabla de multiplicar de un número ingresado por el usuario utilizando un bucle for. Solicita el valor de la tabla por teclado.

## Diagrama de flujos
<div align="center">
<img src="images/ej9.png"/>
</div>

## Pseudocódigo
Pasos=
- Inicio
- Declarar variables: __numero, multiplo = numero, n = 1__
- Añadir incremento __n++__
- Calcular __multiplo = numero * n__
- Escribir ___multiplo___
- Si __n <= 10__ volver a paso 3
- Fin_Si
- Fin

## Referencias
- [Ejercicio 9](src/main/java/ej9.java)

## Ejercicio 10
## Descripción del ejercicio
Calcular la suma de todos los números pares entre 1 y un número ingresado por el usuario utilizando un bucle do-while.

## Diagrama de flujos
<div align="center">
<img src="images/ej10.png"/>
</div>

## Pseudocódigo
Pasos=
- Inicio
- Declarar variables: __suma = 0, s = 2, n__
- Añadir incremento __s++__
- Si __s % 2 = 0__ Calcular __suma += s__
- Fin_Si
- Si __s <= n__ volver a paso 3
- Fin_Si
- Escribir: ___suma___
- Fin

## Referencias
- [Ejercicio 10](src/main/java/ej10.java)
</div>