package com.example.facultyevaluation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    int[] images;
    String[] teacherNames;
    Context context;
    private LayoutInflater inflater;


    CustomAdapter(Context context, String[] teacherNames, int[] images){
        this.context = context;
        this.teacherNames = teacherNames;
        this.images = images;

    }


    @Override
    public int getCount() {
        return teacherNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.sample_view_teachers_list, viewGroup, false);
        }

        ImageView imageView = view.findViewById(R.id.teachers_sample_Imageview_ID);
        TextView textView = view.findViewById(R.id.teachers_name_ID);

        imageView.setImageResource(images[i]);
        textView.setText(teacherNames[i]);

        return view;
    }
}
