package Challenge;

public class RefugeeStats {

    private int count, year;
    private String country;
    private double population, refugees, refPerCap;


    public RefugeeStats() {

    }

    public RefugeeStats(int count, int year, String country, long population, long refugees, long refPerCap) {
        this.count = count;
        this.year = year;
        this.country = country;
        this.population = population;
        this.refugees = refugees;
        this.refPerCap = refPerCap;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getRefugees() {
        return refugees;
    }

    public void setRefugees(double refugees) {
        this.refugees = refugees;
    }

    public double getRefPerCap() {
        return refPerCap;
    }

    public void setRefPerCap(double refPerCap) {
        this.refPerCap = refPerCap;
    }
}

