package datas;

import classes.Coordinates;
import classes.Person;
import classes.StudyGroup;
import statics.Static;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatasParse {
    public StudyGroup csvReader(String s){
        Pattern pt = Pattern.compile("\"([^\"]*)\"");
        Matcher mt = pt.matcher(s);
        List<String> dt = new ArrayList<>();
        while(mt.find()){
            dt.add(mt.group(1));
        }

        try {
            int id = Integer.parseInt(dt.get(0));
            String name = dt.get(1);
            Coordinates cor = new Coordinates(Float.parseFloat(dt.get(2)), Float.parseFloat(dt.get(3)));
            Date date = Static.formatter.parse(dt.get(4).toString());
        } catch (Exception e) {
            System.out.println("Ошибка Парсинга!");
        }

        Person adminGroup = null;
        StudyGroup data = null;
        return data;
    }
}
