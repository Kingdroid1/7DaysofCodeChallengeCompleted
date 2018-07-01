package com.example.android.journalapp.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Entity(tableName = "notes")
public class DataEntry implements Parcelable{

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String description;
    private String updatedAt;

    static DateFormat df = new SimpleDateFormat("dd/MMM/yyyy");


    public DataEntry(){}

    @Ignore
    public DataEntry(String title, String description) {
        //use to create
        this.title = title;
        this.description = description;
        updatedAt =df.format(Calendar.getInstance().getTime());
    }
    @Ignore
    public DataEntry(int id, String title, String description) {
        //use to update
        this.id = id;
        this.title = title;
        this.description = description;
        this.updatedAt = df.format(Calendar.getInstance().getTime());
    }

    protected DataEntry(Parcel in) {
        id = in.readInt();
        title = in.readString();
        description = in.readString();
        updatedAt = in.readString();
    }

    public static final Creator<DataEntry> CREATOR = new Creator<DataEntry>() {
        @Override
        public DataEntry createFromParcel(Parcel in) {
            return new DataEntry(in);
        }

        @Override
        public DataEntry[] newArray(int size) {
            return new DataEntry[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeInt(id);
        parcel.writeString(title);
        parcel.writeString(description);
        parcel.writeString(updatedAt);
    }
}
