package xyz.haeqs.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import xyz.haeqs.DbModelPackage;
import xyz.haeqs.Platform;

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
