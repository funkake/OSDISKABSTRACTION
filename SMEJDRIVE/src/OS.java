import javax.swing.*;
import java.io.File;
import java.io.FileWriter;

/**
 * Created by Terje on 10.04.2015.
 */
public class OS {
    File file = null;
    public static void main(String[] args) {
        OS mr = new OS();

        mr.chooseFile();

        //FileWriter writer = new FileWriter();

        //save
        //load




        /*


        frame.add(jfc);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);

        jfc.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                if(e.getActionCommand().equals("ApproveSelection")){
                    files.add(jfc.getSelectedFile());
                    System.out.println(jfc.getSelectedFile());
                    jfc.accept(jfc.getSelectedFile());
                }else if(e.getActionCommand().equals("ApproveSelection")){
                    files.add(jfc.getSelectedFile());
                    System.out.println(jfc.getSelectedFile());
                    jfc.accept(jfc.getSelectedFile());
                }
            }
        });
        */

    }

    public File chooseFile(){
        final JFileChooser jfc = new JFileChooser();
        //final ArrayList<File> files = new ArrayList<File>();
        JFrame frame = new JFrame();
        int returnVal = jfc.showOpenDialog(frame);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            file = jfc.getSelectedFile();
        }
        if(file != null) {
            System.out.println("You choose: " + file);
        }else{
            System.out.println("No File Chosen");
        }
        return file;
    }

    /*

    public boolean saveFile(int pos){
        if(mrDriver.save(file,pos)){
            return true;
        }
        return false;

    }
    */
    /*
    public File loadFile(){
        if()
    }
    */



}
