public class Doctor {
     private String name;
     private String patronymic;
     private int workExperience;
     private String toMakeADiagnosis;
     private int cabinet;
     private String prescribeMedicine;
     private String giveDirectionsTo;

    public Doctor(String name, String patronymic, int workExperience,
                  String toMakeADiagnosis, int cabinet, String prescribeMedicine, String giveDirectionsTo) {
        this.name = name;
        this.patronymic = patronymic;
        this.workExperience = workExperience;
        this.toMakeADiagnosis = toMakeADiagnosis;
        this.cabinet = cabinet;
        this. prescribeMedicine = prescribeMedicine;
        this.giveDirectionsTo = giveDirectionsTo;
    }
    public Doctor() {
        name = "Test";
        patronymic = "Test";
        workExperience = 999;
        toMakeADiagnosis = "Test";
        cabinet = 999;
        prescribeMedicine = "Paracetomol";
        giveDirectionsTo = "Surgery";
    }
    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", workExperience=" + workExperience +
                ", toMakeADiagnosis='" + toMakeADiagnosis + '\'' +
                ", cabinet=" + cabinet +
                ", prescribeMedicine='" + prescribeMedicine + '\'' +
                ", giveDirectionsTo='" + giveDirectionsTo + '\'' +
                '}';
    }
}
