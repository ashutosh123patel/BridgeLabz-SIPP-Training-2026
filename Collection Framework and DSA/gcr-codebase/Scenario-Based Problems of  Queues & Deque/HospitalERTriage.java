import java.util.PriorityQueue;

public class HospitalERTriage {

    static class Patient {
        int priority;
        String name;

        Patient(int priority, String name) {
            this.priority = priority;
            this.name = name;
        }
    }

    PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> a.priority - b.priority);
    public void admitPatient(Patient p) {

        triageQueue.offer(p);
        System.out.println(p.name + " Admitted");
    }

    public Patient callNextPatient() {

        if (triageQueue.isEmpty()) {
            System.out.println("No Patients Waiting");
            return null;
        }

        return triageQueue.poll();
    }

    public void display() {
        if (triageQueue.isEmpty()) {
            System.out.println("No Patients Waiting");
            return;
        }

        System.out.println("Patients in Queue:");
        for (Patient p : triageQueue) {
            System.out.println("Priority : " + p.priority + "  Name : " + p.name);
        }
    }

    public static void main(String[] args) {
        HospitalERTriage er = new HospitalERTriage();
        er.admitPatient(new Patient(3, "Amit"));
        er.admitPatient(new Patient(1, "Rahul"));
        er.admitPatient(new Patient(2, "Neha"));
        er.admitPatient(new Patient(5, "Riya"));

        System.out.println();

        er.display();

        System.out.println();

        Patient p = er.callNextPatient();

        System.out.println("Next Patient : " + p.name + " (Priority " + p.priority + ")");

        System.out.println();

        er.display();
    }
}