package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class Class515 {

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "Lclient!rp;")
	static Interface59 anInterface59_1;

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "[Lclient!cy;")
	static Class83[] aClass83Array8;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V", line = 11)
	Class515() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "(Lclient!rp;)V", line = 16)
	public static void method30371(@OriginalArg(0) Interface59 arg0) {
		if (anInterface59_1 != null) {
			throw new IllegalStateException("");
		}
		anInterface59_1 = arg0;
	}

	@OriginalMember(owner = "client!rn", name = "y", descriptor = "()Lclient!rp;", line = 21)
	public static Interface59 method30372() {
		if (anInterface59_1 == null) {
			throw new IllegalStateException("");
		}
		return anInterface59_1;
	}

	@OriginalMember(owner = "client!rn", name = "w", descriptor = "()Lclient!rp;", line = 21)
	public static Interface59 method30373() {
		if (anInterface59_1 == null) {
			throw new IllegalStateException("");
		}
		return anInterface59_1;
	}

	@OriginalMember(owner = "client!rn", name = "q", descriptor = "()Lclient!rp;", line = 21)
	public static Interface59 method30374() {
		if (anInterface59_1 == null) {
			throw new IllegalStateException("");
		}
		return anInterface59_1;
	}

	@OriginalMember(owner = "client!rn", name = "t", descriptor = "()Lclient!rp;", line = 21)
	public static Interface59 method30375() {
		if (anInterface59_1 == null) {
			throw new IllegalStateException("");
		}
		return anInterface59_1;
	}

	@OriginalMember(owner = "client!rn", name = "x", descriptor = "()Z", line = 26)
	public static boolean method30376() {
		return anInterface59_1 != null;
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "()Z", line = 26)
	public static boolean method30377() {
		return anInterface59_1 != null;
	}

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "(Lclient!yf;B)V", line = 85)
	static void method30378(@OriginalArg(0) Class665 arg0) {
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = ((Class303) Class252.aClass42_Sub2_1.method18319(arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 2])).aStringArray27[arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1]];
		arg0.anInt5784 -= 617999126;
	}
}
