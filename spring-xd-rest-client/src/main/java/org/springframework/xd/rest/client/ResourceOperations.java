/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.xd.rest.client;

/**
 * Operations common to resources like Stream and Job.
 * 
 * @author Ilayaperumal Gopinathan
 */
public interface ResourceOperations {

	/**
	 * Deploy an already created resource.
	 */
	public void deploy(String name);

	/**
	 * Undeploy a deployed resource, retaining its definition.
	 */
	public void undeploy(String name);

	/**
	 * Destroy an existing resource.
	 */
	public void destroy(String name);

	/**
	 * Deploy all the resources known to the system.
	 */
	public void deployAll();

	/**
	 * Undeploy all the resources known to the system.
	 */
	public void undeployAll();

	/**
	 * Undeploy all the resources known to the system.
	 */
	public void destroyAll();

}
