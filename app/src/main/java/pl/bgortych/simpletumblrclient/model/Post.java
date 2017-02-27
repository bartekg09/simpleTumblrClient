package pl.bgortych.simpletumblrclient.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bartl on 2017-02-27.
 */

public class Post {

    String id;
    String url;

    @SerializedName("url-with-slug")
    String urlWithSlug;

    String type;

    @SerializedName("date-gmt")
    String dateGMT;

    String date;

    Integer bookmarklet;

    Integer mobile;

    @SerializedName("feed-item")
    String feedItem;

    @SerializedName("from-feed-id")
    String fromFeedId;

    @SerializedName("unix-timestamp")
    String unixTimestamp;

    String format;

    @SerializedName("reblog-key")
    String reblogKey;

    String slug;

    @SerializedName("is-submission")
    boolean isSubmission;

    @SerializedName("like-button")
    String likeButton;

    @SerializedName("reblog-button")
    String reblogButton;

    @SerializedName("photo-caption")
    String photoCaption;

    Integer width;

    Integer height;

    @SerializedName("photo-url-1280")
    String photoUrlCaption1280;

    @SerializedName("photo-url-500")
    String photoUrlCaption500;

    @SerializedName("photo-url-400")
    String photoUrlCaption400;

    @SerializedName("photo-url-250")
    String photoUrlCaption250;

    @SerializedName("photo-url-100")
    String photoUrlCaption100;

    @SerializedName("photo-url-75")
    String photoUrlCaption75;

    Photo[] photos;

    String[] tags;


    //        "id":"150985458499",
//            "url":"http:\/\/user.tumblr.com\/post\/150985458499",
//            "url-with-slug":"http:\/\/user.tumblr.com\/post\/150985458499\/lfw-ss-2017-by-yu-fujiwara",
//            "type":"photo",
//            "date-gmt":"2016-09-27 00:33:47 GMT",
//            "date":"Mon, 26 Sep 2016 20:33:47",
//            "bookmarklet":0,
//            "mobile":0,
//            "feed-item":"",
//            "from-feed-id":0,
//            "unix-timestamp":1474936427,
//            "format":"html",
//            "reblog-key":"XeScM3cY",
//            "slug":"lfw-ss-2017-by-yu-fujiwara",
//            "is-submission":false,
//            "like-button":"<div class=\"like_button\" data-post-id=\"150985458499\" data-blog-name=\"user\" id=\"like_button_150985458499\"><iframe id=\"like_iframe_150985458499\" src=\"http:\/\/assets.tumblr.com\/assets\/html\/like_iframe.html?_v=9c1e0782724156703eb4f7ba79dbe203#name=user&amp;post_id=150985458499&amp;color=black&amp;rk=XeScM3cY\" scrolling=\"no\" width=\"20\" height=\"20\" frameborder=\"0\" class=\"like_toggle\" allowTransparency=\"true\" name=\"like_iframe_150985458499\"><\/iframe><\/div>",
//            "reblog-button":"<a href=\"https:\/\/www.tumblr.com\/reblog\/150985458499\/XeScM3cY\" class=\"reblog_button\"style=\"display: block;width:20px;height:20px;\"><svg width=\"100%\" height=\"100%\" viewBox=\"0 0 21 21\" xmlns=\"http:\/\/www.w3.org\/2000\/svg\" xmlns:xlink=\"http:\/\/www.w3.org\/1999\/xlink\" fill=\"#000\"><path d=\"M5.01092527,5.99908429 L16.0088498,5.99908429 L16.136,9.508 L20.836,4.752 L16.136,0.083 L16.1360004,3.01110845 L2.09985349,3.01110845 C1.50585349,3.01110845 0.979248041,3.44726568 0.979248041,4.45007306 L0.979248041,10.9999998 L3.98376463,8.30993634 L3.98376463,6.89801007 C3.98376463,6.20867902 4.71892527,5.99908429 5.01092527,5.99908429 Z\"><\/path><path d=\"M17.1420002,13.2800293 C17.1420002,13.5720293 17.022957,14.0490723 16.730957,14.0490723 L4.92919922,14.0490723 L4.92919922,11 L0.5,15.806 L4.92919922,20.5103758 L5.00469971,16.9990234 L18.9700928,16.9990234 C19.5640928,16.9990234 19.9453125,16.4010001 19.9453125,15.8060001 L19.9453125,9.5324707 L17.142,12.203\"><\/path><\/svg><\/a>",
//            "photo-caption":"<p>lfw s\/s 2017 by yu fujiwara<\/p>",
//            "width":467,
//            "height":701,
//            "photo-url-1280":"http:\/\/68.media.tumblr.com\/0bc620f4a63c3e4c57bcebd2545c7c89\/tumblr_oe508byHN51qznewfo1_500.jpg",
//            "photo-url-500":"http:\/\/68.media.tumblr.com\/0bc620f4a63c3e4c57bcebd2545c7c89\/tumblr_oe508byHN51qznewfo1_500.jpg",
//            "photo-url-400":"http:\/\/68.media.tumblr.com\/0bc620f4a63c3e4c57bcebd2545c7c89\/tumblr_oe508byHN51qznewfo1_400.jpg",
//            "photo-url-250":"http:\/\/68.media.tumblr.com\/0bc620f4a63c3e4c57bcebd2545c7c89\/tumblr_oe508byHN51qznewfo1_250.jpg",
//            "photo-url-100":"http:\/\/68.media.tumblr.com\/0bc620f4a63c3e4c57bcebd2545c7c89\/tumblr_oe508byHN51qznewfo1_100.jpg",
//            "photo-url-75":"http:\/\/68.media.tumblr.com\/0bc620f4a63c3e4c57bcebd2545c7c89\/tumblr_oe508byHN51qznewfo1_75sq.jpg",
//            "photos":[
//
//        ],
//        "tags":[
//        "fernanda ly",
//                "louis vuitton",
//                "s\/s 2017",
//                "yu fujiwara",
//                "LFW",
//                "pink hair",
//                "wire frames",
//                "red lips"
//        ]
//    },

}
