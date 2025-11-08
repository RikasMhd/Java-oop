public class Executive extends Emloyee {
    private double bonus;
     public Executive(String name, String phone, double payRate){
        super(name,phone,payRate);
        this.bonus=bonus;
    }

    public void awardBonus(double bonus) {
        this.bonus += bonus;
    }
    public double pay(){
        double totalPay=super.payRate+bonus;
        return totalPay;
    }
}
