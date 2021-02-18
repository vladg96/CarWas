import java.io.*;
import java.util.*;
public class File_C{
    private File file = null;
    public FileWriter fw = null;
    public PrintWriter pw = null;
    private Scanner sc = null;

    public File_C(){
        try{
            file = new File("C:\\Users\\bucin\\Desktop\\KEA\\JAVA\\CarWash\\files\\file_C.txt");
        }catch (Exception e){
            System.out.println("An error occurred while creating a file_C.txt.");
            e.printStackTrace();
        }
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading a file_C.txt.");
            e.printStackTrace();
        }
        prepareForWriting();
    }

    public void clearTheFile() {
        try {
            fw = new FileWriter(file, false);
            pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
        }catch (IOException e){
            System.out.println("An error occurred while clearing a file_C.txt.");
            e.printStackTrace();
        }
        prepareForWriting();
    }

    public void prepareForWriting(){
        try{
            fw = new FileWriter(file, true);
        }catch (IOException e){
            System.out.println("An error occurred while creating a file writer for a file_C.txt.");
            e.printStackTrace();
        }
        try {
            pw = new PrintWriter(fw,true);
        }catch (Exception e){
            System.out.println("An error occurred while creating a print writer for a file_C.txt.");
            e.printStackTrace();
        }
    }

    public void addRecord(Customer customer){

    }

    public void readAllRecords(){

        ArrayList<Customer> customers = new ArrayList<Customer>();
        String[] names = new String[4];
        long[] ids = new long[4];
        int namesIndex = 0;
        int idsIndex = 0;
        boolean isCustomersName = true;
        sc.nextLine();
        while(sc.hasNext()){
            if(isCustomersName){
                names[namesIndex] = sc.next();
                namesIndex++;
                isCustomersName = false;
            }else{
                while(!(sc.hasNextDouble())) sc.next();
                ids[idsIndex] = sc.nextLong();
                idsIndex++;
                isCustomersName = true;
            }
        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(ids));
    }

}