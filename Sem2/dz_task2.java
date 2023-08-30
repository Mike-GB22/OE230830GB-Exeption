/* 2023/08/30
Задача 2:
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException
с сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить
результат деления.

Обратите внимание, что в обоих задачах используются собственные исключения,
которые наследуются от класса Exception. Это позволяет нам определить специфическую причину
ошибки и передать информацию об ошибке для последующей обработки.
*/

package Sem2;
import java.util.Scanner;

public class dz_task2 {
    public static void main(String[] args){
        int number1 = scanNumber("Введите делимое");
        int number2 = scanNumber("Введите делитель");

        try{
            System.out.printf("Результат деления %d на %d будет: %f", number1, number2, divide(number1, number2));
        } catch (DivisionByZeroException e) {
            System.out.println("Случилась аказия!!!");
            System.out.println(e.getMessage());
        }
    }

    public static double divide(int divider, int devison) throws DivisionByZeroException{
        if(devison == 0) throw new DivisionByZeroException("На нуль делить незя!");
        return (double) divider / devison;
    }

    public static int scanNumber(String prompt){
        System.out.print(prompt + ": ");
        Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            return number;
    }
}

class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String msg){
        super("Наше исключение: " + msg);
    }
}

