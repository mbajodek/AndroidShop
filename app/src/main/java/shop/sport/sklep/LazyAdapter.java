package shop.sport.sklep;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LazyAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<HashMap<String, String>> data;
    private static LayoutInflater inflater=null;
    public ImageLoader imageLoader;

    public LazyAdapter(Activity a, ArrayList<HashMap<String, String>> d) {
        activity = a;
        data=d;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        imageLoader=new ImageLoader(activity.getApplicationContext());
    }

    public int getCount() {
        return data.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.list_row, null);

        TextView name = (TextView)vi.findViewById(R.id.name); // title
        TextView description = (TextView)vi.findViewById(R.id.description); // artist name
        TextView price = (TextView)vi.findViewById(R.id.price); // duration
        ImageView image = (ImageView)vi.findViewById(R.id.image);
        //ImageView thumb_image=(ImageView)vi.findViewById(R.id.list_image); // thumb image

        HashMap<String, String> item = new HashMap<String, String>();
        item = data.get(position);

        // Setting all values in listview
        name.setText(item.get("name"));
        description.setText(item.get("description"));
        price.setText(item.get("price"));
        //imageLoader.DisplayImage(song.get(OpenView.KEY_THUMB_URL), thumb_image);
        return vi;
    }
}