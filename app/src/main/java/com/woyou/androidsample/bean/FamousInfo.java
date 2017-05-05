package com.woyou.androidsample.bean;

import java.util.List;

/**
 * Created by Xiho on 2016/3/14.
 */
public class FamousInfo {

    /**
     * total : 227
     * result : [{"famous_name":"车尔尼雪夫斯基","famous_saying":"非凡的单纯，非凡的明确\u2014\u2014这是天才的智慧的最可惊人的品质。"},{"famous_name":"约·德莱顿","famous_saying":"天才在社会生活中往往显得迟钝而"},{"famous_name":"雨果","famous_saying":"敢于冲撞命运才是天才"},{"famous_name":"卡莱尔","famous_saying":"所谓天才，就是比任何人都先抵挡痛苦的经验本领。"},{"famous_name":"林肯","famous_saying":"卓越的天才不屑走一条人家走过的路。他寻找迄今没有开拓过的地区。"},{"famous_name":"席勒","famous_saying":"产生天才的土壤比天才还要难找"},{"famous_name":"爱因斯坦","famous_saying":"任何天才不能在孤独的状态中发展"},{"famous_name":"民谚","famous_saying":"名人的古怪行为是天才的标志，凡人的古怪行为是神经出了毛病"},{"famous_name":"鲁迅","famous_saying":"哪里有天才，我是把别人喝咖啡的工夫都用在了工作上了。"},{"famous_name":"塞涅夫","famous_saying":"没有某些发狂的劲头，就没有天才。"},{"famous_name":"狄德罗","famous_saying":"精神的浩瀚想象的活跃心灵的勤奋：就是天才。"},{"famous_name":"爱默生","famous_saying":"平凡的人希望，天才的人创造。"},{"famous_name":"契诃夫","famous_saying":"真正的天才是常常隐藏在群众里面，绝不挤向人前去露脸的。"},{"famous_name":"别林斯基","famous_saying":"任何天才，不经过艰苦不断的劳动，不经过最使空想家头疼和懊恼的最初纯物质和机械的劳动，就无法精通任何种类的艺术。"},{"famous_name":"杨格","famous_saying":"我愿意以天才比美德，以学问比财富。如美德越少的人，越需要财富，天才越低的人，越需要学问。"},{"famous_name":"巴尔扎克","famous_saying":"职业尽管不同，但天才的品德并无分别。"},{"famous_name":"恩格斯","famous_saying":"逆境使天才脱颖而出，顺境会埋没"},{"famous_name":"巴尔扎克","famous_saying":"破坏的人和建设的人，两者都是意志的现象：一个是准备工作，另一个是完成工作；前者好像是一个恶的天才，后者似乎是一个善的天才；对这一个给予光荣，对另一个给予忘却。恶者哇啦哇啦，把庸俗的人们从梦里惊醒，对他佩服得五体投地，可是善者却一直默不作声。"},{"famous_name":"培根","famous_saying":"如果孩子确有某种超群的天才，那当然应该扶植发展。但就一般情况说，下面这句格言很有用的：\u201c长期的训练会通过适应化难为易。\u201d"},{"famous_name":"爱迪生","famous_saying":"天才是百分之一的灵感，百分之九十九的血汗。"}]
     * error_code : 0
     * reason : Succes
     */

    private int total;
    private int error_code;
    private String reason;
    /**
     * famous_name : 车尔尼雪夫斯基
     * famous_saying : 非凡的单纯，非凡的明确——这是天才的智慧的最可惊人的品质。
     */

    private List<ResultEntity> result;

    public void setTotal(int total) {
        this.total = total;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setResult(List<ResultEntity> result) {
        this.result = result;
    }

    public int getTotal() {
        return total;
    }

    public int getError_code() {
        return error_code;
    }

    public String getReason() {
        return reason;
    }

    public List<ResultEntity> getResult() {
        return result;
    }

    public static class ResultEntity {
        private String famous_name;
        private String famous_saying;

        public void setFamous_name(String famous_name) {
            this.famous_name = famous_name;
        }

        public void setFamous_saying(String famous_saying) {
            this.famous_saying = famous_saying;
        }

        public String getFamous_name() {
            return famous_name;
        }

        public String getFamous_saying() {
            return famous_saying;
        }
    }

    @Override
    public String toString() {
        return "FamousInfo{" +
                "total=" + total +
                ", error_code=" + error_code +
                ", reason='" + reason + '\'' +
                ", result=" + result +
                '}';
    }
}
