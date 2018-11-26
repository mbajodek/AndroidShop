package shop.sport.sklep;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface ItemDao {

    @Insert
    void insertItem(Item item);

    @Delete
    void deleteItem(Item item);

    @Query("SELECT * FROM Item")
    List<Item> getAll();

    @Query("SELECT * FROM Item WHERE isFav=:isF")
    List<Item> getFavItems(boolean isF);

    @Query("SELECT * FROM Item WHERE isInCart=:inCart")
    List<Item> getCartItems(boolean inCart);
}
