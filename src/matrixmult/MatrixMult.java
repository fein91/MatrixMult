/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmult;

import java.util.Random;

/**
 *
 * @author otatarik
 */
public class MatrixMult {

    private <T extends Number> T[][] createMatrix(int size, String type) {
        T[][] matrix = (T[][]) new Object[size][size];
        Randomizer<Integer> rand = new Randomizer<Integer>(Randomizer.Type.Integer);

        for (int i = 0; i < size; i++) {
            
        }
        return null;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {1, 2, 3}};
        int[][] matrixB = {{3, 2, 1}, {6, 5, 4}, {3, 2, 1}};
        int[][] result = new int[3][3];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                result[i][j] = matrixA[i][0] * matrixB[0][j]
                        + matrixA[i][1] * matrixB[1][j]
                        + matrixA[i][2] * matrixB[2][j];

                System.out.print(matrixA[i][0] + "*" + matrixB[0][j]
                        + "+" + matrixA[i][1] + "*" + matrixB[1][j]
                        + "+" + matrixA[i][2] + "*" + matrixB[2][j] + " ");
                //System.out.println("result[" + i + "][" + j + "]=" + result[i][j]);
            }
            System.out.println("");
        }

        for (int k = 0; k < result.length; k++) {
            for (int l = 0; l < result.length; l++) {
                System.out.print(result[k][l] + " ");
            }
            System.out.println("");
        }
    }

}

// 1 2 3        3 2 1
// 4 5 6        6 5 4
// 1 2 3        3 2 1
//
//          
//          00                      01                      02
// a00*b00+a01*b10+a02*b20 a00*b01+a01*b11+a02*b21 a00*b02+a01*b12+a02*b22
//          10                      11                      12
// a10*b00+a11*b10+a12*b20 a10*b01+a11*b11+a12*b21 a10*b02+a11*b12+a12*b22
//
//          20                      21                      22
// 1*3+2*6+3*3 1*2+2*5+3*2 1*1+2*4+3*1
// 4*3+5*6+6*3 4*2+5*5+6*2 4*1+5*4+6*1
// 1*3+2*6+3*3 1*2+2*5+3*2 1*1+2*4+3*1
