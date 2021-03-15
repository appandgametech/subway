package com.subwaysandwichesdelivery.specialsdealscoupons;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WebViewFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WebViewFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    //Variable
    public WebView WebView;
    public static String n;
    public String url;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public WebViewFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WebViewFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WebViewFragment newInstance(String param1, String param2) {
        WebViewFragment fragment = new WebViewFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_web_view, container, false);

        if (n == "MOREAPPS")
            url = "https://restaurantscouponsdeals.page.link/apps";


        if (n == "PREMIUMGAMES")
            url = "https://www.crazygames.com/t/html5";

        if (n == "GAMES")
            url = "https://gametech.portals.famobi.com/";



        if (n == "ORDERCOUPONS")
            url = getString(R.string.web_link_main_website_order_now);

        if (n == "DEAL1")
            url = getString(R.string.web_link_deal_1);

        if (n == "DEAL2")
            url = getString(R.string.web_link_deal_2);

        if (n == "DEAL3")
            url = getString(R.string.web_link_deal_3);

        if (n == "DEAL4")
            url = getString(R.string.web_link_deal_4);

        if (n == "DEAL5")
            url = getString(R.string.web_link_deal_5);

        if (n == "DEAL6")
            url = getString(R.string.web_link_deal_6);

        if (n == "DEAL7")
            url = getString(R.string.web_link_deal_7);




        WebView = (WebView) v.findViewById(R.id.webview_container);
        WebView.loadUrl(url);

        // Enable Javascript
        WebView.clearCache(true);
        WebView.clearHistory();
        WebView.getSettings().setJavaScriptEnabled(true);
        WebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        WebSettings webSettings = WebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        WebView.setWebViewClient(new WebViewClient());
        WebView.canGoBack();
        WebView.setOnKeyListener(new View.OnKeyListener() {

            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK
                        && event.getAction() == MotionEvent.ACTION_UP
                        && WebView.canGoBack()) {
                    WebView.goBack();
                    return true;
                }
                return false;
            }
        });


        return v;
    }



    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
    }
    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().show();
    }
}