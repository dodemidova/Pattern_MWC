package com.company.view;

import com.company.model.Furniture;
import com.company.model.Product;
import com.company.model.Radiator;
import com.company.model.Section;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {

    Product product;

    JTextField weightField;
    JTextField heightField;
    JTextField costField;

    JLabel weightLabel;
    JLabel heightLabel;
    JLabel costLabel;
    JLabel productCostLabel;
    JLabel productCost;
    JLabel radiatorCheck;
    JLabel furnitureCheck;

    JButton radiatorButton;
    JButton furnitureButton;
    JButton addSectionButton;

    public MyPanel() {


        weightField = new JTextField("          ");
        weightField.requestFocus(true);

        heightField = new JTextField("          ");
        heightField.requestFocus(true);

        costField = new JTextField("          ");
        costField.requestFocus(true);

        weightLabel = new JLabel("weight");
        heightLabel = new JLabel("height");
        costLabel = new JLabel("cost");
        productCostLabel = new JLabel("product cost: ");
        productCost = new JLabel("0");
        radiatorCheck = new JLabel(" ");
        furnitureCheck = new JLabel(" ");

        addSectionButton = new JButton("add section");
        addSectionButton.setVisible(false);
        furnitureButton = new JButton("furniture");
        radiatorButton = new JButton("radiator");



        furnitureButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                addSectionButton.setVisible(true);

                product = new Furniture();
                productCost.setText("0");
                furnitureCheck.setText("*");
                radiatorCheck.setText(" ");
            }
        });

        radiatorButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                addSectionButton.setVisible(true);
                product = new Radiator();
                productCost.setText("0");
                furnitureCheck.setText(" ");
                radiatorCheck.setText("*");
            }
        });

        addSectionButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int weight = Integer.parseInt(weightField.getText().trim());
                int height = Integer.parseInt(heightField.getText().trim());
                int cost = Integer.parseInt(costField.getText().trim());
                product.addSection(new Section(weight, height, cost));
                productCost.setText(Integer.toString(product.getCost()));
            }
        });


        JComponent[][] component = new JComponent[3][3];

        component[0][0] = weightLabel;
        component[1][0] = heightLabel;
        component[2][0] = costLabel;
        component[0][1] = weightField;
        component[1][1] = heightField;
        component[2][1] = costField;
        component[0][2] = radiatorButton;
        component[1][2] = furnitureButton;
        component[2][2] = addSectionButton;

        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;


        for (int i = 0; i < 3; i++) {
            constraints.gridy = i;
            for (int j = 0; j < 3; j++) {
                constraints.gridx = j;
                add(component[i][j], constraints);
            }
        }

        constraints.gridx = 0;
        constraints.gridy = 3;
        add(productCostLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        add(productCost, constraints);

        constraints.gridx = 3;
        constraints.gridy = 0;
        add(radiatorCheck, constraints);

        constraints.gridx = 3;
        constraints.gridy = 1;
        add(furnitureCheck, constraints);


    }
}
