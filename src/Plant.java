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
    private boolean isAnnual;
    private String continent;
    private double fullHigh;
    private boolean isEdible;

    public Plant() {
    }

    ;

    public Plant(String name, String latinName, boolean isAnnual, String continent,
                 double fullHigh, boolean isEdible) {
        this.name = name;
        this.latinName = latinName;
        this.isAnnual = isAnnual;
        this.continent = continent;
        this.fullHigh = fullHigh;
        this.isEdible = isEdible;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public void setisAnnual(boolean oneYear) {
        this.isAnnual = isAnnual;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setFullHigh(double fullHigh) {
        this.fullHigh = fullHigh;
    }

    public void setisEdible(boolean edible) {
        this.isEdible = isEdible;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public String getName() {
        return this.name;
    }

    public boolean getiAnnual() {
        return this.isAnnual;
    }

    public double getFullHigh() {
        return this.fullHigh;
    }

    public String getContinent() {
        return this.continent;
    }

    public boolean getissEdible() {
        return this.isEdible;
    }


    @Override
    public String toString() {
        return this.name + " " +
                this.latinName + " " +
                (this.isAnnual ? "annual" : "not annual") + " " +
                this.continent + " " +
                this.fullHigh + " " +
                (this.isEdible ? "edible" : "not edible");
    }


}
