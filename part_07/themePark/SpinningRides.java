package part_07.themePark;

public class SpinningRides extends ThemePark {

    // Class Variables
    private int rpm;
    private int safetyChecksPerMonth;

    // Constructors
    public SpinningRides(String name, boolean hasRoof, int squareFeet, int employees, int rpm, int safetyChecksPerMonth) {
        super(name, hasRoof, squareFeet, employees);
        this.rpm = rpm;
        this.safetyChecksPerMonth = safetyChecksPerMonth;
    }

    public SpinningRides(int rpm, int safetyChecksPerMonth) {
        this.rpm = rpm;
        this.safetyChecksPerMonth = safetyChecksPerMonth;
    }
    // Default Constructor
    public SpinningRides(){

    }

    //Getter and Setter Methods
    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getSafetyChecksPerMonth() {
        return safetyChecksPerMonth;
    }

    public void setSafetyChecksPerMonth(int safetyChecksPerMonth) {
        this.safetyChecksPerMonth = safetyChecksPerMonth;
    }

    //Method to double the rpm of the spinning rides
    public int doubleRpm(){
        setRpm(getRpm()*2);
        return getRpm();
    }

    //Method to double safety checks
    public int doubleSafetyCheck(){
        setSafetyChecksPerMonth(getSafetyChecksPerMonth()*2);
        return  getSafetyChecksPerMonth();
    }

    //Method to slow down spinning rides
    public int halfRpm(){
        setRpm(getRpm()/2);
        return  getRpm();
    }
// Method to get this subclass method up to super class
    public int decreaseFerrisWheelCapacity(){
        return 0;
    }
}
