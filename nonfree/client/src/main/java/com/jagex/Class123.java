package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public class Class123 {

	@OriginalMember(owner = "client!d", name = "n", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray10;

	@OriginalMember(owner = "client!d", name = "l", descriptor = "Z")
	public boolean aBoolean613;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Ljava/lang/String;")
	public String aString159;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Ljava/lang/String;")
	public String aString160;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "Ljava/lang/String;")
	public String aString161;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "(I)V", line = 137)
	public static void method22843() {
		Class131.aClass581_23.method33222();
		Class131.aClass553_48.method32701();
		Class131.aClass162Array1 = null;
		Class131.aClass163Array1 = null;
		Class131.aClass142Array1 = null;
		Class131.aClass150Array1 = null;
		Class496.aClass13Array1 = null;
		Class131.anInt3326 = -1402199347;
		Class131.anInt3327 = 0;
		Class131.anInt3328 = 0;
		Class2.aClass145_1 = null;
		Class131.anInt3330 = -1334009455;
		Class131.anInt3329 = -616548473;
		if (!Class131.aBoolean617) {
			return;
		}
		client.aShort154 = Class625.aShort181;
		client.aShort148 = Class191.aShort161;
		client.aShort152 = Class131.aShort159;
		client.aShort153 = Class131.aShort158;
		Class131.aBoolean617 = false;
	}

	@OriginalMember(owner = "client!d", name = "dr", descriptor = "(Lclient!vs;I)V", line = 4650)
	static final void method22844(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class427.method27908(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!d", name = "jg", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5744)
	static final void method22846(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3502 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] * 856084853;
		arg0.anInt3544 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] * 756294161;
	}

	@OriginalMember(owner = "client!d", name = "xw", descriptor = "(Lclient!vs;B)V", line = 8387)
	static final void method22845(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (client.aString151 == null || local12 >= Class21_Sub1.anInt288 * 906110417) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class43_Sub2.aClass79Array1[local12].aString130;
		}
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V", line = 11854)
	Class123() {
	}
}
