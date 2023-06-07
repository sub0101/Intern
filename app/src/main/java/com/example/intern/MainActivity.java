package com.example.intern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.intern.databinding.ActivityMainBinding;
import com.example.intern.fragments.MovieFragment;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;
    FragmentManager fragmentManager;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
mainBinding = DataBindingUtil.setContentView(this , R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(mainBinding.mainContainer.getId() , new MovieFragment()).commit();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // using toolbar as ActionBar
        setSupportActionBar(toolbar);

    }

}