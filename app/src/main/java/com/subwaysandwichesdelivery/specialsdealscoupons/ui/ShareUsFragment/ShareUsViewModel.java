package com.subwaysandwichesdelivery.specialsdealscoupons.ui.ShareUsFragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShareUsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ShareUsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is ShareUsFragment fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}