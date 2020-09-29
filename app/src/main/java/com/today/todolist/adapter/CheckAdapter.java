package com.today.todolist.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.today.dao.entity.CheckListEntity;
import com.today.todolist.R;

import java.util.List;

public class CheckAdapter extends RecyclerView.Adapter<CheckAdapter.ViewHolder> {

    private List<CheckListEntity> mFruitList;

    public CheckAdapter(List<CheckListEntity> mFruitList) {
        this.mFruitList = mFruitList;
    }

    @NonNull
    @Override
    public CheckAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_checklist, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CheckAdapter.ViewHolder holder, int position) {
        CheckListEntity checkListEntity = mFruitList.get(position);
        holder.fruitName.setText(checkListEntity.getC_name());

    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView fruitName;

        public ViewHolder(View view) {
            super(view);
            fruitName = (TextView) view.findViewById(R.id.tv_cname);
        }

    }
}
