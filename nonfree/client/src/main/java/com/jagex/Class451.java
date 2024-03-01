package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public class Class451 {

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Lclient!di;")
	static Interface11 anInterface11_10;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "Lclient!sd;")
	static final Class451 aClass451_1 = new Class451(0);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "Lclient!sd;")
	static final Class451 aClass451_2 = new Class451(1);

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!sd;")
	static final Class451 aClass451_3 = new Class451(2);

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
	final int anInt5023;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "()[Lclient!sd;", line = 11)
	static Class451[] method28384() {
		return new Class451[] { aClass451_3, aClass451_1, aClass451_2 };
	}

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "()[Lclient!sd;", line = 11)
	static Class451[] method28385() {
		return new Class451[] { aClass451_3, aClass451_1, aClass451_2 };
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "()[Lclient!sd;", line = 11)
	static Class451[] method28386() {
		return new Class451[] { aClass451_3, aClass451_1, aClass451_2 };
	}

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "(Ljava/awt/Canvas;Lclient!ds;Lclient!di;IIS)Lclient!de;", line = 12)
	public static Class21 method28391(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class21_Sub1(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(I)V", line = 14)
	Class451(@OriginalArg(0) int arg0) {
		this.anInt5023 = arg0 * 1511880589;
	}

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "(I)Lclient!sd;", line = 20)
	static Class451 method28387(@OriginalArg(0) int arg0) {
		@Pc(2) Class451[] local2 = Class188.method23977();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class451 local12 = local2[local4];
			if (local12.anInt5023 * 1253090117 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "(I)Lclient!sd;", line = 20)
	static Class451 method28388(@OriginalArg(0) int arg0) {
		@Pc(2) Class451[] local2 = Class188.method23977();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class451 local12 = local2[local4];
			if (local12.anInt5023 * 1253090117 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "(I)Lclient!sd;", line = 20)
	static Class451 method28389(@OriginalArg(0) int arg0) {
		@Pc(2) Class451[] local2 = Class188.method23977();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class451 local12 = local2[local4];
			if (local12.anInt5023 * 1253090117 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sd", name = "hp", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5458)
	static final void method28390(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3513 = -1505688221;
		arg0.anInt3514 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] * 1702990945;
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class401.method27610(arg0.anInt3570 * 954808515);
		}
	}

	@OriginalMember(owner = "client!sd", name = "kp", descriptor = "(I)V", line = 11050)
	public static final void method28392() {
		client.aBoolean604 = true;
	}
}
