public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Tache 1", "Description de la tache 1");
        taskManager.addTask("Tache 2", "Description de la tache 2");
        taskManager.addTask("Tache 3", "Description de la tache 3");

        taskManager.markTaskAsComplete(1);

        TaskReport taskReport = new TaskReport();
        taskReport.printCompletedTasks(taskManager.getTasks());
        taskReport.printPendingTasks(taskManager.getTasks());
    }
}
