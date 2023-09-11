import java.util.List;

public class reward {
    private Float experience;
    private List<Item> items;

    public reward(Float experience,List<Item>items) {
        this.experience = experience;
        this.items=items;
    }

    public Float getExperience() {
        return experience;
    }

    public void setExperience(Float experience) {
        this.experience = experience;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
