/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.service.foo.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Foo service. Represents a row in the &quot;FOO_Foo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.service.foo.model.impl.FooModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.service.foo.model.impl.FooImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Foo
 * @see com.liferay.service.foo.model.impl.FooImpl
 * @see com.liferay.service.foo.model.impl.FooModelImpl
 * @generated
 */
@ProviderType
public interface FooModel extends BaseModel<Foo>, GroupedModel, ShardedModel,
	StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a foo model instance should use the {@link Foo} interface instead.
	 */

	/**
	 * Returns the primary key of this foo.
	 *
	 * @return the primary key of this foo
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this foo.
	 *
	 * @param primaryKey the primary key of this foo
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this foo.
	 *
	 * @return the uuid of this foo
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this foo.
	 *
	 * @param uuid the uuid of this foo
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the foo ID of this foo.
	 *
	 * @return the foo ID of this foo
	 */
	public long getFooId();

	/**
	 * Sets the foo ID of this foo.
	 *
	 * @param fooId the foo ID of this foo
	 */
	public void setFooId(long fooId);

	/**
	 * Returns the group ID of this foo.
	 *
	 * @return the group ID of this foo
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this foo.
	 *
	 * @param groupId the group ID of this foo
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this foo.
	 *
	 * @return the company ID of this foo
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this foo.
	 *
	 * @param companyId the company ID of this foo
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this foo.
	 *
	 * @return the user ID of this foo
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this foo.
	 *
	 * @param userId the user ID of this foo
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this foo.
	 *
	 * @return the user uuid of this foo
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this foo.
	 *
	 * @param userUuid the user uuid of this foo
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this foo.
	 *
	 * @return the user name of this foo
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this foo.
	 *
	 * @param userName the user name of this foo
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this foo.
	 *
	 * @return the create date of this foo
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this foo.
	 *
	 * @param createDate the create date of this foo
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this foo.
	 *
	 * @return the modified date of this foo
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this foo.
	 *
	 * @param modifiedDate the modified date of this foo
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the field1 of this foo.
	 *
	 * @return the field1 of this foo
	 */
	@AutoEscape
	public String getField1();

	/**
	 * Sets the field1 of this foo.
	 *
	 * @param field1 the field1 of this foo
	 */
	public void setField1(String field1);

	/**
	 * Returns the field2 of this foo.
	 *
	 * @return the field2 of this foo
	 */
	public boolean getField2();

	/**
	 * Returns <code>true</code> if this foo is field2.
	 *
	 * @return <code>true</code> if this foo is field2; <code>false</code> otherwise
	 */
	public boolean isField2();

	/**
	 * Sets whether this foo is field2.
	 *
	 * @param field2 the field2 of this foo
	 */
	public void setField2(boolean field2);

	/**
	 * Returns the field3 of this foo.
	 *
	 * @return the field3 of this foo
	 */
	public int getField3();

	/**
	 * Sets the field3 of this foo.
	 *
	 * @param field3 the field3 of this foo
	 */
	public void setField3(int field3);

	/**
	 * Returns the field4 of this foo.
	 *
	 * @return the field4 of this foo
	 */
	public Date getField4();

	/**
	 * Sets the field4 of this foo.
	 *
	 * @param field4 the field4 of this foo
	 */
	public void setField4(Date field4);

	/**
	 * Returns the field5 of this foo.
	 *
	 * @return the field5 of this foo
	 */
	@AutoEscape
	public String getField5();

	/**
	 * Sets the field5 of this foo.
	 *
	 * @param field5 the field5 of this foo
	 */
	public void setField5(String field5);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Foo foo);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Foo> toCacheModel();

	@Override
	public Foo toEscapedModel();

	@Override
	public Foo toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}