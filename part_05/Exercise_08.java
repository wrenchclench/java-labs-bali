package part_05;

/**
 * Write one class.
 *
 * This class must make use of an inner/nested class.
 *
 * Within the nested class, access the instance variables of the outer class.
 *
 * Also, within the inner class, call at least two methods that have a return type of int.
 *
 * Add these two ints together and set a final instance variable in the outer with this value.
 */


 class Alcohol {

    int percentage;
    boolean spirit;

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public boolean isSpirit() {
        return spirit;
    }

    public void setSpirit(boolean spirit) {
        this.spirit = spirit;
    }

    class Vodka {

        boolean isClear;


            public int waterDown(Alcohol drink){
                setPercentage((getPercentage()-10));
                return percentage;
            }

            public int spike(Alcohol drink){
                setPercentage((getPercentage()+20));
                return percentage;
            }
    }
}