package vista;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class PanelEntradaDatos extends JPanel
{
    

    //----------------------
    // Atributos
    //----------------------
    private JLabel lbNumeroCelular;
    private JLabel lbOperador;
    private JLabel lbValorMinuto;
    private JLabel lbCantMinutos;
    
    private JComboBox cbOperador;
    
    private JTextField tfNumeroCelular;
    private JTextField tfValorMinuto;
    private JTextField tfCantMinutos;
    
    private JButton btCalcular;
    
    //----------------------
    // Metodos
    //----------------------

    //Constructor
    /**
     * 
     */
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Creación y adición de los JLabels
        lbNumeroCelular = new JLabel("Numero Celular:");
        lbNumeroCelular.setBounds(10,20,150,20);
        this.add(lbNumeroCelular);
        
        lbOperador = new JLabel("Operador:");
        lbOperador.setBounds(10,50,150,20);
        this.add(lbOperador);
        
        lbValorMinuto = new JLabel("Valor Minuto:");
        lbValorMinuto.setBounds(10,80,150,20);
        this.add(lbValorMinuto);
        
        lbCantMinutos = new JLabel("Cantidad Minutos:");
        lbCantMinutos.setBounds(10,110,150,20);
        this.add(lbCantMinutos);
        
        //Creación y adición de los JComboBox
        cbOperador = new JComboBox();
        cbOperador.setBounds(170,50,150,20);
        cbOperador.addItem("Tigo");
        cbOperador.addItem("Movistar");
        cbOperador.addItem("Claro");
        cbOperador.addItem("WOM");
        this.add(cbOperador);
        
        //Creación y adición de los JTextFields
        tfNumeroCelular = new JTextField();
        tfNumeroCelular.setBounds(170,20,150,20);
        this.add(tfNumeroCelular);
        
        tfValorMinuto = new JTextField();
        tfValorMinuto.setBounds(170,80,150,20);
        this.add(tfValorMinuto);
        
        tfCantMinutos = new JTextField();
        tfCantMinutos.setBounds(170,110,150,20);
        this.add(tfCantMinutos);

        btCalcular = new JButton("Calcular");
        //Crear y agregar boton calcular
        btCalcular.setActionCommand("calcular");
        btCalcular.setBounds(350,50,150,20);
        this.add(btCalcular);
        


        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
        borde.setTitleColor(Color.RED);
        this.setBorder(borde);

    }


        //metodos de acceso
        public String getNumeroCelular()
        {
            return tfNumeroCelular.getText();
        }

        public String getOperador()
        {
            return (String) cbOperador.getSelectedItem();
        }

        public String getValorMinuto()
        {
            return tfValorMinuto.getText();
        }

        public String getCantMinutos()
        {
            return tfCantMinutos.getText();
        }

        public void agregarOyentesBotones(ActionListener pAL)
        {
            btCalcular.addActionListener(pAL);
            
        }

        



        
        

    }

