package notebook;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.Arrays;

public class Notebook {
    ArrayList<Record> records = new ArrayList<>();

    @Command
    public ArrayList<Record> list() {
        return records;
    }

    @Command
    public Person createPerson(String firstName, String lastName, String note, String... phone) {
        Person result = new Person();
        result.setFirstName(firstName);
        result.setLastName(lastName);
        result.setPhone(new ArrayList<>(Arrays.asList(phone)));
        result.setNote(note);
        records.add(result);
        return result;
    }

    @Command
    public Note createNote(String note) {
        Note result = new Note();
        result.setNote(note);
        records.add(result);
        return result;
    }

    @Command
    public Reminder createReminder(String note, String date) {
        Reminder result = new Reminder();
        result.setDate(date);
        result.setNote(note);
        records.add(result);
        return result;
    }

   /* @Command
    public addPhone(int id, String phone){
        records.add(id,   );
    }
*/
}
