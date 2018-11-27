package edu.insightr.gildedrose;

public class Conjured {
    public void accept(IVisitor visitor) {
        visitor.visit(this); 
    }
}
