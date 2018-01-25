#!/bin/bash

# Compilamos Calculo.java
javac mx/calculo/Calculo.java

# Compilamos CalculoTest.java
javac -cp lib/*:. mx/calculoTest/CalculoTest.java

# Corremos las pruebas de unidad
java -cp lib/*:. org.junit.platform.console.ConsoleLauncher -p mx
