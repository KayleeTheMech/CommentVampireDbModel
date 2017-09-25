package db.comvamp.haeqs.org;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.utils.ModelUtils;
import db.comvamp.haeqs.org.dao.ArtifactDao;
import db.comvamp.haeqs.org.dao.ArtifactDetailsDao;
import db.comvamp.haeqs.org.dao.AuthorDao;
import db.comvamp.haeqs.org.dao.AuthorDetailsDao;
import db.comvamp.haeqs.org.dao.CommentDao;
import db.comvamp.haeqs.org.dao.CommentDetailsDao;
import db.comvamp.haeqs.org.dao.PlatformDao;

/**
 * The <b>Package</b> for the model '<em><b>db</b></em>'. It contains initialization code and access to the Factory to instantiate
 * types of this package.
 *
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DbModelPackage extends ModelPackage {

  /**
   * Is set when the package has been initialized.
   * 
   * @generated
   */
  private static boolean isInitialized = false;

  /**
   * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final String NS_URI = "https://org.haeqs.comvamp.db";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final DbModelFactory MODELFACTORY = new DbModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_UNIQUEID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_INRESPONSETO_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_PUBLISHEDON_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_HASDETAILS_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_PUBLISHEDBY_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ARTIFACT_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ARTIFACT_PUBLISHEDON_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ARTIFACT_UNIQUEID_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ARTIFACT_HASDETAILS_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORM_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORM_URL_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORM_UNIQUEID_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUTHOR_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUTHOR_UNIQUEID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUTHOR_ACTIVEON_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUTHOR_HASDETAILS_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUTHORDETAILS_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUTHORDETAILS_TYPE_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUTHORDETAILS_CONTENT_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENTDETAILS_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENTDETAILS_TYPE_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENTDETAILS_CONTENT_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ARTIFACTDETAILS_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ARTIFACTDETAILS_TYPE_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ARTIFACTDETAILS_CONTENT_FEATURE_ID = 1;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final DbModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return an initialized instance of this class
   *
   * @generated
   */
  public static DbModelPackage initialize() {

    if (isInitialized) {
      return (DbModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final DbModelPackage modelPackage = new DbModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Comment.class, modelPackage.getCommentEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Artifact.class, modelPackage.getArtifactEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Platform.class, modelPackage.getPlatformEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Author.class, modelPackage.getAuthorEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AuthorDetails.class, modelPackage.getAuthorDetailsEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CommentDetails.class, modelPackage.getCommentDetailsEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ArtifactDetails.class, modelPackage.getArtifactDetailsEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(Comment.class, CommentDao.class);
    DaoRegistry.getInstance().registerDao(Artifact.class, ArtifactDao.class);
    DaoRegistry.getInstance().registerDao(Platform.class, PlatformDao.class);
    DaoRegistry.getInstance().registerDao(Author.class, AuthorDao.class);
    DaoRegistry.getInstance().registerDao(AuthorDetails.class, AuthorDetailsDao.class);
    DaoRegistry.getInstance().registerDao(CommentDetails.class, CommentDetailsDao.class);
    DaoRegistry.getInstance().registerDao(ArtifactDetails.class, ArtifactDetailsDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the {@link DbModelFactory} instance.
   * @generated
   */
  @Override
  public DbModelFactory getModelFactory() {
    return MODELFACTORY;
  }

  /**
   * Returns the nsUri of the {@link EPackage} managed by this Package instance. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the nsUri of the EPackage
   * @generated
   */
  @Override
  public String getNsURI() {
    return NS_URI;
  }

  /**
   * Returns the name of the ecore file containing the ecore model of the {@link EPackage} managed here. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the name of the ecore file
   * @generated
   */
  @Override
  public String getEcoreFileName() {
    return "db.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>Comment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Comment</b></em>'
   * @generated
   */
  public EClass getCommentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Comment.uniqueID</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Comment.uniqueID</b></em>'.
   * @generated
   */
  public EAttribute getComment_UniqueID() {
    return (EAttribute) getCommentEClass().getEAllStructuralFeatures().get(COMMENT_UNIQUEID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Comment.inResponseTo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Comment.inResponseTo</b></em>'.
   * @generated
   */
  public EReference getComment_InResponseTo() {
    return (EReference) getCommentEClass().getEAllStructuralFeatures().get(COMMENT_INRESPONSETO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Comment.publishedOn</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Comment.publishedOn</b></em>'.
   * @generated
   */
  public EReference getComment_PublishedOn() {
    return (EReference) getCommentEClass().getEAllStructuralFeatures().get(COMMENT_PUBLISHEDON_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Comment.hasDetails</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Comment.hasDetails</b></em>'.
   * @generated
   */
  public EReference getComment_HasDetails() {
    return (EReference) getCommentEClass().getEAllStructuralFeatures().get(COMMENT_HASDETAILS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Comment.publishedBy</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Comment.publishedBy</b></em>'.
   * @generated
   */
  public EReference getComment_PublishedBy() {
    return (EReference) getCommentEClass().getEAllStructuralFeatures().get(COMMENT_PUBLISHEDBY_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Artifact</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Artifact</b></em>'
   * @generated
   */
  public EClass getArtifactEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ARTIFACT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Artifact.publishedOn</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Artifact.publishedOn</b></em>'.
   * @generated
   */
  public EReference getArtifact_PublishedOn() {
    return (EReference) getArtifactEClass().getEAllStructuralFeatures().get(ARTIFACT_PUBLISHEDON_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Artifact.uniqueID</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Artifact.uniqueID</b></em>'.
   * @generated
   */
  public EAttribute getArtifact_UniqueID() {
    return (EAttribute) getArtifactEClass().getEAllStructuralFeatures().get(ARTIFACT_UNIQUEID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Artifact.hasDetails</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Artifact.hasDetails</b></em>'.
   * @generated
   */
  public EReference getArtifact_HasDetails() {
    return (EReference) getArtifactEClass().getEAllStructuralFeatures().get(ARTIFACT_HASDETAILS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Platform</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Platform</b></em>'
   * @generated
   */
  public EClass getPlatformEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PLATFORM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Platform.URL</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Platform.URL</b></em>'.
   * @generated
   */
  public EAttribute getPlatform_URL() {
    return (EAttribute) getPlatformEClass().getEAllStructuralFeatures().get(PLATFORM_URL_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Platform.uniqueID</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Platform.uniqueID</b></em>'.
   * @generated
   */
  public EAttribute getPlatform_UniqueID() {
    return (EAttribute) getPlatformEClass().getEAllStructuralFeatures().get(PLATFORM_UNIQUEID_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Author</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Author</b></em>'
   * @generated
   */
  public EClass getAuthorEClass() {
    return (EClass) getEPackage().getEClassifiers().get(AUTHOR_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Author.uniqueID</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Author.uniqueID</b></em>'.
   * @generated
   */
  public EAttribute getAuthor_UniqueID() {
    return (EAttribute) getAuthorEClass().getEAllStructuralFeatures().get(AUTHOR_UNIQUEID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Author.activeOn</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Author.activeOn</b></em>'.
   * @generated
   */
  public EReference getAuthor_ActiveOn() {
    return (EReference) getAuthorEClass().getEAllStructuralFeatures().get(AUTHOR_ACTIVEON_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Author.hasDetails</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Author.hasDetails</b></em>'.
   * @generated
   */
  public EReference getAuthor_HasDetails() {
    return (EReference) getAuthorEClass().getEAllStructuralFeatures().get(AUTHOR_HASDETAILS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AuthorDetails</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AuthorDetails</b></em>'
   * @generated
   */
  public EClass getAuthorDetailsEClass() {
    return (EClass) getEPackage().getEClassifiers().get(AUTHORDETAILS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AuthorDetails.type</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AuthorDetails.type</b></em>'.
   * @generated
   */
  public EAttribute getAuthorDetails_Type() {
    return (EAttribute) getAuthorDetailsEClass().getEAllStructuralFeatures().get(AUTHORDETAILS_TYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AuthorDetails.content</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AuthorDetails.content</b></em>'.
   * @generated
   */
  public EAttribute getAuthorDetails_Content() {
    return (EAttribute) getAuthorDetailsEClass().getEAllStructuralFeatures().get(AUTHORDETAILS_CONTENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CommentDetails</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CommentDetails</b></em>'
   * @generated
   */
  public EClass getCommentDetailsEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMMENTDETAILS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CommentDetails.type</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CommentDetails.type</b></em>'.
   * @generated
   */
  public EAttribute getCommentDetails_Type() {
    return (EAttribute) getCommentDetailsEClass().getEAllStructuralFeatures().get(COMMENTDETAILS_TYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CommentDetails.content</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CommentDetails.content</b></em>'.
   * @generated
   */
  public EAttribute getCommentDetails_Content() {
    return (EAttribute) getCommentDetailsEClass().getEAllStructuralFeatures().get(COMMENTDETAILS_CONTENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ArtifactDetails</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ArtifactDetails</b></em>'
   * @generated
   */
  public EClass getArtifactDetailsEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ARTIFACTDETAILS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ArtifactDetails.type</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ArtifactDetails.type</b></em>'.
   * @generated
   */
  public EAttribute getArtifactDetails_Type() {
    return (EAttribute) getArtifactDetailsEClass().getEAllStructuralFeatures().get(ARTIFACTDETAILS_TYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ArtifactDetails.content</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ArtifactDetails.content</b></em>'.
   * @generated
   */
  public EAttribute getArtifactDetails_Content() {
    return (EAttribute) getArtifactDetailsEClass().getEAllStructuralFeatures().get(ARTIFACTDETAILS_CONTENT_FEATURE_ID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClassifier
   *          the {@link EClassifier}
   * @return the class implementing a specific {@link EClass}.
   * @generated
   */
  @Override
  public Class<?> getEClassifierClass(EClassifier eClassifier) {
    switch (eClassifier.getClassifierID()) {
      case COMMENT_CLASSIFIER_ID:
        return Comment.class;
      case ARTIFACT_CLASSIFIER_ID:
        return Artifact.class;
      case PLATFORM_CLASSIFIER_ID:
        return Platform.class;
      case AUTHOR_CLASSIFIER_ID:
        return Author.class;
      case AUTHORDETAILS_CLASSIFIER_ID:
        return AuthorDetails.class;
      case COMMENTDETAILS_CLASSIFIER_ID:
        return CommentDetails.class;
      case ARTIFACTDETAILS_CLASSIFIER_ID:
        return ArtifactDetails.class;
      default:
        throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
