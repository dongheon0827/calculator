package org.example

fun main() {
    print("첫번째 숫자를 입력하세요 : ")
    val num1: Double = readln().toDouble()
    println("사용 가능한 연산자 | +, -, *, /, %(나머지)")
    print("연산자를 입력하세요 : ")
    val operator = readln()
    print("두번째 숫자를 입력하세요 : ")
    val num2: Double = readln().toDouble()

    val calcOperator = when (operator) {
        "+" -> PlusOperator()
        "-" -> MinusOperator()
        "*" -> MultiOperator()
        "/" -> DivideOperator()
        "%" -> RemainOperator()
        else -> {
            println("잘못된 연산자입니다")
            return
        }
    }

    val calc = Calculator()
    val result = calc.operation(calcOperator, num1, num2)
    println("$num1 $operator $num2 의 값은 $result 입니다")
}