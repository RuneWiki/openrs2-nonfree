package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public class Class512 {

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "Lclient!rk;")
	static final Class512 aClass512_3 = new Class512();

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "Lclient!rk;")
	public static final Class512 aClass512_1 = new Class512();

	@OriginalMember(owner = "client!rk", name = "v", descriptor = "Lclient!rk;")
	public static final Class512 aClass512_2 = new Class512();

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "Lclient!rk;")
	static final Class512 aClass512_4 = new Class512();

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 9)
	Class512() {
	}

	@OriginalMember(owner = "client!rk", name = "py", descriptor = "(Lclient!yf;I)V", line = 7300)
	static final void method30340(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class476.method29697(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!rk", name = "aoh", descriptor = "(Lclient!yf;I)V", line = 12152)
	static final void method30341(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub39_1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1 ? 1 : 0);
		Class667.method33150();
		client.aBoolean593 = false;
	}

	@OriginalMember(owner = "client!rk", name = "apd", descriptor = "(Lclient!yf;S)V", line = 12307)
	static final void method30342(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
	}

	@OriginalMember(owner = "client!rk", name = "asz", descriptor = "(Lclient!yf;B)V", line = 12760)
	static final void method30343(@OriginalArg(0) Class665 arg0) {
		if (client.anInt3390 * -1850530127 == 9) {
			Class8.aBoolean4 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1;
		}
	}
}
