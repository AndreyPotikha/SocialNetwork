package tranning.change;

import java.io.*;

public class FileServiceChangeImpl implements FileServiceChange {

    @Override
    public void write(String readFile) {
        String path = "src\\User\\resources\\objective\\file";
        File file = new File(path);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(readFile);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String read() {
        String path = "src\\User\\resources\\objective\\file";
        File file = new File(path);
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String data = reader.readLine();
           /* while ((data = reader.readLine()) != null) {
                builder.append(data);
            }*/
            builder.append(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
}

