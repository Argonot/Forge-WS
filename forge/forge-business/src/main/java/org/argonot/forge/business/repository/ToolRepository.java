/* This software is the exclusive property of Argonot.
 * © Argonot.fr 2015 - All rights reserved */

package org.argonot.forge.business.repository;

import org.argonot.forge.business.entity.Tool;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * <b>ToolRepository</b> provide databse access information around the tools
 * @author Meidi
 *
 */
@Transactional
public interface ToolRepository extends CrudRepository<Tool, Long>{

}
