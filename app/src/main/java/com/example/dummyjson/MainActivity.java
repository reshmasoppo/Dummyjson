package com.example.dummyjson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    RecyclerView recyclerView;


    List<Content> productList;

    public final static String JSON_FILE_CONTENT = "orderlist_content.json";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recycleview);

        Response myResponse = getjsonContent();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        ProductAdapter adapter = new ProductAdapter(this, myResponse);
        recyclerView.setAdapter(adapter);

    }

    public Response getjsonContent() {
        String jsonString = getAssetsJSON(JSON_FILE_CONTENT);
        Log.d(TAG, "getcontent: " + jsonString);
        Gson gson = new Gson();
        Response content = gson.fromJson(jsonString, Response.class);
        return content;
    }


    // To fetch values from json file for all
    private String getAssetsJSON(String filename) {
        String json = null;
        try {
            InputStream inputStream = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
                inputStream = Objects.requireNonNull(this).getAssets().open(filename);
            }
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                json = new String(buffer, StandardCharsets.UTF_8);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return json;
    }


}

