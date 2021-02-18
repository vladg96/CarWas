public class Transaction{
   private WashingCard usedCard;
   private int price;
   private String washType;
   public Transaction(WashingCard usedCard, int price, String washType){
      this.usedCard = usedCard;
      this.price = price;
      this.washType = washType;
   }
   public void setPrice(int price){
      this.price = price;
   }
   public void setWashType(String washType){
      this.washType = washType;
   }
   public int getPrice(){
      return price;
   }
   public String getWashType(){
      return washType;
   }
   public WashingCard getUsedCard(){
      return usedCard;
   }
}