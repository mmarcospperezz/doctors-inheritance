package org.ies.doctors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public abstract class Medicos {
    protected String nombre;
    protected String apellidos;
    protected String numeroColegiado;
    protected String[] pacientes;

    public Medicos(String nombre, String apellidos, String numeroColegiado, String[] pacientes) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroColegiado = numeroColegiado;
        this.pacientes = pacientes;
    }

    public void showInfo(){
        System.out.println("Informacion del medico:" + nombre +" "+ apellidos +" "+ numeroColegiado +" "+ Arrays.toString(pacientes));
        showMoreInfo();
    }

    public abstract void showMoreInfo();

    public abstract boolean trabajaEnHospital();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    public String[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(String[] pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medicos medicos = (Medicos) o;
        return Objects.equals(nombre, medicos.nombre) && Objects.equals(apellidos, medicos.apellidos) && Objects.equals(numeroColegiado, medicos.numeroColegiado) && Objects.deepEquals(pacientes, medicos.pacientes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, numeroColegiado, Arrays.hashCode(pacientes));
    }
}