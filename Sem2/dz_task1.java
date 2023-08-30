package Sem2;
/* 2023/08/30
Задача 1:
Напишите программу, которая запрашивает у пользователя число и проверяет,
является ли оно положительным. Если число отрицательное или равно нулю,
программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".

В противном случае, программа должна выводить сообщение "Число корректно".
*/

import java.util.Scanner;

public class dz_task1{
    public static void main(String[] args){
        int number = 0;
        try{
            number = scanNumber();
            System.out.println("Число корректно: " + number);
        } catch (InvalidNumberException e){
            System.out.println(e.getMessage());
        }
    }

    public static int scanNumber() throws InvalidNumberException{
        try (Scanner scan = new Scanner(System.in)) {
            int number = scan.nextInt();
            if (number  > 0){
                throw new InvalidNumberException("number is > 0", number);
            }
            return number;
        }
    }
}

class InvalidNumberException extends Exception{
        int number;
        public InvalidNumberException(String msg, int number){
            super("Наше исключение: " + msg + ". number is: " + number);
            this.number = number;
        }


        public int getNumber(){
            return number;
        }
    }