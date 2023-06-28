package services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriteService {

    public static String writeService(Path path, String content){
        try {
             Files.writeString(path, content);
        } catch (IOException e){
            return "Something went wrong, try again";
        }
        return "Recorded in: " + path;
    }

}
