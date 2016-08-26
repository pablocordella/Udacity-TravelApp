package com.example.android.travelapp;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;

/**
 * Created by Pablo on 26-Aug-16.
 */
public class ListInformationCreator {


    static private ArrayList<ListElement> mFoodList, mEntertainmentList, mEventList, mMuseumList;
    static private Context mContext;
    public static void Init(Context context) {
        mContext = context;
    }

    public static ArrayList<ListElement> getFoodList() {
        if( mFoodList == null ) {
            mFoodList = new ArrayList<ListElement>();

            Resources res = mContext.getResources();
            mFoodList.add( new ListElement( res.getString(R.string.food1_title), res.getString(R.string.food1_description )));
            mFoodList.add( new ListElement( res.getString(R.string.food2_title), res.getString(R.string.food2_description )));
            mFoodList.add( new ListElement( res.getString(R.string.food3_title), res.getString(R.string.food3_description )));
            mFoodList.add( new ListElement( res.getString(R.string.food4_title), res.getString(R.string.food4_description )));
            mFoodList.add( new ListElement( res.getString(R.string.food5_title), res.getString(R.string.food5_description )));
            mFoodList.add( new ListElement( res.getString(R.string.food6_title), res.getString(R.string.food6_description )));
            mFoodList.add( new ListElement( res.getString(R.string.food7_title), res.getString(R.string.food7_description )));
            mFoodList.add( new ListElement( res.getString(R.string.food8_title), res.getString(R.string.food8_description )));
            mFoodList.add( new ListElement( res.getString(R.string.food9_title), res.getString(R.string.food9_description )));
        }

        return mFoodList;
    }

    public static ArrayList<ListElement> getEntertainmentList() {
        if( mEntertainmentList == null ) {
            mEntertainmentList = new ArrayList<ListElement>();

            Resources res = mContext.getResources();
            mEntertainmentList.add( new ListElement( res.getString(R.string.entertainment1_title), res.getString(R.string.entertainment1_description )));
            mEntertainmentList.add( new ListElement( res.getString(R.string.entertainment2_title), res.getString(R.string.entertainment2_description )));
            mEntertainmentList.add( new ListElement( res.getString(R.string.entertainment3_title), res.getString(R.string.entertainment3_description )));
        }

        return mEntertainmentList;
    }

    public static ArrayList<ListElement> getEventList() {
        if( mEventList == null ) {
            mEventList = new ArrayList<ListElement>();

            Resources res = mContext.getResources();
            mEventList.add( new ListElement( res.getString(R.string.event1_title), res.getString(R.string.event1_description )));
            mEventList.add( new ListElement( res.getString(R.string.event2_title), res.getString(R.string.event2_description )));
            mEventList.add( new ListElement( res.getString(R.string.event3_title), res.getString(R.string.event3_description )));
            mEventList.add( new ListElement( res.getString(R.string.event4_title), res.getString(R.string.event4_description )));
            mEventList.add( new ListElement( res.getString(R.string.event5_title), res.getString(R.string.event5_description )));
        }

        return mEventList;
    }

    public static ArrayList<ListElement> getMuseumList() {
        if( mMuseumList == null ) {
            mMuseumList = new ArrayList<ListElement>();

            Resources res = mContext.getResources();
            mMuseumList.add( new ListElement( res.getString(R.string.museum1_title), res.getString(R.string.museum1_description), R.drawable.color_black ));
            mMuseumList.add( new ListElement( res.getString(R.string.museum2_title), res.getString(R.string.museum2_description), R.drawable.color_brown ));
            mMuseumList.add( new ListElement( res.getString(R.string.museum3_title), res.getString(R.string.museum3_description), R.drawable.color_dusty_yellow ));
            mMuseumList.add( new ListElement( res.getString(R.string.museum4_title), res.getString(R.string.museum4_description), R.drawable.color_gray ));
            mMuseumList.add( new ListElement( res.getString(R.string.museum5_title), res.getString(R.string.museum5_description), R.drawable.color_green ));
            mMuseumList.add( new ListElement( res.getString(R.string.museum6_title), res.getString(R.string.museum6_description), R.drawable.color_mustard_yellow ));
        }

        return mMuseumList;
    }

}
