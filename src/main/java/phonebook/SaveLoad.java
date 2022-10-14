package phonebook;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
// Описывается класс SaveLoad для загрузки из файла и сохранения записной книжки в файл
public class SaveLoad {

    Phonebook phonebook;

    public Phonebook getPhonebook() {
        return phonebook;
    }

    public void setPhonebook(Phonebook phonebook) {
        this.phonebook = phonebook;
    }
    // Описывается мето сохранения файла
    void save(Phonebook pb){
        try (FileWriter writer = new FileWriter(Config.pathDb)) {
            ObjectMapper objectMapper = new ObjectMapper();
            String st = objectMapper.writeValueAsString(pb);
            writer.write(st);
        }
        catch (Exception e) {
            System.out.println("Error write " + e.getMessage());
        }

    }

    // Описывается метод чтения файла
    public Phonebook load() {
        try (FileReader reader = new FileReader(Config.pathDb)) {
            BufferedReader rd = new BufferedReader(reader);
            String st = rd.readLine();
            ObjectMapper objectMapper = new ObjectMapper();
            Phonebook pb = objectMapper.readValue(st, Phonebook.class);
            this.setPhonebook(pb);
        }
        catch (Exception e) {
            System.out.println("Error read " + e.getMessage());
        }
        return phonebook;
    }
}
