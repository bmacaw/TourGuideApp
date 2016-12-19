package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout
 * for each list item based on a data source which is a list of {@Link Place} objects.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

     /*
        * Create a new {@link PlaceAdapter} object.
        *
        * @param context is the current context (i.e. Activity) that the adapter is being created in.
        * @param places is the list of {@link Place}s to be displayed.
        */

    public PlaceAdapter(Activity context, ArrayList<Place> places) {

        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID Place
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_text_view);
        // Get the name from the current Place object and
        // set this text on the name TextView
        placeTextView.setText(currentPlace.getNameOfPlace());

        // Find the TextView in the list_item.xml layout with the ID Description
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Get the description from the current Word object and
        // set this text on the description TextView
        descriptionTextView.setText(currentPlace.getDescriptionOfPlace());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentPlace.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPlace.getImageResourceID());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }


        // Return the whole list item layout (containing 2 TextViews)so that it can be shown in
        // the ListView
        return listItemView;

    }


}
