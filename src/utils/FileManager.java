package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public static <T> void writeToFile(String filePath, List<T> data) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(data);
        } catch (IOException e) {
        }
    }

    public static <T> List<T> readFromFile(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
        }
        return new ArrayList<>();
    }
}
