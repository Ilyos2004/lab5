package datas;

import classes.StudyGroup;
import statics.Static;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedHashSet;

public class CsvSave {
    public boolean saveCsv(LinkedHashSet<StudyGroup> mySet){
        try {
            PrintWriter output = new PrintWriter(new FileWriter(Static.filename.toString()), true);
            for(StudyGroup s: mySet) {
                output.write(s.toStringCSV() + "\n");
            }
            output.close();
            return true;
        }
        catch(Exception e) {
            e.getStackTrace();
            return false;
        }
    }
}
