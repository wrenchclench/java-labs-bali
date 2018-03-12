package part_06.Exercise_1;

class SaltWater extends Fish {

    private boolean reefDwelling;

    public SaltWater(int numberOfFins, int numberOfTeeth, boolean reefDwelling) {
        super(numberOfFins, numberOfTeeth);
        this.reefDwelling = reefDwelling;
    }
// Defualt Constuctor
    public SaltWater() {

    }

    public boolean isReefDwelling() {
        return reefDwelling;
    }

    public void setReefDwelling(boolean reefDwelling) {
        this.reefDwelling = reefDwelling;
    }

    int s =  super.timesFour(4);

    int t = super.timesTwo(6);

// Method Override to x 6
    public int timesFour(int x) {

        return getNumberOfFins() * 6;
    }

}