package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        

        /*
        Set<Task> annsTasks = new HashSet<>();
        Task taskAnn1 = new Task("workintech","dummy1","Ann" , Status.IN_PROGRESS, Priority.MED);
        Task taskAnn2= new Task("workintech","dummy2","Ann" , Status.IN_PROGRESS, Priority.HIGH);
        annsTasks.add(taskAnn1);
        annsTasks.add(taskAnn2);

        Set<Task> bobTasks = new HashSet<>();
        Task taskBob1 = new Task("workintech","dummy1","Bob" , Status.IN_PROGRESS, Priority.MED);
        Task taskBob2= new Task("workintech","dummy2","Bob" , Status.IN_PROGRESS, Priority.HIGH);
        bobTasks.add(taskBob1);
        bobTasks.add(taskBob2);

        Set<Task> carolsTask =  new HashSet<>();
        Task taskCarol1 = new Task("workintech","dummy1","Carol" , Status.IN_PROGRESS, Priority.MED);
        Task taskCarol2= new Task("workintech","dummy2","Carol" , Status.IN_PROGRESS, Priority.HIGH);
        carolsTask.add(taskCarol1);
        carolsTask.add(taskCarol2);

        Set<Task> unassignedTasks =  new HashSet<>();
        Task taskUnassigned= new Task("workintech","dummy5","Unassigned" , Status.IN_PROGRESS, Priority.HIGH);
        unassignedTasks.add(taskUnassigned);

        TaskData taskData = new TaskData(annsTasks,bobTasks,carolsTask,unassignedTasks);

        System.out.println(taskData.getTasks("ann"));
        System.out.println(taskData.getTasks("bob"));
        System.out.println(taskData.getTasks("carol"));
        System.out.println(taskData.getTasks("all"));

        taskData.getIntersection(annsTasks,bobTasks);

        System.out.println(taskData.getDifferences(unassignedTasks,taskData.getTasks("ann")));

         */
        StringSet.findUniqueWords();

    }
}