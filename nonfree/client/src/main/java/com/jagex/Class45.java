package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abt")
public class Class45 {

	@OriginalMember(owner = "client!abt", name = "<init>", descriptor = "()V", line = 7)
	Class45() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!abt", name = "k", descriptor = "(Lclient!py;Lclient!xq;)I", line = 12)
	static int method879(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class667 arg1) {
		if (arg0 == null) {
			return 0;
		} else if (arg1.method32906() > 1) {
			@Pc(13) int local13 = arg0.method30063() - 1;
			return local13 * arg1.method32906() + arg0.method30062(local13);
		} else {
			return arg0.method30062(arg1.anInt5849 * -1772702343);
		}
	}

	@OriginalMember(owner = "client!abt", name = "m", descriptor = "(Lclient!py;Lclient!xq;)I", line = 12)
	static int method880(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class667 arg1) {
		if (arg0 == null) {
			return 0;
		} else if (arg1.method32906() > 1) {
			@Pc(13) int local13 = arg0.method30063() - 1;
			return local13 * arg1.method32906() + arg0.method30062(local13);
		} else {
			return arg0.method30062(arg1.anInt5849 * -1772702343);
		}
	}

	@OriginalMember(owner = "client!abt", name = "f", descriptor = "(Lclient!py;Lclient!xq;I)[B", line = 23)
	static byte[] method878(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) int arg2) {
		return arg1.method32906() > 1 ? arg0.method30044(arg1.method32907(arg2), arg1.method32908(arg2)) : arg0.method30044(arg1.anInt5849 * -1772702343, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "w", descriptor = "(Lclient!py;Lclient!xq;I)[B", line = 23)
	static byte[] method881(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) int arg2) {
		return arg1.method32906() > 1 ? arg0.method30044(arg1.method32907(arg2), arg1.method32908(arg2)) : arg0.method30044(arg1.anInt5849 * -1772702343, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "l", descriptor = "(Lclient!py;Lclient!xq;I)[B", line = 23)
	static byte[] method882(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) int arg2) {
		return arg1.method32906() > 1 ? arg0.method30044(arg1.method32907(arg2), arg1.method32908(arg2)) : arg0.method30044(arg1.anInt5849 * -1772702343, arg2);
	}

	@OriginalMember(owner = "client!abt", name = "hg", descriptor = "(Lclient!yf;B)V", line = 6283)
	static final void method883(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class12.method188(local11, local14, true, 2, arg0);
	}
}
