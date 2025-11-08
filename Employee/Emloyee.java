public class Emloyee extends StaffMember {
    protected double payRate;
    
    public Emloyee(String name, String phone, double payRate){
        super(name,phone);
        this.payRate=payRate;
    }
    @Override
    public double pay(){
        return this.payRate;
    }
}
