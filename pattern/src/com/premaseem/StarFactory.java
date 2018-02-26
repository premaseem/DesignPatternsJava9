package com.premaseem;

import java.util.HashMap;
import java.util.Map;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class StarFactory {
        static Map<String,Star> starCache = new HashMap<>();

    public static Star getStar (String brightnessLevel) {

        // First try to retrieve object from cache
        Star star = starCache.get(brightnessLevel);

        // if star does not exist in cache then factory will create one and store it in cache
        if (star == null) {
            if (brightnessLevel.equalsIgnoreCase("bright")) {
                star = new BrightStar();
                starCache.put("bright",star);
            }
            if (brightnessLevel.equalsIgnoreCase("dim")) {
                star = new DimStar();
                starCache.put("dim",star);
            }
            if (brightnessLevel.equalsIgnoreCase("dull")) {
                star = new DullStar();
                starCache.put("dull",star);
            }

        }
        // return star object for reuse
        return star;
    }


}

