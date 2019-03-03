package home.lessons.spring5recipeapp.services;

import home.lessons.spring5recipeapp.commands.RecipeCommand;
import home.lessons.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(long anyLong);
}
