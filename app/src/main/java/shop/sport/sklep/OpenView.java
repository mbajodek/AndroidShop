package shop.sport.sklep;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//
//public class OpenView extends Activity {
//
//    private RecyclerView mRecyclerView;
//    private RecyclerView.Adapter mAdapter;
//    private RecyclerView.LayoutManager mLayoutManager;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_open_view);
//        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
//
//        mRecyclerView.setHasFixedSize(true);
//
//        mLayoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mLayoutManager);
//
//        mAdapter = new MyAdapter(mDataset);
//        mRecyclerView.setAdapter(mAdapter);
//    }
//}

import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class OpenView extends Activity {
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

        list.setOnItemClickListener(new OnItemClickListener() {

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
