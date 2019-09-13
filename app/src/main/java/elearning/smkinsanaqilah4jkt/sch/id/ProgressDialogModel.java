package elearning.smkinsanaqilah4jkt.sch.id;

import android.app.ProgressDialog;
import android.content.Context;

public class ProgressDialogModel {
    static ProgressDialog progressDialog;

    public static void pdMenyiapkanDataLogin(Context context){
        progressDialog=new ProgressDialog(context, R.style.AppCompatAlertDialogStyle);
        progressDialog.setMessage("Preparing Data....");
        progressDialog.setTitle("Please Wait");
        progressDialog.show();
    }

    public static void hideProgressDialog(){
        if (progressDialog != null) {
            progressDialog.dismiss();
            progressDialog = null;
        }
    }

}

