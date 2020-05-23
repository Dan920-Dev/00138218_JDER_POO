using System;
using System.Windows.Forms;

namespace Ejercicio_01
{
    public partial class Student : UserControl
    {
        public Student()
        {
            InitializeComponent();
        }

        private void btnAgregar_Click(object sender, EventArgs e)
        {
            if (txtNombre.Text.Equals("") || txtApellidos.Text.Equals("") ||
                txtCarnet.Text.Equals("") || txtEdad.Text.Equals(""))
            {
                MessageBox.Show("No se puede dejar campos vacios");
            }
            else
            {
                try
                {
                    ConnectionDB.ExecuteNonQuery($"INSERT INTO ESTUDIANTE VALUES(" +
                                                 $"'{txtCarnet.Text}'," +
                                                 $"'{txtNombre.Text}'," +
                                                 $"'{txtApellidos.Text}'," +
                                                 $"{txtEdad.Text})");

                    MessageBox.Show("Se ha registrado el estudiante Exitosamente");
                    
                }
                catch (Exception ex)
                {
                    MessageBox.Show("A Ocurrido un error");
                }
            }
        }
    }
}