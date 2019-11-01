package com.test.kootest.kootest.item;

/**
 * Created by well-0530 on 2016-05-09.
 */
public class AttendItem {

    private String AtdDate;
    private String AtdTime;
    private String Attend;
    private String AttendInfo;
    private String Flag;
    private String HolidayTitle;
    private String Msg;
    private String GroupNm;
    private String CustNm;
    private String BusIn;
    private String BusOut;

    public String getBusIn() {
        return BusIn;
    }

    public void setBusIn(String busIn) {
        BusIn = busIn;
    }

    public String getBusOut() {
        return BusOut;
    }

    public void setBusOut(String busOut) {
        BusOut = busOut;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public String getGroupNm() {
        return GroupNm;
    }

    public void setGroupNm(String groupNm) {
        GroupNm = groupNm;
    }

    public String getCustNm() {
        return CustNm;
    }

    public void setCustNm(String custNm) {
        CustNm = custNm;
    }

    public String getFlag() {
        return Flag;
    }

    public void setFlag(String flag) {
        Flag = flag;
    }

    public String getHolidayTitle() {
        return HolidayTitle;
    }

    public void setHolidayTitle(String holidayTitle) {
        HolidayTitle = holidayTitle;
    }

    public String getAtdDate() {
        return AtdDate;
    }

    public void setAtdDate(String atdDate) {
        AtdDate = atdDate;
    }

    public String getAtdTime() {
        return AtdTime;
    }

    public void setAtdTime(String atdTime) {
        AtdTime = atdTime;
    }

    public String getAttend() {
        return Attend;
    }

    public void setAttend(String attend) {
        Attend = attend;
    }

    public String getAttendInfo() {
        return AttendInfo;
    }

    public void setAttendInfo(String attendInfo) {
        AttendInfo = attendInfo;
    }
}
