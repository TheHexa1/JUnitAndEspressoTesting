package com.hexa.junitandespressotesting;

import android.view.View;

import org.hamcrest.Matcher;

public class EspressoCustomMatchers {

        public static Matcher<View> withDrawable(final int image_src) {
            return new DrawableMatcher(image_src);
        }
}
