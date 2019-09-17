package com.example.mysqliteproject.app;

import android.net.VpnService;
import android.util.Log;
import android.widget.Toast;

public class app {

    public static class main {
        public static final String TAG = "Season 5";


    }

    public static void log(String msg) {
        Log.e(main.TAG, msg);
    }

    public static void toast(String msg) {

        Toast.makeText(Application.getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
