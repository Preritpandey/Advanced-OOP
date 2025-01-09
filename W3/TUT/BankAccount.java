
public class BankAccount{
      
        public static void main(String[] args) {
       FetchNumbers f1 =new FetchNumbers();
       f1.getBankAccount();
       f1.setBalance(100);
        }
}

class FetchNumbers{
    private String bankAccount = "7823d8y32bdu32378232";
    private int amount = 1324;
    String getBankAccount(){
        return bankAccount;
     }  
void setBalance(int bal){
bal= this.amount;

}
}