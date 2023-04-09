public class OgretimUyesi extends Akademisyen {
    protected String Unvan;

    public OgretimUyesi(String adSoyad, String telefon, String eposta, String bolum,
                        String gorev, String dersler, String unvan) {
        super(adSoyad, telefon, eposta, bolum, gorev, dersler);
        Unvan = unvan;
    }

    public void toplantiyaGir() {
        System.out.println("toplantıya girildi !");
    }

    public void sinavlariOku() {
        System.out.println("sınavlar okundu !");
    }
    public String giris(){
        return Unvan + " " + super.giris();
    }


    public String getUnvan() {
        return Unvan;
    }

    public void setUnvan(String unvan) {
        Unvan = unvan;
    }
}
