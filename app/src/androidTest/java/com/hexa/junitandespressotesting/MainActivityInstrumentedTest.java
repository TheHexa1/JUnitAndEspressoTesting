package com.hexa.junitandespressotesting;


import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.openLinkWithText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static androidx.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static androidx.test.espresso.matcher.ViewMatchers.withTagValue;
import static com.hexa.junitandespressotesting.EspressoCustomMatchers.withDrawable;
import static org.hamcrest.Matchers.equalTo;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> rule =
            new ActivityScenarioRule<MainActivity>(MainActivity.class);

//    @Test
//    public void checkImageBitmaps(){
//        onView(ViewMatchers.withId(R.id.rv_images))
//                .perform(RecyclerViewActions.scrollToPosition(0))
//                .check(matches(withDrawable("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/5928474985_19b4ba972a_z4fd1.jpg")));
//        onView(withTagValue(equalTo(0))).check(matches(withDrawable(R.drawable.brownie)));
//    }

    @Before
    public void setUp() {
        Intents.init();
    }

    @After
    public void tearDown() {
        Intents.release();
    }

    //test each image one by one

    @Test
    public void checkClickOnImg0(){
        //perform click on a image from the list
        onView(ViewMatchers.withId(R.id.rv_images))
                .perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));

        //check the extras and target package name for the intent
        intended(toPackage("com.hexa.junitandespressotesting"));
        intended(hasExtra("image_src", ImagesData.getData().get(0)));

        //check if DisplayImage activity started or not
        intended(hasComponent(DisplayImage.class.getName()));
    }

    @Test
    public void checkClickOnImg1(){
        //perform click on a image from the list
        onView(ViewMatchers.withId(R.id.rv_images))
                .perform(RecyclerViewActions.actionOnItemAtPosition(1, click()));

        //check the extras and target package name for the intent
        intended(toPackage("com.hexa.junitandespressotesting"));
        intended(hasExtra("image_src", ImagesData.getData().get(1)));

        //check if DisplayImage activity started or not
        intended(hasComponent(DisplayImage.class.getName()));
    }

    @Test
    public void checkClickOnImg2(){
        //perform click on a image from the list
        onView(ViewMatchers.withId(R.id.rv_images))
                .perform(RecyclerViewActions.actionOnItemAtPosition(2, click()));

        //check the extras and target package name for the intent
        intended(toPackage("com.hexa.junitandespressotesting"));
        intended(hasExtra("image_src", ImagesData.getData().get(2)));

        //check if DisplayImage activity started or not
        intended(hasComponent(DisplayImage.class.getName()));
    }

    @Test
    public void checkClickOnImg3(){
        //perform click on a image from the list
        onView(ViewMatchers.withId(R.id.rv_images))
                .perform(RecyclerViewActions.actionOnItemAtPosition(3, click()));

        //check the extras and target package name for the intent
        intended(toPackage("com.hexa.junitandespressotesting"));
        intended(hasExtra("image_src", ImagesData.getData().get(3)));

        //check if DisplayImage activity started or not
        intended(hasComponent(DisplayImage.class.getName()));
    }

    @Test
    public void checkClickOnImg4(){
        //perform click on a image from the list
        onView(ViewMatchers.withId(R.id.rv_images))
                .perform(RecyclerViewActions.actionOnItemAtPosition(4, click()));

        //check the extras and target package name for the intent
        intended(toPackage("com.hexa.junitandespressotesting"));
        intended(hasExtra("image_src", ImagesData.getData().get(4)));

        //check if DisplayImage activity started or not
        intended(hasComponent(DisplayImage.class.getName()));
    }
}