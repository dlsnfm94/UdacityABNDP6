package com.example.abndp6bynooralmashhadani;

public class News {
    private String mCategory;
    private String mTitle;
    private String mAuthor;
    private String mDate;
    private String mUrl;

    public News(String category, String title, String author, String date, String url) {
        mCategory = category;
        mTitle = title;
        mAuthor = author;
        mDate = date;
        mUrl = url;
    }

    public String getCategory() {
        return mCategory;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }
}
