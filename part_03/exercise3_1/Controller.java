package part_03.exercise3_1;

public class Controller {

    public static void main(String[] args) {

        Reef firstReef = new Reef(45, 10, true);
        Coral firstCoral = new Coral(true, 5, 3);

        System.out.println(firstCoral.isSoftCoral());
        System.out.println(firstCoral.getOffspring());
        System.out.println(firstCoral.getSize());

        System.out.println(firstReef.getSize());
        System.out.println(firstReef.getDepth());
        System.out.println(firstReef.isAtRisk());

    }

}


