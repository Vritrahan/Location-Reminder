package app.com.example.android.locationreminder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayNote extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_note);
		Intent i=getIntent();
		TextView header=(TextView)findViewById(R.id.note_header);
		TextView det=(TextView)findViewById(R.id.note_details);
		String s=i.getStringExtra("note_head");
		String d=i.getStringExtra("note_details");
		header.setText(s);
		det.setText(d);
	}
}