package edu.bilkent.findatutor.models;

import java.util.Date;
/**
 * Created by linus on 08.07.2016.
 */


public class Message {
    private String mText;
    private String mSender;
    private Date mDate;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getSender() {return mSender;}

    public void setSender(String sender) {
        mSender = sender;
    }
}
