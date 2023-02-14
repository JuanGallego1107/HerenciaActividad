package org.agallego.pooherencia;

public class Alumno extends Persona{
    private String institucion;
    private double notaMatematicas;
    private double notaEspaniol;
    private double notaSociales;

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaEspaniol() {
        return notaEspaniol;
    }

    public void setNotaEspaniol(double notaEspaniol) {
        this.notaEspaniol = notaEspaniol;
    }

    public double getNotaSociales() {
        return notaSociales;
    }

    public void setNotaSociales(double notaSociales) {
        this.notaSociales = notaSociales;
    }
}
