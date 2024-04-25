public class HundeEjer {
    String name;
    Hund h;

    public HundeEjer(String name, Hund h) {
        this.name = name;
        this.h = h;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hund getH() {
        return h;
    }

    public void setH(Hund h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "HundeEjeren " + name  +
                ", har en hund af racen " + h ;
    }
}
