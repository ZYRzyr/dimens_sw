package com.example.lib.constants;


public enum DimenTypes {

    //适配Android 3.2以上   大部分手机的sw值集中在  300-460之间
    DP_sw__200(200),
    DP_sw__210(210),
    DP_sw__220(220),
    DP_sw__230(230),
    DP_sw__240(240),
    DP_sw__250(250),
    DP_sw__260(260),
    DP_sw__270(270),
    DP_sw__280(280),
    DP_sw__290(290),
    DP_sw__300(300),
    DP_sw__310(310),
    DP_sw__320(320),
    DP_sw__330(330),
    DP_sw__340(340),
    DP_sw__350(350),
    DP_sw__360(360),
    DP_sw__370(370),
    DP_sw__380(380),
    DP_sw__390(390),
    DP_sw__400(400),
    DP_sw__410(410),
    DP_sw__420(420),
    DP_sw__430(430),
    DP_sw__440(440),
    DP_sw__450(450),
    DP_sw__460(460),
    DP_sw__470(470),
    DP_sw__480(480),
    DP_sw__490(490),
    DP_sw__500(500),
    DP_sw__510(510),
    DP_sw__520(520),
    DP_sw__530(530),
    DP_sw__540(540),
    DP_sw__550(550),
    DP_sw__560(560),
    DP_sw__570(570),
    DP_sw__580(580),
    DP_sw__590(590),
    DP_sw__600(600),
    DP_sw__610(610),
    DP_sw__620(620),
    DP_sw__630(630),
    DP_sw__640(640),
    DP_sw__650(650),
    DP_sw__660(660),
    DP_sw__670(670),
    DP_sw__680(680),
    DP_sw__690(690),
    DP_sw__700(700),
    DP_sw__710(710),
    DP_sw__720(720),
    DP_sw__730(730),
    DP_sw__740(740),
    DP_sw__750(750),
    DP_sw__760(760),
    DP_sw__770(770),
    DP_sw__780(780),
    DP_sw__790(790),
    DP_sw__800(800);
    // 想生成多少自己以此类推


    /**
     * 屏幕最小宽度
     */
    private int swWidthDp;


    DimenTypes(int swWidthDp) {

        this.swWidthDp = swWidthDp;
    }

    public int getSwWidthDp() {
        return swWidthDp;
    }

    public void setSwWidthDp(int swWidthDp) {
        this.swWidthDp = swWidthDp;
    }

}
