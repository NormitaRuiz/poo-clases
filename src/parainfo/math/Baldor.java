package parainfo.math;

public class Baldor {

    private static final Double IGV = 0.18d;

    public static Double suma(Object... args) {
        Double sum = 0d;

        for (Object arg : args) {

            Double x = aDouble(arg);

            if (x != null) {
                sum += x;
            } else {
                sum = null;
                break;
            }
        }

        return sum;
    }

    public static Double resta(Object a, Object b) {
        Double x = aDouble(a);
        Double y = aDouble(b);

        Double result = (x != null && y != null) ? x - y : null;
        return result;
    }

    public static Double multiplica(Object a, Object b) {
        Double x = aDouble(a);
        Double y = aDouble(b);

        Double result = (x != null && y != null) ? x * y : null;
        return result;
    }

    public static Double divide(Object a, Object b) {
        Double x = aDouble(a);
        Double y = aDouble(b);

        Double result = (x != null && y != null) ? x / y : null;
        return result;
    }

    public static Double modulo(Object a, Object b) {
        Double x = aDouble(a);
        Double y = aDouble(b);

        Double result = (x != null && y != null) ? x % y : null;
        return result;
    }

    public static Double promedio(Object... args) {
        Double sum = 0d;

        for (Object arg : args) {

            Double x = aDouble(arg);

            if (x != null) {
                sum += x;
            } else {
                sum = null;
                break;
            }
        }

        if (sum != null) {
            sum /= args.length;
        }

        return sum;
    }

    public static Double maximo(Object... args) {
        Double max = Double.NEGATIVE_INFINITY;

        for (Object arg : args) {

            Double x = aDouble(arg);

            if (x != null) {
                max = (x > max) ? x : max;
            } else {
                max = null;
                break;
            }
        }

        return max;
    }

    public static Double minimo(Object... args) {
        Double min = Double.POSITIVE_INFINITY;

        for (Object arg : args) {

            Double x = aDouble(arg);

            if (x != null) {
                min = (x < min) ? x : min;
            } else {
                min = null;
                break;
            }
        }

        return min;
    }

    public static Double porcentaje(Object monto, Object porciento) { // porciento: [0, 100]
        Double m = aDouble(monto);
        Double p = aDouble(porciento);

        Double result = (m != null && p != null) ? m * p / 100 : null;
        return result;
    }

    public static Double igv(Object monto) {
        Double m = aDouble(monto);

        Double result = m != null ? m * IGV : null;
        return result;
    }

    public static Double aDouble(Object obj) {
        Double result = null;

        try {
            result = Double.valueOf(obj.toString());
        } catch (NumberFormatException | NullPointerException e) {
        }

        return result;
    }

    public static Integer aInteger(Object obj) {
        Integer result = null;

        try {
            result = Integer.valueOf(obj.toString());
        } catch (NumberFormatException | NullPointerException e) {
        }

        return result;
    }
}
