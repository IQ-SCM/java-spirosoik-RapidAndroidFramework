package com.soi.rapidandroidapp.ui.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;


public class ProgressDialogFragment extends DialogFragment {

    private static final String PARAM_MESSAGE = "ProgressDialogFragment.PARAM_MESSAGE";

    public static ProgressDialogFragment newInstance(String message) {

        Bundle args = new Bundle();
        args.putString(PARAM_MESSAGE, message);

        ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
        progressDialogFragment.setArguments(args);
        return progressDialogFragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final Bundle args = getArguments();

        final String paramMessage = args.getString(PARAM_MESSAGE);

        Dialog dialog = ProgressDialog.show(getActivity(), "gRateFriends", paramMessage);
        dialog.setCancelable(true);
        return dialog;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        if (getDialog() == null ) {
            setShowsDialog( false );
        }
        super.onActivityCreated(savedInstanceState);
    }
}