package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EatFragment extends Fragment {


    public EatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create an array of places
        final ArrayList<Place> places = new ArrayList<Place>();

        //places.add("Flying M Coffee House");
        places.add(new Place("The Basque Market", "Spanish cuisine", R.drawable.the_basque_market));
        places.add(new Place("Fork", "Upscale American dining", R.drawable.fork_restauraunt));
        places.add(new Place("Saint Lawrence Gridiron", "American cuisine", R.drawable.st_lawrence_gridiron));
        places.add(new Place("Alavita", "Italian", R.drawable.alavita));
        places.add(new Place("Red Feather Lounge", "American dining", R.drawable.red_feather));
        places.add(new Place("Wild Root Cafe and Market", "Regular, veggie and vegan", R.drawable.wild_root_cafe));
        places.add(new Place("Shige Japanese Cuisine", "Sushi, teppanyaki, and saki", R.drawable.shige_japanese_cuisine));
        places.add(new Place("High Note Cafe", "Food, beer, live music", R.drawable.high_note_cafe));
        places.add(new Place("Goldy's Breakfast Bistro", "American breakfast and lunch", R.drawable.goldys_breakfast_bistro));
        places.add(new Place("Mazzah", "Mediterranean cuisine", R.drawable.mazzah));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single place.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }

}
