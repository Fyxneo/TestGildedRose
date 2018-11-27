package edu.insightr.gildedrose;

public interface IVisitor {
    void visit(IVisitable o);
    void visit(AgedBrie o);
    void visit(Backstage o);
    void visit(Conjured o);
    void visit(DexterityVest o);
    void visit(ElixirOfTheMongoose o);
	void visit(Sulfuras o);
}
