public abstract class StaffMember {
    private String name,phone;

    public StaffMember(String name,String phone){
        this.name=name;
        this.phone=phone;
    }
    abstract double pay();
}
