package db.comvamp.haeqs.org.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import db.comvamp.haeqs.org.AbstractArtifact;
import db.comvamp.haeqs.org.DbModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractArtifact</b></em>'.
 *
 * @generated
 */
public class AbstractArtifactDao extends BaseDao<AbstractArtifact> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractArtifact> getEntityClass() {
    return AbstractArtifact.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DbModelPackage.INSTANCE.getAbstractArtifactEClass();
  }
}
