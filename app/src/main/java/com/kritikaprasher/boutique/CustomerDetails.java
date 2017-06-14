package com.kritikaprasher.boutique;

import android.app.ProgressDialog;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class CustomerDetails extends AppCompatActivity implements View.OnClickListener{

    @InjectView(R.id.enterdetails)
    TextView details;

    @InjectView(R.id.Name)
    EditText name;

    @InjectView(R.id.Phone)
    EditText phone;

    @InjectView(R.id.Email)
    EditText email;

    @InjectView(R.id.Address)
    EditText address;

    @InjectView(R.id.city)
    EditText city;

    @InjectView(R.id.dateofbirth)
    EditText dob;

    @InjectView(R.id.husbandphone)
    EditText husbandphone;

    @InjectView(R.id.anniversarydate)
    EditText anniversarydate;


    @InjectView(R.id.Submit)
    Button Submit;

    CustomerBean cbean;
    CustomerBean bean1= new CustomerBean();
    RequestQueue requestQueue;
    ProgressDialog progressDialog;
    ConnectivityManager connectivityManager;
    NetworkInfo networkInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_details);
        ButterKnife.inject(this);
        Submit.setOnClickListener(this);
        cbean= new CustomerBean();

        progressDialog= new ProgressDialog(this);
        progressDialog.setMessage("Please Wait..");
        progressDialog.setCancelable(false);

        requestQueue= Volley.newRequestQueue(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btqSubmit) {

            cbean.setName(name.getText().toString().trim());
            cbean.setPhone(phone.getText().toString().trim());
            cbean.setEmail(email.getText().toString().trim());
            cbean.setAddress(address.getText().toString().trim());
            cbean.setCity(city.getText().toString().trim());
            cbean.setDob(dob.getText().toString().trim());
            cbean.setHusbandnumber(husbandphone.getText().toString().trim());
            cbean.setAnniversarydate(anniversarydate.getText().toString().trim());



//            if (isNetworkConnected())
            insertIntoCloud();

//            else
            Toast.makeText(this, "Please connect to internet", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Please correct input", Toast.LENGTH_SHORT).show();


        }
    }

    void clearFields() {
        name.setText("");
        phone.setText("");
        email.setText("");
        address.setText("");
        city.setText("");
        dob.setText("");
        husbandphone.setText("");
        anniversarydate.setText("");



    }

    public void insertIntoCloud() {

        String url = "";
        progressDialog.show();

        StringRequest request = new StringRequest(Request.Method.POST,
                Util.INSERT_CUSTOMER_PHP, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                progressDialog.dismiss();
                Toast.makeText(CustomerDetails.this, "Response:" +response, Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(BoutiqueOwner.this, MainActivity.class);
                //startActivity(intent);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.dismiss();
                Toast.makeText(CustomerDetails.this, "Some error"+error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String>map= new HashMap<>();

                map.put("name",cbean.getName());
                map.put("phone",cbean.getPhone());
                map.put("email",cbean.getEmail());
                map.put("address",cbean.getAddress());
                map.put("city",cbean.getCity());
                map.put("dob",cbean.getDob());




                return map;
            }
        };
        requestQueue.add(request);

        clearFields();
    }
//
//    boolean isNetworkConnected(){
//    connectivityManager= (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
//        networkInfo=connectivityManager.getActiveNetworkInfo();
//    }
}
