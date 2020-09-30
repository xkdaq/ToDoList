package com.today.todolist.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.today.dao.GreenDaoController;
import com.today.dao.entity.CheckListEntity;
import com.today.todolist.R;

import java.util.List;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        List<CheckListEntity> allCheckList1 = GreenDaoController.getInstance().getAllCheckList();
        if (allCheckList1 != null && allCheckList1.size() == 0) {
            CheckListEntity checkListEntity1 = new CheckListEntity();
            checkListEntity1.setC_name("想要吃的东西");
            CheckListEntity checkListEntity2 = new CheckListEntity();
            checkListEntity2.setC_name("想要去的地方");
            CheckListEntity checkListEntity3 = new CheckListEntity();
            checkListEntity3.setC_name("想要看的电影");

            GreenDaoController.getInstance().insertCheck(checkListEntity1);
            GreenDaoController.getInstance().insertCheck(checkListEntity2);
            GreenDaoController.getInstance().insertCheck(checkListEntity3);
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LaunchActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
