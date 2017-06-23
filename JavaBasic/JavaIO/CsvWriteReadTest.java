package JavaIO;

/**
 * Created by JMYE on 6/22/17.
 */
public class CsvWriteReadTest {
    public static void main(String[] args) {
        String fileName = System.getProperty("user.dir") + "/student.csv";
        System.out.println("Write CSV file:" + fileName);
        CsvFileWriter.writeCsvFile(fileName);

        System.out.println("\nRead CSV file: ");
        CsvFileReader.readCsvFile(fileName);
    }
}
