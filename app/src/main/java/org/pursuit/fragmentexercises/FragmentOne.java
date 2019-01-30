package org.pursuit.fragmentexercises;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {

    private View rootView;

    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        rootView = inflater.inflate(R.layout.fragment_fragment_one, container, false);
        final EditText editText =  rootView.findViewById(R.id.editText_fragment);

        Button button01 = rootView.findViewById(R.id.button_one);
        Button button02 =  rootView.findViewById(R.id.button_two);
        Button button03 =  rootView.findViewById(R.id.button_three);
        Button button04 =  rootView.findViewById(R.id.button_four);
        Button button05 =  rootView.findViewById(R.id.button_five);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddFragmentOne firstFragment = new AddFragmentOne();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                String editTextContents = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("first", editTextContents);
                firstFragment.setArguments(bundle);
                ft.replace(R.id.main_fragment, firstFragment).addToBackStack("first");
                ft.commit();
            }
        });
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddFragmentOne firstFragment = new AddFragmentOne();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                String editTextContents = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("first", editTextContents);
                firstFragment.setArguments(bundle);
                ft.replace(R.id.main_fragment, firstFragment).addToBackStack("first");
                ft.commit();
            }
        });
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddFragmenrTwo secondFragment = new AddFragmenrTwo();
                FragmentManager fm2 = getActivity().getSupportFragmentManager();
                FragmentTransaction ft2 = fm2.beginTransaction();
                String editTextContents = editText.getText().toString();
                Bundle bundle2 = new Bundle();
                bundle2.putString("second", editTextContents);
                secondFragment.setArguments(bundle2);
                ft2.replace(R.id.main_fragment, secondFragment).addToBackStack("second");
                ft2.commit();
            }
        });
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddFragmentThree thirdFragment = new AddFragmentThree();
                FragmentManager fm3 = getActivity().getSupportFragmentManager();
                FragmentTransaction ft3 = fm3.beginTransaction();
                String editTextContents = editText.getText().toString();
                Bundle bundle3 = new Bundle();
                bundle3.putString("third", editTextContents);
                thirdFragment.setArguments(bundle3);
                ft3.replace(R.id.main_fragment, thirdFragment).addToBackStack("third");
                ft3.commit();
            }
        });
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddFragmentFour fourFragment = new AddFragmentFour();
                FragmentManager fm4 = getActivity().getSupportFragmentManager();
                FragmentTransaction ft4 = fm4.beginTransaction();
                String editTextContents = editText.getText().toString();
                Bundle bundle4 = new Bundle();
                bundle4.putString("fourth", editTextContents);
                fourFragment.setArguments(bundle4);
                ft4.replace(R.id.main_fragment, fourFragment).addToBackStack("fourth");
                ft4.commit();
            }
        });

        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddFragmentFive fifthFragment = new AddFragmentFive();
                FragmentManager fm5 = getActivity().getSupportFragmentManager();
                FragmentTransaction ft5 = fm5.beginTransaction();
                String editTextContents = editText.getText().toString();
                Bundle bundle5 = new Bundle();
                bundle5.putString("fifth", editTextContents);
                fifthFragment.setArguments(bundle5);
                ft5.replace(R.id.main_fragment, fifthFragment).addToBackStack("fifth");
                ft5.commit();
            }
        });

        return rootView;    }

}
