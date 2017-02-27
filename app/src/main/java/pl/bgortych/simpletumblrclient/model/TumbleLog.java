package pl.bgortych.simpletumblrclient.model;

/**
 * Created by bartl on 2017-02-27.
 */

public class TumbleLog {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Boolean getCname() {
        return cname;
    }

    public void setCname(Boolean cname) {
        this.cname = cname;
    }

    public Feed[] getFeeds() {
        return feeds;
    }

    public void setFeeds(Feed[] feeds) {
        this.feeds = feeds;
    }

    String title;
    String description;
    String name;
    String timezone;
    Boolean cname;
    Feed[] feeds;
}
