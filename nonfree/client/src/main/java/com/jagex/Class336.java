package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!my")
public class Class336 {

	@OriginalMember(owner = "client!my", name = "<init>", descriptor = "()V", line = 4)
	Class336() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!my", name = "a", descriptor = "(Lclient!mh;Lclient!mh;Lclient!mh;F[Lclient!mh;)V", line = 9)
	public static void method26370(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class320 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class320[] arg4) {
		@Pc(3) Class320 local3 = Class320.method25928(arg0, arg2);
		@Pc(11) float local11 = Class320.method25962(local3, local3) - arg3 * arg3;
		@Pc(15) float local15 = Class320.method25962(arg1, local3);
		@Pc(21) float local21 = local15 * local15 - local11;
		if (local21 < 0.0F) {
			arg4[1] = null;
			arg4[0] = null;
		} else if (local21 >= 9.765625E-4F) {
			@Pc(45) float local45 = (float) Math.sqrt((double) local21);
			arg4[0] = Class320.method25859();
			arg4[0].method25893(arg0);
			arg4[0].method25872(Class320.method25888(Class320.method25906(arg1), -local15 - local45));
			arg4[1] = Class320.method25859();
			arg4[1].method25893(arg0);
			arg4[1].method25872(Class320.method25888(Class320.method25906(arg1), -local15 + local45));
		} else {
			arg4[0] = Class320.method25859();
			arg4[0].method25893(arg0);
			arg4[0].method25872(Class320.method25888(Class320.method25906(arg1), -local15));
			arg4[1] = null;
		}
	}

	@OriginalMember(owner = "client!my", name = "p", descriptor = "(Lclient!mh;Lclient!mh;Lclient!mh;F[Lclient!mh;)V", line = 9)
	public static void method26371(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class320 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class320[] arg4) {
		@Pc(3) Class320 local3 = Class320.method25928(arg0, arg2);
		@Pc(11) float local11 = Class320.method25962(local3, local3) - arg3 * arg3;
		@Pc(15) float local15 = Class320.method25962(arg1, local3);
		@Pc(21) float local21 = local15 * local15 - local11;
		if (local21 < 0.0F) {
			arg4[1] = null;
			arg4[0] = null;
		} else if (local21 >= 9.765625E-4F) {
			@Pc(45) float local45 = (float) Math.sqrt((double) local21);
			arg4[0] = Class320.method25859();
			arg4[0].method25893(arg0);
			arg4[0].method25872(Class320.method25888(Class320.method25906(arg1), -local15 - local45));
			arg4[1] = Class320.method25859();
			arg4[1].method25893(arg0);
			arg4[1].method25872(Class320.method25888(Class320.method25906(arg1), -local15 + local45));
		} else {
			arg4[0] = Class320.method25859();
			arg4[0].method25893(arg0);
			arg4[0].method25872(Class320.method25888(Class320.method25906(arg1), -local15));
			arg4[1] = null;
		}
	}

	@OriginalMember(owner = "client!my", name = "g", descriptor = "(Lclient!mh;Lclient!mh;Lclient!mh;F[Lclient!mh;)V", line = 9)
	public static void method26372(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class320 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class320[] arg4) {
		@Pc(3) Class320 local3 = Class320.method25928(arg0, arg2);
		@Pc(11) float local11 = Class320.method25962(local3, local3) - arg3 * arg3;
		@Pc(15) float local15 = Class320.method25962(arg1, local3);
		@Pc(21) float local21 = local15 * local15 - local11;
		if (local21 < 0.0F) {
			arg4[1] = null;
			arg4[0] = null;
		} else if (local21 >= 9.765625E-4F) {
			@Pc(45) float local45 = (float) Math.sqrt((double) local21);
			arg4[0] = Class320.method25859();
			arg4[0].method25893(arg0);
			arg4[0].method25872(Class320.method25888(Class320.method25906(arg1), -local15 - local45));
			arg4[1] = Class320.method25859();
			arg4[1].method25893(arg0);
			arg4[1].method25872(Class320.method25888(Class320.method25906(arg1), -local15 + local45));
		} else {
			arg4[0] = Class320.method25859();
			arg4[0].method25893(arg0);
			arg4[0].method25872(Class320.method25888(Class320.method25906(arg1), -local15));
			arg4[1] = null;
		}
	}
}
