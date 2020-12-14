package com.amod.android_junit_app;

import android.widget.EditText;
import android.widget.TextView;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainActivityTest {

    private MainActivity mainActivity;
    private TextView textView;
    private EditText editText;

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() throws Exception {
        mainActivity = activityActivityTestRule.getActivity();
        textView = mainActivity.findViewById(R.id.txt_name);
        editText=mainActivity.findViewById(R.id.edt_email);
    }

    @Test
    public void testData() {
        assertEquals("Amod", textView.getText().toString());
        assertTrue(mainActivity.isValidEmailId(editText.getText().toString()));
        assertEquals(4,mainActivity.sum_Of_Two_No(1,3));
    }
    @After
    public void tearDown() throws Exception {
        mainActivity = null;
    }

}