package com.hexa.junitandespressotesting;

import android.view.View;
import android.widget.ArrayAdapter;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;

@RunWith(AndroidJUnit4.class)
public class MainActivityAndroidUnitTest {
    @Rule
    public ActivityScenarioRule<MainActivity> rule  = new  ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void ensureRecylerViewExists() throws Exception {
        rule.getScenario().onActivity(activity -> {

            View viewById = activity.findViewById(R.id.rv_images);

            //test if recylerview is not null
            assertThat(viewById,notNullValue());

            //test if correct view is used
            assertThat(viewById, instanceOf(RecyclerView.class));
        });

    }

    @Test
    public void ensureRecylerViewContentIsThere() throws Exception {
        rule.getScenario().onActivity(activity -> {

            View viewById = activity.findViewById(R.id.rv_images);

            RecyclerView recyclerView = (RecyclerView) viewById;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();

            //test if correct adapter is attached
            assertThat(adapter, instanceOf(ImagesAdapter.class));

            //test the count of items to be loaded
            assertThat(adapter.getItemCount(), equalTo(5));
        });

    }


}
