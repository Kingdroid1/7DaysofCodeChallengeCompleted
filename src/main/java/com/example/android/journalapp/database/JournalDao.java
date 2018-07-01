package com.example.android.journalapp.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;


import java.util.List;

@Dao
public interface JournalDao {

    @Query("SELECT * FROM notes")
    LiveData<List<DataEntry>> loadAllTasks();

    @Insert
    void insertTask(DataEntry taskEntry);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateTask(DataEntry taskEntry);

    @Delete
    void deleteTask(DataEntry taskEntry);

    @Query("SELECT * FROM notes WHERE id = :id")
    LiveData<DataEntry> loadTaskById(int id);



}
