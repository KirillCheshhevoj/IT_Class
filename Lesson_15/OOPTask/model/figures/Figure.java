package Lesson_15.OOPTask.model.figures;

import Lesson_15.OOPTask.exception.*;
import Lesson_15.OOPTask.model.interfaces.FigureCalculatable;
import Lesson_15.OOPTask.model.material.Material;
import Lesson_15.OOPTask.model.color.Color;

public class Figure implements FigureCalculatable, Comparable<Figure> {
    private Material material;
    private Color color;

    protected Figure(Material material) {
        this.material = material;
    }

    protected Figure(Material material, Color color) {
        this.material = material;
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (material == Material.PAPER) {
            try {
                if (this.color != null) throw new ImpossibleToColorException("The figure has a color " + this.color);
                this.color = color;
            } catch (ImpossibleToColorException e) {
                e.printStackTrace();
            }
        }

        if (material == Material.TAPE) {
            try {
                throw new ImpossibleToColorException("The figure from the TAPE ");
            } catch (ImpossibleToColorException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int compareTo(Figure o) {
        if (getClass().getSimpleName().compareTo(o.getClass().getSimpleName()) != 0)
            return (getClass().getSimpleName().compareTo(o.getClass().getSimpleName()));
        return (getMaterial().ordinal() - o.getMaterial().ordinal());
    }

    public String fieldsToFileLine(){
        return getClass().getSimpleName();
    }
}
