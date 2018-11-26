package shop.sport.sklep;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class Cart extends Activity {
    ArrayList<Item> items;

    ListView list;
    LazyAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_view);

        ArrayList<HashMap<String, String>> itemsList = new ArrayList<HashMap<String, String>>();

        items = new ArrayList<Item>();

        items.add(new Item("Buty XYZ", 199.99, "Super buty", "@drawable/buty"));
        items.add(new Item("Piłka nożna 200x", 79.99, "Piłka do nogi", "@drawable/football"));
        items.add(new Item("Piłka sitakowa", 58.99, "Dobra piłka so siatki", "@drawable/volleyball"));
        items.add(new Item("Buty XYZ", 199.99, "Super buty"));
        items.add(new Item("Piłka nożna 200x", 79.99, "Piłka do nogi"));
        items.add(new Item("Piłka sitakowa", 58.99, "Dobra piłka so siatki"));
        items.add(new Item("Buty XYZ", 199.99, "Super buty"));
        items.add(new Item("Piłka nożna 200x", 79.99, "Piłka do nogi"));
        items.add(new Item("Piłka sitakowa", 58.99, "Dobra piłka so siatki"));
        items.add(new Item("Buty XYZ", 199.99, "Super buty"));
        items.add(new Item("Piłka nożna 200x", 79.99, "Piłka do nogi"));
        items.add(new Item("Piłka sitakowa", 58.99, "Dobra piłka so siatki"));
        items.add(new Item("Buty XYZ", 199.99, "Super buty"));
        items.add(new Item("Piłka nożna 200x", 79.99, "Piłka do nogi"));
        items.add(new Item("Piłka sitakowa", 58.99, "Dobra piłka so siatki"));
        items.add(new Item("Buty XYZ", 199.99, "Super buty"));
        items.add(new Item("Piłka nożna 200x", 79.99, "Piłka do nogi"));
        items.add(new Item("Piłka sitakowa", 58.99, "Dobra piłka so siatki"));
        items.add(new Item("Buty XYZ", 199.99, "Super buty"));

        for (int i = 0; i < items.size(); i++) {
            HashMap<String, String> map = new HashMap<String, String>();
            Item item = items.get(i);
            // adding each child node to HashMap key => value
            map.put("name", item.name);
            map.put("description", item.description);
            map.put("price",  Double.toString(item.price));
            map.put("image", item.image);

            itemsList.add(map);
        }

        list=(ListView)findViewById(R.id.list);

        adapter=new LazyAdapter(this, itemsList);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item item = items.get(position);
                goToActivity();
            }
        });
    }

    public void goToActivity(){
        Intent goToActivityIntent = new Intent(this, Description.class);
        startActivity(goToActivityIntent);
    }
}
