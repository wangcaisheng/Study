package com.hyman.home.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hyman.home.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author: Hyman
 * time: 2020/12/7 下午7:26
 * des:
 */
public class CustomViewActivity extends AppCompatActivity {

    @BindView(R.id.recycle_view)
    RecyclerView recycleView;

    public static void open(HomeActivity homeActivity) {
        homeActivity.startActivity(new Intent(homeActivity, CustomViewActivity.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        ButterKnife.bind(this);
        initRecycleView();
    }

    private void initRecycleView() {
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,5);
        recycleView.setLayoutManager(gridLayoutManager);

        RecAdapter recAdapter=new RecAdapter();
        recycleView.setAdapter(recAdapter);
    }

    private class RecAdapter extends RecyclerView.Adapter{
        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view=View.inflate(parent.getContext(),R.layout.item,null);
            return new Holder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            ( (Holder)holder).tv.setText("新浪微博"+position);

        }

        @Override
        public int getItemCount() {
            return 8;
        }

        class Holder extends RecyclerView.ViewHolder{
            private TextView tv;

            public Holder(@NonNull View itemView) {
                super(itemView);
                tv=itemView.findViewById(R.id.tv);
            }
        }
    }
}
