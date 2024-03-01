package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ant")
public class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "client!ant", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 413)
	public RuntimeException_Sub2(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
