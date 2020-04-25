
using System;
namespace Ejercicio_01
{
  internal class Program
  {
    public static void Main(string[] args)
    {
      int n = 0, previous = 0, current = 1, aux = 0;
      Console.WriteLine("Serie Fibonnaci");
      Console.Write("Digite el valor de n: ");
      n = Convert.ToInt32(Console.ReadLine());
      
      if(n == 1){
        Console.Write("1");
      }

      if(n > 1){
        for(int i = 0; i < n; i++){
          Console.Write(current + " ");
          aux = current;
          current = current + previous;
          previous = aux;
        }
      }else{
        Console.WriteLine("Numero Invalido");
      }
      
    }
  }
}