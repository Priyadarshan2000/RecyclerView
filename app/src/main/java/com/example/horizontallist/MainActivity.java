package com.example.horizontallist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mList1,mList2;
    List<App> appList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList1 = findViewById(R.id.list1);
        mList2 = findViewById(R.id.list2);
        appList = new ArrayList<>();

        appList.add(new App(R.drawable.youtube,"Youtube",40));
        appList.add(new App(R.drawable.maxplayer,"Max Player",30));
        appList.add(new App(R.drawable.messenger,"Messenger",20));
        appList.add(new App(R.drawable.twitter,"Twitter",22));
        appList.add(new App(R.drawable.vlc,"VLC Player",40));
        appList.add(new App(R.drawable.whatsapp,"Whatsapp",34));

        LinearLayoutManager manager1 = new LinearLayoutManager(this);
        manager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        mList1.setLayoutManager(manager1);

        LinearLayoutManager manager2 = new LinearLayoutManager(this);
        manager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        mList2.setLayoutManager(manager2);

        CustomAdaptor adaptor1 = new CustomAdaptor(this,appList);
        mList1.setAdapter(adaptor1);

        CustomAdaptor adaptor2 = new CustomAdaptor(this,appList);
        mList2.setAdapter(adaptor2);
    }
}
