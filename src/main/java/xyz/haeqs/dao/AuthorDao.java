package xyz.haeqs.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import xyz.haeqs.Author;
import xyz.haeqs.DbModelPackage;

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
