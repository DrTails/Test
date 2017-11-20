package daniel.martinsson.testtesttesttesttest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Dr. V on 2017-11-18.
 */

public class QuestionDBHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "Quizable";
    private static final int DB_VERSION = 1;

    private static final String CREATE_TABLE_QUESTIONS = "CREATE TABLE Questions " +
            "( id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "Category TEXT NOT NULL" +
            "Question TEXT NOT NULL" +
            "True TEXT NOT NULL," +
            "False TEXT NOT NULL" +
            "Answer TEXT NOT NULL);";

    public QuestionDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    //Create Questions table
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_QUESTIONS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
