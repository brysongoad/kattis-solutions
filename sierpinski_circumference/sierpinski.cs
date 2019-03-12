using System;

class Program
{
    static void Main()
    {
        int n = 0;
        int i = 1;
        string line;
        while ((line = Console.ReadLine()) != null)
        {
            n = int.Parse(line);

            int result = (int) Math.Ceiling(((n + 1) * Math.Log10(3)) - (n * Math.Log10(2)));
            Console.WriteLine("Case " + i + ": " + result);
            i++;
        }
    }
}
