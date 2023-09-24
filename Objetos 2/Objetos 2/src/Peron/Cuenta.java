package Peron;

public class Cuenta {

    private int id;
    private int balance;
    private ClienteBanco client;

    private String historial[]= new String[10];
    private int validos;

    public int getValidos() {
        return validos;
    }

    public void setValidos(int validos) {
        this.validos = validos;
    }

    public Cuenta()
    {
        this.validos=0;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public ClienteBanco getClient() {
        return client;
    }

    public void setClient(ClienteBanco cliente) {
        this.client = cliente;
    }


    public void acomodarArreglo(String arreglo[])
    {
        
    }

    public int depositar(int ingreso)
    {
        this.balance=this.balance + ingreso;

        if(this.validos=10)
        {

        }else
        {
            this.historial[this.validos]=("El "+this.client.getNombre()+", deposito: "+ingreso);
            this.setValidos(this.validos+1);
        }
        return balance;
    }

    public int extraer(int egreso)
    {
        if(this.balance<egreso)
        {
            int resu= this.balance-egreso;
            if(resu<-2000)
            {
                System.out.println("No es posible acumular mas de 2000$ de deuda ");

            }else {
                this.balance = this.balance - egreso;

                this.historial[this.validos]=("El "+this.client.getNombre()+", retiro: "+egreso);
                this.setValidos(this.validos+1);
            }
        }else {
            this.balance = this.balance - egreso;
            
            this.historial[this.validos]=("El "+this.client.getNombre()+", retiro: "+egreso);
            this.setValidos(this.validos+1);
        }
        return balance;
    }

    public void imprimirHistorial()
    {
        int val=0;
        while(val!=this.validos)
        {
            System.out.println(this.historial[val]);
            val=val+1;
        }
    }

}
