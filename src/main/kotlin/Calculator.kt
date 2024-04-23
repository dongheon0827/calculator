package org.example

class Calculator {
    fun operation(num1: Double, num2: Double, operator: AbstractOperator): Double = operator.calc(num1, num2)
}