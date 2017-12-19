package com.example.ashi.bookshow;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
public class seatbook extends AppCompatActivity {
    Spinner s;
    ArrayList<String>  id= new ArrayList();
   // String id[]=new String[10];
    //String[] c ={"0","1","2","3","4","5","6","7","8","9","10"};
    String[] num={"0","1","2","3","4","5","6","7","8","9","10"};
    int count[]=new int[17];
    int var;
    String str;
    ToggleButton a1, a2, a3, a4, a5,a6, b1, b2, b3, b4, b5,b6, c1, c2, c3, c4, c5,c6;
    Button pro2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seatbook);
        Intent i = getIntent();
        final Bundle b=i.getExtras();
        final Dialog d = new Dialog(seatbook.this);
        d.setTitle("choose number of seats");
        d.setContentView(R.layout.custom);
        s = (Spinner) d.findViewById(R.id.spinner);
        ArrayAdapter<String> aA = new ArrayAdapter<String>(seatbook.this, android.R.layout.simple_spinner_dropdown_item, num);
        s.setAdapter(aA);
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, final int i, long l) {
                Button btn = (Button) d.findViewById(R.id.button);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(s.getSelectedItem().toString()=="0")
                            Toast.makeText(seatbook.this, "book atleast 1 seat", Toast.LENGTH_SHORT).show();
                        else
                        {
                            str=s.getSelectedItem().toString();
                            var=Integer.valueOf(str);
                            d.dismiss();
                        }
                    }
                });
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        d.show();
        a1 = (ToggleButton) findViewById(R.id.a1);
        a1.setBackgroundColor(Color.TRANSPARENT);
        a1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(a1.isChecked()&&var!=0)
                {
                    var--;
                    id.add("a1");
                    a1.setBackgroundColor(Color.BLUE);
                }else if(!a1.isChecked()&&var==0&&count[0]==0)
                {
                    var++;
                    id.remove("a1");
                    a1.setBackgroundColor(Color.TRANSPARENT);
                }else if(a1.isChecked()&&var==0)
                {
                 count[0]++;
                    Toast.makeText(seatbook.this, "no more seats to select please proceed", Toast.LENGTH_SHORT).show();
                }else
                    a1.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        a2 = (ToggleButton) findViewById(R.id.a2);
        a2.setBackgroundColor(Color.TRANSPARENT);
        a2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(a2.isChecked()&&var!=0)
                {
                    var--;
                    id.add("a2");

                    a2.setBackgroundColor(Color.BLUE);
                }else if(!a2.isChecked()&&var==0&&count[1]==0)
                {
                    var++;
                    id.remove("a2");
                    a2.setBackgroundColor(Color.TRANSPARENT);
                }else if(a2.isChecked()&&var==0)
                {
                    count[1]++;Toast.makeText(seatbook.this, "no more seats to select please proceed", Toast.LENGTH_SHORT).show();
                }
                else
                    a2.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        a3 = (ToggleButton) findViewById(R.id.a3);
        a3.setBackgroundColor(Color.TRANSPARENT);
        a3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(a3.isChecked()&&var!=0)
                {
                    var--;
                    id.add("a3");
                    //count++;
                    a3.setBackgroundColor(Color.BLUE);
                }else if(!a3.isChecked()&&var==0&&count[2]==0)
                {
                    var++;
                    id.remove("a3");
                    a3.setBackgroundColor(Color.TRANSPARENT);
                }
                else if(a3.isChecked()&&var==0)
                {
                    count[2]++;Toast.makeText(seatbook.this, "no more seats to select please proceed", Toast.LENGTH_SHORT).show();
                }
                else a3.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        a4 = (ToggleButton) findViewById(R.id.a4);
        a4.setBackgroundColor(Color.TRANSPARENT);
        a4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(a4.isChecked()&&var!=0)
                {
                    var--;
                    id.add("a4");
                    a4.setBackgroundColor(Color.BLUE);
                }else if(!a4.isChecked()&&var==0&&count[3]==0)
                {
                    var++;
                    id.remove("a4");
                    a4.setBackgroundColor(Color.TRANSPARENT);
                }else if(a4.isChecked()&&var==0)
                {
                    count[3]++;Toast.makeText(seatbook.this, "no more seats to select please proceed", Toast.LENGTH_SHORT).show();
                }else a4.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        a5 = (ToggleButton) findViewById(R.id.a5);
        a5.setBackgroundColor(Color.TRANSPARENT);
        a5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(a5.isChecked()&&var!=0)
                {
                    var--;
                    id.add("a5");
                    a5.setBackgroundColor(Color.BLUE);
                }else if(!a5.isChecked()&&var==0&&count[4]==0)
                {
                    var++;
                    id.remove("a5");
                    a5.setBackgroundColor(Color.TRANSPARENT);
                }else if(a5.isChecked()&&var==0)
                {
                    count[4]++;Toast.makeText(seatbook.this, "no more seats to select please proceed", Toast.LENGTH_SHORT).show();
                }else a5.setBackgroundColor(Color.TRANSPARENT);

            }
        });
        a6= (ToggleButton) findViewById(R.id.a6);
        a6.setBackgroundColor(Color.TRANSPARENT);
        a6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(a6.isChecked()&&var!=0)
                {
                    var--;
                    id.add("a6");
                    a6.setBackgroundColor(Color.BLUE);
                }else if(!a6.isChecked()&&var==0&&count[5]==0)
                {
                    var++;
                    id.remove("a6");
                    a6.setBackgroundColor(Color.TRANSPARENT);
                }else if(a6.isChecked()&&var==0)
                {
                    count[5]++;
                    Toast.makeText(seatbook.this, "no more seats to select please proceed", Toast.LENGTH_SHORT).show();
                }else a6.setBackgroundColor(Color.TRANSPARENT);

            }
        });
        b1 = (ToggleButton) findViewById(R.id.b1);
        b1.setBackgroundColor(Color.TRANSPARENT);
        b1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b1.isChecked()&&var!=0)
                {
                    var--;
                    id.add("b1");
                    b1.setBackgroundColor(Color.BLUE);
                }else if(!b1.isChecked()&&var==0&&count[6]==0)
                {
                    var++;
                    id.remove("b1");
                    b1.setBackgroundColor(Color.TRANSPARENT);
                }else b1.setBackgroundColor(Color.TRANSPARENT);

            }
        });
        b2 = (ToggleButton) findViewById(R.id.b2);
        b2.setBackgroundColor(Color.TRANSPARENT);
        b2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b2.isChecked()&&var!=0)
                {
                    var--;
                    id.add("b2");

                    b2.setBackgroundColor(Color.BLUE);
                }else if(!b2.isChecked()&&var==0&&count[7]==0)
                {
                    var++;
                    id.remove("b2");
                    b2.setBackgroundColor(Color.TRANSPARENT);

                }else b2.setBackgroundColor(Color.TRANSPARENT);

            }
        });
        b3 = (ToggleButton) findViewById(R.id.b3);
        b3.setBackgroundColor(Color.TRANSPARENT);
        b3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b3.isChecked()&&var!=0)
                {
                    var--;
                    id.add("b3");
                    b3.setBackgroundColor(Color.BLUE);
                }else if(!b3.isChecked()&&var==0)
                {
                    var++;
                    id.remove("b3");
                    b3.setBackgroundColor(Color.TRANSPARENT);
                }else b3.setBackgroundColor(Color.TRANSPARENT);

            }
        });
        b4 = (ToggleButton) findViewById(R.id.b4);
        b4.setBackgroundColor(Color.TRANSPARENT);
        b4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b4.isChecked()&&var!=0)
                {
                    var--;
                    id.add("b4");
                    b4.setBackgroundColor(Color.BLUE);
                }else if(!b4.isChecked()&&var==0)
                {
                    var++;
                    id.remove("b4");
                    b4.setBackgroundColor(Color.TRANSPARENT);
                }else b4.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        b5 = (ToggleButton) findViewById(R.id.b5);
        b5.setBackgroundColor(Color.TRANSPARENT);
        b5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b5.isChecked()&&var!=0)
                {
                    var--;
                    id.add("b5");
                    b5.setBackgroundColor(Color.BLUE);
                }else if(!b5.isChecked()&&var==0)
                {
                    var++;
                    id.remove("b5");
                    b5.setBackgroundColor(Color.TRANSPARENT);
                }
                else b5.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        b6= (ToggleButton) findViewById(R.id.b6);
        b6.setBackgroundColor(Color.TRANSPARENT);
        b6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b6.isChecked()&&var!=0)
                {
                    var--;
                    id.add("b6");
                    b6.setBackgroundColor(Color.BLUE);
                }else if(!b6.isChecked()&&var==0)
                {
                    var++;
                    id.remove("b6");
                    b6.setBackgroundColor(Color.TRANSPARENT);
                }else b6.setBackgroundColor(Color.TRANSPARENT);

            }
        });
        c1 = (ToggleButton) findViewById(R.id.c1);
        c1.setBackgroundColor(Color.TRANSPARENT);
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(c1.isChecked()&&var!=0)
                {
                    var--;
                    id.add("c1");
                    c1.setBackgroundColor(Color.BLUE);
                }else if(!c1.isChecked()&&var==0)
                {
                    var++;
                    id.remove("c1");
                    c1.setBackgroundColor(Color.TRANSPARENT);
                }else c1.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        c2 = (ToggleButton) findViewById(R.id.c2);
        c2.setBackgroundColor(Color.TRANSPARENT);
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(c2.isChecked()&&var!=0)
                {
                    var--;
                    id.add("c2");
                    c2.setBackgroundColor(Color.BLUE);
                }else if(!c2.isChecked()&&var==0)
                {
                    var++;
                    id.remove("c2");
                    c2.setBackgroundColor(Color.TRANSPARENT);
                }
                else c2.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        c3 = (ToggleButton) findViewById(R.id.c3);
        c3.setBackgroundColor(Color.TRANSPARENT);
        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(c3.isChecked()&&var!=0)
                {
                    var--;
                    id.add("c3");
                    c3.setBackgroundColor(Color.BLUE);
                }else if(!c3.isChecked()&&var==0)
                {
                    var++;
                    id.remove("c3");
                    c3.setBackgroundColor(Color.TRANSPARENT);
                }else c3.setBackgroundColor(Color.TRANSPARENT);

            }
        });
        c4 = (ToggleButton) findViewById(R.id.c4);
        c4.setBackgroundColor(Color.TRANSPARENT);
        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(c4.isChecked()&&var!=0)
                {
                    var--;
                    id.add("c4");
                    c4.setBackgroundColor(Color.BLUE);
                }else if(!c4.isChecked()&&var==0)
                {
                    var++;
                    id.remove("c4");
                    c4.setBackgroundColor(Color.TRANSPARENT);

                }else c4.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        c5 = (ToggleButton) findViewById(R.id.c5);
        c5.setBackgroundColor(Color.TRANSPARENT);
        c5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(c5.isChecked()&&var!=0)
                {
                    var--;
                    id.add("c5");
                    c5.setBackgroundColor(Color.BLUE);
                }else if(!c5.isChecked()&&var==0)
                {
                    var++;
                    id.remove("c5");
                    c5.setBackgroundColor(Color.TRANSPARENT);
                }else c5.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        c6= (ToggleButton) findViewById(R.id.c6);
        c6.setBackgroundColor(Color.TRANSPARENT);
        c6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(c6.isChecked()&&var!=0)
                {
                    var--;
                    id.add("c6");
                    c6.setBackgroundColor(Color.BLUE);
                }else if(!c6.isChecked()&&var==0)
                {
                    var++;
                    id.remove("c6");
                    c6.setBackgroundColor(Color.TRANSPARENT);
                }
                else c6.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        pro2= (Button) findViewById(R.id.pro2);
        pro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(seatbook.this,detail.class);
                b.putStringArrayList("ids",id);
                i2.putExtras(b);
                startActivity(i2);
            }
        });
    }
}
