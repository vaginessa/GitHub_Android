package com.zpauly.githubapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zpauly.githubapp.R;
import com.zpauly.githubapp.entity.response.issues.IssueCommentBean;
import com.zpauly.githubapp.utils.ImageUtil;
import com.zpauly.githubapp.utils.TextUtil;
import com.zpauly.githubapp.view.profile.OthersActivity;
import com.zpauly.githubapp.view.viewholder.CommentsViewHolder;

/**
 * Created by zpauly on 16/9/6.
 */
public class CommentsRecyclerViewAdapter extends LoadMoreRecyclerViewAdapter<IssueCommentBean, CommentsViewHolder> {
    public CommentsRecyclerViewAdapter(Context context) {
        super(context);
    }

    @Override
    public CommentsViewHolder createContentViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(getContext()).inflate(R.layout.item_recyclerview_comment, parent, false);
        CommentsViewHolder viewHolder = new CommentsViewHolder(mView);
        return viewHolder;
    }

    @Override
    public void bindContentViewHolder(CommentsViewHolder holder, int position) {
        final IssueCommentBean data = getData().get(position);
        holder.mUsernameTV.setText(data.getUser().getLogin());
        holder.mTimeTV.setText(TextUtil.timeConverter(data.getCreated_at()));
        holder.mBodyTV.setText(data.getBody());
        ImageUtil.loadAvatarImageFromUrl(getContext(), data.getUser().getAvatar_url(), holder.mAvatarIV);
        holder.mAvatarIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OthersActivity.lanuchActivity(getContext(), data.getUser().getLogin());
            }
        });
    }
}