package net.vlasov.guthub_bot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "repos")
public class RepoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;



}
