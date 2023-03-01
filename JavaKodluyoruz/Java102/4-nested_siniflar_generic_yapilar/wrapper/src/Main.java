public class Main {
    public static void main(String[] args) {
        String a = "20";
        System.out.println(Integer.parseInt(a)); //integer veri tipine cevirir

        // int b = 20; boyle yazsaydik hata alirdik
        Integer b = 20;
        String str = b.toString();
        System.out.println(str); //Stringe cevirdik


        int c = 10;
        Integer d = c;
        int e = d;
        String stringD = d.toString();
        
    }
}
