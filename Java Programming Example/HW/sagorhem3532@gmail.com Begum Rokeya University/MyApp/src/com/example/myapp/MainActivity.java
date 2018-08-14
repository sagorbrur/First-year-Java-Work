package com.example.myapp;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	Button about;
	Button department;
	Button campus;
	Button admission;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	Button	about=(Button)findViewById(R.id.about);
	Button department=(Button)findViewById(R.id.Departments);
	Button campus=(Button)findViewById(R.id.campus);
	Button admission=(Button)findViewById(R.id.admission);
	
	
	}
	public void showAbout(View view){
		Intent intent=new Intent(this,About.class);
		startActivity(intent);
	}
	
	public void showDepartment(View view){
		Intent intent=new Intent(this,Department.class);
		startActivity(intent);
	}
	public void showCampus(View view){
		Intent intent=new Intent(this,Campus.class);
		startActivity(intent);
	}
	public void showAdmission(View view){
		Intent intent=new Intent(this,Admission.class);
		startActivity(intent);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    // Inflate the menu items for use in the action bar
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.main, menu);
	    return super.onCreateOptionsMenu(menu);
	}
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Take appropriate action for each action item click
        switch (item.getItemId()) {
       /* case R.id.action_search:
            // search action
            return true;*/
        case R.id.help:
            // help action
        	Toast.makeText(getApplicationContext(), "Just Click Button in the screen\nand read details about BRUR", Toast.LENGTH_LONG).show();
            return true;
        case R.id.about:
        	Toast.makeText(getApplicationContext(), "Begum Rokeya University\nVersion:1.0\nDeveloper:Sagor Sarker", Toast.LENGTH_LONG).show();
        	return true;
        case R.id.bexitMenuExit:
        	System.exit(0);
        default:
            return super.onOptionsItemSelected(item);
        }
    }
	
	
	
}
