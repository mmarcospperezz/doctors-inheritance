package org.ies.doctors;

import java.util.Objects;

public class Podologo extends Medicos {
    private String hospital;
    private String planta;

     public Podologo(String nombre, String apellidos, String numeroColegiado, String[] pacientes, String hospital, String planta) {
         super(nombre, apellidos, numeroColegiado, pacientes);
         this.hospital = hospital;
         this.planta = planta;
     }

     @Override
    public void showMoreInfo() {
         System.out.println("Info. adicional:" + hospital +" "+ planta);
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

     public String getPlanta() {
         return planta;
     }

     public void setPlanta(String planta) {
         this.planta = planta;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Podologo podologo = (Podologo) o;
        return Objects.equals(hospital, podologo.hospital) && Objects.equals(planta, podologo.planta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hospital, planta);
    }

    @Override
    public String toString() {
        return "Podologo{" +
                "hospital='" + hospital + '\'' +
                ", planta='" + planta + '\'' +
                '}';
    }
}