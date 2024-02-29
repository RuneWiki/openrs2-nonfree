package com.jagex;

import java.awt.Canvas;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public class Class592 {

	@OriginalMember(owner = "client!vc", name = "gq", descriptor = "Ljava/util/Map;")
	public static Map aMap21;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "Lclient!vc;")
	static final Class592 aClass592_3 = new Class592(0);

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!vc;")
	static final Class592 aClass592_2 = new Class592(1);

	@OriginalMember(owner = "client!vc", name = "v", descriptor = "Lclient!vc;")
	static final Class592 aClass592_1 = new Class592(2);

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
	final int anInt5500;

	@OriginalMember(owner = "client!vc", name = "v", descriptor = "()[Lclient!vc;", line = 11)
	static Class592[] method31831() {
		return new Class592[] { aClass592_2, aClass592_3, aClass592_1 };
	}

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "()[Lclient!vc;", line = 11)
	static Class592[] method31832() {
		return new Class592[] { aClass592_2, aClass592_3, aClass592_1 };
	}

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "()[Lclient!vc;", line = 11)
	static Class592[] method31833() {
		return new Class592[] { aClass592_2, aClass592_3, aClass592_1 };
	}

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "()[Lclient!vc;", line = 11)
	static Class592[] method31834() {
		return new Class592[] { aClass592_2, aClass592_3, aClass592_1 };
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I)V", line = 14)
	Class592(@OriginalArg(0) int arg0) {
		this.anInt5500 = arg0 * -1232506795;
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(Lclient!aeh;Ljava/awt/Canvas;IIS)Lclient!aoh;", line = 18)
	static Class92_Sub2_Sub2 method31835(@OriginalArg(0) Class86_Sub2 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class92_Sub2_Sub2_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "(I)Lclient!vc;", line = 20)
	static Class592 method31836(@OriginalArg(0) int arg0) {
		@Pc(2) Class592[] local2 = Class97.method7765();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class592 local12 = local2[local4];
			if (local12.anInt5500 * 1296567549 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "(I)Lclient!vc;", line = 20)
	static Class592 method31837(@OriginalArg(0) int arg0) {
		@Pc(2) Class592[] local2 = Class97.method7765();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class592 local12 = local2[local4];
			if (local12.anInt5500 * 1296567549 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vc", name = "ali", descriptor = "(Lclient!yf;I)V", line = 11643)
	static final void method31838(@OriginalArg(0) Class665 arg0) {
		Class597.aClass107_Sub1_2.method8860();
	}
}
