package homework_3_3.business;

import homework_3_3.core.logging.DatabaseLogger;
import homework_3_3.core.logging.Logger;
import homework_3_3.dataAccess.CourseDao;
import homework_3_3.dataAccess.JdbcDao;
import homework_3_3.entity.Course;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private List<Course> courses;
    private Logger logger;

    public CourseManager(JdbcDao jdbcDao,List<Course> courses, DatabaseLogger databaseLogger) {
    }



    public void CategoryManager(CourseDao categoryDao, List<Course> courses, Logger logger){
        this.courseDao = courseDao;
        this.courses = courses;
        this.logger = logger;
    }
    public void add(Course course) throws Exception {
        for (Course course1 : courses){
            if (course.getName().equals(course1.getName())){
                throw new Exception("Aynı kurs tekrar eklenemez!");
            }
            if (course.getPrice() < 0){
                throw new Exception("Kurs fiyatı 0'dan küçük olamaz!");
            }
            courseDao.add(course);
            courses.add(course);
            logger.log(course.getName());


        }
    }
}
