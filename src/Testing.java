import classes.Coordinates;
import classes.Person;
import classes.StudyGroup;
import enums.Color;
import enums.Country;
import enums.FormOfEducation;
import enums.Semester;
import statics.Static;

import java.util.Date;
import java.util.LinkedHashSet;

public class Testing {
    public static void main(String[] args) {
        LinkedHashSet<StudyGroup> mySet = new LinkedHashSet<>();
        /*Static.formatter.format(new Date());*/
        StudyGroup p31312 = new StudyGroup("p3131", new Coordinates(234F,343), 20, FormOfEducation.DISTANCE_EDUCATION, Semester.FIFTH, new Person("Andrey", 180, Color.BLACK,Color.BLUE, Country.FRANCE));
        mySet.add(p31312);
        for (StudyGroup s: mySet){
            System.out.println(s.getId());
        }
    }
}
