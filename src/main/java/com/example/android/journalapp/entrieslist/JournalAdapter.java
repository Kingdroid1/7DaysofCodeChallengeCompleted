package com.example.android.journalapp.entrieslist;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.journalapp.R;
import com.example.android.journalapp.database.DataEntry;
import com.example.android.journalapp.entrydetail.EntryDetailActivity;

import java.text.BreakIterator;
import java.text.SimpleDateFormat;

import java.util.List;
import java.util.Locale;

public class JournalAdapter extends RecyclerView.Adapter<JournalAdapter.ViewHolder> {
    private List<DataEntry> mEntryList;
    private Context mContext;

    public JournalAdapter(List<DataEntry> entryList,Context context) {
        mEntryList = entryList;
        mContext = context;
    }

    @NonNull
    @Override
    public JournalAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.note_list,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DataEntry dataEntry = mEntryList.get(position);
        holder.mDescription.setText(dataEntry.getDescription());
        holder.mTilte.setText(dataEntry.getTitle());
        holder.mDate.setText(dataEntry.getUpdatedAt());


    }

    @Override
    public int getItemCount() {
        return mEntryList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView mTilte;
        TextView mDescription;
        TextView mDate;
        LinearLayout mLinearLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            mTilte = itemView.findViewById(R.id.noteTitle);
            mDescription = itemView.findViewById(R.id.noteDescription);
            mDate = itemView.findViewById(R.id.noteUpdatedAt);
            mLinearLayout = itemView.findViewById(R.id.root_list);
            mLinearLayout.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            DataEntry dataEntry = mEntryList.get(getAdapterPosition());
            Intent intent = new Intent(mContext, EntryDetailActivity.class);
            intent.putExtra(EntryDetailActivity.EXTRAT_REQUEST_EDIT,dataEntry);
            mContext.startActivity(intent);



        }
    }
}
