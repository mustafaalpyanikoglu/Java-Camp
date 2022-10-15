package business;

import business.constants.CategoryMessages;
import core.loging.Logger;
import dataAccess.category.CategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private CategoryDao _categoryDao;
    private Logger[] _loggers;
    private List<Category> _categories;

    public CategoryManager(CategoryDao _categoryDao, Logger[] loggers, List<Category> categories) {
        this._categoryDao = _categoryDao;
        this._loggers = loggers;
        this._categories = categories;
    }

    public void add(Category category) throws Exception {
        for (Category item : _categories)
        {
            if(item.getName() == category.getName())
            {
                throw new Exception(CategoryMessages.CategoryNameAlreadyExist);
            }
        }

        _categories.add(category);
        _categoryDao.add(category);

        for(Logger logger : _loggers)
        {
            logger.log(category.getName());
        }
    }

}
