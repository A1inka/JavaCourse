package homework6.task11;

import java.util.Set;

public class Dish {
    private String nameOfTheDish;
    private Set<String> necessaryIngredients;
    private String category;
    private int kingsRating;
    private int courtiersRating;
    // мои дополнительные параметры
    private int difficultyOfPreparation;
    private int cookingTime;
    private String type;

    public Dish(String nameOfTheDish, Set<String> necessaryIngredients, String category, int kingsRating,
                int courtiersRating, int difficultyOfPreparation, int cookingTime, String type) {
        this.nameOfTheDish = nameOfTheDish;
        this.necessaryIngredients = necessaryIngredients;
        if (category.equalsIgnoreCase("закуска") || category.equalsIgnoreCase("горячее") ||
                category.equalsIgnoreCase("десерт")) {
            this.category = category.toLowerCase();
        } else {
            throw new IllegalArgumentException("Неверно задана категория блюда!");
        }
        if (kingsRating >= 0 && kingsRating <= 100) {
            this.kingsRating = kingsRating;
        } else {
            throw new IllegalArgumentException("Неверно задана оценка короля!");
        }
        if (courtiersRating >= 0 && courtiersRating <= 100) {
            this.courtiersRating = courtiersRating;
        } else {
            throw new IllegalArgumentException("Неверно задана оценка придворных!");
        }
        if (difficultyOfPreparation >= 0 && difficultyOfPreparation <= 100) {
            this.difficultyOfPreparation = difficultyOfPreparation;
        } else {
            throw new IllegalArgumentException("Неверно задана сложность приготовления блюда!");
        }
        if (cookingTime > 0) {
            this.cookingTime = cookingTime;
        } else {
            throw new IllegalArgumentException("Неверно задано время приготовления блюда!");
        }
        if (type.equalsIgnoreCase("вегетарианское") || type.equalsIgnoreCase("веганское") ||
                type.equalsIgnoreCase("рыбное") || type.equalsIgnoreCase("мясное")) {
            this.type = type.toLowerCase();
        } else {
            throw new IllegalArgumentException("Неверно задан тип блюда!");
        }
    }

    public String getNameOfTheDish() {
        return nameOfTheDish;
    }

    public void setNameOfTheDish(String nameOfTheDish) {
        this.nameOfTheDish = nameOfTheDish;
    }

    public Set<String> getNecessaryIngredients() {
        return necessaryIngredients;
    }

    public void setNecessaryIngredients(Set<String> necessaryIngredients) {
        this.necessaryIngredients = necessaryIngredients;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category.equalsIgnoreCase("закуска") || category.equalsIgnoreCase("горячее") ||
                category.equalsIgnoreCase("десерт")) {
            this.category = category.toLowerCase();
        } else {
            throw new IllegalArgumentException("Неверно задана категория блюда!");
        }
    }

    public int getKingsRating() {
        return kingsRating;
    }

    public void setKingsRating(int kingsRating) {
        if (kingsRating >= 0 && kingsRating <= 100) {
            this.kingsRating = kingsRating;
        } else {
            throw new IllegalArgumentException("Неверно задана оценка короля!");
        }
    }

    public int getCourtiersRating() {
        return courtiersRating;
    }

    public void setCourtiersRating(int courtiersRating) {
        if (courtiersRating >= 0 && courtiersRating <= 100) {
            this.courtiersRating = courtiersRating;
        } else {
            throw new IllegalArgumentException("Неверно задана оценка придворных!");
        }
    }

    public int getDifficultyOfPreparation() {
        return difficultyOfPreparation;
    }

    public void setDifficultyOfPreparation(int difficultyOfPreparation) {
        if (difficultyOfPreparation >= 0 && difficultyOfPreparation <= 100) {
            this.difficultyOfPreparation = difficultyOfPreparation;
        } else {
            throw new IllegalArgumentException("Неверно задана сложность приготовления блюда!");
        }
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        if (cookingTime > 0) {
            this.cookingTime = cookingTime;
        } else {
            throw new IllegalArgumentException("Неверно задано время приготовления блюда!");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.equalsIgnoreCase("вегетарианское") ||
                type.equalsIgnoreCase("рыбное") || type.equalsIgnoreCase("мясное")) {
            this.type = type.toLowerCase();
        } else {
            throw new IllegalArgumentException("Неверно задан тип блюда!");
        }
    }

    @Override
    public String toString() {
        return nameOfTheDish;
    }
}
