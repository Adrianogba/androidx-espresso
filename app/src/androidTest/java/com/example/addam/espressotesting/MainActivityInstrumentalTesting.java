package com.example.addam.espressotesting;

import androidx.test.rule.ActivityTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by addam on 9/21/17.
 */


@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentalTesting {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule
            = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void ensureTextExist(){
        onView(withId(R.id.username))
                .perform(typeText("Hello"));
    }

    @Test
    public void reTypeText(){
        onView(withId(R.id.username))
                .perform(typeText("Hello Again"));
    }
}
