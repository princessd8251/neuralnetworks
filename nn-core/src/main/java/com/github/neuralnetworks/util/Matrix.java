package com.github.neuralnetworks.util;

/**
 * Simple matrix representation with one-dimensional array. This is required,
 * because Aparapi supports only one-dim arrays (otherwise the execution is
 * transferred to the cpu)
 */
public class Matrix extends Tensor {

    private static final long serialVersionUID = 1L;

    public Matrix() {
	super();
    }

    public Matrix(float[] elements, int columns) {
	super(elements, elements.length / columns, columns);
    }

    public Matrix(int rows, int columns) {
	super(rows, columns);
    }

    public Matrix(Matrix copy) {
	super(copy.getRows(), copy.getColumns());
    }

    public Matrix(Tensor parent, int[] dimStart, int[] dimEnd) {
	super(parent, dimStart, dimEnd);
    }

    public int getColumns() {
	return getDimension(1);
    }

    public int getRows() {
	return getDimension(0);
    }

    public void set(int row, int column, float value) {
	super.set(value, row, column);
    }
}
