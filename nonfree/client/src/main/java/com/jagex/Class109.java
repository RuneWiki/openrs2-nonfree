package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class Class109 {

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
	public int anInt2993;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "Lclient!cd;")
	public Class109 aClass109_2;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "Lclient!mq;")
	public Class328 aClass328_95;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
	public int anInt2995;

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
	public int anInt2996;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
	public final int anInt2994;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
	public final int anInt2997;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(II)V", line = 15)
	Class109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2994 = arg0 * -1751042225;
		this.anInt2997 = arg1 * 956823253;
	}

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "(I)Lclient!kd;", line = 21)
	public Class273 method21944() {
		return Class399.method27566(this.anInt2994 * -1523220561);
	}

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)Lclient!cd;", line = 25)
	Class109 method21945(@OriginalArg(0) int arg0) {
		return new Class109(this.anInt2994 * -1523220561, arg0);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Lclient!cd;", line = 25)
	Class109 method21946(@OriginalArg(0) int arg0) {
		return new Class109(this.anInt2994 * -1523220561, arg0);
	}

	@OriginalMember(owner = "client!cd", name = "bu", descriptor = "(Lclient!fo;Lclient!vs;I)V", line = 4268)
	static final void method21947(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class536 arg1) {
		if (client.method22372(arg0).method11804() && client.aClass178_10 == null) {
			Class64.method13092(arg0.anInt3570 * 954808515, arg0.anInt3491 * 18828465);
			client.aClass178_10 = Class11_Sub2.method1219(arg0.anInt3570 * 954808515, arg0.anInt3491 * 18828465);
			Class223.method24442(client.aClass178_10);
		}
	}

	@OriginalMember(owner = "client!cd", name = "kz", descriptor = "(Lclient!fw;Lclient!fo;ZI)V", line = 10231)
	public static void method21948(@OriginalArg(0) Class186 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) boolean arg2) {
		Class491.method29255(arg0.aClass178Array8, arg1, arg2);
	}
}
