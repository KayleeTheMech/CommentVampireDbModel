package xyz.haeqs.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import xyz.haeqs.AuthorDetails;
import xyz.haeqs.DbModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AuthorDetails</b></em>'.
 *
 * @generated
 */
public class AuthorDetailsDao extends BaseDao<AuthorDetails> {

  /**
   * @generated
   */
  @Override
  public Class<AuthorDetails> getEntityClass() {
    return AuthorDetails.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DbModelPackage.INSTANCE.getAuthorDetailsEClass();
  }
}
