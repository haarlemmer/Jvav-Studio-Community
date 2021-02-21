// Generated by delombok at Wed Oct 02 19:12:43 GMT 2019

import lombok.experimental.Tolerate;

public class BuilderWithTolerate {
	private final int value;

	public static void main(String[] args) {
		BuilderWithTolerate.builder().value("42").build();
	}


	public static class BuilderWithTolerateBuilder {
		@java.lang.SuppressWarnings("all")
		private int value;

		@Tolerate
		public BuilderWithTolerateBuilder value(String s) {
			return this.value(Integer.parseInt(s));
		}

		@java.lang.SuppressWarnings("all")
		BuilderWithTolerateBuilder() {
		}

		@java.lang.SuppressWarnings("all")
		public BuilderWithTolerateBuilder value(final int value) {
			this.value = value;
			return this;
		}

		@java.lang.SuppressWarnings("all")
		public BuilderWithTolerate build() {
			return new BuilderWithTolerate(value);
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "BuilderWithTolerate.BuilderWithTolerateBuilder(value=" + this.value + ")";
		}
	}

	@java.lang.SuppressWarnings("all")
	BuilderWithTolerate(final int value) {
		this.value = value;
	}

	@java.lang.SuppressWarnings("all")
	public static BuilderWithTolerateBuilder builder() {
		return new BuilderWithTolerateBuilder();
	}
}