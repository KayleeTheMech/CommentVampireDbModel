package db.comvamp.haeqs.org;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.AbstractModelObject;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: comvamp.db. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DbModelFactory implements ModelFactory {

  /**
   * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClass
   *          creates a Object instance for this EClass
   * @return an object representing the eClass
   * @generated
   */
  public Object create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case DbModelPackage.COMMENT_CLASSIFIER_ID:
        return createComment();
      case DbModelPackage.ARTIFACT_CLASSIFIER_ID:
        return createArtifact();
      case DbModelPackage.PLATFORM_CLASSIFIER_ID:
        return createPlatform();
      case DbModelPackage.AUTHOR_CLASSIFIER_ID:
        return createAuthor();
      case DbModelPackage.AUTHORDETAILS_CLASSIFIER_ID:
        return createAuthorDetails();
      case DbModelPackage.COMMENTDETAILS_CLASSIFIER_ID:
        return createCommentDetails();
      case DbModelPackage.ARTIFACTDETAILS_CLASSIFIER_ID:
        return createArtifactDetails();
      default:
        throw new IllegalArgumentException("The EClass '" + eClass.getName() + "' is not a valid EClass for this EPackage");
    }
  }

  /**
   * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param eClass
   *          the EClass of the object
   * @param adaptee
   *          the object being wrapped/adapted
   * @return the wrapper {@link ModelObject}
   * @generated
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public <T> ModelObject<T> createModelObject(EClass eClass, T adaptee) {
    ModelObject<Object> modelObject = null;
    switch (eClass.getClassifierID()) {
      case DbModelPackage.COMMENT_CLASSIFIER_ID:
        modelObject = new CommentModelObject();
        break;
      case DbModelPackage.ARTIFACT_CLASSIFIER_ID:
        modelObject = new ArtifactModelObject();
        break;
      case DbModelPackage.PLATFORM_CLASSIFIER_ID:
        modelObject = new PlatformModelObject();
        break;
      case DbModelPackage.AUTHOR_CLASSIFIER_ID:
        modelObject = new AuthorModelObject();
        break;
      case DbModelPackage.AUTHORDETAILS_CLASSIFIER_ID:
        modelObject = new AuthorDetailsModelObject();
        break;
      case DbModelPackage.COMMENTDETAILS_CLASSIFIER_ID:
        modelObject = new CommentDetailsModelObject();
        break;
      case DbModelPackage.ARTIFACTDETAILS_CLASSIFIER_ID:
        modelObject = new ArtifactDetailsModelObject();
        break;
      default:
        throw new IllegalArgumentException("The EClass '" + eClass + "' is not defined in this EPackage");
    }
    modelObject.setTarget(adaptee);
    return (ModelObject<T>) modelObject;
  }

  /**
   * Creates a feature map entry instance for a certain EStructuralFeature.
   *
   * @param eFeature
   *          the feature map feature
   * @return the pojo feature map entry
   * @generated
   */
  public Object createFeatureMapEntry(EStructuralFeature eFeature) {
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature + "' is not a valid feature map in this EPackage");
  }

  /**
   * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}. If the feature map entry is null then a new one is
   * created and <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param eFeature
   *          the feature map feature of the object
   * @param adaptee
   *          the pojo feature map entry being wrapped/adapted
   * @return the wrapper {@link ModelFeatureMapEntry}
   * @generated
   */
  public ModelFeatureMapEntry<?> createModelFeatureMapEntry(EStructuralFeature eFeature, Object adaptee) {
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Comment
   * @generated
   */
  public Comment createComment() {
    return new Comment();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Artifact
   * @generated
   */
  public Artifact createArtifact() {
    return new Artifact();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Platform
   * @generated
   */
  public Platform createPlatform() {
    return new Platform();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Author
   * @generated
   */
  public Author createAuthor() {
    return new Author();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass AuthorDetails
   * @generated
   */
  public AuthorDetails createAuthorDetails() {
    return new AuthorDetails();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CommentDetails
   * @generated
   */
  public CommentDetails createCommentDetails() {
    return new CommentDetails();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ArtifactDetails
   * @generated
   */
  public ArtifactDetails createArtifactDetails() {
    return new ArtifactDetails();
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if the value is null then null is returned.
   * @generated
   */
  public Object createFromString(EDataType eDataType, String value) {
    switch (eDataType.getClassifierID()) {
      default:
        throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage");
    }
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if value == null then null is returned
   * @generated
   */
  public String convertToString(EDataType eDataType, Object value) {
    switch (eDataType.getClassifierID()) {
      default:
        throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Comment</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class CommentModelObject<E extends Comment> extends AbstractModelObject<E> {

    /**
     * @generated
     */
    public EClass eClass() {
      return DbModelPackage.INSTANCE.getCommentEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return DbModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return Comment.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case DbModelPackage.COMMENT_UNIQUEID_FEATURE_ID:
          return getTarget().getUniqueID();
        case DbModelPackage.COMMENT_INRESPONSETO_FEATURE_ID:
          return getTarget().getInResponseTo();
        case DbModelPackage.COMMENT_PUBLISHEDON_FEATURE_ID:
          return getTarget().getPublishedOn();
        case DbModelPackage.COMMENT_HASDETAILS_FEATURE_ID:
          return getTarget().getHasDetails();
        case DbModelPackage.COMMENT_PUBLISHEDBY_FEATURE_ID:
          return getTarget().getPublishedBy();
        default:
          return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case DbModelPackage.COMMENT_UNIQUEID_FEATURE_ID:
          getTarget().setUniqueID((String) value);
          return;
        case DbModelPackage.COMMENT_INRESPONSETO_FEATURE_ID:
          getTarget().setInResponseTo((Artifact) value);
          return;
        case DbModelPackage.COMMENT_PUBLISHEDON_FEATURE_ID:
          getTarget().setPublishedOn((Platform) value);
          return;
        case DbModelPackage.COMMENT_HASDETAILS_FEATURE_ID:
          getTarget().setHasDetails((List<CommentDetails>) value);
          return;
        case DbModelPackage.COMMENT_PUBLISHEDBY_FEATURE_ID:
          getTarget().setPublishedBy((Author) value);
          return;
        default:
          super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        case DbModelPackage.COMMENT_HASDETAILS_FEATURE_ID:
          return getTarget().getHasDetails().add((CommentDetails) value);

        default:
          return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        case DbModelPackage.COMMENT_HASDETAILS_FEATURE_ID:
          return getTarget().getHasDetails().remove(value);

        default:
          return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Artifact</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class ArtifactModelObject<E extends Artifact> extends AbstractModelObject<E> {

    /**
     * @generated
     */
    public EClass eClass() {
      return DbModelPackage.INSTANCE.getArtifactEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return DbModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return Artifact.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case DbModelPackage.ARTIFACT_PUBLISHEDON_FEATURE_ID:
          return getTarget().getPublishedOn();
        case DbModelPackage.ARTIFACT_UNIQUEID_FEATURE_ID:
          return getTarget().getUniqueID();
        case DbModelPackage.ARTIFACT_HASDETAILS_FEATURE_ID:
          return getTarget().getHasDetails();
        default:
          return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case DbModelPackage.ARTIFACT_PUBLISHEDON_FEATURE_ID:
          getTarget().setPublishedOn((Platform) value);
          return;
        case DbModelPackage.ARTIFACT_UNIQUEID_FEATURE_ID:
          getTarget().setUniqueID((String) value);
          return;
        case DbModelPackage.ARTIFACT_HASDETAILS_FEATURE_ID:
          getTarget().setHasDetails((List<ArtifactDetails>) value);
          return;
        default:
          super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        case DbModelPackage.ARTIFACT_HASDETAILS_FEATURE_ID:
          return getTarget().getHasDetails().add((ArtifactDetails) value);
        default:
          return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        case DbModelPackage.ARTIFACT_HASDETAILS_FEATURE_ID:
          return getTarget().getHasDetails().remove(value);
        default:
          return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Platform</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class PlatformModelObject<E extends Platform> extends AbstractModelObject<E> {

    /**
     * @generated
     */
    public EClass eClass() {
      return DbModelPackage.INSTANCE.getPlatformEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return DbModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return Platform.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case DbModelPackage.PLATFORM_URL_FEATURE_ID:
          return getTarget().getURL();
        case DbModelPackage.PLATFORM_UNIQUEID_FEATURE_ID:
          return getTarget().getUniqueID();
        default:
          return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case DbModelPackage.PLATFORM_URL_FEATURE_ID:
          getTarget().setURL((String) value);
          return;
        case DbModelPackage.PLATFORM_UNIQUEID_FEATURE_ID:
          getTarget().setUniqueID((String) value);
          return;
        default:
          super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        default:
          return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        default:
          return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Author</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class AuthorModelObject<E extends Author> extends AbstractModelObject<E> {

    /**
     * @generated
     */
    public EClass eClass() {
      return DbModelPackage.INSTANCE.getAuthorEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return DbModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return Author.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case DbModelPackage.AUTHOR_UNIQUEID_FEATURE_ID:
          return getTarget().getUniqueID();
        case DbModelPackage.AUTHOR_ACTIVEON_FEATURE_ID:
          return getTarget().getActiveOn();
        case DbModelPackage.AUTHOR_HASDETAILS_FEATURE_ID:
          return getTarget().getHasDetails();
        default:
          return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case DbModelPackage.AUTHOR_UNIQUEID_FEATURE_ID:
          getTarget().setUniqueID((String) value);
          return;
        case DbModelPackage.AUTHOR_ACTIVEON_FEATURE_ID:
          getTarget().setActiveOn((List<Platform>) value);
          return;
        case DbModelPackage.AUTHOR_HASDETAILS_FEATURE_ID:
          getTarget().setHasDetails((List<AuthorDetails>) value);
          return;
        default:
          super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        case DbModelPackage.AUTHOR_ACTIVEON_FEATURE_ID:
          return getTarget().getActiveOn().add((Platform) value);

        case DbModelPackage.AUTHOR_HASDETAILS_FEATURE_ID:
          return getTarget().getHasDetails().add((AuthorDetails) value);
        default:
          return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        case DbModelPackage.AUTHOR_ACTIVEON_FEATURE_ID:
          return getTarget().getActiveOn().remove(value);

        case DbModelPackage.AUTHOR_HASDETAILS_FEATURE_ID:
          return getTarget().getHasDetails().remove(value);
        default:
          return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AuthorDetails</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class AuthorDetailsModelObject<E extends AuthorDetails> extends AbstractModelObject<E> {

    /**
     * @generated
     */
    public EClass eClass() {
      return DbModelPackage.INSTANCE.getAuthorDetailsEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return DbModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return AuthorDetails.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case DbModelPackage.AUTHORDETAILS_TYPE_FEATURE_ID:
          return getTarget().getType();
        case DbModelPackage.AUTHORDETAILS_CONTENT_FEATURE_ID:
          return getTarget().getContent();
        default:
          return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case DbModelPackage.AUTHORDETAILS_TYPE_FEATURE_ID:
          getTarget().setType((String) value);
          return;
        case DbModelPackage.AUTHORDETAILS_CONTENT_FEATURE_ID:
          getTarget().setContent((String) value);
          return;
        default:
          super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        default:
          return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        default:
          return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CommentDetails</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class CommentDetailsModelObject<E extends CommentDetails> extends AbstractModelObject<E> {

    /**
     * @generated
     */
    public EClass eClass() {
      return DbModelPackage.INSTANCE.getCommentDetailsEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return DbModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return CommentDetails.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case DbModelPackage.COMMENTDETAILS_TYPE_FEATURE_ID:
          return getTarget().getType();
        case DbModelPackage.COMMENTDETAILS_CONTENT_FEATURE_ID:
          return getTarget().getContent();
        default:
          return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case DbModelPackage.COMMENTDETAILS_TYPE_FEATURE_ID:
          getTarget().setType((String) value);
          return;
        case DbModelPackage.COMMENTDETAILS_CONTENT_FEATURE_ID:
          getTarget().setContent((String) value);
          return;
        default:
          super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        default:
          return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        default:
          return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ArtifactDetails</b></em>'.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param <E>
   *          the domain model java class
   *
   * @generated
   */
  public static class ArtifactDetailsModelObject<E extends ArtifactDetails> extends AbstractModelObject<E> {

    /**
     * @generated
     */
    public EClass eClass() {
      return DbModelPackage.INSTANCE.getArtifactDetailsEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return DbModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Class<?> getTargetClass() {
      return ArtifactDetails.class;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case DbModelPackage.ARTIFACTDETAILS_TYPE_FEATURE_ID:
          return getTarget().getType();
        case DbModelPackage.ARTIFACTDETAILS_CONTENT_FEATURE_ID:
          return getTarget().getContent();
        default:
          return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
        case DbModelPackage.ARTIFACTDETAILS_TYPE_FEATURE_ID:
          getTarget().setType((String) value);
          return;
        case DbModelPackage.ARTIFACTDETAILS_CONTENT_FEATURE_ID:
          getTarget().setContent((String) value);
          return;
        default:
          super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        default:
          return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

        default:
          return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }
}
