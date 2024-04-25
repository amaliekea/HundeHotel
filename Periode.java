import java.util.ArrayList;
import java.util.Date;

public class Periode {
private Date start;
private Date end;
private ArrayList<Hund> hundeListe;

    public Periode(Date start, Date end, ArrayList<Hund> hundeListe) {
        this.start = start;
        this.end = end;
        this.hundeListe = hundeListe;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public ArrayList<Hund> getHundeListe() {
        return hundeListe;
    }

    public void setHundeListe(ArrayList<Hund> hundeListe) {
        this.hundeListe = hundeListe;
    }
    public void addHund(Hund hund) {
        hundeListe.add(hund);
    }

    @Override
    public String toString() {
        return "Periode{" +
                "start=" + start +
                ", end=" + end +
                ", hundeListe=" + hundeListe +
                '}';
    }
}
