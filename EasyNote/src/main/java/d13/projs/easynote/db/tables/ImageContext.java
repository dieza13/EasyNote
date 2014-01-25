package d13.projs.easynote.db.tables;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by hoziain on 20.01.14.
 */
@DatabaseTable(tableName = "IMAGE_CONT_TB")
public class ImageContext {
    @DatabaseField(uniqueIndex = true, canBeNull = false)
    public String id;

    public ImageContext(String imageName) {
        id = imageName;
    }
}
