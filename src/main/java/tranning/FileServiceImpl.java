package tranning;

import java.io.*;

public class FileServiceImpl implements FileService {


    @Override
    public void write(String text) {
        String path = "src\\User\\resources\\objective\\file";
        File file = new File(path);

        try (FileWriter writer = new FileWriter(file, true)){
            writer.write(text);
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

        int buff;
        try (FileReader reader = new FileReader(file)){
            while ((buff = reader.read()) != -1) {
                builder.append((char) buff);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String res = builder.toString();
        return res;
    }

    @Override
    public void writeBuffer(String text) {
        String path = "src\\User\\resources\\objective\\file";
        File file = new File(path);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));){
            writer.write(text);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readBuffer() {
        String path = "src\\User\\resources\\objective\\file";
        File file = new File(path);
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String data;
            while ((data = reader.readLine()) != null) {
                builder.append(data);
                builder.append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
}
