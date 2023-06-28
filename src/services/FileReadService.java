package services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadService {

    public static String readService(Path path){
        try {
            return Files.readString(path);
        } catch (IOException e){
           return "FIle not found";
        }
    }
}
