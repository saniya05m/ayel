package com.example.ayelapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.telephony.SmsManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentMain extends Fragment {
    Button sosbtn;
    EditText editTextMessageContent;
    SharedPreferences sharedpreferences;
    private static final String SHARED_PREF_NAME="mypref";
    private static final String KEY_NAME="name";
    private static final String KEY_SURNAME="surname";
    private static final String KEY_CITY="city";
    private static final String KEY_ADDRESS="address";
    private static final String KEY_PHONE="phone";
    private static final String KEY_TRUSTEDPHONE1="trustedphone1";
    private static final String KEY_TRUSTEDPHONE2="trustedphone2";
    private static final String KEY_TRUSTEDPHONE3="trustedphone3";
    private static final String KEY_KEYWORD="keyword";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main_layout,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sosbtn=view.findViewById(R.id.buttonSos);
        editTextMessageContent=view.findViewById(R.id.editTextMessageContent);
        sosbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg=editTextMessageContent.getText().toString();
                sharedpreferences= getActivity().getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
                String number= sharedpreferences.getString(KEY_TRUSTEDPHONE1,null);
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(number,null,msg,null,null);

            }
        });


    }

}
