package com.today.dao;

import android.database.sqlite.SQLiteDatabase;

import com.today.dao.entity.CheckListEntity;
import com.today.dao.gen.CheckListEntityDao;
import com.today.dao.gen.DaoMaster;
import com.today.dao.gen.DaoSession;
import com.today.todolist.MyApplication;

import java.util.List;

public class GreenDaoController {

    private MySQLiteOpenHelper mHelper;
    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;

    private CheckListEntityDao checkListEntityDao;

    private static GreenDaoController mDbController;

    public static GreenDaoController getInstance() {
        if (mDbController == null) {
            synchronized (GreenDaoController.class) {
                if (mDbController == null) {
                    mDbController = new GreenDaoController();
                }
            }
        }
        return mDbController;
    }


    public GreenDaoController() {
        mHelper = new MySQLiteOpenHelper(MyApplication.getAppContext(), "todolist.db", null);
        mDaoMaster = new DaoMaster(getWritableDatabase());
        mDaoSession = mDaoMaster.newSession();

        checkListEntityDao = mDaoSession.getCheckListEntityDao();
    }


    private SQLiteDatabase getWritableDatabase() {
        if (mHelper == null) {
            mHelper = new MySQLiteOpenHelper(MyApplication.getAppContext(), "todolist.db", null);
        }
        SQLiteDatabase db = mHelper.getWritableDatabase();
        return db;
    }


    /**
     * 新增清单
     */
    public long insertCheck(CheckListEntity checkListEntity) {
        return checkListEntityDao.insert(checkListEntity);
    }

    /**
     * 删除
     */
    public void deleteCheck(long id) {
        checkListEntityDao.deleteByKey(id);
    }

    /**
     * 查询
     */
    public List<CheckListEntity> getAllCheckList() {
        return checkListEntityDao.queryBuilder().list();
    }

    /**
     * 查询单个
     * */
    public CheckListEntity getOneCheckList(int id) {
        List<CheckListEntity> list = checkListEntityDao.queryBuilder().where(CheckListEntityDao.Properties.Id.eq(id)).list();
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    /**
     * 修改
     */
    public void updateCheckList(CheckListEntity checkListEntity) {
        checkListEntityDao.update(checkListEntity);
    }


}
