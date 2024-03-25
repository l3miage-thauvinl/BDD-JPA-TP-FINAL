package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class EcosSessionProgrammationStepEntity {
    @Id
    private long id;
    @Column(name="date_time") private LocalDateTime dateTime; //final?
    @Column(unique = true) private String code;
    @Column(nullable = false) private String description;

    @ManyToOne()
    private EcosSessionProgrammationEntity ecosSessionProgrammationEntity;

}
