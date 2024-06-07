import java.io.FileWriter;
import java.io.IOException;

public class  filewriter{
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("peom.txt");
            writer.write("Roses are Red \n violets are blue ");
            writer.append("\n poem by raja");
            writer.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
