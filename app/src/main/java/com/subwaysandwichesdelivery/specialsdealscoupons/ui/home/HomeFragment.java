package com.subwaysandwichesdelivery.specialsdealscoupons.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.subwaysandwichesdelivery.specialsdealscoupons.MainActivity;
import com.subwaysandwichesdelivery.specialsdealscoupons.R;
import com.subwaysandwichesdelivery.specialsdealscoupons.WebViewFragment;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class HomeFragment extends Fragment {

    //variables
    private AdView fb_variable_homefragment_ad1;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
       // final TextView textView = root.findViewById(R.id.text_home);

        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
              //  textView.setText(s);
            }
        });
        return root;


    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {



        final NavController navController = Navigation.findNavController(view);

        loadFbBannerAd1(view);

        ImageView button = view.findViewById(R.id.imageview_enter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_nav_home_to_webViewFragment);
                WebViewFragment.n = "ORDERCOUPONS";
            }
        });

        ImageView imageview_coupons = view.findViewById(R.id.imageview_deals);
        imageview_coupons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_nav_home_to_dealsFragment2);
               WebViewFragment.n = "ORDERCOUPONS";
            }
        });

        ImageView imageview_games = view.findViewById(R.id.imageview_games);
        imageview_games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_nav_home_to_webViewFragment);
                WebViewFragment.n = "GAMES";
            }
        });
        ImageView imageview_prem_games = view.findViewById(R.id.imageview_prem_games);
        imageview_prem_games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_nav_home_to_webViewFragment);
                WebViewFragment.n = "PREMIUMGAMES";
            }
        });





    }

    public void loadFbBannerAd1(View view) {
        //********FACEBOOK BANNER INITIALIZATION
        fb_variable_homefragment_ad1 = new AdView(getActivity(), getString(R.string.fbPlacementIdBannerAd1), AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        final LinearLayout adContainer = view.findViewById(R.id.fb_adcontainer_homeactivity_ad1);
        // Add the ad view to your activity layout
        adContainer.addView(fb_variable_homefragment_ad1);
        // Request an ad
        fb_variable_homefragment_ad1.loadAd();

        AdListener adListener = new AdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {
                // Ad error callback
                Toast.makeText(
                        getActivity(),
                        "Error: " + adError.getErrorMessage(),
                        Toast.LENGTH_LONG)
                        .show();
            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Ad loaded callback
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback
            }
        };

        // Request an ad
       fb_variable_homefragment_ad1.loadAd(fb_variable_homefragment_ad1.buildLoadAdConfig().withAdListener(adListener).build());
    }


}





