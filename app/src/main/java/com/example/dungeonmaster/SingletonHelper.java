package com.example.dungeonmaster;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class SingletonHelper {
        private static SingletonHelper instance;
        private RequestQueue requestQueue;
        private static Context ctx;

        private SingletonHelper(Context context) {
            ctx = context;
            requestQueue = getRequestQueue();
        }

        public static synchronized SingletonHelper getInstance(Context context) {
            if (instance == null) {
                instance = new SingletonHelper(context);
            }
            return instance;
        }

        public RequestQueue getRequestQueue() {
            if (requestQueue == null) {
                // getApplicationContext() is key, it keeps you from leaking the
                // Activity or BroadcastReceiver if someone passes one in.
                requestQueue = Volley.newRequestQueue(ctx.getApplicationContext());
            }
            return requestQueue;
        }

        public <T> void addToRequestQueue(Request<T> req) {
            getRequestQueue().add(req);
        }

}

