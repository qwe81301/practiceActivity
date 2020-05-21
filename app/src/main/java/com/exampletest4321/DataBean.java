package com.exampletest4321;

import java.util.List;

/**
 * author:       bearshih
 * project:      test
 * date:         2019/8/28
 * version:
 * description:
 * EX:
 * {"color":"str"}
 */
public class DataBean {


    /**
     * rid : 1
     * sDate : 2020/07/30
     * eDate : 2020/08/03
     * date : {"realDate":{"myScj":{"ctm27":[{"cName":"APP測試石","sNo":3438},{"cName":"APP測試蕉","sNo":3435}]},"other":{"ck7":[{"cName":"APP測試蕉","sNo":3435}],"leave":[{"cName":"石晉宇A","sNo":3211}]}}}
     */

    private int rid;
    private String sDate;
    private String eDate;
    private DateBean date;

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

    public DateBean getDate() {
        return date;
    }

    public void setDate(DateBean date) {
        this.date = date;
    }

    public static class DateBean {
        /**
         * realDate : {"myScj":{"ctm27":[{"cName":"APP測試石","sNo":3438},{"cName":"APP測試蕉","sNo":3435}]},"other":{"ck7":[{"cName":"APP測試蕉","sNo":3435}],"leave":[{"cName":"石晉宇A","sNo":3211}]}}
         */

        private RealDateBean realDate;

        public RealDateBean getRealDate() {
            return realDate;
        }

        public void setRealDate(RealDateBean realDate) {
            this.realDate = realDate;
        }

        public static class RealDateBean {

        }
    }
}
