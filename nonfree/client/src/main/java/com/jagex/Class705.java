package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zy")
public class Class705 {

	@OriginalMember(owner = "client!zy", name = "jf", descriptor = "Lclient!akv;")
	public static Class77_Sub39 aClass77_Sub39_17;

	@OriginalMember(owner = "client!zy", name = "p", descriptor = "Lclient!zy;")
	public static final Class705 aClass705_6 = new Class705("LIVE", 0);

	@OriginalMember(owner = "client!zy", name = "c", descriptor = "Lclient!zy;")
	public static final Class705 aClass705_5 = new Class705("BUILDLIVE", 3);

	@OriginalMember(owner = "client!zy", name = "v", descriptor = "Lclient!zy;")
	public static final Class705 aClass705_2 = new Class705("RC", 1);

	@OriginalMember(owner = "client!zy", name = "l", descriptor = "Lclient!zy;")
	public static final Class705 aClass705_3 = new Class705("WIP", 2);

	@OriginalMember(owner = "client!zy", name = "y", descriptor = "Lclient!zy;")
	static final Class705 aClass705_4 = new Class705("INTBETA", 4);

	@OriginalMember(owner = "client!zy", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString248;

	@OriginalMember(owner = "client!zy", name = "t", descriptor = "I")
	public final int anInt5890;

	@OriginalMember(owner = "client!zy", name = "v", descriptor = "()[Lclient!zy;", line = 14)
	static Class705[] method36564() {
		return new Class705[] { aClass705_2, aClass705_4, aClass705_6, aClass705_5, aClass705_3 };
	}

	@OriginalMember(owner = "client!zy", name = "l", descriptor = "()[Lclient!zy;", line = 14)
	static Class705[] method36565() {
		return new Class705[] { aClass705_2, aClass705_4, aClass705_6, aClass705_5, aClass705_3 };
	}

	@OriginalMember(owner = "client!zy", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 17)
	Class705(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString248 = arg0;
		this.anInt5890 = arg1 * -1147663733;
	}

	@OriginalMember(owner = "client!zy", name = "w", descriptor = "(I)Lclient!zy;", line = 24)
	public static Class705 method36566(@OriginalArg(0) int arg0) {
		@Pc(2) Class705[] local2 = Class173.method24539();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class705 local12 = local2[local4];
			if (local12.anInt5890 * -1439134429 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!zy", name = "y", descriptor = "(I)Lclient!zy;", line = 24)
	public static Class705 method36567(@OriginalArg(0) int arg0) {
		@Pc(2) Class705[] local2 = Class173.method24539();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class705 local12 = local2[local4];
			if (local12.anInt5890 * -1439134429 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!zy", name = "iw", descriptor = "(I)V", line = 4645)
	static final void method36568() {
		@Pc(1) int local1 = 0;
		@Pc(5) Class556 local5 = client.aClass517_1.method30435();
		for (@Pc(7) int local7 = 0; local7 < client.aClass517_1.method30411(); local7++) {
			for (@Pc(14) int local14 = 0; local14 < client.aClass517_1.method30417(); local14++) {
				if (Class540.method30915(local5.aClass567ArrayArrayArray1, local1, local7, local14, true)) {
					local1++;
				}
				if (local1 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!zy", name = "vz", descriptor = "(Lclient!yf;I)V", line = 8457)
	static final void method36569(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class449.method29227(local13, local23, true);
	}
}
