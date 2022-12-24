package com.Hazem.Spring.Data.Jpa.Entities;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@AttributeOverrides({ 
	    @AttributeOverride(column = @Column(name = "guardian_name"), name = "name"),
		@AttributeOverride(column = @Column(name = "guardian_email"), name = "email"),
		@AttributeOverride(column = @Column(name = "guardian_mobile"), name = "mobile")

})
public class Guardian {

	private String name;
	private String email;
	private String mobile;
}
