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
public class DrinkFragment extends Fragment {


    public DrinkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create an array of places
        final ArrayList<Place> places = new ArrayList<Place>();

        //places.add("Flying M Coffee House");
        places.add(new Place("Flying M Coffee House", "Coffee shop", R.drawable.android_nougat));
        places.add(new Place("10 Barrell Brewing Co.", "Pub and American cuisine", R.drawable.android_nougat));
        places.add(new Place("Bardenay", "Craft cocktails, wine, and beer", R.drawable.android_nougat));
        places.add(new Place("Le Peep", "Coffee shop", R.drawable.android_nougat));
        places.add(new Place("Neurolux ", "Bar and live music", R.drawable.android_nougat));
        places.add(new Place("Leaf Teahouse", "Tea house", R.drawable.android_nougat));
        places.add(new Place("Goldy's Corner", "Coffee, tea, and dessert", R.drawable.android_nougat));
        places.add(new Place("Ha'penny Bridge Pub", "Irish pub", R.drawable.android_nougat));
        places.add(new Place("Liquid Lounge", "Cocktails and grill", R.drawable.android_nougat));
        places.add(new Place("The Modern Hotel and Bar", "Craft cocktails, beer, wine", R.drawable.android_nougat));

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