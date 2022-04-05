package com.example.ayelapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentSettings extends Fragment {

    EditText editTextSurname;
    EditText editTextName;
    EditText editTextCity;
    EditText editTextAdress;
    EditText editTextPhone;
    EditText editTextTrustedPhone1;
    EditText editTextTrustedPhone2;
    EditText editTextTrustedPhone3;
    EditText editTextKeyword;
    Button saveButton;
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
        View view= inflater.inflate(R.layout.fragment_settings_layout,container,false);
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        editTextName=view.findViewById(R.id.editTextName);
        editTextSurname=view.findViewById(R.id.editTextSurname);
        editTextCity=view.findViewById(R.id.editTextCity);
        editTextAdress=view.findViewById(R.id.editTextAdress);
        editTextPhone=view.findViewById(R.id.editTextPhone);
        editTextTrustedPhone1=view.findViewById(R.id.editTextTrustedPhone1);
        editTextTrustedPhone2=view.findViewById(R.id.editTextTrustedPhone2);
        editTextTrustedPhone3=view.findViewById(R.id.editTextTrustedPhone3);
        editTextKeyword=view.findViewById(R.id.editTextKeyword);
        saveButton=view.findViewById(R.id.buttonSaveSettings);


        sharedpreferences= getActivity().getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);

        String name=sharedpreferences.getString(KEY_NAME,null);
        if(name!=null) editTextName.setText(name);

        String surname=sharedpreferences.getString(KEY_SURNAME,null);
        if(surname!=null) editTextSurname.setText(surname);

        String city=sharedpreferences.getString(KEY_CITY,null);
        if(city!=null) editTextCity.setText(city);

        String address=sharedpreferences.getString(KEY_ADDRESS,null);
        if(address!=null) editTextAdress.setText(address);

        String phone=sharedpreferences.getString(KEY_PHONE,null);
        if(phone!=null) editTextPhone.setText(phone);

        String trustedphone1=sharedpreferences.getString(KEY_TRUSTEDPHONE1,null);
        if(trustedphone1!=null) editTextTrustedPhone1.setText(trustedphone1);

        String trustedphone2=sharedpreferences.getString(KEY_TRUSTEDPHONE2,null);
        if(trustedphone2!=null) editTextTrustedPhone2.setText(trustedphone2);

        String trustedphone3=sharedpreferences.getString(KEY_TRUSTEDPHONE3,null);
        if(trustedphone3!=null) editTextTrustedPhone3.setText(trustedphone3);

        String keyword=sharedpreferences.getString(KEY_KEYWORD,null);
        if(keyword!=null) editTextKeyword.setText(keyword);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editTextName.getText().toString().equals("") || editTextSurname.getText().toString().equals("") || editTextCity.getText().toString().equals("")
                || editTextPhone.getText().toString().equals("") || editTextTrustedPhone1.getText().toString().equals("") || editTextKeyword.getText().toString().equals(""))
                {Toast.makeText(getContext(), "Fill all required forms", Toast.LENGTH_SHORT).show();}
                else {
                SharedPreferences.Editor editor= sharedpreferences.edit();
                editor.putString(KEY_NAME,editTextName.getText().toString());
                editor.putString(KEY_SURNAME,editTextSurname.getText().toString());
                editor.putString(KEY_CITY,editTextCity.getText().toString());
                editor.putString(KEY_ADDRESS,editTextAdress.getText().toString());
                editor.putString(KEY_PHONE,editTextPhone.getText().toString());
                editor.putString(KEY_TRUSTEDPHONE1,editTextTrustedPhone1.getText().toString());
                editor.putString(KEY_TRUSTEDPHONE2,editTextTrustedPhone2.getText().toString());
                editor.putString(KEY_TRUSTEDPHONE3,editTextTrustedPhone3.getText().toString());
                editor.putString(KEY_KEYWORD,editTextKeyword.getText().toString());
                editor.apply();
                    Toast.makeText(getContext(), "Data successfully saved", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
