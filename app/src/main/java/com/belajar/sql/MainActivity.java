package com.belajar.sql;

import java.sql.Connection;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView textView = (TextView)findViewById(R.id.TextView01);
		textView.setText("Start");

		Connection con= new JDBC().connect();
		if(con!=null){
			textView.setText("Sukses");
		}
		else {
			textView.setText("Gagal");
		}

    }
}