import java.io.*;
import java.util.ArrayList;

/**
 * Created by fun on 10.04.2015.
 */
public class Driver {
    Harddrive hd;
    public Driver(Harddrive hd) {
        this.hd = hd;
    }
    public boolean save(File file){
        File loaded = load(0);
        File meta;
        ArrayList<String> lines = new ArrayList<String>();
        if(loaded==file) {
            meta = loaded;
        }else{
            meta = new File("file.txt");
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(meta),10);
            try {
                String line;
                while((line = reader.readLine())!=null){
                    lines.add(line);
                }
            } catch (NumberFormatException e) {
            }
        } catch (IOException ex) {
        }

        String[] str = lines.get(lines.size()).split("$");
        Integer pos = 1+Integer.parseInt(str[1]);

        hd.write(file,pos);

        try{
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(meta, true)));
            out.println(file.getName()+" $"+pos);
            out.close();
        }catch (IOException e) {
            //exception handling left as an exercise for the reader
        }

        return true;
    }
    public File load(String name){
        File meta = load(0);
        if(meta==null){
            System.err.print("NO FILES SAVED");
            return null;
        }
        ArrayList<String> lines = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(meta),10);
            try {
                String line;
                while((line = reader.readLine())!=null){
                    lines.add(line);
                }
            } catch (NumberFormatException e) {
            }
        } catch (IOException ex) {
        }

        String[] str = lines.get(lines.size()).split("$");
        Integer pos = Integer.parseInt(str[1]);

        return hd.read(pos,pos).get(0);
    }

    public File load(int sector){
        return hd.read(sector,sector).get(0);
    }

    public boolean delete(File file){
        return true;
    }
}