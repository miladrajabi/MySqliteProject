package com.example.mysqliteproject.Episods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.mysqliteproject.R;

public class CustomListViewActivity extends AppCompatActivity {

    ListView clvLstView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        setTitle(this.getClass().getSimpleName());
        init();
    }

    private void init() {
        clvLstView = findViewById(R.id.clvLstView);
    }
}
