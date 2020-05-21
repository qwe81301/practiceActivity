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
public class DataBean2 {


    /**
     * rid : 1
     * sDate : 2020/07/30
     * eDate : 2020/08/03
     * date : {"someDate":{"myScj":{"ctm27":[{"cName":"APP測試石","sNo":3438},{"cName":"APP測試蕉","sNo":3435}]}}}
     */

    private int rid;
    private String sDate;
    private String eDate;
//    private DateBean date;

    private LinkedHashMap<String, DateBean> date;

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

    public LinkedHashMap<String, DateBean> getDateBean() {
        return date;
    }

    public void setDateBean(LinkedHashMap<String, DateBean> date) {
        this.date = date;
    }

    public static class DateBean {
        /**
         * someDate : {"myScj":{"ctm27":[{"cName":"APP測試石","sNo":3438},{"cName":"APP測試蕉","sNo":3435}]}}
         */

//        private SomeDateBean someDate;

        private LinkedHashMap<String, SomeDateBean> someDate;

//        public SomeDateBean getSomeDate() {
//            return someDate;
//        }
//
//        public void setSomeDate(SomeDateBean someDate) {
//            this.someDate = someDate;
//        }

        public LinkedHashMap<String, SomeDateBean> getSomeDateBean() {
            return someDate;
        }

        public void setSomeDateBean(LinkedHashMap<String, SomeDateBean> someDate) {
            this.someDate = someDate;
        }


        public static class SomeDateBean {
            /**
             * myScj : {"ctm27":[{"cName":"APP測試石","sNo":3438},{"cName":"APP測試蕉","sNo":3435}]}
             */

            private MyScjBean myScj;

            public MyScjBean getMyScj() {
                return myScj;
            }

            public void setMyScj(MyScjBean myScj) {
                this.myScj = myScj;
            }

            public static class MyScjBean {
                private List<Ctm27Bean> ctm27;

                public List<Ctm27Bean> getCtm27() {
                    return ctm27;
                }

                public void setCtm27(List<Ctm27Bean> ctm27) {
                    this.ctm27 = ctm27;
                }

                public static class Ctm27Bean {
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
        }
    }
}
