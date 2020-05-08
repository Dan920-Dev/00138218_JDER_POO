namespace Ejercicio_01
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }

            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.btnRed = new System.Windows.Forms.Button();
            this.btnGreen = new System.Windows.Forms.Button();
            this.btnBlue = new System.Windows.Forms.Button();
            this.btnColorHEX = new System.Windows.Forms.Button();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.comboBox1 = new System.Windows.Forms.ComboBox();
            this.btnColorOp = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.Font = new System.Drawing.Font("Segoe UI", 20.25F, System.Drawing.FontStyle.Bold,
                System.Drawing.GraphicsUnit.Point, ((byte) (0)));
            this.label1.Location = new System.Drawing.Point(79, 42);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(307, 52);
            this.label1.TabIndex = 0;
            this.label1.Text = "Presiona un boton";
            this.label1.TextAlign = System.Drawing.ContentAlignment.TopCenter;
            // 
            // btnRed
            // 
            this.btnRed.BackColor = System.Drawing.Color.White;
            this.btnRed.Location = new System.Drawing.Point(30, 384);
            this.btnRed.Name = "btnRed";
            this.btnRed.Size = new System.Drawing.Size(104, 51);
            this.btnRed.TabIndex = 1;
            this.btnRed.Text = "Rojo";
            this.btnRed.UseVisualStyleBackColor = false;
            this.btnRed.Click += new System.EventHandler(this.btnRed_Click);
            // 
            // btnGreen
            // 
            this.btnGreen.BackColor = System.Drawing.Color.White;
            this.btnGreen.Location = new System.Drawing.Point(345, 384);
            this.btnGreen.Name = "btnGreen";
            this.btnGreen.Size = new System.Drawing.Size(104, 51);
            this.btnGreen.TabIndex = 2;
            this.btnGreen.Text = "Verde";
            this.btnGreen.UseVisualStyleBackColor = false;
            this.btnGreen.Click += new System.EventHandler(this.btnGreen_Click);
            // 
            // btnBlue
            // 
            this.btnBlue.BackColor = System.Drawing.Color.White;
            this.btnBlue.Location = new System.Drawing.Point(188, 384);
            this.btnBlue.Name = "btnBlue";
            this.btnBlue.Size = new System.Drawing.Size(104, 51);
            this.btnBlue.TabIndex = 3;
            this.btnBlue.Text = "Azul";
            this.btnBlue.UseVisualStyleBackColor = false;
            this.btnBlue.Click += new System.EventHandler(this.btnBlue_Click);
            // 
            // btnColorHEX
            // 
            this.btnColorHEX.BackColor = System.Drawing.Color.White;
            this.btnColorHEX.Location = new System.Drawing.Point(271, 112);
            this.btnColorHEX.Name = "btnColorHEX";
            this.btnColorHEX.Size = new System.Drawing.Size(128, 38);
            this.btnColorHEX.TabIndex = 4;
            this.btnColorHEX.Text = "Cambiar Color";
            this.btnColorHEX.UseVisualStyleBackColor = false;
            this.btnColorHEX.Click += new System.EventHandler(this.button1_Click);
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(71, 121);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(137, 23);
            this.textBox1.TabIndex = 5;
            // 
            // comboBox1
            // 
            this.comboBox1.FormattingEnabled = true;
            this.comboBox1.Location = new System.Drawing.Point(61, 186);
            this.comboBox1.Name = "comboBox1";
            this.comboBox1.Size = new System.Drawing.Size(336, 23);
            this.comboBox1.TabIndex = 6;
            // 
            // btnColorOp
            // 
            this.btnColorOp.BackColor = System.Drawing.Color.White;
            this.btnColorOp.Location = new System.Drawing.Point(175, 218);
            this.btnColorOp.Name = "btnColorOp";
            this.btnColorOp.Size = new System.Drawing.Size(128, 38);
            this.btnColorOp.TabIndex = 7;
            this.btnColorOp.Text = "Cambiar Color";
            this.btnColorOp.UseVisualStyleBackColor = false;
            this.btnColorOp.Click += new System.EventHandler(this.btnColorOp_Click_1);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(479, 475);
            this.Controls.Add(this.btnColorOp);
            this.Controls.Add(this.comboBox1);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.btnColorHEX);
            this.Controls.Add(this.btnBlue);
            this.Controls.Add(this.btnGreen);
            this.Controls.Add(this.btnRed);
            this.Controls.Add(this.label1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();
        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btnBlue;
        private System.Windows.Forms.Button btnGreen;
        private System.Windows.Forms.Button btnRed;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.Button btnColorHEX;
        private System.Windows.Forms.ComboBox comboBox1;
        private System.Windows.Forms.Button btnColorOp;
    }
}