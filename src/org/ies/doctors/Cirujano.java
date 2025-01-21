package org.ies.doctors;

import java.util.Objects;

public class Cirujano extends Medicos {
    private String hospital;
    private int numeroBox;

     public Cirujano(String nombre, String apellidos, String numeroColegiado, String[] pacientes, String hospital, int numeroBox) {
         super(nombre, apellidos, numeroColegiado, pacientes);
         this.hospital = hospital;
         this.numeroBox = numeroBox;
     }

     @Override
    public void showMoreInfo() {
         System.out.println("Info. adicional:" + hospital +" "+ numeroBox);
    }

    @Override
    public boolean trabajaEnHospital() {
        return true;
    }

     public String getHospital() {
         return hospital;
     }

     public void setHospital(String hospital) {
         this.hospital = hospital;
     }

     public int getNumeroBox() {
         return numeroBox;
     }

     public void setNumeroBox(int numeroBox) {
         this.numeroBox = numeroBox;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cirujano cirujano = (Cirujano) o;
        return numeroBox == cirujano.numeroBox && Objects.equals(hospital, cirujano.hospital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hospital, numeroBox);
    }

    @Override
    public String toString() {
        return "Cirujano{" +
                "hospital='" + hospital + '\'' +
                ", numeroBox=" + numeroBox +
                '}';
    }
}
