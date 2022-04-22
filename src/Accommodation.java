public class Accommodation {
    private int id;
    private String type;
    private String bedType;
    private int maxGuests;
    private String description;

    public Accommodation(int id, String type, String bedType, int maxGuests, String description) {
        this.id = id;
        this.type = type;
        this.bedType = bedType;
        this.maxGuests = maxGuests;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getBedType() {
        return bedType;
    }

    public int getMaxGuests() {
        return maxGuests;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public void setMaxGuests(int maxGuests) {
        this.maxGuests = maxGuests;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("%s -- %s -- %s", id, type, bedType, maxGuests, description);
    }
}
