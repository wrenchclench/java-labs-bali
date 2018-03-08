package part_05;

/**
 * Write two classes.
 *
 * Class_01 should have the main().
 *
 * Class_02 should have various instance variables. At least one of must be static.
 *
 * Within class_01 create at least 3 instances of class_02.
 *
 * Set the instance variables of class_02.
 *
 * Then, just once, in one place, set the static instance variable in class_02.
 *
 * Afterwards, print out the value of each instance variable and the static variable for each class.
 */


class Shirt {

    int pockets;
    int buttons;
    static boolean collar;

    public Shirt(int pockets, int buttons) {
        this.pockets = pockets;
        this.buttons = buttons;
    }

    public int getPockets() {
        return pockets;
    }

    public void setPockets(int pockets) {
        this.pockets = pockets;
    }

    public int getButtons() {
        return buttons;
    }

    public void setButtons(int buttons) {
        this.buttons = buttons;
    }

    public static boolean isCollar() {
        return collar;
    }

    public static void setCollar(boolean collar) {
        Shirt.collar = collar;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "pockets=" + pockets +
                ", buttons=" + buttons +
                '}';
    }
}

class ShirtDemo {
    public static void main(String[] args) {

        Shirt shirt1 = new Shirt(2, 3);
        Shirt shirt2 = new Shirt(4,8);
        Shirt shirt3 = new Shirt(2,1);

        Shirt.collar = true;

        System.out.println("Shirt 1 has  " + shirt1.toString());
        System.out.println("Shirt 2 has  " + shirt2.toString());
        System.out.println("Shirt 3 has  " + shirt3.toString());
    }
}

