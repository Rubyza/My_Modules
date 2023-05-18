package sg.edu.rp.c346.id22019799.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswersActivity extends AppCompatActivity {

    TextView tvModuleCode,tvModuleName,tvAcademicYear,tvSemester,tvModuleCredit,tvVenue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);

        tvModuleCode=findViewById(R.id.textModuleCode);
        tvModuleName=findViewById(R.id.textModuleName);
        tvAcademicYear=findViewById(R.id.textAcademicYear);
        tvSemester=findViewById(R.id.textSemester);
        tvModuleCredit=findViewById(R.id.textModuleCredit);
        tvVenue=findViewById(R.id.textVenue);


        Intent intentReceived=getIntent();
        String modulecode = intentReceived.getStringExtra("ModuleCode");
        String modulename = intentReceived.getStringExtra("ModuleName");
        String academicyear = intentReceived.getStringExtra("AcademicYear");
        String semester = intentReceived.getStringExtra("Semester");
        String modulecredit = intentReceived.getStringExtra("ModuleCredit");
        String venue = intentReceived.getStringExtra("Venue");

        tvModuleCode.setText("Module Code: "+modulecode);
        tvModuleName.setText("Module Name: "+modulename);
        tvAcademicYear.setText("Academic Year: "+academicyear);
        tvSemester.setText("Semester: "+semester);
        tvModuleCredit.setText("Module Credit: "+modulecredit);
        tvVenue.setText("Venue: "+venue);

    }
}