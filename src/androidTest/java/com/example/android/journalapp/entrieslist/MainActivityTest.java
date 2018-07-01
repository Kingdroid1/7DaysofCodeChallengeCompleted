package com.example.android.journalapp.entrieslist;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;

import com.example.android.journalapp.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule <MainActivity> (MainActivity.class  );

    private MainActivity mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity ();
    }

    @Test
    public void testLaunch(){
        RecyclerView recyclerView = mActivity.findViewById ( R.id.recycler_view );
        assertNotNull ( recyclerView );
    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }
}