package part_06.Exercise_1;

class Fish {

    private int numberOfFins;
    private int numberOfTeeth;
    private boolean pacific;

// Constructor3
    public Fish(int numberOfFins, int numberOfTeeth, boolean pacific) {
        this.numberOfFins = numberOfFins;
        this.numberOfTeeth = numberOfTeeth;
        this.pacific = pacific;
    }

    // Constructor2
    public Fish(int numberOfFins, int numberOfTeeth) {
        this.numberOfFins = numberOfFins;
        this.numberOfTeeth = numberOfTeeth;
    }

    // Default Constructor
    public Fish() {

    }

    //Getter and Setter Methods
    public int getNumberOfFins() {

        return numberOfFins;
    }

    public void setNumberOfFins(int numberOfFins) {

        this.numberOfFins = numberOfFins;
    }

    public int getNumberOfTeeth() {

        return numberOfTeeth;
    }

    public void setNumberOfTeeth(int numberOfTeeth) {

        this.numberOfTeeth = numberOfTeeth;
    }

    public boolean isPacific() {
        return pacific;
    }

    public void setPacific(boolean pacific) {
        this.pacific = pacific;
    }

// Random Methods
    public int timesFour(int x) {

        return getNumberOfFins() * 4;
    }

    public int timesTwo(int x) {

        return getNumberOfFins() * 2;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "numberOfFins=" + numberOfFins +
                ", numberOfTeeth=" + numberOfTeeth +
                ", pacific=" + pacific +
                '}';
    }
}













