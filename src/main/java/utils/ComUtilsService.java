package utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ComUtilsService {
    private ComUtils comUtils;

    public ComUtilsService(InputStream inputStream, OutputStream outputStream) throws IOException {
        comUtils = new ComUtils(inputStream, outputStream);
    }

    public void writeTest() throws IOException{
       comUtils.write_string("Hola");
    }

    public String readTest() throws IOException{
        String result = "";
        result = comUtils.read_string();
        return result;
    }



}
