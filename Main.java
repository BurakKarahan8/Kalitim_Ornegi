public class Main {
    public static void main(String[] args) {
        Asistan berkay = new Asistan("Berkay Karahan", "05550002233", "b@gmail.com", "Matematik",
                "Asistan", "MAT101", "Matematik yl");
        System.out.println (berkay.getAdSoyad() + " adlı çalışanın görevi: " + berkay.getGorev());
        berkay.quizleriOku();
        OgretimUyesi baki = new OgretimUyesi("Baki Karahan", "05550002288", "baki@gmail.com", "Fizik",
                "Öğretim üyesi", "FİZ101", "Yar. Doç.");
        System.out.println(baki.giris());
    }
}