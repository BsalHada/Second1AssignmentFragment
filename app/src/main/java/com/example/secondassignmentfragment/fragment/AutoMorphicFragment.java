package com.example.secondassignmentfragment.fragment;



import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.secondassignmentfragment.R;

import java.util.Scanner;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutoMorphicFragment extends Fragment {

    View view;
    EditText editTextNumber;
    Button buttonAuto;
    Integer number, result, checkMor;
    TextView textViewAuto;

    public AutoMorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_auto_morphic, container, false);

        editTextNumber = view.findViewById(R.id.editAuto);
        buttonAuto = view.findViewById(R.id.btnAutomorphic);
        textViewAuto = view.findViewById(R.id.textAuto);

        buttonAuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int N = Integer.parseInt(editTextNumber.getText().toString());
                // called function
                textViewAuto.setText(isAutomorphic(N)? "The " + N + " is Automorphic number" : "This " + N + " is not an Automorphic number");
            }
        });

        return view;
    }

    // Function to check Automorphic number
    static boolean isAutomorphic(int N)
    {
        int sq = N * N;
        while (N > 0) {
            if (N % 10 != sq % 10)
                return false;

            N /= 10;
            sq /= 10;
        }
        return true;
    }

}