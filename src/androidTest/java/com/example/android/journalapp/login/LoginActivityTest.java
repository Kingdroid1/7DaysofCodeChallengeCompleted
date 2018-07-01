package com.example.android.journalapp.login;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import com.example.android.journalapp.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

    @Rule
    public ActivityTestRule <LoginActivity> mActivityTestRule = new ActivityTestRule <> ( LoginActivity.class );

    @Test
    public void loginActivityTest() {
        ViewInteraction appCompatButton = onView (
                allOf ( withId ( R.id.btn_login ), withText ( "Sign in with Google" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                3 ),
                        isDisplayed () ) );
        appCompatButton.perform ( click () );

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep ( 3598310 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

        ViewInteraction floatingActionButton = onView (
                allOf ( withId ( R.id.fab ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                1 ),
                        isDisplayed () ) );
        floatingActionButton.perform ( click () );

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep ( 3575408 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

        ViewInteraction appCompatEditText = onView (
                allOf ( withId ( R.id.edit_title ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText.perform ( click () );

        ViewInteraction appCompatEditText2 = onView (
                allOf ( withId ( R.id.edit_title ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText2.perform ( replaceText ( "" ), closeSoftKeyboard () );

        ViewInteraction appCompatEditText3 = onView (
                allOf ( withId ( R.id.edit_title ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText3.perform ( click () );

        ViewInteraction appCompatEditText4 = onView (
                allOf ( withId ( R.id.edit_title ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText4.perform ( replaceText ( "Expresso" ), closeSoftKeyboard () );

        ViewInteraction appCompatEditText5 = onView (
                allOf ( withId ( R.id.edit_title ), withText ( "Expresso" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText5.perform ( click () );

        ViewInteraction appCompatEditText6 = onView (
                allOf ( withId ( R.id.edit_title ), withText ( "Expresso" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText6.perform ( replaceText ( "Expressoo" ) );

        ViewInteraction appCompatEditText7 = onView (
                allOf ( withId ( R.id.edit_title ), withText ( "Expressoo" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText7.perform ( closeSoftKeyboard () );

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep ( 3537573 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

        ViewInteraction appCompatEditText8 = onView (
                allOf ( withId ( R.id.edit_title ), withText ( "Expressoo" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText8.perform ( click () );

        ViewInteraction appCompatEditText9 = onView (
                allOf ( withId ( R.id.edit_title ), withText ( "Expressoo" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText9.perform ( replaceText ( "Expresso Testing" ) );

        ViewInteraction appCompatEditText10 = onView (
                allOf ( withId ( R.id.edit_title ), withText ( "Expresso Testing" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText10.perform ( closeSoftKeyboard () );

        ViewInteraction appCompatEditText11 = onView (
                allOf ( withId ( R.id.edit_content ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                1 ),
                        isDisplayed () ) );
        appCompatEditText11.perform ( click () );

        ViewInteraction appCompatEditText12 = onView (
                allOf ( withId ( R.id.edit_content ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                1 ),
                        isDisplayed () ) );
        appCompatEditText12.perform ( replaceText ( "so glad this is working" ), closeSoftKeyboard () );

        ViewInteraction appCompatButton2 = onView (
                allOf ( withId ( R.id.update_button ), withText ( "Save" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                2 ),
                        isDisplayed () ) );
        appCompatButton2.perform ( click () );

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep ( 3338405 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

        ViewInteraction recyclerView = onView (
                allOf ( withId ( R.id.recycler_view ),
                        childAtPosition (
                                withClassName ( is ( "android.widget.FrameLayout" ) ),
                                0 ) ) );
        recyclerView.perform ( actionOnItemAtPosition ( 0, click () ) );

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep ( 3585401 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

        ViewInteraction actionMenuItemView = onView (
                allOf ( withId ( R.id.action_edit ), withContentDescription ( "Edit" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( R.id.action_bar ),
                                        1 ),
                                0 ),
                        isDisplayed () ) );
        actionMenuItemView.perform ( click () );

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep ( 3589240 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

        ViewInteraction appCompatEditText13 = onView (
                allOf ( withId ( R.id.edit_title ), withText ( "Expresso Testing" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText13.perform ( click () );

        ViewInteraction appCompatEditText14 = onView (
                allOf ( withId ( R.id.edit_title ), withText ( "Expresso Testing" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText14.perform ( replaceText ( "Expresso Testing 101" ) );

        ViewInteraction appCompatEditText15 = onView (
                allOf ( withId ( R.id.edit_title ), withText ( "Expresso Testing 101" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText15.perform ( closeSoftKeyboard () );

        ViewInteraction appCompatEditText16 = onView (
                allOf ( withId ( R.id.edit_content ), withText ( "so glad this is working" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                1 ),
                        isDisplayed () ) );
        appCompatEditText16.perform ( replaceText ( "so glad this is working well" ) );

        ViewInteraction appCompatEditText17 = onView (
                allOf ( withId ( R.id.edit_content ), withText ( "so glad this is working well" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                1 ),
                        isDisplayed () ) );
        appCompatEditText17.perform ( closeSoftKeyboard () );

        ViewInteraction appCompatButton3 = onView (
                allOf ( withId ( R.id.update_button ), withText ( "Update" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                2 ),
                        isDisplayed () ) );
        appCompatButton3.perform ( click () );

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep ( 3530152 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

        pressBack ();

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep ( 3593770 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

        openActionBarOverflowOrOptionsMenu ( getInstrumentation ().getTargetContext () );

        ViewInteraction appCompatTextView = onView (
                allOf ( withId ( R.id.title ), withText ( "Sign Out" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "android.support.v7.view.menu.ListMenuItemView" ) ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatTextView.perform ( click () );

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep ( 3575286 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

        ViewInteraction appCompatButton4 = onView (
                allOf ( withId ( R.id.btn_login_with_mail ), withText ( "Login" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                4 ),
                        isDisplayed () ) );
        appCompatButton4.perform ( click () );

        pressBack ();

        pressBack ();

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep ( 3578932 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

        ViewInteraction floatingActionButton2 = onView (
                allOf ( withId ( R.id.fab ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                1 ),
                        isDisplayed () ) );
        floatingActionButton2.perform ( click () );

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep ( 3596311 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

        ViewInteraction appCompatEditText18 = onView (
                allOf ( withId ( R.id.edit_title ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText18.perform ( click () );

        ViewInteraction appCompatEditText19 = onView (
                allOf ( withId ( R.id.edit_title ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText19.perform ( replaceText ( "New Expres" ), closeSoftKeyboard () );

        ViewInteraction appCompatEditText20 = onView (
                allOf ( withId ( R.id.edit_title ), withText ( "New Express Tes" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText20.perform ( click () );

        ViewInteraction appCompatEditText21 = onView (
                allOf ( withId ( R.id.edit_title ), withText ( "New Express Tes" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText21.perform ( replaceText ( "New Express Test" ) );

        ViewInteraction appCompatEditText22 = onView (
                allOf ( withId ( R.id.edit_title ), withText ( "New Express Test" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText22.perform ( closeSoftKeyboard () );

        ViewInteraction appCompatEditText23 = onView (
                allOf ( withId ( R.id.edit_title ), withText ( "New Express Test" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText23.perform ( click () );

        ViewInteraction appCompatEditText24 = onView (
                allOf ( withId ( R.id.edit_title ), withText ( "New Express Test" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText24.perform ( replaceText ( "New Expresso UITest" ) );

        ViewInteraction appCompatEditText25 = onView (
                allOf ( withId ( R.id.edit_title ), withText ( "New Expresso UITest" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText25.perform ( closeSoftKeyboard () );

        ViewInteraction appCompatEditText26 = onView (
                allOf ( withId ( R.id.edit_content ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                1 ),
                        isDisplayed () ) );
        appCompatEditText26.perform ( replaceText ( "It is still working fine" ), closeSoftKeyboard () );

        ViewInteraction appCompatEditText27 = onView (
                allOf ( withId ( R.id.edit_title ), withText ( "New Expresso UITest" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText27.perform ( replaceText ( "New Expresso UI Test" ) );

        ViewInteraction appCompatEditText28 = onView (
                allOf ( withId ( R.id.edit_title ), withText ( "New Expresso UI Test" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatEditText28.perform ( closeSoftKeyboard () );

        ViewInteraction appCompatButton5 = onView (
                allOf ( withId ( R.id.update_button ), withText ( "Save" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( android.R.id.content ),
                                        0 ),
                                2 ),
                        isDisplayed () ) );
        appCompatButton5.perform ( click () );

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep ( 3160515 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

        ViewInteraction recyclerView2 = onView (
                allOf ( withId ( R.id.recycler_view ),
                        childAtPosition (
                                withClassName ( is ( "android.widget.FrameLayout" ) ),
                                0 ) ) );
        recyclerView2.perform ( actionOnItemAtPosition ( 0, click () ) );

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep ( 3588810 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

        ViewInteraction actionMenuItemView2 = onView (
                allOf ( withId ( R.id.action_delete ), withContentDescription ( "Delete" ),
                        childAtPosition (
                                childAtPosition (
                                        withId ( R.id.action_bar ),
                                        1 ),
                                1 ),
                        isDisplayed () ) );
        actionMenuItemView2.perform ( click () );

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep ( 3592377 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

        openActionBarOverflowOrOptionsMenu ( getInstrumentation ().getTargetContext () );

        ViewInteraction appCompatTextView2 = onView (
                allOf ( withId ( R.id.title ), withText ( "Sign Out" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "android.support.v7.view.menu.ListMenuItemView" ) ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        appCompatTextView2.perform ( click () );

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep ( 3586902 );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }

        pressBack ();

    }

    private static Matcher <View> childAtPosition(
            final Matcher <View> parentMatcher, final int position) {

        return new TypeSafeMatcher <View> () {
            @Override
            public void describeTo(Description description) {
                description.appendText ( "Child at position " + position + " in parent " );
                parentMatcher.describeTo ( description );
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent ();
                return parent instanceof ViewGroup && parentMatcher.matches ( parent )
                        && view.equals ( ((ViewGroup) parent).getChildAt ( position ) );
            }
        };
    }
}
