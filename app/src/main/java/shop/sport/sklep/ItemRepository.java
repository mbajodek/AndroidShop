package shop.sport.sklep;

import android.arch.persistence.room.Room;
import android.content.Context;

public class ItemRepository {

    private String DB_NAME = "db_item";

    private DataBase dataBase;

    public ItemRepository(Context context){
        dataBase = Room.databaseBuilder(context, DataBase.class, DB_NAME).build();
    }

    public void 
}
