package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xz")
public final class Class658 {

	@OriginalMember(owner = "client!xz", name = "<init>", descriptor = "()V", line = 4)
	Class658() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!xz", name = "l", descriptor = "(Ljava/lang/CharSequence;)I", line = 9)
	public static int method33058(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg0.charAt(local6);
			if (local13 <= '\u007f') {
				local4++;
			} else if (local13 <= '\u07ff') {
				local4 += 2;
			} else {
				local4 += 3;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!xz", name = "g", descriptor = "(I)V", line = 497)
	public static void method33059() {
		@Pc(2) Class232 local2 = Class628.aClass232_90;
		synchronized (Class628.aClass232_90) {
			Class628.aClass232_90.method25850();
		}
		local2 = Class628.aClass232_91;
		synchronized (Class628.aClass232_91) {
			Class628.aClass232_91.method25850();
		}
	}

	@OriginalMember(owner = "client!xz", name = "in", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6011)
	static final void method33060(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3888 = -1070830455;
		arg0.anInt3889 = client.anInt3389 * 2118781167;
		arg0.anInt3919 = 0;
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class623.method32473(arg0.anInt3863 * -1278450723);
		}
	}
}
