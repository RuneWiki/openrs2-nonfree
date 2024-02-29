package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aos")
public class Exception_Sub5 extends Exception {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aos", name = "this$0", descriptor = "Lclient!ha;")
	final Class292 this$0;

	@OriginalMember(owner = "client!aos", name = "<init>", descriptor = "(Lclient!ha;II)V", line = 40)
	Exception_Sub5(@OriginalArg(0) Class292 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super("");
		this.this$0 = arg0;
	}
}
