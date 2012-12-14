package com.example.logistics_ui;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Resources ressources = getResources(); 
		TabHost tabHost = getTabHost(); 
 
		// Logistics List tab
		Intent intentParcel_list = new Intent().setClass(this, Parcel_list.class);
		TabSpec tabSpecParcel_list = tabHost
		  .newTabSpec("�ҵĿ��")
		  .setIndicator("�ҵĿ��", null)
		  .setContent(intentParcel_list);
 
		// Send Parcel tab
		Intent intentSendParcel = new Intent().setClass(this, Send_parcel.class);
		TabSpec tabSpecSendParcel = tabHost
		  .newTabSpec("�Ŀ��")
		  .setIndicator("�Ŀ��", null)
		  .setContent(intentSendParcel);
 
		// Bill Search tab
		Intent intentBillSearch = new Intent().setClass(this, Bill_search.class);
		TabSpec tabSpecBillSearch = tabHost
		  .newTabSpec("��ݵ���ѯ")
		  .setIndicator("��ݵ���ѯ", null)
		  .setContent(intentBillSearch);
 
		// add all tabs 
		tabHost.addTab(tabSpecBillSearch);
		tabHost.addTab(tabSpecParcel_list);
		tabHost.addTab(tabSpecSendParcel);
 
		//set Parcel List tab as default (zero based)
		tabHost.setCurrentTab(0);	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
