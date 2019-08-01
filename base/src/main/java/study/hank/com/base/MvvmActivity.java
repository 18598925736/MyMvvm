package study.hank.com.base;

import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;

/**
 * MVVM模式的Activity基类
 */
public abstract class MvvmActivity<V extends ViewDataBinding, VM extends IMvvmViewMode> extends AppCompatActivity {

}
