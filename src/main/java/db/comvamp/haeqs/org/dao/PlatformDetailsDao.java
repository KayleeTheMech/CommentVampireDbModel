package db.comvamp.haeqs.org.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import db.comvamp.haeqs.org.DbModelPackage;
import db.comvamp.haeqs.org.PlatformDetails;

/**
 * The Dao implementation for the model object '<em><b>PlatformDetails</b></em>'.
 *
 * @generated
 */
public class PlatformDetailsDao extends BaseDao<PlatformDetails> {

  /**
   * @generated
   */
  @Override
  public Class<PlatformDetails> getEntityClass() {
    return PlatformDetails.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DbModelPackage.INSTANCE.getPlatformDetailsEClass();
  }
}
