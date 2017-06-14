package com.kritikaprasher.boutique;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.InjectView;

public class EmployeeDetails extends AppCompatActivity {

    @InjectView(R.id.enterempdetails)
    TextView details;

    @InjectView(R.id.empName)
    EditText name;

    @InjectView(R.id.empPhone)
    EditText phone;

    @InjectView(R.id.empEmail)
    EditText email;

    @InjectView(R.id.empAddress)
    EditText address;

    @InjectView(R.id.empcity)
    EditText city;

    @InjectView(R.id.empdateofbirth)
    EditText dob;




    @InjectView(R.id.empSubmit)
    Button Submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_details);
    }
}
