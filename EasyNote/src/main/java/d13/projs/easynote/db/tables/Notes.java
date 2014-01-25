package d13.projs.easynote.db.tables;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by hoziain on 21.01.14.
 */
@DatabaseTable(tableName = "Notes")
public class Notes {
    @DatabaseField(generatedId = true, canBeNull = false)
    public int id;

    @DatabaseField(index = true, canBeNull = false)
    public int id_context;

    @DatabaseField(index = true, canBeNull = false)
    public int id_type;

    @DatabaseField(index = true, canBeNull = false)
    public String color;

    @DatabaseField(index = true, canBeNull = false)
    public String theme;

    @DatabaseField(index = true, canBeNull = false, dataType = DataType.DATE)
    public java.util.Date odate;

    @DatabaseField(canBeNull = true, dataType = DataType.DATE)
    public java.util.Date bdate;


    public Notes() {}
}
