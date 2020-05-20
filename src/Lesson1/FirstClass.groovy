package Lesson1

class FirstClass {

    // переменные
    private  int intNumber
    private double doubleNumber
    private short shortNumber
    private String string

    // конструктор
    FirstClass(int tempIntNumber, double tempDoubleNumber, short tempShortNumber, String tempString) {
        intNumber = tempIntNumber
        doubleNumber = tempDoubleNumber
        shortNumber = tempShortNumber
        string = tempString
    }

    static void printAll(FirstClass temp) {
        print("integer: ")
        println temp.getProperty("intNumber")
        print("double: ")
        println temp.getProperty("doubleNumber")
        print("short: ")
        println temp.getProperty("shortNumber")
        print("string: ")
        println temp.getProperty("string")
    }
}
