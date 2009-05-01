/**
 * 
 */
package org.ddialliance.ddieditor.model.conceptual;

import java.util.List;

import org.ddialliance.ddieditor.model.lightxmlobject.LightXmlObjectType;

/**
 * @author ddajvj
 * 
 */
public class ConceptualElement {
	private ConceptualType type;
	private LightXmlObjectType value;

	public ConceptualElement(ConceptualType type, LightXmlObjectType value) {
		super();
		this.type = type;
		this.value = value;
	}

	public ConceptualType getType() {
		return type;
	}

	public void setType(ConceptualType type) {
		this.type = type;
	}

	public LightXmlObjectType getValue() {
		return value;
	}

	@Override
	public String toString() {		
		return type+", value: "+value;
	}
}
