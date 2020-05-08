using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ejercicio_01
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            comboBox1.DataSource =  new List<String>() {"Morado", "Celeste", "Rosado"};
        }

        private void btnRed_Click(object sender, EventArgs e)
        {
            BackColor = Color.Red;
        }

        private void btnBlue_Click(object sender, EventArgs e)
        {
            BackColor = Color.Blue;
        }

        private void btnGreen_Click(object sender, EventArgs e)
        {
            BackColor = Color.Green;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            BackColor = ColorTranslator.FromHtml("#" + textBox1.Text);
        }

       

        private void btnColorOp_Click_1(object sender, EventArgs e)
        {
            String Morado = "#7d4ebf", Celeste = "#45dbe6", Rosado = "#e241e8";

            switch (comboBox1.SelectedIndex)
            {
                case 0:
                    BackColor = ColorTranslator.FromHtml(Morado);
                    break;
                case 1:
                    BackColor = ColorTranslator.FromHtml(Celeste);
                    break;
                case 2:
                    BackColor = ColorTranslator.FromHtml(Rosado);
                    break;
            }
        }
    }
}