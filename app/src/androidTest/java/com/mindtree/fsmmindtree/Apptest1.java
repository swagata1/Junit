package com.mindtree.fsmmindtree;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.widget.Button;

import com.mindtree.fsmmindtree.view.LoginActivity;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by M1036063 on 3/28/2017.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest

public class Apptest1 extends ActivityInstrumentationTestCase2<LoginActivity> {
    Button mClickMeButton;
    LoginActivity mClickFunActivity;

    public Apptest1() {
        super(LoginActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        setActivityInitialTouchMode(true);
        mClickFunActivity = getActivity();
        mClickMeButton = (Button) mClickFunActivity.findViewById(R.id.btnLogin);

    }
    @Test
    public void testClickMeButton_clickButtonAndExpectInfoText() {
        //   String expectedInfoText = mClickFunActivity.getString(R.string.info_text);
        //Perform a click on mClickMeButton
        TouchUtils.clickView(this, mClickMeButton);
         assertTrue("success",mClickMeButton!=null);
        //Verify the that mClickMeButton was clicked. mInfoTextView is visible and contains
        //the correct text.
        //  assertTrue(View.VISIBLE == mInfoTextView.getVisibility());
        //assertEquals(expectedInfoText, mInfoTextView.getText());
    }



}



