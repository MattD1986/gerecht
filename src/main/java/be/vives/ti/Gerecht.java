package be.vives.ti;

public class Gerecht {
    private final String naam;
    private final int calorieen;

    public Gerecht(String naam, int calorieen) {
        this.naam = naam;
        this.calorieen = calorieen;
    }

    public String getNaam() {
        return naam;
    }

    public int getCalorieen() {
        return calorieen;
    }

    @Override
    public String toString() {
        return naam;
    }
}
