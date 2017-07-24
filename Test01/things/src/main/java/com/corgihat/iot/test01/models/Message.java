package com.corgihat.iot.test01.models;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Marshall on 7/19/2017.
 */

// [START comment_class]
@IgnoreExtraProperties
public class Message {
    public String uid;
    public String message;
    public String to;
    public String from;
    public boolean urgent;

    public Message() {
        // Default constructor required for calls to DataSnapshot.getValue(Message.class)
    }

    public Message(String uid, String message, String to, String from, boolean urgent) {
        this.uid = uid;
        this.message = message;
        this.to = to;
        this.from = from;
        this.urgent = urgent;
    }
}
