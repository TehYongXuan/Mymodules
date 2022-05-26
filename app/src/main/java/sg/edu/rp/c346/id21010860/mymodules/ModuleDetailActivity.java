package sg.edu.rp.c346.id21010860.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    //step 1
    TextView textdisplay;
    TextView textdisplay1;
    TextView textdisplay2;
    TextView textdisplay3;
    TextView textdisplay4;
    TextView textdisplay5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        textdisplay = findViewById(R.id.textView);
        textdisplay1 = findViewById(R.id.textView2);
        textdisplay2 = findViewById(R.id.textView3);
        textdisplay3 = findViewById(R.id.textView4);
        textdisplay4 = findViewById(R.id.textView5);
        textdisplay5 = findViewById(R.id.textView6);


//        btnReturn = findViewById(R.id.Return);

        //step 2
        Intent intentReceived = getIntent();

        String code = intentReceived.getStringExtra("code");
        String name = intentReceived.getStringExtra("name");
        String year = intentReceived.getStringExtra("year");
        String sem = intentReceived.getStringExtra("sem");
        String credit = intentReceived.getStringExtra("credit");
        String venue = intentReceived.getStringExtra("venue");


        textdisplay.setText("Module code: " + code);
        textdisplay1.setText("Module name: " + name);
        textdisplay2.setText("Academic year: " + year);
        textdisplay3.setText("Semester : " + sem);
        textdisplay4.setText("Module credit: " + credit);
        textdisplay5.setText("Venue: " + venue);

}
}