package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class Class76 {

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
	public static int anInt2902;

	@OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
	int anInt2896;

	@OriginalMember(owner = "client!ap", name = "u", descriptor = "I")
	int anInt2899;

	@OriginalMember(owner = "client!ap", name = "y", descriptor = "I")
	int anInt2900;

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
	int anInt2901;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "F")
	float aFloat225;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "F")
	float aFloat223 = 1.0F;

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "F")
	float aFloat224 = 1.0F;

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
	int anInt2898;

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
	int anInt2895;

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
	int anInt2897;

	@OriginalMember(owner = "client!ap", name = "x", descriptor = "I")
	int anInt2894;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(I)V", line = 16)
	Class76(@OriginalArg(0) int arg0) {
		this.anInt2898 = arg0 * -322060319;
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(IFFIII)V", line = 20)
	Class76(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2898 = arg0 * -322060319;
		this.aFloat223 = arg1;
		this.aFloat224 = arg2;
		this.anInt2895 = arg3 * 708908097;
		this.anInt2897 = arg4 * 12048629;
		this.anInt2894 = arg5 * 1139813105;
	}

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "(I)Lclient!ap;", line = 30)
	Class76 method21532() {
		return new Class76(this.anInt2898 * 215139361, this.aFloat223, this.aFloat224, this.anInt2895 * -2129331263, this.anInt2897 * -701754531, this.anInt2894 * 566461969);
	}

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "()Lclient!ap;", line = 30)
	Class76 method21533() {
		return new Class76(this.anInt2898 * 215139361, this.aFloat223, this.aFloat224, this.anInt2895 * -2129331263, this.anInt2897 * -701754531, this.anInt2894 * 566461969);
	}

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "()Lclient!ap;", line = 30)
	Class76 method21535() {
		return new Class76(this.anInt2898 * 215139361, this.aFloat223, this.aFloat224, this.anInt2895 * -2129331263, this.anInt2897 * -701754531, this.anInt2894 * 566461969);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!ap;I)V", line = 34)
	void method21534(@OriginalArg(0) Class76 arg0) {
		this.aFloat223 = arg0.aFloat223;
		this.aFloat224 = arg0.aFloat224;
		this.anInt2895 = arg0.anInt2895;
		this.anInt2897 = arg0.anInt2897;
		this.anInt2898 = arg0.anInt2898;
		this.anInt2894 = arg0.anInt2894;
	}

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "(I)[Lclient!zh;", line = 40)
	static Class619[] method21537() {
		return new Class619[] { Class619.aClass619_18, Class619.aClass619_2, Class619.aClass619_8, Class619.aClass619_13, Class619.aClass619_14, Class619.aClass619_25, Class619.aClass619_12, Class619.aClass619_20, Class619.aClass619_17, Class619.aClass619_9, Class619.aClass619_21, Class619.aClass619_4, Class619.aClass619_7, Class619.aClass619_3, Class619.aClass619_19, Class619.aClass619_22, Class619.aClass619_31, Class619.aClass619_16, Class619.aClass619_30, Class619.aClass619_15, Class619.aClass619_5, Class619.aClass619_11, Class619.aClass619_28, Class619.aClass619_1, Class619.aClass619_23, Class619.aClass619_24, Class619.aClass619_29, Class619.aClass619_10, Class619.aClass619_26, Class619.aClass619_6, Class619.aClass619_27 };
	}

	@OriginalMember(owner = "client!ap", name = "xz", descriptor = "(Lclient!vs;B)V", line = 8377)
	static final void method21536(@OriginalArg(0) Class536 arg0) {
		if (client.aString151 == null) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class387.method27400(client.aString151);
		}
	}

	@OriginalMember(owner = "client!ap", name = "auc", descriptor = "(Lclient!vs;B)V", line = 12632)
	static final void method21538(@OriginalArg(0) Class536 arg0) {
		Class13_Sub12.method16900(arg0.aClass26_Sub1_Sub5_Sub1_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381], true);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) client.aFloatArray96[0];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) client.aFloatArray96[1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) client.aFloatArray96[2];
	}
}
