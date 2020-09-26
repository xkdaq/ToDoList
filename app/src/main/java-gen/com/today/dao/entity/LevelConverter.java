package com.today.dao.entity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.greenrobot.greendao.converter.PropertyConverter;

import java.util.List;

public class LevelConverter implements PropertyConverter<List<TaskListEntity>, String> {
    @Override
    public List<TaskListEntity> convertToEntityProperty(String databaseValue) {
        if (databaseValue == null) {
            return null;
        }
        TypeToken<List<TaskListEntity>> typeToken = new TypeToken<List<TaskListEntity>>() {
        };
        return new Gson().fromJson(databaseValue, typeToken.getType());
    }

    @Override
    public String convertToDatabaseValue(List<TaskListEntity> arrays) {
        if (arrays == null || arrays.size() == 0) {
            return null;
        } else {
            String sb = new Gson().toJson(arrays);
            return sb;

        }
    }

}