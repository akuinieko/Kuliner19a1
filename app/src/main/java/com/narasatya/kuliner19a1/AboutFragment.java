package com.narasatya.kuliner19a1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class AboutFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View aboutView = inflater.inflate(R.layout.fragment_about, container, false);

        WebView webView = aboutView.findViewById(R.id.wv_about);
        webView.loadUrl("file:///android_asset/index.html");


        // Inflate the layout for this fragment
        return aboutView;
    }
}