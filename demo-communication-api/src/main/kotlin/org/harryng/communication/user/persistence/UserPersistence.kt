package org.harryng.communication.user.persistence

import org.harryng.communication.base.persistence.BaseSearchablePersistence
import org.harryng.communication.user.entity.UserImpl

interface UserPersistence : BaseSearchablePersistence<Long, UserImpl>
