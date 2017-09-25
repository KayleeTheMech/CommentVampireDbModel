package db.comvamp.haeqs.org;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * A representation of the model object '<em><b>Artifact</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "comvamp_db_Artifact")
public class Artifact {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  private Platform publishedOn = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String uniqueID = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private List<ArtifactDetails> hasDetails = new ArrayList<ArtifactDetails>();

  /**
   * Returns the value of '<em><b>publishedOn</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>publishedOn</b></em>' feature
   * @generated
   */
  public Platform getPublishedOn() {
    return publishedOn;
  }

  /**
   * Sets the '{@link Artifact#getPublishedOn() <em>publishedOn</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPublishedOn
   *          the new value of the '{@link Artifact#getPublishedOn() publishedOn}' feature.
   * @generated
   */
  public void setPublishedOn(Platform newPublishedOn) {
    publishedOn = newPublishedOn;
  }

  /**
   * Returns the value of '<em><b>uniqueID</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>uniqueID</b></em>' feature
   * @generated
   */
  public String getUniqueID() {
    return uniqueID;
  }

  /**
   * Sets the '{@link Artifact#getUniqueID() <em>uniqueID</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newUniqueID
   *          the new value of the '{@link Artifact#getUniqueID() uniqueID}' feature.
   * @generated
   */
  public void setUniqueID(String newUniqueID) {
    uniqueID = newUniqueID;
  }

  /**
   * Returns the value of '<em><b>hasDetails</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>hasDetails</b></em>' feature
   * @generated
   */
  public List<ArtifactDetails> getHasDetails() {
    return hasDetails;
  }

  /**
   * Sets the '{@link Artifact#getHasDetails() <em>hasDetails</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newHasDetails
   *          the new value of the '{@link Artifact#getHasDetails() hasDetails}' feature.
   * @generated
   */
  public void setHasDetails(List<ArtifactDetails> newHasDetails) {
    hasDetails = newHasDetails;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Artifact " + " [uniqueID: " + getUniqueID() + "]";
  }
}
