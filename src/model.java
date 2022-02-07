import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;

public class model {
    public model(File file, long key){
        Random generator = new Random(key);

        byte[] fileContent = new byte[0];
        try {
            fileContent = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int i = 0;
        for (byte b: fileContent) {
            fileContent[i] = (byte)(b^generator.nextInt());
            i++;
            System.out.println(b);
        }
        File new_file = new File(file.getParent(),"new_" + file.getName());
        try (FileOutputStream fos = new FileOutputStream(new_file)) {
            fos.write(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}