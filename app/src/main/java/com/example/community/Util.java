package com.example.community;

import android.app.Activity;
import android.widget.Toast;

import com.google.firebase.firestore.core.ActivityScope;

public class Util {
    private Activity activity;

    public Util(Activity activity){
        this.activity = activity;
    }

    public void showToast(String msg){
            Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show();
    }
}
