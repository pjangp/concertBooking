package concertbooking;

public class Canceled extends AbstractEvent {

    private Long id;
    private Long id;
    private String ccName;
    private String ccDate;
    private Long stock;

    public Canceled(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCcName() {
        return ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName;
    }
    public String getCcDate() {
        return ccDate;
    }

    public void setCcDate(String ccDate) {
        this.ccDate = ccDate;
    }
    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }
}
