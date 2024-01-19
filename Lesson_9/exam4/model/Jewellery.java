package Lesson_9.exam4.model;

public abstract class Jewellery {
    private int article;
    private double weight;
    private Material material;
    private Producer producer;

    public Jewellery() {
    }

    // глыбокае капіраванне
    public Jewellery(Jewellery jewellery) {
        // this.article = jewellery.article;
        this(jewellery.article, jewellery.weight, jewellery.material, new Producer(jewellery.producer.getName()));
    }

    // павярхоўнае капіраванне
    // public Jewellery(Jewellery jewellery) {
    //        // this.article = jewellery.article;
    //        this(jewellery.article, jewellery.weight, jewellery.material, jewellery.producer);
    //    }

    public Jewellery(int article, double weight, Material material, Producer producer) {
        this.article = article;
        this.weight = weight;
        this.material = material;
        this.producer = producer;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public abstract double getDifficultFactor();

    public double calculatePrice() {
        double res = 0.0;
        res = weight * material.getPricePerGram() * getDifficultFactor();
        return res;
    }
}
