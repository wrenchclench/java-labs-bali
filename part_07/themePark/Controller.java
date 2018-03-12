package part_07.themePark;

public class Controller {

    public static void main(String[] args) {
        ThemePark myThemePark = new ThemePark("John's Crap Park", false, 5000, 100);

        System.out.println(myThemePark.reduceEmployees());
        System.out.println(myThemePark.halfRpm());
        System.out.println(myThemePark.decreaseFerrisWheelCapacity());
    }
}
