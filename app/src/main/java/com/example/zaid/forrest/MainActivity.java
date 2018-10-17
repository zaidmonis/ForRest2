package com.example.zaid.forrest;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.matrixdev.game.apimanagerlib.web.ApiManager;
import com.matrixdev.game.apimanagerlib.web.ServerResponseListener;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*ApiManager apiManager = new ApiManager(this, this );
        apiManager.doJsonParsing(true);
        apiManager.setClassTypeForJson(RestData.class);
        apiManager.getStringGetResponse("A", "localhost");*/

        init();
        moveToLogin();


    }

    public void moveToLogin(){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        LoginFragment loginFragment = new LoginFragment();
        fragmentTransaction.replace(R.id.frame,loginFragment).commit();
    }
    private void init(){
        fragmentManager = getSupportFragmentManager();
    }
}
