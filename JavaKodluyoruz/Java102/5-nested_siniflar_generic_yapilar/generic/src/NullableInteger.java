public class NullableInteger {
    private final Integer value;

    public NullableInteger(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
    /* set metodu yazilmaz hata alinir. cunku final tanimladik
    public void setValue(String value) {
        this.value = value;
    } */

    public boolean isNull() {
        return this.getValue() == null;
    }

    public void run() {
        if (isNull()) {
            System.out.println("bu degiskene deger atanmamistir");
        } else {
            System.out.println(this.getValue());
        }

    }

}
