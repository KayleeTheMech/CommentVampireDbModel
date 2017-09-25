package db.comvamp.haeqs.org.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import db.comvamp.haeqs.org.ArtifactDetails;
import db.comvamp.haeqs.org.DbModelPackage;

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
