public class araba {
    private String renk;
    private String marka;
    private int model;

public static int arabasayisi;
    public araba(String renk, String marka_durumu, int model_durumu) {
        this.renk = renk;
        this.marka = marka;
        this.model = model;
        arabasayisi++;

    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getRenk() {

        return renk;
    }

    public String getMarka() {
        return marka;
    }

    public int getModel() {
        return model;
    }
}

