package shop.sport.sklep;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Item.class}, version = 1, exportSchema = false)
public abstract class DataBase extends RoomDatabase {

    public abstract ItemDao itemDao();
}
