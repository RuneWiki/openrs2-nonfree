package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaw")
public class Class22 {

	@OriginalMember(owner = "client!aaw", name = "b", descriptor = "[Lclient!cy;")
	static Class83[] aClass83Array1;

	@OriginalMember(owner = "client!aaw", name = "p", descriptor = "I")
	public static final int anInt115 = 5;

	@OriginalMember(owner = "client!aaw", name = "te", descriptor = "Lclient!kw;")
	public static Class368 aClass368_1;

	@OriginalMember(owner = "client!aaw", name = "<init>", descriptor = "()V", line = 6)
	Class22() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!aaw", name = "c", descriptor = "(IIZB)I", line = 37)
	public static int method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class77_Sub7 local4 = Class112.method9473(arg0, arg2);
		if (local4 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray193.length) {
			return local4.anIntArray193[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aaw", name = "tx", descriptor = "(Lclient!yf;I)V", line = 8115)
	static final void method422(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(19) Class77_Sub38 local19 = (Class77_Sub38) client.aClass12_20.method173((long) local13);
		if (local19 != null && local19.anInt3114 * 410447 == 3) {
			Class77_Sub41.method14838(local19, true, true);
		}
	}

	@OriginalMember(owner = "client!aaw", name = "yx", descriptor = "(Lclient!yf;I)V", line = 9013)
	static final void method423(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		if (local13.startsWith(Class152.method17433(0)) || local13.startsWith(Class152.method17433(1))) {
			local13 = local13.substring(7);
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class19.method408(local13) ? 1 : 0;
	}

	@OriginalMember(owner = "client!aaw", name = "aud", descriptor = "(Lclient!yf;I)V", line = 12964)
	static final void method424(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class302 local18 = (Class302) Class251.aClass35_Sub10_3.method18319(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local18.anInt4031 * 638004337;
	}
}
