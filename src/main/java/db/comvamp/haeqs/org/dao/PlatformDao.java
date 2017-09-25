package db.comvamp.haeqs.org.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import db.comvamp.haeqs.org.DbModelPackage;
import db.comvamp.haeqs.org.Platform;

/**
 * The Dao implementation for the model object '<em><b>Platform</b></em>'.
 *
 * @generated
 */
public class PlatformDao extends BaseDao<Platform> {

  /**
   * @generated
   */
  @Override
  public Class<Platform> getEntityClass() {
    return Platform.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DbModelPackage.INSTANCE.getPlatformEClass();
  }
}
