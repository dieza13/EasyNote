package d13.projs.easynote.db.tables;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by hoziain on 19.01.14.
 */
@DatabaseTable(tableName = "TEXT_CONT_TB")
public class TextContext {
    @DatabaseField(generatedId = true, canBeNull = false)
    public int id;


    @DatabaseField(dataType = DataType.LONG_STRING)
    public String note;

    public TextContext () {}

    public TextContext(String text) {
        note = text;
    }
}
