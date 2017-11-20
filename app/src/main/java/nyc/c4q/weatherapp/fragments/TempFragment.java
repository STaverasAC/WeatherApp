package nyc.c4q.weatherapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import nyc.c4q.weatherapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TempFragment extends Fragment {

    View rootView;
    ImageView img;
    TextView temp;


    public TempFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_temp, container, false);
        img = (ImageView)rootView.findViewById(R.id.img_temp);
        temp = (TextView) rootView.findViewById(R.id.text_temp);
        return rootView;
    }

}
