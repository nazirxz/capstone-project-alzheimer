// Generated by view binder compiler. Do not edit!
package com.capstone.alzheimercare.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.capstone.alzheimercare.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOnboardingBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView appsname;

  @NonNull
  public final Button btnSignin;

  @NonNull
  public final TextView detail;

  @NonNull
  public final ImageView imageView;

  private ActivityOnboardingBinding(@NonNull ConstraintLayout rootView, @NonNull TextView appsname,
      @NonNull Button btnSignin, @NonNull TextView detail, @NonNull ImageView imageView) {
    this.rootView = rootView;
    this.appsname = appsname;
    this.btnSignin = btnSignin;
    this.detail = detail;
    this.imageView = imageView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOnboardingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOnboardingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_onboarding, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOnboardingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appsname;
      TextView appsname = ViewBindings.findChildViewById(rootView, id);
      if (appsname == null) {
        break missingId;
      }

      id = R.id.btnSignin;
      Button btnSignin = ViewBindings.findChildViewById(rootView, id);
      if (btnSignin == null) {
        break missingId;
      }

      id = R.id.detail;
      TextView detail = ViewBindings.findChildViewById(rootView, id);
      if (detail == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      return new ActivityOnboardingBinding((ConstraintLayout) rootView, appsname, btnSignin, detail,
          imageView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}