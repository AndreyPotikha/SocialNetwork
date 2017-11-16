package tranning.writeFromJson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriterImpl implements Writer{


    @Override
    public void write(List<String> list) {
        String path = "src\\main\\resources\\objective\\file";
        File file = new File(path);

        for (String elem : list) {
            String lineElem = elem;
            try (BufferedWriter write = new BufferedWriter(new FileWriter(file, true))){
                write.write(String.valueOf(lineElem));
                write.flush();
                write.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
