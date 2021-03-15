package com.subwaysandwichesdelivery.specialsdealscoupons.ui.contactus;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.subwaysandwichesdelivery.specialsdealscoupons.R;

public class ContactUsFragment extends Fragment {

    private ContactUsViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(ContactUsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_contactus, container, false);
   //     final TextView textView = root.findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
   //             textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {


        final NavController navController = Navigation.findNavController(view);




        ImageView button1 = view.findViewById(R.id.imageView_contact_us);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendSMS();

                return;

            }
        });


        ImageView button2 = view.findViewById(R.id.imageView_contact_us_email);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendEMAIL();

                return;

            }
        });



    }


    private void getDefaultShareIntent() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String shareBody = getString(R.string.contact_us_text_message);
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(intent, "Share via"));
        return;

    }




    public void sendSMS()
    {
        Uri uri = Uri.parse("smsto:3104980346");
        Intent it = new Intent(Intent.ACTION_SENDTO, uri);
        final Intent sms_body = it.putExtra("sms_body", getString(R.string.contact_us_text_message));
        startActivity(it);
    }

    public void sendEMAIL()
    {
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{ "emailappsupport@icloud.com"});
        email.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.email_message_subject));
        email.putExtra(Intent.EXTRA_TEXT, getString(R.string.email_message_body));

//need this to prompts email client only
        email.setType("message/rfc822");

        startActivity(Intent.createChooser(email, "Choose an Email client :"));
    }





}
