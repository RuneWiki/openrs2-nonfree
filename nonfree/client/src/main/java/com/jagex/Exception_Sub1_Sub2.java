package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anw")
public class Exception_Sub1_Sub2 extends Exception_Sub1 {

	@OriginalMember(owner = "client!anw", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 5)
	Exception_Sub1_Sub2(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
