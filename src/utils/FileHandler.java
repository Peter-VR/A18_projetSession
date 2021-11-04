package utils;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandler {

    //Parse a JSON file in String
    public static String loadFileIntoString(String filePath, String fileEncoding) throws IOException {
        return IOUtils.toString(new FileInputStream(filePath), fileEncoding);
    }

    //Write a JSON file from String content
    public static void saveStringIntoFile(String filePath, String contentToSave) throws IOException {
        File f = new File(filePath);
        FileUtils.writeStringToFile(f, contentToSave, "UTF-8");
    }
}
