package it.jaschke.alexandria;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class AddBookActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addbook);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
