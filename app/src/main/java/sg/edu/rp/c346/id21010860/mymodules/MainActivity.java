package sg.edu.rp.c346.id21010860.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //step 1

    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step2

        text2 = findViewById(R.id.textdisplay2);
        text3 = findViewById(R.id.textdisplay3);
        text4 = findViewById(R.id.textdisplay4);
        text5 = findViewById(R.id.textdisplay5);
        text6 = findViewById(R.id.textdisplay6);


        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent1.putExtra("code", "C203");
                intent1.putExtra("name", "Web Application Development in php");
                intent1.putExtra("year", "2022");
                intent1.putExtra("sem", "1");
                intent1.putExtra("credit", "4");
                intent1.putExtra("venue", "W65H");
                startActivity(intent1);

            }
        });
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent2.putExtra("code", "C206");
                intent2.putExtra("name", "Software Development Process");
                intent2.putExtra("year", "2022");
                intent2.putExtra("sem", "1");
                intent2.putExtra("credit", "4");
                intent2.putExtra("venue", "E66K");
                startActivity(intent2);

            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent3.putExtra("code", "C218");
                intent3.putExtra("name", "UI/UX Design for Apps");
                intent3.putExtra("year", "2022");
                intent3.putExtra("sem", "1");
                intent3.putExtra("credit", "4");
                intent3.putExtra("venue", "E66B");
                startActivity(intent3);

            }
        });

        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent4.putExtra("code", "C235");
                intent4.putExtra("name", "IT Security and Management");
                intent4.putExtra("year", "2022");
                intent4.putExtra("sem", "1");
                intent4.putExtra("credit", "4");
                intent4.putExtra("venue", "E65H");
                startActivity(intent4);

            }
        });

        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Mobile App Development");
                intent.putExtra("year", "2022");
                intent.putExtra("sem", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "E62E");
                startActivity(intent);

            }
        });











    }
}