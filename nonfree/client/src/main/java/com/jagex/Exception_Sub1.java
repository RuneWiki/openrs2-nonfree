package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aje")
public class Exception_Sub1 extends Exception {

	@OriginalMember(owner = "client!aje", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 5)
	public Exception_Sub1(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
