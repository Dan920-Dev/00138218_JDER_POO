using System;
using System.Collections.Generic;

namespace Ejercicio_01
{
    internal class Program
    {
        // Delegate
        private delegate void MyDelegate(List<bankAccount> L); 
        static MyDelegate md; 
        
        public static void Main(string[] args)
        {
            // Declaracion de variables y Listas
            bool valid = true; 
            int option, currentBalance = 0;
            string nameOwner;
            var Owners = new List<bankAccount>();
            
            Console.WriteLine("Bienvenido al sistema de cuentas bancarias.");
            
            do
           {
               mainMenu();
               Console.WriteLine();
               Console.Write("Digite su opcion: "); option = Convert.ToInt32(Console.ReadLine());
               
               switch (option)
               {
                   case 1:
                       // Agregando Cuenta
                       Console.WriteLine();
                       Console.WriteLine("Creando cuenta... ");
                       Console.WriteLine("Digite el nombre del propietario de la cuenta: ");
                       nameOwner = Console.ReadLine();
                       
                       Console.Write("Digite el saldo a agregar a la cuenta: "); 
                       currentBalance = Convert.ToInt32(Console.ReadLine());
                       
                       Owners.Add(new bankAccount(nameOwner, currentBalance));
                       
                       break;
                   case 2:
                       // Se muestran las cuentas almacenadas solo llamando la Funcion
                       Console.WriteLine();
                       Console.WriteLine("Mostrando cuentas... ");
                       viewData(Owners);
                       break;
                   case  3:
                       //Se muestran las cuentas almacenadas y el total de las cuentas usando delegate explicito
                       Console.WriteLine();
                       Console.WriteLine("Mostrando Cuentas y total de Saldos...");
                       md = viewData;
                       md += new MyDelegate(viewCurrentBalance);
                       md(Owners);
                       break;
                   case 4:
                       //Se muestran las cuentas almacenadas y el total de las cuentas usando action suscribiendo a lambdas
                       Console.WriteLine();
                       Console.WriteLine("Mostrando Cuentas y total de Saldos...");
                       
                       Action<List<bankAccount>> myAction = (L) =>
                       {
                           L.ForEach(element =>
                           {
                               Console.WriteLine("Nombre de prpietario: " + element._name + "--"+ " Saldo: $" 
                                                 + element._currentBalance);
                           });
                       };
                       
                       myAction += (L) =>
                       {
                           double Total = 0;
                           
                           L.ForEach(element =>
                           {
                               Total += element._currentBalance;
                           }); 
            
                           Console.WriteLine("El total de Saldos es: $" + Total);
                       };
                       
                       myAction += (L) =>
                       {
                           string letter;
                           
                           Console.WriteLine("--------------------------------------------------");
                           Console.WriteLine("Cuentas de las personas que su nombre inicia con vocal...");
                           
                           L.ForEach(element =>
                           {
                               // En este for evalua la primera letra de cada nombre y si es vocal
                               // imprime los datos del propietario de la cuenta
                               for (int i = 0; i < 1; i++)
                               {
                                   letter = element._name.Substring(0, 1);
                                   if (letter == "a" || letter == "A" || letter == "e" || letter == "E" || 
                                       letter == "i" || letter == "I" || letter == "o" || letter == "O" ||
                                       letter == "u" || letter == "U")
                                   {
                                       Console.WriteLine("Nombre de prpietario: " + element._name + "--"+ " Saldo: $" 
                                                       + element._currentBalance); 
                                   }
                               } 
                           });
                       };

                       myAction(Owners);
                       break;
                   case 5:
                       Console.WriteLine("Saliendo....");
                       valid = false; 
                       break;
                   default:
                       Console.WriteLine("Opcion Incorrecta");
                       break;
               } 
           } while (valid);
        }

        // Funcion: Menu Principal
        public static void mainMenu()
        {
            Console.WriteLine("MENU \n 1. Agregar una cuenta. \n 2. Ver cuentas almacenadas. \n 3. Ver cuentas " +
                              "almacenadas y el total" + " de las cuentas." + "\n 4. Ver cuentas almacenadas, Total de" +
                              " las cuentas y las cuentas de las " + "personas que su nombre inicia con vocal. " +
                              "\n 5. Salir.");
        }
        
        // Funcion para ver los Datos de las cuentas Almacendas
        public static void viewData(List<bankAccount> L)
        {
           L.ForEach(element =>
           {
               Console.WriteLine("Nombre de prpietario: " + element._name + "--"+ " Saldo: $" + element._currentBalance);
           }); 
        }

        // Funcion para ver la suma de saldos
        public static void viewCurrentBalance(List<bankAccount> L)
        {
            double Total = 0;
            
            L.ForEach(element =>
            {
                Total += element._currentBalance;
            }); 
            
            Console.WriteLine("El total de Saldos es: $" + Total);
        }
    }
}