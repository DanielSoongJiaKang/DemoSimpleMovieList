package sg.edu.rp.c346.id19045346.demosimplemovielist;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Movie;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView lvMovie;
    ArrayList<String> movieList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie);


        movieList = new ArrayList<String>();

        movieList.add("Avenger Infinity War Release Date: 2018.04");
        movieList.add("Justice League Release Date: 2017.11");
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, movieList);
        lvMovie.setAdapter(adapter);



    }
}
