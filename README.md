# BitVector

A Java class that implements a sequence of bits and provides methods for manipulating individual bits in the sequence.

## Features

- Initializes the `BitVector` with a specified size
- Provides methods for setting and resetting individual bits in the sequence
- Throws an exception if an attempt is made to set or reset a bit outside the bounds of the `BitVector`
- Provides getters for the `bitVec` and `size` fields

## Usage

To use the `BitVector` class, create an instance of the class with the desired size:

BitVector bitVector = new BitVector(64);


Use the `set` method to set a specific bit in the `BitVector`:

bitVector.set(12);


Use the `reset` method to reset a specific bit in the `BitVector`:

bitVector.reset(12);


Access the `byte` array representing the bits with the `getBitVec` method:

byte[] bitVec = bitVector.getBitVec();


Access the size of the `BitVector` with the `getSize` method:

int size = bitVector.getSize();

## Note

An attempt to set or reset a bit outside the bounds of the `BitVector` will result in an exception to type `BitVectorIndexOutOfBoundsException` being thrown.
