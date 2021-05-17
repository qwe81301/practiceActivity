package com.exampletest4321;

import java.util.List;

/**
 * author:       bearshih
 * project:      test
 * date:         2021/5/14
 * version:
 * description:
 */
public class ListDataBean {
    /**
     * title : 喪假3日
     * value : 32小時
     * list : [{"sDate":"2019/03/05 08:30","eDate":"2019/03/05 18:00","hours":"8小時"},{"sDate":"2019/09/16 00:00","eDate":"2019/09/17 00:00","hours":"8小時"},{"sDate":"2019/09/17 00:00","eDate":"2019/09/19 08:00","hours":"8小時"},{"sDate":"2019/09/17 00:00","eDate":"2019/09/19 08:00","hours":"8小時"}]
     */

    private String title;
    private String value;
    private List<ListBean> list;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * sDate : 2019/03/05 08:30
         * eDate : 2019/03/05 18:00
         * hours : 8小時
         */

        private String sDate;
        private String eDate;
        private String hours;

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

        public String getHours() {
            return hours;
        }

        public void setHours(String hours) {
            this.hours = hours;
        }
    }
}
