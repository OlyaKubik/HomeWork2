package HomeWork1;

public class HW2 {
    //2) Написать перегруженный метод, который может:
//  - не принимать никаких значений, тогда он будет выводить на консоль сообщение типа:
//    "Я пустой".
//  - Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
//  - Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения
//    через пробел.
//  - Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов
//    массива.
//  - Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
//    "Ваше сообщение - "%%%%%%%%", ваше число -  $",
//    где "%%%%%%%%" и $ ваши введенные строка и число соответственно.

    public void peregruz (){
        System.out.println("Я пустой");
    }
    public void peregruz (String string){
        System.out.println(string);
    }
    public void peregruz (String [] string){
        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i] + " " );
        }
    }
    public void peregruz (int [] num1){
        int res = 0;
        for (int i = 0; i < num1.length; i++) {
            res = res + num1[i];
        }System.out.println(res);
    }
    public void peregruz (String string, int num){
        System.out.println("Ваше сообщение - " + string + " ваше число - " + num);
    }
}
