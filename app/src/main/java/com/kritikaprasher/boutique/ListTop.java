package com.kritikaprasher.boutique;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.InjectView;

public class ListTop extends AppCompatActivity {

    ListView listtop1;

    @InjectView(R.id.listtop)
    ListView listtop;

    //ArrayList<String>toplist;
    //toplist = new ArrayList<>();
    //toplist.add("Anarkali suit");
    //toplist.add("Masakali suit");
    ////toplist.add("A-line suit");
    //toplist.add("");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_top);
    }
}
