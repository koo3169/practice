package com.test.kootest.kootest.item;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by well-0530 on 2016-06-02.
 */
public class BoardGroupItem implements Parcelable {
    private String GroupNm;
    private String GroupCd;
    private String CustId;
    private String CustNm;
    private String Section;
    private String SectionIdx;
    private String NotiGroupNm;
    private String CIdx;
    private String BIdx;
    private String RegYear;
    private String RegSeq;
    private String SectionMsg;
    private String PhotoFile;

    public BoardGroupItem() {
        super();
    }

    protected BoardGroupItem(Parcel in) {
        GroupNm = in.readString();
        GroupCd = in.readString();
        CustId = in.readString();
        CustNm = in.readString();
        Section = in.readString();
        SectionIdx = in.readString();
        NotiGroupNm = in.readString();
        CIdx = in.readString();
        BIdx = in.readString();
        RegYear = in.readString();
        RegSeq = in.readString();
        SectionMsg = in.readString();
        PhotoFile = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(GroupNm);
        dest.writeString(GroupCd);
        dest.writeString(CustId);
        dest.writeString(CustNm);
        dest.writeString(Section);
        dest.writeString(SectionIdx);
        dest.writeString(NotiGroupNm);
        dest.writeString(CIdx);
        dest.writeString(BIdx);
        dest.writeString(RegYear);
        dest.writeString(RegSeq);
        dest.writeString(SectionMsg);
        dest.writeString(PhotoFile);
    }

    @SuppressWarnings("unused")
    public static final Creator<BoardGroupItem> CREATOR = new Creator<BoardGroupItem>() {
        @Override
        public BoardGroupItem createFromParcel(Parcel in) {
            return new BoardGroupItem(in);
        }

        @Override
        public BoardGroupItem[] newArray(int size) {
            return new BoardGroupItem[size];
        }
    };


    public String getPhotoFile() {
        return PhotoFile;
    }

    public void setPhotoFile(String photoFile) {
        PhotoFile = photoFile;
    }

    public String getSectionMsg() {
        return SectionMsg;
    }

    public void setSectionMsg(String sectionMsg) {
        SectionMsg = sectionMsg;
    }

    public String getRegYear() {
        return RegYear;
    }

    public void setRegYear(String regYear) {
        RegYear = regYear;
    }

    public String getRegSeq() {
        return RegSeq;
    }

    public void setRegSeq(String regSeq) {
        RegSeq = regSeq;
    }

    public String getCIdx() {
        return CIdx;
    }

    public void setCIdx(String CIdx) {
        this.CIdx = CIdx;
    }

    public String getBIdx() {
        return BIdx;
    }

    public void setBIdx(String BIdx) {
        this.BIdx = BIdx;
    }

    public String getNotiGroupNm() {
        return NotiGroupNm;
    }

    public void setNotiGroupNm(String notiGroupNm) {
        NotiGroupNm = notiGroupNm;
    }

    public String getGroupNm() {
        return GroupNm;
    }

    public void setGroupNm(String groupNm) {
        GroupNm = groupNm;
    }

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

    public String getCustNm() {
        return CustNm;
    }

    public void setCustNm(String custNm) {
        CustNm = custNm;
    }


    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    public String getSectionIdx() {
        return SectionIdx;
    }

    public void setSectionIdx(String sectionIdx) {
        SectionIdx = sectionIdx;
    }
}
