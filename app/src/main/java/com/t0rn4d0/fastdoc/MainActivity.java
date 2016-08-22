package com.t0rn4d0.fastdoc;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.ActionMenuItem;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    CityAdapter adapter;
    Context context;
    public static String selectedCity;
    //ArrayList cities;
    public static int [] cityImages={R.drawable.bangalore,R.drawable.chennai,R.drawable.hyderabad,R.drawable.jaipur,R.drawable.kolkata,R.drawable.mumbai,R.drawable.newdelhi,R.drawable.pune};
    public static String [] cityNameList={"Bangalore","Chennai","Hyderabad","Jaipur","Kolkata","Mumbai","New Delhi","Pune"};
    //View item=(View) findViewById(R.id.selected_city);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        context=this;

        lv=(ListView) findViewById(R.id.listView);
        adapter=new CityAdapter(this, cityNameList,cityImages);
        lv.setAdapter(adapter);
        lv.setClickable(true);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(getApplicationContext(),adapter.getItem(position),Toast.LENGTH_SHORT);
                selectedCity=adapter.getItem(position);
                Intent i=new Intent(context,Specialties.class);
                i.putExtra("Location",selectedCity);
                startActivity(i);
            }
        });
        //Toast.makeText(context, "You Clicked "+selectedCity, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.city_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
           // Toast.makeText(context, "You Clicked "+selectedCity, Toast.LENGTH_LONG).show();
            Intent i=new Intent(context,AboutUs.class);
            startActivity(i);
            return true;
        }



        return super.onOptionsItemSelected(item);
    }
}
