using System;
using System.Windows.Forms;

namespace Ejercicio_01
{
    public partial class ViewData : UserControl
    {
        public ViewData()
        {
            InitializeComponent();
        }

        private void btnConsultar2_Click(object sender, EventArgs e)
        {
            if (textBox1.Text.Equals(""))
            {
                MessageBox.Show("No se puede dejar campos vacios");
            }
            else
            {
                try
                {
                    
                    
                     var dt = ConnectionDB.ExecuteQuery($"SELECT ins.idMateria, mat.nombre " + "" +
                                                       "FROM MATERIA mat, INSCRIPCION ins, ESTUDIANTE est " +
                                                       $"WHERE ins.idMateria = mat.idMateria AND ins.carnet = est.carnet " + 
                                                       $"AND est.carnet = '{textBox1.Text}'"); 
                                                       

                    dataGridView1.DataSource = dt; 
                    MessageBox.Show("Datos obtenidos Exitosamente");
                }
                catch (Exception ex)
                {
                    MessageBox.Show("A ocurrido un error");
                }   
            }
        }
    }
}