package db.comvamp.haeqs.org;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * A representation of the model object '<em><b>Platform</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "comvamp_db_Platform")
public class Platform extends AbstractArtifact {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String uRL = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.DETACHjavax.persistence.CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private PlatformDetails hasDetails = null;

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
   * Returns the value of '<em><b>hasDetails</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>hasDetails</b></em>' feature
   * @generated
   */
  public PlatformDetails getHasDetails() {
    return hasDetails;
  }

  /**
   * Sets the '{@link Platform#getHasDetails() <em>hasDetails</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newHasDetails
   *          the new value of the '{@link Platform#getHasDetails() hasDetails}' feature.
   * @generated
   */
  public void setHasDetails(PlatformDetails newHasDetails) {
    hasDetails = newHasDetails;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Platform " + " [uRL: " + getURL() + "]" + "{extends: " + super.toString() + "} ";
  }
}
