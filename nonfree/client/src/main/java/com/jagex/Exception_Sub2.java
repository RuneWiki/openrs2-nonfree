package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apc")
public class Exception_Sub2 extends Exception {

	@OriginalMember(owner = "client!apc", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 5)
	public Exception_Sub2(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!apc", name = "akg", descriptor = "(Lclient!yf;B)V", line = 11714)
	static final void method23637(@OriginalArg(0) Class681 arg0) {
		Class159_Sub1.aBoolean351 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] == 1;
	}
}
