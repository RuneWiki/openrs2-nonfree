package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class Class380 {

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "Lclient!lm;")
	public static final Class380 aClass380_5 = new Class380(2);

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "Lclient!lm;")
	public static final Class380 aClass380_4 = new Class380(0);

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "Lclient!lm;")
	public static final Class380 aClass380_6 = new Class380(1);

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "Lclient!lm;")
	public static final Class380 aClass380_7 = new Class380(3);

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
	public final int anInt4581;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(I)V", line = 11)
	Class380(@OriginalArg(0) int arg0) {
		this.anInt4581 = arg0;
	}
}
