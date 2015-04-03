/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.aurora.engine;

/**
 *
 * @author Daniel Fern&aacute;ndez
 * @since 3.0.0
 *
 */
public interface ITemplateHandlerEventQueue {

    public int size();
    public ITemplateHandlerEvent get(final int pos);

    public void add(final ITemplateHandlerEvent event);
    public void addAll(final ITemplateHandlerEventQueue eventQueue);

    public void insert(final int pos, final ITemplateHandlerEvent event);
    public void insertAll(final int pos, final ITemplateHandlerEventQueue eventQueue);

    public void process(final ITemplateHandler handler);

    public void reset();

}