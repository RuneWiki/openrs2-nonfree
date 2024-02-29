package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sz")
public class Class547 {

	@OriginalMember(owner = "client!sz", name = "p", descriptor = "(Lclient!ako;I)V", line = 20)
	public static void method30971(@OriginalArg(0) Class39_Sub1 arg0) {
		Class86.method19916(arg0);
	}

	@OriginalMember(owner = "client!sz", name = "c", descriptor = "(Lclient!ot;I)I", line = 21)
	public static int method30972(@OriginalArg(0) Class452 arg0) {
		@Pc(4) Class447 local4 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local4.method29198(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat276);
		local4.method29130();
		if (local14 < 0.0D) {
			local14 = 3.141592653589793D + 3.141592653589793D + local14;
		}
		return (int) (local14 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!sz", name = "v", descriptor = "(Ljava/lang/CharSequence;I)Z", line = 43)
	public static boolean method30973(@OriginalArg(0) CharSequence arg0) {
		return Class525.method30665(arg0, 10, true);
	}

	@OriginalMember(owner = "client!sz", name = "<init>", descriptor = "()V", line = 209)
	Class547() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!sz", name = "wp", descriptor = "(Lclient!yf;I)V", line = 8568)
	static final void method30974(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3378 * 1844562269;
	}

	@OriginalMember(owner = "client!sz", name = "ahn", descriptor = "(Lclient!yf;I)V", line = 10621)
	static final void method30975(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
