package db.comvamp.haeqs.org.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import db.comvamp.haeqs.org.Author;
import db.comvamp.haeqs.org.DbModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Author</b></em>'.
 *
 * @generated
 */
public class AuthorDao extends BaseDao<Author> {

  /**
   * @generated
   */
  @Override
  public Class<Author> getEntityClass() {
    return Author.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DbModelPackage.INSTANCE.getAuthorEClass();
  }
}
