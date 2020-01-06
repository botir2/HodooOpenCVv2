package com.ahqlab.hodooopencv.util;

import android.arch.lifecycle.LiveData;
import android.provider.ContactsContract;
import com.ahqlab.hodooopencv.domain.HsvValue;

import java.util.List;

public class ColorDetectorControllerForAndroid {

    StandardHsvMapper standardHsvMapper;

    public HsvValue detector (HsvValue hsv){
        System.err.println("hsv : " +hsv);


        HsvValue result = new HsvValue();

        int sg = getFindNearHsg(hsv.getSg());
        result.setSg(String.valueOf(sg));


        int ph = getFindNearHph(hsv.getPh());
        result.setPh(String.valueOf(ph));


        int leu = getFindNearHleu(hsv.getLeu());
        result.setLeu(String.valueOf(leu));


        int nit = getFindNearHnit(hsv.getNit());
        result.setNit(String.valueOf(nit));


        int pro = getFindNearHpro(hsv.getPro());
        result.setPro(String.valueOf(pro));


        int glu = getFindNearHglu(hsv.getGlu());
        result.setGlu(String.valueOf(glu));


        int ket = getFindNearHket(hsv.getKet());
        result.setKet(String.valueOf(ket));


        int ubg = getFindNearVubg(hsv.getUbg());
        result.setUbg(String.valueOf(ubg));


        int bil = getFindNearHbil(hsv.getBil());
        result.setBil(String.valueOf(bil));


        int ery = getFindNearVery(hsv.getEry());
        result.setEry(String.valueOf(ery));


        int hb = getFindNearHhb(hsv.getHb());
        result.setHb(String.valueOf(hb));

        return result;
    }




    public Integer getFindNearHsg(String value) {
        int colors[] = { strSpriterOfH("18/151/88"), strSpriterOfH("35/98/72"), strSpriterOfH("67/83/97"),
                strSpriterOfH("84/112/100"), strSpriterOfH("95/197/127"), strSpriterOfH("97/175/162"),
                strSpriterOfH("101/168/176") };
        int sg = getNear(colors, strSpriterOfH(value));
        return getIndexOf(sg, colors);
    }

    public Integer getFindNearHph(String value) {
        int colors[] = { strSpriterOfH("109/162/185"), strSpriterOfH("100/131/189"), strSpriterOfH("87/128/159"),
                strSpriterOfH("57/57/131"), strSpriterOfH("24/148/116"), strSpriterOfH("0/0/0"),
                strSpriterOfH("0/0/0") };
        int sg = getNear(colors, strSpriterOfH(value));
        return getIndexOf(sg, colors);
    }

    public Integer getFindNearHleu(String value) {
        int colors[] = { strSpriterOfH("93/30/183"), strSpriterOfH("100/25/181"), strSpriterOfH("136/16/169"),
                strSpriterOfH("158/52/160"), strSpriterOfH("0/0/0"), strSpriterOfH("0/0/0"),
                strSpriterOfH("0/0/0") };
        int sg = getNear(colors, strSpriterOfH(value));
        return getIndexOf(sg, colors);
    }

    public Integer getFindNearHnit(String value) {
        int colors[] = { strSpriterOfH("118/151/88"), strSpriterOfH("108/23/180"), strSpriterOfH("0/0/0"),
                strSpriterOfH("0/0/0"), strSpriterOfH("0/0/0"), strSpriterOfH("0/0/0"),
                strSpriterOfH("0/0/0") };
        int sg = getNear(colors, strSpriterOfH(value));
        return getIndexOf(sg, colors);
    }

    public Integer getFindNearHpro(String value) {
        int colors[] = { strSpriterOfH("118/17348/17244"), strSpriterOfH("82/146/156"), strSpriterOfH("70/94/138"),
                strSpriterOfH("49/92/110"), strSpriterOfH("0/0/0"), strSpriterOfH("0/0/0"),
                strSpriterOfH("0/0/0") };
        int sg = getNear(colors, strSpriterOfH(value));
        return getIndexOf(sg, colors);
    }

