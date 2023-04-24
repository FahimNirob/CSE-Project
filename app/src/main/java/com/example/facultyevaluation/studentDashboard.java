package com.example.facultyevaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StudentDashboardActivity extends AppCompatActivity {
    private LinearLayout classList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_dashboard);

        classList = findViewById(R.id.class_list);

        FloatingActionButton addButton = findViewById(R.id.floating_action_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View classCard = getLayoutInflater().inflate(R.layout.class_card, null);
                classList.addView(classCard);
            }
        });
    }
}
