package com.t0rn4d0.fastdoc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Specialties extends AppCompatActivity {

    ListView lv1;
    SpecialityAdapter adapter1;
    Context context1;
    public static String selectedSpeciality;
    String selectedCity;

    public static int[] specialityImages={R.drawable.cardiologist,R.drawable.dentist,R.drawable.ent,R.drawable.generalphysician,R.drawable.gynecologist,R.drawable.ophthalmologist,R.drawable.orthopedist,R.drawable.pediatrician};
    public static String[] specialityNameList={"Cardiologist","Dentist","ENT","General physician","Gynecologist","Ophthalmologist","Orthopedist","Pediatrician"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        selectedCity=getIntent().getStringExtra("Location");
        Log.d("Specialties", "onCreate: Selected City: "+selectedCity);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specialties);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*android.support.v7.app.ActionBar mActionBar = getSupportActionBar();
        mActionBar.setDisplayShowHomeEnabled(false);
        mActionBar.setDisplayShowTitleEnabled(false);
        LayoutInflater mInflater = LayoutInflater.from(this);

        View mCustomView = mInflater.inflate(R.layout.actionbarview, null);
        Button mTitleTextView = (Button) mCustomView.findViewById(R.id.city_title);
        mTitleTextView.setText(selectedCity);
        mTitleTextView.setTextColor(Color.WHITE);
        mActionBar.setCustomView(mCustomView);
        mActionBar.setDisplayShowCustomEnabled(true);*/

        context1=this;
        lv1=(ListView) findViewById(R.id.listView1);
        adapter1=new SpecialityAdapter(this, specialityNameList,specialityImages);
        lv1.setAdapter(adapter1);
        lv1.setClickable(true);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(getApplicationContext(),adapter1.getItem(position),Toast.LENGTH_SHORT);
                selectedSpeciality=adapter1.getItem(position);
                Intent i=new Intent(context1,DoctorsList.class);
                i.putExtra("Location",selectedCity);
                i.putExtra("Speciality",selectedSpeciality);
                startActivity(i);

            }
        });



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            //Toast.makeText(context1, "You Clicked "+selectedSpeciality, Toast.LENGTH_SHORT).show();
            //return true;
            Intent i;
            i=new Intent(context1,AboutUs.class);
            startActivity(i);
            return true;
        }

        if(id==R.id.selected_city)
        {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onPrepareOptionsMenu(Menu menu)
    {
        invalidateOptionsMenu();
        menu.findItem(R.id.selected_city).setTitle(selectedCity);
        menu.findItem(R.id.selected_city).setEnabled(true);
        return true;
    }
}
