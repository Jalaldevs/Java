package Parking;

import java.time.LocalDate;

// IF OWNER BEING VIP DOESNT EVER CHANGE THEN VALIDATION MUST BE AFTER CONSTUCTOR ELSE IN METHOD
// IF TYPE OF VEHICLES DIFFER IN ATTRIBUTE AND METHODS ARE KIND OF USELESS THEN ENUM

public abstract class Vehiculo {

    // ENUM

    public enum VehiculoType {
        MOTO,
        COCHE,
        FURGON
    }

    // ATRIBUTES

    private String matricula;
    private VehiculoType type;
    private double pricePerHour;
    private String entryDate;
    private String entryTime;
    private String exitDate;
    private String exitTime;
    private boolean ownerIsVip;

    // CONSTRUCTOR

    public Vehiculo(String matricula, VehiculoType type, double pricePerHour, String entryDate, String entryTime, boolean ownerIsVip) {

        // VALIDACIONES

        // ENTRY

        String firstGroup = "";
        firstGroup += entryDate.substring(0,entryDate.indexOf("/"));
        int numericFirstGroup = Integer.parseInt(firstGroup);

        if ( numericFirstGroup < 1 || numericFirstGroup > 31 ) {
            throw new IllegalArgumentException("Invalid date");
        }

        String secondGroup = "";
        secondGroup += entryDate.substring(entryDate.indexOf("/") + 1, entryDate.lastIndexOf("/"));
        int numericSecondGroup = Integer.parseInt(secondGroup);

        if ( numericSecondGroup < 1 || numericSecondGroup > 12 ) {
            throw new IllegalArgumentException("Invalid date");
        }

        int currentYear = LocalDate.now().getYear();
        String yearString = entryDate.substring(entryDate.lastIndexOf("/") + 1);
        int numericYear = Integer.parseInt(yearString);

        if (numericYear != currentYear) {
            throw new IllegalArgumentException("Year must be " + currentYear);
        }

        this.matricula = matricula;
        this.type = type;
        this.pricePerHour = pricePerHour;
        this.entryDate = entryDate;
        this.entryTime = entryTime;
        this.ownerIsVip = ownerIsVip; // 50% OFF

        if (this.type == VehiculoType.MOTO) {
            this.pricePerHour = 2.5;
        } else if ( this.type == VehiculoType.COCHE ) {
            this.pricePerHour = 5;
        } else if (this.type == VehiculoType.FURGON) {
            this.pricePerHour = 7.5;
        }

    }

    // GETTERS AND SETTERS

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public boolean isOwnerIsVip() {
        return ownerIsVip;
    }

    public void setOwnerIsVip(boolean ownerIsVip) {
        this.ownerIsVip = ownerIsVip;
    }

    // METHODS

    public double getPricePerHourFinal() {
        if (ownerIsVip) return pricePerHour / 2;
        return pricePerHour;
    }




}
