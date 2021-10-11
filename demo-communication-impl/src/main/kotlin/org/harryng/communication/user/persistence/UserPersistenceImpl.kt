package org.harryng.communication.user.persistence

import org.harryng.communication.base.persistence.AbstractSearchablePersistence
import org.harryng.communication.user.entity.UserImpl


class UserPersistenceImpl : AbstractSearchablePersistence<Long, UserImpl>(UserImpl::class.java), UserPersistence
