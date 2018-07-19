package com.example.pushnotiuni;

import com.google.firebase.iid.FirebaseInstanceIdService;

public class ToDoInstanceIdService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        ToDoActivity.registerPush();
    }
}