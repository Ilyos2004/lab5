package statics;

import java.text.SimpleDateFormat;

public class Static {
    public static SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public static void txt(String s){
        System.out.println(s);
    }
}
