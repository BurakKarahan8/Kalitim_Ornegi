public class Calisan {
    protected String AdSoyad, Telefon, Eposta;

    public Calisan(String adSoyad, String telefon, String eposta) {
        AdSoyad = adSoyad;
        Telefon = telefon;
        Eposta = eposta;
    }

    public String giris() {
        return AdSoyad + " giriş yaptı";
    }

    public void cikis() {
        System.out.println("çıkış yapıldı !");
    }

    public void yemek() {
        System.out.println("yemek hakkı kullanıldı !");
    }


    public String getAdSoyad() {
        return AdSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        AdSoyad = adSoyad;
    }

    public String getTelefon() {
        return Telefon;
    }

    public void setTelefon(String telefon) {
        Telefon = telefon;
    }

    public String getEposta() {
        return Eposta;
    }

    public void setEposta(String eposta) {
        Eposta = eposta;
    }
}
