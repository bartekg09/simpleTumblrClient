package pl.bgortych.simpletumblrclient.fragments.fragmentAdapters;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

import pl.bgortych.simpletumblrclient.R;
import pl.bgortych.simpletumblrclient.model.Post;

/**
 * Created by bartl on 2017-02-28.
 */

public class PostListAdapter extends ArrayAdapter<Post> {

    ArrayList<Post> postArrayList;
    Context mContext;

    private static class ViewHolder{
        TextView postTitle;
        TextView quoteText;
    }

    public PostListAdapter(ArrayList<Post> postArrayList, Context context) {
        super(context, R.layout.post_list_item, postArrayList);
        this.postArrayList = postArrayList;
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Post post = getItem(position);
        ViewHolder viewHolder;

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.post_list_item, parent, false);
            viewHolder.postTitle = (TextView) convertView.findViewById(R.id.post_title_text_view);
            viewHolder.quoteText = (TextView) convertView.findViewById(R.id.post_quote_text);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        viewHolder.postTitle.setText(post.getDate());

        //ToDo switch to ENUM!
        switch (post.getType()){
            case "quote":
                //Todo HTML value interpretation
                viewHolder.quoteText.setVisibility(View.VISIBLE);
                viewHolder.quoteText.setText(post.getQuoteText());
                break;
            case "photo":
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

        return result;
    }
}
