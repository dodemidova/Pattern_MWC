package com.company.model;

import java.util.ArrayList;

public class Product {
    private ArrayList<Section> sections;

    public Product(){
        this.sections = new ArrayList<Section>();
    }

    public void addSection(Section section){
        sections.add(section);
    }

    public int getCost(){
        int cost = 0;
        for (Section section:sections) {
            cost += section.getCost();
        }
        return cost;
    }

    public void changeSection(int numberOfSection, int newWeight, int newHeight, int newCost){
        Section changedSection = sections.get(numberOfSection);
        changedSection.setWeight(newWeight);
        changedSection.setHeight(newHeight);
        changedSection.setCost(newCost);
    }

    public ArrayList<Section> getSections() {
        return sections;
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }
}
