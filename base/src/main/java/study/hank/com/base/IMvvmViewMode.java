package study.hank.com.base;

/**
 * ViewModel接口
 * <p>
 * viewMode是View和Model层的中间人，将View和Model
 */
public interface IMvvmViewMode<V> {
    void attachUI(V view);

    V getPageView();

    boolean isUIAttached();

    void detachUI();
}
