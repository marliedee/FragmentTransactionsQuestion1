package org.pursuit.fragmentexercises;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddFragmenrTwo extends Fragment {

    private View rootView;
    private TextView textview;

    public AddFragmenrTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_add_fragmenr_two, container, false);
        textview =  rootView.findViewById(R.id.two);

        Bundle bundle2 = getArguments();
        String textFromEditText = bundle2.getString("second", "");
        textview.setText(textFromEditText);

        return rootView;
    }

}
