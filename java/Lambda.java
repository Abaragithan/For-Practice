package Practice.java;

@FunctionalInterface
public interface Lambda {

    public void method(int num1, int num2);

    public default int method2(int num1, int num2){
        return num1+num2;
    }

    public static void method3(int num1, int num2){
        System.out.println(num1-num2);
    }


}
