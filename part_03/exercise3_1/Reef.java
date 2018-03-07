package part_03.exercise3_1;

public class Reef {

    private int size;
    private int depth;
    private boolean atRisk;

    public Reef(int size, int depth, boolean atRisk) {
        this.size = size;
        this.depth = depth;
        this.atRisk = atRisk;


    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public boolean isAtRisk() {
        return atRisk;
    }

    public void setAtRisk(boolean atRisk) {
        this.atRisk = atRisk;
    }


}
