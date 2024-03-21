public class Plant {

    //Klasės laukai:
    //Pavadinimas
    //lotyniskas pavadinimas
    //boolean vienmetis
    //kokiam zemyne auga
    //suaugusio augalo aukstis metrais.
    //ar valgomas?
    private String name;
    private String latinName;
    private boolean oneYear;
    private String continent;
    private double fullHigh;
    private boolean edible;

    public Plant() {
    }

    ;

    public Plant(String name, String latinName, boolean oneYear, String continent,
                 double fullHigh, boolean edible) {
        this.name = name;
        this.latinName = latinName;
        this.oneYear = oneYear;
        this.continent = continent;
        this.fullHigh = fullHigh;
        this.edible = edible;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public void setOneYear(boolean oneYear) {
        this.oneYear = oneYear;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setFullHigh(double fullHigh) {
        this.fullHigh = fullHigh;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public String getName() {
        return this.name;
    }

    public boolean getOneYear() {
        return this.oneYear;
    }

    public double getFullHigh() {
        return this.fullHigh;
    }

    public String getContinent() {
        return this.continent;
    }

    public boolean getEdible() {
        return this.edible;
    }

    @Override
    public String toString() {
        return this.name + " " +
                this.latinName + " " +
                this.oneYear + " " +
                this.continent + " " +
                this.fullHigh + " " +
                this.edible;
    }


}
