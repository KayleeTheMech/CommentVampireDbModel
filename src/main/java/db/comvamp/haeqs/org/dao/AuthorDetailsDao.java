package db.comvamp.haeqs.org.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import db.comvamp.haeqs.org.AuthorDetails;
import db.comvamp.haeqs.org.DbModelPackage;

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
