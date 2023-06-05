package com.example.facultyevaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.slider.Slider;

public class courseFeedbackQuestionnaire extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_feedback_questionnaire);

        //SeekBar performanceSlider = findViewById(R.id.performance_slider);
        Slider performanceSlider = findViewById(R.id.performance_slider_1);



    }
}