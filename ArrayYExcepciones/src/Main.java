import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
             createFile();
            } catch (IOException ioe) {
             System.out.println(ioe);
             } catch (IllegalArgumentException iae){
             System.out.println(iae);
             } catch (Exception e){
             System.out.println(e);
             }
         }
 public static void createFile() throws IOException, IOException {
         File testF = new File("c:/writeableDir");
         File tempF = testF.createTempFile("te", null, testF);
         System.out.println("Temp filename: "+tempF.getPath());
        List<Integer> arrayListpractica=new ArrayList<>();
        arrayListpractica.add(5,25);
     

    }
}