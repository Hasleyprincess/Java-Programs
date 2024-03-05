
package bankprogramrate;
class Bank{
    void getRateOfInterest(){
        System.out.println("RATE OF INTEREST");
    }
}
class SBI extends Bank{
    void getRateOfInterest(){
        System.out.println("RATE OF INTEREST OF BANK SBI: "+8.4+"%");
    }
}
class ICICI extends Bank{
    void getRateOfInterest(){
        System.out.println("RATE OF INTEREST OF BANK ICICI: "+7.3+"%");
    }
}
class AXIS extends Bank{
    void getRateOfInterest(){
        System.out.println("RATE OF INTEREST OF BANK AXIS: "+9.7+"%");
    }
}

public class BankProgramRate {

    
    public static void main(String[] args) {
        Bank a;
        a=new Bank();
        a.getRateOfInterest();
        a=new SBI();
        a.getRateOfInterest();
        a=new ICICI();
        a.getRateOfInterest();
        a=new AXIS();
        a.getRateOfInterest();
    }
    
}
