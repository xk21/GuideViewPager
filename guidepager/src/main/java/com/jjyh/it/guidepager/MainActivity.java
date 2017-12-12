package com.jjyh.it.guidepager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_INTENT_GUIDE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean guideData = getSharedPreferences(Constants.GUIDE_SP, Context.MODE_PRIVATE)
                .getBoolean(Constants.GUIDE_KEY, false);
        if (!guideData) {
            Intent intent = new Intent(this, GuidePagerActivity.class);
            startActivityForResult(intent, REQUEST_INTENT_GUIDE);
//            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        }else {
            Intent intent = new Intent(this, GuidePagerActivity.class);
            startActivityForResult(intent, REQUEST_INTENT_GUIDE);
//            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_INTENT_GUIDE) {
            if (resultCode == Activity.RESULT_OK) {
                Log.d("asdfas","asdfsaewadsf = 1");
            }else {
                finish();
            }
        }
    }
}
