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
public class AddFragmentThree extends Fragment {
    private View rootView;
    private TextView textview;

    public AddFragmentThree() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_add_fragment_three, container, false);
        textview = rootView.findViewById(R.id.three);

        Bundle bundle3 = getArguments();
        String textFromEditText = bundle3.getString("third", "");
        textview.setText(textFromEditText);

        return rootView;
    }

}
