package db.comvamp.haeqs.org;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * A representation of the model object '<em><b>AuthorDetails</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "comvamp_db_AuthorDetails")
public class AuthorDetails {

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
   * Sets the '{@link AuthorDetails#getType() <em>type</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newType
   *          the new value of the '{@link AuthorDetails#getType() type}' feature.
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
   * Sets the '{@link AuthorDetails#getContent() <em>content</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newContent
   *          the new value of the '{@link AuthorDetails#getContent() content}' feature.
   * @generated
   */
  public void setContent(String newContent) {
    content = newContent;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AuthorDetails " + " [type: " + getType() + "]" + " [content: " + getContent() + "]";
  }
}
