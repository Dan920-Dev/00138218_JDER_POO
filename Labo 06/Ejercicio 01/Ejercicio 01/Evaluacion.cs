namespace Ejercicio_01
{
    public class Evaluacion
    {
        protected int porcentaje;
        public int Porcentaje => porcentaje;
        
        protected string nombre;
        public string Nombre => nombre;

        public Evaluacion(int porcentaje, string nombre)
        {
            this.porcentaje = porcentaje;
            this.nombre = nombre;
        }
    }
}