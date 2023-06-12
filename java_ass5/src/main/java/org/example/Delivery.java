package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Delivery {
    private ArrayList<HeavyBox> boxes;
    private int totalWeight;

    public Delivery() {
        boxes = new ArrayList<>();
        totalWeight = 0;
    }

    public void addBox(HeavyBox box) {
        boxes.add(box);
        totalWeight += box.getWeight();
    }

    public ArrayList<HeavyBox> getBoxes() {
        return boxes;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public static void main(String[] args) {
        ArrayList<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(10, 10, 10, 20, "Box 1"));
        boxes.add(new HeavyBox(20, 20, 20, 15, "Box 2"));
        boxes.add(new HeavyBox(30, 30, 30, 25, "Box 3"));
        boxes.add(new HeavyBox(40, 40, 40, 30, "Box 4"));
        boxes.add(new HeavyBox(50, 50, 50, 10, "Box 5"));
        boxes.add(new HeavyBox(60, 60, 60, 35, "Box 6"));
        boxes.add(new HeavyBox(70, 70, 70, 5, "Box 7"));
        boxes.add(new HeavyBox(80, 80, 80, 50, "Box 8"));
        boxes.add(new HeavyBox(90, 90, 90, 45, "Box 9"));
        boxes.add(new HeavyBox(100, 100, 100, 40, "Box 10"));

        Collections.sort(boxes, new Comparator<HeavyBox>() {
            @Override
            public int compare(HeavyBox o1, HeavyBox o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });

        ArrayList<Delivery> deliveries = new ArrayList<>();
        Delivery currentDelivery = new Delivery();

        for (HeavyBox box : boxes) {
            if (currentDelivery.getTotalWeight() + box.getWeight() > 100) {
                deliveries.add(currentDelivery);
                currentDelivery = new Delivery();
            }
            currentDelivery.addBox(box);
        }

        deliveries.add(currentDelivery);

        int deliveryCount = 0;
        for (Delivery delivery : deliveries) {
            deliveryCount++;
            System.out.println("Delivery " + deliveryCount + ":");
            for (HeavyBox box : delivery.getBoxes()) {
                System.out.println("- " + box.getName() + " (" + box.getWeight() + " kg)");
            }
            System.out.println("Нийт жин: " + delivery.getTotalWeight() + " kg");
            System.out.println();
        }
    }
}