    public Integer getFindNearHglu(String value) {
        int colors[] = { strSpriterOfH("90/180/173"), strSpriterOfH("79/214/160"), strSpriterOfH("73/165/155"),
                strSpriterOfH("51/161/121"), strSpriterOfH("32/176/66"), strSpriterOfH("0/0/0"),
                strSpriterOfH("0/0/0") };
        int sg = getNear(colors, strSpriterOfH(value));
        return getIndexOf(sg, colors);
    }

    public Integer getFindNearHket(String value) {
        int colors[] = { strSpriterOfH("97/95/178"), strSpriterOfH("121/57/165"), strSpriterOfH("142/115/117"),
                strSpriterOfH("159/129/76"), strSpriterOfH("0/0/0"), strSpriterOfH("0/0/0"),
                strSpriterOfH("0/0/0") };
        int sg = getNear(colors, strSpriterOfH(value));
        return getIndexOf(sg, colors);
    }

    public Integer getFindNearVubg(String value) {
        int colors[] = { strSpriterOfH("108/45/173"), strSpriterOfH("115/80/176"), strSpriterOfH("115/104/178"),
                strSpriterOfH("120/135/176"), strSpriterOfH("121/155/165"), strSpriterOfH("0/0/0"),
                strSpriterOfH("0/0/0") };
        int sg = getNear(colors, strSpriterOfV(value));
        return getIndexOf(sg, colors);
    }


    public Integer getFindNearHbil(String value) {
        int colors[] = { strSpriterOfH("96/100/168"), strSpriterOfH("99/66/169"), strSpriterOfH("107/103/162"),
                strSpriterOfH("114/110/161"), strSpriterOfH("0/0/0"), strSpriterOfH("0/0/0"),
                strSpriterOfH("0/0/0") };
        int sg = getNear(colors, strSpriterOfH(value));
        return getIndexOf(sg, colors);
    }


    public Integer getFindNearVery(String value) {
        int colors[] = { strSpriterOfH("93/254/171"), strSpriterOfH("92/253/162"), strSpriterOfH("90/252/147"),
                strSpriterOfH("88/252/135"), strSpriterOfH("73/248/106"), strSpriterOfH("0/0/0"),
                strSpriterOfH("0/0/0") };
        int sg = getNear(colors, strSpriterOfV(value));
        return getIndexOf(sg, colors);
    }

    public Integer getFindNearHhb(String value) {
        int colors[] = { strSpriterOfH("0/0/0"), strSpriterOfH("88/254/143"), strSpriterOfH("75/173/131"),
                strSpriterOfH("63/123/106"), strSpriterOfH("37/139/70"), strSpriterOfH("0/0/0"),
                strSpriterOfH("0/0/0") };
        int sg = getNear(colors, strSpriterOfH(value));
        return getIndexOf(sg, colors);
    }

    private Integer getIndexOf(int toSearch, int[] tab) {
        int i = 0;
        while (!(tab[i] == toSearch)) {
            i++;
        }
        return i; // or return tab[i];
    }

    // get the H value
    private Integer strSpriterOfH(String str) {
        String[] array = str.split("/");
        return Integer.parseInt(array[0]);
    }

    // get the V value
    private Integer strSpriterOfV(String str) {
        String[] array = str.split("/");
        return Integer.parseInt(array[2]);
    }


    private int getNear(int[] data, int near) {
        int min = Integer.MAX_VALUE; // Minimum value of reference data-Enter the maximum value of Interger type.
        int nearData = 0; //Variable to store close value
        // 2. process
        for (int i = 0; i < data.length; i++) {
            int a = Math.abs(data[i] - near); // Take an absolute value.
            if (min > a) {
                min = a;
                nearData = data[i];
            }
        }
        // 3. Print
       // System.out.println(near + "에 근접한 값 : " + nearData);
        return nearData;
    }

}
