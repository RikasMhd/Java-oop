public class Volunteer extends StaffMember{

    public Volunteer(String name, String phone){
        super(name,phone);
    }
    @Override
    public double pay(){
        return 0.0;
    }

}
