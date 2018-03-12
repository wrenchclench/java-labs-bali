package part_06.Exercise_1;

public class Controller {

    public static void main(String[] args) {

        SaltWater fish1 = new SaltWater(4,28, true);
        Fish fish2 = new Fish (4,36);

        System.out.println("fish 1 has " + fish1.getNumberOfFins() + " fins, " + fish1.getNumberOfTeeth() + " teeth and swims in the pacific? " + fish1.isPacific());
        System.out.println("fish 2 has " + fish2.getNumberOfFins() + " fins and " + fish2.getNumberOfTeeth() + " teeth");
        System.out.println("Since fish1 is Pacific it's num of fins by 4 method is now by 6 and equals " + fish1.timesFour(fish1.getNumberOfFins()));
        System.out.println("Fish 2 is not specified as pacific or not so it's num of fins by 4 method gives " + fish2.timesFour(fish2.getNumberOfFins()));

    }
}
