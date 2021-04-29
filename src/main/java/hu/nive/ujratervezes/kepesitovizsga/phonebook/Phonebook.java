package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {


    public void exportPhonebook(Map<String, String> contacts, String output) {

        parameterCheck(contacts, output);

        try (BufferedWriter bw = Files.newBufferedWriter(Path.of(output))) {
            for (Map.Entry<String, String> contact: contacts.entrySet()) {

                bw.write(contact.getKey() + ": " + contact.getValue());
                bw.write("\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    private void parameterCheck(Map<String, String> contacts, String output) {
        if(contacts == null || output == null){
            throw new IllegalArgumentException("parameters must not be null");
        }
    }


}
