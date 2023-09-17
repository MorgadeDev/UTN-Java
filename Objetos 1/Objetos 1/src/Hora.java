public class Hora {

    int hora;
    int minuto;
    int segundo;



    public void imprimir(Hora dato)
    {
        if(dato.hora<10)
        {
            System.out.print("0"+ dato.hora +":");
        }else
        {
            System.out.print(dato.hora+":");
        }

        if(dato.minuto<10)
        {
            System.out.print("0"+ dato.minuto+":");
        }else
        {
            System.out.print(dato.minuto+":");
        }
        if(dato.segundo<10)
        {
            System.out.print("0"+ dato.segundo);
        }else
        {
            System.out.print(dato.segundo);
        }
        System.out.println();


    }

    public void aumentar(Hora dat)
    {
        if(dat.segundo==59)
        {
            dat.segundo=0;
            dat.minuto=dat.minuto+1;
            if(dat.minuto==60)
            {
                dat.minuto=0;
                dat.hora=dat.hora+1;
                if(dat.hora==24)
                {
                    dat.hora=00;
                }
            }
        }
        dat.segundo = dat.segundo +1;
    }






}
