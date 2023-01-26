public class MyList<T> {

    private Object[] arr;
    private int capacity;
    private int index = 0;

    public MyList() {
        this.capacity = 10;
        this.arr = new Object[capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.arr = new Object[capacity];
    }

    public int size() {
        int size = 0;
        for (Object element : arr) {
            if (element != null) {
                size++;
            }
        }
        return size;
    }

    public int getCapacity() {
        return arr.length;
    }

    public void add(T data) {
        if (index == arr.length) {
            Object[] tempArr = new Object[this.getCapacity() * 2];
            for (int i = 0; i < this.arr.length; i++) {
                tempArr[i] = arr[i];
            }
            this.arr = tempArr;
        }
        arr[this.index++] = data;
    }

    public Object get(int index) {
        if (index < 0 || index >= arr.length) {
            return null;
        } else {
            return arr[index];
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= arr.length) {
            arr[index] = null;
        } else {
            for (int k = index; k < arr.length - 1; k++) {
                arr[index] = arr[index + 1];
            }
            this.index--;
        }
    }

    public void set(int index, T data) {
        if (index < 0 || index >= arr.length) {
            arr[index] = null;
        } else {
            arr[index] = data;
        }
    }

    public String toString() {
        int count = 0;
        String print = "[";

        for (Object element : arr) {
            if (element != null)
                count++;
            if (element == null)
                continue;
            print += count != this.size() ? element + "," : element;
        }
        print += "]";
        return print;
    }

    public int indexOf(T data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        int indexOfData = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == data) {
                return i;
            }
        }
        return indexOfData;
    }

    public boolean isEmpty() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                return false;
            }
        }
        return true;
    }

    public Object[] toArray() {
        Object[] tempArray = new Object[this.getCapacity()];
        for (int i = 0; i < this.getCapacity(); i++) {
            tempArray[i] = this.get(i);
        }
        return tempArray;

    }

    public void clear() {
        for (int k = 0; k < arr.length; k++) {
            arr[k] = null;
        }
    }

    public MyList<T> sublist(int start, int finish) {
        MyList<T> sublist = new MyList<>();
        for (int i = start; i <= finish; i++) {
            sublist.add((T) this.get(i));
        }
        return sublist;
    }

    public boolean contains(T data) {
        return this.indexOf(data) != -1;
    }
}