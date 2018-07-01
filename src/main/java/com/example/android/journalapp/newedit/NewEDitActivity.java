package com.example.android.journalapp.newedit;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.journalapp.R;
import com.example.android.journalapp.database.DataEntry;
import com.example.android.journalapp.database.JournalDB;
import com.example.android.journalapp.util.AppExecutors;

import java.util.Date;

public class NewEDitActivity extends AppCompatActivity{
   public static String EXTRA_EDIT_ENTTRY ="edit_note";
   public static int EXTRA_ADD_ENTTRY =5;

    private  DataEntry dataEntry;

    EditText mEditTextTitle;
    EditText mEditEntryDescription;
    Button mButton;

    private JournalDB mDB;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.new_edit_activity);
        initViews();

       dataEntry = getIntent().getParcelableExtra(EXTRA_EDIT_ENTTRY );
       mDB = JournalDB.getInstance(getApplicationContext());

        mButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                createOrUpdateNote();
                }
        });
        populateUI();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    private void initViews() {
        mEditTextTitle = findViewById(R.id.edit_title);
        mEditEntryDescription = findViewById(R.id.edit_content);

        mButton = findViewById(R.id.update_button);

    }


    public void populateUI() {
        if (dataEntry == null) {
            return;
        }

        mEditTextTitle.setText ( dataEntry.getTitle () );
        mEditEntryDescription.setText(dataEntry.getDescription());
        mButton.setText ( "Update" );

    }



    public void createOrUpdateNote(){
      final  String  title = mEditTextTitle.getText().toString();
        final String description = mEditEntryDescription.getText().toString();

        if (dataEntry == null){
            //create new note
            AppExecutors.getInstance().diskIO().execute(new Runnable() {
                @Override
                public void run() {
                    mDB.journalDao().insertTask(new DataEntry(title,description));
                    setResult(Activity.RESULT_OK);
                    finish();
                }
            });

        }else {
            //update note
            AppExecutors.getInstance().diskIO().execute(
                    new Runnable() {
                        @Override
                        public void run() {
                            mDB.journalDao().updateTask(new DataEntry(dataEntry.getId(),title,description));
                        }
                    }
            );
            setResult(Activity.RESULT_OK);
            finish();
        }
    }



}
