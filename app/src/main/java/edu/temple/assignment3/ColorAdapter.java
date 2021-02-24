package edu.temple.assignment3;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ColorAdapter extends BaseAdapter
{
    String[] colors = res.getStringArray(R.array.colors);

    public ColorAdapter()
    {

    }

    @Override
    public int getCount()
    {
        return colors.size;
    }

    @Override
    public Object getItem(int position)
    {
        return colors.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    public String getColor(int position)
    {
        return colors[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        return null;
    }
}
