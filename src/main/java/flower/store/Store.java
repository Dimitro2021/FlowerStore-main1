package flower.store;
import java.util.LinkedList;
import java.util.Objects;

public class Store {

    private LinkedList<Flower> allFlowers;

    public Store() {
        allFlowers = new LinkedList<>();
    }

    public void addFlower(Flower flower) {
        this.allFlowers.add(flower);
    }

    public Flower search(Flower flower) {
        for (Flower thisFlower : allFlowers) {
            if (thisFlower.getFlowerType() == flower.getFlowerType()) {
                if (Objects.equals(thisFlower.getColor(),
                        flower.getColor())) {
                    if (Objects.equals(thisFlower.getSepalLength(),
                            flower.getSepalLength())) {
                        String colourToCheck = flower.getColor();
                        if ((colourToCheck != null) && (!colourToCheck.equals("")) && (!colourToCheck.equals(thisFlower.getColor()))) {
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

