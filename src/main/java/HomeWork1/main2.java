package HomeWork1;

public class main2 {
    public static void main(String[]args){

        int [] x = {1,2,3,4,5};

        HW2 per = new HW2();
        per.peregruz();
        per.peregruz("Я метод строка");
        per.peregruz("Я вывожу массив строк");
        per.peregruz(x);
        per.peregruz("У меня есть строка и число ", 5);
    }
}
