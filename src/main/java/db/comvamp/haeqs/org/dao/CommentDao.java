package db.comvamp.haeqs.org.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import db.comvamp.haeqs.org.Comment;
import db.comvamp.haeqs.org.DbModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Comment</b></em>'.
 *
 * @generated
 */
public class CommentDao extends BaseDao<Comment> {

  /**
   * @generated
   */
  @Override
  public Class<Comment> getEntityClass() {
    return Comment.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DbModelPackage.INSTANCE.getCommentEClass();
  }
}
