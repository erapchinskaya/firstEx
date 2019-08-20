package main.java.com.it.app;

import main.java.com.it.app.domain.*;
import main.java.com.it.app.service.AdministratorService;
import main.java.com.it.app.service.CleaningLadyService;
import main.java.com.it.app.service.PupilService;
import main.java.com.it.app.service.TeacherService;
import main.java.com.it.app.service.impl.AdministratorServiceImpl;
import main.java.com.it.app.service.impl.CleaningLadyServiceImpl;
import main.java.com.it.app.service.impl.PupilServiceImpl;
import main.java.com.it.app.service.impl.TeacherServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
	private final TeacherService teacherService;
	private final AdministratorService administratorService;
	private final CleaningLadyService cleaningLadyService;
	private final PupilService pupilService;
	

	private Main() {
		this.teacherService = TeacherServiceImpl.getInstance();
		this.administratorService = AdministratorServiceImpl.getInstance();
		this.cleaningLadyService = CleaningLadyServiceImpl.getInstance();
		this.pupilService = PupilServiceImpl.getInstance();
	}

	public static void main(String[] args) {
		List<Integer> fisics = new ArrayList<>();
		fisics.add(5);
		fisics.add(3);
		fisics.add(5);
		fisics.add(3);
		fisics.add(5);
		fisics.add(3);

		List<Integer> math = new ArrayList<>();
		math.add(2);
		math.add(2);
		math.add(2);
		math.add(2);
		
		List<Integer> english = new ArrayList<>();
		english.add(7);
		english.add(10);
		english.add(4);

		Subject sub1 = new Subject();

		sub1.setFisics(fisics);
		sub1.setMathematics(math);
		sub1.setEnglish(english);

		Main main = new Main();
		main.teacherService.deleteAll();
		main.administratorService.deleteAll();
		main.cleaningLadyService.deleteAll();
		main.teacherService.save(new Teacher(1L, "Teacher", "Teacher", 25, 25, "Math"));
		main.teacherService.getAll().forEach(System.out::println);
		main.administratorService.save(new Administrator(1L, "Dirik", "Dirik", 25, 100, "dirik"));
		main.administratorService.getAll().forEach(System.out::println);
		main.cleaningLadyService.save(new CleaningLady(1L, "CleaningLady", "CleaningLady", 25, 25, true));
		main.cleaningLadyService.save(new CleaningLady(1L, "CleaningLady", "CleaningLady", 25, 25, true));
		main.pupilService.deleteAll();
		main.pupilService.save(new Pupil(1L, "Pupil", "Pupil", 10, 5, sub1));
		main.pupilService.getAll().forEach(System.out::println);
		main.cleaningLadyService.deleteById(1L);
		main.cleaningLadyService.getAll().forEach(System.out::println);

	}
}