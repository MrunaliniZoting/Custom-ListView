package com.mrunal.customlistdemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lvList;
ArrayList<Student> studentList=new ArrayList<>();
Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvList=findViewById(R.id.lvList);

        getData();
        putdata();
    }

    private void putdata() {
        MyAdapter ad=new MyAdapter(context,studentList);
       lvList.setAdapter(ad);
    }

    private void getData() {
      Student ob=new Student();
      ob.setName("Mrunal");
      ob.setEmail("mrunalzoting777@gmail.com");
      ob.setRoll(01);
      ob.setMb(123455789);

      Student ob1=new Student();
        ob1.setName("Shubhangi");
        ob1.setEmail("bshubhangi84@gmail.com");
        ob1.setRoll(02);
        ob1.setMb(123455789);

        Student ob2=new Student();
        ob2.setName("Pankaj");
        ob2.setEmail("pankajqspl@gmail.com");
        ob2.setRoll(12);
        ob2.setMb(123455789);

        Student ob3=new Student();
        ob3.setName("Nilesh");
        ob3.setEmail("nileshnarwade03@gmail.com");
        ob3.setRoll(03);
        ob3.setMb(123455789);

        Student ob4=new Student();
        ob4.setName("Rehman");
        ob4.setEmail("rehmanp@gmail.com");
        ob4.setRoll(05);
        ob4.setMb(1256484465);

        Student ob5=new Student();
        ob5.setName("Dipali");
        ob5.setEmail("dipali@gmail.com");
        ob5.setRoll(8);
        ob5.setMb(123455789);


         studentList.add(ob);
         studentList.add(ob1);
         studentList.add(ob2);
         studentList.add(ob3);
         studentList.add(ob4);
         studentList.add(ob5);


    }
}
