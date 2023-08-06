package com.ms.email.dtos;



import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDto {
	
	@NotBlank  //validação para obrigar preenchimento
	private String owernRef;
	
	@NotBlank
	@Email  //verifica se o email existe
	private String emailFrom;
	
	@NotBlank
	@Email
	private String emailTo;
	
	@NotBlank
	private String subject;
	
	@NotBlank
	private String text;

	public String getOwernRef() {
		return owernRef;
	}

	

	public String getEmailFrom() {
		return emailFrom;
	}

	

	public String getEmailTo() {
		return emailTo;
	}

	

	public String getSubject() {
		return subject;
	}

	
	public String getText() {
		return text;
	}

	
	
	

}

