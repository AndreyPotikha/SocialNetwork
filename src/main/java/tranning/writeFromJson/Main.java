package tranning.writeFromJson;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Reader reader = new ReaderImpl();
        List<String> read = new LinkedList<>();
        try {
            read = reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Writer writer = new WriterImpl();
        writer.write(read);
    }
}
