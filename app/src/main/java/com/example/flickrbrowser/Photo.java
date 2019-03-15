package com.example.flickrbrowser;

import java.io.Serializable;


class Photo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title;
    private String author;
    private String authorId;
    private String link;
    private String mTags;
    private String mImage;

    public Photo(String title, String author, String authorId, String link, String tags, String image) {
        this.title = title;
        this.author = author;
        this.authorId = authorId;
        this.link = link;
        mTags = tags;
        mImage = image;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    String getAuthorId() {
        return authorId;
    }

    String getLink() {
        return link;
    }

    String getTags() {
        return mTags;
    }

    String getImage() {
        return mImage;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", authorId='" + authorId + '\'' +
                ", link='" + link + '\'' +
                ", mTags='" + mTags + '\'' +
                ", mImage='" + mImage + '\'' +
                '}';
    }
}
