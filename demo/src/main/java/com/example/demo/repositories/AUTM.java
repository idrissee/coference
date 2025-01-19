package com.example.demo.repositories;

import com.example.demo.entites.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class AUTM implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AUTM.class, args);
    }

    @Autowired(required = true)
    private AuteurRepository AuteurRepository;

    @Autowired
    private SoumissionRepository soumissionRepository;


    @Autowired
    private ConferenceRepository conferenceRepository;

    @Autowired
    private UserAppRepository userApp;

    @Override
    public void run(String... args) throws Exception {
        Auteur a1 = new Auteur("staticello", "amine");
        Auteur a2 = new Auteur("Nacer", "Hassina");
        Auteur a3 = new Auteur("pppan", "bah");
        Auteur a4 = new Auteur("Guebaili", "fatah");
        Auteur a5 = new Auteur("chaboni", "malika");
//        Auteur a2 = new Auteur();
        AuteurRepository.save(a1);
        AuteurRepository.save(a2);
        AuteurRepository.save(a3);
        AuteurRepository.save(a4);
        AuteurRepository.save(a5);

        Soumission soumission1 = new Soumission("soumission1", "Sécurité", a1);
        Soumission soumission2 = new Soumission("soumission2", "IA", a2);
        Soumission soumission3 = new Soumission("soumission3", "big data", a2);
        Soumission soumission4 = new Soumission("soumission4", "IL", a3);

        soumissionRepository.save(soumission1);
        soumissionRepository.save(soumission2);
        soumissionRepository.save(soumission3);
        soumissionRepository.save(soumission4);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        soumission1.setDetailsSoumission(new DetailsSoumission(
                new SimpleDateFormat("dd-MM-yyyy").parse("12-11-2024"),
                new SimpleDateFormat("dd-MM-yyyy").parse("15-11-2024"),
                soumission1
        ));
        soumission2.setDetailsSoumission(new DetailsSoumission(
                new SimpleDateFormat("dd-MM-yyyy").parse("12-11-2023"),
                new SimpleDateFormat("dd-MM-yyyy").parse("15-11-2023"),
                soumission2
        ));
        soumission3.setDetailsSoumission(new DetailsSoumission(
                new SimpleDateFormat("dd-MM-yyyy").parse("12-11-2022"),
                new SimpleDateFormat("dd-MM-yyyy").parse("15-11-2022"),
                soumission3
        ));
        soumission4.setDetailsSoumission(new DetailsSoumission(
                new SimpleDateFormat("dd-MM-yyyy").parse("12-11-2021"),
                new SimpleDateFormat("dd-MM-yyyy").parse("15-11-2021"),
                soumission4
        ));


        soumissionRepository.save(soumission1);
        soumissionRepository.save(soumission2);
        soumissionRepository.save(soumission3);
        soumissionRepository.save(soumission4);

   // public Conference(Etatconference etat, String thematique, Date dateFin, Date dateDebut, String titre) {

       Etatconference e = null;

        Conference conference1 = new Conference(e.FERMEE , "IA",new SimpleDateFormat("dd-MM-yyyy").parse("15-11-2022"),new SimpleDateFormat("dd-MM-yyyy").parse("12-11-2022"),"IA CONFERANCE");
        Conference conference2 = new Conference(e.OUVERTE , "SSI",new SimpleDateFormat("dd-MM-yyyy").parse("20-01-2025"),new SimpleDateFormat("dd-MM-yyyy").parse("01-11-2025"),"CYBERSECURITY CONFERANCE");

        conferenceRepository.save(conference1);
        conferenceRepository.save(conference2);

      UserApp userApp1 = new UserApp("fffffff@gmail.com","*****");
      UserApp userApp2 = new UserApp("aaaaaaa@gmail.com","*****");

        userApp.save(userApp1);
        userApp.save(userApp2);


}
}
