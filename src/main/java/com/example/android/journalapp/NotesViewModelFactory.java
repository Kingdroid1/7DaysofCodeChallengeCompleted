package com.example.android.journalapp;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.example.android.journalapp.database.JournalDB;

public class NotesViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private final JournalDB mDb;
    private final int mNoteId;

    public NotesViewModelFactory(JournalDB mDb, int noteId) {
        this.mDb = mDb;
        mNoteId = noteId;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        //noinspection unchecked
        return (T) new NotesViewModel(mDb, mNoteId);
    }
}
