package sg.edu.rp.webservices.p12_mydatabook;


import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class VaccinationFragment extends Fragment {
    Button btnEdit;
    TextView tv;

    public VaccinationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vaccinationfragment,container,false);
        btnEdit = (Button) view.findViewById(R.id.buttonEdit2);
        tv = (TextView) view.findViewById(R.id.textView2);
        // Inflate the layout for this fragment

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout passPhrase =
                        (LinearLayout) inflater.inflate(R.layout.passphrase, null);
                final EditText etPassphrase = (EditText) passPhrase
                        .findViewById(R.id.editTextPassPhrase);
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Edit Bio?").setView(passPhrase)
                        // Set text for the positive button and the corresponding
                        //  OnClickListener when it is clicked
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                String et = etPassphrase.getText().toString();
                                tv.setText(et);
                            }
                        })
                        // Set text for the negative button and the corresponding
                        //  OnClickListener when it is clicked
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                            }
                        });
                // Create the AlertDialog object and return it
                AlertDialog alertDialog = builder.create();
                alertDialog.setCancelable(false);
                alertDialog.setCanceledOnTouchOutside(false);
                alertDialog.show();
            }
        });
        return view;
    }

}
