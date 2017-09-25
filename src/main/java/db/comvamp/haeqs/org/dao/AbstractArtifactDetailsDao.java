package db.comvamp.haeqs.org.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import db.comvamp.haeqs.org.AbstractArtifactDetails;
import db.comvamp.haeqs.org.DbModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractArtifactDetails</b></em>'.
 *
 * @generated
 */
public class AbstractArtifactDetailsDao extends BaseDao<AbstractArtifactDetails> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractArtifactDetails> getEntityClass() {
    return AbstractArtifactDetails.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DbModelPackage.INSTANCE.getAbstractArtifactDetailsEClass();
  }
}
