package part_03.exercise3_1;

public class Coral {

    private boolean softCoral;
    private int offspring;
    private int size;

    public Coral(boolean softCoral, int offspring, int size) {
        this.softCoral = softCoral;
        this.offspring = offspring;
        this.size = size;


    }

    public boolean isSoftCoral() {
        return softCoral;
    }

    public void setSoftCoral(boolean softCoral) {
        this.softCoral = softCoral;
    }

    public int getOffspring() {
        return offspring;
    }

    public void setOffspring(int offspring) {
        this.offspring = offspring;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
