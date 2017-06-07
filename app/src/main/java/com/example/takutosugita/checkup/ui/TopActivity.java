package com.example.takutosugita.checkup.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.takutosugita.checkup.R;
import com.example.takutosugita.checkup.databinding.ActivityTopBinding;
import com.example.takutosugita.checkup.model.User;

public class TopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTopBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_top);
        User user = new User();
        user.name = "Takuto";
        binding.setUser(user);
    }

    public void toCheck() {
        Intent i = new Intent(TopActivity.this, CheckActivity.class);
        startActivity(i);
    }

    public void toList() {

    }


}
