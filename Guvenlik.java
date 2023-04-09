public class Guvenlik extends Memurlar {
    protected String Belge;

    public Guvenlik(String adSoyad, String telefon, String eposta, String departman, String mesai, String belge) {
        super(adSoyad, telefon, eposta, departman, mesai);
        Belge = belge;
    }

    public void nobet() {
        System.out.println("nöbet tutuldu !");
    }

    public String getBelge() {
        return Belge;
    }

    public void setBelge(String belge) {
        Belge = belge;
    }
}
