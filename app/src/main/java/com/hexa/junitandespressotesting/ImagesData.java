package com.hexa.junitandespressotesting;

import java.util.ArrayList;
import java.util.List;

public class ImagesData {
    //data source
    public static List<Integer> getData(){
        List<Integer> images = new ArrayList<>();

        images.add(R.drawable.brownie);
        images.add(R.drawable.cake);
        images.add(R.drawable.burger);
        images.add(R.drawable.cookies);
        images.add(R.drawable.pastry);

        return images;
    }
}
