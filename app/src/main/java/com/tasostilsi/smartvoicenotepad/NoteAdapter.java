package com.tasostilsi.smartvoicenotepad;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class NoteAdapter extends ArrayAdapter<NoteObj> {

    public NoteAdapter(@NonNull Context context, @NonNull ArrayList<NoteObj> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        final ViewHolder holder;

        NoteObj obj = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.note_item, parent, false);
            holder = new ViewHolder();

            holder.image = convertView.findViewById(R.id.image_note_cardView);
            holder.title = convertView.findViewById(R.id.note_item_title);
            holder.description = convertView.findViewById(R.id.note_item_text);
            holder.date = convertView.findViewById(R.id.note_item_date);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        // Lookup view for data population
        // Populate the data into the template view using the data object

        if (obj != null) {
            if (obj.getImage().length() > 5) {
                //Glide.with(getContext()).load(obj.getImage()).thumbnail(Glide.with(getContext()).load(R.drawable.loader)).into(holder.image);
            } else
                holder.image.setImageResource(R.mipmap.ic_launcher);
            holder.title.setText(obj.getTitle());
            holder.description.setText(obj.getDescription());
            holder.date.setText(obj.getDate());
        }
        return convertView;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    static class ViewHolder {
        ImageView image;
        TextView title;
        TextView description;
        TextView date;
    }
}
