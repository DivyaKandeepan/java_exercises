class Bank {
    public double getRateOfInterest() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    public double getRateOfInterest() {
        return 8.0;
    }
}

class ICICI extends Bank {
    @Override
    public double getRateOfInterest() {
        return 7.0;
    }
}

class AXIS extends Bank {
    @Override
    public double getRateOfInterest() {
        return 9.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        System.out.println("SBI Interest Rate: " + sbi.getRateOfInterest()); // Output: 8

        Bank icici = new ICICI();
        System.out.println("ICICI Interest Rate: " + icici.getRateOfInterest()); // Output: 7

        Bank axis = new AXIS();
        System.out.println("AXIS Interest Rate: " + axis.getRateOfInterest()); // Output: 9
    }
}
