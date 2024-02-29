package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aou")
public final class Exception_Sub6 extends Exception {

	@OriginalMember(owner = "client!aou", name = "<init>", descriptor = "(Ljava/lang/String;II)V", line = 5)
	Exception_Sub6(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super("");
	}

	@OriginalMember(owner = "client!aou", name = "y", descriptor = "(II)I", line = 47)
	static final int method18118(@OriginalArg(0) int arg0) {
		return arg0 < 7 ? 9 : 11;
	}
}
