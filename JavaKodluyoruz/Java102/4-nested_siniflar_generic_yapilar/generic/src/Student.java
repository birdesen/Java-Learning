public class Student<T> implements IDatabase<T> {
    @Override
    public boolean insert(T data) {
        System.out.println("Ekleme islemi oldu");
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("Veri cikarildi");
        return true;
    }

    @Override
    public boolean update(T data) {
        System.out.println("Veri guncelendi");
        return true;
    }

    @Override
    public T select() {
        System.out.println("Veri cekildi");
        return null;
    }
}
