package app;

import services.FileReadService;
import services.FileWriteService;
import utils.Constants;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Enter 1 if you want to read file, enter 2 if you want to create and write text in file: ");
        try (Scanner scanner = new Scanner(System.in)){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Please enter a file name you want to read: ");
                    String result = FileReadService.readService(Path.of(Constants.PATH_IN + scanner.nextLine() + ".txt"));
                    System.out.println(result);
                    break;
                case 2:
                    System.out.println("Please enter a file name you want to write: ");
                    String newFile = scanner.nextLine() + ".txt";
                    System.out.println("Enter content: ");
                    String content = scanner.nextLine();
                    FileWriteService.writeService(Paths.get(Constants.PATH_IN + newFile), content);
                    System.out.println("Success!");
                    break;
                default:
                    System.out.println("You entered not valid number");
                    break;
            }
        } catch (InputMismatchException e){
            System.out.println("You enter not a number");
        }
    }
}
