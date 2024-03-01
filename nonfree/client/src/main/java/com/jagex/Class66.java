package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ye")
public abstract class Class66 {

	@OriginalMember(owner = "client!ye", name = "p", descriptor = "I")
	protected final int anInt1828;

	@OriginalMember(owner = "client!ye", name = "a", descriptor = "I")
	protected final int anInt1826;

	@OriginalMember(owner = "client!ye", name = "g", descriptor = "I")
	protected final int anInt1830;

	@OriginalMember(owner = "client!ye", name = "l", descriptor = "I")
	protected final int anInt1831;

	@OriginalMember(owner = "client!ye", name = "h", descriptor = "I")
	protected final int anInt1829;

	@OriginalMember(owner = "client!ye", name = "x", descriptor = "I")
	protected final int anInt1827;

	@OriginalMember(owner = "client!ye", name = "s", descriptor = "Z")
	protected final boolean aBoolean336;

	@OriginalMember(owner = "client!ye", name = "u", descriptor = "Z")
	protected final boolean aBoolean335;

	@OriginalMember(owner = "client!ye", name = "y", descriptor = "I")
	protected final int anInt1832;

	@OriginalMember(owner = "client!ye", name = "<init>", descriptor = "(IIIIIIZZI)V", line = 14)
	Class66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt1828 = arg0 * 1915929789;
		this.anInt1826 = arg1 * 697699465;
		this.anInt1830 = (arg2 > 65535 ? 65535 : arg2) * 1926298161;
		this.anInt1831 = arg3 * 1475163275;
		this.anInt1829 = (arg4 > 255 ? 255 : arg4) * 1205193019;
		this.anInt1827 = arg5 * -104308257;
		this.aBoolean336 = arg6;
		this.aBoolean335 = arg7;
		this.anInt1832 = arg8 * 923003809;
	}

	@OriginalMember(owner = "client!ye", name = "af", descriptor = "(I)V", line = 960)
	static void method13208() {
		Class615.aClass82_3.method21599();
		Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
		Class615.aClass82_3.aClass301_3 = null;
		Class615.aClass82_3.aClass301_1 = null;
		Class615.aClass82_3.aClass301_4 = null;
		Class615.aClass82_3.anInt2918 = 0;
		client.anInt3041 = 0;
		Class569.method33005();
		client.anInt3194 = 0;
		client.anInt3042 = 0;
		client.anInt3174 = 0;
		client.aString151 = null;
		Class21_Sub1.anInt288 = 0;
		Class43_Sub2.aClass79Array1 = null;
		Class357.aClass245_1 = null;
		Class471.aClass245_2 = null;
		Class390.method22351();
		for (@Pc(42) int local42 = 0; local42 < Class424.aClass165_1.aClass477Array1.length; local42++) {
			@Pc(56) Class477 local56 = new Class477(Class490.aClass494_1.method29302(local42), false);
			local56.method28801(0);
			local56.method28805(0);
			Class424.aClass165_1.aClass477Array1[local42] = local56;
		}
		Class424.aClass165_1.aClass460_1.method28564();
		Class60_Sub13.method13461();
		Class75.method19526(Class615.aClass82_3);
	}

	@OriginalMember(owner = "client!ye", name = "gc", descriptor = "(I)V", line = 3509)
	public static final void method13207() {
		if (!client.aBoolean602) {
			client.aFloat240 += (12.0F - client.aFloat240) / 2.0F;
			client.aBoolean586 = true;
			client.aBoolean602 = true;
		}
	}

	@OriginalMember(owner = "client!ye", name = "ii", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5654)
	static final void method13206(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3549 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] * -911893787;
	}
}
