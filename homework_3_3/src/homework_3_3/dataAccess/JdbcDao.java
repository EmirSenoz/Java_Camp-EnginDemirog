package homework_3_3.dataAccess;


import homework_3_3.entity.Category;
import homework_3_3.entity.Course;
import homework_3_3.entity.Instructor;

public class JdbcDao implements   CategoryDao, CourseDao, InstructorDao{


    @Override
    public void add(Category category) {
        System.out.println(category.getName()+" JDBC ile eklendi");
    }

    @Override
    public void add(Course course) {
        System.out.println(course.getName()+" kursu"+course.getPrice()+" Tl fiyatı ile JDBC ile eklenmiştir");

    }

    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getFirstName()+" "+ instructor.getLastName()+" İsimli eğitmen JDBC ile eklenmiştir");
    }
}
