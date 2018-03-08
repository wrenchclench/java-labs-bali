package part_05;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01.
 *
 * Within method_01 you ust manipulate several private instance variables within
 * Class_02.
 *
 * Then, from within method_01, pass the instance of Class_02 to a new method, method_02.
 *
 * Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 *
 */


class Class1 {
    public static void main(String[] args) {

        Class1 obj1 = new Class1();
        Class2 obj2 = new Class2();

        obj1.method2(obj2);

        System.out.println("in main***");
        System.out.println(obj2.toString());
    }

    public void method2(Class2 obj){

        obj.setVal1(1);
        obj.setVal2(true);
        obj.setVal3(45.9);
        method3(obj);

    }

    public void method3(Class2 unicorn){
        System.out.println(unicorn.toString());

        unicorn.setVal1(55);
        unicorn.setVal2(false);
        unicorn.setVal3(99.99);

        System.out.println(unicorn.toString());
    }
}

class Class2{

    private int val1;
    private boolean val2;
    private double val3;

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public boolean isVal2() {
        return val2;
    }

    public void setVal2(boolean val2) {
        this.val2 = val2;
    }

    public double getVal3() {
        return val3;
    }

    public void setVal3(double val3) {
        this.val3 = val3;
    }

    @Override
    public String toString() {
        return "Class2{" +
                "val1=" + val1 +
                ", val2=" + val2 +
                ", val3=" + val3 +
                '}';
    }
}






