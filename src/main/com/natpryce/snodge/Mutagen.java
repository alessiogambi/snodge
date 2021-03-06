package com.natpryce.snodge;

import com.google.gson.JsonElement;

/**
 * A source of mutation within a JSON document.
 * <p>
 * A Mutagen maps an element within a JSON document, at a location described by a {@link com.natpryce.snodge.JsonPath},
 * to zero or more potential {@link com.natpryce.snodge.DocumentMutation}s that can be applied to the document.
 * <p>
 * Multiple Mutagens can be combined into a more powerful Mutagen by the
 * {@link com.natpryce.snodge.Mutagens#combine(Iterable)} function.
 *
 */
public interface Mutagen {
    /**
     * Returns zero or more mutations that can be applied to the document.
     *
     * @param document the document for which potential mutations are calculated
     * @param pathToElement the path from the root of the document to the <var>elementToMutate</var>
     * @param elementToMutate the element in the document that will be affected by the mutations returned
     * @return zero or more mutations of the entire document.
     */
    Iterable<DocumentMutation> potentialMutations(JsonElement document, JsonPath pathToElement, JsonElement elementToMutate);
}
