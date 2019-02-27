package com.example.roomdatabaseapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
public class HomeFragment extends Fragment implements View.OnClickListener {

    public Button insertButton,retrieveButton;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view=inflater.inflate(R.layout.fragment_home, container, false);
        insertButton=view.findViewById(R.id.insert);
        insertButton.setOnClickListener(this);
        retrieveButton=view.findViewById(R.id.retrieve);
        retrieveButton.setOnClickListener(this);
        return view;
    }
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.insert:MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new InsertFragment()).addToBackStack(null).commit();
            break;
            case R.id.retrieve:MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new RetrieveFragment()).addToBackStack(null).commit();
            break;
        }
    }

}
