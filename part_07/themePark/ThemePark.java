package part_07.themePark;

public class ThemePark implements CrappyTime {

    // ThemePark Variables
    private String name;
    private boolean hasRoof;
    private int squareFeet;
    private int employees;

    // Constructor
    public ThemePark(String name, boolean hasRoof, int squareFeet, int employees) {
        this.name = name;
        this.hasRoof = hasRoof;
        this.squareFeet = squareFeet;
        this.employees = employees;
    }

    // Default Constructor
    public ThemePark() {

    }

    // Getter and Setter Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasRoof() {
        return hasRoof;
    }

    public void setHasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    // Method to reduce Square Footage due to only a Fair
    public int reduceToFair() {
        setSquareFeet(getSquareFeet() - 1000);
        return getSquareFeet();
    }

    //Method to increase Square Footage due to a Carnival
    public int increaseToCarnival() {
        setSquareFeet(getSquareFeet() + 1000);
        return getSquareFeet();
    }

    //Method to reduce employee count due to no games, just rides
    public int reduceEmployees (){
        setEmployees(getEmployees()- 25);
        return getEmployees();
    }
// Methods to get subclass methods into this class
    public int halfRpm(){
        return 0;
    }

    public int decreaseFerrisWheelCapacity(){
        return 0;
    }
}


