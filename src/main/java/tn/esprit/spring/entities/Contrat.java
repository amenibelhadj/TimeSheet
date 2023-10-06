package tn.esprit.spring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contrat implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reference;

	@Temporal(TemporalType.DATE)
	private Date dateDebut;

	private String typeContrat;

	@JsonIgnore
	@OneToOne(mappedBy = "contrat")
	private Employe employe;

	private float salaire;


}
