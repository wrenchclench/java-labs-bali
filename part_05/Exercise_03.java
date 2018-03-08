package part_05;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02.
 *
 * In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void.
 *
 * Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 *
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */


// Class 1 with main method that creates an instance of Class 2.
// Call the 3 methods from class 2.

class Demo {
    public static void main(String[] args) {

        BugAttributes bug1 = new BugAttributes();
        BugAttributes bug2 = new BugAttributes();
        BugAttributes bug3 = new BugAttributes();

        int x = bug1.numAttributes(5);
        System.out.println(bug1.toString());

        int y = bug2.numAttributes(6, 6);
        System.out.println(bug2.toString());

        int z = bug3.numAttributes(2, 2,1000);
        System.out.println(bug3.toString());


    }
}

// Class 2 contains a method that is overloaded 3x. Each method should have a return type that's not void.

class BugAttributes {

    int legs;
    int eyes;
    int eggs;

    public int numAttributes(int legs){
        System.out.println(" this bug has some legs");
        this.legs = legs;
        return legs;
    }

    public int numAttributes(int legs, int eyes){
        System.out.println("this bug has some legs and eyes");
        this.legs = legs;
        this.eyes = eyes;
        return eyes;
    }

    public int numAttributes(int legs, int eyes, int eggs){
        System.out.println("this bug has some legs, eyes and eggs");
        this.legs = legs;
        this.eyes = eyes;
        this.eggs = eggs;
        return eggs;
    }

    @Override
    public String toString() {
        return "BugAttributes{" +
                "legs=" + legs +
                ", eyes=" + eyes +
                ", eggs=" + eggs +
                '}';
    }
}

