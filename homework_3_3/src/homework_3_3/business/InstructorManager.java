package homework_3_3.business;

import homework_3_3.core.logging.Logger;
import homework_3_3.dataAccess.InstructorDao;
import homework_3_3.entity.Instructor;

import java.util.List;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger logger;

    public InstructorManager (InstructorDao instructorDao, Logger logger){
        this.instructorDao =instructorDao;
        this.logger = logger;
    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);
        logger.log(instructor.getFirstName() + " " + instructor.getLastName());
    }
}
