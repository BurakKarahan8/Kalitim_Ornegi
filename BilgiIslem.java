public class BilgiIslem extends Memurlar {
    protected String Gorev;

    public BilgiIslem(String adSoyad, String telefon, String eposta, String departman, String mesai, String gorev) {
        super(adSoyad, telefon, eposta, departman, mesai);
        Gorev = gorev;
    }

    public void tarama() {
        System.out.println("tarandı !");
    }

    public String getGorev() {
        return Gorev;
    }

    public void setGorev(String gorev) {
        Gorev = gorev;
    }
}
