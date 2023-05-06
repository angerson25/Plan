package controlador;

import modelo.PlanTelefonia;
import vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{
    
    //----------------------
    // Atributos
    //----------------------
    private VentanaPrincipal miVentana;
    private PlanTelefonia miPlan;

    
    //----------------------
    // Metodos
    //----------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pMiVentana, PlanTelefonia pMiPlan)
    {
        this.miVentana = pMiVentana;
        this.miPlan = pMiPlan;
        this.miVentana.miPanelEntradaDatos.agregarOyentesBotones(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        

        //Liquidar nomina total empresa
        if(comando.equals("calcular"))
        {   
            
            double numeroCelular = Double.parseDouble(miVentana.miPanelEntradaDatos.getNumeroCelular());
            String operador = miVentana.miPanelEntradaDatos.getOperador();
            double valorMinuto = Double.parseDouble(miVentana.miPanelEntradaDatos.getValorMinuto());
            int cantMinutos = Integer.parseInt(miVentana.miPanelEntradaDatos.getCantMinutos());
            PlanTelefonia plan1 = new PlanTelefonia(numeroCelular, operador, valorMinuto, cantMinutos, valorMinuto);
            plan1.calcularCostoPlan();;
            

            miVentana.miPanelResultados.mostrarResultado("El numero de celular es: " + plan1.getNumeroCelular() + "\nEl operador es: " + plan1.getOperador() + "\nEl valor del minuto es: " + plan1.getValorMinuto() + "\nLa cantidad de minutos es: " + plan1.getCantMinutos() + "\nEl costo del plan es: " + plan1.getCostoPlan() + "\n");
            
            
            
        }

        
    }

}