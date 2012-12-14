package com.example.logistics_ui;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Send_parcel extends ListActivity {

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
        setContentView(R.layout.activity_send_parcel);
 
        setListAdapter(new ArrayAdapter<String>(this,
        	android.R.layout.simple_list_item_1, logistics_list));
    }    
 
    public void onListItemClick(ListView parent, View v,int position, long id) 
    {   
        	Toast.makeText(this, 
            "�绰��ϵ " + logistics_list[position] + " ����ȡ����", 
            Toast.LENGTH_SHORT).show();
        	
        	String num = "13437292435";
        	
        	// ���ò��ż���
        	Intent intent=new Intent("android.intent.action.CALL",Uri.parse("tel:" + num));
			startActivity(intent);
    } 

}
