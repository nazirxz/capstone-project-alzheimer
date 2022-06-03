// Generated by view binder compiler. Do not edit!
package com.capstone.alzheimercare.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.capstone.alzheimercare.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCaretakerGuideBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RecyclerView rcList;

  @NonNull
  public final TextView tvSubtitle;

  @NonNull
  public final TextView tvTitle;

  private FragmentCaretakerGuideBinding(@NonNull LinearLayout rootView,
      @NonNull RecyclerView rcList, @NonNull TextView tvSubtitle, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.rcList = rcList;
    this.tvSubtitle = tvSubtitle;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCaretakerGuideBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCaretakerGuideBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_caretaker_guide, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCaretakerGuideBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rcList;
      RecyclerView rcList = ViewBindings.findChildViewById(rootView, id);
      if (rcList == null) {
        break missingId;
      }

      id = R.id.tvSubtitle;
      TextView tvSubtitle = ViewBindings.findChildViewById(rootView, id);
      if (tvSubtitle == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new FragmentCaretakerGuideBinding((LinearLayout) rootView, rcList, tvSubtitle,
          tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
