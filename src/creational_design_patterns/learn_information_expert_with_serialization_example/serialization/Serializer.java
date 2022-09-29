package creational_design_patterns.learn_information_expert_with_serialization_example.serialization;

import java.io.*;

public class Serializer {

    public static void saveData(String path, Object object) {
        try {
            FileOutputStream file = new FileOutputStream(path);

            ObjectOutputStream objectStream = new ObjectOutputStream(file);

            objectStream.writeObject(object);

            file.close();

            objectStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Object loadData(String path) {
        Object tmpObject = null;
        try {
            FileInputStream file = new FileInputStream(path);

            ObjectInputStream objectStream = new ObjectInputStream(file);

            tmpObject = objectStream.readObject();

            objectStream.close();

            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tmpObject;
    }
}
