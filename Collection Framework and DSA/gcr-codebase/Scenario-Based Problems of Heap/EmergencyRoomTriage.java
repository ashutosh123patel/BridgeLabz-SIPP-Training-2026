import java.util.PriorityQueue;

public class EmergencyRoomTriage {

    static class Patient {
        String name;
        int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }

    PriorityQueue<Patient> triageQueue = new PriorityQueue<>((a, b) -> b.severity - a.severity);

    public void addPatient(Patient patient) {
        triageQueue.offer(patient);
    }

    public Patient treatNext() {
        return triageQueue.poll();
    }

    public Patient peekNext() {
        return triageQueue.peek();
    }

    public void displayQueue() {

        for (Patient patient : triageQueue) {
            System.out.println(patient.name + " (Severity: " + patient.severity + ")");
        }
    }

    public static void main(String[] args) {

        EmergencyRoomTriage er = new EmergencyRoomTriage();

        er.addPatient(new Patient("Aman", 5));
        er.addPatient(new Patient("Rahul", 9));
        er.addPatient(new Patient("Priya", 7));
        er.addPatient(new Patient("Neha", 10));

        System.out.println("Most Severe Patient: " + er.peekNext().name);

        Patient treated = er.treatNext();

        System.out.println("Treating Patient: " + treated.name);

        System.out.println("\nRemaining Patients:");

        er.displayQueue();
    }
}