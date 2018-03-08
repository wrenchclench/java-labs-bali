package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs.
 *
 * Create a method that uses "String ... varargs".
 *
 * Within the varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs.
 *
 * Print this statement to the console.
 *
 * Do this at least 3 times with different Strings/sentences.
 */

class VarArgsDemo {
    public static void main(String[] args) {


        System.out.println(showVarArgs("This","is","a","sentence"));

    }

    public static String showVarArgs(String... v) {
        return showVarArgs();

    }
}





