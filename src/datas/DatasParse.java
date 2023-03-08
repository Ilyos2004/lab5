package datas;

import classes.Person;
import classes.StudyGroup;

import java.util.ArrayList;
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

        int id = Integer.parseInt(dt.get(0));

        Person adminGroup = null;
        StudyGroup data = null;
        return data;
    }
}
