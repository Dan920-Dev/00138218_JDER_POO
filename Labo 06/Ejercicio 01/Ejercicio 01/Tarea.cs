using System;

namespace Ejercicio_01
{
    public class Tarea : Evaluacion
    {
        private DateTime fechaEntrega = new DateTime();
        
        public Tarea(int porcentaje, string nombre, DateTime fechaEntrega) : base(porcentaje, nombre)
        {
            this.fechaEntrega = fechaEntrega;
        }

        public override string ToString()
        {
            return base.ToString();
        }
    }
}