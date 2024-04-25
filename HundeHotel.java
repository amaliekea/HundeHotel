import java.util.ArrayList;

public class HundeHotel {
    ArrayList<Periode> ophold;

    public HundeHotel() {
        this.ophold = new ArrayList<>();
    }

    public void addOphold(Periode v) {
        ophold.add(v);
    }
}
