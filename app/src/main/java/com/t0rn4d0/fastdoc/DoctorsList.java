package com.t0rn4d0.fastdoc;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class DoctorsList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private DoctorsAdapter adapter;
    private DBHandler dbHandler;
    String selectedCity,selectedSpeciality;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        selectedCity=getIntent().getStringExtra("Location");
        selectedSpeciality=getIntent().getStringExtra("Speciality");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_list);
        recyclerView = (RecyclerView) findViewById(R.id.doctorsList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        dbHandler = new DBHandler(DoctorsList.this);

       // dbHandler.addDoctor(new Doctor("Bangalore","General physician","Dr. Shankar Kumar","MD , MBBS , dip MSc (Endocrinology) Diabetologist , General Physician , Endocrinologist","MS Diabetes and Skin Care Centre 6/1, 80 feet Road, Landmark: Near To CMH Hospital(Chinmaya Hospital) & Swapna Book Stores & Opp. Hotel Krishnasagar, Bangalore","29 yrs experience","+918055701267"));
       // dbHandler.addDoctor(new Doctor("Bangalore","General physician","Dr. Taher Hussain Assadi","MBBS , MD - Internal Medicine Internal Medicine , General Physician ","Nisa Multispeciality Clinics 386, 7th Cross, 8th Main, MICO Layout, Landmark: Near Union Bank & Above Baskin Robbins, Bangalore","28 yrs experience","+918055701268"));
       // dbHandler.addDoctor(new Doctor("Kolkata","Dentist","Dr. Shankar Kumar","MD , MBBS , dip MSc (Endocrinology) Diabetologist , General Physician , Endocrinologist","MS Diabetes and Skin Care Centre 6/1, 80 feet Road, Landmark: Near To CMH Hospital(Chinmaya Hospital) & Swapna Book Stores & Opp. Hotel Krishnasagar, Bangalore","29 yrs experience","+918055701207"));
        bangaloreCardiologist();
        bangaloreDentist();
        bangaloreENT();
        bangaloreGP();
        chennaiCardio();
        chennaiENT();
        chennaiGP();
        bangalore();
        Chennai();
        delhi();
        hyd();
        jaipur();
        kolkata();
        mumbai();
        pune();

        ArrayList<Doctor> doctors = dbHandler.getDoctors(selectedCity,selectedSpeciality);
        adapter = new DoctorsAdapter(doctors);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }

    void bangaloreCardiologist(){
        dbHandler.addDoctor(new Doctor("Bangalore","Cardiologist","Dr. B.Ramesh","MD,MBBS","2231, 23rd Cross,Landmark;Opposite to National Co-operative Bank","30 yrs experience","+918055701267"));
        dbHandler.addDoctor(new Doctor("Bangalore","Cardiologist","Dr. Ramamurthy Bingi","MBBS,MD-Medicine,DM-Cardiology","405/A,7th Main, Jayanagar 2 Block,Landmark:Behind Bangalore Hospital & Near-Vardhaman Health Specialities","33 yrs experience","+91805567120"));
        dbHandler.addDoctor(new Doctor("Bangalore","Cardiologist","Dr. Kiran Varghese","MBBS,MD-General Medicine,DM-Cardiology,Fellowship in Interventional Cardiology","53,,36th Main,3rd Cross,Dollar Scheme Layout,B.T.M 1st Stage.Landmark:Near to Palms Apartment","31 yrs experience","+918066084264"));
        dbHandler.addDoctor(new Doctor("Bangalore","Cardiologist","Dr. Keshav R","MD-Medicine,DNB(Cardiology),MBBS,DNB(General Medicine)","53,,36th Main,Cunningham Road,Bangalore","21 yrs experience","+918076123340"));
        dbHandler.addDoctor(new Doctor("Bangalore","Cardiologist","Dr. Dinesh V Kamath","MBBS,MD-General Medicine","84,Soudarya Paramount,Sampige Road,Palace Guttahalli,Malleswaram,Landmark:Near Kanti Sweets","16 yrs experience","+918066085120"));
        dbHandler.addDoctor(new Doctor("Bangalore","Cardiologist","Dr. Bimal Chhajer","MBBS,MD - CardiologyCardiologist","16, 17th A Cross,Hebbal Kempapura,Landmark: Opp. to Coffee Board Layout Park & Bhuvaneshwari Nagar, Bangalore","28 yrs experience","+918033512222"));
        dbHandler.addDoctor(new Doctor("Bangalore","Cardiologist","Dr. Prabhakar C Koregol","DM-Cardiology,MD-General Medicine,MBBS Cardiologist","Kanva Diagnostics No.2/10,4th N Block,Dr Rajkumar Road, Rajaji Nagar,Bangalore","11 yrs experience","+918056017783"));
        dbHandler.addDoctor(new Doctor("Bangalore","Cardiologist","Dr. Nagaraj Desai","MBBS,MD-General Medicine ,DM-Cardiology,Cardiologist","Namana Medical Centre No.4/A, Off New BEL Road, Sennappa Layout, Raj Mahal Vilas 2nd Stage, Bangalore","30 yrs experience","+918066084806"));
        dbHandler.addDoctor(new Doctor("Bangalore","Cardiologist","Dr. M Jayaram Rai","MBBS,MRCP,FRCP(LOND)Cardiologist","Mayo Heart Clinic & Diagnostics26,Bank of India Building, 12th Main, 1st Block, Rajajinagar, Landmark: Near Navarang Theatre & Near Nala Paka Restaurant, Bangalore","46 yrs experience","+91806741778"));
        dbHandler.addDoctor(new Doctor("Bangalore","Cardiologist","Dr. Roopa.R","MBBS,MD-General Medicine,DNB(Cardiology)Cardiologist","Manipal Hospital - Old Airport Road 98,HAL Old Airport Road,Bengaluru,Karnataka 560017.Landmark: Opposite Leela Palace, Bangalore","17 yrs experience","+918030276340"));
        dbHandler.addDoctor(new Doctor("Bangalore","Cardiologist","Dr. Venkatesh S","MBBS,MD-Medicine,DM-Cardiology Cardiologist","Fortis Hospital - Bannerghatta Road 154/9, Sahyadri Layout, Bilekahalli, Bannerghatta Road. Landmark: Opp. IIMB, Bangalore","22 yrs experience","+918033512983"));
        dbHandler.addDoctor(new Doctor("Bangalore","Cardiologist","Dr. Zakira Jahan","MBBS,Diploma in Cardiology, MASTERS IN DIABETOLOGY","Gms Healthcare & Diagnostics No. 18,1st Floor,20 th Main Road, Maruthinagar,BTM Layout 1st Stage,Landmark:Opp. BESCOM","11 yrs experience","+918066084389"));
    }

    void bangaloreDentist(){
        dbHandler.addDoctor(new Doctor("Bangalore","Dentist","Dr. Ramya","BDS,MDS-Prosthodontics Prosthodontist,Dentist,Dental Surgeon","498, 15Th Cross,II Stage,Landmark:Opp.BDA Park,Bangalore","18 yrs experience","+918098332871"));
        dbHandler.addDoctor(new Doctor("Bangalore","Dentist","Dr. Veerendra Kumar B","BDS,MDS Dentist,Dental Surgeon","5,Shabari Complex, Main Road, MICO Layout, Bannerghatta road, Landmark:Opp. Medplus Medicals, Bangalore","24 yrs experience","+918011228745"));
        dbHandler.addDoctor(new Doctor("Bangalore","Dentist","Dr. Shaila Kumar","BDS,A.E.G.D Dental Surgeon","611, 1st Floor, C Block, AECS Layout,Kundalahalli,Whitefield. Landmark:Near to Vital Life Hospital,Bangalore","21 yrs experience","+918066721234"));
        dbHandler.addDoctor(new Doctor("Bangalore","Dentist","Dr. Anjali Shetty","BDS,MDS-Orthodontics & Dentofacial Orthopaedics Orthodontist,Dentofacial Orthopedist","Dental and Orthodontic Clinic 410, CMR Road, HRBR Layout, 2nd Block, Off Kammanahalli Main Road. Landmark: Opp. BSNL Office, Bangalore","14 yrs experience","+918077612230"));
        dbHandler.addDoctor(new Doctor("Bangalore","Dentist","Dr. Balasubramanya K V","BDS,MDS Dentist,Dental Surgeon ","Dental and Orthodontic Clinic 498, 15Th Cross, II Stage, Landmark: Opp. BDA Park, Bangalore","18 yrs experience","+918066533409"));
        dbHandler.addDoctor(new Doctor("Bangalore","Dentist","Dr. Ganesh Shetty","BDS,FICOI Dentist","410, CMR Road, HRBR Layout, 2nd Block, Off Kammanahalli Main Road. Landmark: Opp. BSNL Office, Bangalore","19 yrs experience","+918033512290"));
        dbHandler.addDoctor(new Doctor("Bangalore","Dentist","Dr. Sangeeta Honnur","BDS,Doctor of Dental Surgery(DDS)Dentist,Dental Surgeon","Smile Elements Dental No 13, Bellandur Above Amba Bajaj Show Room, Landmark: Opp to Central Mall, Bangalore","16 yrs experience","+918066510098"));
        dbHandler.addDoctor(new Doctor("Bangalore","Dentist","Dr. Sunitha V Kumar","BDS Dentist","5, Shabari Complex, Main Road, MICO Layout, Bannerghatta road, Landmark: Opp. Medplus Medicals, Bangalore","22 yrs experience","+918009112098"));
        dbHandler.addDoctor(new Doctor("Bangalore","Dentist","Dr. Karthik Venkataraghavan","BDS,MDS-PedodonticsDentist,Pediatric Dentist","166, 2nd Cross,Domlur II Stage, Domlur. Landmark:Near Kalki Temple, Bangalore","18 yrs experience","+918077009213"));
        dbHandler.addDoctor(new Doctor("Bangalore","Dentist","Dr. Satheesh Kumar","BDS,MDS-Prosthodontics,Fellowship and Diplomate in Implantology from ICOI (USA)Prosthodontist,Dentist,Implantologist","132,3rd cross,2nd stage,Arekere,Mico Layout 2nd stage. Landmark : Near L & T south city, Bangalore","15 yrs experience","+918071284772"));
        dbHandler.addDoctor(new Doctor("Bangalore","Dentist","Dr. Ranjani Rao","BDSDentist","V2 E-City Dental CenterP 7 ELCIA Building, Electronic City Phase 1. Landmark: Opposite to Infosys Bus bay, Bangalore","16 yrs experience","+918000873001"));
        dbHandler.addDoctor(new Doctor("Bangalore","Dentist","Dr. Aditya Murthy","BDS Dentist","999, Vijaya Bank Layout, Bannerghatta Road, Landmark: Below Religare Wellness, Bangalore","17 yrs experience","+918022001020"));
    }
    
    void bangaloreENT(){
        dbHandler.addDoctor(new Doctor("Bangalore","ENT","Dr. Anita Krishnan","MBBS , Diploma in Otorhinolaryngology (DLO), DNB(ENT),Diploma in Medical Law and Ethics (PGDMLE)ENT/ Otolaryngologist","766, 8th Main, 3rd Block, Koramangala, Landmark: Near Thoughtworks, Bangalore","24 yrs experience","+918055166050"));
        dbHandler.addDoctor(new Doctor("Bangalore","ENT","Dr. Emmanuel James","MBBS,MS-ENT,ENT/Otolaryngologist","J.T. ENT Clinic,1st Floor, Garudadari Nilaya,5, Bhoopasandra Main Road, RMV Stage 2, Bhoopasandra, Landmark: Opposite Vidyasagar School, Bangalore","36 yrs experience","+918044769827"));
        dbHandler.addDoctor(new Doctor("Bangalore","ENT","Dr. Ravi Sachidananda","MS - ENT , DNB (ENT) , Membership of the Royal College of Surgeons (MRCS),Diploma in Otorhinolaryngology (DLO) , Masters in Speech Language Pathology ,FRCS,ENT/ Otolaryngologist , Rhinologist , Head and Neck Surgeon","2, Tumkur Service Road, Goraguntepalya, Landmark: Near BMTC Bus Stop & Opposite Taj Vivanta, Bangalore","19 yrs experience","+918087611230"));
        dbHandler.addDoctor(new Doctor("Bangalore","ENT","Dr. Meera Ranjini","MBBS , Diploma in Otorhinolaryngology (DLO),M.Phil in Hospital & Health Systems ManagementENT/ Otolaryngologist ","32/292/4, Muniramaiah Building, Kaggadasapura Main Rd, C V Raman Nagar, Landmark: Near Venu Medicals, Bangalore, Bangalore","22 yrs experience","+918076991120"));
        dbHandler.addDoctor(new Doctor("Bangalore","ENT","Dr. Lakshmi P Satish","MBBS , MS - ENT , Diploma in Otorhinolaryngology (DLO)ENT/ Otolaryngologist","Skin, Cosmetic & ENT Care Center 742, Bhagyashree, 18th Main, 37th F Cross, Jayanagar 4th T Block. Landmark: Next to Cafe Coffee Day, Bangalore","26 yrs experience","+91808865532"));
        dbHandler.addDoctor(new Doctor("Bangalore","ENT","Dr. Gayatri S Pandit","MBBS , Diploma in Otorhinolaryngology (DLO) , DAA ENT/ Otolaryngologist","Samarth ENT and Allergy centre 12, Shree Complex, Kothnur Dinnur Main Road, Landmark: Opp to Indian Bank, Bangalore","11 yrs experience","+918022136670"));
        dbHandler.addDoctor(new Doctor("Bangalore","ENT","Dr. Mahadeviah"," MBBS , D.A.B.O Ear-Nose-Throat (ENT) Specialist","44/1, H B Somaja Road, Basavanagudi. Landmark: Basvangudi Main Post Office, Bangalore","48 yrs experience","+918070906654"));
        dbHandler.addDoctor(new Doctor("Bangalore","ENT","Dr. S.R.Hari Ram","MBBS , MS - ENTENT/ Otolaryngologist","32, 5th Cross, 5th Block, Koramangala Landmark: Near Nandana Grand hotel, Bangalore","31 yrs experience","+918099855440"));
        dbHandler.addDoctor(new Doctor("Bangalore","ENT","Dr. Chandrashekhar Adiga","MBBS , Diploma in Oto-Rhino-Laryngology (D.O.R.L)ENT/ Otolaryngologist","123, MS Complex, Ideal Homes Town Circle, Rajarajeshwari Nagar. Landmark: Near Nimishamba Temple, Bangalore","29 yrs experience","+918079866140"));
        dbHandler.addDoctor(new Doctor("Bangalore","ENT","Dr. N Prasanth Kumar","MBBS , Diploma in Otorhinolaryngology (DLO)ENT/ Otolaryngologist","4, Sri Rama Complex, Imamnahalli Main Road, Whitefield. Landmark: Near Sri Rama Temple, Bangalore","14 yrs experience","+918066543870"));
        dbHandler.addDoctor(new Doctor("Bangalore","ENT","Dr. Sheelu Srinivas","MBBS,MS-ENT","146,KEB Layout,5th Main,BTM 1st Stage,Landmark:opp. Jayadeva Hospital","18 yrs experience","+918066084146"));
        dbHandler.addDoctor(new Doctor("Bangalore","ENT","Dr. Vijay Kumar","MBBS,MS-ENT","924,80 Feet Road,7 th Main,HRBR Layout, Kalayan Nagar.Landmar:Opp. To Patel Public School","16 hrs experience","+918066085262"));
    }

    void bangaloreGP(){
        dbHandler.addDoctor(new Doctor("Bangalore","General physician","Dr. Shankar Kumar","MD , MBBS ,MSc (Endocrinology)Diabetologist , General Physician , Endocrinologist","MS Diabetes and Skin Care Centre 6/1, 80 feet Road, Landmark: Near To CMH Hospital(Chinmaya Hospital) & Swapna Book Stores & Opp. Hotel Krishnasagar, Bangalore","29 yrs experience","+918055701267"));
        dbHandler.addDoctor(new Doctor("Bangalore","General physician","Dr. Loknath Kumar","MBBS , F.A.I.M.S , CLMS , CRMS , CSRTGeneral Physician","RespiCare Salt Room Therapy Centre - Jayanagar16/2, 9th Main, Jayanagar 3 Block, Landmark: Between Jain College and Cloud Nine Paediatric Hospital, Opp. Yes Bank, Bangalore","38 yrs experience","+918066110097"));
        dbHandler.addDoctor(new Doctor("Bangalore","General physician","Dr. Taher Hussain Assadi","MBBS , MD - Internal MedicineInternal Medicine , General Physician ","Nisa Multispeciality Clinics386, 7th Cross, 8th Main, MICO Layout, Landmark: Near Union Bank & Above Baskin Robbins, Bangalore","28 yrs experience","+918066129870"));
        dbHandler.addDoctor(new Doctor("Bangalore","General physician","Dr. Prameela Madamala","MBBS , MD - Family MedicineGeneral Physician","Excela Medicare1320, 1st Floor, Sai Krishna Arcade, 24th Main, HSR Layout 2nd Sector, Landmark: Next to Paringapalya Bus Stop, Bangalore","14 yrs experience","+918003349812"));
        dbHandler.addDoctor(new Doctor("Bangalore","General physician","Dr. Vishnu Murthy G. S.","MBBS , MD - Paediatrics , Fellowship in GastroenterologistPediatrician , General Physician","Little Blossom Woman & Child Clinic 25, Ground Floor Marappa Compound Adjacent To Poonam Motors. Landmark: Near Belthur Bus Stop, Bangalor","11 yrs experience","+918043766267"));
        dbHandler.addDoctor(new Doctor("Bangalore","General physician","Dr. SS Kumar","MBBS , MD - General MedicineInternal Medicine , General Physician","Dr. S S Kumar Clinic312, AC Pet, Sampige Road, Malleswaram. Landmark: Opp.Karur Vysya Bank, Bangalore","33 yrs experience","+918099121267"));
        dbHandler.addDoctor(new Doctor("Bangalore","General physician","Dr. Ravishankar Reddy C. R.","MBBS , MD - General Medicine , DNB (Neurology)General Physician , Neurologist ","Marvel Fertility Hospital And Neuro Centre 8, 1st Main Road, Koramangala 1 Block. Landmark: Next to Nouse Info System, Bangalore","23 yrs experience","+918066510009"));
        dbHandler.addDoctor(new Doctor("Bangalore","General physician","Dr. Anantharaman.R","MD - Medicine , DM - Endocrinology , MBBSGeneral Physician , General Endocrinologist","Magna Clinic for Obesity Diabetes and Endocrinology289, 7th main, BTM layout 2nd Stage, Landmark: Near Ashirwad Super Market & Behind BTM Water Tank, Bangalore","8 yrs experience","+918099112240"));
        dbHandler.addDoctor(new Doctor("Bangalore","General physician","Dr. Jaya Bajaj","MBBS , ABFMGeneral Physician","Vera Health309, B Block, AECS Layout, Brookfield, Bangalore, Bangalore","11 yrs experience","+9180445112094"));
        dbHandler.addDoctor(new Doctor("Bangalore","General physician","Dr. Phanindra V V","MD-Ayurveda , BAMS , FCR (Fellowship in Cardiac Rehabilitation) , YIC (Yoga Instructors Certificate),General Physician , Dermatologist","Narayana Ayurveda Kuteeram 180, 9th Main Rd, Srinagar, Bangalore","9 yrs experience","+918076192239"));
        dbHandler.addDoctor(new Doctor("Bangalore","General physician","Dr. Aparna Verma","MBBS General Physician","Dr. Sunny Medical Multispecialty Center 203 - 205, 2nd Floor, Mint Plaza, Green Glen Layout, Sarjapur Outer Ring Road. Landmark: Above Pizza Hut Delivery, Bangalore","16 yrs experience","+918007706501"));
        dbHandler.addDoctor(new Doctor("Bangalore","General physician","Dr. Muralidhara S K","B.Sc , MBBS , MD - Alternate MedicineAlternative Medicine , General Physician","Holistic Healing Centre 149/150, 2nd Shop Lane, Basavanagudi, Landmark: Near Tata Silk Farm, Behind Sangeethav Mobile, Bangalore","29 yrs experience","+918056516650"));
    }

    void chennaiCardio(){
        dbHandler.addDoctor(new Doctor("Chennai","Cardiologist","Dr. Harikrishnan Parthasarathy","MBBS , PLAB , MD - Internal Medicine , Member of the Royal College of Physicians, UK (MRCP UK) , MD-Cardiovascular Medicine , KBA In Cardiology , CCST In Cardiology/Interventional , Certificate in Interventional CardiologyInternal Medicine","Apollo Specialty Hospitals Vanagaram No.64, Vanagaram, Ambattur Main Road, Chennai","22 yrs experience","+914433011395"));

        dbHandler.addDoctor(new Doctor("Chennai","Cardiologist","Dr. V K Swamy","MBBS ,Diploma in Child Health(DCH),MRCPCH(UK),FRCPCHCardiologist ","Chennai Children's Speciality Clinic30/5, Dev Apartments (Basement), First Main Road, Gandhi Nagar, Landmark: Opp. To Adyar Bakery & Near Adyar Bus Stand, Chennai","11 yrs experience","+914439942509"));

        dbHandler.addDoctor(new Doctor("Chennai","Cardiologist","Dr.Moorthy","MBBS,MD-General Medicine,DM-Cardiology","39,Gandhi Road,Tambaram West.Landmark:opp to  K K Eye Hospital & Kishkinda Road","27 yrs experience","+914466949442"));

        dbHandler.addDoctor(new Doctor("Chennai","Cardiologist","Dr.Latchumanadhas K","MBBS,Doctor of Medicine,DM-Cardiology","Madras Medical Mission Hospital,Collector Nagar","27 yrs experience","+914466949433"));

        dbHandler.addDoctor(new Doctor("Chennai","Cardiologist","Dr.Sivakadaksham","MBBS,MD-General Medicine,DM-Cardiology","19,Deivasigamani Road,Landmar:Near Royapettah music classes","31 yrs experience","+914439942514"));

        dbHandler.addDoctor(new Doctor("Chennai","Cardiologist","Dr.S Socrates","MBBS,MD-General Medicine,DM-Cardiology","New No 320/A Old No 47 A,Velacheri Main Road, Velachery,Landmar:Opp To Indian Bank & Near Velacheri Police Chauki",",16 yrs experience","+914433011385"));

        dbHandler.addDoctor(new Doctor("Chennai","Cardiologist","Dr.Murthy J S N","MBBS,MD-General Medicine,DNB(Cardiology),FRCP","22/12,G S T Road.Landmark:Near Balaji Hospital","33 yrs experience","+914466949422"));

        dbHandler.addDoctor(new Doctor("Chennai","Cardiologist","Dr.R.Prem Sekar","MBBS,MRCP,FRCP","81, Ttk Road,Landmark:Near Life Style Building","20 yrs experience","+914466205701"));

        dbHandler.addDoctor(new Doctor("Chennai","Cardiologist","Dr.Joy M.Thomas","MBBS,MD-Medicine,DM-Cardiology,EP fellowship,Cardiac Electrophysiologist","R 30 C,Ambattur Industrial Estate Road,Mogappair,Landmark:Opp to Bharath Petrol Pump & Next To Chennai Public School","37 yrs experience","+914466220012"));

        dbHandler.addDoctor(new Doctor("Chennai","Cardiologist","Dr.Refai Showkathali","MRCP,CCT,Fellowship in TAVI(Lon),MRCP(London)","No 2/1,2nd Cross Street,1st Main Road,Basement Floor,Prashanthi Apartments,CIT Colony","15 yrs experience","+914433011389"));

        dbHandler.addDoctor(new Doctor("Chennai","Cardiologist","Dr.V K Swamy","MBBS,Diploma in Child Health(DCH),MRCPCH(UK),FRCPCH","30/5,Dev Apartment(Basemen),First Main Road,Gandhi Nagar","17 yrs experience","+914439942509"));

        dbHandler.addDoctor(new Doctor("Chennai","Cardiologist","Dr.S.Arthanari","MBBS,MD-Cardiology,,DM-Cardiology","1/2,Ground Floor,Vasanth Apartments,Sri Krishnapuram","41 yrs experience","+914433011381"));


    }

    void chennaiENT(){
        dbHandler.addDoctor(new Doctor("Chennai","ENT","Dr.Ramu Harirajan","MBBS , Diploma in Otorhinolaryngology (DLO), DNB(ENT)","NO 344/11b,Cee Dee Yes Chara Complex,Tambaram Velachery Main Road","17 yrs experience","+914466949422"));

        dbHandler.addDoctor(new Doctor("Chennai","ENT","Dr.N.Ahiliasamy","MBBS,MS-ENT,DNB(ENT),FRCS,Head and Neck Surgeon","1,2ND sTREET,Venkateshwara Nagar,Velachery,near Bypass Road","21 yrs experience","+914433011082"));

        dbHandler.addDoctor(new Doctor("Chennai","ENT","Dr.N.P.Karthikeyen","MBBS , Diploma in Otorhinolaryngology (DLO),MS(ENT)","1910,5th Street,H Block,Anna Nagar","31 yrs experience","+914433011058"));

        dbHandler.addDoctor(new Doctor("Chennai","ENT","Dr.Prof.Ravi Ramalingaram","MBBS,MS(ENT)","KKR ENT Hospital & Research Institute","24 yrs experience","+914439942513"));

        dbHandler.addDoctor(new Doctor("Chennai","ENT","Dr.A.Ravikumar","MBBS,MS(ENT),DNB(ENT),Diploma in Otorhinolaryngology","18,F-Block,2nd Main Road Anna Nagar East","32 yrs experience","+914433011106"));

        dbHandler.addDoctor(new Doctor("Chennai","ENT","Dr.S.Wasim Khan","MBBS,MS(ENT)","KKR ENT Clinic","12 yrs experience","+914466949433"));

        dbHandler.addDoctor(new Doctor("Chennai","ENT","Dr.Sanjeev Mohanty","MBBS,MS(ENT)","No 5/105,Defence Colony Road,St Thomas Mount,Mandapam & Mutt Road","19 yrs experience","+914439942509"));

        dbHandler.addDoctor(new Doctor("Chennai","ENT","Dr.V Devipriya","MBBS,MS(ENT)","Apollo Day Surgery,12,C,P Ramaswamy Road,near Citi Bank","6 yrs experience","+914433011392"));

        dbHandler.addDoctor(new Doctor("Chennai","ENT","Dr.Shankar.M.N","MBBS,Diploma in Otorhinolaryngology(DLO),MS(ENT)","Laksha Hospital,15,P.S Siva Swamy Road","26 yrs experience","+914433012956"));

        dbHandler.addDoctor(new Doctor("Chennai","ENT","Dr.Kaustabh Kalita","MBBS,Diploma in Otorhinolaryngology(DLO),DNB(ENT)","47/23,4th Avenue,Ashok Nagar","10 yrs experience","+914466949432"));

        dbHandler.addDoctor(new Doctor("Chennai","ENT","Dr.K.K Ramalingam","MBBS,,DLO ENT,FRCS(ENT)","KKR ENT Hospital & Research Institute","55 yrs experience","+914439942513"));

        dbHandler.addDoctor(new Doctor("Chennai","ENT","Dr.R. Shyamala","MBBS,Diploma in Otorhinolaryngology (DLO)","Neeraja ENT Clinic,54,First Floor,Rajiv Gandhi Road,Kandanchavadi","29 yrs experience","+914433011381"));


    }

    void chennaiGP(){
        dbHandler.addDoctor(new Doctor("Chennai","General physician","Dr.Krishna Raman","MBBS,FCCP","No-19,12th Cross Street,Near Indra Nagar Water Tank,Indra Nagar","31 yrs experience","+914433011395"));

        dbHandler.addDoctor(new Doctor("Chennai","General physician","Dr.Sridev Barathan","MBBS,MD-General Medicine,B.Sc","New No 24,Old No 798,1st Floor,Jeevanandam Salai,Opp to Shivan Park","12 yrs experience","+914466959467"));

        dbHandler.addDoctor(new Doctor("Chennai","General physician","Dr.Smisha","MBBS,FNB Reproductive Medicine,Radiologist","AA 122 Shanthi Colony,Anna Nagar","18 yrs experience","+914466949440"));

        dbHandler.addDoctor(new Doctor("Chennai","General physician","Dr.Aruna Ashok","MBBS,MS-Obstetrics","41/42,Sathyadev Avenue,Raja Annamalai Puram,near Ayyapan Temple","10 yrs experience","+914439942531"));

        dbHandler.addDoctor(new Doctor("Chennai","General physician","Dr.Divya Barath","BHMS,MD-Homeopathy","Old No 138,New No51,Shop No 4,Anna Street,OMR Road,Near Axis Bank ATM","6 yrs experience","+914433011389"));

        dbHandler.addDoctor(new Doctor("Chennai","General physician","Dr.Janani Manoharan","MBBS,MD-Obstetrics","Plot No 129,Murugu Nagar,6th Street,Vijay Nagar,Near Sunshine Chennai Senior Secondary School","5 yrs experience","+914433011384"));

        dbHandler.addDoctor(new Doctor("Chennai","General physician","Dr.K.Akila","Post Graduate Diploma in Diabetolo(PGDD),MRCGP","42,State Bank Colony,2nd Street,Saligramam,Near Saligram Bus Terminal","14 yrs experience","+914466003300"));

        dbHandler.addDoctor(new Doctor("Chennai","General physician","Dr.P Shivraj","MBBS,MD-General Medicine,Diploma in Diabetology","52 Gandhi Nagar 1st Main Road Land Mark Opposite to Adayar Signal","13 yrs experience","+914433097790"));

        dbHandler.addDoctor(new Doctor("Chennai","General physician","Dr.K.Nandhitha","MBBS,DNB","144/347,Konnur High Road,Ayanavaram,Chennai,Opposite to Central Bank Of india","19 yrs experience","+914400123009"));

        dbHandler.addDoctor(new Doctor("Chennai","General physician","Dr.Prasanna Kumar Thomas","MBBS,D.T.CD,MD-Pulmonary Medicine","76/208,Dr Ramasamy Road,Near City Union Bank ATM","29 yrs experience","+914439942515"));

        dbHandler.addDoctor(new Doctor("Chennai","General physician","Dr.D Jayashree","BAMS,Diploma in Acupuncture","54/46,Thambiah Road,West Mambalam, Junction of Mambalam Station Road","31 yrs experience","+914430377809"));

        dbHandler.addDoctor(new Doctor("Chennai","General physician","Dr.Senthil Kumar D","MBBS,MD-General Medicine","B-12,Second Floor,Paramount Par(Dr Plaza)-B Block,Velachery Mian Road","19 yrs experience","+914466949660"));
    }
    void bangalore(){
        dbHandler.addDoctor(new Doctor("Bangalore","Gynecologist","Dr.Vinita Jhuntraa","MBBS,MS","10,Rathore Nagar,Queen's Road,Bangalore","31 yrs experience","+918061085276"));

        dbHandler.addDoctor(new Doctor("Bangalore","Gynecologist","Dr.Kavita V Reddy","MBBS,DGO","2,SLV Plaza,Ground floor,Arvind Avenue,Bangalore","35 yrs experience","+918043083070"));

        dbHandler.addDoctor(new Doctor("Bangalore","Gynecologist","Dr.Sreedhar Reddy","MBBS,MS-Gynecology","83,ST Bed Layout,Koramangala 4th Block,Bangalore","18 yrs experience","+919051239853"));

        dbHandler.addDoctor(new Doctor("Bangalore","Gynecologist","Dr.Kamini Arvind Rao","MBBS,DGO,FRCOG(London)","1109,Fortuna,11th Main Road,5th Block,JayaNagar,Bangalore","27 yrs experience","+919066019228"));

        dbHandler.addDoctor(new Doctor("Bangalore","Gynecologist","Dr.Anita Balakrishna","MBBS,MS-Gynecology","324,CMH Road,IndiraNagar 1st Stage,Bangalore","28 yrs experience","+918856084007"));

        dbHandler.addDoctor(new Doctor("Bangalore","Ophthalmologist","Dr.Vinita Arora","MBBS,DNB","G-3,Beullaundur Circle,Bengalore","24 yrs experience","+918067412285"));

        dbHandler.addDoctor(new Doctor("Bangalore","Ophthalmologist","Dr.Sirish Nelivigi","MBBS,DNB Opthalmology","44621,2nd floor,Sarajpur Ring Road,above Vijay Bak","21 yrs experience","+918067430004"));

        dbHandler.addDoctor(new Doctor("Bangalore","Ophthalmologist","Sanjeev Madan","MBBS,MS-Opthalmology","187,Whitefield Main Road,Whitefield,Bangalore","35 yrs experience","+918011984420"));

        dbHandler.addDoctor(new Doctor("Bangalore","Ophthalmologist","Dr.V.Krishna","MBBS,MS-Opthalmology","68,1st Floor,100ft Ring Road,2nd stage,Bangalore","41 yrs experience","+917707611238"));

        dbHandler.addDoctor(new Doctor("Bangalore","Ophthalmologist","Dr.Anita B","MBBS,DOMS,MS-Opthalmology","769,1st Cross,Kingeri Upanagar,Bangalore","36 yrs experience","+918090103357"));

        dbHandler.addDoctor(new Doctor("Bangalore","Orthopedist","Dr. Suresh Kumar M S","MBBS , D.Orth , M.Ch - Orthopaedics , Fellowship in Foot & Ankle (USA) Orthopedic Surgeon ","143, 1st Cross, 5th Block, Landmark: Near Nagarjuna Hotel, Bangalore","30 yrs experience","+918037410784"));

        dbHandler.addDoctor(new Doctor("Bangalore","Orthopedist","Dr. Sunil K S Gowda","MBBS,MS-Orthopaedics, Orthopedic Surgeon ","Dr.Sunil K.S Gowda -VIMS Hospital 88, Outer Ring Road, Marathahalli. Landmark: Near Innovative Mutiplex & Opposite Home Shop, Bangalore","19 yrs experience","+918054512205"));

        dbHandler.addDoctor(new Doctor("Bangalore","Orthopedist","Dr. Prakash B L","DNB ,MS-Orthopaedics,MBBS,FAO Orthopedic Surgeon,Joint Replacement Surgeon,Total Joint Surgeon","Vanditha Orthopaedic Centre 948, 23rd Main, 39th Cross, Jayanagar 4th 'T' Block. Landmark: Opposite To Mamatha Hospital And Opp.Allahabad Bank, Bangalore","40 yrs experience","+918871233400"));

        dbHandler.addDoctor(new Doctor("Bangalore","Orthopedist","Dr. Subodh M Shetty","MBBS , Diploma in Orthopaedics , MS - OrthopaedicsSpine Surgeon , Orthopedic Surgeon ,Orthopedist","Orthocentre 684, 10th Cross, 7th Main, Landmark: Near Agraj Automations, Bangalore","41 yrs experience","+917722310087"));

        dbHandler.addDoctor(new Doctor("Bangalore","Orthopedist","Dr. Chandramouli B","MBBS , MS - OrthopaedicsOrthopedist , Orthopedic Surgeon , Pediatric Orthopedic Surgeon","46/8,(Old No 18), SLLR Mansion,(Next to SBM),12th Main,1st Block,Rajajinagar, Bangalore","34 yrs experience","+918090761145"));

        dbHandler.addDoctor(new Doctor("Bangalore","Pediatrician","Dr.Sumeeta Nagraj","MBBS,DNB(Pediatrician)","G 1 Lights Pro Tower,5/1 Gulmohar Enclave,Bangalore","18 yrs experience","+919051992359"));

        dbHandler.addDoctor(new Doctor("Bangalore","Pediatrician","Hemant Agarwal","MBBS,B.Sc,D.T.C.H","No 58,1st cross,Domlur Layout,Bangalore","21 yrs experience","+919045019278"));

        dbHandler.addDoctor(new Doctor("Bangalore","Pediatrician","Dr.Bhaskar Sheoy","MBBS,MS-Pediatrics","320,2d Block,4th stage,Shastri Marg,Bangalore","28 yrs experience","+918066083101"));

        dbHandler.addDoctor(new Doctor("Bangalore","Pediatrician","Dr.Narmada Devi","MBBS,MS-Pediatrics","372,Opp to ITPL Main Road,AECS Layout,Brookefield,Bangalore","24 yrs experience","+918023082019"));

        dbHandler.addDoctor(new Doctor("Bangalore","Pediatrician","Dr.Naveen D Kini","MBBS,MS-Pediatrics,DNB-Pediatrics","PP Complex,New Bel Road,Bangalore","34 yrs experience","+917033084276"));


    }

    void Chennai(){


        dbHandler.addDoctor(new Doctor("Chennai","Gynecologist","Dr.Kokilavani","MBBS,DGO,DNB(Gynecology)","9-B,1st Main Road,VGP Selva Nagar,Chennai","24 yrs experience","+914433021392"));

        dbHandler.addDoctor(new Doctor("Chennai","Gynecologist","Dr.N Chitra","MBBS,MD-Gynecology","No1,Krishnamachari Street,Radha Nagar Main Road,Chennai","19 yrs experience","+914433011482"));

        dbHandler.addDoctor(new Doctor("Chennai","Gynecologist","Dr.Pravati Shankar","MBBS,MS-Gynecology,DM","1,47th Street,5th Main Road Nanganallur,Chennai","36 yrs experience","+918732071001"));

        dbHandler.addDoctor(new Doctor("Chennai","Gynecologist","Dr.Smisha","MBBS,MS","New No 24,1st Floor,Jeevananandam salai,Chennai","41 yrs experience","+917633096629"));

        dbHandler.addDoctor(new Doctor("Chennai","Gynecologist","Dr.Mala Raj","MBBS,MDGO,Diploma in Gynecology","65,R-Block,12th Main Road,Ama Nagar,Chennai","32 yrs experience","+919098120056"));

        dbHandler.addDoctor(new Doctor("Chennai","Ophthalmologist","Dr.Lipika Roy","MBBS,MS-Opthalmology","BMR Mall,1st Floor,1/398,Near Ganga Sweets,OMR Road,Chennai","17 yrs experience","+914433011385"));

        dbHandler.addDoctor(new Doctor("Chennai","Ophthalmologist","Dr. B Malini","MBBS,MS-Opthalmology,MD","48, Warren Road, Mylapore, Landmark: Near Junction Of Ranga Road & Warren Road, Chennai","28 yrs experience","+914433011385"));

        dbHandler.addDoctor(new Doctor("Chennai","Ophthalmologist","Dr. Rajini Kantha","MBBS , MS - Ophthalmology , F.M.R.F Ophthalmologist/ Eye Surgeon","R K Eye Centre 14/20, Chari Street, T Nagar. Landmark: Off North Usman Road, Chennai","38 yrs experience","+919474564241"));

        dbHandler.addDoctor(new Doctor("Chennai","Ophthalmologist","Dr. Radhi Malar","MBBS , MS - Ophthalmology , Fellowship in Pediatric Ophthalmology,Ophthalmologist/ Eye Surgeon ","52, 1st Main Road, Gandhinagar, Adyar. Landmark: Near To Adyar Signal, Chennai, Chenna","27 yrs experience","+914401209980"));

        dbHandler.addDoctor(new Doctor("Chennai","Ophthalmologist","Dr. VC Parthasarathy","MBBS , Diploma in Ophthalmology , Fellow of the Royal College of Ophthalmologists of UK (FRCOphth. UK) Ophthalmologist/ Eye Surgeon","Leela Eye Clinic 2, 25th East Street, Kamaraj Nagar, Landmark: Near to Depot, Chenna","32 yrs experience","+917760023189"));

        dbHandler.addDoctor(new Doctor("Chennai","Orthopedist","Dr.P.R.Ashwin Vijay","MBBS , MS - Orthopaedics , F.ISAKOS(Arthroscopy & Sports medicine)Orthopedist , Orthopedic Surgeon","50/51, RSR Plaza, Arcot Road, Saligramam, Landmark: Passport Seva Kendra, Chennai","29 yrs experience","+919050412376"));

        dbHandler.addDoctor(new Doctor("Chennai","Orthopedist","Dr. R.N.Premkumar","MBBS , MS - Orthopaedics Orthopedic Surgeon , Orthopedist ","Sri Ranga Hospital New No.4, Old No.30, Devanathan Street, Mandaveli, Chennai","43 yrs experience","+914411078009"));

        dbHandler.addDoctor(new Doctor("Chennai","Orthopedist","Dr. Prof.A.Shanmuga Sundaram","MS - Orthopaedics , M.Ch - Orthopaedics , Ph.D-Sports Medicine Orthopedic Surgeon , Total Joint Surgeon , Joint Replacement Surgeon , Sports Medicine Surgeon","New 72, Luz Church Road, Kattukoil Garden, Mylapore, Chennai","25 yrs experience","+914453011385"));

        dbHandler.addDoctor(new Doctor("Chennai","Orthopedist","Dr. Naresh Padmanabhan","Diploma in Orthopaedics , MBBS, Orthopedic Surgeon","21/1, Malaviya Avenue, Ground Floor Nathans Arcade, LB Road, Landmark: Opp. to HDFC Bank, Chennai","32 yrs experience","+918082800128"));

        dbHandler.addDoctor(new Doctor("Chennai","Orthopedist","Dr. Manikandan Veluswami","MS - Orthopaedics , Diploma in Orthopaedics , MBBS Orthopedist , Orthopedic Surgeon , Total Joint Surgeon , Pediatric Orthopedic Surgeon","24, Old No.15, Balaji Nagar Main, Adambakkam. Landmark: Near to DAV School & Opp. to Raja Rani Textiles, Chennai","44 yrs experience","+914439942509"));

        dbHandler.addDoctor(new Doctor("Chennai","Pediatrician","Dr. T. Sivaraman","MBBS , MD - Paediatrics , FPIC ( Intensive Care ) Pediatrician ,Paediatric Intensivist","Siva Childrens Hospital & Family Health Centre.10 A, Ayodya colony, Velachery, Landmark: Opp. Naydu Hall, Chennai","30 yrs experience","+914433011385"));

        dbHandler.addDoctor(new Doctor("Chennai","Pediatrician","Dr. Saravanan A","MBBS , MD - Paediatrics Pediatrician","Jayachandran nagar, Asan College Road, Velachery - Tambaram Main Road, Medavakkam, Landmark: Near A.K Super Market, Chennai","43 yrs experience","+914406946733"));

        dbHandler.addDoctor(new Doctor("Chennai","Pediatrician","Dr. S Srinivas","MBBS , Diploma in Child Health (DCH) , DNB (Pediatrics) , PDCC (Pediatric Gastroenterology) , Fellowship in Pediatric Gastroenterology","14, Balaji Avenue, 1st street, T Nagar, Landmark: Opposite Vidyodaya School, Chennai","25 yrs experience","+914753021292"));

        dbHandler.addDoctor(new Doctor("Chennai","Pediatrician","Dr. Swapna","MBBS,MD - Paediatrics","1, Krishnamachari Street, Radha Nagar. Landmark: Near Lakshya Clinic, Chennai","34 yrs experience","+914473014090"));

        dbHandler.addDoctor(new Doctor("Chennai","Pediatrician","Dr. Rohit Bharadwaj","MBBS , Diploma in Child Health (DCH) , MRCPCH UK - Membership Of The Royal College Of Paediatrics, UK","Dr Rabindran's Health Care Centre No 212, Secretariat Colony, MTH Road, Ambattur. Landmark: Near Ambattur Bus Stop, Chennai, Chennai","21 yrs experience","+914019940011"));
    }

    void delhi(){

        dbHandler.addDoctor(new Doctor("New Delhi","Cardiologist","Dr. Bimal Chhajer","MBBS , MD - Cardiology , MD - General Medicine","14/84, Vikram Vihar, Lajpat Nagar-4, New Delhi","28 yrs experience","+911130803855"));

        dbHandler.addDoctor(new Doctor("New Delhi","Cardiologist","Dr. Anirban Biswas","MBBS , MD - Medicine , PGP- Diabetology , Fellowship in non-invasive Cardiology","49-50, Community Center, New Friends Colony, East of Kailash. Landmark: Near Sapna Cinema Hall,New Delhi","20 yrs experience","+911133104986"));

        dbHandler.addDoctor(new Doctor("New Delhi","Cardiologist","Dr. Amitabh Khanna","MBBS , DP Card , FCCP (USA) , PG Diabetology (Boston) , Fellowship in Diabetes & Metabolism-Aarhus University,Denmark","Haf-B, Phase-I, Pocket-B, Dwarka Sector-12. Landmark: Near Dwarka International School, New Delhi","5 yrs experience","+911133104976"));

        dbHandler.addDoctor(new Doctor("New Delhi","Cardiologist","Dr. M Khalilullah","MBBS , MD - General Medicine , DM - Cardiology","2, Ring Road, Lajpat Nagar, New Delhi","50 yrs experience","+911133013186"));

        dbHandler.addDoctor(new Doctor("New Delhi","Cardiologist","Dr.Kuldeep Arora","DM - Cardiology , MD - General Medicine , MBBS","C-1, Sushant Lok- 1, Sector-43,Landmark: Near Golsukh Mall, New Delhi","8 yrs experience","+911133104977 "));

        dbHandler.addDoctor(new Doctor("New Delhi","Dentist","Dr.Sony Mishra","BDS , MDS , PGDE (Cosmetic & Esthetic Dentist)","First Floor, C-660, New Friends Colony, New New Delhi-110025, New Delhi","14 yrs experience","+911130803868"));

        dbHandler.addDoctor(new Doctor("New Delhi","Dentist","Dr. Sourabh Nagpal","BDS , MDS-PROSTHODONTICS , Post-Graduate Certificate in Oral Implantology (PGCOI) , Fellowship and Diplomate in Implantology from ICOI (USA) , PGDE (Cosmetic & Esthetic Dentist) , Advanced Aesthetics , Certification in Aesthetic Dentistry , B.E.G.O (Special Training in Ancora and Crown and Bridge) , Cosmetic Dentistry","9526, Sector C Pocket 9 C-9, Vasanth Kunj, Landmark: Near DPS Vasant Kunj, Delh","15 yrs experience","+911133104739"));

        dbHandler.addDoctor(new Doctor("New Delhi","Dentist","Dr.Poonam Nagpal"," IARE-USA , BDS , MDS , Advanced Aesthetics , GOLD MEDALIST , Fellowship In Cosmetic Dermatology","9526, Sector C Pocket 9 C-9, Vasanth Kunj, Landmark: Near DPS Vasant Kunj, New Delhi","15 yrs experience","+911133104739"));

        dbHandler.addDoctor(new Doctor("New Delhi","Dentist","Dr.Anil Kohli","BDS , MDS - Endodontics , DNB"," 28-29, Lala Lajpat Rai Marg, Lajpat Nagar. Landmark: Near Metro Station & Gate No. 2, Delh.","40 yrs experience","+911130546545"));

        dbHandler.addDoctor(new Doctor("New Delhi","Dentist","Dr.Asheesh Gupta","BDS , MDS-Prosthodontics & Implantology , Certificate in implantology , M.B.A , ph D","C-7/97,Ground Floor near BMW Swimming Pool ,Rohini Sector-8, New Delhi, New Delhi","13 yrs experience","+911133104993 "));

        dbHandler.addDoctor(new Doctor("New Delhi","ENT","Dr.Sanjiv Dang","MS - ENT , MBBS","No. 20B/3, DB Gupta Road, Karol Bagh. Landmark: Near Hdfc Bank ATM & Near Khalsa College, New Delhi","34 yrs experience","+911130803861"));

        dbHandler.addDoctor(new Doctor("New Delhi","ENT","Dr.  Arun Theraja","MBBS , MS - ENT , Diploma in Otorhinolaryngology (DLO)","West Punjabi Bagh,New New Delhi, New Delhi","24 yrs experience","+911133104988"));

        dbHandler.addDoctor(new Doctor("New Delhi","ENT"," Jayant Jaswal","MBBS , MS - ENT , Diplomate of National Board (ENT) , Post Graduate Diploma in Hospital & Healthcare Management","C 3/91, Janakpuri. Landmark: Near Darby Crossing & Near Indira Ideal School, New Delhi","21 yrs experience","+911130803864"));

        dbHandler.addDoctor(new Doctor("New Delhi","ENT","Dr.B K Agarwal","MBBS , MS - ENT","A-38 Vikas Puri, Near Metro Pillar 625, New Delhi","24 yrs experience","+911133104991"));

        dbHandler.addDoctor(new Doctor("New Delhi","ENT","Dr. Vinay Walia","MS - ENT , DNB (ENT) , Diploma in Oto-Rhino-Laryngology (D.O.R.L)","Sector D-2/2052, Vasant Kunj , New New Delhi, New Delhi","26 yrs experience","+911133104992"));

        dbHandler.addDoctor(new Doctor("New Delhi","General physician","Dr. Aman Sharma","MBBS , M Derm , Fellowship In Laser And Skin Surg.","22, Khan Market. Landmark: Near Dayal Opticals, New Delhi","19 yrs experience","+911130803857"));

        dbHandler.addDoctor(new Doctor("New Delhi","General physician","Dr. Rajiv Anand","MBBS , MD - Medicine , DM - Neurology"," A-292, Outer Ring Road, Meera Bagh, Paschim Vihar, New New Delhi - 110087. Landmark: Near Meera Bhawan, New Delhi","34 yrs experience","+911130743605"));

        dbHandler.addDoctor(new Doctor("New Delhi","General physician","Dr. Aman Vij","MBBS , MD ( Internal Medicine )","193 Ground floor DDA SFS Flats Sector 9 Pocket 1 Dwarka New New Delhi, New Delhi","22 yrs experience","+911133104990 "));

        dbHandler.addDoctor(new Doctor("New Delhi","General physician","Dr.Rajeev Gupta","MD , FCCP (USA) , FCCM , MRCP ","A Block, Shalimar Bagh, New Delhi","14 yrs experience","+911130803867"));

        dbHandler.addDoctor(new Doctor("New Delhi","General physician","Dr. S Bountra","MBBS","266B, Hauz Rani Market, Malviya Nagar. Landmark: Near Malviya Metro Station, New Delhi","36 yrs experience","+911130803850"));

        dbHandler.addDoctor(new Doctor("New Delhi","Gynecologist","Dr.Sutopa Banerjee","DNB (Obstetrics and Gynecology) , DGO , MBBS","Mandir Marg, Press Enclave Road,Saket. Landmark: Near Maxx Hospital,New Delhi","14 yrs experience","+91113314997"));

        dbHandler.addDoctor(new Doctor("New Delhi","Gynecologist","Dr. Yashica Gudesar","MBBS , DNB (Obstetrics and Gynecology) , DGO , PGDMLS","RZ-F 1/1, Mahavir Enclave Palam Dabri Road,Dwarka, Landmark: Near Dwarka Airport Flyover, New Delhi","15 yrs experience","+911130743421"));

        dbHandler.addDoctor(new Doctor("New Delhi","Gynecologist","Dr.Vandana Gupta"," MBBS , DGO , MD - Obstetrics & Gynaecology","H-2/32, Sector-11, Rohini. Landmark: Near Garg Trade Centre/ G3S Picture Hall, New Delhi","15 yrs experience","+911133104978"));

        dbHandler.addDoctor(new Doctor("New Delhi","Gynecologist","Dr.Sunita Gupta","MBBS , MD - Obstetrics & Gynaecology"," B - 7/7, Near Deer Park Main Gate, Safdarjung Enclave, New Delhi.","31 yrs experience","+911130743462"));

        dbHandler.addDoctor(new Doctor("New Delhi","Gynecologist","Dr. Parinita Kalita","MBBS , MD - Obstetrics & Gynaecology , DNB (Obstetrics and Gynecology)","C- 18,Sai Chowk, Madhu Vihar, (Near IP extension), New Delhi","13 yrs experience","+911133104991 "));

        dbHandler.addDoctor(new Doctor("New Delhi","Ophthalmologist","Dr. Arun Sethi"," MBBS , MD - Ophthalmology , FRCS"," C-2, Nr Ashram Crossing, Maharani Bagh, Landmark:Near Ashram Crossing Chowk, New Delhi","8 yrs experience","+911130803860"));

        dbHandler.addDoctor(new Doctor("New Delhi","Ophthalmologist","Dr. Smita Mukherjee","MBBS , MS - Ophthalmology , DOMS , DNB Ophthalmology","34, Lajpat Nagar IV, Ring Road, New New Delhi, New Delhi 110024, New Delhi","13 yrs experience","+911133104982"));

        dbHandler.addDoctor(new Doctor("New Delhi","Ophthalmologist","Dr. Shashi Nath Jha","MBBS , MD - Ophthalmology","Q-53, Ground Floor, Rajouri Garden, Landmark: Near Janta Market, New Delhi","17 yrs experience","+911130803867"));

        dbHandler.addDoctor(new Doctor("New Delhi","Ophthalmologist","Dr. Naginder Vashishti","MBBS , DNB Ophthalmology , MNAMS (Membership of the National Academy) (Ophthalmology) , F.I.C.O","B 1/18, Mianwali Nagar, Rohtak Road, Peeragarhi, Landmark : Near Peeragarhi Crossing Gate No 3, Opp to Metro Piller No 301, New Delhi","16 yrs experience","+911133104975"));

        dbHandler.addDoctor(new Doctor("New Delhi","Ophthalmologist","Dr.Shweta Dua Vinayak","F.L.V.P.E.I , D.N.B Ophthalmology , MNAMS Ophthamology  , DOMS , MBBS.","90/43, Malviya Nagar, Landmark: Opp. Green Field School, New Delhi","21 yrs experience","+91113356489 "));

        dbHandler.addDoctor(new Doctor("New Delhi","Orthopedist","Dr. G P Dureja","MBBS , M.D - Anesthiologist , FAAOS , FIASP","C-9 Vishal Enclave, Main Najafgarh Road, Rajouri Garden, New New Delhi, New Delhi","11 yrs experience","+911133698567"));

        dbHandler.addDoctor(new Doctor("New Delhi","Orthopedist","Manoj Sharma","MBBS , Diploma in Orthopaedics , FCPS Ortho (New Delhi) , MS - Orthopaedics , M.Ch - Orthopaedics)"," 24/153, Shakti Nagar, delhi-110007. Landmark: Near Shakti Nagar Crossing, Opp.Kay Petrol Pump, New Delhi","12 yrs experience","+911130803866"));

        dbHandler.addDoctor(new Doctor("New Delhi","Orthopedist","Bhagwat Sharma","MBBS , MS-Orthopedist","Plot No 29, Pocket 16, Sector 24, Rohini. Landmark: Near Sovereign Public School, New Delhi","16 yrs experience","+911136987412"));

        dbHandler.addDoctor(new Doctor("New Delhi","Orthopedist","Sudhir Seth","MBBS , MS - Orthopaedics , DNB , MNAMS (Membership of the National Academy) (General Surgery) , M.Ch - Orthopaedics","A-19/A  Kailash Colony, New New Delhi, New Delhi","29 yrs experience","+911133104972"));

        dbHandler.addDoctor(new Doctor("New Delhi","Orthopedist"," Shankar Acharya","MBBS , MS - Orthopaedics , DNB (Orthopedics) , M.Ch - Orthopaedics , FRCS"," 21, Ground Floor, Kailash Enclave,Pitampura. Landmark: Near Saraswati Vihar & E-Block Bus Stand, New Delhi","16 yrs experience","+911130743522"));

        dbHandler.addDoctor(new Doctor("New Delhi","Pediatrician","Anju Bhasin","MD - Paediatrics","MBBS , MD - Paediatrics , Diploma in Child Health (DCH)","33 yrs experience","+919818945840"));

        dbHandler.addDoctor(new Doctor("New Delhi","Pediatrician","Manu Agarwal","MBBS , MD - Paediatrics , Post Doctoral Observership in Pediatric and Adolescent Endocrinology","Kunj Market, Masoodpur, Vasant Kunj, New Delhi","14 yrs experience","+911130743617"));

        dbHandler.addDoctor(new Doctor("New Delhi","Pediatrician","Dr.Sricha Sharma","MBBS , Diploma in Child Health (DCH)","126, 1st Floor, Vardman Dee Cee Plaza,Landmark: Ashirwad Chowk, Sector 11, Dwarka, New Delhi","14 yrs experience","+911133659876"));

        dbHandler.addDoctor(new Doctor("New Delhi","Pediatrician","Dr Neeraj Adlakha","MBBS,MD-Pediatrics","D 28, Pitampura. New Delhi 110034. Landmark: Near metropiller 365, New Delhi","26 yrs experience","+911130743729"));

        dbHandler.addDoctor(new Doctor("New Delhi","Pediatrician","Dr.Rakesh Malhotra","MD - Paediatrics , DNB (Pediatrics) , MBBS","F-5 & 6, 1st floor, Plot no. 2, Manish Twin Plaza, Sector-4, Dwarka. Landmark: Next to KFC, New Delhi","33 yrs experience","+911130743695"));


    }

    void hyd(){

        dbHandler.addDoctor(new Doctor("Hyderabad","Cardiologist","Dr.Ravi Kumar Aluri","MBBS,DM-Cardiology,MD-Cardiology","402,Aditya Jayrag Complex,Road No.36/37,Opp to Neerus Emporium","18 yrs experience","+914033195168"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Cardiologist","Dr.B Soma Raju","MBBS,MD-Cardiology,DM-Cardiology,Ph.D","8-2-620/A/E,Road No.10,Landmark:Beside Rainbow Hospital & Opposite Karvy Building","21 yrs experience","+914033195057"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Cardiologist","Dr.Bimal Chhajer","MBBS,MD-Cardiology","Beside Vasu Medical hall,Lane opp to HDFC Bank,Himayathnagar","28 yrs experience","+914030883501"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Cardiologist","Dr.Shyam Sundar Reddy P","MBBS,DM-Cardiology,MD-General Medicine","302,Aditya Jayrag Complex,Road No.32/39,Opp to Hirak Emporium","6 yrs experience","+914066388679"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Cardiologist","Dr.Guru Prakash","MBBS,DM-Cardiology,MD-Cardiology","Yashoda Hospital-Room No 303, New Block,Raj Bhavan Road","13 yrs experience","+914066588499"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Cardiologist","Dr.C.H.Umesh Chandra","MBBS,DM-Cardiology,MD-General Medicine","Uma Heart Care Clinic, No 2 Subhodaya Apartments,YWCA Lane,Boggulkunta,Abids","35 yrs experience","+914033195533"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Cardiologist","Dr.C.Narasimhan","MBBS,DM-Cardiology,MD-Internal Medicine","Care Hospital,8-2-620/A/E,Road No10","18 yrs experience","+914033195084"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Cardiologist","Dr.Sanjib K Sahu","DNB(Cardiology),MD-Medicine,FESC","156,Alexander Road,S D Road,Near Clock Tower","12 yrs experience","+914033195549"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Cardiologist","Dr.Nageswara Rao Koneti","MBBS,DM-Cardiology,MD-Paediatrics,DNB(Cardiology)","620/A/E,Road no 20,Beside Rainbow Apartment","15 yrs experience","+914033195170"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Cardiologist","Dr.B.G.K Sudhakar","MBBS,DM-Cardiology,MD","162,Main RoadCentral Bank Colony,LB Nagar,Near Big Bazaar","22 yrs experience","+914030883516"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Cardiologist","Dr.M.S.S. Mukherjee","MBBS,DM-Cardiology,DNB(Cardiology)","Plot No 755,756,757,Pragathi Nagar,Landmark:opposite of J.N.T.U Kukatpally","12 yrs experience","+91403395528"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Cardiologist","Dr.Gokul Reddy","MBBS,DM-Cardiology,MD-General Medicine","Elbit Clinics and Diagnostic's,HUDA Complex,Tarnaka","16 yrs experience","+914066588377"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Gynecologist","Dr. Vandana Hegde","MS - Obstetrics and Gynaecology , Post Doctoral Fellowship in Reproductive Medicine , Fellowship in Infertility , MD -Obstretics & Gynaecology Gynecologist , Obstetrician , Reproductive Endocrinologist (Infertilty) ","Hegde Maternity And Nursing Home 16-11-310/8/B, Moosarambagh, Landmark: Near Blue Bird Cafe, Hyderabad","10 yrs experience","+91403519001"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Gynecologist","Dr. Seshasaina Reddy","BHMS,MD,MBBS","Madhapur Main Raod. Landmark: Near Bata Show Room, Hyderabad","20 yrs experience","+914033104531"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Gynecologist","Dr. Chetan Raj K",",MBBS,MS - Obstetrics and Gynaecology","Dr. Chetan's Homeo Clinic Sainikpuri Near Sai Baba Temple, Defence Colony, Hyderabad","34 yrs experience","+914030870520"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Gynecologist","Dr. Srilatha Gorthi","MD - Obstetrics & Gynaecology , DNB , MRCOG , CCT , Pelvic Ultrasonography , Subspecialist in Reproductive medicine , Trasvaginal laparoscopy","The Birthplace Clinic - Gachibowli 21, Jayabheri Enclave, Hyderabad","17 yrs experience","+914430003525"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Gynecologist","Dr. G. Bhavani","MBBS , MD - DGO , Professor of Obestetrics & Gynaecology , Certified IVF Specialist , Fertility Specialist , Diploma in Advanced Gynaec Laparoscopic Surgery","4th floor, Chaithanya Chambers, Chaithanyapuri Main Road, Dilsukh Nagar, Landmark: Beside HP Petrol Bunk, Hyderabad","44 yrs experience","+917076120076"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Ophthalmologist","Dr. Rishi Swarup","MBBS , DOMS,Eye Surgeon"," Landmark: Near Sujatha School & Near Stanley College, Hyderabad","29 yrs experience","+914036440520"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Ophthalmologist","Dr. Milind Bhide","MBBS , MS - Ophthalmology , FRCS (Ophthal) , FRCOphth Ophthalmologist/ Eye Surgeon","Hyderabad Eye Centre 3-6-217/1, St. No. 15, Himayat Nagar, Landmark: Near Vasavi Public School, Hyderabad","24 yrs experience","+914023190148"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Ophthalmologist","Dr. B. Venkateshwar Rao","MBBS , MD-OPHTHAMOLOGY , Former Follow","Shreya Eye Care Center G-8,Srinivasa Towers,6-3-1187,Greenlands,Begumpet,Landmark:Before Hotel Grand Kakatiya. back side of state bank Atm, Hyderabad","28 yrs experience","+914054191119"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Ophthalmologist","Dr. Syed Maaz Mohiuddin","MS - Ophthalmology,DNB Ophthalmology,FRCS,MBBS","Eye Care Hyderabad Nalgonda X Road, Malakpet, Landmark: Near Funtoosh, Hyderabad","30 yrs experience","+914040013500"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Ophthalmologist","Dr. Pradeep Swarup","MBBS , MS - Ophthalmology","Swarup Eye Centre 5-9-163, Chapel Road, Nampally, Hyderabad","42 yrs experience","+914016588344"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Orthopedist","Dr. K Sudhir Reddy","FRCS (Trauma & Ortho) , FRCS , M.Ch - Orthopaedics , MS - Orthopaedics , MBBS , Revision Arthroplasty Fellowship (Germany) Orthopedic Surgeon , Joint Replacement Surgeon , Total Joint Surgeon","Mck Block 2,Near Metro Railway Station,Opp. Vasanth Nagar Arch, Hyder Nagar Main, Land mark: Nizampet crossroad, Hyderabad","21 yrs experience","+914086586377"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Orthopedist","Dr. Raghav Sunil","MBBS , MS - Orthopaedics","Active Spine Care, Plot no 270, G 1, Rd No 10 ,Jubilee Hills,Landmark: Opp Cafe Testa Rosa, Hyderabad","31 yrs experience","+914011500344"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Orthopedist","Dr. Kottapalli Divakar Reddy","MBBS , MS - Orthopaedics , MRCSEd Orthopedic Surgeon , Total Joint Surgeon","KDR Ortho Clinic MIG 321, Remedy Hospital Lane, KPHB Colony, Landmark: Near Vighnesh Nursing Home & Beside Syndicate Bank, Hyderabad","27 yrs experience","+914012558300"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Orthopedist","Dr. Purushottam Reddy Padala","MBBS , MS - Orthopaedics , FRCS Orthopedic Surgeon , Total Joint Surgeon , Pediatric Orthopedic Surgeon","Happy Feet Foot Clinics G1, Anitha Enclave, Road No 10, Jubilee Hills. Landmark:Near Vacs Bakery, Hyderabad","33 yrs experience","+914013135230"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Orthopedist","Dr. B.S.V. Raju","MBBS , MS - Orthopaedics , M.Ch , DNB (Orthopedics) , MS - Neuro Surgery Neurosurgeon , Orthopedist , Spine Surgeon","4, Ameerpet, Hyderabad, Landmark: Behind Mythrivanam Building & Besides Blue Fox Hotel, Hyderabad","43 yrs experience","+914023198752"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Dentist","Dr. Chaitanya Kumar Reddy","MDS , FELLOW INTERNATIONAL CONGRESS OF ORAL IMPLANTOLOGY , MAAID(USA) , BDS","GC Dental World 2-21/1, Indira Nagar, Gachibowli Main Road, Gachibowli, Landmark: Next To SBI, Hyderabad","21 yrs experience","+914066588322"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Dentist","Dr. Dipti Baldava","BDS ,MDS-Prosthodontics,Oral Implantology ,Certificate in Cosmetic Dentistry Prosthodontist , Dentist , Dental Surgeon","Smilekraft Multispeciality Dental Clinic 3-6-147/A/2, 13, Sri Ramulu Apts, Landmark: Opp. HDFC Bank, Hyderabad","12 yrs experience","+914030883514"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Dentist","Dr. N Srinivas","BDS , MDS - Orthodontics & Dentofacial OrthopaedicsOrthodontist , Dentofacial Orthopedist , Dental Surgeon , Dentist","GC Dental World 2-21/1, Indira Nagar, Gachibowli Main Road, Gachibowli, Landmark: Next To SBI, Hyderabad","15 yrs experience","+914030887710"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Dentist","Dr. Abhilash Raavi","BDS , MDS - Conservative Dentistry & Endodontics ,PG Certificate Course in Diode Laser DentistryDentist , Dental Surgeon , Endodontist","Brite Smile Dental HospitalBehind Heritage fresh, Near Chirec public school. Landmark: Near Tiny Vilage, Hyderabad","16 yrs experience","+914022009870"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Dentist","Dr. P Venkat Ratna Nag","BDS , MDS - Prosthodontics & Implantology , FELLOW & DIPLOMATE ICOI (USA)Dentist , Dental Surgeon","GC Dental World 4/21, Indrani Nagar, Gachi Main Road, Gachibowli, Next To SBI, Hyderabad","18 yrs experience","+9140026610073"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Dentist","Dr. Nikhil Saran","MDS-Conservative Dentistry & Endodontics ,BDS,Certified ImplantologistEndodontist , Dental Surgeon , Dentist","Vista Dental Studio 1st Floor, Madhapur, Landmark: Opposite Hotel Kassani GR & Above Apollo Pharmacy, Hyderabad","10 yrs experience","+914033990129"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Dentist","Dr. Subhash Mareddy","MDS , BDS Dental Surgeon,Dentist","Radhika Dental Hospital 12-2-718/A/8, Nanal Nagar,Mehdipatnam, Landmark: Beside Olive Hospital, Hyderabad","24 yrs experience","+914044002380"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Dentist","Dr. Lavanya B","DENTAL SURGEON , Oral Implantologist","Dr.Lavanya Dental & Implant Centre House No 1-10, Shop No F3, Madhapur, Landmark: Opp. HDC BANK ,beside pathanjali store, Hyderabad","10 yrs experience","+914066110045"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Dentist","Dr. Ruchir Mishra","BDS , MDS - Oral & Maxillofacial Surgery , Certificate of Oral Implantology , Diploma in Hospital AdministrationOral And MaxilloFacial Surgeon , Dentist , Dental Surgeon","Smilekraft Multispeciality Dental Clinic 3-6-147/A/2, 103, Sri Ramulu Apts, Landmark: Opp. HDFC Bank, Hyderabad","14 yrs experience","+914030883501 "));

        dbHandler.addDoctor(new Doctor("Hyderabad","Dentist","Gayatri Moghe","BDS , MDS , M.Sc - Psychology Dental Surgeon","Toothbuddies 8-2-293/82/F, Landmark:Above Magna Code,/Punjab National Bank,Road No 9,Filmnagar, Hyderabad","11 yrs experience","+914055003329"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Dentist","Dr. Siddharth","BDS , MDS - Periodontology and Oral Implantology Periodontist , Implantologist , Dentist , Dental Surgeon","Smiles 'N' More Orthodontic & Dental Implant Centre 161, 9th Main, 6th Sector. Landmark: Behind HSR BDA Complex & Opposite Lawrence School","12 yrs experience","+914033122350"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Dentist","Dr. Rajashree Roy","BDS , MDS-PROSTHODONTICS AND CROWN BRIDGE , Certified Implantologist Prosthodontist , Dental Surgeon","Smiline Dental Hospitals Srinagar Colony Road, Panjagutta, Srinagar Colony, Ameerpet, Landmark: Near Indian Overseas Bank, Hyderabad","13 yrs experience","+914030003521"));

        dbHandler.addDoctor(new Doctor("Hyderabad","ENT","Dr. Nagendra Mahendra","MBBS , Diploma in Otorhinolaryngology (DLO) , DNB (ENT),ENT/ Otolaryngologist","Radhika Dental Hospital 12/27, Canal,Mehdipatnam, Beside Olivia Hospital, Hyderabad","38 yrs experience","+914066770091"));

        dbHandler.addDoctor(new Doctor("Hyderabad","ENT","Dr. Sriprakash V","MBBS , MS - ENT","MicroCare Skin & Hair Transplant Hospital 2nd Floor, Sun Towers, Plot No. 1097, Road No 36, Jubilee Hills, Landmark: Beside Peddamma Temple, Hyderabad","21 yrs experience","+914030883500"));

        dbHandler.addDoctor(new Doctor("Hyderabad","ENT","Dr. Srivalli Madhira","MBBS , MS - ENT , Post Graduate Diploma in Diabetology (PGDD) , MASTERS IN DIABETOLOGY ENT,Diabetologist","Sai Institute of ENT & Endcrinology ClinicD.No : 47-9-7, Lane beside hotel Bez Krishna, Dwaraka Nagar, Vishakhapatnam, 530016, Visakhapatnam","17 yrs experience","+914033195531"));

        dbHandler.addDoctor(new Doctor("Hyderabad","ENT","Dr. Harika Surapaneni","MBBS , MS - ENT","ENT Care Hospital (KPHB/MIYAPUR) Sapthapathi Towers, 1st floor, Chanda Nagar, Landmark: Opposite RS Brothers, Hyderabad","4 yrs experience","+914033195185"));

        dbHandler.addDoctor(new Doctor("Hyderabad","ENT","Dr. M Mohan Reddy","MBBS , Diploma in Otorhinolaryngology (DLO) , MS - ENT , DNB (ENT)","Nova ENT Hospital 6-3-652, 1st floor, Kautilya Block, Medinova Complex, Hyderabad, Landmark: Erramanzil, Hyderabad","35 yrs experience","+914066588377"));

        dbHandler.addDoctor(new Doctor("Hyderabad","ENT","Dr. Srivalli Madhira","MBBS , MS - ENT , Post Graduate Diploma in Diabetology (PGDD) , MASTERS IN DIABETOLOGYENT/ Otolaryngologist , Diabetologist","Sai Institute of ENT & Endcrinology Clinic D.No:47-9-7,Lane beside hotel Bez Krishna, Dwaraka Nagar, Vishakhapatnam, 530016, Visakhapatnam","17 yrs experience","+9104033195531"));

        dbHandler.addDoctor(new Doctor("Hyderabad","ENT","Dr. Sriprakash V","MBBS , MS - ENT","MicroCare Skin & Hair Transplant Hospital 2nd Floor, Sun Towers, Plot No. 1097, Road No 36, Jubilee Hills, Landmark: Beside Peddamma Temple, Hyderabad","21 yrs experience","+914066700124"));

        dbHandler.addDoctor(new Doctor("Hyderabad","ENT","Dr. Imad khan Ruman","BASLP , MASLP","K Speech & Hearing Center Door no: F.F.4, First Floor, United 21 Building, Secunderabad, Landmark: Above SBI & Opp Passport Office, Hyderabad","9 yrs experience","+914009911296"));

        dbHandler.addDoctor(new Doctor("Hyderabad","ENT","Dr. C.P.Sudheer","MBBS , M.S. (ENT)","Sri Vijayanand ENT & Dental Clinic1-1-189/6/A,Vivek Nagar, Street No.6., Chikkadpally, Landmark: Behind Devi Theater, Hyderabad","11 yrs experience","+914066091127"));

        dbHandler.addDoctor(new Doctor("Hyderabad","ENT","Dr. Nitin Kulkarni","MBBS , Diploma in Otorhinolaryngology (DLO) , DNB (ENT) ENT/ Otolaryngologist","Radhika Dental Hospital 12-2-718/A/8, Nanal Nagar,Mehdipatnam, Landmark: Beside Olive Hospital, Hyderabad","9 yrs experience","+914011009284"));

        dbHandler.addDoctor(new Doctor("Hyderabad","ENT","Dr. Sampurna Ghosh","MS - ENT , MBBS , Training in Sinus Surgery ENT","Ambicare Clinics Plot No. 2-91-68,4th & 5th Floor, Harihara Arcade, Beside SBI, Gachibowli Miyapur Road, White Fields. Landmark: Opposite to Botanical Garden, Hyderabad","6 yrs experience","+9140009811249"));

        dbHandler.addDoctor(new Doctor("Hyderabad","ENT","Dr. Nitin Rai Vohra","MBBS , Diploma in Otorhinolaryngology (DLO)","Vohra ENT Care Centre 2-3-504/3/8, Govindula Complex, Main Road, Amberpet, Malakpet, Landmark: Beside Idea Show Room, Hyderabad","16 yrs experience","+914060112298"));

        dbHandler.addDoctor(new Doctor("Hyderabad","General physician","Dr. Prashant K Vaidya","MBBS,MD-General Medicine","Road No O1 Mig-194, Kphb . Landmark: Beside Sunflame Store, Hyderabad","10 yrs experience","+914033195734"));

        dbHandler.addDoctor(new Doctor("Hyderabad","General physician","Dr. Satish Erra","MBBS,MD,DM-General Medicine","18-78/1, road no 03 ,chaitanyapuri,, Near mc donalds, Hyderabad","13 yrs experience","+914033095534"));

        dbHandler.addDoctor(new Doctor("Hyderabad","General physician","Dr. Chetan Raj","MBBS,MD-General Medicine","lane opposite pantaloons, Begumpet 500016, Hyderabad","10 yrs experience","+914033195533"));

        dbHandler.addDoctor(new Doctor("Hyderabad","General physician","Dr. Ramana Rao N V","MD , DNB (General Medicine) , MRCP , CCT Internal Medicine","Revive Multi-Specialty Clinics & Fertility Centre Shop No.3, Plot No.8, Concrete Cornet, Serlingampally, Lingampally, Landmark: Nallagandla Huda Trade Centre, Hyderabad","19 yrs experience","+914067329836"));

        dbHandler.addDoctor(new Doctor("Hyderabad","General physician","Dr. Raghavendra Reddy","MD - Medicine , MBAHCS , PG Diploma In Clinical Cosmetology (PGDCC) , Fellow in Neuro","Oasis Health CareNo.13-18-163/5 GPAR Residency, Kamalanagar, Hyderabad","16 yrs experience","+914063317860"));

        dbHandler.addDoctor(new Doctor("Hyderabad","General physician","Dr. Neelima Reddy","MD-Internal Medicine (USA) , MBBS General physician","Ambicare Clinics Plot No. 2-91-68,4th & 5th Floor, Harihara Arcade, Beside SBI, Gachibowli Miyapur Road, White Fields. Landmark: Opposite to Botanical Garden, Hyderabad","18 yrs experience","+914331990879"));

        dbHandler.addDoctor(new Doctor("Hyderabad","General physician","Dr. Lily Rodrigues","MBBS , DNB (General Medicine)General physician","Surakshaka Multi-speciality and Diabetes Hospitals MIG 218, KPHB Main Road (NH 11), Landmark: Near R S Brothers, Hyderabad","29 yrs experience","+914088652231"));

        dbHandler.addDoctor(new Doctor("Hyderabad","General physician","Dr. Malini Soogoor","MD-Infectious Diseases (USA) , MD-Internal Medicine (USA) , MBBS","Ambicare Clinics Plot No. 2-91-68,4th & 5th Floor, Harihara Arcade, Beside SBI, Gachibowli Miyapur Road, White Fields. Landmark: Opposite to Botanical Garden, Hyderabad","25 yrs experience","+914030883520"));

        dbHandler.addDoctor(new Doctor("Hyderabad","General physician","Dr. M Sudhir","MBBS , MD - General Medicine , DNB (General Medicine) , DNB - Gastroenterology","Sudhir Clinic 3-2-240, Road between Manju Theatre And Taj Hotel, Patny, Secunderabad, Hyderabad","31 yrs experience","+911130803522 "));

        dbHandler.addDoctor(new Doctor("Hyderabad","General physician","Dr. Sandeep Ghanta","MBBS , MD - General Medicine , Diploma in Diabetology , Felloship in critical care , Fellowship in Rheumatology Internal Medicine , Consultant physician , Diabetologist","Innate The Clinic Bhavyas Srinivasam, Nizampet Road, Jntu Kukatpally, Landmark: Opposite Sangamitra School,Beside ICICI Bank, Hyderabad","38 yrs experience","+914066588499"));

        dbHandler.addDoctor(new Doctor("Hyderabad","General physician","Dr. V. S. Prasad","DM - Neurology , MD - Internal Medicine , MBBS","Prasad's Neuro Speciality Clinic Shop No 13, 1ST Floor, Sreeman Rama Towers, Beside Life Style, Opp Kalaniketan, Chaitanyapuri X Roads, CHAITANYAPURI, HYDERABAD - 500660, Hyderabad","24 yrs experience","+914033198708"));

        dbHandler.addDoctor(new Doctor("Hyderabad","General physician","Dr. Sandhya G","Diploma in Diabetology , M.H.Sc Diabetology , C.DIABETOLOGY , MBBS","Nanomedix Eye & Diabetic Care New Nagole- Kothapet Road, Near More Super Market, Landmark: Next to Genius Grammar School, Hyderabad","41 yrs experience","+914030883514"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Pediatrician","Dr. Prashant Ramesh Utage","MBBS , DNB (Pediatrics) , Fellowship in Pediatric Neurology","No.102, 1st Floor, Gurupartha Estate, Narayanaguda, Landmark: Near YMCA & Opp. Indian Oil Petrol Pump, Hyderabad","24 yrs experience","+919471484760"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Pediatrician","Dr. Navitha","Diploma in Child Health (DCH) , Fellowship in Neonatology , MBBS","Shop No.3, Plot No.8, Concrete Cornet, Serlingampally, Lingampally,Hyderabad","26 yrs experience","+9195312239001"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Pediatrician","Dr. Ch.S.R. Vara Prasad","MBBS , MD - Paediatrics","4-160, Malkajgiri, Landmark: Maruthi Nagar, Hyderabad","32 yrs experience","+918058651234"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Pediatrician","Dr. P.V. Ratnakar","MBBS , MD - Paediatrics , Diploma in Child Health (DCH)","MIG. 243, Road No. 4, KPHB Colony,Landmark: Near Remedy Hospital, Hyderabad","42 yrs experience","+918058431289"));

        dbHandler.addDoctor(new Doctor("Hyderabad","Pediatrician","Dr. K. Venkatapathi Raju","MBBS , Diploma in Child Health (DCH)","Venkatapathi Raju Clinic 8-3-318/6/13/B & A Jayaprakash Nagar,LM: Near SBI Bank, Hyderabad","33 yrs experience","+919087223091"));

    }

    void jaipur(){

        dbHandler.addDoctor(new Doctor("Jaipur","Cardiologist","Dr.Rudradev Pandey","MBBS,DM-Cardiology,MD-Internal Medicine","Eternal Heart Care Centre,Jagatpur,Jaipur","9 yrs experience","+918066085356"));

        dbHandler.addDoctor(new Doctor("Jaipur","Cardiologist","Dr.sunil Kumar","MBBS,MD-Cardiology","210,Padmavati Colony-B,Kings Road,Shyam Nagar,Jaipur","30 yrs experience","+918067417741"));

        dbHandler.addDoctor(new Doctor("Jaipur","Cardiologist","Dr.Vijay Pathak","MBBS,DM-Cardiology","Dr.Vijay Pathak Clinic,Govind Marg,Jaipur","25 yrs experience","+911130803855"));

        dbHandler.addDoctor(new Doctor("Jaipur","Cardiologist","Dr.S.C.Mathur","MBBS,MD-Cardiology","Dr.S.C Mathur Clinic,Malviya Nagar,Jaipur","28 yrs experience","+911130803855"));

        dbHandler.addDoctor(new Doctor("Jaipur","Cardiologist","Dr.Prashant Mahawar","MBBS,DM-Cardiology","Care Hospital,10-2-410/A/E,Road No 8,Pratap Nagar,Jaipur","8 yrs experience","+911130703869"));

        dbHandler.addDoctor(new Doctor("Jaipur","Cardiologist","Dr.Kapil Dhingra","MBBS,MD-Cardiology","6/147 SFS Mansarovar Agarwal Farm,Jaipur","24 yrs experience","+918033512222"));

        dbHandler.addDoctor(new Doctor("Jaipur","Cardiologist","Dr.Deepak Maheswari","MBBS,MD-Cardiology","Maheswari Health Clinic,48/103,Rajat Path,Jaipur","30 yrs experience","+918066085250"));

        dbHandler.addDoctor(new Doctor("Jaipur","Cardiologist","Dr.Nikhil Chowdhury","MBBS,DM-Cardiology,MD-Cardiology","Sector 28,Kumbha Marg,Jaipur","28 yrs experience","+911166107201"));

        dbHandler.addDoctor(new Doctor("Jaipur","Cardiologist","Dr.Amit Sharma","MBBS,DM-Cardiology,MD-Internal Medicine","A-8 Vinayak Enclave,Near Gyan Vihar University,Jaipur","35 yrs experience","+918077812336"));

        dbHandler.addDoctor(new Doctor("Jaipur","Cardiologist","Dr.Ravinder Singh Rao","MBBS,DM-Cardiology,MD-Internal Medicine","Heart & Vascular Clinic,Sirsi Road,Khatipura,Jaipur","18 yrs experience","+911166081238"));

        dbHandler.addDoctor(new Doctor("Jaipur","Cardiologist","Dr.S.K. Sarkar","MBBS,DM-Cardiology,MD-Cardiology","Dr.S.K.Sarkar Clinic,C24,Vaishali Marg,Jaipur-302021","48 yrs experience","+918907044510"));

        dbHandler.addDoctor(new Doctor("Jaipur","Cardiologist","Dr.Hariram Mahariya","MBBS,DM-Cardiology,MD","Jaipur Cardiology Centre,G-3 Anukampa Apartment,Modal Town,Jaipur","32 yrs experience","+918947031257"));

        dbHandler.addDoctor(new Doctor("Jaipur","Dentist","Dr.L.L.Mohan","BDS,MDS","G-3,Satya Road,Shastri Nagar,Jaipur","31 yrs experience","+918901187337"));

        dbHandler.addDoctor(new Doctor("Jaipur","Dentist","Dr.Neelima Maheswari","BDS,MDS","Maheswari Dental Clinic,48/103,Rajat Path","21 yrs experience","+918066087210"));

        dbHandler.addDoctor(new Doctor("Jaipur","Dentist","Dr.Shashank Gupta","BDS,MDS,FAGE","34,Kailashpuri,Tonk Road,Jaipur","27 yrs experience","+91951717788"));

        dbHandler.addDoctor(new Doctor("Jaipur","Dentist","Dr.Balvinder Singh","BDS,MDS","9,Gopinath Marg,New Colony,M.I.Road,Panchat Batti,Jaipur","23 yrs experience","+918044048779"));

        dbHandler.addDoctor(new Doctor("Jaipur","Dentist","Dr.Neelam Maheswari","BDS","34/409 Adarsh Nagar,Jaipur","21 yrs experience","+918901129984"));

        dbHandler.addDoctor(new Doctor("Jaipur","Dentist","Dr.Shiva Gupta","BDS,MDS","16,Hospital Road,Landmark:D-Schema,Jaipur","37 yrs experience","+919822103389"));

        dbHandler.addDoctor(new Doctor("Jaipur","Dentist","Dr.Anuroop Rai","BDS,MDS-Dental Surgen","Shiva Path Mansarovar,Jaipur","25 yrs experience","+918055512303"));

        dbHandler.addDoctor(new Doctor("Jaipur","Dentist","Dr.dinesh Kumar Gupta","BDS,MDS","Wisdom Dental Clinic,Raja Park Colony,Jaipur","40 yrs experience","+918033076123"));

        dbHandler.addDoctor(new Doctor("Jaipur","Dentist","Dr.Gaurav Gupta","BDS","G-9,Mahaveer Nagar,Near Deen Dayal Upadhyay Circle,Jaipur","39 yrs experience","+918067165261"));

        dbHandler.addDoctor(new Doctor("Jaipur","Dentist","Dr.Sushil Sharma","BDS","424,Sector1,Vidyadhar Nagar,Jaipur","41 yrs experience","+917067419953"));

        dbHandler.addDoctor(new Doctor("Jaipur","Dentist","Dr.Deepesh Prajapati","BDS,MDS","7,Jha 47,Jawahar Nagar,Landmark:Near MPS","23 yrs experience","+911166107202"));

        dbHandler.addDoctor(new Doctor("Jaipur","Dentist","Dr.Geetanjali Singh","BDS,MDS,Dental Surgen","D-79,Shanti Nagar,N.B.C Road,Jaipur","25 yrs experience","+917712003489"));

        dbHandler.addDoctor(new Doctor("Jaipur","ENT","Dr.Anita Bhandari","MBBS,MS(ENT)","KKR ENT Clinic,Malviya Nagar,Jaipur","12 yrs experience","+918066086250"));

        dbHandler.addDoctor(new Doctor("Jaipur","ENT","Dr.Neeraj Kashliwal","MBBS,MS(ENT),DNB(ENT)","B-6 F,Adinath Marg,C Scheme Jaipur","26 yrs experience","+918067417784"));

        dbHandler.addDoctor(new Doctor("Jaipur","ENT","Dr.Rishabh Jain","MBBS,MS(ENT)","377,Gopalpura Bypass Road,Gopal Nagar,Jaipur","28 yrs experience","+918066086265"));

        dbHandler.addDoctor(new Doctor("Jaipur","ENT","DrGopal Sharma.","MBBS,MS(ENT),DNB(ENT)","Plot No 1313,Sector 11,Malviya Nagar,Jaipur","29 yrs experience","+911130903921"));

        dbHandler.addDoctor(new Doctor("Jaipur","ENT","Dr.Raj Kumar Garg","MBBS,MS(ENT),Diploma in ENT","22/12/1,Swarna Path,Mansarovar,Jaipur","41 yrs experience","+918067427793"));

        dbHandler.addDoctor(new Doctor("Jaipur","ENT","Dr.Prakash Mishra","MBBS,MS(ENT)","Apollo Spectra Hospital,Mahaveer Marg,Jaipur","39 yrs experience","+918066085256"));

        dbHandler.addDoctor(new Doctor("Jaipur","ENT","Dr.Poonam Goyal","MBBS,MS(ENT)","377,Gopalpurna Bypass Rd,Jaipur","22 yrs experience","+918067085265"));

        dbHandler.addDoctor(new Doctor("Jaipur","ENT","Dr.Sudeep Jain","MBBS,MS(ENT),DNB(ENT)","Deep ENT Hospital,Sitara,E 2,Roop Vihar Colony,Sodala,Jaipur","20 yrs experience","+918033512302"));

        dbHandler.addDoctor(new Doctor("Jaipur","ENT","Dr.Prakash Golcha","MBBS,MS(ENT),Diploma in ENT","ENT & Dental Clinic,50,Devi Path,Takhteshahi Road,Adarsh Nagar,Jaipur","46 yrs experience","+918033512244"));

        dbHandler.addDoctor(new Doctor("Jaipur","ENT","Dr.Satish Jain","MBBS,MS(ENT),FRHS","23-24,Satya Nagar Colony,Near Pankaj Vihar,Jaipur","28 yrs experience","+911130773966"));

        dbHandler.addDoctor(new Doctor("Jaipur","ENT","Dr.Sanjay Agarwal","MBBS,MS(ENT)","Apollo Spectra Hospital,H-2/37,Mahaveer Marg,E-Scheme,Jaipur","26 yrs experience","+918066086146"));

        dbHandler.addDoctor(new Doctor("Jaipur","ENT","Dr.Badri Lal Sharma","MBBS,MS(ENT),F.R.H.S(USA),DNB(ENT)","377,Kumbhapura Bypass Road,Pratap Nagar,Near Joy Health Club","30 yrs experience","+918033075285"));

        dbHandler.addDoctor(new Doctor("Jaipur","General physician","Dr. Chetan Sharma","MBBS,MD-General Medicine,DM","D-5,Kumbha Marg,Satya Road,Jaipur","20 yrs experience","+918946931776"));

        dbHandler.addDoctor(new Doctor("Jaipur","General physician","Dr. Jolly Arora","MBBS,MCCEE,MD-General Medicine,","B-(D) Govind Marg,Adarsh Nagar,Jaipur","34 yrs experience","+918055985271"));

        dbHandler.addDoctor(new Doctor("Jaipur","General physician","Dr. Vikash Mittal","MBBS,MD-General Medicine","Carewell Family Clinic,New Sanganer Road,Sodala,Jaipur","31 yrs experience","+918677011276"));

        dbHandler.addDoctor(new Doctor("Jaipur","General physician","Dr. Kusum Gupta","MBBS,MD-General Medicine,DM","B-97,Rajendra Marg,Jaipur","41 yrs experience","+918033512244"));

        dbHandler.addDoctor(new Doctor("Jaipur","General physician","Dr.Sunil Jain ","MBBS,MD- Medicine,DM","210,Padmavati Colony,G-Kings Road,nirman Nagar,Jaipur","30 yrs experience","+918067417762"));

        dbHandler.addDoctor(new Doctor("Jaipur","General physician","Dr. Sandeep Gupta ","MBBS,MD-General Medicine,DM,DNB(General Surgery)","11 G,Olive Homes,Muhana Mandi Road,Near Keshar Nagar circle,Jaipur","21 yrs experience","+918065087250"));

        dbHandler.addDoctor(new Doctor("Jaipur","General physician","Dr. Deepak Yaduvanshi","MBBS,MD,DNB,FCCM","Asthma Centre,Flat No 117,Type 3,AWS Gad,Gandhi Nagar,Jaipur","39 yrs experience","+918045075230"));

        dbHandler.addDoctor(new Doctor("Jaipur","General physician","Dr. Naval Kishore Sharma ","BSc,MBBS,MD-Critical Care Medicine","S-81,Shanti Nagar,Ashok Nagar,Jaipur","38 yrs experience","+918032612277"));

        dbHandler.addDoctor(new Doctor("Jaipur","General physician","Dr. A.K.Johar ","MBBS,MD-Medicine,B.U.M.S,D.H.M","1,Kha 24,Housing Broad,Ram Nagar 9,Shashtri Nagar,Jaipur","18 yrs experience","+911189003480"));

        dbHandler.addDoctor(new Doctor("Jaipur","General physician","Dr. S.G.Agarwal","MBBS,MD-Internal Medicine","Hathi Babu Ka Bagh,Bani Park,Jaipur","44 yrs experience","+918067218740"));

        dbHandler.addDoctor(new Doctor("Jaipur","General physician","Dr. D.D.Gupta","MBBS,MD- Medicine","J-2/35,Mahaveer Marg,H-Scheme,Jaipur","36 yrs experience","+918011055356"));

        dbHandler.addDoctor(new Doctor("Jaipur","General physician","Dr. Tripti Shah","MBBS,MD-Internal Medicine,DM","Unique Shardool,LG-2,Chetak Marg,Adarsh Nagar,Jaipur","28 yrs experience","+918088514420"));


        dbHandler.addDoctor(new Doctor("Jaipur","Gynecologist","Dr.Renuka Arora","MBBS,MS-Gynecology","DR. JOLLY ARORAB-9(D)Govind Marg, Adarsh Nagar, Landmark : On Main Road Govind Marg, Jaipur","17 yrs experience","+918058665100"));

        dbHandler.addDoctor(new Doctor("Jaipur","Gynecologist","Dr.Kusum Gupta","MBBS , MS - Obstetrics and Gynaecology","Dr.Kusum Gupta B-97, Rajendra Marg. Landmark: Near Janta Store Circle, Jaipur","32 yrs experience","+919051239980"));

        dbHandler.addDoctor(new Doctor("Jaipur","Gynecologist","Dr. Aasha Sharma","MBBS , MS - Obstetrics and Gynaecology","Dr Aasha Sharma Clinic Plot No. B 19 A, Nandpuri Marg, Hawa Sadak, Sodala, Landmark: 22 Godam, Jaipur","24 yrs experience","+917789001238"));

        dbHandler.addDoctor(new Doctor("Jaipur","Gynecologist","Dr. Poonam Upadhaya","MBBS,MS-Gynecology","47/164, Kiran Path, Mansarovar, Landmark: Near Overhead Tank, Jaipur","36 yrs experience","+918947900516"));

        dbHandler.addDoctor(new Doctor("Jaipur","Gynecologist","Dr.Savita Bansal","MBBS,MS-Gynecology,DM","Masarovar, Street no 8,Jaipur","26 yrs experience","+918941231235"));

        dbHandler.addDoctor(new Doctor("Jaipur","Ophthalmologist","Dr. J. P. Kabra","MBBS , MS - Ophthalmology","J. P. Eye Hospital B-14, Lal Kothi Shopping Centre, Tonk Road, Landmark: Behind Times of India Office, Jaipur","42 yrs experience","+918167407780"));

        dbHandler.addDoctor(new Doctor("Jaipur","Ophthalmologist","Dr. Mukesh Sharma","MBBS , MS - Ophthalmology","Dr. Mukesh Sharma Clinic, Jaipur Plot Number- 82, Gopalpura Bypass, Jaipur - 302018, Jaipur","41 yrs experience","+918060112098"));

        dbHandler.addDoctor(new Doctor("Jaipur","Ophthalmologist","Dr. Rajesh Goyal","MBBS , MS - Ophthalmology","Dr. Rajesh Goyal Clinic 21/278, MLA Quaters, Madhyam Marg. Landmark: Near Kaveri Path, Jaipur","17 yrs experience","+918690119840"));

        dbHandler.addDoctor(new Doctor("Jaipur","Ophthalmologist","Dr. Virendra Agrawal","MBBS , DNB Ophthalmology , MS - Ophthalmology","Dr. Virendra Laser, Phaco Surgery Center Tonk Road. Landmark: Behind Mahindra Ford Showroom, Jaipur","yrs experience","+919561220967"));

        dbHandler.addDoctor(new Doctor("Jaipur","Ophthalmologist","Dr. Shirish Batra","MS - Ophthalmology , MBBS","Shivam Eye & Mother Care A-2 Mathur Vaishya Nagar,Near Ram Mandir ,Sitabari,Tonk Road,Jaipur, Jaipur","34 yrs experience","+917789120034"));

        dbHandler.addDoctor(new Doctor("Jaipur","Orthopedist","Dr. Purnima Patni","MBBS , MS - Orthopaedics,Orthopedic Surgeon","J-2/37, Pratap Marg, H-Scheme, Landmark : Opposite Jai Club, Jaipur","36 yrs experience","+919809127649"));

        dbHandler.addDoctor(new Doctor("Jaipur","Orthopedist","Dr. Naveen Sharma","MBBS , MS - Orthopaedics,Joint replacement & Sports medicine fellowship , DNB orthopaecdics , arthroscopy fellowship from S. Korea , MS - Orthopaedics , Fellowship in Joint Replacement Orthopedist , Orthopedic Surgeon , Joint Replacement Surgeon , Total Joint Surgeon","Mewar Hospital A-175,Haribhau Upadhyay Nagar,Nr.Glitz cinema,Ajmer, Jaipur","31 yrs experience","+919050324456"));

        dbHandler.addDoctor(new Doctor("Jaipur","Orthopedist","Dr. Narendra Joshi","MBBS , MS - Orthopaedics","Dr. Narendra Joshi Clinic, Jaipur 164, Jaipur Gpo, Heera Nagar, Landmark: Near Bank Of Baroda, Jaipur","23 yrs experience","+917611099780"));

        dbHandler.addDoctor(new Doctor("Jaipur","Orthopedist","Dr. Siddharth Sharma","MBBS , MS - Orthopaedics, Fellowship in Sports Medicine , Fellowship in Shoulder and Elbow Orthopedic Surgeon ","SMS Medical College and Hospital Jawaharlal Nagar Marg, Jaipur","14 yrs experience","+914460991287"));

        dbHandler.addDoctor(new Doctor("Jaipur","Orthopedist","Dr. Naresh Prakash","MBBS , MS - Orthopaedics,FRCS","J-3/35, Shastri Marg, G-Scheme, Landmark : Opposite Jai Club, Jaipur","43 yrs experience","+917789479012"));

        dbHandler.addDoctor(new Doctor("Jaipur","Pediatrician","Dr. Mohit Poddar","MBBS , MD - Paediatrics , Diploma in Allergy and clinical Immunology","Poddar Clinic And Diagnostic Centre 3510AB, Langar Ke Balaji Ka Rasta,, Gangori Bazar, Chandpole Bazar. Landmark: Behind Nahargarh Road Police Station, Jaipur","18 yrs experience","+918870993476"));

        dbHandler.addDoctor(new Doctor("Jaipur","Pediatrician","Dr. A. K Shukla","MBBS , MS - Surgery , M Ch - Pediatric Surgery","Dr. A. K. Shukla G-8, Unique Shardul Appartment, 14, Chetak Marg, Adarsh Nagar, Landmark: Near J K Lone Hospital, Jaipur","21 yrs experience","+919091505567"));

        dbHandler.addDoctor(new Doctor("Jaipur","Pediatrician","Dr. Dhananjay Mangal","MBBS , MD -Pediatrics","Babylon Children's Hospital 311, Adarsh Nagar, Landmark: Near Seva Sadan, Jaipur","32 yrs experience","+917709238875"));

        dbHandler.addDoctor(new Doctor("Jaipur","Pediatrician","Dr. Rajiv Jain","MBBS , MD - Paediatrics","plot no:55, jaidevan colony-3,opp:world trade park,JLN road-jaipur-320018, Jaipur","15 yrs experience","+919590503346"));

        dbHandler.addDoctor(new Doctor("Jaipur","Pediatrician","Dr. M. D. Sharma","MBBS , MD - Paediatrics","M. D. D. Hospital E-13, Bank Colony, Murlipura, Landmark: Near Kedia Circle, Jaipur","27 yrs experience","+918048332098"));

    }

    void kolkata(){

        dbHandler.addDoctor(new Doctor("Kolkata","Cardiologist","Dr. Ranjan Kumar Sharma","MBBS , DNB (Cardiology) , MD - General Medicine","108/1B ,Beliaghata Main Road. Landmark: Near ID Hospital, Kolkata","28 yrs experience","+91333099 2186"));

        dbHandler.addDoctor(new Doctor("Kolkata","Cardiologist","Subhasis Roy Chowdhury","MBBS , MD MEDICINE , DM - Cardiology","JC-16-17, Sai Sport Complex, Saltlake Stadium, Landmark: Opposite Gate-3, Kolkata","8 yrs experience","+913330566365"));

        dbHandler.addDoctor(new Doctor("Kolkata","Cardiologist","Dr.Soumya Patra","MBBS , MD - Paediatrics , DM - Cardiology , FACC","58, Canal Circular Road, Kadapara, Salt Lake, Kolkata","5 yrs experience","+913330566365"));

        dbHandler.addDoctor(new Doctor("Kolkata","Cardiologist","Dr.D. Konar","MBBS , DMRT , MD-Internal Medicine","4, Kalikinkar Roy Road, Barisha, Landmark: Silpara, Kolkata","31 yrs experience","+913330859001"));

        dbHandler.addDoctor(new Doctor("Kolkata","Cardiologist","Dr.Kuntal Bhattacharya","DM - Cardiology , MD - Medicine , MBBS","124, Eastern Metropolitan Bypass, Mukundapur, Kolkata, West Bengal 700099, Kolkata","8 yrs experience","+913330566366 "));

        dbHandler.addDoctor(new Doctor("Kolkata","Dentist","Dr.Anupreet Kaur Choudhury","BDS , MDS-Oral Medicine and Radiology","AG-264, Green Valley Apartments, Majherpara","17 yrs experience","+913330566366"));

        dbHandler.addDoctor(new Doctor("Kolkata","Dentist","Rohini Gupta","BDS , MDS - Conservative Dentistry & Endodontics","Shop No. 88, 1St Floor, Ae Block Market, Sector 1. Landmark","6 yrs experience","+913330566365"));

        dbHandler.addDoctor(new Doctor("Kolkata","Dentist","Dr. Rahul Sepany"," Rahul Sepany","126, Block A, Lake Town, Landmark: Near Water Tank, Kolkata","6 yrs experience","+913330859001"));

        dbHandler.addDoctor(new Doctor("Kolkata","Dentist","Dr.Dilip Purohit","BDS"," Ho Chi Min Sarani, 1st floor, Harrington Nursing Home Compound, Middle Town Row.","6 yrs experience","+913330566356"));

        dbHandler.addDoctor(new Doctor("Kolkata","Dentist","Dr.B.K. Biswas","BDS , MDS - Oral & Maxillofacial Surgery , ph D","PP Complex,310, Canal Street, Kazi Nazrul Islam Avenue, Lake Town","29 yrs experience","+913330859001"));

        dbHandler.addDoctor(new Doctor("Kolkata","ENT","Dr.Dev Roy","FRCS (ORL-HNS) , FRCS (ENT) , MS - ENT , Diploma in Otorhinolaryngology (DLO) , MBBS , European Board Certified in facial Plastic and Reconstructive surgery","AE -611, Kwality Bus Stop , Tank No. 4, Landmark - Kwality More, Kolkata","25 yrs experience","+93330566367"));

        dbHandler.addDoctor(new Doctor("Kolkata","ENT","Dr. Prof. Indranath Kundu","MBBS, MS - ENT, DNB (ENT)","P 51/1, Cit Road,3a Bus Stand,Landmark: Opposite Nasta Galli-54, Kolkata","28 yrs experience","+913330566367"));

        dbHandler.addDoctor(new Doctor("Kolkata","ENT","Tushar Kanti Ghosh","MBBS , MS - ENT","FE-350, Sec-3; Landmark - Near 12 No Tank & Gd Market, Kolkata","15 yrs experience","+913330992101"));

        dbHandler.addDoctor(new Doctor("Kolkata","ENT","Dr. Prasanta Ghosh","MBBS , MS - ENT","58/7, Birati. Landmark:Near Uttarayan School, Kolkata","37 yrs experience","+913330859001"));

        dbHandler.addDoctor(new Doctor("Kolkata","ENT","Dr. Subir Haldar","MBBS , MS - ENT"," Desh Bandhu Nagar, Baguiati, Kolkata","21 yrs experience","+913330859002"));

        dbHandler.addDoctor(new Doctor("Kolkata","General physician","Dr.Tanoy Bose","MBBS , MD - Internal Medicine , Diploma in echocardiography","Garia,Mahamayatalaya. Landmark: Beside Mahamayatala Petrol Pump","12 yrs experience","+913330859002"));

        dbHandler.addDoctor(new Doctor("Kolkata","General physician","Dr. D. Konar","MBBS , DMRT , MD-Internal Medicine","4, Kalikinkar Roy Road, Barisha, Landmark: Silpara, Kolkata","31 yrs experience","+913330859001"));

        dbHandler.addDoctor(new Doctor("Kolkata","General physician","Dr. Anirban Chakraborty","MBBS , MRCP (London) , MRCPS (Glasgow) , CCT (UK) , FACE (USA) , FRCP (Glasgow)","124, Eastern Metropolitan Bypass, Mukundapur, Kolkata, Kolkata","16 yrs experience","+913330566366 "));

        dbHandler.addDoctor(new Doctor("Kolkata","General physician","Dr.Kaniska Sarkar","MBBS , MD - General Medicine , CCG","44 A, Deshapriya Park, Sarat Banerjee Road. Landmark: Opp. No. 466 Telephone Exchange, Kolkata","34 yrs experience","+913330992044"));

        dbHandler.addDoctor(new Doctor("Kolkata","General physician","Dr.Minakshi Dutta","MBBS","113/4, Opposite Of Hazra Market, Hazra Road, Kalighat,LM- NEAR JAATIN DAS METRO STN, KOLKATA -26, Kolkata","42 yrs experience","+913330859002"));

        dbHandler.addDoctor(new Doctor("Kolkata","Gynecologist","Dr.Papia Dutta","MBBS,DGO","C K 123, No 9, Sector 2, Salt Lake City,Landmark:Near Water Tank, Kolkata","25 yrs experience","+913330992082"));

        dbHandler.addDoctor(new Doctor("Kolkata","Gynecologist","Dr. Sankar Das Mahapatra","MS - Obstetrics and Gynaecology , MBBS , Fellowship in Minimal Access Surgery","Kanchanjangha Apartment, Tegharia Main Road, Baguihati, Landmark: Near to Uma Medicals, Kolkata","25 yrs experience","+913330566367"));

        dbHandler.addDoctor(new Doctor("Kolkata","Gynecologist","Dr.Rajeev Agarwal","MBBS , MD - Obstetrics & Gynaecology","88B, Sarat Bose Road, Ritchie Park, Kolkata","17 yrs experience","+913330859001"));

        dbHandler.addDoctor(new Doctor("Kolkata","Gynecologist","Dr.Anindita Chakraborty","MBBS , MS - Obstetrics and Gynaecology , DGO","DD-6, Salt Lake City, Kolkata","11 yrs experience","+913330992202"));

        dbHandler.addDoctor(new Doctor("Kolkata","Gynecologist","Dr.Arnab Mondal","MBBS , MS(Gynae & Obs) , F.M.A.S , Diploma in Pelvic Endoscopy(Germany)","AH-192, Sector 2, Saltlake; Landmark - Near Water Tank No 7, Kolkata","15 yrs experience","+913330859001"));

        dbHandler.addDoctor(new Doctor("Kolkata","Ophthalmologist","Dr. B.K.Lohia"," MBBS , MS - Ophthalmology","282, Canal Street, Sreebhumi, Kolkata,Landmark: Near dafodil hospitals, Kolkata","38 yrs experience","+913330859001"));

        dbHandler.addDoctor(new Doctor("Kolkata","Ophthalmologist","Subhasis Roy Chowdhury","MBBS , M.S Ophthalmology","11,Shakespeare Sarani, Kolkata - 700071, Kolkata ","21 yrs experience","+913330566365"));

        dbHandler.addDoctor(new Doctor("Kolkata","Ophthalmologist","Dr.Rajani Saraf","MBBS ","4/B, Little Russell Street, Landmark: Near Metro Plaza Shopping mall, Kolkata","26 yrs experience","+913330859001"));

        dbHandler.addDoctor(new Doctor("Kolkata","Ophthalmologist","Vineet Agarwal","MBBS , DNB Ophthalmology , Fellowship in Advanced Cataract Surgery","Baguiati Rd, Desh Bandhu Nagar; Landmark : Near AC Market, Kolkata","6 yrs experience","+913330566364"));

        dbHandler.addDoctor(new Doctor("Kolkata","Ophthalmologist","Dr.Sagir Asad","DM - Cardiology , MD - Medicine , MBBS","3, Lenin Sarani Rd, Dharamtala, Kolkata, West Bengal 700013, Kolkata","30 yrs experience","+913330566367 "));

        dbHandler.addDoctor(new Doctor("Kolkata","Orthopedist","Dr.Amitava Mukherjee","MBBS , MS - Orthopaedics , M.Ch , Ph.d , M.Sc - Ortho , Diploma in Orthopaedics","Joramandir, Baguiati, B1/1, Rajarhat Road. Landmark: Near HDFC bank, Kolkata","24 yrs experience","+91333056 6367"));

        dbHandler.addDoctor(new Doctor("Kolkata","Orthopedist","Dr.Kanchan Bhattacharya","MBBS , Diploma in Orthopaedics , DNB (Orthopedics)","1D, Diamond Harbour Road, Behala Tram Depot, Kolkata","26 yrs experience","+913330566366"));

        dbHandler.addDoctor(new Doctor("Kolkata","Orthopedist","Gautam Das","MD - Anaesthesiology , FIPP","92/2 A, Concord Tower, 2ND Floor, Beside Coal India Rohini, Bidhan Nagar Road, Ultadanga, Kolkata - 700067","22 yrs experience","+913330859002"));

        dbHandler.addDoctor(new Doctor("Kolkata","Orthopedist","Humayun Ali Shah","MBBS , MS - General Surgery , M.Ch - Orthopaedics","Apex General Hospital , Baguihati, Kolkata VIP Road, Baguihati. Landmark: Near Joramandir Bus Stop, Kolkata, Kolkata","26 yrs experience","+913330566365"));

        dbHandler.addDoctor(new Doctor("Kolkata","Orthopedist","Dr.Anita B","Kamal Sinha","P 4/5, Scheme L 11, Block A, Amri Hospital, Gariahat Road,Landmark: Beside Dhakuria Bridge, Kolkata","26 yrs experience","+913330992143"));

        dbHandler.addDoctor(new Doctor("Kolkata","Pediatrician","Dr.Prakash Chandra Chaudhary","MBBS , Diploma in Child Health (DCH)","281, S K Deb Road, Sree Bhumi,Lake Town, Landmark: Near Mansa Mandir, Kolkata","36 yrs experience","+913330992287"));

        dbHandler.addDoctor(new Doctor("Kolkata","Pediatrician","Abhijit Rakhit","MBBS , Diploma in Child Health (DCH)","SD-2, Phase I, Golf Green. Landmark: Beside Duradarshan Bhavan, Kolkata","33 yrs experience","+913330859002"));

        dbHandler.addDoctor(new Doctor("Kolkata","Pediatrician","Dr.Abhijit Sarkar","MBBS , MRCPCH(UK) , Member of the Royal College of Paediatrics and Child Health (MRCPCH, London, Glasgow or Edinburgh)","AD 145, Sector-1, Salt lake city; Lake; Landmark - Near Eastern Furniture, Kolkata","21 yrs experience","+913330566365"));

        dbHandler.addDoctor(new Doctor("Kolkata","Pediatrician","Dr.Sandipan Saha","MBBS,MD-Pediatrics","Aa 122, Sector 1, Salt Lake, Landmark: Near Pnb Island Opposite Laban Hrad Sanbad, Kolkata","8 yrs experience","+913330566356"));

        dbHandler.addDoctor(new Doctor("Kolkata","Pediatrician","Dr.Ajit Kumar Verma","MBBS , Diploma in Child Health (DCH)","Shop #F20, NBCC Shoping Center, Landmark: Near New Town Bus Stand, Kolkata","36 yrs experience","+913330566356"));

    }

    void mumbai(){

        dbHandler.addDoctor(new Doctor("Mumbai","Cardiologist","Dr. Alpa Dawda","MD - General Medicine , BHMS , Diploma in Trichology","Smruti Mandir, Valji Ladha Road, Land Mark-Opposite Hira Mongi Hospital, Mulund(W), Mumbai-80,","11 yrs experience","+912233956964"));

        dbHandler.addDoctor(new Doctor("Mumbai","Cardiologist","Nandkumar Chonkar","MD - Medicine , DM - Cardiology , MBBS","185-Alhad,Above Corporation Bank, Opp.Kalidas Natya Ghruh, P.K.Road, Mulund(W.), Mumbai-400080","27 yrs experience","+912239647356"));

        dbHandler.addDoctor(new Doctor("Mumbai","Cardiologist","Dr.Ashish Agrawal","MBBS , MD - Medicine , DM - Cardiology","P.K. Road, Mulund West, Landmark: Opposite Kalidas Natya Mandir & Opposite Municipal Sports Complex, Mumbai","11 yrs experience","+912239528689"));

        dbHandler.addDoctor(new Doctor("Mumbai","Cardiologist","Dr.D. Konar","MBBS , DMRT , MD-Internal Medicine","4, Kalikinkar Roy Road, Barisha, Landmark: Silpara, Kolkata","31 yrs experience","+913330859001"));

        dbHandler.addDoctor(new Doctor("Mumbai","Cardiologist","Dr.Laxman G. Jonwal","DM - Cardiology , MD - Medicine , MBBS","Shop-13, Satyam Vasant Complex, Gate No 1, Mahavir Nagar, Link Road Signal, Landmark: Beside Kalpruksh, Kandivali West, Mumbai","28 yrs experience","+912239528745"));

        dbHandler.addDoctor(new Doctor("Mumbai","Dentist","Jyoti Narla","BDS , MDS - Periodontology and Oral Implantology","shop no 11,12 upper ground floor, lake homes shopping, chandivali road, powai, Mumbai,","12 yrs experience","+912233956982"));

        dbHandler.addDoctor(new Doctor("Mumbai","Dentist","Monica Kapoor","FCC (Germany) , PGD in face &skin cosmetology , diploma in oral and dental surgery. , Diploma in Trichology - Cosmetology , certification in oral and maxillofacial surgery. , PG Diploma In Clinical Cosmetology (PGDCC) , PGDMLS , MBAHCS","flawless clinic ( soon cosmetic club)#308, Morya Estate, 3rd Floor, opposite infiniti mall, New Link Road, Andheri West. Landmark:, Mumbai","16 yrs experience","+91223395 6979"));

        dbHandler.addDoctor(new Doctor("Mumbai","Dentist","Dr.Anand Narla","BDS , MDS - Orthodontics & Dentofacial Orthopaedics","Lake Homes Branch - 12, First Floor, Lake Primrose Shopping,Landmark: Opposite to Bookers, Mumbai","17 yrs experience","+912233956982"));

        dbHandler.addDoctor(new Doctor("Mumbai","Dentist","Dr.Jayanto Mukherji","BDS","Office No. C/6, Amul Commercial Complex, Chembur, Landmark: Opposite BMC Ward Office, Mumbai","27 yrs experience","+912267978038"));

        dbHandler.addDoctor(new Doctor("Mumbai","Dentist","Dr.Radhesh Rao","BDS , Post-Graduate Certificate in Oral Implantology","Shop no 6,Landmark CHS,kadam wadi,vakola santacruz east, Mumbai","14 yrs experience","+912233956971"));

        dbHandler.addDoctor(new Doctor("Mumbai","ENT","Dr.Sonali Pandit","","MBBS , MS - ENT , MS (Hearing Research)","25 yrs experience","+91 022 3964 7304"));

        dbHandler.addDoctor(new Doctor("Mumbai","ENT","Dr. Dipak L. Desai","MBBS , MS - ENT , Diploma in Oto-Rhino-Laryngology (D.O.R.L)","Shop No 4, Ganesh Talkies Building, Sane Guruji Marg, Lalbaug. Landmark: Near Ganesh Talkies, Mumbai","28 yrs experience","+912239647361"));

        dbHandler.addDoctor(new Doctor("Mumbai","ENT","Suresh Poojary","MBBS , MS - ENT , DNB (ENT)","18th Road, Landmark: Near Ambedkar Garden & Opposite Bharat Bank, Mumbai","15 yrs experience","+912239528759"));

        dbHandler.addDoctor(new Doctor("Mumbai","ENT","Dr. Meenesh Juvekar","MBBS , MS - ENT","58/7, Birati. Landmark:Near Uttarayan School, Kolkata","37 yrs experience","+912233956978"));

        dbHandler.addDoctor(new Doctor("Mumbai","ENT","Dr. Nishit Shah","MS - ENT , DNB (ENT) , Diploma in Oto-Rhino-Laryngology (D.O.R.L)"," India House No : 2, 2nd Floor, Kemp's Corner, Landmark: Opp. Om Chambers, Mumbai","28 yrs experience","+912230859002"));

        dbHandler.addDoctor(new Doctor("Mumbai","General physician","Dr.Bhavesh Acharya","BHMS , MD , D.M.L.THomeopathic Doctor","103, Gokul Regency, Above Cafe Coffee Day, Next to Canara Bank, Andheri East, Landmark: J.B. Nagar Circle near J.B. Nagar (Chakala) Metro Station, Mumbai","16 yrs experience","+912239528610"));

        dbHandler.addDoctor(new Doctor("Mumbai","General physician","Dr. Indu Bubna","MBBS , MD - Pulmonary Medicine","Shop No 8, Nishith Bldg, Ushma Nagar Society, Evershine Nagar, Malad West, Landmark: Near Old Ryan International School, Mumba","8 yrs experience","+912230293134"));

        dbHandler.addDoctor(new Doctor("Mumbai","General physician","Dr. Shailaja Sabnis","MBBS , MD - General Medicine","Mahakali Caves Road, Andheri East, Landmark: Near Canossa High School, Mumbai","22 yrs experience","+912230293027 "));

        dbHandler.addDoctor(new Doctor("Mumbai","General physician","Dr.Neeraj Kumar Tulara","MBBS , MD - General Medicine , Post Graduate Diploma in Infectious Disease","114, Dr L H Hiranandani Hospital, 1st Floor, Hill Side Avenue, Powai, Landmark: Hiranandani Gardens, Mumbai","11 yrs experience","+912239528746"));

        dbHandler.addDoctor(new Doctor("Mumbai","General physician","Dr.Shailesh Jain","MBBS , MD","Grant Road West, Tardeo, Landmark : Near Mathru Mandir, Mumbai","42 yrs experience","+912239528689"));

        dbHandler.addDoctor(new Doctor("Mumbai","Gynecologist","Dr. Saloni Suchak","MBBS , MD - Medicine , DM - Gastroenterology , MNAMS ","Suchak Hospital, 186, Manchubhai Road, Malad East ,Landmark:Opposite Hotel Manali, Mumbai","11 yrs experience","+912239528695"));

        dbHandler.addDoctor(new Doctor("Mumbai","Gynecologist","Dr.Mohini Vachhani","FRCOG (LONDON) (Fellow of Royal College of Obstetricians and Gynaecologists) , MRCOG , MD - Obstetrics & Gynaecology , DGO",", Vinayak Chambers, 4th Road, Khar West, Landmark: Near Kabutarkhana & Opp Amor Building & Above Corporation Bank & Near Khar West Station, Mumbai","36 yrs experience","+91022 3357 8344"));

        dbHandler.addDoctor(new Doctor("Mumbai","Gynecologist","Dr.Hemlata Hardasani","MBBS , DGO , Diploma in Laproscopy","G1, 28, New Parijat, Azad Nagar 2, Veera Desai Road,Landmark: Near Axis Bank, Mumbai","17 yrs experience","+912239528771"));

        dbHandler.addDoctor(new Doctor("Mumbai","Gynecologist","Dr. Alpa Dawda","MD - General Medicine , BHMS , Diploma in Trichology","Shop #9, Smruti Mandir, Valji Ladha Road, Land Mark-Opposite Hira Mongi Hospital, Mulund(W), Mumbai-80, Mumbai","27 yrs experience","+912233956964"));

        dbHandler.addDoctor(new Doctor("Mumbai","Gynecologist","Dr.Sargam Soni","MBBS , TDD , DGO","1st Floor, Sai Niketan CHS, Saibaba Nagar, Borivali West Mumbai , Opposite Saibaba Temple, Mumbai, Mumbai","11 yrs experience","+912233956983"));

        dbHandler.addDoctor(new Doctor("Mumbai","Ophthalmologst","Dr. Yogesh Bhadange"," MBBS , MD - Ophthalmology , Specialist’s Exam: Cornea fellowship , ICO Clinical Sciences Examination , FRCS (Part 2A) , ICO Advanced (FICO) Examination , ICLEP (Contact lens training program)","Off Near Krishna Vatika Mandir, Sai Rd, Mumbai","8 yrs experience","+912233956980"));

        dbHandler.addDoctor(new Doctor("Mumbai","Ophthalmologst","Dr. Smita Mukherjee","MBBS , MS - Ophthalmology , DOMS , DNB Ophthalmology","302, Center Point Premises, CHS Ltd; 18th Road, Near Ambedkar Udyan, Chembur,Mumbai - 400071, Mumba","25 yrs experience","+912233578466"));

        dbHandler.addDoctor(new Doctor("Mumbai","Ophthalmologst","Dr.Abhijeet Desai","MBBS , MS - Ophthalmology , DNB Ophthalmology , FRCS , DOMS , MNAMS (Membership of the National Academy) (General Surgery) ","Ground floor, Matcornel Heights, Marian colony, Borivali west, Landmark: Near Mari Immaculate high school, Mumbai","17 yrs experience","+912233956984"));

        dbHandler.addDoctor(new Doctor("Mumbai","Ophthalmologst","Dr. Ritesh Sanghvi","MBBS , DNB Ophthalmology , MNAMS (Membership of the National Academy) (Ophthalmology) , F.I.C.O","17, Bahar bldg no 3,s v road, Shanti Nagar, Dahisar East, Landmark: Near Canara Bank,Mumbai 400068, Mumbai","16 yrs experience","+912233956979"));

        dbHandler.addDoctor(new Doctor("Mumbai","Ophthalmologst","Dr.Sunil S. Jain","F.L.V.P.E.I , D.N.B Ophthalmology , MNAMS Ophthamology , F.C.P.S Ophthalmology , D.O , DOMS , MBBS.,/77", "Pankaj Mansion. Ground Floor. Behind Japanese Buddhist Temple. Next to Podar Hospital signal, 8, Dr Annie Besant Rd, Worli, Mumbai, Maharashtra 400018, Mumbai","19 yrs experience","+912233956978 "));

        dbHandler.addDoctor(new Doctor("Mumbai","Orthopedist","Dr.Shreedhar Archik","MBBS , MS - Orthopaedics , M.Sc - Ortho","4, Shankar Niwas, Dadasaheb Rege Marg, Landmark: Opp. Shiv Sena Bhavan, Mumbai","21 yrs experience","+912230018533"));

        dbHandler.addDoctor(new Doctor("Mumbai","Orthopedist","Dr. Neeraj R Bijlani","MBBS , Diploma in Orthopaedics , FCPS Ortho (Mumbai) , MS - Orthopaedics , M.Ch - Orthopaedics)","405, Shubham Atlanta, RC Marg, Chembur East, Landmark: Opp Chembur Police Station & Near Tel Exchange, Mumbai","12 yrs experience","+912233956967"));

        dbHandler.addDoctor(new Doctor("Mumbai","Orthopedist","Dr. Rajesh Rohira","MBBS , MS - Orthopaedics , DNB (Orthopedics) , PGDHMHC , PGDMLS , M.Ch - Orthopaedics","Gopal Sadan, 1st Floor, Off Wester Express Highway, Andheri East, Landmark: Near Pump House, Mumbai","21 yrs experience","+912233985647"));

        dbHandler.addDoctor(new Doctor("Mumbai","Orthopedist","Dr. Devanand D. More","MBBS , Diploma in Orthopaedics , DNB (Orthopedics)","RSK Apartments, Shop No. 1, IC Colony, Landmark: Near Silver Coin Restaurant, Mumbai","11 yrs experience","+912239528706"));

        dbHandler.addDoctor(new Doctor("Mumbai","Orthopedist","Dr. Vikas Madhav Agashe","MBBS , MS - Orthopaedics , Diploma in Orthopaedics","Vrindavan Building, Sonapur Lane, Off Lbs Marg, Landmark: Opposite To Bazaar Ward Market, Mumbai","38 yrs experience","+912230101333"));

        dbHandler.addDoctor(new Doctor("Mumbai","Pediatrician","Dr. Neeta Nathani","MD - Paediatrics","Vikas Centre, Office No. 2,Landmark: Near Basant Cinema, Opposite To Borla Society, C.G. Road, Mumbai","36 yrs experience","+912233956983"));

        dbHandler.addDoctor(new Doctor("Mumbai","Pediatrician","Dr. Vipul Mehrotra","MBBS , Diploma in Child Health (DCH) , FCPS (Paediatrics) , PGPN(Boston,USA) , Diploma in Child Health (DCH)","shishu child care clinic shop no 8A bldg no 29 Takshila chs ltd Poonam nagar Andheri east, Mumbai","23 yrs experience","+912239528739"));

        dbHandler.addDoctor(new Doctor("Mumbai","Pediatrician","Dr.Shilpa Nayak","Diploma in Child Health (DCH) , DAA , MBBS","Kaustubh building, Holy Cross Road, I C Colony, Borivali West, Mumbai, Mumbai","11 yrs experience","+912239528687"));

        dbHandler.addDoctor(new Doctor("Mumbai","Pediatrician","Dr.Indu Khosla","MBBS,MD-Pediatrics","The Link, 1st floor, Link Road Extension, Andheri West. Landmark: Next to Audi Showroom, Mumba","26 yrs experience","+912239528640"));

        dbHandler.addDoctor(new Doctor("Mumbai","Pediatrician","Dr.Uma Venkateswaran","MBBS MD - Paediatrics","305, 3rd Floor, Gagangiri Complex, 18th Road, Chembur. Landmark: Near Ambedkar Garden & Above Bharat Co-op Bank, Mumbai","25 yrs experience","+912233578344"));


    }

    void pune(){

        dbHandler.addDoctor(new Doctor("Pune","Cardiologist","Dr. Priya Palimkar","MBBS , MD - Medicine , DNB (Cardiology)","C1/101, Silver Oak Society, Landmark: Above Bank of Maharashtra, Kalyani Nagar, Koregaon Park, Pune,","11 yrs experience","+91223395698"));

        dbHandler.addDoctor(new Doctor("Pune","Cardiologist"," Arunesh Dutt Upadhyay","C1/101, Silver Oak Society, Kalyani Nagar, Landmark: Above Bank of Maharashtra, Pune","C1/101, Silver Oak Society, Landmark: Above Bank of Maharashtra, Kalyani Nagar, Koregaon Park, Pune","15 yrs experience","+912233956980"));

        dbHandler.addDoctor(new Doctor("Pune","Cardiologist","Dr.Ravindra Chhajed","MBBS , F.C.P.S.(Medicine) , DNB (Medicine)","Market Yard, Pune","11 yrs experience","+912239528771"));

        dbHandler.addDoctor(new Doctor("Pune","Cardiologist","Mohan K.T","MD(USA),ABIM,ABPM(USA)MBBS , MD - Medicine , Fellowship in Pulmonary Disease,Critical Care and Environmental Medicine","1 st Floor, Prakash Florence, Kaverinagar Police Colony Road,Wakad, near Kalewadi Phata, Pune","24 yrs experience","+912233956977"));

        dbHandler.addDoctor(new Doctor("Pune","Cardiologist","Ravindra L Kulkarni","MBBS , MD - Internal Medicine , DNB (Cardiology) , FSCAI , Fellowship in Interventional Cardiology","Chinchwadgaon, Pune, Pune","13 yrs experience","+912239528765 "));

        dbHandler.addDoctor(new Doctor("Pune","Dentist","Milind Darda","BDS , MDS , PGDE (Cosmetic & Esthetic Dentist)","691/9 A, Nr Rupee Co Op Bank Premnagar, Pune Satara Rd Next To Parekh Foods Ltd, Pune Satara Road,Landmark: Near Beside The Breake Hotel, Pune","14 yrs experience","+912233956970"));

        dbHandler.addDoctor(new Doctor("Pune","Dentist","Anamika Guptal","BDS , MDS-PROSTHODONTICS , Post-Graduate Certificate in Oral Implantology (PGCOI) ,PGDE (Cosmetic & Esthetic Dentist) ","29, Kunal Icon Shopping Complex, Pimple Saudagar, Landmark: Inside Kunal Icon Society, Pune","15 yrs experience","+919850840954"));

        dbHandler.addDoctor(new Doctor("Pune","Dentist","Shail Jaggi"," BDS , MDS - Conservative Dentistry & Endodontics","302-303 CITY POINT, Pune","15 yrs experience","+912230018557"));

        dbHandler.addDoctor(new Doctor("Pune","Dentist","Avinash Bamane","BDS"," 2nd Floor, Above Moonlight Photoshop, Chandan Nagar-Kharadi, Landmark: Next to Mahanagar Bank,Pune Nagar Highway, Pune.","8 yrs experience","+918806631888"));

        dbHandler.addDoctor(new Doctor("Pune","Dentist","Dr.Ashish Gupta","BDS & Certified Oral Implantologist (USA) , M. I.S.O.I .","Office No. 4, 2nd Floor, Westend Shopping, New DP Road, Aundh, Landmark: Opp. Aundh D Mart, Pune","13 yrs experience","+912239528638 "));

        dbHandler.addDoctor(new Doctor("Pune","ENT","Dr.Amol Dilip Joshi","MBBS , DNB (Otorhinolaryngology)","40, Sasoon Road, B S Dhole Patil Path near ruby hall clinic, choice apartments c wing 4th floor above mont blanc oppo millenium star building, Pune","24 yrs experience","+912230293097"));

        dbHandler.addDoctor(new Doctor("Pune","ENT","Dr.  Amol Chavan","MBBS , Diploma in Oto-Rhino-Laryngology (D.O.R.L)","Office No 212 ,Second Floor,Vision Galleria,Pimple Saudagar, Landmark:Near Kunal Ikon F/o G Mart, Pune","12 yrs experience","+912233956861"));

        dbHandler.addDoctor(new Doctor("Pune","ENT"," Seemab Shaikh","MBBS , MS - ENT , Diplomate of National Board (ENT) , Post Graduate Diploma in Hospital & Healthcare Management","40, Sasoon Road, B S Dhole Patil Path near ruby hall clinic, choice apartments c wing 4th floor above mont blanc oppo millenium star building, Pune","21 yrs experience","+912233956961"));

        dbHandler.addDoctor(new Doctor("Pune","ENT","Dr. Shirish Ghanl","MBBS , MS - ENT","7, Dev Adarsh Apartment. Landmark: Between Somani Garden and Hotel Rajini Gandha, Near Mukti Dham, Nashik","24 yrs experience","+912233956969"));

        dbHandler.addDoctor(new Doctor("Pune","ENT","Dr.  Mrinal Supriya","MBBS , MS - ENT , FRCS , Membership of the Royal College of Surgeons (MRCS) , DO-HNS","C1/101, Silver Oak Society, Landmark: Above Bank of Maharashtra, Kalyani Nagar, Koregaon Park, Pune","10 yrs experience","+912233956980"));

        dbHandler.addDoctor(new Doctor("Pune","General physician","Dr.Madhavi Nachane","MS - ENT , DNB , MBBS , Post Graduate Diploma in Hospital Management(PGDHM)","251/252, Near Parihar Chowk, Landmark:-Opp. Telephone Exchange, Pune","13 yrs experience","+91229528771"));

        dbHandler.addDoctor(new Doctor("Pune","General physician","Dr. Sanjay Agarwal","MD - Internal Medicine , DGO , PGDMLS","649, Sachapir Street, Camp, Landmark: Near Hanuman Mandhir, Pune","15 yrs experience","+912230293008"));

        dbHandler.addDoctor(new Doctor("Pune","General physician","Dr.Arunesh Dutt Upadhyay"," MBBS , MD - Aerospace Medicine , Eular Certification in Rheumatology","C1/101, Silver Oak Society, Landmark: Above Bank of Maharashtra, Kalyani Nagar, Koregaon Park, Pune","15 yrs experience","+9112233956980"));

        dbHandler.addDoctor(new Doctor("Pune","General physician","Dr.Salma Siddiqui","MBBS , DNB (General Medicine) , Fellowship In Critical Care"," Office Number 204, 2nd Floor Prime Square, Kunal Icon road, Pimple saudagar. Landmark: Opposite Datta Mandir, Pune.","9 yrs experience","+912261054299"));

        dbHandler.addDoctor(new Doctor("Pune","General physician","Dr. Damanjit Duggal","MBBS , MD - Internal Medicine","Building No.1 , Plot No.406 , Gera Garden , Koregaon Park, Pune","26 yrs experience","+912261739700"));

        dbHandler.addDoctor(new Doctor("Pune","Gynecologist","Dr.Manisha Munemane","MBBS , MD - Obstetrics & Gynaecology , Diploma in advanced gynecological endoscopy , Certificate course in vaginal surgery , Training in obstetrics and gynecology ultrasonography , Training in colposcopy","Survey No. 8, Bhujbal Chowk, Hinjewadi Fly Bridge, Wakad, Pune, Landmark: Near Wakad Octroi Naka, Pune","14 yrs experience","+912233956982"));

        dbHandler.addDoctor(new Doctor("Pune","Gynecologistt","Dr. Neena Sathe","MBBS , MD - Obstetrics & Gynaecology","402/A, Gokhale Nagar, Off Senapati Bapat Road, Landmark: Near Dominos Pizza, Pune","15 yrs experience","+912239528748"));

        dbHandler.addDoctor(new Doctor("Pune","Gynecologist","Dr.Mangala Wani"," MD - Obstetrics & Gynaecology , FRCOG (LONDON) (Fellow of Royal College of Obstetricians and Gynaecologists)","Axon Building, Survey No 28/1, Bhamburda, Shivaji Nagar, Pune 411005. Landmark: Near Sakhar Sankul, Pune","15 yrs experience","+912233956979"));

        dbHandler.addDoctor(new Doctor("Pune","Gynecologist","Dr.Mamta Dighe","MBBS , MD - Obstetrics & Gynaecology , DNB (Obstetrics and Gynecology) , FNB Reproductive Medicine , F.C.P.S.(Mid. & Gynae) , DGO","  Minar Appartments, Landmark: Opp. Maruti Suzuki Showroom, Pune.","20 yrs experience","+912233956285"));

        dbHandler.addDoctor(new Doctor("Pune","Gynecologist","Dr. Anita Gavali","MD - Obstetrics & Gynaecology , MBBS","Office # 3, Munnalal Paradise, Landmark: Opp - Akashvani Quaters , Solapur Road, Pune, Delhi","13 yrs experience","+912233956447 "));

        dbHandler.addDoctor(new Doctor("Pune","Ophthalmologist","Dr. Himashree Talukdar Wankhede"," MBBS , Diploma in Ophthalmology , Felowship in Medical Retina"," Sant Tukaram Complex 2, 1st Floor, Hinjawadi Main Road, Landmark: Opposite Hotel Formule 1, Pune","5 yrs experience","+912233956983"));

        dbHandler.addDoctor(new Doctor("Pune","Ophthalmologist","Dr. Deepak Pathak","MBBS , MS - Ophthalmology , DOMS , DNB Ophthalmology","1st Floor, Kudale Patil Prestij, Manikbaug, Landmark: Near Pushpak Mangal Karyalay, Pune","15 yrs experience","+9112233956977"));

        dbHandler.addDoctor(new Doctor("Pune","Ophthalmologist","Dr. Pankaj Asawa","MBBS , MS - Ophthalmology","2, Shakun Appartments, Sanghavi Nagar, Aundh, Landmark: Above Bank of Maharashatra, Near Bremen Chowk, Pune","12 yrs experience","+9112261054224"));

        dbHandler.addDoctor(new Doctor("Pune","Ophthalmologist","Dr. Aboli Baijal","MBBS , DOMS","1st Floor,Fortune Plaza,Landmark:Opposite To Bank Of Maharastra, Bavdhan,Nda Pashan Road, Pune, Pune","16 yrs experience","+912233956967"));

        dbHandler.addDoctor(new Doctor("Pune","Ophthalmologist","Dr. Leena S. Konde","MBBS , MD - Ophthalmology","Dange Empire, First Floor, Dange Chowk, Thergaon, Pune, Pune","11 yrs experience","+912239528771 "));

        dbHandler.addDoctor(new Doctor("Pune","Orthopedist","Anshu S.R Sachdev","MBBS , M.D - Anesthiologist , FAAOS , FIASP","Ruby Hall Clinic, No. 59/6, Kedari Nagar Road, Azad Nagar, Wanowarie, Pune, Maharashtra 411040, Pune","11 yrs experience","+912261054224"));

        dbHandler.addDoctor(new Doctor("Pune","Orthopedist","Bhushan Shitole","MBBS , Diploma in Orthopaedics , FCPS Ortho (Delhi) , MS - Orthopaedics , M.Ch - Orthopaedics)","Dattawadi, Sinhagad Road, Vadgaon Budruk, Landmark: Near Dattawadi Police Chowky, Pune","12 yrs experience","+912239528748"));

        dbHandler.addDoctor(new Doctor("Pune","Orthopedist","Abhijit Pawar","MBBS , MS-Orthopedist","Office No. 203, 2nd Floor, Krishna Avenue, Landmark: Opp. D Mart, Above Dominos Pizza, Pune, Pune","11 yrs experience","+918888700016"));

        dbHandler.addDoctor(new Doctor("Pune","Orthopedist","Yogesh Panchwagh","MBBS , MS - Orthopaedics , DNB , MNAMS (Membership of the National Academy) (General Surgery) , M.Ch - Orthopaedics","101, Vasanth BharathKunj Society-2, Landmark: Near New Karnataka School, Pune","29 yrs experience","+912239528610"));

        dbHandler.addDoctor(new Doctor("Pune","Orthopedist"," Nikheel Pansare","MBBS , DNB(Ortho) , D'Ortho , MRCS(UK) , MNAMS (Orthopaedics) , Fellowship in Joint Replacement & Reconstruction (France) , Fellowship in Arthroscopy-Sports Surgery (Germany) , DNB (Orthopedics)"," No.2A, Near Nyati Empire, 22, Old Kharadi Mundhwa Rd, Shree Datta Colony, Sainath Nagar, Vadgoan Sheri, Pune, Maharashtra 411014, Pune","17 yrs experience","+912233956964"));

        dbHandler.addDoctor(new Doctor("Pune","Pediatrician","Dr.Mili Joshi","MBBS , Diploma in Child Health (DCH)","C1/101, Silver Oak Society, Landmark: Above Bank of Maharashtra, Kalyani Nagar, Koregaon Park, Pune","36 yrs experience","+912233956980"));

        dbHandler.addDoctor(new Doctor("Pune","Pediatrician","Pranami Mehta","MBBS , Diploma in Child Health (DCH)","vedant clinic opposite to TCS gate 2 bhoirwadi near megapolis Hinjewadi pahse 3, Pune","9 yrs experience","+912033408346"));

        dbHandler.addDoctor(new Doctor("Pune","Pediatrician","Dr.Santosh Mhetre","MBBS ,MD Pediatrics","Sadguru Building,Kashid Nagar, Pimple Gurav. Landmark: Opposite to Badminton Court & Near Katepuram Chowk, Pune","12 yrs experience","+912261739701"));

        dbHandler.addDoctor(new Doctor("Pune","Pediatrician","Archana Latkar","MBBS,MD-Pediatrics","Niyoshi Park 2 Sanghvi Nagar D P Road, Aundh, Landmark: Opp. Puma / Helios showroom, Near Idea Showroom, Pune","21 yrs experience","+912233956964"));

        dbHandler.addDoctor(new Doctor("Pune","Pediatrician","Dushyant Kothari","MBBS , MD - Paediatrics","Bhuleshwar Society, Sambhaji Nagar Road, Dhankawadi, Landmark: Beside Konark Vihar & Opposite Shivchhatrapati Mangal Karyalaya, Pune","11 yrs experience","+912239647391"));


    }

}
