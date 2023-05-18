package sg.edu.rp.c346.id22019799.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvAndroid,tvWebApplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAndroid=findViewById(R.id.textViewAndroid);
        tvWebApplication=findViewById(R.id.textViewWebApplication);

        //Android
        tvAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, AnswersActivity.class);
                intent.putExtra("ModuleCode","C346");
                intent.putExtra("ModuleName","Android Programming");
                intent.putExtra("AcademicYear","2020");
                intent.putExtra("Semester","1");
                intent.putExtra("ModuleCredit","4");
                intent.putExtra("Venue","W66M");
                startActivity(intent);

            }
        });

        tvWebApplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, AnswersActivity.class);
                intent.putExtra("ModuleCode","C203");
                intent.putExtra("ModuleName","Web Application Development in php");
                intent.putExtra("AcademicYear","2023");
                intent.putExtra("Semester","1");
                intent.putExtra("ModuleCredit","4");
                intent.putExtra("Venue","W65D");
                startActivity(intent);

            }
        });

    }
}