/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.fes;

/**
 *
 * @author papis
 */
public class Empleado extends Persona{
    
    private int numeroEmpleaado;
    private String Departamento;
    private float sueldo;
    private int horasExtra;
    private Direccion domicilio;

    public Empleado() {
    }

    public Empleado(int numeroEmpleaado, String Departamento, float sueldo, int horasExtra, Direccion domicilio) {
        this.numeroEmpleaado = numeroEmpleaado;
        this.Departamento = Departamento;
        this.sueldo = sueldo;
        this.horasExtra = horasExtra;
        this.domicilio = domicilio;
    }

    public int getNumeroEmpleaado() {
        return numeroEmpleaado;
    }

    public void setNumeroEmpleaado(int numeroEmpleaado) {
        this.numeroEmpleaado = numeroEmpleaado;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public Direccion getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Direccion domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numeroEmpleaado=" + numeroEmpleaado + ", Departamento=" + Departamento + ", sueldo=" + sueldo + ", horasExtra=" + horasExtra + ", domicilio=" + domicilio + '}';
    }

  

     public float calcularSueldo(){
        float sueldoTotal;
        sueldoTotal = 0.0f;
        sueldoTotal = this.sueldo + (this.horasExtra * 150.0f);
        
        return sueldoTotal;
        
    }
}

