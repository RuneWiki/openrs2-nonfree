package com.jagex;

import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public class Class51 {

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "()V", line = 7)
	Class51() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!aca", name = "l", descriptor = "(I)I", line = 12)
	public static int method759(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!aca", name = "y", descriptor = "(I)I", line = 12)
	public static int method760(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!aca", name = "w", descriptor = "(Lclient!akv;[Lclient!qu;)[Ljava/lang/Object;", line = 20)
	public static Object[] method761(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class498[] arg1) {
		@Pc(3) int local3 = arg0.method22537();
		@Pc(9) Object[] local9 = new Object[local3 * arg1.length];
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			for (@Pc(16) int local16 = 0; local16 < arg1.length; local16++) {
				@Pc(27) int local27 = local16 + arg1.length * local11;
				local9[local27] = arg1[local16].aClass489_7.method30013(arg0);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!aca", name = "t", descriptor = "(Lclient!akv;[Lclient!qu;)[Ljava/lang/Object;", line = 20)
	public static Object[] method762(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class498[] arg1) {
		@Pc(3) int local3 = arg0.method22537();
		@Pc(9) Object[] local9 = new Object[local3 * arg1.length];
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			for (@Pc(16) int local16 = 0; local16 < arg1.length; local16++) {
				@Pc(27) int local27 = local16 + arg1.length * local11;
				local9[local27] = arg1[local16].aClass489_7.method30013(arg0);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!aca", name = "av", descriptor = "(III)V", line = 227)
	static void method763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(5, (long) arg0);
		local4.method21545();
		local4.anInt2959 = arg1 * 517206857;
	}

	@OriginalMember(owner = "client!aca", name = "r", descriptor = "(Ljava/lang/String;I)V", line = 260)
	public static void method764(@OriginalArg(0) String arg0) {
		if (Class96_Sub12.aStringArray10 == null) {
			Class41.method696();
		}
		client.aCalendar3.setTime(new Date(Class280.method26667()));
		@Pc(15) int local15 = client.aCalendar3.get(11);
		@Pc(19) int local19 = client.aCalendar3.get(12);
		@Pc(23) int local23 = client.aCalendar3.get(13);
		@Pc(57) String local57 = Integer.toString(local15 / 10) + local15 % 10 + ":" + local19 / 10 + local19 % 10 + ":" + local23 / 10 + local23 % 10;
		@Pc(62) String[] local62 = Class398.method28452(arg0, '\n');
		for (@Pc(64) int local64 = 0; local64 < local62.length; local64++) {
			for (@Pc(72) int local72 = Class157.anInt3240 * -1716872169; local72 > 0; local72--) {
				Class96_Sub12.aStringArray10[local72] = Class96_Sub12.aStringArray10[local72 - 1];
			}
			Class96_Sub12.aStringArray10[0] = local57 + ": " + local62[local64];
			if (Class509.aFileOutputStream1 != null) {
				try {
					Class509.aFileOutputStream1.write(Class398.method28451(Class96_Sub12.aStringArray10[0] + "\n"));
				} catch (@Pc(118) IOException local118) {
				}
			}
			if (Class157.anInt3240 * -1716872169 < Class96_Sub12.aStringArray10.length - 1) {
				Class157.anInt3240 += 1351113639;
				if (Class157.anInt3247 * -596800939 > 0) {
					Class157.anInt3247 += 719528701;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aca", name = "aso", descriptor = "(Lclient!yf;I)V", line = 12592)
	static final void method765(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aShort154;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aShort155;
	}
}
