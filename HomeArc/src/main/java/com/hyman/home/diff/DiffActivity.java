package com.hyman.home.diff;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hyman.home.R;

import java.util.ArrayList;
import java.util.List;

public class DiffActivity extends AppCompatActivity {

    private List<TestBean> mDatas = new ArrayList<>();
    private List<TestBean> originalData;
    private RecyclerView mRv;
    private DiffAdapter mAdapter;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diff);
        mRv = (RecyclerView) findViewById(R.id.rv);
        mRv.setLayoutManager(new WrapContentLinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mAdapter = new DiffAdapter(this, mDatas,true);
        mRv.setAdapter(mAdapter);
        initData();
    }

    private void initData() {
        originalData = new ArrayList<>();
        originalData.add(new TestBean("张旭童1", "Android", R.drawable.pic1));
        originalData.add(new TestBean("张旭童2", "Java", R.drawable.pic2));
        originalData.add(new TestBean("张旭童3", "背锅", R.drawable.pic3));
        originalData.add(new TestBean("张旭童4", "手撕产品", R.drawable.pic4));
        originalData.add(new TestBean("张旭童5", "手撕测试", R.drawable.pic5));
        //原始数据页必须是通过submitList方法设置进去的，否则会出现第一次刷新时 数据全部绑定一次
        mAdapter.submitList(originalData);
    }

    /**
     * 模拟刷新操作
     *
     * @param view
     */
    public void onRefresh(View view) {
        try {
            mNewDatas = new ArrayList<>();
            for (TestBean bean : mAdapter.getData()) {
                mNewDatas.add(bean.clone());//clone一遍旧数据 ，模拟刷新操作
            }
//            mNewDatas.add(new TestBean("赵子龙", "帅", R.drawable.pic6));//模拟新增数据
            count ++;
            mNewDatas.get(0).setDesc("Android+"+count);
            mNewDatas.get(0).setPic(R.drawable.pic7);//模拟修改数据
//            TestBean testBean = mNewDatas.get(1);//模拟数据位移
//            mNewDatas.remove(1);
//            mNewDatas.add(testBean);
            mAdapter.submitList(mNewDatas);


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private List<TestBean> mNewDatas;//增加一个变量暂存newList
}
