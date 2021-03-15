package com.subwaysandwichesdelivery.specialsdealscoupons;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;

import static android.content.ContentValues.TAG;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DealsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DealsFragment extends Fragment {
    //Variables
    ;
    private AdView fb_dealsfragment_banner_ad1;
    private AdView fb_dealsfragment_banner_ad2;
    private AdView fb_dealsfragment_banner_ad3;
    private AdView fb_dealsfragment_banner_ad4;
    private AdView fb_dealsfragment_banner_ad5;
    private AdView fb_dealsfragment_banner_ad6;
    private AdView fb_dealsfragment_banner_ad7;
    private InterstitialAd fb_dealsfragment_interstitial_ad1;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;



    public DealsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DealsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DealsFragment newInstance(String param1, String param2) {
        DealsFragment fragment = new DealsFragment();
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_deals, container, false);


    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        AdSettings.addTestDevice("72d8c4fc-395b-4fbb-b279-24b65386ee9f");

        //initialized facebook ads
        fb_dealsfragment_interstitial_ad1 = new InterstitialAd(getActivity(), getString(R.string.fbPlacementIdInterstitialAd1));


        loadFbBannerAd1(view);
        loadFbBannerAd2(view);
        loadFbBannerAd3(view);
        loadFbBannerAd4(view);
        loadFbBannerAd5(view);
        loadFbBannerAd6(view);
        loadFbBannerAd7(view);










        //first deal ********************
        //******************************************************************************************
        final NavController navController = Navigation.findNavController(view);


        final ImageButton button_lock = view.findViewById(R.id.button_lock);
        button_lock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebViewFragment.n = "DEAL1";
                navController.navigate(R.id.action_dealsFragment_to_webViewFragment);

            }
        });
        button_lock.setEnabled(false);
        final Button button_reveal_deal1 = view.findViewById(R.id.button_reveal_deal1);
        button_reveal_deal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFbInterstitalAd1();
                button_lock.setEnabled(true);
                button_lock.setBackgroundResource(R.drawable.unlocked_button);
                button_reveal_deal1.setText("Click the link above to get deals");
                button_reveal_deal1.setBackgroundColor(Color.GRAY);
                button_reveal_deal1.setTextColor(Color.BLACK);
                //copy to clipboard code below
                // ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                // ClipData clip = ClipData.newPlainText("simple text", "BESWEET");
                // clipboard.setPrimaryClip(clip);
                Toast.makeText(getActivity(),"Click the green button above to navigate to the deals", Toast.LENGTH_LONG).show();
                loadFbInterstitalAd1();


            }
        });


        //second deal ********************
        //******************************************************************************************


        final ImageButton button_lock_2 = view.findViewById(R.id.button_lock_2);
        button_lock_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimerFragment.variable_dealName = "FOOTLONG";
                navController.navigate(R.id.action_dealsFragment_to_timerFragment);
            }
        });

        button_lock_2.setEnabled(false);
        final Button button_reveal_deal2 = view.findViewById(R.id.button_reveal_deal2);
        button_reveal_deal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_lock_2.setEnabled(true);
                button_lock_2.setBackgroundResource(R.drawable.unlocked_button);
                button_reveal_deal2.setText("Click the link above to get deals");
                button_reveal_deal2.setBackgroundColor(Color.GRAY);
                button_reveal_deal2.setTextColor(Color.BLACK);
                //copy to clipboard code below
                // ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                // ClipData clip = ClipData.newPlainText("simple text", "BESWEET");
                // clipboard.setPrimaryClip(clip);
                Toast.makeText(getActivity(), "Click the green button above to navigate to the deals", Toast.LENGTH_LONG).show();

                loadFbInterstitalAd1();

            }
        });

        //third deal ********************
        //******************************************************************************************



        final ImageButton button_lock_3 = view.findViewById(R.id.button_lock_3);
        button_lock_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebViewFragment.n = "DEAL3";
                navController.navigate(R.id.action_dealsFragment_to_webViewFragment);
            }
        });
        button_lock_3.setEnabled(false);
        final Button button_reveal_deal3 = view.findViewById(R.id.button_reveal_deal3);
        button_reveal_deal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_lock_3.setEnabled(true);
                button_lock_3.setBackgroundResource(R.drawable.unlocked_button);
                button_reveal_deal3.setText("Click the link above to get deals");
                button_reveal_deal3.setBackgroundColor(Color.GRAY);
                button_reveal_deal3.setTextColor(Color.BLACK);
                //copy to clipboard code below
                // ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                // ClipData clip = ClipData.newPlainText("simple text", "BESWEET");
                // clipboard.setPrimaryClip(clip);
                Toast.makeText(getActivity(), "Click the green button above to navigate to the deals", Toast.LENGTH_LONG).show();


                loadFbInterstitalAd1();
            }
        });


        //Forth deal ********************
        //******************************************************************************************



        final ImageButton button_lock_4 = view.findViewById(R.id.button_lock_4);
        button_lock_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebViewFragment.n = "DEAL4";
                navController.navigate(R.id.action_dealsFragment_to_webViewFragment);
            }

        });
        button_lock_4.setEnabled(false);
        final Button button_reveal_deal4 = view.findViewById(R.id.button_reveal_deal4);
        button_reveal_deal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_lock_4.setEnabled(true);
                button_lock_4.setBackgroundResource(R.drawable.unlocked_button);
                button_reveal_deal4.setText("Click the link above to get deals");
                button_reveal_deal4.setBackgroundColor(Color.GRAY);
                button_reveal_deal4.setTextColor(Color.BLACK);
                //copy to clipboard code below
                // ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                // ClipData clip = ClipData.newPlainText("simple text", "BESWEET");
                // clipboard.setPrimaryClip(clip);
                Toast.makeText(getActivity(), "Click the green button above to navigate to the deals", Toast.LENGTH_LONG).show();



                loadFbInterstitalAd1();
            }
        });

        //Fifth deal ********************
        //******************************************************************************************



        final ImageButton button_lock_5 = view.findViewById(R.id.button_lock_5);
        button_lock_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebViewFragment.n = "DEAL5";
                navController.navigate(R.id.action_dealsFragment_to_webViewFragment);
            }

        });
        button_lock_5.setEnabled(false);
        final Button button_reveal_deal5 = view.findViewById(R.id.button_reveal_deal5);
        button_reveal_deal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_lock_5.setEnabled(true);
                button_lock_5.setBackgroundResource(R.drawable.unlocked_button);
                button_reveal_deal5.setText("Click the link above to get deals");
                button_reveal_deal5.setBackgroundColor(Color.GRAY);
                button_reveal_deal5.setTextColor(Color.BLACK);
                //copy to clipboard code below
                // ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                // ClipData clip = ClipData.newPlainText("simple text", "BESWEET");
                // clipboard.setPrimaryClip(clip);
                Toast.makeText(getActivity(), "Click the green button above to navigate to the deals", Toast.LENGTH_LONG).show();




                loadFbInterstitalAd1();
            }
        });

        //Sixth deal ********************
        //******************************************************************************************



        final ImageButton button_lock_6 = view.findViewById(R.id.button_lock_6);
        button_lock_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebViewFragment.n = "DEAL6";
                navController.navigate(R.id.action_dealsFragment_to_webViewFragment);
            }

        });
        button_lock_6.setEnabled(false);
        final Button button_reveal_deal6 = view.findViewById(R.id.button_reveal_deal6);
        button_reveal_deal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_lock_6.setEnabled(true);
                button_lock_6.setBackgroundResource(R.drawable.unlocked_button);
                button_reveal_deal6.setText("Click the link above to get deals");
                button_reveal_deal6.setBackgroundColor(Color.GRAY);
                button_reveal_deal6.setTextColor(Color.BLACK);
                //copy to clipboard code below
                // ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                // ClipData clip = ClipData.newPlainText("simple text", "BESWEET");
                // clipboard.setPrimaryClip(clip);
                Toast.makeText(getActivity(), "Click the green button above to navigate to the deals", Toast.LENGTH_LONG).show();



                loadFbInterstitalAd1();
            }
        });

        //Sixth deal ********************
        //******************************************************************************************



        final ImageButton button_lock_7 = view.findViewById(R.id.button_lock_7);
        button_lock_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebViewFragment.n = "DEAL7";
                navController.navigate(R.id.action_dealsFragment_to_webViewFragment);
            }

        });
        button_lock_7.setEnabled(false);
        final Button button_reveal_deal7 = view.findViewById(R.id.button_reveal_deal7);
        button_reveal_deal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_lock_7.setEnabled(true);
                button_lock_7.setBackgroundResource(R.drawable.unlocked_button);
                button_reveal_deal7.setText("Click the link above to get deals");
                button_reveal_deal7.setBackgroundColor(Color.GRAY);
                button_reveal_deal7.setTextColor(Color.BLACK);
                //copy to clipboard code below
                // ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                // ClipData clip = ClipData.newPlainText("simple text", "BESWEET");
                // clipboard.setPrimaryClip(clip);
                Toast.makeText(getActivity(), "Click the green button above to navigate to the deals", Toast.LENGTH_LONG).show();



                loadFbInterstitalAd1();
            }
        });


        ////////End of this function
    }








    public void loadFbBannerAd1(View view) {
        //********FACEBOOK BANNER INITIALIZATION
        fb_dealsfragment_banner_ad1 = new AdView(getActivity(), getString(R.string.fbPlacementIdBannerAd1), AdSize.BANNER_HEIGHT_50);


        // Find the Ad Container
        final LinearLayout adContainer = view.findViewById(R.id.fb_container_dealsfragment_ad1);
        // Add the ad view to your activity layout
        adContainer.addView(fb_dealsfragment_banner_ad1);
        // Request an ad
        fb_dealsfragment_banner_ad1.loadAd();

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
        fb_dealsfragment_banner_ad1.loadAd(fb_dealsfragment_banner_ad1.buildLoadAdConfig().withAdListener(adListener).build());
    }



    public void loadFbBannerAd2(View view) {
        //********FACEBOOK BANNER INITIALIZATION
        fb_dealsfragment_banner_ad2 = new AdView(getActivity(), getString(R.string.fbPlacementIdBannerAd1), AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        final LinearLayout adContainer = view.findViewById(R.id.fb_container_dealsfragment_ad2);
        // Add the ad view to your activity layout
        adContainer.addView(fb_dealsfragment_banner_ad2);

        // Request an ad
        fb_dealsfragment_banner_ad2.loadAd();


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
        fb_dealsfragment_banner_ad2.loadAd(fb_dealsfragment_banner_ad2.buildLoadAdConfig().withAdListener(adListener).build());
    }


    public void loadFbBannerAd3(View view) {
        //********FACEBOOK BANNER INITIALIZATION
        fb_dealsfragment_banner_ad3 = new AdView(getActivity(), getString(R.string.fbPlacementIdBannerAd1), AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        final LinearLayout adContainer = view.findViewById(R.id.fb_container_dealsfragment_ad3);
        // Add the ad view to your activity layout
        adContainer.addView(fb_dealsfragment_banner_ad3);
        // Request an ad
        fb_dealsfragment_banner_ad3.loadAd();

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
        fb_dealsfragment_banner_ad3.loadAd(fb_dealsfragment_banner_ad3.buildLoadAdConfig().withAdListener(adListener).build());
    }




    public void loadFbBannerAd4(View view) {
        //********FACEBOOK BANNER INITIALIZATION
        fb_dealsfragment_banner_ad4 = new AdView(getActivity(), getString(R.string.fbPlacementIdBannerAd1), AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        final LinearLayout adContainer = view.findViewById(R.id.fb_container_dealsfragment_ad4);
        // Add the ad view to your activity layout
        adContainer.addView(fb_dealsfragment_banner_ad4);
        // Request an ad
        fb_dealsfragment_banner_ad4.loadAd();


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
        fb_dealsfragment_banner_ad4.loadAd(fb_dealsfragment_banner_ad4.buildLoadAdConfig().withAdListener(adListener).build());
    }




    public void loadFbBannerAd5(View view) {
        //********FACEBOOK BANNER INITIALIZATION
        fb_dealsfragment_banner_ad5 = new AdView(getActivity(), getString(R.string.fbPlacementIdBannerAd1), AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        final LinearLayout adContainer = view.findViewById(R.id.fb_container_dealsfragment_ad5);
        // Add the ad view to your activity layout
        adContainer.addView(fb_dealsfragment_banner_ad5);
        // Request an ad
        fb_dealsfragment_banner_ad5.loadAd();


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
        fb_dealsfragment_banner_ad5.loadAd(fb_dealsfragment_banner_ad5.buildLoadAdConfig().withAdListener(adListener).build());
    }


    public void loadFbBannerAd6(View view) {
        //********FACEBOOK BANNER INITIALIZATION
        fb_dealsfragment_banner_ad6 = new AdView(getActivity(), getString(R.string.fbPlacementIdBannerAd1), AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        final LinearLayout adContainer = view.findViewById(R.id.fb_container_dealsfragment_ad6);
        // Add the ad view to your activity layout
        adContainer.addView(fb_dealsfragment_banner_ad6);
        // Request an ad
        fb_dealsfragment_banner_ad6.loadAd();


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
        fb_dealsfragment_banner_ad6.loadAd(fb_dealsfragment_banner_ad6.buildLoadAdConfig().withAdListener(adListener).build());
    }




    public void loadFbBannerAd7(View view) {
        //********FACEBOOK BANNER INITIALIZATION
        fb_dealsfragment_banner_ad7 = new AdView(getActivity(), getString(R.string.fbPlacementIdBannerAd1), AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        final LinearLayout adContainer = view.findViewById(R.id.fb_container_dealsfragment_ad7);
        // Add the ad view to your activity layout
        adContainer.addView(fb_dealsfragment_banner_ad7);
        // Request an ad
        fb_dealsfragment_banner_ad7.loadAd();


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
        fb_dealsfragment_banner_ad7.loadAd(fb_dealsfragment_banner_ad7.buildLoadAdConfig().withAdListener(adListener).build());
    }




    //facebook interstital ad method
    public void loadFbInterstitalAd1() {

        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback
                Log.e(TAG, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback
                Log.e(TAG, "Interstitial ad dismissed.");
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                // Ad error callback
                Log.e(TAG, "Interstitial ad failed to load: " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Interstitial ad is loaded and ready to be displayed
                Log.d(TAG, "Interstitial ad is loaded and ready to be displayed!");
                // Show the ad
                fb_dealsfragment_interstitial_ad1.show();
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback
                Log.d(TAG, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback
                Log.d(TAG, "Interstitial ad impression logged!");
            }
        };

        // For auto play video ads, it's recommended to load the ad
        // at least 30 seconds before it is shown
        fb_dealsfragment_interstitial_ad1.loadAd(
                fb_dealsfragment_interstitial_ad1.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener)
                        .build());
    }

}

