package com.test.kootest.kootest.item;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by well-0530 on 2016-10-19.
 */
public class ARSItem implements Parcelable {

    private String GroupCd;
    private String CustId;
    private String Status;

    public ARSItem() {
        super();
    }

    protected ARSItem(Parcel in) {
        GroupCd = in.readString();
        CustId = in.readString();
        Status = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(GroupCd);
        dest.writeString(CustId);
        dest.writeString(Status);
    }

    @SuppressWarnings("unused")
    public static final Creator<ARSItem> CREATOR = new Creator<ARSItem>() {
        @Override
        public ARSItem createFromParcel(Parcel in) {
            return new ARSItem(in);
        }

        @Override
        public ARSItem[] newArray(int size) {
            return new ARSItem[size];
        }
    };

    public String getGroupCd() {
        return GroupCd;
    }

    public void setGroupCd(String groupCd) {
        GroupCd = groupCd;
    }

    public String getCustId() {
        return CustId;
    }

    public void setCustId(String custId) {
        CustId = custId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
