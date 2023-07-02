package model.dto;
import java.util.List;

public class PageListDTO<T> {
    private List<T> items;
    private boolean hasNextPage;
    private boolean hasPreviousPage;
    private int pageCount;

    public PageListDTO() {
    }

    public List<T> getItems() {
        return this.items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public boolean isHasNextPage() {
        return this.hasNextPage;
    }

    public boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public Boolean isHasPreviousPage() {
        return this.hasPreviousPage;
    }

    public Boolean getHasPreviousPage() {
        return this.hasPreviousPage;
    }

    public void setHasPreviousPage(Boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
