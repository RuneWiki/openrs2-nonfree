package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aju")
public class Exception_Sub7 extends Exception {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aju", name = "this$0", descriptor = "Lclient!fi;")
	final Class173 this$0;

	@OriginalMember(owner = "client!aju", name = "<init>", descriptor = "(Lclient!fi;II)V", line = 40)
	Exception_Sub7(@OriginalArg(0) Class173 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super("");
		this.this$0 = arg0;
	}
}
