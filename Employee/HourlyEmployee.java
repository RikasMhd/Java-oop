public class HourlyEmployee extends Emloyee{
    private double hoursWorked;

    public HourlyEmployee(String name, String phone, double payRate){
        super(name,phone,payRate);
        this.hoursWorked=0.0;
    }
     public void addHours(double hours) {
        this.hoursWorked += hours;
    }

    public double pay(){
        return super.payRate*hoursWorked;
    }
}
