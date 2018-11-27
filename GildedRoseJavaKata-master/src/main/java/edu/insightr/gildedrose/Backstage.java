package edu.insightr.gildedrose;

public class Backstage {
    public void accept(IVisitor visitor) {
        visitor.visit(this); 
    }
}
