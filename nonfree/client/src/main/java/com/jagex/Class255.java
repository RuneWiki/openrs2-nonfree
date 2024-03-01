package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class Class255 {

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "Lclient!jg;")
	public static final Class255 aClass255_4 = new Class255(2);

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "Lclient!jg;")
	public static final Class255 aClass255_2 = new Class255(0);

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Lclient!jg;")
	public static final Class255 aClass255_1 = new Class255(1);

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "Lclient!jg;")
	public static final Class255 aClass255_3 = new Class255(3);

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
	public final int anInt4193;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V", line = 11)
	Class255(@OriginalArg(0) int arg0) {
		this.anInt4193 = arg0;
	}
}
