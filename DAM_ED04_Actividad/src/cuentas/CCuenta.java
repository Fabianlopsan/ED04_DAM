/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;
/**
 * Estamos insertando comentarios para generar la documentación a traves de JAVADOC en la clase CCuenta
 * 
 * @author Fabian
 * @version 2.0
 * @since 1.5
 *  *
 */

public class CCuenta {

	/**
	 * Aqui tenemos el contenido de la clase CCuenta
	 * En ella hemos añadido los Getters y los Setter de los atributos principales.
	 * 
	 */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;


    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    public String obtenerNombre()
    {
        return getNombre();
    }


    public double estado()
    {
        return getSaldo();
    }
/**
 * A continuacion tenemos el metodo ingresar
 * 
 */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }


    public String obtenerCuenta()
    {
        return getCuenta();
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getTipoInteres() {
        return tipoInteres;
    }


    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
