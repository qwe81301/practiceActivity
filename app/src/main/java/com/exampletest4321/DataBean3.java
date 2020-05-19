package com.exampletest4321;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * author:       bearshih
 * project:      test
 * date:         2020/5/15
 * version:
 * description:
 */
public class DataBean3 {

    private int rid;
    private String sDate;
    private String eDate;
    private String name;
    private String intro;
    private LinkedHashMap<String, MyScjAndOtherBean> date;
    private LinkedHashMap<String, ClassListBean> classList;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public LinkedHashMap<String, MyScjAndOtherBean> getDateBean() {
        return date;
    }

    public void setDateBean(LinkedHashMap<String, MyScjAndOtherBean> date) {
        this.date = date;
    }

    public LinkedHashMap<String, ClassListBean> getClassListBean() {
        return classList;
    }

    public void setClassListBean(LinkedHashMap<String, ClassListBean> classList) {
        this.classList = classList;
    }

    public static class MyScjAndOtherBean {

        private LinkedHashMap<String, List<CNameAndSNo>> myScj;
        private LinkedHashMap<String, List<CNameAndSNo>> other;

        public LinkedHashMap<String, List<CNameAndSNo>> getMyScj() {
            return myScj;
        }

        public void setMyScj(LinkedHashMap<String, List<CNameAndSNo>> myScj) {
            this.myScj = myScj;
        }

        public LinkedHashMap<String, List<CNameAndSNo>> getOther() {
            return other;
        }

        public void setOther(LinkedHashMap<String, List<CNameAndSNo>> other) {
            this.other = other;
        }


        public static class CNameAndSNo {
            /**
             * cName : APP測試石
             * sNo : 3438
             */

            private String cName;
            private int sNo;

            public String getCName() {
                return cName;
            }

            public void setCName(String cName) {
                this.cName = cName;
            }

            public int getSNo() {
                return sNo;
            }

            public void setSNo(int sNo) {
                this.sNo = sNo;
            }
        }

    }


    public static class ClassListBean {

        /**
         * color : #3278f0
         * data : 【08:30~12:00】+【18:06~次日03:30】+【次日05:00~次日06:00】,【12:00~13:30】+【次日04:00~次日04:30】,13小時54分鐘
         * name : APP_班別_次日_
         */

        private String color;
        private String data;
        private String name;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

}
