// Generated by data binding compiler. Do not edit!
package com.tauheed.wavybottomnavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.tauheed.wavybottomnavigation.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class WavyNavigationCellBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout fl;

  @NonNull
  public final ImageView iv;

  @NonNull
  public final TextView tvCount;

  @NonNull
  public final View vCircle;

  protected WavyNavigationCellBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout fl, ImageView iv, TextView tvCount, View vCircle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fl = fl;
    this.iv = iv;
    this.tvCount = tvCount;
    this.vCircle = vCircle;
  }

  @NonNull
  public static WavyNavigationCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.wavy_navigation_cell, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static WavyNavigationCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<WavyNavigationCellBinding>inflateInternal(inflater, R.layout.wavy_navigation_cell, root, attachToRoot, component);
  }

  @NonNull
  public static WavyNavigationCellBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.wavy_navigation_cell, null, false, component)
   */
  @NonNull
  @Deprecated
  public static WavyNavigationCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<WavyNavigationCellBinding>inflateInternal(inflater, R.layout.wavy_navigation_cell, null, false, component);
  }

  public static WavyNavigationCellBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static WavyNavigationCellBinding bind(@NonNull View view, @Nullable Object component) {
    return (WavyNavigationCellBinding)bind(component, view, R.layout.wavy_navigation_cell);
  }
}
