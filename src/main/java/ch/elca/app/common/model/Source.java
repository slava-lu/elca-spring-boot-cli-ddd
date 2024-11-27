package ch.elca.app.common.model;

import lombok.Value;

@Value(staticConstructor = "of")
public class Source {
	
	public static final Source UNKNOWN = Source.of("n/a");
	
	String stringValue;
	
}
