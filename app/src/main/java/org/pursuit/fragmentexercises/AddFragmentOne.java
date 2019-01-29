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
public class AddFragmentOne extends Fragment {
    private View rootView;
    private TextView textview;


    public AddFragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_add_fragment_one, container, false);
        textview =  rootView.findViewById(R.id.one);

        Bundle bundle = getArguments();
        String textFromEditText = bundle.getString("first", "");
        textview.setText(textFromEditText);

        return rootView;
    }

}
