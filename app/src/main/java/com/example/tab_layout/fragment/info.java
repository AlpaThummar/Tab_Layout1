package com.example.tab_layout.fragment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tab_layout.R;

import java.io.IOException;
import java.io.InputStream;


public class info extends Fragment {

    int pos;
    String image;
    ImageView imageView;
    TextView textView1,textView2;
    String Hotel_name[]={"Amiras","Annapurna","K's Charcoal","Gulmahor","Maha Laxmi","Levl 5","Royal","3 Story","Sukhdev","Table 101"};
    String Owner_name[]={"Shailesh Makwana","Ustav Raiyani","Vrajesh Dobariya","Yagnesh Gundaliya","Hardik Malani","Pradip Virani","Sagar Makwana","Bhavadip Khunt","K.K Gohil","Chintan Vasoya"};
    String Mobile_no[]={"9978855625","7874589615","8866251436","8596741525","8000969609","9000040000","7474741414","8511178458","9658547859","7875474845"};
    String Email[]={"hotelamiras12@gmail.com","hotelannapurna99@gmail.com","hotelkscharcol191@gmail.com","hotelgulmahor123@gmail.com","hotelmahalaxmi121@gmail.com","hotellevel5@gmail.com","hotelroyal12@gmail.com","hotel3story@gmail.com","hotelsukhdev89@gmail.com","hoteltable123@gmail.com"};
    String Address[]={"Galaxy Point, Surat - Kamrej Hwy," +"/n"+
            " Bhagavan Nagar, Sarthana Jakat Naka," +"/n"+
            " Sarthi Society, Nana Varachha," +"/n"+
            " Surat, Gujarat 395006",
            "Valthan-Punagam Rd," + "/n"+
                    " Surat, Gujarat 395006",
            "Ganga House, Upper Ground Floor," +"/n"+
                    "   Nexa Showroom, near Iscon Mall," +"/n"+
                    " Piplod, Surat, Gujarat 395007",
            " Ground floor , Palm jhumeria," +"/n"+
                    " Surat - Navsari Rd, near petrol pump," +"/n"+
                    " lajpor, Surat, Gujarat 394235",
            "87 Krishna Ind, near Kapodra Char Rasta," +"/n"+
                    " Kapodra, Surat, Gujarat 395006",
            " Royal Trade Centre,515, Hazira-Adajan Rd," +"/n"+
                    " Jalaram Society, Adajan Gam, Adajan," +"/n"+
                    " Surat, Gujarat 395009",
            "Opp Dhiraj Sons, Next To Pawan Hospital," +"/n"+
                    " Near Someshwara Square, Vesu," +"/n"+
                    " Surat Gujrat 395007 ",
            "Titaanium The Business Hub," +"/n"+
                    " G-17, Bhimrad Rd, opp. Aakash Empire," +"/n"+
                    " Surat, Gujarat 395017",
            "6, Shak Market, Sarthana Jakat Naka," +"/n"+
                    " Swaminarayan Nagar-1, Nana Varachha," +"/n"+
                    " Surat, Gujarat 395006",
            "Ambika Niketan Road, Umra Gam," +"/n"+
                    " Athwa, Surat, Gujarat 395007"};
    public info(int position, String image) {
        this.pos=position;
        this.image=image;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_info, container, false);
        imageView=view.findViewById(R.id.info_image);
        InputStream stream = null;
        try {
            stream=getContext().getAssets().open("image/"+image);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Drawable drawable = Drawable.createFromStream(stream,null);
        imageView.setImageDrawable(drawable);
        textView1=view.findViewById(R.id.Info_text);
        textView2=view.findViewById(R.id.Addres_text);
        textView1.setText("Hotal Name :- "+Hotel_name[pos]+"\n\n"
        +"Ownar Name :- "+Owner_name[pos]+"\n\n"
        +"Contect :- "+Mobile_no[pos]+"\n\n"
        +"Email :- "+Email[pos]);
        textView2.setText("Address :- "+Address[pos]);
        return view;
    }
}