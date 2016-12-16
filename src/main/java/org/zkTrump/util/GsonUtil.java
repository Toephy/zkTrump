package org.zkTrump.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by Toephy on 2016.12.15 15:46
 */
public class GsonUtil {

    private GsonUtil() {
    }

    private static Gson gson = new GsonBuilder().create();

    public static String toJson(Object o) {
        return gson.toJson(o);
    }
}
