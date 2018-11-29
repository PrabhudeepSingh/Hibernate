package com.epam.hibernatetelusko;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The Class Alien.
 * 
 * @author Prabhudeep_Banga
 */
@Entity
public class Alien {

  @Id
  private int aId;
  private AlienName aName;
  private String aColor;
  
  /**
   * Gets the a id.
   *
   * @return the a id
   */
  public int getaId() {
    return aId;
  }
  
  /**
   * Sets the a id.
   *
   * @param aId the new a id
   */
  public void setaId(int aId) {
    this.aId = aId;
  }
  
  /**
   * Gets the a name.
   *
   * @return the a name
   */
  public AlienName getaName() {
    return aName;
  }

  /**
   * Sets the a name.
   *
   * @param aName the new a name
   */
  public void setaName(AlienName aName) {
    this.aName = aName;
  }

  /**
   * Gets the a color.
   *
   * @return the a color
   */
  public String getaColor() {
    return aColor;
  }
  
  /**
   * Sets the a color.
   *
   * @param aColor the new a color
   */
  public void setaColor(String aColor) {
    this.aColor = aColor;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Alien [aId=" + aId + ", aName=" + aName + ", aColor=" + aColor + "]";
  }
 
}
