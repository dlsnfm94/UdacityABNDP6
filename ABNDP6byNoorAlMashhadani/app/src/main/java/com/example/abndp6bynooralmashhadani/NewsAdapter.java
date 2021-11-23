package com.example.abndp6bynooralmashhadani;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        News currentNews = getItem(position);
        TextView category = listItemView.findViewById(R.id.news_category);
        category.setText(currentNews.getCategory());
        TextView title = listItemView.findViewById(R.id.news_title);
        title.setText(currentNews.getTitle());
        TextView author = listItemView.findViewById(R.id.news_author);
        author.setText(currentNews.getAuthor());
        TextView date = listItemView.findViewById(R.id.news_date);
        date.setText(currentNews.getDate());
        return listItemView;
    }
}
