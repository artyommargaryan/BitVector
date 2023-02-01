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

    public void set(int position) {
        if (position < 0 || position >= size){
            throw new BitVectorIndexOutOfBoundsException(position);
        }

        int sec = length - (position / 8) - 1;
        byte changer = (byte) 1;
        while (position >= 8) {
            position -= 8;
        }

        bitVec[sec] |= (byte) (changer << position);
    }

    public void reset(int position) {
        if (position < 0 || position >= size){
            throw new BitVectorIndexOutOfBoundsException(position);
        }

        int sec = length - (position / 8) - 1;
        byte changer = (byte) 1;
        while (position >= 8) {
            position -= 8;
        }

        bitVec[sec] = (byte) ~((~bitVec[sec]) | (changer << position));
    }
}
