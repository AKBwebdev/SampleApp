package com.example.android.sampleapp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.android.sampleapp.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class ThirdActivityFragmentThird extends Fragment {

    private Context mContext;

   /* @BindView(R.id.textview_one)
    TextView mTextViewOne;

    @BindView(R.id.textview_two)
    TextView mTextViewTwo;

    @BindView(R.id.imageview)
    ImageView mImageView;

    @BindString(R.string.label)
    String mLabel;

    @BindDrawable(R.drawable.ic_computer)
    Drawable mDrawable;*/


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_third_third, container, false);
        //ButterKnife.bind(this, root);

            // Note => in an activity the binding syntax is >>>  ButterKnife.bind(this)

        /*mTextViewOne.setText(mLabel);

        mTextViewTwo.setText(mLabel + " Of course!");

        mImageView.setImageDrawable(mDrawable);*/

        return root;
    }
}
