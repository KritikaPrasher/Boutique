package com.kritikaprasher.boutique;

import android.app.ProgressDialog;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

public class BoutiqueOwner extends AppCompatActivity implements View.OnClickListener{
    @InjectView(R.id.enterbtqdetails)
    TextView details;

    @InjectView(R.id.btqName)
    EditText nameb;

    @InjectView(R.id.btqPhone)
    EditText phoneb;

    @InjectView(R.id.btqEmail)
    EditText emailb;

    @InjectView(R.id.btqAddress)
    EditText addressb;

    @InjectView(R.id.btqcity)
    EditText cityb;

    @InjectView(R.id.btqdateofbirth)
    EditText dobb;


    @InjectView(R.id.btqSubmit)
    Button Submitb;

    BoutiqueBean bBean;
    BoutiqueBean bean= new BoutiqueBean();
    RequestQueue requestQueue;
    ProgressDialog progressDialog;
    ConnectivityManager connectivityManager;
    NetworkInfo networkInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boutique_owner);
        ButterKnife.inject(this);
        Submitb.setOnClickListener(this);
        bBean= new BoutiqueBean();

        progressDialog= new ProgressDialog(this);
        progressDialog.setMessage("Please Wait..");
        progressDialog.setCancelable(false);

        requestQueue= Volley.newRequestQueue(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btqSubmit) {

            bean.setNameb(nameb.getText().toString().trim());
            bean.setPhoneb(phoneb.getText().toString().trim());
            bean.setEmailb(emailb.getText().toString().trim());
            bean.setAddressb(addressb.getText().toString().trim());
            bean.setCityb(cityb.getText().toString().trim());
            bean.setDobb(dobb.getText().toString().trim());


//            if (isNetworkConnected())
                insertIntoCloud();

//            else
                Toast.makeText(this, "Please connect to internet", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Please correct input", Toast.LENGTH_SHORT).show();


        }
    }

//    boolean isNetworkConnected() {
//        connectivityManager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
//        networkInfo = connectivityManager.getActiveNetworkInfo();
//
//        return (networkInfo != null && networkInfo.isConnected());
//
//    }

    void clearFields() {
        nameb.setText("");
       phoneb.setText("");
        emailb.setText("");
        addressb.setText("");
        cityb.setText("");
        dobb.setText("");




    }

    public void insertIntoCloud() {

       // String url = "";
        progressDialog.show();

        StringRequest request = new StringRequest(Request.Method.POST,
                UtilBtq.INSERT_BOUTIQUE_PHP, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                progressDialog.dismiss();
                Toast.makeText(BoutiqueOwner.this, "Response:" +response, Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(BoutiqueOwner.this, MainActivity.class);
                //startActivity(intent);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.dismiss();
                Toast.makeText(BoutiqueOwner.this, "Some error"+error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

            Map<String, String>map= new HashMap<>();


                map.put("nameb",bean.getNameb());
                map.put("phoneb",bean.getPhoneb());
                map.put("emailb",bean.getEmailb());
                map.put("addressb",bean.getAddressb());
                map.put("cityb",bean.getCityb());
                map.put("dobb",bean.getDobb());





                return map;
            }
        };
        requestQueue.add(request);

    }
//
//    boolean isNetworkConnected(){
//    connectivityManager= (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
//        networkInfo=connectivityManager.getActiveNetworkInfo();
//    }
}

