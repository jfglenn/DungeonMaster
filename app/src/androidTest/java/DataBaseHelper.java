import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String CHARACTER_TABLE = "CUSTOMER_TABLE";
    public static final String COLUMN_CHARACTER_NAME = "CHARACTER_NAME";
    public static final String COLUMN_CHARACTER_RACE = "CHARACTER_RACE";
    public static final String COLUMN_CHARACTER_CLASS = "CHARACTER_CLASS";
    public static final String COLUMN_ID = "ID";

    public DataBaseHelper(@Nullable Context context) {
        super(context, "character.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + CHARACTER_TABLE + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_CHARACTER_NAME + " TEXT, " + COLUMN_CHARACTER_RACE + " TEXT, " + COLUMN_CHARACTER_CLASS + " TEXT)";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
