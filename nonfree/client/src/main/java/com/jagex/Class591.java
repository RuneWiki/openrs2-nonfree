package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public class Class591 implements Interface75 {

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "Lclient!vb;")
	static final Class591 aClass591_1 = new Class591(0);

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Lclient!vb;")
	static final Class591 aClass591_3 = new Class591(1);

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "Lclient!vb;")
	public static final Class591 aClass591_2 = new Class591(2);

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
	final int anInt5499;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "()[Lclient!vb;", line = 14)
	static Class591[] method31820() {
		return new Class591[] { aClass591_3, aClass591_2, aClass591_1 };
	}

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "()[Lclient!vb;", line = 14)
	static Class591[] method31821() {
		return new Class591[] { aClass591_3, aClass591_2, aClass591_1 };
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "()[Lclient!vb;", line = 14)
	static Class591[] method31822() {
		return new Class591[] { aClass591_3, aClass591_2, aClass591_1 };
	}

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "()[Lclient!vb;", line = 14)
	static Class591[] method31823() {
		return new Class591[] { aClass591_3, aClass591_2, aClass591_1 };
	}

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "()[Lclient!vb;", line = 14)
	static Class591[] method31824() {
		return new Class591[] { aClass591_3, aClass591_2, aClass591_1 };
	}

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "()[Lclient!vb;", line = 14)
	static Class591[] method31825() {
		return new Class591[] { aClass591_3, aClass591_2, aClass591_1 };
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(I)V", line = 17)
	Class591(@OriginalArg(0) int arg0) {
		this.anInt5499 = arg0 * 1497485219;
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "()I", line = 22)
	@Override
	public int method36479() {
		return this.anInt5499 * 1091886091;
	}

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "()I", line = 22)
	@Override
	public int method36478() {
		return this.anInt5499 * 1091886091;
	}

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "()I", line = 22)
	@Override
	public int method36477() {
		return this.anInt5499 * 1091886091;
	}

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "(ZZLjava/lang/String;Ljava/lang/String;J)Z", line = 237)
	static boolean method31826(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		Class589.aBoolean811 = arg0;
		if (!arg1) {
			Class589.anInt5459 = -1651628635;
		}
		Class589.aBoolean812 = arg1;
		Class589.aString234 = arg2;
		Class589.aString233 = arg3;
		Class589.aLong290 = arg4 * -8972729624098644529L;
		if (!Class589.aBoolean812 && (Class589.aString234.equals("") || Class589.aString233.equals(""))) {
			Class528.method30709(3);
			Class305.method27241();
			return false;
		}
		if (Class675.anInt5802 * 513656689 != 131) {
			Class589.anInt5494 = 0;
			Class589.anInt5471 = 217400935;
			Class589.anInt5495 = -1087612101;
		}
		Class589.aClass82_3.aBoolean52 = false;
		Class528.method30709(-3);
		Class589.anInt5485 = -937912598;
		Class589.anInt5487 = 0;
		Class589.anInt5472 = 0;
		return true;
	}

	@OriginalMember(owner = "client!vb", name = "dp", descriptor = "(Lclient!yf;I)V", line = 5115)
	static final void method31827(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class133.method13671(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!vb", name = "xr", descriptor = "(Lclient!yf;I)V", line = 8668)
	static final void method31828(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(29) Class36 local29 = (Class36) Class663.aClass35_Sub21_1.method18319(local13);
		if (local29.aClass498_1 != Class498.aClass498_158) {
		}
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local29.method624(local23);
	}

	@OriginalMember(owner = "client!vb", name = "yq", descriptor = "(Lclient!yf;B)V", line = 8970)
	static final void method31829(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		Class507.method30266(local13);
	}

	@OriginalMember(owner = "client!vb", name = "avj", descriptor = "(Lclient!yf;S)V", line = 13224)
	static final void method31830(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
