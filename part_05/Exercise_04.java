package part_05;

/**
 * Write two classes. Class_01 should have the main().
 *
 * Class_02 must have 3 or more private variables.
 *
 * Class_02 must also have at least 3 overloaded constructors.
 *
 * In Class_01.main() create several instances of Class_02 using each overloaded constructor. Each constructor should do
 * something slightly differently.
 *
 * Class_02 must have at least two private instance variables.
 *
 * Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */

// Class 1 with main
// Create several instances of Class 2 using each overloaded constructor

class Demo5 {
    public static void main(String[] args) {

        Country canada = new Country(33000000);
        Country australia = new Country (22000000, true);
        Country usa = new Country(333000000, true, 500000000);

        System.out.println("Canada pop is " + canada.getPop());
        System.out.println("Australia pop is " + australia.getPop());
        System.out.println("USA pop is " + usa.getPop());

        canada.war();
        System.out.println("Canada went to war and now the pop is " + canada.getPop());

        australia.war();
        System.out.println("Australia went to war and now the pop is " + australia.getPop());

        usa.war();
        System.out.println("USA went to war and now the pop is " +  usa.getPop());
    }


}


// Class 2 needs 3 private variables and 3 overloaded constructors

class Country {

    private int pop;
    private boolean democracy;
    private int gdp;

// Constructor 1
    public Country(int pop) {

        this.pop = pop;
    }

// Constructor 2
    public Country(int pop, boolean democracy) {
        this.pop = pop;
        this.democracy = democracy;
    }
// Constructor 3
    public Country(int pop, boolean democracy, int gdp) {
        this.pop = pop;
        this.democracy = democracy;
        this.gdp = gdp;
    }

    public int getPop() {

        return pop;
    }

    public void setPop(int pop) {

        this.pop = pop;
    }

    public boolean isDemocracy() {

        return democracy;
    }

    public void setDemocracy(boolean democracy) {
        this.democracy = democracy;
    }

    public int getGdp() {
        return gdp;
    }

    public void setGdp(int gdp) {
        this.gdp = gdp;
    }

    public void war(){
        setPop((getPop() / 2));
    }
}

