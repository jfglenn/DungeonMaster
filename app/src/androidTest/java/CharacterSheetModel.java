public class CharacterSheetModel {

    private int id;
    private String name;
    private String races;
    private String classes;

    // Constructors

    public CharacterSheetModel(int id, String name, String races, String classes) {
        this.id = id;
        this.name = name;
        this.races = races;
        this.classes = classes;
    }

    public CharacterSheetModel(){

    }

    @Override
    public String toString() {
        return "CharacterSheet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", races='" + races + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaces() {
        return races;
    }

    public void setRaces(String races) {
        this.races = races;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
