package notebook;

/**
 * Created by tatjdrab on 11.05.2017.
 */
public abstract class Record {
    private int id;

    public int getId() {
        return id;
    }

    private static int recordCount;

    public Record() {
        recordCount++;
        id = recordCount;
    }


}
