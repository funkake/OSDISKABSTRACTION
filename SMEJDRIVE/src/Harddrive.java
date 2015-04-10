import java.util.ArrayList;
import java.io.File;
import java.util.Collections;

/**
 * Created by Stein on 4/10/15.
 */
public class Harddrive {

    private int hardDriveSpace;
    private ArrayList<File> hd = new ArrayList<File>(Collections.<File>nCopies(hardDriveSpace, null));
    private int seekString[];

    public Harddrive(int hardDriveSpace){
        this.hardDriveSpace = hardDriveSpace;
    }

    public ArrayList<File> seek(String refString){
        ArrayList<File> files = new ArrayList<File>();
        seekString = new int[refString.length()];
        String[] sposition = refString.split(",");
        this.seekString = new int[sposition.length];
        for (int i = 0; i < sposition.length; i++) {
            try {
                this.seekString[i] = Integer.parseInt(sposition[i]);
            } catch (NumberFormatException nfe) {
                System.out.println("Wrong format on reference string: " + nfe);
            }
        }

        for (int aSeekString : seekString) {
            files.add(hd.get(aSeekString));
        }

        return files;


    }

    public void write(File file){
        hd.add(file);
    }
    /*
    public void write(String filepath){
        hd.add(new File(filepath));
    }
    */

    public ArrayList<File> read(int start, int end){
        ArrayList<File> files = new ArrayList<File>();
        for (int i = start; i < end; i++) {
            files.add(hd.get(i));

        }
        return files;

        /*
        int myFile = hd.indexOf(filename);
        return hd.get(myFile);
        */

    }
}

