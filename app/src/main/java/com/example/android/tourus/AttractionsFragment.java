package com.example.android.tourus;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_attractions, container, false);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction("Super Coaster Extreme!", "8am to 5pm",
                "123 Rollar Coaster street", "$", "063431234",
                R.string.super_coaster_extreme, R.drawable.amusement_park));

        attractions.add(new Attraction("Bungee Jumping", "8am to 5pm",
                "456 Crazy Person Road", "$$", "063434567",
                R.string.bungee_jump, R.drawable.bungee_jump));

        attractions.add(new Attraction("Virtual Reality", "8am to 5pm",
                "789 Imaginary lane", "$$$", "063438910",
                R.string.virtual_reality, R.drawable.virtual_reality));






        return rootView;
    }
}