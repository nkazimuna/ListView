package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        ListView myListView = (ListView)findViewById(R.id.myListView);
//
//        final  ArrayList<String> fam = new ArrayList<String>();
//        fam.add("Father");
//        fam.add("Mother");
//        fam.add("Son");
//        fam.add("Daughter");
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,fam);
//        myListView.setAdapter(arrayAdapter);
//
//
//        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Log.i("Person tapped: ",fam.get(position));
//                Toast.makeText(MainActivity.this,fam.get(position),Toast.LENGTH_LONG).show();
//
//            }
//        });

        ListView friendListView =(ListView)findViewById(R.id.friendListView);
        final ArrayList<String> friends = new ArrayList<String>(asList("Jon","Tom","Jin","Rob"));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,friends);
        friendListView.setAdapter(arrayAdapter);
        friendListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,friends.get(position),Toast.LENGTH_LONG).show();
            }
        });

    }
}
