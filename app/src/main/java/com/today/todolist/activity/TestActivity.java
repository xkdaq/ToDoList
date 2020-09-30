package com.today.todolist.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.today.dao.GreenDaoController;
import com.today.dao.entity.CheckListEntity;
import com.today.todolist.util.XLog;

import java.util.List;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        // GreenDaoController.getInstance().deleteCheck(8);
        List<CheckListEntity> allCheckList1 = GreenDaoController.getInstance().getAllCheckList();
        XLog.e(allCheckList1.toString());
        CheckListEntity oneCheckList = GreenDaoController.getInstance().getOneCheckList(7);
        oneCheckList.setC_name("想要去的地方6");
        GreenDaoController.getInstance().updateCheckList(oneCheckList);
        List<CheckListEntity> allCheckList2 = GreenDaoController.getInstance().getAllCheckList();
        XLog.e(allCheckList2.toString());
    }
}
