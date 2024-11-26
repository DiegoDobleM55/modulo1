package com.anahuac.mayab.modulo2.sesion1;
import javax.swing.*;
import java.awt.*;

public class CardLayoutEjemplo extends JFrame {

    public CardLayoutEjemplo (){

        setTitle("Ejemplo de CardLayout");
        setSize(400, 200);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Configurar CardLayout
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        //Añadir las tarjetas
        cardPanel.add(new JLabel("Tarjeta 1"), "Card 1");
        cardPanel.add(new JLabel("Tarjeta 2"), "Card 2");
        cardPanel.add(new JLabel("Tarjeta 3"), "Card 3");
        cardPanel.add(new JLabel("Tarjeta 4"), "Card 4");

        //Botones para navegar
        JPanel buttonPanel = new JPanel();
        JButton nextButton = new JButton("Siguiente");
        nextButton.addAncestorListener(e -> cardLayout.next(cardPanel));
        buttonPanel.add(nextButton);
        add(cardPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);

    }

    public static  void  main (Sting[] args) {
        SwingUtilities.invokeLater(CardLayoutEjemplo::new);
    }


}