import java.util.Random;
public class Discount{
   public static void checkDiscount(){
      int begin = 21600;
      int end = 50400;
      Random hour = new Random();
      current = hour.nextInt(86400);
      if (current >= begin && current <= end){
         System.out.println("Discount 20%");
      }
      else{
         return 0;
      }
   }
}