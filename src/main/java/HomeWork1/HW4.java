package HomeWork1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW4 {
    //4) Создать класс калькулятор.
    //   В нем создать методы:
    //   summ, minus, multiply, division.
    //   Сложение, вычитание, умножение и деление соответственно.
    //   Каждый метод принимает в качестве параметров два значения типа double.
    //   И выводит в консоль результат действия.
    //
    //   Также в классе есть метод старт. Который выводит сообщение в консоль, что
    //   калькулятор запущен. И предлагает ввести действие в вашей консоли.
    //
    //   Калькулятор должен принимать только следующие типы действий:
    //   2+4;    - пример синтаксиса сложения;
    //   5-6;    - пример синтаксиса вычитания;
    //   25*3;   - пример синтаксиса умножения;
    //   34/3;   - пример синтаксиса деления;
    //   После ввода действия на консоль выводится ответ этого действия.
    //   И после снова выводится сообщение о предложении ввести действие.
    //
    //   в случае ввода другого синтаксисана консоль возвращается сообщение:
    //   "Введите корректное действие".
    //   И после снова выводится сообщение о предложении ввести действие.
    //
    //   Программа закрывается после ввода команды Stop.
    //   Перед закрытием на консоль должно выводится сообщение:
    //   "Калькулятор закрыт".

    public void sum (double a, double b){
        System.out.println("Сумма" + (a + b));
    }
    public void subtraction (double a, double b){
        System.out.println("Сумма" + (a - b));
    }
    public void multiplication (double a, double b){
        System.out.println("Сумма" + (a * b));
    }
    public void division (double a, double b){
        System.out.println("Сумма" + (a / b));
    }
    public void start(){
        System.out.println("Калькулятор запущен");
        Scanner scan = new Scanner(System.in);
        String action;

        System.out.println("Введите Ваше действие");
        action = scan.nextLine();
        while (!action.equalsIgnoreCase("Stop")){
            if (action.contains("+")){
                double num1 = Double.parseDouble(action.split("\\+")[0]);
                double num2 = Double.parseDouble(action.split("\\+")[1]);
                sum(num1,num2);
            }
            else if (action.contains("-")) {
                double num1 = Double.parseDouble(action.split("\\-")[0]);
                double num2 = Double.parseDouble(action.split("\\-")[1]);
                subtraction(num1,num2);
            }
            else if (action.contains("*")) {
                double num1 = Double.parseDouble(action.split("\\*")[0]);
                double num2 = Double.parseDouble(action.split("\\*")[1]);
                multiplication(num1,num2);
            }
            else if (action.contains("/")) {
                double num1 = Double.parseDouble(action.split("\\/")[0]);
                double num2 = Double.parseDouble(action.split("\\/")[1]);
                division(num1,num2);
            }
            else {
                System.out.println("Введено некорретное действие");
            }
            System.out.println("Введите Ваше действие");
            action = scan.nextLine();

        }
        System.out.println("Калькулятор закрыт");
    }
}
