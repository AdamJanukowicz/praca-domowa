package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileController {
    public static List<Internal> readFromFile(){
        List<Internal> internals = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File("Internals.csv"));
            while (scanner.hasNext()) ;{
                String[] data = scanner.nextLine().split(";");
                internals.add(new Internal(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3])));
            }
            scanner.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return internals;



    }
}
