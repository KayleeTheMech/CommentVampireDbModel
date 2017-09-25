package xyz.haeqs;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * A representation of the model object '<em><b>Comment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "comvamp_db_Comment")
public class Comment {

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
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  private Artifact inResponseTo = null;

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
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private List<CommentDetails> hasDetails = new ArrayList<CommentDetails>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  private Author publishedBy = null;

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
   * Sets the '{@link Comment#getUniqueID() <em>uniqueID</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newUniqueID
   *          the new value of the '{@link Comment#getUniqueID() uniqueID}' feature.
   * @generated
   */
  public void setUniqueID(String newUniqueID) {
    uniqueID = newUniqueID;
  }

  /**
   * Returns the value of '<em><b>inResponseTo</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>inResponseTo</b></em>' feature
   * @generated
   */
  public Artifact getInResponseTo() {
    return inResponseTo;
  }

  /**
   * Sets the '{@link Comment#getInResponseTo() <em>inResponseTo</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newInResponseTo
   *          the new value of the '{@link Comment#getInResponseTo() inResponseTo}' feature.
   * @generated
   */
  public void setInResponseTo(Artifact newInResponseTo) {
    inResponseTo = newInResponseTo;
  }

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
   * Sets the '{@link Comment#getPublishedOn() <em>publishedOn</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPublishedOn
   *          the new value of the '{@link Comment#getPublishedOn() publishedOn}' feature.
   * @generated
   */
  public void setPublishedOn(Platform newPublishedOn) {
    publishedOn = newPublishedOn;
  }

  /**
   * Returns the value of '<em><b>hasDetails</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>hasDetails</b></em>' feature
   * @generated
   */
  public List<CommentDetails> getHasDetails() {
    return hasDetails;
  }

  /**
   * Sets the '{@link Comment#getHasDetails() <em>hasDetails</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newHasDetails
   *          the new value of the '{@link Comment#getHasDetails() hasDetails}' feature.
   * @generated
   */
  public void setHasDetails(List<CommentDetails> newHasDetails) {
    hasDetails = newHasDetails;
  }

  /**
   * Returns the value of '<em><b>publishedBy</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>publishedBy</b></em>' feature
   * @generated
   */
  public Author getPublishedBy() {
    return publishedBy;
  }

  /**
   * Sets the '{@link Comment#getPublishedBy() <em>publishedBy</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPublishedBy
   *          the new value of the '{@link Comment#getPublishedBy() publishedBy}' feature.
   * @generated
   */
  public void setPublishedBy(Author newPublishedBy) {
    publishedBy = newPublishedBy;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Comment " + " [uniqueID: " + getUniqueID() + "]";
  }
}
