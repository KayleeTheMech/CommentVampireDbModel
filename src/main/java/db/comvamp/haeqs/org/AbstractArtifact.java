package db.comvamp.haeqs.org;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * A representation of the model object '<em><b>AbstractArtifact</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "comvamp_db_AbstractArtifact")
public abstract class AbstractArtifact {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Id()
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String uniqueID = null;

  /**
   * Returns the value of '<em><b>id</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>id</b></em>' feature
   * @generated
   */
  public int getId() {
    return id;
  }

  /**
   * Sets the '{@link AbstractArtifact#getId() <em>id</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newId
   *          the new value of the '{@link AbstractArtifact#getId() id}' feature.
   * @generated
   */
  public void setId(int newId) {
    id = newId;
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
   * Sets the '{@link AbstractArtifact#getUniqueID() <em>uniqueID</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newUniqueID
   *          the new value of the '{@link AbstractArtifact#getUniqueID() uniqueID}' feature.
   * @generated
   */
  public void setUniqueID(String newUniqueID) {
    uniqueID = newUniqueID;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AbstractArtifact " + " [id: " + getId() + "]" + " [uniqueID: " + getUniqueID() + "]";
  }
}
