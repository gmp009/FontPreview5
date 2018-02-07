package gmlab.fontpreview;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button SelectFont;
    TextView Hello;
    TextView Hi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SelectFont = findViewById(R.id.select_font);
        Hello = findViewById(R.id.hello);
        Hi = findViewById(R.id.hi);



        SelectFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AlertDialog.Builder builderSingle = new AlertDialog.Builder(MainActivity.this);
                builderSingle.setTitle("Select any font");

                final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.select_dialog_singlechoice);


                arrayAdapter.add("Font1");
                arrayAdapter.add("Font2");
                arrayAdapter.add("Font3");
                arrayAdapter.add("Font4");
                arrayAdapter.add("Font5");
                arrayAdapter.add("Font6");
                arrayAdapter.add("Font7");
                arrayAdapter.add("Font8");
                arrayAdapter.add("Font9");
                arrayAdapter.add("Font10");
                arrayAdapter.add("Font11");
                arrayAdapter.add("Font12");
                arrayAdapter.add("Font13");
                arrayAdapter.add("Font14");
                arrayAdapter.add("Font15");
                arrayAdapter.add("Font16");
                arrayAdapter.add("Font17");
                arrayAdapter.add("Font18");
                arrayAdapter.add("Font19");
                arrayAdapter.add("Font20");
                arrayAdapter.add("Font21");
                arrayAdapter.add("Font22");
                arrayAdapter.add("Font23");
                arrayAdapter.add("Font24");

                arrayAdapter.add("Default");


                builderSingle.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                builderSingle.setAdapter(arrayAdapter, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String strName = arrayAdapter.getItem(which);
                        AlertDialog.Builder builderInner = new AlertDialog.Builder(MainActivity.this);
                        if (strName.equals("Font1")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/script.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/script.ttf");
                            Hello.setTypeface(custom_font2);
                        }

                        if (strName.equals("Font2")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/brush.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/brush.ttf");
                            Hello.setTypeface(custom_font2);
                        }

                        if (strName.equals("Font3")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/cast.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/cast.ttf");
                            Hello.setTypeface(custom_font2);
                        }


                        if (strName.equals("Font4")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/coop.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/coop.ttf");
                            Hello.setTypeface(custom_font2);
                        }

                        if (strName.equals("Font5")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/alex.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/alex.ttf");
                            Hello.setTypeface(custom_font2);
                        }

                        if (strName.equals("Font6")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/bri.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/bri.ttf");
                            Hello.setTypeface(custom_font2);
                        }

                        if (strName.equals("Font7")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/eng.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/eng.ttf");
                            Hello.setTypeface(custom_font2);
                        }

                        if (strName.equals("Font8")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/lcall.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/lcall.ttf");
                            Hello.setTypeface(custom_font2);
                        }


                        if (strName.equals("Font9")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/walt.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/walt.ttf");
                            Hello.setTypeface(custom_font2);
                        }


                        if (strName.equals("Font10")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/new1.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/new1.ttf");
                            Hello.setTypeface(custom_font2);
                        }


                        if (strName.equals("Font11")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/new2.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/new2.ttf");
                            Hello.setTypeface(custom_font2);
                        }


                        if (strName.equals("Font12")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/new3.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/new3.ttf");
                            Hello.setTypeface(custom_font2);
                        }

                        if (strName.equals("Font13")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/new4.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/new4.ttf");
                            Hello.setTypeface(custom_font2);
                        }


                        if (strName.equals("Font14")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/new5.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/new5.ttf");
                            Hello.setTypeface(custom_font2);
                        }

                        if (strName.equals("Font15")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/new6.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/new6.ttf");
                            Hello.setTypeface(custom_font2);
                        }


                        if (strName.equals("Font16")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/new7.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/new7.ttf");
                            Hello.setTypeface(custom_font2);
                        }


                        if (strName.equals("Font17")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/new8.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/new8.ttf");
                            Hello.setTypeface(custom_font2);
                        }

                        if (strName.equals("Font18")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/new9.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/new9.ttf");
                            Hello.setTypeface(custom_font2);
                        }

                        if (strName.equals("Font19")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/new10.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/new10.ttf");
                            Hello.setTypeface(custom_font2);
                        }


                        if (strName.equals("Font20")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/new11.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/new11.ttf");
                            Hello.setTypeface(custom_font2);
                        }


                        if (strName.equals("Font21")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/new12.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/new12.ttf");
                            Hello.setTypeface(custom_font2);
                        }


                        if (strName.equals("Font22")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/new13.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/new13.ttf");
                            Hello.setTypeface(custom_font2);
                        }


                        if (strName.equals("Font23")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/new14.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/new14.ttf");
                            Hello.setTypeface(custom_font2);
                        }


                        if (strName.equals("Font24")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/new15.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/new15.ttf");
                            Hello.setTypeface(custom_font2);
                        }
                        if (strName.equals("Default")) {
                            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/abc.ttf");
                            Hi.setTypeface(custom_font);

                            Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/abc.ttf");
                            Hello.setTypeface(custom_font2);
                        }

                    }
                });
                builderSingle.show();


            }

        });


            }

    
}
