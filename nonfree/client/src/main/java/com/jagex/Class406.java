package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public class Class406 {

	@OriginalMember(owner = "client!mt", name = "gc", descriptor = "Lclient!pw;")
	public static Class478 aClass478_114;

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "Lclient!mt;")
	public static final Class406 aClass406_5 = new Class406(1);

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "Lclient!mt;")
	public static final Class406 aClass406_2 = new Class406(2);

	@OriginalMember(owner = "client!mt", name = "v", descriptor = "Lclient!mt;")
	public static final Class406 aClass406_3 = new Class406(2);

	@OriginalMember(owner = "client!mt", name = "l", descriptor = "Lclient!mt;")
	public static final Class406 aClass406_4 = new Class406(2);

	@OriginalMember(owner = "client!mt", name = "y", descriptor = "Lclient!mt;")
	public static final Class406 aClass406_1 = new Class406(1);

	@OriginalMember(owner = "client!mt", name = "w", descriptor = "Lclient!mt;")
	public static final Class406 aClass406_6 = new Class406(1);

	@OriginalMember(owner = "client!mt", name = "t", descriptor = "Lclient!mt;")
	public static final Class406 aClass406_7 = new Class406(1);

	@OriginalMember(owner = "client!mt", name = "q", descriptor = "Lclient!mt;")
	public static final Class406 aClass406_9 = new Class406(2);

	@OriginalMember(owner = "client!mt", name = "x", descriptor = "Lclient!mt;")
	public static final Class406 aClass406_8 = new Class406(1);

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "Lclient!mt;")
	public static final Class406 aClass406_10 = new Class406(2);

	@OriginalMember(owner = "client!mt", name = "s", descriptor = "Lclient!mt;")
	public static final Class406 aClass406_11 = new Class406(1);

	@OriginalMember(owner = "client!mt", name = "r", descriptor = "I")
	public final int anInt4705;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(I)V", line = 22)
	Class406(@OriginalArg(0) int arg0) {
		this.anInt4705 = arg0 * 1275319991;
	}

	@OriginalMember(owner = "client!mt", name = "ub", descriptor = "(Lclient!yf;I)V", line = 8182)
	static final void method28537(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 1235998252;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(43) int local43 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3];
		@Pc(45) short local45 = 256;
		Class94_Sub4.aClass261_1.method26335(Class239.aClass239_9, local13, local23, local43, Class220.aClass220_8.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, local45, local33);
	}

	@OriginalMember(owner = "client!mt", name = "aqa", descriptor = "(Lclient!yf;I)V", line = 12431)
	static final void method28538(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub24_1.method15787();
	}
}
