package com.example.dargandmove;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.example.dargandmove.api.ApiService;
import com.example.dargandmove.beans.Crimes_at_location;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private ApiService apiService;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        lv = (ListView) findViewById(R.id.l);
        Retrofit retrofit = new Retrofit.Builder ()
                .baseUrl ( "https://data.police.uk/" )
                .addConverterFactory ( GsonConverterFactory.create () )
                .build ();

        apiService = retrofit.create( ApiService.class );
        getCrimes_at_location ();
    }

    private void getCrimes_at_location() {

        Intent intent = getIntent();
        Float l1 = null;
        if( android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT ) {
            l1 = Objects.requireNonNull(intent.getExtras()).getFloat("l1");
        }
        Float l2 = null;
        if( android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT ) {
            l2 = Objects.requireNonNull(intent.getExtras()).getFloat("l2");
        }
        Map<String,String> parameters = new HashMap<>();
        parameters.put("date","2017-02");
        parameters.put("lat", String.valueOf(l1));
        parameters.put("lng", String.valueOf(l2));

        Call<List<Crimes_at_location>> call = apiService.getCrimes_at_locations(parameters);

        call.enqueue(new Callback<List<Crimes_at_location>>() {
            @Override
            public void onResponse(Call<List<Crimes_at_location>> call, Response<List<Crimes_at_location>> response) {


                List<Crimes_at_location> posts = response.body();
                String[] heroes = new String[posts.size()];

                for (int i = 0; i < posts.size(); i++) {
                    heroes[i] = posts.get(i).getCategory();
                }

                lv.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, heroes));

            }

            @Override
            public void onFailure(Call<List<Crimes_at_location>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    }
