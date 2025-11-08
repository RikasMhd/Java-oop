class CashPayment implements Payable{
    @Override
    public void paymentMethod(double amount){
        System.out.println("Cash "+amount +" ; Paid via Cash.");
    }
}
