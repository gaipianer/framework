package org.gaipianer.framework.web.mvc;

/**
 * @author Coder
 * @date 2020/6/3.
 */
public class PagedResult extends Result {

    /**
     * 数据总数
     * */
    protected long total;


    public PagedResult() {
        super();
    }

    public PagedResult(Object data, long total) {
        super(data);
        this.total = total;
    }

    public PagedResult(String message) {
        super(message);
    }

    public static PagedResult success(Object data, long total) {
        return new PagedResult(data, total);
    }

    public static PagedResult success() {
        PagedResult result = new PagedResult();
        result.success = true;
        return result;
    }

    public static PagedResult faild(String message) {
        return new PagedResult(message);
    }

    public static PagedResult faild() {
        PagedResult result = new PagedResult();
        result.success = false;
        return result;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
