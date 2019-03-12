using System;

class Railroad
{
    static void Main()
    {
        int y;
        string line;
        line = Console.ReadLine();
        string[] split = line.Split(new [] {' '}, StringSplitOptions.None);
        y = int.Parse(split[1]);
        if (y*3 % 2 == 0)
        {
            Console.WriteLine("possible");
        }
        else
        {
            Console.WriteLine("impossible");
        }
    }
}
