package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!asr")
public class Exception_Sub3_Sub2 extends Exception_Sub3 {

	@OriginalMember(owner = "client!asr", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 5)
	Exception_Sub3_Sub2(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
