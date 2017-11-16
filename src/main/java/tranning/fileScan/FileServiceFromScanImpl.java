package tranning.fileScan;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileServiceFromScanImpl implements FileServiceFromScan {

    @Override
    public void write(String text, int number) {
        String path;
        switch (number) {
            case 1: path = "src\\Main\\resources\\objective\\file";
                File file = new File(path);
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                    writer.write(text);
                    writer.newLine();
                    writer.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2: path = "src\\Main\\resources\\objective\\jsons";
                file = new File(path);
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                    writer.write(text);
                    writer.newLine();
                    writer.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 3: path = "src\\Main\\resources\\objective\\user";
                file = new File(path);
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                    writer.write(text);
                    writer.newLine();
                    writer.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 4: path = "src\\Main\\resources\\objective\\users";
                file = new File(path);
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                    writer.write(text);
                    writer.newLine();
                    writer.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
        /*String path = "src\\Main\\resources\\objective\\file";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));) {
            writer.write(text);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
