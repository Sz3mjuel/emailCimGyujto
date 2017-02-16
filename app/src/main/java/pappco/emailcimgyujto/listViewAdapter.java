package pappco.emailcimgyujto;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class listViewAdapter extends ArrayAdapter<Player> {
    public listViewAdapter(Context context, ArrayList<Player> jatekosok) {
        super(context, 0, jatekosok);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Player mJatekos = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listitem, parent, false);
        }

        TextView tvName = (TextView) convertView.findViewById(R.id.txtName);
        TextView tvEmail = (TextView) convertView.findViewById(R.id.txtEmail);
        TextView tvTime = (TextView) convertView.findViewById(R.id.txtTime);

        tvName.setText(mJatekos.getmName());
        tvEmail.setText(mJatekos.getmEmail());
        tvTime.setText(mJatekos.getmEredmeny());

        return convertView;
    }
}
