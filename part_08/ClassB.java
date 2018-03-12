package part_08;

public class ClassB {

    public static int someMeth(int x, int y){
        try {
            return x/y;

        }
        catch(ArithmeticException exc){

            System.out.println("Thrown");
            throw new ArithmeticException();
        }


    }
}
