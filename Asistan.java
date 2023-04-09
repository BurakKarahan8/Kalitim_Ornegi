public class Asistan extends Akademisyen {
    protected String YuksekLisans;

    public Asistan(String adSoyad, String telefon, String eposta, String bolum,
                   String gorev, String dersler, String yuksekLisans) {
        super(adSoyad, telefon, eposta, bolum, gorev, dersler);
        YuksekLisans = yuksekLisans;
    }

    public void lablaraGir() {
        System.out.println("lablara girildi !");
    }

    public void quizleriOku() {
        System.out.println("quizleri oku !");
    }


    public String getYuksekLisans() {
        return YuksekLisans;
    }

    public void setYuksekLisans(String yuksekLisans) {
        YuksekLisans = yuksekLisans;
    }
}
