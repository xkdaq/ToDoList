package com.today.todolist;

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
//        CheckListEntity checkListEntity1 = new CheckListEntity();
//        checkListEntity1.setC_name("想要吃的东西4");
//        CheckListEntity checkListEntity2 = new CheckListEntity();
//        checkListEntity2.setC_name("想要去的地方5");
//        CheckListEntity checkListEntity3 = new CheckListEntity();
//        checkListEntity3.setC_name("想要看的电影6");
//
//        GreenDaoController.getInstance().insert(checkListEntity1);
//        GreenDaoController.getInstance().insert(checkListEntity2);
//        GreenDaoController.getInstance().insert(checkListEntity3);


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
