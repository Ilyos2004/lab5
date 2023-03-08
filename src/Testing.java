import classes.Coordinates;
import classes.Person;
import classes.StudyGroup;
import datas.CsvSave;
import datas.ReadCsv;
import enums.Color;
import enums.Country;
import enums.FormOfEducation;
import enums.Semester;
import statics.Static;

import java.text.ParseException;
import java.util.Date;
import java.util.LinkedHashSet;

public class Testing {
    public static void main(String[] args) {
        LinkedHashSet<StudyGroup> mySet = new LinkedHashSet<>();

        CsvSave cs = new CsvSave();
        /*Static.formatter.format(new Date());*/
        /*StudyGroup p31312 = new StudyGroup("p3131", new Coordinates(234F,343), 20, FormOfEducation.DISTANCE_EDUCATION, Semester.FIFTH, new Person("Andrey", 180, Color.BLACK,Color.BLUE, Country.FRANCE));
        StudyGroup p3131 = new StudyGroup("p3131", new Coordinates(234F,343), 20, FormOfEducation.DISTANCE_EDUCATION, Semester.FIFTH, new Person("Andrey", 180, Color.BLACK,Color.BLUE, Country.FRANCE));
        StudyGroup p313 = new StudyGroup("p3131", new Coordinates(234F,343), 20, FormOfEducation.DISTANCE_EDUCATION, Semester.FIFTH, new Person("Andrey", 180, Color.BLACK,Color.BLUE, Country.FRANCE));
        mySet.add(p31312);
        mySet.add(p3131);
        mySet.add(p313);
        cs.saveCsv(mySet);*/
    }
}
