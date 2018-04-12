package com.example.android.sampleapp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.android.sampleapp.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class ThirdActivityFragmentFourth extends Fragment {

    private Context mContext;
    private static final String[] ANDROID_VERSIONS = new String[] { "Android P", "Oreo - API 26-27", "Nougat - API 24-25",
            "Marshmallow - API 23", "Lollipop - API 21-22", "KitKat - API 19-20", "Jelly Bean - API 16-18", "Ice Cream Sandwich API 14-15",
            "Honeycomb - API 11-13", "Gingerbread - API 9-10", "Froyo - API 8" };


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_third_fourth, container, false);

        ListView listView = root.findViewById(R.id.listview);
        listView.setAdapter(new ArrayAdapter<>(mContext, R.layout.list_item, ANDROID_VERSIONS));

 /*       // Inflate header view
        ViewGroup headerView = (ViewGroup)getLayoutInflater().inflate(R.layout.list_header, listView, false);
        // Add header view to the ListView
        listView.addHeaderView(headerView); */

        return root;
    }
}
