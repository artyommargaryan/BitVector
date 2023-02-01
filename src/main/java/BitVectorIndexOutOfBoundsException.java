public class BitVectorIndexOutOfBoundsException extends IndexOutOfBoundsException {
    BitVectorIndexOutOfBoundsException() {
    }

    BitVectorIndexOutOfBoundsException(String s) {
        super(s);
    }

    BitVectorIndexOutOfBoundsException(int index) {
        super("BitVector index out of range: " + index);
    }

    BitVectorIndexOutOfBoundsException(long index) {
        super("BitVector index out of range: " + index);
    }
}
