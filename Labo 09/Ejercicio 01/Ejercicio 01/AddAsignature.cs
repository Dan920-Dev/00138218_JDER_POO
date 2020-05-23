using System;
using System.Windows.Forms;

namespace Ejercicio_01
{
    public partial class AddAsignature : UserControl
    {
        public AddAsignature()
        {
            InitializeComponent();
        }

        private void btnAddMateria_Click(object sender, EventArgs e)
        {
            if (txtNombreMateria.Text.Equals(""))
            {
                MessageBox.Show("No se puede dejar campos vacios");
            }
            else
            {
                try
                {
                    ConnectionDB.ExecuteNonQuery($"INSERT INTO MATERIA(nombre) VALUES('{txtNombreMateria.Text}')");

                    MessageBox.Show("Se ha agregado la Asignatura Exitosamente");
                    
                }
                catch (Exception ex)
                {
                    MessageBox.Show("A Ocurrido un error");
                }
            }
        }
    }
}