public class BomuldsHund extends Hund{
private String madPlan;

    public BomuldsHund(String name, int age, String luftningsPlan, String madPlan) {
        super(name, age, luftningsPlan);
        this.madPlan = madPlan;
    }

    public String getMadPlan() {
        return madPlan;
    }

    public void setMadPlan(String madPlan) {
        this.madPlan = madPlan;
    }

    @Override
    public String toString() {
        return "BomuldsHund " + ", hundens navn er: " + getName() +
                " og den spiser " + madPlan + '\'' + ", og skal luftes " + getLuftningsPlan();
    }
}
