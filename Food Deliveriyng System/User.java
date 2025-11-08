class User{
    String name;
    User(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
    public String displayInfo(){
        return "User Name : "+getName();
    }
}