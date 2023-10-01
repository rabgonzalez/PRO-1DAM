<div align="justify">

# Ejercicios
- [Ejercicio 2](#ejercicio2)
- [Ejercicio 3](#ejercicio3)
- [Ejercicio 4](#ejercicio4)
- [Ejercicio 5](#ejercicio5)
- [Ejercicio 6](#ejercicio6)
- [Ejercicio 7](#ejercicio7)
- [Ejercicio 8](#ejercicio8)
- [Ejercicio 9](#ejercicio9)

<!-- Ejercicio 2 -->
## Ejercicio 2 <a name="ejercicio2"></a>
## Descripción del ejercicio
Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente. El algoritmo debe imprimir cual es el mayor y cual es el menor. Recuerde constatar que los tres valores introducidos por el teclado sean valores distintos. Presente un mensaje de alerta en caso de que se detecte la introducción de valores iguales.

## Diagrama de flujos
<div align="center">
<img src="images/Diagrama-flujo.png"/>
</div>

## Pseudocódigo
Pasos=
- Inicio
- Inicializar variables: __A, B y C__
- Solicitar la introducción de tres valores distintos
- Leer los tres valores
- Mientras __A = B, A = C y B = C__ Entonces vuelve porque los valores deben ser distintos
- Si __A > B y A > C__ Entonces buscar el número menor
- Si __B > C__ Escribir ___A, "Es el mayor y," C, "Es el menor"___
- Sino Escribir ___A, "Es el mayor y," B, "Es el menor"___
- Fin_Si
- Tambien_Si __B > A y B > C__ Entonces buscar el número menor
- Si __A > C__ Escribir ___B, "Es el mayor y," C, "Es el menor"___
- Sino Escribir ___B, "Es el meyor y," A, "Es el menor"___
- Fin_Si
- Sino Entonces buscar el número menor
- Si __A > B__ Escribir ___C, "Es el mayor y," B, "Es el menor"___
- Sino Escribir ___C, "Es el mayor y," A, "Es el menor"___
- Fin_Si
- Fin_Si
- Fin

## Referencias
- [Ejercicio 2](src/main/java/Ejercicio2.java)

<!-- Ejercicio 3 -->
## Ejercicio 3 <a name="ejercicio3"></a>
## Descripción del ejercicio
Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10. Utilia un buble __for__ y un bucle __while__.

## Diagrama de flujos
<div align="center">
<img src="images/Diagrama-flujo.png"/>
</div>

## Pseudocódigo
Pasos=
- Inicio
- Declarar variables: __sumatorio = 0, i = 0__
- Asignamos contador: __i <= 10, i++__
- Asignamos sumatorio: __sumatorio += i__
- Cuando __i = 10__ Escribir ___sumatorio___
- Fin
- Inicio
- Declarar variables: __sumatorio = 0, numero= 0__
- Asignamos contador: __numero <= 10__
- Asignamos sumatorio: __sumatorio += numero__
- Asignamos acumulador: __sumatorio++__
- Cuando __numero = 10__ Escribir ___sumatorio___
- Fin

## Referencias
- [Ejercicio 3](src/main/java/Ejercicio3.java)

<!-- Ejercicio 4 -->
## Ejercicio 4 <a name="ejercicio4"></a>
## Descripción del ejercicio
Desarrolle un algoritmo que permita leer un valor cualquiera N y escriba si dicho número es par o impar.

## Diagrama de flujos
<div align="center">
<img src="images/Diagrama-flujo.png"/>
</div>

## Pseudocódigo
Pasos=
- Inicio
- Inicializar variables: __numero__
- Leer el valor
- Calcular el resto del numero dividido entre dos
- Si __numero % 2 = 0__ Escribir ___numero, "Es par"___
- Sino Escribir ___numero, "Es impar"___
- Fin_Si
- Fin

## Referencias
- [Ejercicio 4](src/main/java/Ejercicio4.java)

<!-- Ejercicio 5 -->
## Ejercicio 5 <a name="ejercicio5"></a>
## Descripción del ejercicio
Desarrolle un algoritmo que permita leer dos números y ordenarlos de menor a mayor, si es el caso.

## Diagrama de flujos
<div align="center">
<img src="images/Diagrama-flujo.png"/>
</div>

## Pseudocódigo
Pasos=
- Inicio
- Inicializar variables: __numero1, numero2__
- Leer los dos valores
- Si __numero1 > numero2__ Escribir ___numero1, "Es mayor que," numero2"___
- Tambien_Si __numero2 > numero 1__ Escribir ___numero2, "Es mayor que," numero1"___
- Sino Escribir ___"ambos valores son iguales"___
- Fin_Si
- Fin

## Referencias
- [Ejercicio 5](src/main/java/Ejercicio5.java)

<!-- Ejercicio 6 -->
## Ejercicio 6 <a name="ejercicio6"></a>
## Descripción del ejercicio
Desarrolle un algoritmo que permita leer un valor entero positivo N y determinar si es primo o no.

## Diagrama de flujos
<div align="center">
<img src="images/Diagrama-flujo.png"/>
</div>

## Pseudocódigo
Pasos=
- Inicio
- Inicializar variables: __divisores = 0, n= 1, numero__
- Leer el valor __numero__
- Asignamos contador: __n <= numero, n++__
- Si __numero % n = 0__ Asignar acumulador: __divisores++__
- Fin_Si
- Si __divisores > 2__ Escribir ___numero, "No es primo"___
- Sino Escribir ___numero, "Es primo"___
- Fin_Si
- Fin

## Referencias
- [Ejercicio 6](src/main/java/Ejercicio6.java)

<!-- Ejercicio 7 -->
## Ejercicio 7 <a name="ejercicio7"></a>
## Descripción del ejercicio
Realice un algoritmo que a partir de proporcionarle la velocidad de un automóvil, expresada en kilómetros por hora, proporcione la velocidad en metros por segundo.

## Diagrama de flujos
<div align="center">
<img src="images/Diagrama-flujo.png"/>
</div>

## Pseudocódigo
Pasos=
- Inicio
- Inicializar variables con decimal: __numero, conversion__
- Leer el valor __numero__
- Calcular __conversion= numero / 3.6__
- Escribir ___conversion, "m/s"___
- Fin

## Referencias
- [Ejercicio 7](src/main/java/Ejercicio7.java)

<!-- Ejercicio 8 -->
## Ejercicio 8 <a name="ejercicio8"></a>
## Descripción del ejercicio
Desarrolle un algoritmo que permita calcular Promedio de Notas; finaliza cuando N = 0.

## Diagrama de flujos
<div align="center">
<img src="images/Diagrama-flujo.png"/>
</div>

## Pseudocódigo
Pasos=
- Inicio
- Inicializar variables: __A__
- Leer el valor
- Fin

## Referencias
- [Ejercicio 8](src/main/java/Ejercicio8.java)

<!-- Ejercicio 9 -->
## Ejercicio 9 <a name="ejercicio9"></a>
## Descripción del ejercicio
Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.

## Diagrama de flujos
<div align="center">
<img src="images/Diagrama-flujo.png"/>
</div>

## Pseudocódigo
Pasos=
- Inicio
- Declarar variable: __numero = 0__
- Mientras __numero != 100__ Asignar acumulador: __numero++__ y Escribir ___numero___
- Fin

## Referencias
- [Ejercicio 9](src/main/java/Ejercicio9.java)

</div>