package xyz.haeqs.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import xyz.haeqs.Artifact;
import xyz.haeqs.DbModelPackage;

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
