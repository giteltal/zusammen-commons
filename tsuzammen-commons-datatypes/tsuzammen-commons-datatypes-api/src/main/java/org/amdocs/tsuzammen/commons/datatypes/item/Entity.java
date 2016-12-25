/*
 * Copyright © 2016 Amdocs Software Systems Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.amdocs.tsuzammen.commons.datatypes.item;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface Entity extends Element {

  Map<String, Content> getContents();

  void setContents(Map<String, Content> contents);

/*
  Content getContent(String contentName);

  void setContent(String contentName, Content content);*/

  List<Relation> getRelations();

  void setRelations(List<Relation> relations);

  InputStream getData();

  void setData(InputStream data);

  InputStream getSearchData();

  void setSearchData(InputStream searchData);

  InputStream getVisualization();

  void setVisualization(InputStream visualization);

  default boolean isContent(){return false;}
}
