package com.example.springdatabasicdemo;

import com.example.springdatabasicdemo.models.Group;
import com.example.springdatabasicdemo.models.Student;
import com.example.springdatabasicdemo.repositories.GroupRepository;
import com.example.springdatabasicdemo.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    private final GroupRepository groupRepository;
    private final StudentRepository studentRepository;

    public CommandLineRunnerImpl(GroupRepository groupRepository, StudentRepository studentRepository) {
        this.groupRepository = groupRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        seedData();

        printAllGroups();
        printAllStudents();
        printAllStudentsByGroupName("UVP-212");

    }

    private void printAllStudentsByGroupName(String groupName) {
        studentRepository
                .findAllByGroupName(groupName)
                .forEach(System.out::println);
    }

    private void printAllGroups() {
        groupRepository
                .findAll()
                .forEach(System.out::println);
    }

    private void printAllStudents() {
        studentRepository
                .findAll()
                .forEach(System.out::println);
    }

    private void seedData() throws IOException {
        //Добавление в БД записей
        Student s1 = new Student("Petr Ivanov");
        Student s2 = new Student("Ivan Petrov");
        Group g1 = new Group("UVP-211");
        Group g2 = new Group("UVP-212");

        s1.setGroup(g1);
        s2.setGroup(g2);

        studentRepository.save(s1);
        studentRepository.save(s2);
    }
}
