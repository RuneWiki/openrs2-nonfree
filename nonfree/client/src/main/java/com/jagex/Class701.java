package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zt")
public class Class701 {

	@OriginalMember(owner = "client!zt", name = "<init>", descriptor = "()V", line = 4)
	Class701() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!zt", name = "y", descriptor = "([B)[B", line = 9)
	public static byte[] method36494(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(7) byte[] local7 = new byte[arg0.length];
			System.arraycopy(arg0, 0, local7, 0, arg0.length);
			return local7;
		}
	}

	@OriginalMember(owner = "client!zt", name = "v", descriptor = "([B)[B", line = 9)
	public static byte[] method36495(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(7) byte[] local7 = new byte[arg0.length];
			System.arraycopy(arg0, 0, local7, 0, arg0.length);
			return local7;
		}
	}

	@OriginalMember(owner = "client!zt", name = "l", descriptor = "([B)[B", line = 9)
	public static byte[] method36496(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(7) byte[] local7 = new byte[arg0.length];
			System.arraycopy(arg0, 0, local7, 0, arg0.length);
			return local7;
		}
	}

	@OriginalMember(owner = "client!zt", name = "p", descriptor = "(Lclient!akv;B)Lclient!mu;", line = 13)
	public static Class407 method36497(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22500();
		return new Class407(local3);
	}

	@OriginalMember(owner = "client!zt", name = "uk", descriptor = "(Lclient!yf;I)V", line = 8163)
	static final void method36498(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(35) short local35 = 255;
		@Pc(37) short local37 = 256;
		Class94_Sub4.aClass261_1.method26335(Class239.aClass239_9, local13, local23, local35, Class220.aClass220_8.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, local37, local33);
	}
}
