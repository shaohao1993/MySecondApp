package com.niceshao.viewpagetest;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ChatFragment extends Fragment {
    TextView chat_text;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.layout_chat,container,false);
        chat_text = (TextView)mView.findViewById(R.id.chat_text);
        chat_text.setText("恭喜你！");
        return mView;
    }
}