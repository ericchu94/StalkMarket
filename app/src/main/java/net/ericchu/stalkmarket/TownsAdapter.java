package net.ericchu.stalkmarket;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class TownsAdapter extends ArrayAdapter<Town> {
    public TownsAdapter(Context context, ArrayList<Town> towns) {
        super(context, 0, towns);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Town town = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_town, parent, false);
        }

        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView sell = (TextView) convertView.findViewById(R.id.sell);

        name.setText(town.name);
        sell.setText(town.sell ? "Sell" : "Hold");

        return convertView;
    }
}
