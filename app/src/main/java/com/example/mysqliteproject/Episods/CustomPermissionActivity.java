package com.example.mysqliteproject.Episods;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mysqliteproject.R;

public class CustomPermissionActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAskPr;
    TextView txtShow;

    public static final int REQUEST_CODE = 115;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_permission);
        setTitle(this.getClass().getSimpleName());
        init();
    }

    private void init() {
        btnAskPr = findViewById(R.id.btnAskPr);
        txtShow = findViewById(R.id.txtShow);

        btnAskPr.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (v == btnAskPr) {
            if (checkPermission()) {
                myAction();
            }
        }
    }

    private boolean checkPermission() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
            int result = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_SMS);
            if (result == PackageManager.PERMISSION_GRANTED) {
                return true;
            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_SMS}, REQUEST_CODE);
                return false;

            }
        }
        return true;
    }

    private void myAction() {
        txtShow.setText(getString(R.string.permissionGranted));
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        switch (requestCode) {
            case REQUEST_CODE: {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    myAction();
                } else {
                    txtShow.setText(getString(R.string.permissionDenied));
                }
                break;

            }
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        }

    }
}
