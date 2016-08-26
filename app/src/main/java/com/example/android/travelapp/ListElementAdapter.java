package com.example.android.travelapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Pablo on 26-Aug-16.
 */
public class ListElementAdapter extends ArrayAdapter<ListElement> {

    public ListElementAdapter(Context context, List<ListElement> elements ) {
        super(context, 0, elements);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listViewItem = convertView;
        if( listViewItem == null ) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false );
        }

        ListElement listElement = getItem(position);

        TextView englishTextView = (TextView)listViewItem.findViewById(R.id.title_tv);
        englishTextView.setText(listElement.getTitle());

        TextView miwokTextView = (TextView)listViewItem.findViewById(R.id.desc_tv);
        miwokTextView.setText(listElement.getDescription());

        ImageView imageView = (ImageView)listViewItem.findViewById(R.id.image);
        if( listElement.hasImage()) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(listElement.getImgResourceId());
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listViewItem;
    }
}
