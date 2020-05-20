package Lesson2

class MainSecondClass {

    public static void main(String[] args) {

        // передаём в качестве параметра null - ошибка
        /*try {
            println SecondClass.returnInt(null)
        } catch (NullPointerException e1) {
            e1.printStackTrace()
        }*/

        // передаём в качестве параметра null - всё работает
        try {
            print("Integer: ")
            println SecondClass.returnInteger(null)
        } catch (NullPointerException e2) {
            e2.printStackTrace()
        }

        // создаём два экземпляра класса BigDecimal
        BigDecimal bigDecimal = new BigDecimal(5)
        BigDecimal bigDecimal1 = new BigDecimal(5)

        // сравниваем экземпляры
        print("Сравнение экземпляров: ")
        println bigDecimal == bigDecimal1
        // одинаковый результат
        // println bigDecimal.equals(bigDecimal1)

        // сравниваем add и +
        BigDecimal bigDecimal2 = bigDecimal1.add(bigDecimal)
        BigDecimal bigDecimal3 = bigDecimal1 + bigDecimal
        print("Сравнение add и +: ")
        println bigDecimal2 == bigDecimal3

        // переменная без указания типа
        def num = 10;
        print("Тип переменной def: ")
        println num.getClass().getName()
        num = "f"
        print("Тип переменной def: ")
        println num.getClass().getName()

        // переменная date
        Date dateOne = new Date(115, 1, 28)
        Date dateTwo = new Date(115, 0, 31)
        print ("dateOne - dateTwo: ")
        println dateOne - dateTwo
        dateOne.month -= 1
        dateOne.date += 1
        dateOne.month += 1
        print("dateOne: ")
        println(dateOne)

    }
}
