package com.cheteam.dreamcatcher.ArticlePreview.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Nicolas Juniar on 10/09/2017.
 */

public class ViewArticleResponse {
    @SerializedName("id_post")
    public int id_post;
    @SerializedName("name")
    public String name;
    @SerializedName("id_avatar")
    public int id_avatar;
    @SerializedName("post_title")
    public String post_title;
    @SerializedName("id_background")
    public int id_background;
    @SerializedName("categories")
    public String categories;
    @SerializedName("content")
    public String content;
    @SerializedName("published_at")
    public String published_at;
}
