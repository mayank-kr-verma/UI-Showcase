package makx.nitp.uishowcase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent navIntent = new Intent(MainActivity.this, NavActivity.class);
        startActivity(navIntent);
        setContentView(R.layout.activity_main);
    }
}
