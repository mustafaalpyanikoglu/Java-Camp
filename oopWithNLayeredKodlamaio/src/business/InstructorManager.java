package business;

import business.constants.InstructorMessages;
import core.loging.Logger;
import dataAccess.corse.CourseDao;
import dataAccess.instructor.InstructorDao;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private InstructorDao _instructorDao;
    private Logger[] _loggers;
    private ArrayList<Instructor> _instructors;

    public InstructorManager(InstructorDao _instructorDao, Logger[] _loggers, ArrayList<Instructor> _instructors) {
        this._instructorDao = _instructorDao;
        this._loggers = _loggers;
        this._instructors = _instructors;
    }

    public void add(Instructor instructor) throws Exception
    {
        for(Instructor item: _instructors)
        {
            if(instructor.getFirstName() == item.getFirstName() && instructor.getLastName() == item.getLastName())
            {
                throw new Exception(InstructorMessages.FirstNameAndLastNameAlreadyExist);
            }
        }

        _instructors.add(instructor);
        _instructorDao.add(instructor);
        for(Logger logger: _loggers)
        {
            logger.log(instructor.getFirstName() + " " + instructor.getLastName());
        }
    }
}
