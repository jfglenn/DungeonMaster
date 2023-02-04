package com.example.dungeonmaster;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DndDataHelper {
    Context context;
    String races;
    public DndDataHelper(Context context) {
        this.context = context;
    }

    public interface VolleyResponseListener{
        void onError (String message);
        void onResponse(String races);
    }

    public void getCharacterRaces(VolleyResponseListener volleyResponseListener){
        String url = "https://www.dnd5eapi.co/api/races";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                races = "";
                try {
                    // extract data array from object
                    //JSONObject racesResults = response.getJSONObject("results");
                    JSONArray racesArray = response.getJSONArray("results");
                    //int length = racesArray.length();
                    JSONObject race = racesArray.getJSONObject(0);
                    races = race.getString("name");
                    volleyResponseListener.onResponse(races);
                } catch (JSONException e) {
                    e.printStackTrace();
                    volleyResponseListener.onError("Could not retrieve character races!");
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context, error.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        // Add the request to the RequestQueue.
        SingletonHelper.getInstance(context).addToRequestQueue(request);
    }


}
