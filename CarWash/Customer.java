import java.util.*;
public class Customer{
   String name;
   ArrayList<WashingCard> cards = new ArrayList<WashingCard>();
   String address;
   public String getName(){
      return name;
   }
   public void setName(String name){
      this.name = name;
   }
   public String getaddress(){
      return address;
   }
   public void setAddress(String address){
      this.address = address;
   }
   
   public void addCard(WashingCard card){
      this.cards.add(card);
   }
   public ArrayList<WashingCard> getCards(){
      return cards;
   }
}