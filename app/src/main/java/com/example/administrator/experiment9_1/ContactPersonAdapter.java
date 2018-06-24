package com.example.administrator.experiment9_1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2018/6/11.
 */

public class ContactPersonAdapter extends ArrayAdapter <ContactPerson>{
    private int resourceId;
    public ContactPersonAdapter(Context context, int textViewResourceId, List<ContactPerson> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ContactPerson cp=getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView textView_name=(TextView) view.findViewById(R.id.textView_name);
        TextView textView_number=(TextView) view.findViewById(R.id.textView_number);
        textView_name.setText(cp.getName());
        textView_number.setText(cp.getNumber());
        return view;
    }
}
