package com.example.android.tourguideapp;

/**
 * {@Link Place} represents a destination in the city.
 * It contains information such as name, description, location, phone number and website.
 */

public class Place {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Name of place
     */
    private String mNameOfPlace;
    /**
     * Description of place
     */
    private String mDescriptionOfPlace;

    /**
     * Image for place
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Place object
     *
     * @param nameOfPlace        is the name of the place
     * @param descriptionOfPlace is the description of the place
     * @param imageResourceId    is the drawable resource ID for the image asset
     */

    public Place(String nameOfPlace, String descriptionOfPlace, int imageResourceId) {
        mNameOfPlace = nameOfPlace;
        mDescriptionOfPlace = descriptionOfPlace;
        mImageResourceId = imageResourceId;
    }


    /*
    * Get the name of the place
    */
    public String getNameOfPlace() {
        return mNameOfPlace;
    }

    /*
    * Get the description of the place
    */
    public String getDescriptionOfPlace() {
        return mDescriptionOfPlace;
    }


    /*
    * Return the image resource ID of the place
    */
    public int getImageResourceID() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}



