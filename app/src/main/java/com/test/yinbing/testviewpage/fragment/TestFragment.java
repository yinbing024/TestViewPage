package com.test.yinbing.testviewpage.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import static android.widget.LinearLayout.*;

/**
 * Created by yinbing on 16-3-15.
 */
public class TestFragment extends Fragment {

    private Activity activity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        ScrollView scrollView = new ScrollView(activity);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        final TextView tv_topic = new TextView(activity);
        tv_topic.setTextSize(24);
        tv_topic.setText("测试的题目");
        linearLayout.addView(tv_topic,lp);
        final LinearLayout explainLayout = new LinearLayout(activity);
        linearLayout.addView(explainLayout,lp);
        scrollView.addView(linearLayout);
        return scrollView;
    }
}
