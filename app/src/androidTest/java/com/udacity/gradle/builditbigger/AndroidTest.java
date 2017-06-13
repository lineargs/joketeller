package com.udacity.gradle.builditbigger;


import android.app.Activity;
import android.app.Instrumentation;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.rule.ActivityTestRule;

import com.example.jokedisplay.JokeDisplay;

import org.hamcrest.core.AllOf;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.Intents.intending;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasData;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static android.support.test.espresso.intent.matcher.IntentMatchers.isInternal;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertNotNull;


/**
 * Created by goranminov on 13/06/2017.
 */

@RunWith(JUnit4.class)
public class AndroidTest {

    @Rule
    public IntentsTestRule<MainActivity> mActivityRule =
            new IntentsTestRule<MainActivity>(MainActivity.class);

    @Before
    public void stubAllExternalIntents() {
        // By default Espresso Intents does not stub any Intents. Stubbing needs to be setup before
        // every test run. In this case all external Intents will be blocked.
        intending(not(isInternal())).respondWith(new Instrumentation.ActivityResult(Activity.RESULT_OK, null));
    }

    @Test
    public void notNullResult() {
        onView(withId(R.id.joke_button)).perform(click());
        onView(withId(R.id.joke_text_view)).check(matches(isDisplayed()));

    }
}
