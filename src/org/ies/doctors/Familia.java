package org.ies.doctors;

import java.util.Objects;

 public class Familia extends Medicos {
    private String centroSalud;

    public Familia(String nombre, String apellidos, String numeroColegiado, String[] pacientes, String centroSalud) {
        super(nombre, apellidos, numeroColegiado, pacientes);
        this.centroSalud = centroSalud;
    }

    @Override
    public void showMoreInfo() {
        System.out.println("Info. adicional:" + centroSalud);
    }

    @Override
    public boolean trabajaEnHospital() {
        return false;
    }

    public String getCentroSalud() {
        return centroSalud;
    }

    public void setCentroSalud(String centroSalud) {
        this.centroSalud = centroSalud;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Familia familia = (Familia) o;
        return Objects.equals(centroSalud, familia.centroSalud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), centroSalud);
    }

    @Override
    public String toString() {
        return "Familia{" +
                "centroSalud='" + centroSalud + '\'' +
                '}';
    }
}