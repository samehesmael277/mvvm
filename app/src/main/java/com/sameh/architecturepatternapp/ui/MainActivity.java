package com.sameh.architecturepatternapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import android.os.Bundle;
import android.view.View;
import com.sameh.architecturepatternapp.R;
import com.sameh.architecturepatternapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    MovieViewModel movieViewModel;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        movieViewModel=new MovieViewModel();

        binding.button.setOnClickListener(view -> movieViewModel.getMovieName());

        movieViewModel.movieNameMutableLiveData.observe(this, s -> binding.textView.setText(s));

    }

}