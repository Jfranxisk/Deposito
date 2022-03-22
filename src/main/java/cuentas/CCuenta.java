package cuentas;

/**
 * Clase para con los atributos de una cuenta corriente y las operaciones que se realizan con ella.
 * 
 * @author Juanfran Lara
 * @version 2.0
 * @since 1.0
 */
public class CCuenta {
    //Atributos de clase
    private String nombre; //Nombre del titular de la cuenta
    private String cuenta; //Codigo de la cuenta
    private double saldo; //Saldo en euros de la cuenta
    private double tipoInterés; //Tipo de interes de la cuenta
    
    //Constructor vacío
    public CCuenta()
    {
    }
    
    //Constructor CCuenta
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Consulta el estado de la cuenta y devuelve el Saldo.
     * 
     * @return Saldo de la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Suma la cantidad al saldo.
     * 
     * @param cantidad Cantidad a sumar.
     * @throws Exception Notifica un error en caso de que la cantidad sea negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
     /**
     * Resta la cantidad introducida al saldo.
     * 
     * @param cantidad Cantidad a restar.
     * @throws Exception Notifica un error en caso de que la cantidad sea negativa o no haya suficiente saldo en la cuenta.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
}
