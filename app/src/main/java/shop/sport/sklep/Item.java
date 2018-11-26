package shop.sport.sklep;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Item {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "itemId")
    int itemId;

    @ColumnInfo(name = "name")
    String name;

    @ColumnInfo(name = "description")
    String description;

    @ColumnInfo(name = "price")
    double price;

    @ColumnInfo(name = "image")
    String image;

    @ColumnInfo(name = "isFav")
    boolean isFav;

    @ColumnInfo(name = "isInCart")
    boolean isInCart;

    public Item(){

    }

    public Item(String name, double price, String description){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Item(String name, double price, String description, String image){
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
    }
}
