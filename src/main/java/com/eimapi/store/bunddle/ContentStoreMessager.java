package com.eimapi.store.bunddle;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by gsdenys on 28/08/17.
 */
public class ContentStoreMessager {

    private static ResourceBundle bundle;

    static {
        bundle = ResourceBundle.getBundle("content-store", Locale.getDefault());
    }

    /**
     * ContentStoreMessager Bundle method
     *
     * @param key   - the key for message bundle
     * @param param - the parameter array
     * @return String - the message
     */
    public static String getMessage(String key, Object... param) {
        return MessageFormat.format(bundle.getString(key), param);
    }
}
