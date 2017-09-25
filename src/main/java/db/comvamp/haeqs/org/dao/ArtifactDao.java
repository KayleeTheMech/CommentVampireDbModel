package db.comvamp.haeqs.org.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import db.comvamp.haeqs.org.Artifact;
import db.comvamp.haeqs.org.DbModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Artifact</b></em>'.
 *
 * @generated
 */
public class ArtifactDao extends BaseDao<Artifact> {

  /**
   * @generated
   */
  @Override
  public Class<Artifact> getEntityClass() {
    return Artifact.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DbModelPackage.INSTANCE.getArtifactEClass();
  }
}
