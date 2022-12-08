/*package homeWork1;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class taskHome2 {


    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Ex005_Logger.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        logger.log(Level.INFO, "Тестовое логирование ");
        logger.info("тестовое логирование 2");

        try {           
        int[] array = {0, 5, 99, 22, 1, 3, 9, 6};
        int temp;
        for (int i = array.length-1; i>0; i--){
            for (int j = 0; j<i; j++){
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
            
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
*/

//Задача №1

package homeWork1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class taskHome2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("students.txt"));
        try{
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null){
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
        }finally{
            br.close();
        }
    }
}
