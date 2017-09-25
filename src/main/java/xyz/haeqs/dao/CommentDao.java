package xyz.haeqs.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import xyz.haeqs.Comment;
import xyz.haeqs.DbModelPackage;

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
