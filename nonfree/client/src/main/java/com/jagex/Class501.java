package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qy")
public class Class501 {

	@OriginalMember(owner = "client!qy", name = "p", descriptor = "Lclient!qy;")
	static final Class501 aClass501_3 = new Class501(0, false);

	@OriginalMember(owner = "client!qy", name = "c", descriptor = "Lclient!qy;")
	public static final Class501 aClass501_4 = new Class501(1, false);

	@OriginalMember(owner = "client!qy", name = "v", descriptor = "Lclient!qy;")
	static final Class501 aClass501_8 = new Class501(2, false);

	@OriginalMember(owner = "client!qy", name = "l", descriptor = "Lclient!qy;")
	static final Class501 aClass501_1 = new Class501(3, false);

	@OriginalMember(owner = "client!qy", name = "y", descriptor = "Lclient!qy;")
	static final Class501 aClass501_5 = new Class501(4, false);

	@OriginalMember(owner = "client!qy", name = "w", descriptor = "Lclient!qy;")
	static final Class501 aClass501_6 = new Class501(5, true);

	@OriginalMember(owner = "client!qy", name = "t", descriptor = "Lclient!qy;")
	static final Class501 aClass501_7 = new Class501(6, true);

	@OriginalMember(owner = "client!qy", name = "q", descriptor = "Lclient!qy;")
	static final Class501 aClass501_2 = new Class501(7, true);

	@OriginalMember(owner = "client!qy", name = "x", descriptor = "Lclient!qy;")
	static final Class501 aClass501_9 = new Class501(8, true);

	@OriginalMember(owner = "client!qy", name = "d", descriptor = "I")
	final int anInt5065;

	@OriginalMember(owner = "client!qy", name = "s", descriptor = "Z")
	public final boolean aBoolean770;

	@OriginalMember(owner = "client!qy", name = "<init>", descriptor = "(IZ)V", line = 17)
	Class501(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt5065 = arg0 * 1900029121;
		this.aBoolean770 = arg1;
	}

	@OriginalMember(owner = "client!qy", name = "p", descriptor = "(Lclient!my;Lclient!mk;IIIIIIIIII)V", line = 32)
	public static void method30222(@OriginalArg(0) Class410 arg0, @OriginalArg(1) Class402 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		Class133.aClass410_7 = arg0;
		Class133.aClass402_7 = arg1;
		Class133.anInt1560 = arg2 * 1067872339;
		Class133.anInt1562 = arg3 * -1578885789;
		Class173.anInt3294 = arg4 * -482153117;
		Class67.anInt199 = arg5 * 1739452007;
		Class662.anInt5779 = arg6 * 1150809657;
		Class133.anInt1561 = arg7 * 1061662017;
		Class133.anInt1564 = arg8 * 1949333389;
		Class143_Sub23.aClass89_2 = null;
		Class229.aClass89_3 = null;
		Class67.aClass89_1 = null;
		Class367.anInt4548 = arg9 * 1559431319;
		Class133.anInt1563 = arg10 * -509538137;
		Class479.method29807();
		Class505.aBoolean774 = true;
	}

	@OriginalMember(owner = "client!qy", name = "p", descriptor = "(S)Lclient!akq;", line = 38)
	static Class77_Sub35 method30223() {
		@Pc(1) Class28 local1 = null;
		@Pc(7) Class77_Sub35 local7 = new Class77_Sub35(client.aClass670_4, 0);
		try {
			local1 = Class145.method15079("", client.aClass670_4.aString245, false);
			@Pc(20) byte[] local20 = new byte[(int) local1.method478()];
			@Pc(36) int local36;
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22 += local36) {
				local36 = local1.method486(local20, local22, local20.length - local22);
				if (local36 == -1) {
					throw new IOException();
				}
			}
			local7 = new Class77_Sub35(new Class77_Sub39(local20), client.aClass670_4, 0);
		} catch (@Pc(60) Exception local60) {
		}
		try {
			if (local1 != null) {
				local1.method476();
			}
		} catch (@Pc(67) Exception local67) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!qy", name = "jb", descriptor = "(IIILclient!ajx;B)V", line = 9363)
	static void method30224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class77_Sub24 arg3) {
		@Pc(10) long local10 = (long) (arg0 << 28 | arg2 << 14 | arg1);
		@Pc(15) Class77_Sub9 local15 = (Class77_Sub9) client.aClass12_19.method173(local10);
		if (local15 == null) {
			local15 = new Class77_Sub9();
			client.aClass12_19.method184(local15, local10);
			local15.aClass695_19.method36383(arg3);
			return;
		}
		@Pc(41) Class18 local41 = (Class18) Class537.aClass35_Sub7_1.method18319(arg3.anInt1549 * -400233975);
		@Pc(46) int local46 = local41.anInt69 * 1925627131;
		if (local41.anInt101 * 1113844363 == 1) {
			local46 *= arg3.anInt1548 * -491988633 + 1;
		}
		for (@Pc(67) Class77_Sub24 local67 = (Class77_Sub24) local15.aClass695_19.method36395(); local67 != null; local67 = (Class77_Sub24) local15.aClass695_19.method36406()) {
			local41 = (Class18) Class537.aClass35_Sub7_1.method18319(local67.anInt1549 * -400233975);
			@Pc(83) int local83 = local41.anInt69 * 1925627131;
			if (local41.anInt101 * 1113844363 == 1) {
				local83 *= local67.anInt1548 * -491988633 + 1;
			}
			if (local46 > local83) {
				Class556.method31082(arg3, local67);
				return;
			}
		}
		local15.aClass695_19.method36383(arg3);
	}
}
