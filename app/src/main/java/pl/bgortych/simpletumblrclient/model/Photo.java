package pl.bgortych.simpletumblrclient.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bartl on 2017-02-27.
 */

public class Photo {
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getPhotoUrl1280() {
        return photoUrl1280;
    }

    public void setPhotoUrl1280(String photoUrl1280) {
        this.photoUrl1280 = photoUrl1280;
    }

    public String getPhotoUrl500() {
        return photoUrl500;
    }

    public void setPhotoUrl500(String photoUrl500) {
        this.photoUrl500 = photoUrl500;
    }

    public String getPhotoUrl400() {
        return photoUrl400;
    }

    public void setPhotoUrl400(String photoUrl400) {
        this.photoUrl400 = photoUrl400;
    }

    public String getPhotoUrl250() {
        return photoUrl250;
    }

    public void setPhotoUrl250(String photoUrl250) {
        this.photoUrl250 = photoUrl250;
    }

    public String getPhotoUrl100() {
        return photoUrl100;
    }

    public void setPhotoUrl100(String photoUrl100) {
        this.photoUrl100 = photoUrl100;
    }

    public String getPhotoUrl75() {
        return photoUrl75;
    }

    public void setPhotoUrl75(String photoUrl75) {
        this.photoUrl75 = photoUrl75;
    }

    private String offset;
    private String caption;
    private Integer width;
    private Integer height;
    @SerializedName("photo-url-1280")
    private
    String photoUrl1280;
    @SerializedName("photo-url-500")
    private
    String photoUrl500;
    @SerializedName("photo-url-400")
    private
    String photoUrl400;
    @SerializedName("photo-url-250")
    private
    String photoUrl250;
    @SerializedName("photo-url-100")
    private
    String photoUrl100;
    @SerializedName("photo-url-75")
    private
    String photoUrl75;
}
