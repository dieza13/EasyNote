package d13.projs.easynote.db.tables;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.ArrayList;

/**
 * Created by hoziain on 20.01.14.
 */
@DatabaseTable(tableName = "TODO_CONT_TB")
public class TODOContext {
    private static char delim = (char) Integer.parseInt("01", 16);

    @DatabaseField(generatedId = true, canBeNull = false)
    public int id;

    @DatabaseField(dataType = DataType.LONG_STRING)
    private String list;
    @DatabaseField(dataType = DataType.LONG)
    private long states;

    public TODOContext () {}

    public TODOContext(ArrayList<String> list, long states) {
        setList(list, states);
    }

    public void setList(ArrayList<String> listArr, long states) {
        list = "";
        this.states = states;
        for (int i = 0; i < listArr.size(); i++) {
            list += listArr.get(i) + ((i < listArr.size() - 1) ? delim : "");
        }
    }

    public long getStates() {
        return states;
    }

    public ArrayList<String> getList() {
        String s[] = list.split("[" + delim + "]");
        ArrayList<String> l = null;
        for (int i = 0; i < s.length; i++)
            l.add(s[i]);
        return l;
    }

}
