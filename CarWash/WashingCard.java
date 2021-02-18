public class WashingCard {
   private long id;
   private int balance;
   public void deductBalance(int amount){
      balance -= amount;
   }
   public void topUpBalance(int amount){
      balance += amount;
   }
   public void setId(long id){
      this.id = id;
   }
   public void setBalance(int balance){
      this.balance = balance;
   }
   public long getId(){
      return id;
   }
   public int getBalance(){
      return balance;
   }
   public WashingCard(long id, int balance){
      this.id = id;
      this.balance = balance;
   }
}