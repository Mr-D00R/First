class SpecializedDoctor extends Doctor {
    private static final int MAX_PATIENTS = 5;
 
    public SpecializedDoctor(String name, int id, int priority) {
       super(name, id, priority);
    }
 
    public String generateReport(Patient patient) {
       return "Specialized Doctor Report for " + patient.getName();
    }
 }
 
