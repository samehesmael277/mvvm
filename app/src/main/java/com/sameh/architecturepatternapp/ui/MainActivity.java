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
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        movieViewModel.movieNameMutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.textView.setText(s);
            }
        });

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                movieViewModel.getMovieName();
            }
        });

    }

}