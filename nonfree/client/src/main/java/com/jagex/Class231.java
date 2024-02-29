package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public class Class231 {

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
	static int anInt3762;

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "Lclient!eq;")
	static final Class231 aClass231_2 = new Class231();

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "Lclient!eq;")
	static final Class231 aClass231_3 = new Class231();

	@OriginalMember(owner = "client!eq", name = "v", descriptor = "Lclient!eq;")
	static final Class231 aClass231_1 = new Class231();

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V", line = 9)
	Class231() {
	}

	@OriginalMember(owner = "client!eq", name = "w", descriptor = "(B)Z", line = 147)
	public static final boolean method25828() {
		return Class589.anInt5485 * 1114067909 != 2;
	}

	@OriginalMember(owner = "client!eq", name = "my", descriptor = "(Lclient!yf;B)V", line = 6789)
	static final void method25829(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class419.method28689(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!eq", name = "ajd", descriptor = "(Lclient!yf;B)V", line = 11093)
	static final void method25830(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		if (local13 >= 0 && local13 < 2) {
			client.anIntArrayArrayArray15[local13] = new int[local23 << 1][4];
		}
	}

	@OriginalMember(owner = "client!eq", name = "ass", descriptor = "(Lclient!yf;I)V", line = 12559)
	static final void method25831(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		client.aShort156 = (short) arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		if (client.aShort156 <= 0) {
			client.aShort156 = 256;
		}
		client.aShort157 = (short) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		if (client.aShort157 <= 0) {
			client.aShort157 = 320;
		}
	}
}
