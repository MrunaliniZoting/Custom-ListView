package com.mrunal.customlistdemo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    ArrayList<Student> studentList=new ArrayList<>();
    Context context;
    LayoutInflater lf;
    Holder holder;

    public MyAdapter(Context context, ArrayList<Student> studentList) {
        this.context=context;
        this.studentList=studentList;
        lf= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount()
    {
        return studentList.size();
    }

    @Override
    public Object getItem(int position)
    {
        return studentList.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView==null)
        {
            holder=new Holder();
            convertView=lf.inflate(R.layout.student_data,parent,false);
            holder.txtName=convertView.findViewById(R.id.txtName);
            holder.txtEmail=convertView.findViewById(R.id.txtEmail);
            holder.txtRoll=convertView.findViewById(R.id.txtRoll);
            holder.txtMob=convertView.findViewById(R.id.txtMob);

            convertView.setTag(holder);
        }
        else
        {
            holder= (Holder) convertView.getTag();
        }

        Student ob=studentList.get(position);
        holder.txtName.setText(ob.getName());
        holder.txtEmail.setText(ob.getEmail());
        holder.txtRoll.setText(""+ob.getRoll());
        holder.txtMob.setText(""+ob.getMb());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student ob=studentList.get(position);
                String name=ob.getName();
                String email=ob.getEmail();
                int roll=ob.getRoll();
                int mob=ob.getMb();

                Intent intent=new Intent(context,DataItems.class);
                intent.putExtra("Name",name);
                intent.putExtra("Email",email);
                intent.putExtra("Roll",roll);
                intent.putExtra("Mob",mob);
                v.getContext().startActivity(intent);



            }
        });


        return convertView;
    }

    private class Holder {
        TextView txtName,txtEmail,txtRoll,txtMob;

    }
}
