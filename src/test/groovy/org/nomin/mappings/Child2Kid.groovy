package org.nomin.mappings

import org.nomin.Mapping
import org.nomin.entity.Child
import org.nomin.entity.Kid

/**
 * Just a mapping.
 * @author Dmitry Dobrynin
 * Created 16.04.2010 18:58:51
 */
class Child2Kid extends Mapping {
  protected void build() {
    mappingFor a: Child, b: Kid
    a.name = b.kidName
  }
}
