package com.example.android.journalapp.entrieslist;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.android.journalapp.R;
import com.example.android.journalapp.login.LoginActivity;
import com.example.android.journalapp.newedit.NewEDitActivity;
import com.example.android.journalapp.database.DataEntry;
import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

import java.util.List;

import static android.support.v7.widget.DividerItemDecoration.VERTICAL;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName ();


    private RecyclerView mRecyclerView;
    private JournalAdapter mAdapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view);
        adapterInit();


        FloatingActionButton fabButton = findViewById(R.id.fab);

        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to start an new_edit_activity
                Intent addTaskIntent = new Intent(MainActivity.this, NewEDitActivity.class);
                startActivityForResult(addTaskIntent,NewEDitActivity.EXTRA_ADD_ENTTRY );
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId ()) {
            case R.id.sign_out_menu:
                //sign out
                FirebaseAuth.getInstance().signOut();
                // user is now signed out
                startActivity ( new Intent ( MainActivity.this, LoginActivity.class ) );
                finish ();

        }
        return true;
    }



    public void adapterInit(){
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        DividerItemDecoration decoration = new DividerItemDecoration(getApplicationContext(), VERTICAL);
        mRecyclerView.addItemDecoration(decoration);

        MainViewModel viewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        viewModel.getTasks().observe(this, new Observer<List<DataEntry>>() {
            @Override
            public void onChanged(@Nullable List<DataEntry> dataEntries) {
                mAdapter = new JournalAdapter(dataEntries,getApplicationContext());
                mRecyclerView.setAdapter(mAdapter);
            }
        });

    }




}
