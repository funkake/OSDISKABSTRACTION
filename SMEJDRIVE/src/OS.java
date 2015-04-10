import jdk.jfr.events.ExceptionThrownEvent;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;

/**
 * Created by Terje on 10.04.2015.
 */
public class OS {
    //File file = null;
    //Driver mrDriver = new Driver();
    public static void main(String[] args) {

        OS mr = new OS();

        File file = mr.chooseFile();
        String justName = file.getName();
        //mr.saveFile(file);
        System.out.println(file.getName());


        //save
        //load


    }

    public File chooseFile(){
        File chosenFile = null;
        final JFileChooser jfc = new JFileChooser();
        //final ArrayList<File> files = new ArrayList<File>();
        JFrame frame = new JFrame();
        int returnVal = jfc.showOpenDialog(frame);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            chosenFile = jfc.getSelectedFile();
        }
        if(chosenFile != null) {
            System.out.println("You choose: " + chosenFile);
        }else{
            System.out.println("No file chosen");
        }
        return chosenFile;
    }


    /*
    public boolean saveFile(File file){
        if(file != null) {
            if (mrDriver.save(file)) {
                System.out.println("File was saved");
                return true;
            }
            System.out.println("Driver was unable to save");
            return false;
        }
        System.out.println("No file to save");
        return false;

    }


    public File loadFile(String filename){
        File loadFile = mrDriver.load(filename);
        if(loadFile != null){
            return loadFile;
        }
        return null;
    }
    */




}
