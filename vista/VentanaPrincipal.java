package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    // Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelResultados miPanelResultados;
    
    
    
    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public VentanaPrincipal()
    {
        //Definición del layout de la ventana
        this.setLayout(null);

        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,580,180);
        this.add(miPanelEntradaDatos);



        //Creación y adición del PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,200,580,190);
        this.add(miPanelResultados);

        //Caracteristicas de la ventana
        this.setTitle("Plan Telefonia");
        this.setSize(600,420);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }


}
