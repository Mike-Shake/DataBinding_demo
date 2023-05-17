package com.example.databinding_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.databinding_demo.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //使用静态类
//        User user=new User("gao",21);
//        activityMainBinding.setUser(user);

        //使用Converter
//        activityMainBinding.setTime(new Date());


        //动态更新_bindale注释
//        Man_bindable man=new Man_bindable("hao","SSS");
//        activityMainBinding.setMan(man);
//        activityMainBinding.btUpdata.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                man.setName("buhao");
//            }
//        });

        //动态更新_observableField
//        Man_ObservableField man_observableField = new Man_ObservableField("hao", "7");
//        activityMainBinding.setMan(man_observableField);
//        activityMainBinding.btUpdata.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "dianji", Toast.LENGTH_SHORT).show();
//                man_observableField.name.set("hhh");
//            }
//        });

        //list的更新
//        ObservableArrayList<User> list=new ObservableArrayList<>();
//        User user1=new User("hh",21);
//        User user2=new User("hhh",19);
//        list.add(user1);
//        list.add(user2);
//        activityMainBinding.setList(list);
//
//        activityMainBinding.btUpdataBind.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "dianji", Toast.LENGTH_SHORT).show();
//                user1.setName("gao");
//                user2.setName("ma");
//                list.add(user1);
//            }
//        });


        //实现双向绑定
//        User user=new User("gao",21);
//        activityMainBinding.setUser(user);
//
//        activityMainBinding.btUpdata.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                user.setName("ma");
//            }
//        });

        List<Man_bindable> list=new ArrayList<>();
        for(int i=0;i<30;i++){
            Man_bindable man_bindable1=new Man_bindable("gao","SSS");
            Man_bindable man_bindable2=new Man_bindable("ma","SS");
            list.add(man_bindable1);
            list.add(man_bindable2);
        }

        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
        activityMainBinding.recycle.setLayoutManager(manager);
        Man_Adapter man_adapter=new Man_Adapter(list);
        activityMainBinding.recycle.setAdapter(man_adapter);

    }
}