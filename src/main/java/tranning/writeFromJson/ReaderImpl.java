package tranning.writeFromJson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReaderImpl implements Reader{


    @Override
    public List<String> read() throws IOException {
        String path = "src\\main\\resources\\objective\\jsons";
        File file = new File(path);
        StringBuilder builder = new StringBuilder();
        List<String> list = Files.readAllLines(Paths.get(path));
        return list;

    }
}
