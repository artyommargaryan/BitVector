import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitVectorTests {
    @Test
    public void bitVectorGetSizeTest() {
        BitVector bitVector = new BitVector(16);
        assertEquals(16, bitVector.getSize());
        BitVector bitVector1 = new BitVector(13);
        assertEquals(13, bitVector1.getSize());
    }

    @Test
    public void bitVectorSetTest() {
        BitVector bitVector = new BitVector(14);
        byte[] bytes = bitVector.getBitVec();
        bitVector.set(1);
        assertEquals(2, bytes[1]);
        bitVector.set(8);
        assertEquals(1, bytes[0]);
        try {
            bitVector.set(14);
            System.out.println("ERROR: Exception didn't catch for 15");
        } catch (BitVectorIndexOutOfBoundsException e) {
            System.out.println("OK: Exception caught for 15");
        }

        try {
            bitVector.set(-1);
            System.out.println("ERROR: Exception didn't catch for -1");
        } catch (BitVectorIndexOutOfBoundsException e) {
            System.out.println("OK: Exception caught for -1");
        }
    }

    @Test
    public void bitVectorResetTest() {
        BitVector bitVector = new BitVector(14);
        byte[] bytes = bitVector.getBitVec();
        bitVector.reset(1);
        assertEquals(0,bytes[1]);
        bitVector.set(0);
        bitVector.set(1);
        bitVector.reset(1);
        assertEquals(1, bytes[1]);
        bitVector.set(9);
        bitVector.set(10);
        bitVector.reset(9);
        assertEquals(4, bytes[0]);
        try {
            bitVector.set(15);
            System.out.println("ERROR: Exception didn't catch for 15");
        } catch (BitVectorIndexOutOfBoundsException e) {
            System.out.println("OK: Exception caught for 15");
        }

        try {
            bitVector.set(-1);
            System.out.println("ERROR: Exception didn't catch for -1");
        } catch (BitVectorIndexOutOfBoundsException e) {
            System.out.println("OK: Exception caught for -1");
        }
    }
}
