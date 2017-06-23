package JavaIO;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by JMYE on 6/22/17.
 */
public class OpenCSVReader {
    public static void main(String[] args) {
        String csvFile = System.getProperty("user.dir") + "/student.csv";


        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(csvFile));
            String[] line;
            while ((line = reader.readNext()) != null) {
                System.out.println("Student [id=" + line[0] + ", firstName=" + line[1]
                        + ", lastNaming() {\n" +
                        "        return e=" + line[2] + ", gender=" + line[3] + ", age="
                        + line[4] + "]");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
