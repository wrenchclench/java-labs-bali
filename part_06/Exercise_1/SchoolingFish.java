package part_06.Exercise_1;

class SchoolingFish extends SaltWater {

    private int avgSchoolSize;

    public SchoolingFish(int numberOfFins, int numberOfTeeth, boolean reefDwelling, int avgSchoolSize) {
        super(numberOfFins, numberOfTeeth, reefDwelling);
        this.avgSchoolSize = avgSchoolSize;
    }
// Default Constructor
    public SchoolingFish() {

    }

    public int getAvgSchoolSize() {
        return avgSchoolSize;
    }

    public void setAvgSchoolSize(int avgSchoolSize) {
        this.avgSchoolSize = avgSchoolSize;
    }
// Method override for class SchoolingFish
    public int timesFour(int x) {

        return getNumberOfFins() * 100;
    }

}