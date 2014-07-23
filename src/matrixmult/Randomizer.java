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
public class Randomizer<T extends Number> {

    enum Type {

        BigDecimal, BigInteger, Byte, Double, Float, Integer, Long, Short
    }

    public Randomizer(Type type) {
        this.type = type;
    }

    private final Type type;

    public T nextRand() {
        Random rnd = new Random();
        T result;
        switch (type) {
            case Integer:
                result= rnd.nextInt();
                break;
            case BigDecimal:
                break;
            case BigInteger:
                break;
            case Byte:
                break;
            case Double:
                break;
            case Float:
                break;
            case Long:
                break;
            case Short:
                break;

        }
        return null;
    }
;

}
