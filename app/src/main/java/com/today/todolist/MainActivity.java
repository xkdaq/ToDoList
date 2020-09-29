package com.today.todolist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.today.dao.GreenDaoController;
import com.today.dao.entity.CheckListEntity;
import com.today.todolist.adapter.CheckAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<CheckListEntity> allCheckList1 = GreenDaoController.getInstance().getAllCheckList();

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CheckAdapter adapter = new CheckAdapter(allCheckList1);
        recyclerView.setAdapter(adapter);

    }
}