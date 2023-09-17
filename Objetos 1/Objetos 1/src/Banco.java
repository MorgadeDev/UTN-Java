public class Banco {

    int id;
    String nombre;
    double balance;


    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }

    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String getNombre()
    {
        return nombre;
    }

    public void setBalance(double Balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }

public double Deposito(Banco dat, double deposito)
{
    dat.balance = dat.balance + deposito;

return dat.balance;
}

public double Debito(Banco dat, double debito)
{
    if(debito > dat.balance)
    {
        System.out.println("El debito supera los fondos");
    }else
    {
        dat.balance = dat.balance - debito;
    }
return dat.balance;
}

public void imprimirBanco(Banco dat)
{
    System.out.println("Banco");
    System.out.println("ID: " + dat.id);
    System.out.println("Balance: " + dat.balance);
    System.out.println("Nombre: " + dat.nombre);
}


}
