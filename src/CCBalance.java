public class CCBalance
{
    static void main()
    {
       double balance = 5000; //Initial
       final double RATE = .17;

       //balance = balance + interest // interest = balance * RATE
       balance = balance + balance * RATE; // Month one!

        IO.println("The balance after one month is " + balance);
        balance = balance + balance * RATE;
        IO.println("The balance after month two is " + balance);


    }
}
