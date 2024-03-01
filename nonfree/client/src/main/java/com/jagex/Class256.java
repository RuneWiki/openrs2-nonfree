package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public class Class256 {

	@OriginalMember(owner = "client!jh", name = "ab", descriptor = "I")
	static int anInt4194;

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "Lclient!jh;")
	public static final Class256 aClass256_6 = new Class256();

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "Lclient!jh;")
	public static final Class256 aClass256_2 = new Class256();

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "Lclient!jh;")
	public static final Class256 aClass256_4 = new Class256();

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "Lclient!jh;")
	public static final Class256 aClass256_5 = new Class256();

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "Lclient!jh;")
	public static final Class256 aClass256_3 = new Class256();

	@OriginalMember(owner = "client!jh", name = "x", descriptor = "Lclient!jh;")
	public static final Class256 aClass256_7 = new Class256();

	@OriginalMember(owner = "client!jh", name = "s", descriptor = "Lclient!jh;")
	public static final Class256 aClass256_8 = new Class256();

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V", line = 32)
	Class256() {
	}

	@OriginalMember(owner = "client!jh", name = "lc", descriptor = "(II)V", line = 11206)
	static final void method25225(@OriginalArg(0) int arg0) {
		Class13_Sub21.method7241();
		@Pc(10) int local10 = ((Class11_Sub1) Class429.aClass70_Sub1_Sub1_2.method14717(arg0)).anInt98 * 949318953;
		if (local10 == 0) {
			return;
		}
		@Pc(21) int local21 = Class424.aClass165_1.method32385(Class429.aClass70_Sub1_Sub1_2.method14717(arg0));
		if (local10 == 5) {
			client.anInt3119 = local21 * 1309729645;
		}
		if (local10 == 6) {
			client.anInt3196 = local21 * -571959649;
		}
	}
}
