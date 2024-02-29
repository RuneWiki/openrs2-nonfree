package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class Class594 {

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "J")
	long aLong292;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "[I")
	int[] anIntArray507;

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "[S")
	short[] aShortArray144;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "[S")
	short[] aShortArray143;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(J[I[S[S)V", line = 9)
	public Class594(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aLong292 = arg0 * 1809322463027590351L;
		this.anIntArray507 = arg1;
		this.aShortArray144 = arg2;
		this.aShortArray143 = arg3;
	}

	@OriginalMember(owner = "client!ve", name = "am", descriptor = "(Lclient!dx;B)V", line = 1119)
	static void method31849(@OriginalArg(0) Class86 arg0) {
		if (Class683.aBoolean863) {
			Class665.method33109(arg0);
		} else {
			Class426.method28771(arg0);
		}
	}

	@OriginalMember(owner = "client!ve", name = "ed", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 5272)
	static final void method31850(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3910 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] * 1712699239;
		Class461.method29531(arg0);
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Exception_Sub1.method17633(arg0.anInt3863 * -1278450723);
		}
	}
}
