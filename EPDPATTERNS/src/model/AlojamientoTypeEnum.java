package model;

/**
 *
 * @author Manuel
 */
public enum AlojamientoTypeEnum {
    HOTEL,
    APARTAMENTO;

    public String toString() {
        String typeString = null;
        switch (this) {
            case HOTEL:
                typeString = "Hotel";
                break;
            case APARTAMENTO:
                typeString = "Apartamento";
                break;

        }
        return typeString;
    }

}
