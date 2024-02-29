package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public class Class444 {

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 4)
	Class444() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ol", name = "v", descriptor = "(Lclient!oo;Lclient!oo;Lclient!oo;F[Lclient!oo;)V", line = 9)
	public static void method29094(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) Class447 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class447[] arg4) {
		@Pc(3) Class447 local3 = Class447.method29160(arg0, arg2);
		@Pc(11) float local11 = Class447.method29165(local3, local3) - arg3 * arg3;
		@Pc(15) float local15 = Class447.method29165(arg1, local3);
		@Pc(21) float local21 = local15 * local15 - local11;
		if (local21 < 0.0F) {
			arg4[1] = null;
			arg4[0] = null;
		} else if (local21 >= 9.765625E-4F) {
			@Pc(45) float local45 = (float) Math.sqrt((double) local21);
			arg4[0] = Class447.method29119();
			arg4[0].method29136(arg0);
			arg4[0].method29146(Class447.method29194(Class447.method29124(arg1), -local15 - local45));
			arg4[1] = Class447.method29119();
			arg4[1].method29136(arg0);
			arg4[1].method29146(Class447.method29194(Class447.method29124(arg1), -local15 + local45));
		} else {
			arg4[0] = Class447.method29119();
			arg4[0].method29136(arg0);
			arg4[0].method29146(Class447.method29194(Class447.method29124(arg1), -local15));
			arg4[1] = null;
		}
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(Lclient!oo;Lclient!oo;Lclient!oo;F[Lclient!oo;)V", line = 9)
	public static void method29095(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) Class447 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class447[] arg4) {
		@Pc(3) Class447 local3 = Class447.method29160(arg0, arg2);
		@Pc(11) float local11 = Class447.method29165(local3, local3) - arg3 * arg3;
		@Pc(15) float local15 = Class447.method29165(arg1, local3);
		@Pc(21) float local21 = local15 * local15 - local11;
		if (local21 < 0.0F) {
			arg4[1] = null;
			arg4[0] = null;
		} else if (local21 >= 9.765625E-4F) {
			@Pc(45) float local45 = (float) Math.sqrt((double) local21);
			arg4[0] = Class447.method29119();
			arg4[0].method29136(arg0);
			arg4[0].method29146(Class447.method29194(Class447.method29124(arg1), -local15 - local45));
			arg4[1] = Class447.method29119();
			arg4[1].method29136(arg0);
			arg4[1].method29146(Class447.method29194(Class447.method29124(arg1), -local15 + local45));
		} else {
			arg4[0] = Class447.method29119();
			arg4[0].method29136(arg0);
			arg4[0].method29146(Class447.method29194(Class447.method29124(arg1), -local15));
			arg4[1] = null;
		}
	}

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "(Lclient!oo;Lclient!oo;Lclient!oo;F[Lclient!oo;)V", line = 9)
	public static void method29096(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) Class447 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class447[] arg4) {
		@Pc(3) Class447 local3 = Class447.method29160(arg0, arg2);
		@Pc(11) float local11 = Class447.method29165(local3, local3) - arg3 * arg3;
		@Pc(15) float local15 = Class447.method29165(arg1, local3);
		@Pc(21) float local21 = local15 * local15 - local11;
		if (local21 < 0.0F) {
			arg4[1] = null;
			arg4[0] = null;
		} else if (local21 >= 9.765625E-4F) {
			@Pc(45) float local45 = (float) Math.sqrt((double) local21);
			arg4[0] = Class447.method29119();
			arg4[0].method29136(arg0);
			arg4[0].method29146(Class447.method29194(Class447.method29124(arg1), -local15 - local45));
			arg4[1] = Class447.method29119();
			arg4[1].method29136(arg0);
			arg4[1].method29146(Class447.method29194(Class447.method29124(arg1), -local15 + local45));
		} else {
			arg4[0] = Class447.method29119();
			arg4[0].method29136(arg0);
			arg4[0].method29146(Class447.method29194(Class447.method29124(arg1), -local15));
			arg4[1] = null;
		}
	}

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "(Lclient!oo;Lclient!oo;Lclient!oo;F[Lclient!oo;)V", line = 9)
	public static void method29097(@OriginalArg(0) Class447 arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) Class447 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class447[] arg4) {
		@Pc(3) Class447 local3 = Class447.method29160(arg0, arg2);
		@Pc(11) float local11 = Class447.method29165(local3, local3) - arg3 * arg3;
		@Pc(15) float local15 = Class447.method29165(arg1, local3);
		@Pc(21) float local21 = local15 * local15 - local11;
		if (local21 < 0.0F) {
			arg4[1] = null;
			arg4[0] = null;
		} else if (local21 >= 9.765625E-4F) {
			@Pc(45) float local45 = (float) Math.sqrt((double) local21);
			arg4[0] = Class447.method29119();
			arg4[0].method29136(arg0);
			arg4[0].method29146(Class447.method29194(Class447.method29124(arg1), -local15 - local45));
			arg4[1] = Class447.method29119();
			arg4[1].method29136(arg0);
			arg4[1].method29146(Class447.method29194(Class447.method29124(arg1), -local15 + local45));
		} else {
			arg4[0] = Class447.method29119();
			arg4[0].method29136(arg0);
			arg4[0].method29146(Class447.method29194(Class447.method29124(arg1), -local15));
			arg4[1] = null;
		}
	}
}
