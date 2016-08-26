package com.example.android.travelapp;

/**
 * Created by Pablo on 26-Aug-16.
 */
public class ListElement {

    private static final int NO_RESOURCE_ID = -1;

    private String mTitle;
    private String mDescription;
    private int mImgResourceId = NO_RESOURCE_ID;


    public ListElement( String title, String description ) {
        mDescription = description;
        mTitle = title;
    }

    public ListElement( String title, String description, int imageResoruceId ) {
        mDescription = description;
        mTitle = title;
        mImgResourceId = imageResoruceId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImgResourceId() {
        return mImgResourceId;
    }

    public boolean hasImage() {
        return mImgResourceId != NO_RESOURCE_ID;
    }
}
