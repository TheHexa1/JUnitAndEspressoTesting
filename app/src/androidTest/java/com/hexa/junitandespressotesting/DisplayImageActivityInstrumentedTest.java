package com.hexa.junitandespressotesting;


import android.content.Intent;
import android.os.Bundle;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static androidx.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static androidx.test.espresso.matcher.ViewMatchers.withTagValue;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.is;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class DisplayImageActivityInstrumentedTest {

//    @Rule
//    public ActivityScenario<DisplayImage> activityScenario;

    @Rule
    public ActivityTestRule<DisplayImage> rule =
            new ActivityTestRule(DisplayImage.class, true, false);

//    @After
//    public void tearDown() {
//        activityScenario.close();
//    }

    @Test
    public void testViews0() {

        List<Integer> images = ImagesData.getData();
        Intent intent;
        intent = new Intent(ApplicationProvider.getApplicationContext(), DisplayImage.class);
        Bundle bundle = new Bundle();
        bundle.putInt("image_src", images.get(0));
        intent.putExtras(bundle);

        rule.launchActivity(intent);
        onView(ViewMatchers.withId(R.id.tv_image_title))
                .check(matches(
                        withText(
                                rule.getActivity().getResources().getResourceEntryName(images.get(0)))));
    }

    @Test
    public void testViews1() {

        List<Integer> images = ImagesData.getData();
        Intent intent;
        intent = new Intent(ApplicationProvider.getApplicationContext(), DisplayImage.class);
        Bundle bundle = new Bundle();
        bundle.putInt("image_src", images.get(1));
        intent.putExtras(bundle);

        rule.launchActivity(intent);
        onView(ViewMatchers.withId(R.id.tv_image_title))
                .check(matches(
                        withText(
                                rule.getActivity().getResources().getResourceEntryName(images.get(1)))));
    }

//        }

//            onView(ViewMatchers.withId(R.id.iv_display)).check(matches(withTagValue(is(0))));

            //launch activity manually with intent bundle
//            activityScenario = ActivityScenario.launch(intent);
//            int finalI = i;

//            activityScenario.onActivity(activity -> {

                //test textview text
//                onView(ViewMatchers.withId(R.id.tv_image_title))
//                        .check(matches(
//                                withText(
//                                        activity.getResources().getResourceEntryName(images.get(0)))));

                //test image tag
//                onView(ViewMatchers.withId(R.id.iv_display)).check(matches(withTagValue(is(0))));

//                activityScenario.close();
//            });

//        }


//    }
}