package com.example.android.journalapp.entrydetail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.android.journalapp.R;
import com.example.android.journalapp.database.DataEntry;
import com.example.android.journalapp.database.JournalDB;
import com.example.android.journalapp.newedit.NewEDitActivity;
import com.example.android.journalapp.util.AppExecutors;

public class EntryDetailActivity extends AppCompatActivity {
    public static String EXTRAT_REQUEST_EDIT = "NOTE_DETAIL";
    private JournalDB mJournalDB;

    private TextView mUpdateDate;
    private TextView mTitle;
    private TextView mDescription;
    private DataEntry mDataEntry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_detail);
        mDataEntry = getIntent().getParcelableExtra(EXTRAT_REQUEST_EDIT);
        mDescription = findViewById(R.id.tv_description);
        mTitle = findViewById(R.id.tv_title);
        mUpdateDate = findViewById(R.id.tv_date);
        mJournalDB = JournalDB.getInstance(this);
        populateUi();
    }

    private void populateUi() {
        if (mDataEntry == null){
            return;
        }
        mUpdateDate.setText(mDataEntry.getUpdatedAt());
        mTitle.setText(mDataEntry.getTitle());
        mDescription.setText(mDataEntry.getDescription());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_edit,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_edit){
            Intent intent = new Intent(this, NewEDitActivity.class);
           intent.putExtra(NewEDitActivity.EXTRA_EDIT_ENTTRY,mDataEntry);
            startActivityForResult(intent,NewEDitActivity.EXTRA_ADD_ENTTRY);

        }
        if (id == R.id.action_delete){
            if (mDataEntry == null){

            }else {
                AppExecutors.getInstance().diskIO().execute(new Runnable() {
                    @Override
                    public void run() {
                        mJournalDB.journalDao().deleteTask(mDataEntry);
                        finish();
                    }
                });
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
