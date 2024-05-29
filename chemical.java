import java.util.Scanner;

class TemperatureException extends Exception{
    String warning;
    TemperatureException(String warning)
    {
        this.warning=warning;
    }
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return warning;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return warning;
    }
}
class TemperatureAlaram 
{
int Temperature;
TemperatureAlaram(int Temperature)
{
    this.Temperature=Temperature;
}

void RaiseAlaram() 
{
    try{
        if(Temperature > 300)
        {
            throw new TemperatureException("CAUTION:MAX TEMPERATURE LIMIT EXCEEDED");
        }
    }catch(Exception e)
    {
        System.out.println(e);
    }
}

void RaiseAlaramLow() 
{
    try{
        if(Temperature < 100)
        {
            throw new TemperatureException("CAUTION:MIN TEMPERATURE LIMIT EXCEEDED");
        }
    }catch(Exception e)
    {
        System.out.println(e);
    }
}
}

public class chemical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE TEMPERATURE ");
        int a =sc.nextInt();
        TemperatureAlaram T=new TemperatureAlaram(a);
        T.RaiseAlaram();
        T.RaiseAlaramLow();
    }
}
