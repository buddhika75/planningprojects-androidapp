package sss.com.hims;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import  sss.com.hims.R;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_settings);

        TextView username = (TextView) this.findViewById(R.id.txtUsername);
        TextView password = (TextView) this.findViewById(R.id.txtPassword);
        TextView url = (TextView) this.findViewById(R.id.txtUrl);


        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        String us = pref.getString("username","");
        username.setText(us);
        String pw = pref.getString("password","");
        password.setText(pw);
        String urlString = pref.getString("url","http://weblk.info:7070/planningprojects");
        url.setText(urlString);
    }

    public void navigateToHome(View view) {
        TextView username = (TextView) this.findViewById(R.id.txtUsername);
        TextView password = (TextView) this.findViewById(R.id.txtPassword);
        TextView url = (TextView) this.findViewById(R.id.txtUrl);


        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("username", username.getText().toString());
        editor.putString("password", password.getText().toString());
        editor.putString("url", url.getText().toString());


        editor.commit();

        Intent settings = new Intent(this,FirstActivity.class);
        startActivity(settings);
    }

}
