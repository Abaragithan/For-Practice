package Practice.java;

public class Main {
    public static void main(String[] args) {
        Lambda l1 = (num1,num2) -> {System.out.println(num1*num2);};

        l1.method(2,5);
        System.out.println(l1.method2(2,4));
       // l1.method3(2,4);
    }
}
