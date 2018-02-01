package sk.akademiasovy.tipos;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class Tipos
{




    public int[] getArr()
    {
        return arr;
    }

    private int [] arr; //pole

    public Tipos()
    {
        arr = new int[5]; //5 prvkové pole

    }


    public void generate()
    {
    Random random = new Random();

    for (int i=0;i<arr.length;i++)
    {



        arr[i]=random.nextInt(35)+1;






    }




    }

    public void sort ()
    {
        Arrays.sort(arr);

    }




    public void print()
    {
        for (int k:arr)
        {
            System.out.println(k+" ");
        }

    }

    public void printNewBet(List<Bet> list)
    {
        if (list!=null || list.size()==0 )
            System.out.println("No bets");
        else
        {
            for(Bet temp:list)
            {
                System.out.println("Bet: "+temp.getId()+" "+temp.getDate()+" "+temp.getIduser());
                System.out.println("   > "+temp.getBet1()+" "+temp.getBet2()+" "+temp.getBet3()+" "+temp.getBet4()+" "+temp.getBet5()+" <");
            }
        }


    }

}
