package com.example.android.journalapp;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.journalapp.database.DataEntry;
import com.example.android.journalapp.database.JournalDB;

public class NotesViewModel extends ViewModel {
    private LiveData<DataEntry> note;

    public NotesViewModel(JournalDB database, int noteId) {
        note = database.journalDao ().loadTaskById(noteId);
    }


    public LiveData<DataEntry> getTask() {
        return note;
    }
}
