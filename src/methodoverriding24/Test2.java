package methodoverriding24;

public class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest :" + s.getRateOfInterest()); // SBI Rate of Interest :8
        System.out.println("ICICI Rate of Interest :" + i.getRateOfInterest()); // ICICI Rate of Interest :7
        System.out.println("AXIS Rate of Interest : " + a.getRateOfInterest()); // AXIS Rate of Interest : 9
    }
}
