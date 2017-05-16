package notebook;


/**
 * Created by tatjdrab on 11.05.2017.
 */
public class Reminder extends Note {
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "note='" + getNote() + '\'' +
                "date='" + date + '\'' +
                '}';
    }
}
