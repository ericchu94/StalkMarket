package net.ericchu.stalkmarket;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class TownsFragment extends Fragment {

    private TownsAdapter townsAdapter;

    public TownsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_towns, container, false);

        townsAdapter = new TownsAdapter(getActivity(), new ArrayList<Town>());
        townsAdapter.add(new Town("Haliby"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));
        townsAdapter.add(new Town("Epsilon"));

        ListView towns = (ListView) view.findViewById(R.id.towns);
        towns.setAdapter(townsAdapter);

        return view;
    }
}
