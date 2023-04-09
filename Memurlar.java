public class Memurlar extends Calisan {
    protected String Departman, Mesai;

    public Memurlar(String adSoyad, String telefon, String eposta, String departman, String mesai) {
        super(adSoyad, telefon, eposta);
        Departman = departman;
        Mesai = mesai;
    }

    public void calis() {
        System.out.println("çalışıldı !");
    }


    public String getDepartman() {
        return Departman;
    }

    public void setDepartman(String departman) {
        Departman = departman;
    }

    public String getMesai() {
        return Mesai;
    }

    public void setMesai(String mesai) {
        Mesai = mesai;
    }
}

