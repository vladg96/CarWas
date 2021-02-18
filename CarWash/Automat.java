import java.util.Random;
import java.util.Scanner;
public class Automat {
    File_C file_c;

    public Automat(){
        try {
            file_c = new File_C();
            file_c.clearTheFile();
            file_c.pw.println("Name of the customer \t card_ID");
            file_c.pw.println("Adam K \t \t \t \t \t \t 1");
            file_c.pw.println("Jozko B \t \t \t \t \t \t 2");
            file_c.pw.println("Gerta R \t \t \t \t \t \t 3");
            file_c.pw.println("Bonifác P \t \t \t \t \t \t 4");
            file_c.readAllRecords();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Automat waschingAutomat = new Automat();
        waschingAutomat.infoMenu();
        long cardId = waschingAutomat.getCardNumber();
        System.out.println(cardId);
    }
    

    public void printSpaces(String name){
        int ID_OFFSET = 26;
        int nameLength = name.length();
        for (int i=0; i<ID_OFFSET-nameLength; i++) file_c.pw.print(" ");
    }

    public void clearScreen(){
        for (int i = 0; i<11; i++) System.out.println();
    }

    public void infoMenu(){
        System.out.println("*********************");
        System.out.println("*    >>WELCOME<<    *");
        System.out.println("*********************");
        System.out.println("INSERT YOUR WASHING CARD TO CONTINUE: ");
    }

    public long getCardNumber(){
        Scanner sc = new Scanner(System.in);
        long cardId = -1;
        boolean isWrong = false;
        do {
            if (isWrong) System.out.println("COULD NOT READ CARD PROPERLY, TRY AGAIN:");
            if (sc.hasNextLong()) {
                cardId = sc.nextLong();
            }
            else {
                isWrong = true;
                sc.next();
            }
        }while (cardId == -1);
        return cardId;
    }
    
    public boolean checkDiscount(){
      int begin = 21600;
      int end = 50400;
      Random hour = new Random();
      int current = hour.nextInt(86400);
      if (current >= begin && current <= end){
         return true;
      }
      else{
         return false;
      }
   }

}
