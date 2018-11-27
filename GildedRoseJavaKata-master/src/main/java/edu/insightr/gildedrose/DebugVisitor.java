package edu.insightr.gildedrose;

public class DebugVisitor {
    public void visit(AgedBrie o)
    {
        System.out.println("Update Aged Brie");
    }
    public void visit(Backstage o) 
    {
        System.out.println("Update Backstage");
    }
    public void visit(Conjured o)
    {
        System.out.println("Update Conjured");
    }
    public void visit(DexterityVest o)
    {
        System.out.println("Update Dexterity Vest");
    }
    public void visit(ElixirOfTheMongoose o)
    {
        System.out.println("Update Elixir of the Mongoose");
    }
    public void visit(Sulfuras o)
    {
        System.out.println("Update Sulfuras");
    }
    public void visit(IVisitable o)
    {

    }
}
