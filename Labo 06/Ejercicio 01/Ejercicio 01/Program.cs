using System;
using System.Collections.Generic;
using System.Linq;

namespace Ejercicio_01
{
    internal class Program
    {
        List<Evaluacion> ev = new List<Evaluacion>();
        public static void Main(string[] args)
        {
            List<Evaluacion> ev = new List<Evaluacion>();
            bool continu = true;
            int op = 0;
            string evaluacion = "";

            do
            {
                menu();
                Console.WriteLine();
                Console.Write("Digite su opcion: ");  op = Convert.ToInt32(Console.ReadLine());
                
                switch (op)
                {
                    case 1:
                        Console.WriteLine("Escriba el nombre de la evaluacion, ya sea: Tarea, Parcial o Laboratorio");
                        evaluacion = Console.ReadLine();
                        if (evaluacion.Equals("tarea", StringComparison.InvariantCultureIgnoreCase) || 
                            evaluacion.Equals("laboratorio", StringComparison.InvariantCultureIgnoreCase) || 
                            evaluacion.Equals("parcial", StringComparison.InvariantCultureIgnoreCase))
                        {
                            ev.Add(addEvaluacion(evaluacion));
                            CalcularNota.Calcular(ev);
                        }
                        else
                        {
                            Console.Clear();
                            continu = true;
                        }
                        
                        break;
                    case 2 :
                        foreach (Evaluacion s in ev)
                        {
                            Console.WriteLine(s.ToString());
                        }
                        break;
                    case 3:
                        break;
                    case 4 :
                        continu = false;
                        break;
                    default:
                        Console.WriteLine("Opcion Incorrecta");
                        break;
                }
            } while (continu);
        }

        static void menu()
        {
            Console.WriteLine("1. Agregar Evaluacion\n"  + "2. Mostrar Evaluaciones almacenadas\n" + "3. Eliminar Evaluacion\n" + "4. Terminar programa\n");
        }

        static Evaluacion addEvaluacion(string evaluacion)
        {
            int porcent = 0, dia, mes, anio, cantidad;
            string tipo;

            Console.WriteLine("Digite el porcentaje de la evaluacion: ");
          porcent = Convert.ToInt32(Console.ReadLine());
          
          if (porcent > 100 || porcent < 0)
          {
              Console.WriteLine("Porcenteje no valido");
          }

          if (evaluacion.Equals("laboratorio", StringComparison.InvariantCultureIgnoreCase))
          {
              Console.WriteLine("Digite el tipo de Laboratorio: ");
              tipo = Console.ReadLine();
              return new Laboratorio(porcent, evaluacion, tipo);
          }
          
          if (evaluacion.Equals("tarea", StringComparison.InvariantCultureIgnoreCase))
          {
              Console.WriteLine("Digite la fecha de entrega de la tarea, en el siguiente formato Dia-Mes-Año: ");
              dia = Convert.ToInt32(Console.ReadLine());
              mes = Convert.ToInt32(Console.ReadLine());
              anio = Convert.ToInt32(Console.ReadLine());
              
              DateTime fechaEntrega = new DateTime(anio, mes, dia);
              
              return new Tarea(porcent, evaluacion, fechaEntrega);
          }
          else
          {
             Console.WriteLine("Digite la cantidad de preguntas del Parcial: ");
             cantidad = Convert.ToInt32(Console.ReadLine());
             return new Parcial(porcent, evaluacion, cantidad);
          }

        }
    }
}