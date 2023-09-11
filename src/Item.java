public class Item {
    private long idItem;
    private String nameItem;
    private Rank requiredRank;
    private String description;
    private float price;
    private Type itemType;
    private Quality itemQuality;

    public Item(){

    }
    public Item(long idItem,String nameItem,Rank requiredRank,String description,float price,Type itemType,Quality itemQuality){
        this.idItem=idItem;
        this.nameItem=nameItem;
        this.requiredRank=requiredRank;
        this.description=description;
        this.price=price;
        this.itemType=itemType;
        this.itemQuality=itemQuality;
    }

    public long getIdItem() {
        return idItem;
    }
    public String getNameItem() {
        return nameItem;
    }
    public Rank getRequiredRank() {
        return requiredRank;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public Type getItemType() {
        return itemType;
    }

    public Quality getItemQuality() {
        return itemQuality;
    }

    public void setIdItem(long idItem) {
        this.idItem = idItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public void setRequiredRank(Rank requiredRank) {
        this.requiredRank = requiredRank;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setItemType(Type itemType) {
        this.itemType = itemType;
    }

    public void setItemQuality(Quality itemQuality ) {
        this.itemQuality = itemQuality;
    }
}
