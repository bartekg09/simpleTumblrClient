package pl.bgortych.simpletumblrclient.fragments.fragmentAdapters;

import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import pl.bgortych.simpletumblrclient.R;
import pl.bgortych.simpletumblrclient.model.Post;

/**
 * Created by bartl on 2017-03-01.
 */

public class PostRecyclerViewAdapter extends RecyclerView.Adapter<PostRecyclerViewAdapter.PostViewHolder> {

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    private List<Post> postList;

    public class PostViewHolder extends RecyclerView.ViewHolder {
        public final TextView date;
        public final TextView quote;
        public ImageView photo;
        public final WebView webView;
        public final TextView tags;

        public PostViewHolder(View itemView) {
            super(itemView);
            date = (TextView) itemView.findViewById(R.id.post_title_text_view);
            quote = (TextView) itemView.findViewById(R.id.post_quote_text);
            webView = (WebView) itemView.findViewById(R.id.post_web_view);
            tags = (TextView) itemView.findViewById(R.id.tags_text_view);

        }

        public void clearVisibility() {
            if (this.quote.getVisibility() != View.GONE) {
                this.quote.setVisibility(View.GONE);
            }

            if (this.webView.getVisibility() != View.GONE) {
                this.webView.setVisibility(View.GONE);
            }
        }
    }

    public PostRecyclerViewAdapter(List<Post> postList) {
        this.postList = postList;
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_list_item, parent, false);
        return new PostViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        holder.clearVisibility();
        Post post = postList.get(position);
        holder.date.setText(post.getDate());

        String tags = "";
        for (String tag : post.getTags()) {
            tags += "#" + tag + " ";
        }
        holder.tags.setText(tags);


        switch (post.getType()) {
            case "quote":
                holder.quote.setVisibility(View.VISIBLE);
                holder.quote.setText(Html.fromHtml(post.getQuoteText()));
                break;
            case "photo":

                holder.quote.setVisibility(View.VISIBLE);
                holder.quote.setText(Html.fromHtml(post.getPhotoCaption()));
                holder.webView.setVisibility(View.VISIBLE);
                holder.webView.loadUrl(post.getPhotoUrlCaption400());
                break;
            case "video":
                break;
            case "link":
                break;
            case "regular":
                break;
            default:
                break;
        }

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

}
