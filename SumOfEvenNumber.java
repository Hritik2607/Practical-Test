public class SumOfEvenNumber
    {
        public static void main(String[] args)
        {
            int sum = 0;
            for(int i = 25; i<=51; i++)
            {
                if(i % 2 == 0)
                {
                    sum +=i;
                }
            }
            System.out.println("The sum of even numbers between 25 to 51 is: " + sum);
        }



    }
