

public class Staff extends Persona {

    private double salario;
    private String turno; //M o N

    public Staff()
    {
        super();

    }
    public Staff(double salario,String turno,String nombre,int dni,String apellido,String direccion,String email)
    {
        super(dni,nombre,apellido,direccion,email);
        this.salario=salario;
        this.turno=turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String toString()
    {
        return "\nSalario: "+salario+"\nTurnos: "+turno+"\nDNI: "+dni+
                "\nNombre: "+nombre+"\nApellido: "+apellido+"\neMail: "+email+
                "\nDireccion: "+direccion;
    }

    public double salarioAnual()
    {
        return salario*12;
    }
}
