package part_08;

public class ClassA {
    public static void main(String[] args) {

        try {
            ClassB.someMeth(4, 0);
        }
        catch (ArithmeticException exc){
            System.out.println("can't divide by 0");
        }

    }
}
