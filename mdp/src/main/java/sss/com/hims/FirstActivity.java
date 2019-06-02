package sss.com.hims;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import  sss.com.hims.R;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    /** Called when the user taps the Send button */
    public void navigateToSettings(View view) {
        Intent settings = new Intent(this,SettingActivity.class);
        startActivity(settings);
    }

    public void navigateToWebView(View view) {
        Intent settings = new Intent(this,WebActivity.class);
        startActivity(settings);
    }



}
