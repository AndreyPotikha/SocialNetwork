package tranning;

public class Main {

    public static void main(String[] args) {

       /* FileServiceFromScanImpl fileService = new FileServiceImpl();
        String text = "Hlllo";
        fileService.write(text);

        FileServiceFromScanImpl fileServiceRead = new FileServiceImpl();
        String result = fileServiceRead.read();
        System.out.println(result);*/

        FileService fileServiceWriteBuffer = new FileServiceImpl();
        String text2 = "world";
        fileServiceWriteBuffer.writeBuffer(text2);

        FileService fileServiceReadBuffer = new FileServiceImpl();
        String result2 = fileServiceReadBuffer.read();
        System.out.println(result2);

    }
}
