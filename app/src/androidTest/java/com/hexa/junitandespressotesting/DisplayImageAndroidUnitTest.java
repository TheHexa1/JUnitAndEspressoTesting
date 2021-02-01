package com.hexa.junitandespressotesting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.InstrumentationRegistry;
import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
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
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withTagValue;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

@RunWith(AndroidJUnit4.class)
public class DisplayImageAndroidUnitTest {

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
    public void testIfCorrectViewsExists0(){

        List<Integer> images = ImagesData.getData();

            //Intent to launch DisplayImage activity
            Intent intent;
            intent = new Intent(ApplicationProvider.getApplicationContext(), DisplayImage.class);
            Bundle bundle = new Bundle();
            bundle.putInt("image_src", images.get(0));
            intent.putExtras(bundle);

            //launch activity manually with intent bundle
            rule.launchActivity(intent);
            Activity activity = rule.getActivity();

            //TextView ********************
            View viewById = activity.findViewById(R.id.tv_image_title);

            //test if textview is null or not
            assertThat(viewById,notNullValue());

            //test if correct view is used
            assertThat(viewById, instanceOf(TextView.class));

            //test if correct text is displayed
            TextView textView = (TextView) viewById;
            assertThat(textView.getText().toString(),is(activity.getResources().getResourceEntryName(images.get(0))));

            //ImageView ********************
            View viewById2 = activity.findViewById(R.id.iv_display);

            //test if imageview is null
            assertThat(viewById2,notNullValue());

            //test if correct view is used
            assertThat(viewById2, instanceOf(ImageView.class));

            //test if correct image is displayed by comparing its tag
//            ImageView imageView = (ImageView) viewById2;
//            assertThat(imageView.getTag(), is(0));

//            activityScenario = ActivityScenario.launch(intent);
//            int finalI = i;
//
//            activityScenario.onActivity(activity -> {
//
//
//            });
//
//            activityScenario.close();
//        }
    }

    @Test
    public void testIfCorrectViewsExists1(){

        List<Integer> images = ImagesData.getData();

        //Intent to launch DisplayImage activity
        Intent intent;
        intent = new Intent(ApplicationProvider.getApplicationContext(), DisplayImage.class);
        Bundle bundle = new Bundle();
        bundle.putInt("image_src", images.get(1));
        intent.putExtras(bundle);

        //launch activity manually with intent bundle
        rule.launchActivity(intent);
        Activity activity = rule.getActivity();

        //TextView ********************
        View viewById = activity.findViewById(R.id.tv_image_title);

        //test if textview is null or not
        assertThat(viewById,notNullValue());

        //test if correct view is used
        assertThat(viewById, instanceOf(TextView.class));

        //test if correct text is displayed
        TextView textView = (TextView) viewById;
        assertThat(textView.getText().toString(),is(activity.getResources().getResourceEntryName(images.get(1))));

        //ImageView ********************
        View viewById2 = activity.findViewById(R.id.iv_display);

        //test if imageview is null
        assertThat(viewById2,notNullValue());

        //test if correct view is used
        assertThat(viewById2, instanceOf(ImageView.class));

        //test if correct image is displayed by comparing its tag
//        ImageView imageView = (ImageView) viewById2;
//        assertThat(imageView.getTag(), is(1));

//            activityScenario = ActivityScenario.launch(intent);
//            int finalI = i;
//
//            activityScenario.onActivity(activity -> {
//
//
//            });
//
//            activityScenario.close();
//        }
    }
}
