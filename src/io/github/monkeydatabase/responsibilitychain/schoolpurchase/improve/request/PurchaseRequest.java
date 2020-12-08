package io.github.monkeydatabase.responsibilitychain.schoolpurchase.improve.request;

public class PurchaseRequest {
    private int id=0;
    private int type=0;
    private float price=0.0f;

    public PurchaseRequest(int id, int type, float price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }
}
