package com.example.jem.ucsdcarpool;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.click;

/**
 * Created by yucheng on 3/7/16.
 */

@RunWith(AndroidJUnit4.class)
public class profile_back_Test {

    @ClassRule
    public static DisableAnimationsRule disableAnimation;

    @Rule
    public ActivityTestRule<Profile> ProfileBackRule = new ActivityTestRule<>(Profile.class);

    @Test
    public void LogoutTest() {
        onView(withId(R.id.back_basic))
                .check(matches(isDisplayed()));

        onView(withId(R.id.back_basic)).check(matches(isClickable()));

        onView(withId(R.id.back_basic)).perform(click());

        onView(withId(R.id.home_profile)).check(matches(isDisplayed()));

        onView(withId(R.id.home_main)).check(matches(isDisplayed()));

        onView(withId(R.id.home_Find_Schedule_Driver)).check(matches(isDisplayed()));

        onView(withId(R.id.home_Find_Schedule)).check(matches(isDisplayed()));

        onView(withId(R.id.home_Log_Out)).check(matches(isDisplayed()));

    }
}
