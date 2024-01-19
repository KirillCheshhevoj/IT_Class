package Lesson_9.exam5.model;

public abstract class Crockery {
    private int article;
    private double volume;
    private Material material;

    public Crockery(Crockery crockery) {
        this(crockery.article, crockery.volume, crockery.material);
    }

    public Crockery(int article, double volume, Material material) {
        this.article = (article > 0) ? article : 0;
        this.volume = (volume > 0) ? volume : 0.1;
        this.material = material;
    }

    public int getArticle() {
        return article;
    }

    public double getVolume() {
        return volume;
    }

    public double getPriceByMaterial() {
        return material.getPerPrice();
    }

    public abstract double getCost();

    public void setArticle(int article) {
        this.article = article;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Crockery crockery = (Crockery) obj;
        double exp = 0.01;
        return ((Math.abs(getCost()) - ((Crockery) obj).getCost() < exp) && (Math.abs(getVolume() - ((Crockery) obj).getVolume()) < exp));
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = article;
        temp = Double.doubleToLongBits(volume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (material != null ? material.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Crockery{" +
                "article=" + article +
                ", volume=" + volume +
                ", material=" + material +
                '}';
    }
}
