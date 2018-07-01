package com.example.android.journalapp.entrieslist;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;
import android.util.Log;

import com.example.android.journalapp.database.DataEntry;
import com.example.android.journalapp.database.JournalDB;

import java.util.List;

public class MainViewModel extends AndroidViewModel {

    // Constant for logging
    private static final String TAG = MainViewModel.class.getSimpleName();

    private LiveData<List<DataEntry>> notes;

    public MainViewModel(@NonNull Application application) {
        super ( application );

        JournalDB database = JournalDB.getInstance ( this.getApplication () );
        Log.d(TAG, "Actively retrieving the note entries from the DataBase");
        notes = database.journalDao ().loadAllTasks();
    }

    public LiveData<List<DataEntry>> getTasks() {
        return notes;
    }

}
