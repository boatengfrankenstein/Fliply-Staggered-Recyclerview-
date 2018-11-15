package model;

/**
 * Created by wolfsoft4 on 21/9/18.
 */

public class Search_Results_Fliply_Model {
    Integer bitmap5,imgrs;
    String txtdji,txtprice;

    public Integer getBitmap5() {
        return bitmap5;
    }

    public void setBitmap5(Integer bitmap5) {
        this.bitmap5 = bitmap5;
    }

    public Integer getImgrs() {
        return imgrs;
    }

    public void setImgrs(Integer imgrs) {
        this.imgrs = imgrs;
    }

    public String getTxtdji() {
        return txtdji;
    }

    public void setTxtdji(String txtdji) {
        this.txtdji = txtdji;
    }

    public String getTxtprice() {
        return txtprice;
    }

    public void setTxtprice(String txtprice) {
        this.txtprice = txtprice;
    }

    public Search_Results_Fliply_Model(Integer bitmap5, Integer imgrs, String txtdji, String txtprice) {
        this.bitmap5 = bitmap5;
        this.imgrs = imgrs;
        this.txtdji = txtdji;
        this.txtprice = txtprice;
    }
}
