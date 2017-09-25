package db.comvamp.haeqs.org.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import db.comvamp.haeqs.org.CommentDetails;
import db.comvamp.haeqs.org.DbModelPackage;

/**
 * The Dao implementation for the model object '<em><b>CommentDetails</b></em>'.
 *
 * @generated
 */
public class CommentDetailsDao extends BaseDao<CommentDetails> {

  /**
   * @generated
   */
  @Override
  public Class<CommentDetails> getEntityClass() {
    return CommentDetails.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DbModelPackage.INSTANCE.getCommentDetailsEClass();
  }
}
