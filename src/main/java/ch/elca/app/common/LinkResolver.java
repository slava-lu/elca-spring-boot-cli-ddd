package ch.elca.app.common;

import java.util.Optional;

public interface LinkResolver {

	default Optional<String> resolveLinkTo(Object target) {
		return Optional.empty();
	}
	
}