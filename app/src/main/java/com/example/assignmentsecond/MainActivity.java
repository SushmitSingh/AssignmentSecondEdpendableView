package com.example.assignmentsecond;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
        RecyclerView recyclerView;
        List<VerData> verDataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        initData();
        setRecyclerView();

    }

    private void initData() {
        verDataList = new ArrayList<>();
        verDataList.add(new VerData("Click Here For Expend 1","Exp Data Of One Expendable","Here Is sample data For expendable Layout In Recycler View"));
        verDataList.add(new VerData("Click Here For Expend 2","Exp Data Of Two Expendable","Here Is sample data For expendable Layout In Recycler View"));
        verDataList.add(new VerData("Click Here For Expend 3","Exp Data Of Three Expendable","Here Is sample data For expendable Layout In Recycler View"));
        verDataList.add(new VerData("Click Here For Expend 4","Exp Data Of Four Expendable","Here Is sample data For expendable Layout In Recycler View"));
        verDataList.add(new VerData("Click Here For Expend 5","Exp Data Of Five Expendable","Here Is sample data For expendable Layout In Recycler View"));
        verDataList.add(new VerData("Click Here For Expend 6","Exp Data Of Six Expendable","Here Is sample data For expendable Layout In Recycler View"));
        verDataList.add(new VerData("Click Here For Expend 7","Exp Data Of Six Expendable","Here Is sample data For expendable Layout In Recycler View"));
        verDataList.add(new VerData("Click Here For Expend 8","Exp Data Of Six Expendable","Here Is sample data For expendable Layout In Recycler View"));
    }

    private void setRecyclerView() {
        ExpdataAdapter expenDataAdapter = new ExpdataAdapter(verDataList);
         recyclerView.setAdapter(expenDataAdapter);
         recyclerView.setHasFixedSize(true);

    }
}