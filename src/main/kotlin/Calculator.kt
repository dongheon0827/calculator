package org.example

class Calculator
{
    fun operation(operator: AbstractOperator, num1:Double, num2:Double):Double = operator.calc(num1, num2)
}