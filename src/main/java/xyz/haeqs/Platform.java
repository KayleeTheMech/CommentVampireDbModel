package xyz.haeqs;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * A representation of the model object '<em><b>Platform</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "comvamp_db_Platform")
public class Platform {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String uRL = null;

  /**
   * Returns the value of '<em><b>URL</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>URL</b></em>' feature
   * @generated
   */
  public String getURL() {
    return uRL;
  }

  /**
   * Sets the '{@link Platform#getURL() <em>URL</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newURL
   *          the new value of the '{@link Platform#getURL() URL}' feature.
   * @generated
   */
  public void setURL(String newURL) {
    uRL = newURL;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Platform " + " [uRL: " + getURL() + "]";
  }
}
