package com.example.zaid.forrest;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.zaid.forrest.Models.SharedPrefsHelper;
import com.example.zaid.forrest.Models.UserClass;
import com.example.zaid.forrest.Models.UserResponse;
import com.matrixdev.game.apimanagerlib.web.ApiManager;
import com.matrixdev.game.apimanagerlib.web.ServerResponseListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment implements ServerResponseListener{

    Button loginButton, registerButton;
    EditText editUser, editPass;
    MainActivity activity;
    String user, pass;
    private View rootView;
    private UserClass userClass;
    private ArrayList<String> dataList;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        activity = (MainActivity) getActivity();
        dataList = new ArrayList<>();

        rootView = inflater.inflate(R.layout.fragment_login, container, false);
        init();
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = editUser.getText().toString();
                pass = editPass.getText().toString();
                getParams(user, pass);
                /*dataList.add("id" +String.valueOf(userClass.getId()));
                dataList.add("Name" +userClass.getName());
                dataList.add("Bio: " +userClass.getBio());
                dataList.add("Active: " +String.valueOf(userClass.getActive()));
                Toast.makeText(activity, dataList.get(0).toString(), Toast.LENGTH_SHORT).show();*/
                //login(dataList);

            }
        });

        UserClass userClass = SharedPrefsHelper.getLoginData();
        if (userClass!=null){
            dataList = savetoList(dataList, userClass);
            login(dataList);
        }
        return rootView;
    }

    private void login(ArrayList<String> dataList) {
        Intent intent = new Intent(activity, DataActivity.class);
        intent.putStringArrayListExtra("dataList", dataList);
        //Toast.makeText(activity, dataList.get(0).toString(), Toast.LENGTH_SHORT).show();
        startActivity(intent);
        activity.finish();

    }

    @Override
    public void positiveResponse(String s, String s1) {

    }

    @Override
    public void positiveResponse(String s, Object o) {
        if (s.equals("login")){
            UserResponse userResponse = (UserResponse) o;

            if (userResponse.success){
                userClass = userResponse.getData();

                /*dataList.add("id: " +String.valueOf(userClass.getId()));
                dataList.add("Name: " +userClass.getName());
                dataList.add("Bio: " +userClass.getBio());
                dataList.add("Active: " +String.valueOf(userClass.getActive()));*/

                dataList = savetoList(dataList, userClass);

                SharedPrefsHelper.saveLoginData(userClass);
                login(dataList);
                //Toast.makeText(activity, dataList.get(0).toString(), Toast.LENGTH_SHORT).show();

                //String data  = userResponse.getData().toString();
                //dataList = (ArrayList<String>) Arrays.asList(data);
                //Toast.makeText(activity, "Hello", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void negativeResponse(String s, String s1) {

    }


    public ArrayList<String> savetoList(ArrayList<String> dataList, UserClass userClass){
        dataList.add("id: " +String.valueOf(userClass.getId()));
        dataList.add("Name: " +userClass.getName());
        dataList.add("Bio: " +userClass.getBio());
        dataList.add("Active: " +String.valueOf(userClass.getActive()));
        return dataList;
    }


    private void getParams(String user, String pass){
        ApiManager apiManager = new ApiManager(activity, this);

        apiManager.doJsonParsing(true);
        apiManager.setClassTypeForJson(UserResponse.class);

        HashMap<String, String> param = new HashMap<>();

        param.put("username",user /*"03911604416"*/);
        param.put("password", pass /*"vagish"*/);
        apiManager.getStringPostResponse("login", "http://ec2-18-218-121-20.us-east-2.compute.amazonaws.com/testing/bvicam/public/index.php/user/login", param);
    }
    public void init(){
        loginButton = rootView.findViewById(R.id.loginButton);
        registerButton = rootView.findViewById(R.id.registerButton);
        editUser = rootView.findViewById(R.id.editUser);
        editPass = rootView.findViewById(R.id.editPass);
        editPass.setText("vagish");
        editUser.setText("03911604416");


    }

}
