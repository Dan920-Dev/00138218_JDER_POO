using System;

namespace Ejercicio_02
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("¿La frase ingresada es Palindrome? " + funPalindrome());
        }

        static bool funPalindrome()
        {
            string sentenece = "";
            Console.Write("Digite una frase, el programa determinara si es palindrome o no! ");
            sentenece = Console.ReadLine();

            sentenece = sentenece.ToLower();
            sentenece = sentenece.Replace("\\s", "");
            int size = sentenece.Length;

            for (int i = 0; i < size; i++)
            {
                if (sentenece[i] == sentenece[size - 1 - i]) return true;
            }

            return false;
        }
    }
}