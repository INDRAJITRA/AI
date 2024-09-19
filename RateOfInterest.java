// Superclass Bank
class Bank {
    double getRateOfInterest() {
        return 0.0;
    }
}
// Subclass SBI extending Bank
class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.5; // SBI's rate of interest
    }
}
// Subclass ICICI extending Bank
class ICICI extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.8; // ICICI's rate of interest
    }
}
// Main class to for main funtion
public class RateOfInterest {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        
        
        System.out.println("Rate of Interest in SBI: " + sbi.getRateOfInterest());
        System.out.println("Rate of Interest in ICICI: " + icici.getRateOfInterest());
    }
}
