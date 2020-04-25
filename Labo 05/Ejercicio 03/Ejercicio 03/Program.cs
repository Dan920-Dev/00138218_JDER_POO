using System;

namespace Ejercicio_03
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            int n;
            Console.Write("Digite el valor de n: ");
            n = Convert.ToInt32(Console.ReadLine());
            
            if(n > 0){
                funRecursive(n, 1, true);
            }else{
                Console.WriteLine("Numero ingresado es invalido!");
            }
        }
        
        static void funRecursive(int n, int baseNumber, bool valid){

            if(valid) {
                if(baseNumber < n){
                    Console.Write(baseNumber + " ");
                    baseNumber++;
                    funRecursive(n, baseNumber, valid);
                }else{

                    if(baseNumber == n){
                        valid = false;
                        Console.Write(baseNumber + " ");
                        baseNumber--;
                        funRecursive(n, baseNumber, valid);
                    }
                }
            }else {

                if(baseNumber > 1){
                    Console.Write(baseNumber + " ");
                    baseNumber--;
                    funRecursive(n, baseNumber, valid);
                }else{

                    Console.Write(baseNumber);
                }
            }
        }
    }
}