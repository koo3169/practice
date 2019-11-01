package com.test.kootest.kootest.item;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by well-0530 on 2016-06-03.
 */
public class BoardListItem implements Parcelable {

    private String GroupNm;
    private String GroupCd;
    private String CustId;
    private String CustNm;
    private String CIdx;
    private String BIdx;
    private String BWriteId;
    private String BWriteName;
    private String BContent;
    private String BWriteDay;
    private String BVisitCount;
    private String Section;
    private String SectionIdx;
    private String SectionMsg;
    private String RIdx;
    private String RWriteId;
    private String RWriteName;
    private String RContent;
    private String RWriteDay;
    private String RVisitCount;
    private String OrderDate;
    private String BAdminId;
    private String RAdminId;
    private String PhotoFile;
    private String VisitCount;
    private String AttachPhotoFile;
    private String RAttachFile;
    private String ImageCount;

    public BoardListItem() {
        super();
    }

    protected BoardListItem(Parcel in) {
        GroupNm = in.readString();
        GroupCd = in.readString();
        CustId = in.readString();
        CustNm = in.readString();
        CIdx = in.readString();
        BIdx = in.readString();
        BWriteId = in.readString();
        BWriteName = in.readString();
        BContent = in.readString();
        BWriteDay = in.readString();
        BVisitCount = in.readString();
        Section = in.readString();
        SectionIdx = in.readString();
        SectionMsg = in.readString();
        RIdx = in.readString();
        RWriteId = in.readString();
        RWriteName = in.readString();
        RContent = in.readString();
        RWriteDay = in.readString();
        RVisitCount = in.readString();
        OrderDate = in.readString();
        BAdminId = in.readString();
        RAdminId = in.readString();
        PhotoFile = in.readString();
        VisitCount = in.readString();
        AttachPhotoFile = in.readString();
        RAttachFile = in.readString();
        ImageCount = in.readString();
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
        dest.writeString(CIdx);
        dest.writeString(BIdx);
        dest.writeString(BWriteId);
        dest.writeString(BWriteName);
        dest.writeString(BContent);
        dest.writeString(BWriteDay);
        dest.writeString(BVisitCount);
        dest.writeString(Section);
        dest.writeString(SectionIdx);
        dest.writeString(SectionMsg);
        dest.writeString(RIdx);
        dest.writeString(RWriteId);
        dest.writeString(RWriteName);
        dest.writeString(RContent);
        dest.writeString(RWriteDay);
        dest.writeString(RVisitCount);
        dest.writeString(OrderDate);
        dest.writeString(BAdminId);
        dest.writeString(RAdminId);
        dest.writeString(PhotoFile);
        dest.writeString(VisitCount);
        dest.writeString(AttachPhotoFile);
        dest.writeString(RAttachFile);
        dest.writeString(ImageCount);
    }

    @SuppressWarnings("unused")
    public static final Creator<BoardListItem> CREATOR = new Creator<BoardListItem>() {
        @Override
        public BoardListItem createFromParcel(Parcel in) {
            return new BoardListItem(in);
        }

        @Override
        public BoardListItem[] newArray(int size) {
            return new BoardListItem[size];
        }
    };


    public String getVisitCount() {
        return VisitCount;
    }

    public void setVisitCount(String visitCount) {
        VisitCount = visitCount;
    }

    public String getPhotoFile() {
        return PhotoFile;
    }

    public void setPhotoFile(String photoFile) {
        PhotoFile = photoFile;
    }

    public String getCIdx() {
        return CIdx;
    }

    public void setCIdx(String CIdx) {
        this.CIdx = CIdx;
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

    public String getBIdx() {
        return BIdx;
    }

    public void setBIdx(String BIdx) {
        this.BIdx = BIdx;
    }

    public String getBWriteId() {
        return BWriteId;
    }

    public void setBWriteId(String BWriteId) {
        this.BWriteId = BWriteId;
    }

    public String getBWriteName() {
        return BWriteName;
    }

    public void setBWriteName(String BWriteName) {
        this.BWriteName = BWriteName;
    }

    public String getBContent() {
        return BContent;
    }

    public void setBContent(String BContent) {
        this.BContent = BContent;
    }

    public String getBWriteDay() {
        return BWriteDay;
    }

    public void setBWriteDay(String BWriteDay) {
        this.BWriteDay = BWriteDay;
    }

    public String getBVisitCount() {
        return BVisitCount;
    }

    public void setBVisitCount(String BVisitCount) {
        this.BVisitCount = BVisitCount;
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

    public String getSectionMsg() {
        return SectionMsg;
    }

    public void setSectionMsg(String sectionMsg) {
        SectionMsg = sectionMsg;
    }

    public String getRIdx() {
        return RIdx;
    }

    public void setRIdx(String RIdx) {
        this.RIdx = RIdx;
    }

    public String getRWriteId() {
        return RWriteId;
    }

    public void setRWriteId(String RWriteId) {
        this.RWriteId = RWriteId;
    }

    public String getRWriteName() {
        return RWriteName;
    }

    public void setRWriteName(String RWriteName) {
        this.RWriteName = RWriteName;
    }

    public String getRContent() {
        return RContent;
    }

    public void setRContent(String RContent) {
        this.RContent = RContent;
    }

    public String getRWriteDay() {
        return RWriteDay;
    }

    public void setRWriteDay(String RWriteDay) {
        this.RWriteDay = RWriteDay;
    }

    public String getRVisitCount() {
        return RVisitCount;
    }

    public void setRVisitCount(String RVisitCount) {
        this.RVisitCount = RVisitCount;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
    }

    public String getBAdminId() {
        return BAdminId;
    }

    public void setBAdminId(String BAdminId) {
        this.BAdminId = BAdminId;
    }

    public String getRAdminId() {
        return RAdminId;
    }

    public void setRAdminId(String RAdminId) {
        this.RAdminId = RAdminId;
    }

    public String getAttachPhotoFile() {
        return AttachPhotoFile;
    }

    public void setAttachPhotoFile(String attachPhotoFile) {
        AttachPhotoFile = attachPhotoFile;
    }

    public String getRAttachFile() {
        return RAttachFile;
    }

    public void setRAttachFile(String RAttachFile) {
        this.RAttachFile = RAttachFile;
    }

    public String getImageCount() {
        return ImageCount;
    }

    public void setImageCount(String imageCount) {
        ImageCount = imageCount;
    }
}
