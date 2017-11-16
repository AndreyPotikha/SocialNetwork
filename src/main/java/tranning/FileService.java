package tranning;

import java.io.IOException;

public interface FileService {

    void write(String text);

    String read();

    void writeBuffer(String text);

    String readBuffer();
}
