package flower.store;
import java.util.LinkedList;
import java.util.Objects;

public class Store {

    public LinkedList<Flower> all_flowers;

    public Store() {
        all_flowers = new LinkedList<>();
    }

    public void addFlower(Flower flower){
        this.all_flowers.add(flower);
    }

    public Flower search(Flower flower){
        int counter = 0;
        for (Flower thisFlower : all_flowers) {
            if (thisFlower.getFlowerType() == flower.getFlowerType()) {
                if (Objects.equals(thisFlower.getColor(), flower.getColor())) {
                    if (Objects.equals(thisFlower.getSepalLength(), flower.getSepalLength())) {
                        String colourToCheck = flower.getColor();
                        if ((colourToCheck != null) && (!colourToCheck.equals(""))
                                && (!colourToCheck.equals(thisFlower.getColor()))) {
                            continue;
                        } else {
                            return thisFlower;
                        }
                    }
                }
            }
        }
        return null;
    }
}

