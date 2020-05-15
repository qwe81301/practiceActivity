package com.exampletest4321;

import java.util.LinkedHashMap;

/**
 * author:       bearshih
 * project:      test
 * date:         2020/5/15
 * version:
 * description:
 */
public class DataBean3 {

    /**
     * rid : 1
     * sDate : 2020/07/30
     * eDate : 2020/08/03
     * date : {"someDate":"123","someDate2":"456"}
     *
     * {
     *    "rid":1,
     *    "sDate":"2020/07/30",
     *    "eDate":"2020/08/03",
     *    "date":{
     *       "someDate":"123",
     *       "someDate2":"456"
     *    }
     * }
     *
     */

    private int rid;
    private String sDate;
    private String eDate;
    //    private DateBean date;
    private LinkedHashMap<String, String> date;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getSDate() {
        return sDate;
    }

    public void setSDate(String sDate) {
        this.sDate = sDate;
    }

    public String getEDate() {
        return eDate;
    }

    public void setEDate(String eDate) {
        this.eDate = eDate;
    }

//    public DateBean getDate() {
//        return date;
//    }
//
//    public void setDate(DateBean date) {
//        this.date = date;
//    }

    public LinkedHashMap<String, String> getDateBean() {
        return date;
    }

    public void setDateBean(LinkedHashMap<String, String> date) {
        this.date = date;
    }
//
//    public static class DateBean {
//        /**
//         * someDate : 123
//         * someDate2 : 456
//         */
//
//        private String someDate;
////        private String someDate2;
//
//        public String getSomeDate() {
//            return someDate;
//        }
//
//        public void setSomeDate(String someDate) {
//            this.someDate = someDate;
//        }
//
////        public String getSomeDate2() {
////            return someDate2;
////        }
////
////        public void setSomeDate2(String someDate2) {
////            this.someDate2 = someDate2;
////        }
//    }
}
