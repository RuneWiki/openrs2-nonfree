package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class Class383 {

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "Lclient!lp;")
	public static final Class383 aClass383_4 = new Class383(2);

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "Lclient!lp;")
	public static final Class383 aClass383_2 = new Class383(0);

	@OriginalMember(owner = "client!lp", name = "v", descriptor = "Lclient!lp;")
	public static final Class383 aClass383_1 = new Class383(1);

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "Lclient!lp;")
	public static final Class383 aClass383_3 = new Class383(3);

	@OriginalMember(owner = "client!lp", name = "y", descriptor = "I")
	public final int anInt4585;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(I)V", line = 11)
	Class383(@OriginalArg(0) int arg0) {
		this.anInt4585 = arg0;
	}
}
