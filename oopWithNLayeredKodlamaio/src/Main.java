import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.loging.DatabaseLogger;
import core.loging.FileLogger;
import core.loging.Logger;
import core.loging.MailLogger;
import dataAccess.category.JdbcCategoryDao;
import dataAccess.corse.HibernateCourseDao;
import dataAccess.instructor.HibernateInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        /*ArrayList<Instructor> instructors = new ArrayList<>();

        Instructor instructor1 = new Instructor(1, "Alp", "Yanıkoğlu", 10000);
        Instructor instructor2 = new Instructor(1, "Mustafa", "Yanıkoğlu", 10000);

        Logger[] loggers = {new DatabaseLogger(),new FileLogger(), new MailLogger()};

        InstructorManager instructorManager = new InstructorManager (new HibernateInstructorDao(), loggers, instructors);

        try {
            instructorManager.add(instructor1);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            instructorManager.add(instructor2);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/

       /* ArrayList<Course> courses = new ArrayList<Course>();
        Course course1 =new Course(1, "7th Grade Science Lesson", 10000);
        Course course2 =new Course(1, "7th Grade Science Lesson", 10000);

        Logger[] loggerscourse = {new DatabaseLogger(),new FileLogger(), new MailLogger()};


        CourseManager courseManager = new CourseManager( new HibernateCourseDao(), loggerscourse,courses);

        try {
            courseManager.add(course1);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        try {
            courseManager.add(course2);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/

        ArrayList<Category> categories = new ArrayList<Category>();
        Category category1 = new Category(1, "Secondary Education");
        Category category2 = new Category(1, "Secondary Education");

        Logger[] loggerscategory = {new DatabaseLogger(),new FileLogger(), new MailLogger()};


        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggerscategory,categories);

        try {
            categoryManager.add(category1);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        try {
            categoryManager.add(category2);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}