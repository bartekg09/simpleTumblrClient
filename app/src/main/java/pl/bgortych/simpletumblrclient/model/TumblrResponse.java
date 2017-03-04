package pl.bgortych.simpletumblrclient.model;

/*
  Created by bgortych on 2017-02-26.
 */
import com.google.gson.annotations.SerializedName;
public class TumblrResponse {

    public TumbleLog getTumbleLog() {
        return tumbleLog;
    }

    public void setTumbleLog(TumbleLog tumbleLog) {
        this.tumbleLog = tumbleLog;
    }

    public Integer getPostsStart() {
        return postsStart;
    }

    public void setPostsStart(Integer postsStart) {
        this.postsStart = postsStart;
    }

    public Integer getPostTotal() {
        return postTotal;
    }

    public void setPostTotal(Integer postTotal) {
        this.postTotal = postTotal;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }

    @SerializedName("tumblelog")
    private
    TumbleLog tumbleLog;

    @SerializedName("posts-start")
    private
    Integer postsStart;

    @SerializedName("posts-total")
    private
    Integer postTotal;

    @SerializedName("posts-type")
    private
    String postType;

    @SerializedName("posts")
    private
    Post[] posts;
}
