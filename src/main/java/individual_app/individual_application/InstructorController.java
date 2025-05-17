package individual_app.individual_application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstructorController {

    @GetMapping("/show")
    public String show() {
        return printInfo();
    }

    @Value("${instructor.name}")
    private String instructorName;

    @Value("${instructor.dpartment}")
    private String instructorDepartment;

    public String printInfo() {
        return "Instructor Name: " + instructorName + "<br> Department: " + instructorDepartment;
    }
}
