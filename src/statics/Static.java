package statics;

import java.io.File;
import java.text.SimpleDateFormat;

public class Static {
    public static SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public static String filename = "../lab5/Datas/baza.csv";
    public static File databaseFile = new File(filename.toString());

    public static void txt(String s){
        System.out.println(s);
    }
}
