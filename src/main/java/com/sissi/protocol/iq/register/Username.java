package com.sissi.protocol.iq.register;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import com.sissi.read.Mapping.MappingMetadata;
import com.sissi.ucenter.RegisterContext.Field;

/**
 * @author kim 2013年12月3日
 */
@MappingMetadata(uri = "jabber:iq:register", localName = "username")
@XmlRootElement(name = "username")
public class Username implements Field {

	public final static Username FIELD = new Username();

	private final static String NAME = "username";

	private String text;

	@XmlValue
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String getName() {
		return NAME;
	}
}