package HomeWork1;

public class HW1 {

    // 1) Написать метод, принимающий в качестве параметра массив целых чисел.
    // И выводит на экран все четные числа списком, а также нечетные числа списком

    public void metod1 (int [] array){

        String res = "";
        String res2 = "";

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2==0){
               res = res + array[i]+",";

            }
           else {
               res2 = res2 + array[i] + ",";
            }

        }System.out.println("Четные " + res + "\nНечетные " + res2);
    }


}

