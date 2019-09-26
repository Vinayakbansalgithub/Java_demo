package SelFrDemo;



	import java.awt.AWTException;
	import java.awt.Dimension;
	import java.awt.Robot;
	import java.awt.event.InputEvent;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.net.URL;
	import java.nio.charset.Charset;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collection;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.List;
	import java.util.ListIterator;
	import java.util.Map;
	import java.util.Optional;
	import java.util.Random;
	import java.util.StringTokenizer;
	import java.util.concurrent.ExecutionException;
	import java.util.function.Supplier;
	import java.util.stream.Collectors;


	class ImmutableBuilderExample {
		private final String username;
		private final String password;
		private final String firstname;
		private final String lastname;
		private final String email;

		private ImmutableBuilderExample(UserBuilder builder) {
			this.username = builder.username;
			this.password = builder.password;
			this.firstname = builder.firstname;
			this.lastname = builder.lastname;
			this.email = builder.email;
		}

		public static class UserBuilder {
			private final String username;
			private final String password;
			private String firstname;
			private String lastname;
			private String email;

			public UserBuilder(String username, String password) {
				this.username = username;
				this.password = password;
			}

			public UserBuilder firstName(String firsname) {
				this.firstname = firsname;
				return this;
			}

			public UserBuilder lastName(String lastname) {
				this.lastname = lastname;
				return this;
			}

			public UserBuilder email(String email) {
				this.email = email;
				return this;
			}

			public ImmutableBuilderExample build() {
				return new ImmutableBuilderExample(this);
			}
		}

		public String getUsername() {
			return username;
		}

		public String getPassword() {
			return password;
		}

		public String getFirstname() {
			return firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public String getEmail() {
			return email;
		}

		
	
	public static void main(String[] args) {
		System.out.println("jj");
		ImmutableBuilderExample user = new ImmutableBuilderExample.UserBuilder("shekhar", "password").firstName("shekhar")
				.lastName("gulati").email("shekhargulati84@gmail.com").build();
	}


}
