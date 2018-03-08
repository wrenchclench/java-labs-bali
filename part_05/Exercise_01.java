package part_05;

import java.util.ArrayList;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */


// Create Class 2 - needs 3 private variables
// Within Class 2 create Class 3 - needs 3 private variables that are set from Class 2

class Playground{
    private int numSlides;
    private boolean sandbox;
    private int numSwings;
    private Ground play1;

    public Playground(int numSlides, boolean sandbox, int numSwings) {
        this.numSlides = numSlides;
        this.sandbox = sandbox;
        this.numSwings = numSwings;
        play1 = new Ground(10,true,true);

    }

    public int getNumSlides() {
        return numSlides;
    }

    public void setNumSlides(int numSlides) {
        this.numSlides = numSlides;
    }

    public boolean isSandbox() {
        return sandbox;
    }

    public void setSandbox(boolean sandbox) {
        this.sandbox = sandbox;
    }

    public int getNumSwings() {
        return numSwings;
    }

    public void setNumSwings(int numSwings) {
        this.numSwings = numSwings;
    }

    public Ground getPlay1() {
        return play1;
    }

    public void setPlay1(Ground play1) {
        this.play1 = play1;
    }

    @Override
    public String toString() {
        return "Playground{" +
                "numSlides=" + numSlides +
                ", sandbox=" + sandbox +
                ", numSwings=" + numSwings +
                ", ground=" + play1.toString() +
                '}';
    }
}

class Ground {
    private int size;
    private boolean gravel;
    private boolean supervised;

    public Ground(int size, boolean gravel, boolean supervised) {
        this.size = size;
        this.gravel = gravel;
        this.supervised = supervised;
    }

    @Override
    public String toString() {
        return "Ground{" +
                "size=" + size +
                ", gravel=" + gravel +
                ", supervised=" + supervised +
                '}';
    }
}


//Create Class 1
// Main method which creates Class 2

class MakePlayground{
    public static void main(String[] args) {

        Playground play1 = new Playground(3,true,5);
        System.out.println(play1.toString());

        play1.setNumSlides(7);
    }
}