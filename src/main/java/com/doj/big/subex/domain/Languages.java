/**
 * 
 */
package com.doj.big.subex.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author Dinesh.Rajput
 *
 */
@Entity
public class Languages {
	
	@EmbeddedId
	LanguagePK languagePK;
	
	@Column(name="GER_TEXT")
    private String ger_text;

    @Column(name="ENG_TEXT")
    private String eng_text;
    
    @Column(name="FRE_TEXT")
    private String fre_text;

    @Column(name="SPA_TEXT")
    private String spa_text;
    
    @Column(name="ITA_TEXT")
    private String ita_text;

	public LanguagePK getLanguagePK() {
		return languagePK;
	}

	public void setLanguagePK(LanguagePK languagePK) {
		this.languagePK = languagePK;
	}

	public String getGer_text() {
		return ger_text;
	}

	public void setGer_text(String ger_text) {
		this.ger_text = ger_text;
	}

	public String getEng_text() {
		return eng_text;
	}

	public void setEng_text(String eng_text) {
		this.eng_text = eng_text;
	}

	public String getFre_text() {
		return fre_text;
	}

	public void setFre_text(String fre_text) {
		this.fre_text = fre_text;
	}

	public String getSpa_text() {
		return spa_text;
	}

	public void setSpa_text(String spa_text) {
		this.spa_text = spa_text;
	}

	public String getIta_text() {
		return ita_text;
	}

	public void setIta_text(String ita_text) {
		this.ita_text = ita_text;
	}

}
