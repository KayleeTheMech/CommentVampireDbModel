package xyz.haeqs.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import xyz.haeqs.ArtifactDetails;
import xyz.haeqs.DbModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ArtifactDetails</b></em>'.
 *
 * @generated
 */
public class ArtifactDetailsDao extends BaseDao<ArtifactDetails> {

  /**
   * @generated
   */
  @Override
  public Class<ArtifactDetails> getEntityClass() {
    return ArtifactDetails.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DbModelPackage.INSTANCE.getArtifactDetailsEClass();
  }
}
