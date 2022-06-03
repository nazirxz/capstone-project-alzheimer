// Generated by view binder compiler. Do not edit!
package com.capstone.alzheimercare.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.capstone.alzheimercare.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemTaskBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final MaterialCardView cvItemRecord;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ConstraintLayout itemContainer;

  @NonNull
  public final TextView tvDate;

  @NonNull
  public final TextView tvTask;

  private ItemTaskBinding(@NonNull MaterialCardView rootView,
      @NonNull MaterialCardView cvItemRecord, @NonNull ImageView imageView2,
      @NonNull ConstraintLayout itemContainer, @NonNull TextView tvDate, @NonNull TextView tvTask) {
    this.rootView = rootView;
    this.cvItemRecord = cvItemRecord;
    this.imageView2 = imageView2;
    this.itemContainer = itemContainer;
    this.tvDate = tvDate;
    this.tvTask = tvTask;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemTaskBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_task, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemTaskBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      MaterialCardView cvItemRecord = (MaterialCardView) rootView;

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.item_container;
      ConstraintLayout itemContainer = ViewBindings.findChildViewById(rootView, id);
      if (itemContainer == null) {
        break missingId;
      }

      id = R.id.tv_date;
      TextView tvDate = ViewBindings.findChildViewById(rootView, id);
      if (tvDate == null) {
        break missingId;
      }

      id = R.id.tv_task;
      TextView tvTask = ViewBindings.findChildViewById(rootView, id);
      if (tvTask == null) {
        break missingId;
      }

      return new ItemTaskBinding((MaterialCardView) rootView, cvItemRecord, imageView2,
          itemContainer, tvDate, tvTask);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}