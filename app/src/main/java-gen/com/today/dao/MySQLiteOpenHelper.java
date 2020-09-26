package com.today.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.today.dao.gen.CheckListEntityDao;
import com.today.dao.gen.DaoMaster;
import com.today.dao.gen.TaskListEntityDao;

import org.greenrobot.greendao.database.Database;

public class MySQLiteOpenHelper extends DaoMaster.OpenHelper {

    public MySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        if (oldVersion < newVersion) {
            MigrationHelper.getInstance().migrate(db, CheckListEntityDao.class);
            MigrationHelper.getInstance().migrate(db, TaskListEntityDao.class);
        }
    }

}
