package com.example.facultyevaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listView_ID);
        searchView = findViewById(R.id.searchView_ID);

        String [] testItems = getResources().getStringArray(R.array.test_items);
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, R.layout.sample_view, R.id.textView_Id, testItems);
        listView.setAdapter(arrayAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayAdapter.getFilter().filter(s);
                return false;
            }
        });




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = testItems[i];
                if(value == testItems[0]) {
                    Intent intent = new Intent(MainActivity.this, signupActivity.class);
                    startActivity(intent);
                }
                if(value == testItems[1]) {
                    Intent intent = new Intent(MainActivity.this, loginActivity.class);
                    startActivity(intent);
                }
                if(value == testItems[2]) {
                    Intent intent = new Intent(MainActivity.this, studentDashboard.class);
                    startActivity(intent);
                }
            }
        });


    }
}