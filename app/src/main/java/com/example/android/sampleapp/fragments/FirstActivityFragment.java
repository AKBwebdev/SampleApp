package com.example.android.sampleapp.fragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.example.android.sampleapp.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class FirstActivityFragment extends Fragment {

    private Context mContext;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_first, container, false);

        Toast.makeText(getContext(), "Hello from fragment", Toast.LENGTH_SHORT).show();

        //Toast.makeText(mContext, "Hello from fragment", Toast.LENGTH_SHORT).show();

        return root;
    }
}
