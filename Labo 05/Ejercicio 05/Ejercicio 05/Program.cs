using System;
using System.Collections;

namespace Ejercicio_05
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.Write("Digite el numero de letras que va a ingresar: ");
            int num = Convert.ToInt32(Console.ReadLine());

            char[] list = new char[num];
            
            Console.WriteLine("Digite las letras una por una: ");
            for (int i = 0; i < num; i++)
            {
                char letter;
                letter = Convert.ToChar(Console.ReadLine());

                list[i] = letter;
            }
            
            ArrayList voc = new ArrayList();
            
            for(int  i = 0; i < num; i++)
            {
                if (avoc(list[i]))
                    voc.Add(list[i]);
            }
            
            Console.WriteLine("Mostrando Lista llena de vocales: ");
            
            foreach (object o in voc)
            {
                Console.Write(o + " ");
            }
        }
        
        static bool avoc(char c){
            switch (c){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    return true;
                default:
                    return false;
            }
        }
    }
}