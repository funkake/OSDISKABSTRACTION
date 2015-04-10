import java.io.File;

/**
 * Created by fun on 10.04.2015.
 */
public class Driver {
    HardDrive hd;
    public Driver(HardDrive hd) {
        this.hd = hd;
    }
    public boolean save(File file){
        hd.write(file);
    }
    public File load(){
        hd.
    }
    public delete(File fil){

    }
}