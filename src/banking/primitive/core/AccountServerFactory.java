package banking.primitive.core;
/*
File:
Author:
Date:

Description:
*/

/**
Class:

Description:
*/

/**
Method:
Inputs:
Returns:

Description:
*/

public class AccountServerFactory {

	protected static AccountServerFactory singleton = null;

	protected AccountServerFactory() {

	}

	public static AccountServerFactory getMe() {
		if (singleton == null) {
			singleton = new AccountServerFactory();
		}

		return singleton;
	}

	public AccountServer lookup() {
		return new ServerSolution();
	}
}
