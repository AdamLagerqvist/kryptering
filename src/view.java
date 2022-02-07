import javax.swing.*;
import java.awt.*;
import java.io.File;

public class view {

    public view() {}

    public File get_file(){
        JFileChooser fc = new JFileChooser();
        System.out.println("choose the file you wat to encrypt/decrypt");
        while (true) {
            int result = 0;
            try {
                result = fc.showOpenDialog(null);
            } catch (HeadlessException e) {
                //e.printStackTrace();
            }

            if (result == JFileChooser.CANCEL_OPTION) {
                System.out.println("Choose your fucking file next time stupid beach");
                System.exit(0);
            }

            if (result == JFileChooser.APPROVE_OPTION) {
                return fc.getSelectedFile();
            }
        }
    }
    public long get_key(){
        return Long.parseLong(JOptionPane.showInputDialog(null,"choose the key you want to use for the encryption/decryption (the key is a long)"));
    }
}
