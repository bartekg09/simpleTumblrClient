package pl.bgortych.simpletumblrclient.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bartl on 2017-02-27.
 */

public class Post {

    private String id;
    private String url;

    @SerializedName("url-with-slug")
    private
    String urlWithSlug;

    private String type;

    @SerializedName("date-gmt")
    private
    String dateGMT;

    private String date;

    private Integer bookmarklet;

    private Integer mobile;

    @SerializedName("feed-item")
    private
    String feedItem;

    @SerializedName("from-feed-id")
    private
    String fromFeedId;

    @SerializedName("unix-timestamp")
    private
    String unixTimestamp;

    private String format;

    @SerializedName("reblog-key")
    private
    String reblogKey;

    private String slug;

    @SerializedName("is-submission")
    private
    boolean isSubmission;

    @SerializedName("like-button")
    private
    String likeButton;

    @SerializedName("reblog-button")
    private
    String reblogButton;

    @SerializedName("photo-caption")
    private
    String photoCaption;

    private Integer width;

    private Integer height;

    @SerializedName("photo-url-1280")
    private
    String photoUrlCaption1280;

    @SerializedName("photo-url-500")
    private
    String photoUrlCaption500;

    @SerializedName("photo-url-400")
    private
    String photoUrlCaption400;

    @SerializedName("photo-url-250")
    private
    String photoUrlCaption250;

    @SerializedName("photo-url-100")
    private
    String photoUrlCaption100;

    @SerializedName("photo-url-75")
    private
    String photoUrlCaption75;

    private Photo[] photos;

    private String[] tags;

    @SerializedName("quote-text")
    private
    String quoteText;

    @SerializedName("quote-source")
    private
    String quoteSource;

    @SerializedName("id3-artist")
    private
    String id3Artist;

    @SerializedName("id3-album")
    private
    String id3Album;

    @SerializedName("id3-title")
    private
    String id3Title;

    @SerializedName("audio-caption")
    private
    String audioCaption;

    @SerializedName("audio-player")
    private
    String audioPlayer;

    @SerializedName("audio-embed")
    private
    String audioEmbed;

    @SerializedName("audio-plays")
    private
    Integer audioPlays;

    @SerializedName("video-caption")
    private
    String videoCaption;

    @SerializedName("video-source")
    private
    String videoSource;

    @SerializedName("video-player")
    private
    String videoPlayer;

    @SerializedName("video-player-500")
    private
    String videoPlayer500;

    public String getVideoPlayer250() {
        return videoPlayer250;
    }

    public void setVideoPlayer250(String videoPlayer250) {
        this.videoPlayer250 = videoPlayer250;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlWithSlug() {
        return urlWithSlug;
    }

    public void setUrlWithSlug(String urlWithSlug) {
        this.urlWithSlug = urlWithSlug;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDateGMT() {
        return dateGMT;
    }

    public void setDateGMT(String dateGMT) {
        this.dateGMT = dateGMT;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getBookmarklet() {
        return bookmarklet;
    }

    public void setBookmarklet(Integer bookmarklet) {
        this.bookmarklet = bookmarklet;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getFeedItem() {
        return feedItem;
    }

    public void setFeedItem(String feedItem) {
        this.feedItem = feedItem;
    }

    public String getFromFeedId() {
        return fromFeedId;
    }

    public void setFromFeedId(String fromFeedId) {
        this.fromFeedId = fromFeedId;
    }

    public String getUnixTimestamp() {
        return unixTimestamp;
    }

    public void setUnixTimestamp(String unixTimestamp) {
        this.unixTimestamp = unixTimestamp;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getReblogKey() {
        return reblogKey;
    }

    public void setReblogKey(String reblogKey) {
        this.reblogKey = reblogKey;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public boolean isSubmission() {
        return isSubmission;
    }

    public void setSubmission(boolean submission) {
        isSubmission = submission;
    }

    public String getLikeButton() {
        return likeButton;
    }

    public void setLikeButton(String likeButton) {
        this.likeButton = likeButton;
    }

    public String getReblogButton() {
        return reblogButton;
    }

    public void setReblogButton(String reblogButton) {
        this.reblogButton = reblogButton;
    }

    public String getPhotoCaption() {
        return photoCaption;
    }

    public void setPhotoCaption(String photoCaption) {
        this.photoCaption = photoCaption;
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

    public String getPhotoUrlCaption1280() {
        return photoUrlCaption1280;
    }

    public void setPhotoUrlCaption1280(String photoUrlCaption1280) {
        this.photoUrlCaption1280 = photoUrlCaption1280;
    }

    public String getPhotoUrlCaption500() {
        return photoUrlCaption500;
    }

    public void setPhotoUrlCaption500(String photoUrlCaption500) {
        this.photoUrlCaption500 = photoUrlCaption500;
    }

    public String getPhotoUrlCaption400() {
        return photoUrlCaption400;
    }

    public void setPhotoUrlCaption400(String photoUrlCaption400) {
        this.photoUrlCaption400 = photoUrlCaption400;
    }

    public String getPhotoUrlCaption250() {
        return photoUrlCaption250;
    }

    public void setPhotoUrlCaption250(String photoUrlCaption250) {
        this.photoUrlCaption250 = photoUrlCaption250;
    }

    public String getPhotoUrlCaption100() {
        return photoUrlCaption100;
    }

    public void setPhotoUrlCaption100(String photoUrlCaption100) {
        this.photoUrlCaption100 = photoUrlCaption100;
    }

    public String getPhotoUrlCaption75() {
        return photoUrlCaption75;
    }

    public void setPhotoUrlCaption75(String photoUrlCaption75) {
        this.photoUrlCaption75 = photoUrlCaption75;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    public String getQuoteSource() {
        return quoteSource;
    }

    public void setQuoteSource(String quoteSource) {
        this.quoteSource = quoteSource;
    }

    public String getId3Artist() {
        return id3Artist;
    }

    public void setId3Artist(String id3Artist) {
        this.id3Artist = id3Artist;
    }

    public String getId3Album() {
        return id3Album;
    }

    public void setId3Album(String id3Album) {
        this.id3Album = id3Album;
    }

    public String getId3Title() {
        return id3Title;
    }

    public void setId3Title(String id3Title) {
        this.id3Title = id3Title;
    }

    public String getAudioCaption() {
        return audioCaption;
    }

    public void setAudioCaption(String audioCaption) {
        this.audioCaption = audioCaption;
    }

    public String getAudioPlayer() {
        return audioPlayer;
    }

    public void setAudioPlayer(String audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public String getAudioEmbed() {
        return audioEmbed;
    }

    public void setAudioEmbed(String audioEmbed) {
        this.audioEmbed = audioEmbed;
    }

    public Integer getAudioPlays() {
        return audioPlays;
    }

    public void setAudioPlays(Integer audioPlays) {
        this.audioPlays = audioPlays;
    }

    public String getVideoCaption() {
        return videoCaption;
    }

    public void setVideoCaption(String videoCaption) {
        this.videoCaption = videoCaption;
    }

    public String getVideoSource() {
        return videoSource;
    }

    public void setVideoSource(String videoSource) {
        this.videoSource = videoSource;
    }

    public String getVideoPlayer() {
        return videoPlayer;
    }

    public void setVideoPlayer(String videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    public String getVideoPlayer500() {
        return videoPlayer500;
    }

    public void setVideoPlayer500(String videoPlayer500) {
        this.videoPlayer500 = videoPlayer500;
    }

    @SerializedName("video-player-250")
    private
    String videoPlayer250;

}
