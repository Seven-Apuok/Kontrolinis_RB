package lt_techin_RobertasB;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class CSVFileReader {
    public static void csv(String[] args) throws IOException, CsvValidationException {
        CSVReader reader = new CSVReader(new FileReader("\\RB_PrestaShop\\CSVfile\\products.csv"));
        StringBuffer buffer = new StringBuffer();
        String data[];
        while ((data = reader.readNext ()) !=null){
            for (int i=0 ; i<data.length ; i++){
                System.out.println((data[i]+""));
            }
        }
    }
}
