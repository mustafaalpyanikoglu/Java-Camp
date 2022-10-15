package business;

import business.constants.CourseMessages;
import core.loging.Logger;
import dataAccess.corse.CourseDao;
import entities.Course;

import java.util.List;

public class CourseManager {
    private CourseDao _courseDao;
    private Logger[] _loggers;
    private List<Course> _courses;

    public CourseManager(CourseDao _courseDao, Logger[] _loggers, List<Course> _courses) {
        this._courseDao = _courseDao;
        this._loggers = _loggers;
        this._courses = _courses;
    }

    public void add(Course course) throws Exception
    {
        for (Course item: _courses)
        {
            if(item.getName() == course.getName())
            {
                throw new Exception(CourseMessages.CourseNameAlreadyExist);
            }
            if(course.getCoursePrice()<0)
            {
                throw new Exception(CourseMessages.CourseFeeIsLessThanZero);
            }
        }

        _courses.add(course);
        _courseDao.add((course));
        for (Logger logger: _loggers)
        {
            logger.log(course.getName());
        }
    }
}
