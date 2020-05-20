package Lesson1

class MainClass {

    public static void main(String[] args) {

        // создание экземпляра класса
        FirstClass firstClass = new FirstClass(10, 10.5, (short) 30, "string")

        // вывод на экран
        println("*******")
        firstClass.printAll(firstClass);
        println()

        // установка значений переменных
        firstClass.setProperty("intNumber", 5)
        firstClass.setProperty("doubleNumber", 9.9)
        firstClass.setProperty("shortNumber", (short) 20)
        firstClass.setProperty("string", "newString")

        // вывод новых значений
        println("**new**")
        firstClass.printAll(firstClass)
        println()
    }
}
