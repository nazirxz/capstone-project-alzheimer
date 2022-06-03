// Generated by view binder compiler. Do not edit!
package com.capstone.alzheimercare.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.capstone.alzheimercare.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemGuideDetailBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final ImageView ivItemPicture;

  @NonNull
  public final TextView tvItemDescription;

  @NonNull
  public final TextView tvItemName;

  private ItemGuideDetailBinding(@NonNull NestedScrollView rootView,
      @NonNull ImageView ivItemPicture, @NonNull TextView tvItemDescription,
      @NonNull TextView tvItemName) {
    this.rootView = rootView;
    this.ivItemPicture = ivItemPicture;
    this.tvItemDescription = tvItemDescription;
    this.tvItemName = tvItemName;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemGuideDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemGuideDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_guide_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemGuideDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_item_picture;
      ImageView ivItemPicture = ViewBindings.findChildViewById(rootView, id);
      if (ivItemPicture == null) {
        break missingId;
      }

      id = R.id.tv_item_description;
      TextView tvItemDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvItemDescription == null) {
        break missingId;
      }

      id = R.id.tv_item_name;
      TextView tvItemName = ViewBindings.findChildViewById(rootView, id);
      if (tvItemName == null) {
        break missingId;
      }

      return new ItemGuideDetailBinding((NestedScrollView) rootView, ivItemPicture,
          tvItemDescription, tvItemName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
