/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbc.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookStore implements org.jooq.test.jdbc.generatedclasses.tables.interfaces.ITBookStore {

	private static final long serialVersionUID = -144798121;

	private java.lang.String name;

	public TBookStore() {}

	public TBookStore(
		java.lang.String name
	) {
		this.name = name;
	}

	@Override
	public java.lang.String getName() {
		return this.name;
	}

	@Override
	public void setName(java.lang.String name) {
		this.name = name;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbc.generatedclasses.tables.interfaces.ITBookStore from) {
		setName(from.getName());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbc.generatedclasses.tables.interfaces.ITBookStore> E into(E into) {
		into.from(this);
		return into;
	}
}