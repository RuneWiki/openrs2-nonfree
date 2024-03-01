package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agl")
public class Class3_Sub27 extends Class3 {

	@OriginalMember(owner = "client!agl", name = "tb", descriptor = "I")
	static int anInt1312;

	@OriginalMember(owner = "client!agl", name = "c", descriptor = "[F")
	static float[] aFloatArray53 = new float[3];

	@OriginalMember(owner = "client!agl", name = "x", descriptor = "I")
	int anInt1309;

	@OriginalMember(owner = "client!agl", name = "b", descriptor = "F")
	float aFloat144;

	@OriginalMember(owner = "client!agl", name = "s", descriptor = "I")
	int anInt1310;

	@OriginalMember(owner = "client!agl", name = "u", descriptor = "I")
	int anInt1311;

	@OriginalMember(owner = "client!agl", name = "y", descriptor = "F")
	float aFloat145;

	@OriginalMember(owner = "client!agl", name = "l", descriptor = "Lclient!cd;")
	final Class109 aClass109_1;

	@OriginalMember(owner = "client!agl", name = "h", descriptor = "Lclient!kd;")
	final Class273 aClass273_1;

	@OriginalMember(owner = "client!agl", name = "<init>", descriptor = "(Lclient!cd;Lclient!tf;)V", line = 18)
	Class3_Sub27(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class478 arg1) {
		this.aClass109_1 = arg0;
		this.aClass273_1 = this.aClass109_1.method21944();
		this.method11550();
	}

	@OriginalMember(owner = "client!agl", name = "p", descriptor = "(I)V", line = 25)
	void method11550() {
		this.anInt1309 = this.aClass109_1.anInt2993 * 251553135;
		this.anInt1310 = this.aClass109_1.anInt2995 * 1113094487;
		this.anInt1311 = this.aClass109_1.anInt2996 * 368189099;
		if (this.aClass109_1.aClass328_95 != null) {
			this.aClass109_1.aClass328_95.method26054((float) (this.aClass273_1.anInt4310 * -1758357899), (float) (this.aClass273_1.anInt4311 * -595435787), (float) (this.aClass273_1.anInt4312 * 38476087), aFloatArray53);
		}
		this.aFloat145 = aFloatArray53[0];
		this.aFloat144 = aFloatArray53[2];
	}

	@OriginalMember(owner = "client!agl", name = "a", descriptor = "()V", line = 25)
	void method11551() {
		this.anInt1309 = this.aClass109_1.anInt2993 * 251553135;
		this.anInt1310 = this.aClass109_1.anInt2995 * 1113094487;
		this.anInt1311 = this.aClass109_1.anInt2996 * 368189099;
		if (this.aClass109_1.aClass328_95 != null) {
			this.aClass109_1.aClass328_95.method26054((float) (this.aClass273_1.anInt4310 * -1758357899), (float) (this.aClass273_1.anInt4311 * -595435787), (float) (this.aClass273_1.anInt4312 * 38476087), aFloatArray53);
		}
		this.aFloat145 = aFloatArray53[0];
		this.aFloat144 = aFloatArray53[2];
	}

	@OriginalMember(owner = "client!agl", name = "g", descriptor = "()V", line = 25)
	void method11552() {
		this.anInt1309 = this.aClass109_1.anInt2993 * 251553135;
		this.anInt1310 = this.aClass109_1.anInt2995 * 1113094487;
		this.anInt1311 = this.aClass109_1.anInt2996 * 368189099;
		if (this.aClass109_1.aClass328_95 != null) {
			this.aClass109_1.aClass328_95.method26054((float) (this.aClass273_1.anInt4310 * -1758357899), (float) (this.aClass273_1.anInt4311 * -595435787), (float) (this.aClass273_1.anInt4312 * 38476087), aFloatArray53);
		}
		this.aFloat145 = aFloatArray53[0];
		this.aFloat144 = aFloatArray53[2];
	}

	@OriginalMember(owner = "client!agl", name = "agq", descriptor = "(Lclient!vs;I)V", line = 10198)
	static final void method11553(@OriginalArg(0) Class536 arg0) {
		Class1.method13();
	}
}
