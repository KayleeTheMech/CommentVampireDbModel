package db.comvamp.haeqs.org;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * A representation of the model object '<em><b>AbstractArtifactDetails</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "comvamp_db_AbstractArtifactDetails")
public abstract class AbstractArtifactDetails {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String type = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String content = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Id()
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id = 0;

  /**
   * Returns the value of '<em><b>type</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>type</b></em>' feature
   * @generated
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the '{@link AbstractArtifactDetails#getType() <em>type</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newType
   *          the new value of the '{@link AbstractArtifactDetails#getType() type}' feature.
   * @generated
   */
  public void setType(String newType) {
    type = newType;
  }

  /**
   * Returns the value of '<em><b>content</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>content</b></em>' feature
   * @generated
   */
  public String getContent() {
    return content;
  }

  /**
   * Sets the '{@link AbstractArtifactDetails#getContent() <em>content</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newContent
   *          the new value of the '{@link AbstractArtifactDetails#getContent() content}' feature.
   * @generated
   */
  public void setContent(String newContent) {
    content = newContent;
  }

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
   * Sets the '{@link AbstractArtifactDetails#getId() <em>id</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newId
   *          the new value of the '{@link AbstractArtifactDetails#getId() id}' feature.
   * @generated
   */
  public void setId(int newId) {
    id = newId;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AbstractArtifactDetails " + " [type: " + getType() + "]" + " [content: " + getContent() + "]" + " [id: " + getId() + "]";
  }
}
