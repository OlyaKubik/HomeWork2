package HomeWork1;

public class main3 {
    public static void main(String[] args) {
        HW3 tree1 = new HW3();

        System.out.println(tree1.height);
        System.out.println(tree1.colour);
        System.out.println(tree1.type);
        System.out.println(tree1.coutOfsticks);

        HW3 tree2 = new HW3("Ель",100);
        System.out.println(tree2.height);
        System.out.println(tree2.colour);
        System.out.println(tree2.type);
        System.out.println(tree2.coutOfsticks);

        HW3 tree3 = new HW3(5,100,"Фиолетовый");
        System.out.println(tree3.height);
        System.out.println(tree3.colour);
        System.out.println(tree3.type);
        System.out.println(tree3.coutOfsticks);

        HW3 tree4 = new HW3("Дуб");
        System.out.println(tree4.height);
        System.out.println(tree4.colour);
        System.out.println(tree4.type);
        System.out.println(tree4.coutOfsticks);





    }
}
