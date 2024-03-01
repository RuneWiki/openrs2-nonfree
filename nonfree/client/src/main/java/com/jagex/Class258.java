package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class Class258 {

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "Lclient!jm;")
	public static final Class258 aClass258_7 = new Class258(2);

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "Lclient!jm;")
	public static final Class258 aClass258_5 = new Class258(1);

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "Lclient!jm;")
	public static final Class258 aClass258_4 = new Class258(0);

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "Lclient!jm;")
	public static final Class258 aClass258_6 = new Class258(3);

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
	public final int anInt4195;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I)V", line = 11)
	Class258(@OriginalArg(0) int arg0) {
		this.anInt4195 = arg0;
	}
}
