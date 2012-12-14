package com.example.logistics_ui;

import java.util.HashMap;
import java.util.Map;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Logistics_list extends ListActivity {
	
	String[] logistics_list = {
            "��ͨ���",
            "��ͨ���",
            "Բͨ���",
            "˳����",
            "������",
            "��������",
            "EMS",
            "�Ѽ�����",
            "�ϴ����",
            "�°�����",
            "�°�����"
    };
	
    @Override  
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_logistics_list);
 
        setListAdapter(new ArrayAdapter<String>(this,
        	android.R.layout.simple_list_item_1, logistics_list));
    }    
 
    public void onListItemClick(ListView parent, View v,int position, long id) 
    {   
        Toast.makeText(this, 
            "You have selected " + logistics_list[position], 
            Toast.LENGTH_SHORT).show();
    } 

}