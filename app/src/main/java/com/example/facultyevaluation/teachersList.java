package com.example.facultyevaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

public class teachersList extends AppCompatActivity {

    private ListView listView;
    private String[] teacherNames;
    private int[] images = {R.drawable.teacher_2, R.drawable.teacher_3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers_list);

        teacherNames = getResources().getStringArray(R.array.teachers_name);
        listView = findViewById(R.id.teachersList_ID);

        CustomAdapter customAdapter = new CustomAdapter(this, teacherNames,images);
        listView.setAdapter(customAdapter);

    }
}