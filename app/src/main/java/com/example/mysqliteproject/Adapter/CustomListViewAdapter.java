package com.example.mysqliteproject.Adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import com.example.mysqliteproject.Objects.CustomListViewObject;

import java.util.List;

public class CustomListViewAdapter extends ArrayAdapter<CustomListViewObject> {
    public CustomListViewAdapter(@NonNull Context context, int resource, @NonNull List<CustomListViewObject> objects) {
        super(context, resource, objects);
    }
}
