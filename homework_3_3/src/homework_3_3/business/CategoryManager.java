package homework_3_3.business;

import homework_3_3.core.logging.Logger;
import homework_3_3.dataAccess.CategoryDao;
import homework_3_3.entity.Category;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private List<Category> categories;
    private Logger logger;

    public CategoryManager(CategoryDao categoryDao, List<Category> categories, Logger logger) {
        this.categoryDao = categoryDao;
        this.categories = categories;
        this.logger = logger;
    }

    public void add(Category category) throws Exception{
        for (Category category1 : categories){
            if (category.getName().equals(category1.getName())){
                throw new Exception("Katagori ismi mevcuttur,tekrar edemez!");
            }
        }
        categoryDao.add(category);
        categories.add(category);
        logger.log(category.getName());

    }
}
