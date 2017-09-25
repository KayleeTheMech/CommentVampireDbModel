package db.comvamp.haeqs.org;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 * A representation of the model object '<em><b>Author</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "comvamp_db_Author")
public class Author extends AbstractArtifact {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.DETACHjavax.persistence.CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private List<Platform> activeOn = new ArrayList<Platform>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.DETACHjavax.persistence.CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private List<AuthorDetails> hasDetails = new ArrayList<AuthorDetails>();

  /**
   * Returns the value of '<em><b>activeOn</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>activeOn</b></em>' feature
   * @generated
   */
  public List<Platform> getActiveOn() {
    return activeOn;
  }

  /**
   * Sets the '{@link Author#getActiveOn() <em>activeOn</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newActiveOn
   *          the new value of the '{@link Author#getActiveOn() activeOn}' feature.
   * @generated
   */
  public void setActiveOn(List<Platform> newActiveOn) {
    activeOn = newActiveOn;
  }

  /**
   * Returns the value of '<em><b>hasDetails</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>hasDetails</b></em>' feature
   * @generated
   */
  public List<AuthorDetails> getHasDetails() {
    return hasDetails;
  }

  /**
   * Sets the '{@link Author#getHasDetails() <em>hasDetails</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newHasDetails
   *          the new value of the '{@link Author#getHasDetails() hasDetails}' feature.
   * @generated
   */
  public void setHasDetails(List<AuthorDetails> newHasDetails) {
    hasDetails = newHasDetails;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Author " + "{extends: " + super.toString() + "} ";
  }
}
