package sa52.team03.adproject.service;

import java.util.List;
import java.util.Map;

import sa52.team03.adproject.domain.AcademicPeriod;
import sa52.team03.adproject.domain.Admin;
import sa52.team03.adproject.domain.Class;
import sa52.team03.adproject.domain.Lecturer;
import sa52.team03.adproject.domain.Module;
import sa52.team03.adproject.domain.Schedule;
import sa52.team03.adproject.domain.Student;

public interface AdminService {

	public List<Class> getClasses();

	public Class saveClass(Class c);
	
	public Class getClassByCode(String code);

	public List<Lecturer> getLecturers();

	public Lecturer saveLecturer(Lecturer lecturer);

	public Lecturer getLecturerById(int id);

	public void deleteLecturer(int id);

	public List<Module> getModules();

	public Module getModuleById(int id);

	public Module saveModule(Module module);

	public void deleteModule(int id);

	public List<Schedule> getSchedules();

	public Schedule saveSchedule(Schedule schedule);

	public void deleteSchedule(int id);

	public List<Class> getClassByModuleId(int id);

	public List<Student> getStudentsByClassId(int id);

	public List<Schedule> getClassScheduleUntilNow(int classId);

	public String calculateClassAttendanceRate(int classId);

	public int calculateStudentAttendanceRate(int classId, int studentId);

	public Map<String, Object> createClassMap(Class c);

	public Map<String, Object> createStudentMap(Student s, int classId);

	public int getStudentAbsenceTimes(int classId, int studentId);

	public int predictStudentPassOrNot(int classId, int studentId);

	public void updateClassStudentPredictedGrade(int classId);

	public List<Schedule> getClassFutureSchedule(int classId);

	public void updateClassPredictedAttendanceRate(int classId) throws Exception;

	public List<AcademicPeriod> getAcademicPeriods();

	public AcademicPeriod getAcademicPeriodsById(int id);

	public List<Class> getclasses();

	public void deleteclasses(int id);

	public List<Student> getStudents();

	public Student getStudentById(int id);

	public Map<String, Object> createValidationMap(String toCheck, String moduleValidation);

	public Student saveStudent(Student student);

	public void deleteStudent(int id);

	public Boolean isStudentExist(int id, String userName);

	public Boolean isLecturerExist(int id, String userName);
	
	public void enrollStudent(int classId,int studentId);
	
	public void  removeStudentInClass(int classId,int studentId) ;
	
	public List<Integer> classID();
	
	public void saveAcademicPeriod(AcademicPeriod acPeriod);
	
	public void saveAdmin(Admin admin);

}
