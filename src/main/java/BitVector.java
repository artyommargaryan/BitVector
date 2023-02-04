public class BitVector {
    private final byte[] bitVec;
    private final int size;
    private final int length;

    public BitVector(int size) {
        this.size = size;
        if (size % 8 == 0) {
            this.length = size / 8;
        } else {
            this.length = size / 8 + 1;
        }

        bitVec = new byte[this.length];
    }

    public byte[] getBitVec() {
        return bitVec;
    }

    public int getSize() {
        return size;
    }

    public void set(int bitIndex) {
        if (bitIndex < 0 || bitIndex >= size) {
            throw new BitVectorIndexOutOfBoundsException(bitIndex);
        }

        int index = length - (bitIndex / 8) - 1;
        bitIndex %= 8;

        bitVec[index] |= (1 << bitIndex);
    }

    public void reset(int bitIndex) {
        if (bitIndex < 0 || bitIndex >= size) {
            throw new BitVectorIndexOutOfBoundsException(bitIndex);
        }

        int index = length - (bitIndex / 8) - 1;
        bitIndex %= 8;

        bitVec[index] &= ~(1 << bitIndex);
    }
}
