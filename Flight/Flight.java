public class Flight{
    protected String flightNumber,destination;
    protected int capacity,seatsLeft;
    protected double basePrice;
    protected boolean booked;

    public Flight(String flightNumber,String destination,int capacity,int seatsLeft,double basePrice,boolean booked){
        this.flightNumber=flightNumber;
        this.destination=destination;
        this.capacity=capacity;
        this.seatsLeft=seatsLeft;
        this.basePrice=basePrice;
        this.booked=false;
    }

    public String getFlightNumber(){
        return this.flightNumber;
    }
    public String getDestination(){
        return this.destination;
    }
    public boolean isBooked(){
        return booked;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public int getSeatsLeft(){
        return this.seatsLeft;
    }
    public double getBasePrice(){
        return this.basePrice;
    }
    public double calculateTotalPrice(int numSeats){
        if(this.seatsLeft>=numSeats){
            return numSeats*getBasePrice();
        }
        else{
            return 0;
        }
    }

   /* public boolean book(int numSeats){
        if(this.seatsLeft>=numSeats){
            seatsLeft-=numSeats;
            Seat
        }
    }
    public void cancelSeats(int numSeats){

    }*/


}