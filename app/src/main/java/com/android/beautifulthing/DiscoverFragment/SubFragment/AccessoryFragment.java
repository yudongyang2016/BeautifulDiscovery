package com.android.beautifulthing.DiscoverFragment.subfragment;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ydy on 2016/9/6.
 * SubFragment---配饰
 */
public class AccessoryFragment extends Fragment {

    private Context mContext;

    public static AccessoryFragment newInstance(){
        AccessoryFragment accessoryFragment = new AccessoryFragment();
        return accessoryFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getContext();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TextView tv = new TextView(mContext);
        tv.setText("配饰");
        tv.setTextColor(Color.parseColor("#ffffff"));
        return tv;
    }
}
