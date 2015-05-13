package com.example.harry.staticrecyclerview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.harry.staticrecyclerview.AdapterAnimationStuff.FadeInAdapter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    String TAG = "MainActivity";
    RecyclerView recyclerView;
    MyRecyclerViewAdapter adapter;

    List<Item> items;
    Item item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        items = new ArrayList<>();

        String[] countries = {"Kenya", "Tanzania", "Uganda", "Rwanda", "Burundi",
                "Kenya", "Tanzania", "Uganda", "Rwanda", "Burundi",
                "Kenya", "Tanzania", "Uganda", "Rwanda", "Burundi",
                "Kenya", "Tanzania", "Uganda", "Rwanda", "Burundi",
                "Kenya", "Tanzania", "Uganda", "Rwanda", "Burundi",
                "Kenya", "Tanzania", "Uganda", "Rwanda", "Burundi"};

        int[] flags = {R.mipmap.ic_kenya, R.mipmap.ic_tanzania, R.mipmap.ic_uganda, R.mipmap.ic_rwanda, R.mipmap.ic_burundi,
                R.mipmap.ic_kenya, R.mipmap.ic_tanzania, R.mipmap.ic_uganda, R.mipmap.ic_rwanda, R.mipmap.ic_burundi,
                R.mipmap.ic_kenya, R.mipmap.ic_tanzania, R.mipmap.ic_uganda, R.mipmap.ic_rwanda, R.mipmap.ic_burundi,
                R.mipmap.ic_kenya, R.mipmap.ic_tanzania, R.mipmap.ic_uganda, R.mipmap.ic_rwanda, R.mipmap.ic_burundi,
                R.mipmap.ic_kenya, R.mipmap.ic_tanzania, R.mipmap.ic_uganda, R.mipmap.ic_rwanda, R.mipmap.ic_burundi,
                R.mipmap.ic_kenya, R.mipmap.ic_tanzania, R.mipmap.ic_uganda, R.mipmap.ic_rwanda, R.mipmap.ic_burundi};

        recyclerView = (RecyclerView) findViewById(R.id.rvList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        for(int i=0; i<countries.length && i<flags.length; i++){
            item = new Item();
            item.setCountry(countries[i]);
            item.setFlag(flags[i]);
//            Toast.makeText(getApplicationContext(), "" + countries[i] + flags[i], Toast.LENGTH_SHORT).show();

            items.add(item);
        }

        Log.i(TAG, "Items List populated?? " + items.size() + " " + items.toString());

        adapter = new MyRecyclerViewAdapter(getApplicationContext(), items);

        recyclerView.setAdapter(new FadeInAdapter(adapter));

    }

    public void MyClickHandler(View v) {
//        switch (v.getId()) {
//            case R.id.btnAdd:
//
//                break;
//            default:


//        }
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
