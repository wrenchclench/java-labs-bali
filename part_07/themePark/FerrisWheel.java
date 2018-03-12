package part_07.themePark;

public class FerrisWheel extends SpinningRides {

    private int personsCapacity;
    private int rideDuration;

    // Constructors
    public FerrisWheel(String name, boolean hasRoof, int squareFeet, int employees, int rpm, int safetyChecksPerMonth, int personsCapacity, int rideDuration) {
        super(name, hasRoof, squareFeet, employees, rpm, safetyChecksPerMonth);
        this.personsCapacity = personsCapacity;
        this.rideDuration = rideDuration;
    }

    public FerrisWheel(int rpm, int safetyChecksPerMonth, int personsCapacity, int rideDuration) {
        super(rpm, safetyChecksPerMonth);
        this.personsCapacity = personsCapacity;
        this.rideDuration = rideDuration;
    }

    public FerrisWheel(int personsCapacity, int rideDuration) {
        this.personsCapacity = personsCapacity;
        this.rideDuration = rideDuration;
    }

    //Getter and Setter Methods

    public int getPersonsCapacity() {
        return personsCapacity;
    }

    public void setPersonsCapacity(int personsCapacity) {
        this.personsCapacity = personsCapacity;
    }

    public int getRideDuration() {
        return rideDuration;
    }

    public void setRideDuration(int rideDuration) {
        this.rideDuration = rideDuration;
    }

    //Method to increase Ferris Wheel Ride duration
    public int increaseFerrisWheelDuration () {
        setRideDuration(getRideDuration() + 10);
        return getRideDuration();
    }

    //Method to decrease Ferris Wheel Ride duration
    public int decreaseFerrisWheelDuration () {
        setRideDuration(getRideDuration() - 10);
        return getRideDuration();
    }

    //Method to reduce FerrisWheel capacity
    public int decreaseFerrisWheelCapacity(){
        setPersonsCapacity(getPersonsCapacity()-20);
        return getPersonsCapacity();
    }
}
