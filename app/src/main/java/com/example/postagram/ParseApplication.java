package com.example.postagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("41p3w8nnhNKsQQDoeHx2F7EfOPbGY5FFCr9EskDJ")
                .clientKey("T5ab6uNepZRxxJYs4Aga5lwp7dVJAWvDCKeIhctl")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
