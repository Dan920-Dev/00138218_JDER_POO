using System;

namespace Ejercicio_04
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.Write("Digite una frase: ");
            string sentence = Console.ReadLine();

            sentence = sentence.Replace("a", "b");
            
            Console.Write(sentence);
        }
    }
}