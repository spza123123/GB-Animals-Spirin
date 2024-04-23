public class Nurse {
    private String name;
    private int workExperience;
    private String getVaccinated;
    private boolean bandaging;


    public Nurse(String name, int workExperience, String getVaccinated, boolean bandaging) {
        this.name = name;
        this.workExperience = workExperience;
        this.getVaccinated = getVaccinated;
        this.bandaging = bandaging;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "name='" + name + '\'' +
                ", workExperience=" + workExperience +
                ", getVaccinated='" + getVaccinated + '\'' +
                ", bandaging=" + bandaging +
                '}';
    }
}
