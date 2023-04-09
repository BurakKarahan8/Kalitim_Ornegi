public class Akademisyen extends Calisan {
    protected String Bolum, Gorev, Dersler;

    public Akademisyen(String adSoyad, String telefon, String eposta,
                       String bolum, String gorev, String dersler) {
        super(adSoyad, telefon, eposta);
        Bolum = bolum;
        Gorev = gorev;
        Dersler = dersler;
    }

    public void derseGir() {
        System.out.println("derse girildi !");
    }
    public String giris(){
        return super.giris() + " A kapısından !";
    }


    public String getBolum() {
        return Bolum;
    }

    public void setBolum(String bolum) {
        Bolum = bolum;
    }

    public String getGorev() {
        return Gorev;
    }

    public void setGorev(String gorev) {
        Gorev = gorev;
    }

    public String getDersler() {
        return Dersler;
    }

    public void setDersler(String dersler) {
        Dersler = dersler;
    }
}
