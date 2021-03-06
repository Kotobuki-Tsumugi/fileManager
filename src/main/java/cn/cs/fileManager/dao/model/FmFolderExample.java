package cn.cs.fileManager.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FmFolderExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table fm_folder
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table fm_folder
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table fm_folder
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_folder
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public FmFolderExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_folder
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_folder
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_folder
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_folder
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_folder
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_folder
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_folder
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_folder
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_folder
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_folder
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table fm_folder
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andFolderNameIsNull() {
			addCriterion("folder_name is null");
			return (Criteria) this;
		}

		public Criteria andFolderNameIsNotNull() {
			addCriterion("folder_name is not null");
			return (Criteria) this;
		}

		public Criteria andFolderNameEqualTo(String value) {
			addCriterion("folder_name =", value, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameNotEqualTo(String value) {
			addCriterion("folder_name <>", value, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameGreaterThan(String value) {
			addCriterion("folder_name >", value, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameGreaterThanOrEqualTo(String value) {
			addCriterion("folder_name >=", value, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameLessThan(String value) {
			addCriterion("folder_name <", value, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameLessThanOrEqualTo(String value) {
			addCriterion("folder_name <=", value, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameLike(String value) {
			addCriterion("folder_name like", value, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameNotLike(String value) {
			addCriterion("folder_name not like", value, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameIn(List<String> values) {
			addCriterion("folder_name in", values, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameNotIn(List<String> values) {
			addCriterion("folder_name not in", values, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameBetween(String value1, String value2) {
			addCriterion("folder_name between", value1, value2, "folderName");
			return (Criteria) this;
		}

		public Criteria andFolderNameNotBetween(String value1, String value2) {
			addCriterion("folder_name not between", value1, value2, "folderName");
			return (Criteria) this;
		}

		public Criteria andPIdIsNull() {
			addCriterion("p_id is null");
			return (Criteria) this;
		}

		public Criteria andPIdIsNotNull() {
			addCriterion("p_id is not null");
			return (Criteria) this;
		}

		public Criteria andPIdEqualTo(Long value) {
			addCriterion("p_id =", value, "pId");
			return (Criteria) this;
		}

		public Criteria andPIdNotEqualTo(Long value) {
			addCriterion("p_id <>", value, "pId");
			return (Criteria) this;
		}

		public Criteria andPIdGreaterThan(Long value) {
			addCriterion("p_id >", value, "pId");
			return (Criteria) this;
		}

		public Criteria andPIdGreaterThanOrEqualTo(Long value) {
			addCriterion("p_id >=", value, "pId");
			return (Criteria) this;
		}

		public Criteria andPIdLessThan(Long value) {
			addCriterion("p_id <", value, "pId");
			return (Criteria) this;
		}

		public Criteria andPIdLessThanOrEqualTo(Long value) {
			addCriterion("p_id <=", value, "pId");
			return (Criteria) this;
		}

		public Criteria andPIdIn(List<Long> values) {
			addCriterion("p_id in", values, "pId");
			return (Criteria) this;
		}

		public Criteria andPIdNotIn(List<Long> values) {
			addCriterion("p_id not in", values, "pId");
			return (Criteria) this;
		}

		public Criteria andPIdBetween(Long value1, Long value2) {
			addCriterion("p_id between", value1, value2, "pId");
			return (Criteria) this;
		}

		public Criteria andPIdNotBetween(Long value1, Long value2) {
			addCriterion("p_id not between", value1, value2, "pId");
			return (Criteria) this;
		}

		public Criteria andOwnerIsNull() {
			addCriterion("owner is null");
			return (Criteria) this;
		}

		public Criteria andOwnerIsNotNull() {
			addCriterion("owner is not null");
			return (Criteria) this;
		}

		public Criteria andOwnerEqualTo(String value) {
			addCriterion("owner =", value, "owner");
			return (Criteria) this;
		}

		public Criteria andOwnerNotEqualTo(String value) {
			addCriterion("owner <>", value, "owner");
			return (Criteria) this;
		}

		public Criteria andOwnerGreaterThan(String value) {
			addCriterion("owner >", value, "owner");
			return (Criteria) this;
		}

		public Criteria andOwnerGreaterThanOrEqualTo(String value) {
			addCriterion("owner >=", value, "owner");
			return (Criteria) this;
		}

		public Criteria andOwnerLessThan(String value) {
			addCriterion("owner <", value, "owner");
			return (Criteria) this;
		}

		public Criteria andOwnerLessThanOrEqualTo(String value) {
			addCriterion("owner <=", value, "owner");
			return (Criteria) this;
		}

		public Criteria andOwnerLike(String value) {
			addCriterion("owner like", value, "owner");
			return (Criteria) this;
		}

		public Criteria andOwnerNotLike(String value) {
			addCriterion("owner not like", value, "owner");
			return (Criteria) this;
		}

		public Criteria andOwnerIn(List<String> values) {
			addCriterion("owner in", values, "owner");
			return (Criteria) this;
		}

		public Criteria andOwnerNotIn(List<String> values) {
			addCriterion("owner not in", values, "owner");
			return (Criteria) this;
		}

		public Criteria andOwnerBetween(String value1, String value2) {
			addCriterion("owner between", value1, value2, "owner");
			return (Criteria) this;
		}

		public Criteria andOwnerNotBetween(String value1, String value2) {
			addCriterion("owner not between", value1, value2, "owner");
			return (Criteria) this;
		}

		public Criteria andBaseDirIsNull() {
			addCriterion("base_dir is null");
			return (Criteria) this;
		}

		public Criteria andBaseDirIsNotNull() {
			addCriterion("base_dir is not null");
			return (Criteria) this;
		}

		public Criteria andBaseDirEqualTo(String value) {
			addCriterion("base_dir =", value, "baseDir");
			return (Criteria) this;
		}

		public Criteria andBaseDirNotEqualTo(String value) {
			addCriterion("base_dir <>", value, "baseDir");
			return (Criteria) this;
		}

		public Criteria andBaseDirGreaterThan(String value) {
			addCriterion("base_dir >", value, "baseDir");
			return (Criteria) this;
		}

		public Criteria andBaseDirGreaterThanOrEqualTo(String value) {
			addCriterion("base_dir >=", value, "baseDir");
			return (Criteria) this;
		}

		public Criteria andBaseDirLessThan(String value) {
			addCriterion("base_dir <", value, "baseDir");
			return (Criteria) this;
		}

		public Criteria andBaseDirLessThanOrEqualTo(String value) {
			addCriterion("base_dir <=", value, "baseDir");
			return (Criteria) this;
		}

		public Criteria andBaseDirLike(String value) {
			addCriterion("base_dir like", value, "baseDir");
			return (Criteria) this;
		}

		public Criteria andBaseDirNotLike(String value) {
			addCriterion("base_dir not like", value, "baseDir");
			return (Criteria) this;
		}

		public Criteria andBaseDirIn(List<String> values) {
			addCriterion("base_dir in", values, "baseDir");
			return (Criteria) this;
		}

		public Criteria andBaseDirNotIn(List<String> values) {
			addCriterion("base_dir not in", values, "baseDir");
			return (Criteria) this;
		}

		public Criteria andBaseDirBetween(String value1, String value2) {
			addCriterion("base_dir between", value1, value2, "baseDir");
			return (Criteria) this;
		}

		public Criteria andBaseDirNotBetween(String value1, String value2) {
			addCriterion("base_dir not between", value1, value2, "baseDir");
			return (Criteria) this;
		}

		public Criteria andRegDateIsNull() {
			addCriterion("reg_date is null");
			return (Criteria) this;
		}

		public Criteria andRegDateIsNotNull() {
			addCriterion("reg_date is not null");
			return (Criteria) this;
		}

		public Criteria andRegDateEqualTo(Date value) {
			addCriterion("reg_date =", value, "regDate");
			return (Criteria) this;
		}

		public Criteria andRegDateNotEqualTo(Date value) {
			addCriterion("reg_date <>", value, "regDate");
			return (Criteria) this;
		}

		public Criteria andRegDateGreaterThan(Date value) {
			addCriterion("reg_date >", value, "regDate");
			return (Criteria) this;
		}

		public Criteria andRegDateGreaterThanOrEqualTo(Date value) {
			addCriterion("reg_date >=", value, "regDate");
			return (Criteria) this;
		}

		public Criteria andRegDateLessThan(Date value) {
			addCriterion("reg_date <", value, "regDate");
			return (Criteria) this;
		}

		public Criteria andRegDateLessThanOrEqualTo(Date value) {
			addCriterion("reg_date <=", value, "regDate");
			return (Criteria) this;
		}

		public Criteria andRegDateIn(List<Date> values) {
			addCriterion("reg_date in", values, "regDate");
			return (Criteria) this;
		}

		public Criteria andRegDateNotIn(List<Date> values) {
			addCriterion("reg_date not in", values, "regDate");
			return (Criteria) this;
		}

		public Criteria andRegDateBetween(Date value1, Date value2) {
			addCriterion("reg_date between", value1, value2, "regDate");
			return (Criteria) this;
		}

		public Criteria andRegDateNotBetween(Date value1, Date value2) {
			addCriterion("reg_date not between", value1, value2, "regDate");
			return (Criteria) this;
		}

		public Criteria andRegAccountIsNull() {
			addCriterion("reg_account is null");
			return (Criteria) this;
		}

		public Criteria andRegAccountIsNotNull() {
			addCriterion("reg_account is not null");
			return (Criteria) this;
		}

		public Criteria andRegAccountEqualTo(String value) {
			addCriterion("reg_account =", value, "regAccount");
			return (Criteria) this;
		}

		public Criteria andRegAccountNotEqualTo(String value) {
			addCriterion("reg_account <>", value, "regAccount");
			return (Criteria) this;
		}

		public Criteria andRegAccountGreaterThan(String value) {
			addCriterion("reg_account >", value, "regAccount");
			return (Criteria) this;
		}

		public Criteria andRegAccountGreaterThanOrEqualTo(String value) {
			addCriterion("reg_account >=", value, "regAccount");
			return (Criteria) this;
		}

		public Criteria andRegAccountLessThan(String value) {
			addCriterion("reg_account <", value, "regAccount");
			return (Criteria) this;
		}

		public Criteria andRegAccountLessThanOrEqualTo(String value) {
			addCriterion("reg_account <=", value, "regAccount");
			return (Criteria) this;
		}

		public Criteria andRegAccountLike(String value) {
			addCriterion("reg_account like", value, "regAccount");
			return (Criteria) this;
		}

		public Criteria andRegAccountNotLike(String value) {
			addCriterion("reg_account not like", value, "regAccount");
			return (Criteria) this;
		}

		public Criteria andRegAccountIn(List<String> values) {
			addCriterion("reg_account in", values, "regAccount");
			return (Criteria) this;
		}

		public Criteria andRegAccountNotIn(List<String> values) {
			addCriterion("reg_account not in", values, "regAccount");
			return (Criteria) this;
		}

		public Criteria andRegAccountBetween(String value1, String value2) {
			addCriterion("reg_account between", value1, value2, "regAccount");
			return (Criteria) this;
		}

		public Criteria andRegAccountNotBetween(String value1, String value2) {
			addCriterion("reg_account not between", value1, value2, "regAccount");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNull() {
			addCriterion("description is null");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNotNull() {
			addCriterion("description is not null");
			return (Criteria) this;
		}

		public Criteria andDescriptionEqualTo(String value) {
			addCriterion("description =", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotEqualTo(String value) {
			addCriterion("description <>", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThan(String value) {
			addCriterion("description >", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("description >=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThan(String value) {
			addCriterion("description <", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThanOrEqualTo(String value) {
			addCriterion("description <=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLike(String value) {
			addCriterion("description like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotLike(String value) {
			addCriterion("description not like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("description in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotIn(List<String> values) {
			addCriterion("description not in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionBetween(String value1, String value2) {
			addCriterion("description between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotBetween(String value1, String value2) {
			addCriterion("description not between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andValidIsNull() {
			addCriterion("valid is null");
			return (Criteria) this;
		}

		public Criteria andValidIsNotNull() {
			addCriterion("valid is not null");
			return (Criteria) this;
		}

		public Criteria andValidEqualTo(String value) {
			addCriterion("valid =", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidNotEqualTo(String value) {
			addCriterion("valid <>", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidGreaterThan(String value) {
			addCriterion("valid >", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidGreaterThanOrEqualTo(String value) {
			addCriterion("valid >=", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidLessThan(String value) {
			addCriterion("valid <", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidLessThanOrEqualTo(String value) {
			addCriterion("valid <=", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidLike(String value) {
			addCriterion("valid like", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidNotLike(String value) {
			addCriterion("valid not like", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidIn(List<String> values) {
			addCriterion("valid in", values, "valid");
			return (Criteria) this;
		}

		public Criteria andValidNotIn(List<String> values) {
			addCriterion("valid not in", values, "valid");
			return (Criteria) this;
		}

		public Criteria andValidBetween(String value1, String value2) {
			addCriterion("valid between", value1, value2, "valid");
			return (Criteria) this;
		}

		public Criteria andValidNotBetween(String value1, String value2) {
			addCriterion("valid not between", value1, value2, "valid");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table fm_folder
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fm_folder
     *
     * @mbg.generated do_not_delete_during_merge Sun Dec 02 21:55:10 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}