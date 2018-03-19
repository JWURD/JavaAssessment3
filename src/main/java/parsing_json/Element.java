package parsing_json;

import java.util.ArrayList;

public class Element {
    private String name;
    private String appearance;
    private double atomic_mass;
    private double boil;
    private String category;
    private String color;
    private double density;
    private String discovered_by;
    private double melt;
    private double molar_heat;
    private String named_by;
    private int number;
    private int period;
    private String phase;
    private String source;
    private String spectral_img;
    private String summary;
    private String symbol;
    private int xpos;
    private int ypos;
    private ArrayList<Integer> shells;

    /**
     * looking to turn this constructor into a builder but for now I want something to work.
     *
     * @param name
     * @param appearance
     * @param atomic_mass
     * @param boil
     * @param category
     * @param color
     * @param density
     * @param discovered_by
     * @param melt
     * @param molar_heat
     * @param named_by
     * @param number
     * @param period
     * @param phase
     * @param source
     * @param spectral_img
     * @param summary
     * @param symbol
     * @param xpos
     * @param ypos
     * @param shells
     */
    public Element(String name, String appearance, double atomic_mass, double boil, String category, String color,
                   double density, String discovered_by, double melt, double molar_heat, String named_by, int number,
                   int period, String phase, String source, String spectral_img, String summary, String symbol, int xpos, int ypos, ArrayList<Integer> shells) {
        this.name = name;
        this.appearance = appearance;
        this.atomic_mass = atomic_mass;
        this.boil = boil;
        this.category = category;
        this.color = color;
        this.density = density;
        this.discovered_by = discovered_by;
        this.melt = melt;
        this.molar_heat = molar_heat;
        this.named_by = named_by;
        this.number = number;
        this.period = period;
        this.phase = phase;
        this.source = source;
        this.spectral_img = spectral_img;
        this.summary = summary;
        this.symbol = symbol;
        this.xpos = xpos;
        this.ypos = ypos;
        this.shells = shells;
    }

    public String getName() {
        return name;
    }

    public String getAppearance() {
        return appearance;
    }

    public double getAtomic_mass() {
        return atomic_mass;
    }

    public double getBoil() {
        return boil;
    }

    public String getCategory() {
        return category;
    }

    public String getColor() {
        return color;
    }

    public double getDensity() {
        return density;
    }

    public String getDiscovered_by() {
        return discovered_by;
    }

    public double getMelt() {
        return melt;
    }

    public double getMolar_heat() {
        return molar_heat;
    }

    public String getNamed_by() {
        return named_by;
    }

    public int getNumber() {
        return number;
    }

    public int getPeriod() {
        return period;
    }

    public String getPhase() {
        return phase;
    }

    public String getSource() {
        return source;
    }

    public String getSpectral_img() {
        return spectral_img;
    }

    public String getSummary() {
        return summary;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getXpos() {
        return xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public ArrayList<Integer> getShells() {
        return this.shells;
    }
}
        /* public static class Builder {
        private String name;
        private String appearance;
        private double atomic_mass;
        private double boil;
        private String category;
        private String color;
        private double density;
        private String discoverd_by;
        private double melt;
        private double molar_heat;
        private String named_by;
        private int number;
        private int period;
        private String phase;
        private String source;
        private String spectral_img;
        private String summary;
        private String symbol;
        private int xpos;
        private int ypos;
        private int[] shells;

        public Builder(String name, String appearance, double atomic_mass) {
            this.name = name;
            this.appearance = appearance;
            this.atomic_mass = atomic_mass;
        }

        public Builder boil(double boil) {
            this.boil = boil;
            return this;
        }
        public Builder category(String category){
            this.category = category;
            return this;
        }
        public Builder color(String color){
            this.color = color;
            return this;
        }
        public Builder density(double density){
            this.density = density;
            return this;
        }
        public Builder discoverd_by(String discoverd_by){
            this.discoverd_by = discoverd_by;
            return this;
        }
        public Builder melt(double melt){
            this.melt = melt;
            return this;
        }
        public Builder molar_heat(double molar_heat){
            this.molar_heat = molar_heat;
            return this;
        }
        public Builder named_by(String named_by){
            this.named_by = named_by;
            return this;
        }
        public Builder number(int number){
            this.number = number;
            return this;
        }*/




