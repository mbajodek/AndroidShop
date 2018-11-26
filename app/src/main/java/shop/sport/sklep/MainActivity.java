package shop.sport.sklep;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);

        //LayoutInflater.from(getContext()).inflate(R.layout.drawer, mNavigationView);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mNavigationView = (NavigationView) findViewById(R.id.nav_view);

        mNavigationView.setNavigationItemSelectedListener(this);

        //mDrawerLayout = findViewById(R.id.drawer_layout);

//        NavigationView navigationView = findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(
//                new NavigationView.OnNavigationItemSelectedListener() {
//                    @Override
//                    public boolean onNavigationItemSelected(MenuItem menuItem) {
//                        // set item as selected to persist highlight
//                        menuItem.setChecked(true);
//                        // close drawer when item is tapped
//                        mDrawerLayout.closeDrawers();
//
//                        // Add code here to update the UI based on the item selected
//                        // For example, swap UI fragments here
//
//                        return true;
//                    }
//                });

        final Button goToOfferBtn = findViewById(R.id.goToOfferBtn);
        goToOfferBtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHomeActivity();
            }
        }));

        final Button loginBtn = findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHomeActivity();
            }
        }));
    }

    public void goToHomeActivity(){
        Intent goToActivityIntent = new Intent(this, OpenView.class);
        startActivity(goToActivityIntent);
    }

    public void goToCartActivity(){
        Intent goToActivityIntent = new Intent(this, Cart.class);
        startActivity(goToActivityIntent);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        menuItem.setChecked(true);

        switch(menuItem.getItemId()) {
            case R.id.nav_home: {
                // Do something (replace fragments, …)
                goToHomeActivity();
                break;
            }
            case R.id.nav_cart: {
                // Do something (replace fragments, …)
                goToCartActivity();
                break;
            }
        }

        mDrawerLayout.closeDrawer(mNavigationView);

        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
