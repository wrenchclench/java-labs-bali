package part_08;

public class ExceptionClass {

    static void noGood() {

        int nums[] = new int[3];

        nums[4] = 99;
    }

    public static class DemoException {
        public static void main(String[] args) {

            try {
                ExceptionClass.noGood();
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Index out of bounds");
            }
        }
    }
}

