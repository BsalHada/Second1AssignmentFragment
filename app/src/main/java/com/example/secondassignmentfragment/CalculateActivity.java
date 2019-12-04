package com.example.secondassignmentfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.secondassignmentfragment.fragment.AreaOfCircleFragment;
import com.example.secondassignmentfragment.fragment.AutoMorphicFragment;
import com.example.secondassignmentfragment.fragment.PalindromeNumberFragment;
import com.example.secondassignmentfragment.fragment.ReverseNumberFragment;
import com.example.secondassignmentfragment.fragment.ReverseStringFragment;
import com.example.secondassignmentfragment.fragment.SumFragment;


public class CalculateActivity extends AppCompatActivity {

    private Button buttonSum, buttonCircle, buttonReverse, buttonPalendrome, buttonAutomorphic, buttonReverseString;
    private Boolean status = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        SumFragment sumFragment = new SumFragment();
        fragmentTransaction.replace(R.id.layoutContainer, sumFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        buttonSum = findViewById(R.id.btnSum);
        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    SumFragment sumFragment = new SumFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, sumFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {
                }
            }
        });

        buttonCircle = findViewById(R.id.btnCircle);
        buttonCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    AreaOfCircleFragment circleFragment = new AreaOfCircleFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, circleFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {
                }
            }
        });

        buttonReverse = findViewById(R.id.btnReverse);
        buttonReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    ReverseNumberFragment reverseFragment = new ReverseNumberFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, reverseFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {
                }
            }
        });


        buttonPalendrome = findViewById(R.id.btnPalendrome);
        buttonPalendrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    PalindromeNumberFragment palendromeFragment = new PalindromeNumberFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, palendromeFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {
                }
            }
        });

        buttonReverseString = findViewById(R.id.btnRevStr);
        buttonReverseString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    ReverseStringFragment reverseStringFragment = new ReverseStringFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, reverseStringFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {

                }
            }
        });


        buttonAutomorphic = findViewById(R.id.btnAuto);
        buttonAutomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    AutoMorphicFragment automorphicFragment = new AutoMorphicFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, automorphicFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {

                }
            }
        });
    }
}