public class Nullable<T> { // T olmak zorunda degil herahangi bir simge alabilir
    private final T value;

    public Nullable(T value) {
        this.value = value;
    }
    public T getValue(){
        return this.value;
    }
    public boolean isNull(){
        return this.getValue() == null;
    }
    public void  run(){
        if (isNull()){
            System.out.println("Bu degiskene deger atanmamistir");
        }else{
            System.out.println(this.getValue());
        }
    }
}

