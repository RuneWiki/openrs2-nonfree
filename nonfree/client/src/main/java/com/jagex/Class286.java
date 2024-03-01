package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public class Class286 implements Interface31 {

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
	public final int anInt4358;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(I)V", line = 8)
	Class286(@OriginalArg(0) int arg0) {
		this.anInt4358 = arg0 * 1391078371;
	}

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "(Lclient!ahb;B)Lclient!kv;", line = 16)
	public static Class44 method25480(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) Class44 local3 = Class269.method25286(arg0);
		@Pc(7) int local7 = arg0.method20275();
		@Pc(11) int local11 = arg0.method20275();
		return new Class44_Sub3(local3.aClass277_8, local3.aClass276_7, local3.anInt2200 * 55371565, local3.anInt2195 * 2009354057, local3.anInt2198 * 338285097, local3.anInt2199 * -1628722519, local3.anInt2196 * -1540009787, local3.anInt2197 * 1924731995, local3.anInt2201 * 328557495, local7, local11);
	}

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "(Lclient!de;IILclient!fo;B)V", line = 17)
	static void method25479(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class178 arg3) {
		@Pc(1) byte local1 = 127;
		@Pc(3) byte local3 = 7;
		for (@Pc(5) int local5 = 63; local5 >= 0; local5--) {
			@Pc(23) int local23 = (local5 & 0x3F) << 10 | (local3 & 0x7) << 7 | local1 & 0x7F;
			Class5.method743(false, true);
			@Pc(31) int local31 = Class515.anIntArray490[local23];
			Class79.method21589(false, true);
			arg0.method17050(arg1, arg2 + (arg3.anInt3499 * -751005789 * (63 - local5) >> 6), arg3.anInt3498 * -1494060731, (arg3.anInt3499 * -751005789 >> 6) + 1, local31 | 0xFF000000, 0);
		}
	}

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "()Lclient!ke;", line = 18)
	@Override
	public Class274 method25539() {
		return Class274.aClass274_4;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Lclient!ke;", line = 18)
	@Override
	public Class274 method25540() {
		return Class274.aClass274_4;
	}

	@OriginalMember(owner = "client!kr", name = "x", descriptor = "(Lclient!vs;I)V", line = 33)
	static void method25483(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).anInt5251 * -1356074829;
	}

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "(B)J", line = 37)
	public static long method25484() {
		try {
			@Pc(14) URL local14 = new URL(Class599.method33503("services", false) + "m=accountappeal/login.ws");
			@Pc(17) URLConnection local17 = local14.openConnection();
			local17.setRequestProperty("connection", "close");
			local17.setDoInput(true);
			local17.setDoOutput(true);
			local17.setConnectTimeout(5000);
			@Pc(36) OutputStreamWriter local36 = new OutputStreamWriter(local17.getOutputStream());
			local36.write("data1=req");
			local36.flush();
			@Pc(44) InputStream local44 = local17.getInputStream();
			@Pc(50) Class3_Sub41 local50 = new Class3_Sub41(new byte[1000]);
			do {
				@Pc(65) int local65 = local44.read(local50.aByteArray51, local50.anInt2803 * 62066237, 1000 - local50.anInt2803 * 62066237);
				if (local65 == -1) {
					local50.anInt2803 = 0;
					return local50.method20371();
				}
				local50.anInt2803 += local65 * -918980331;
			} while (local50.anInt2803 * 62066237 < 1000);
			return 0L;
		} catch (@Pc(96) Exception local96) {
			return 0L;
		}
	}

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "(IS)I", line = 63)
	static int method25478(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Class69_Sub2.method14573(arg0);
	}

	@OriginalMember(owner = "client!kr", name = "u", descriptor = "(IIIIZI)V", line = 93)
	static void method25482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) long local8 = (long) (arg0 | (arg4 ? Integer.MIN_VALUE : 0));
		@Pc(13) Class3_Sub8 local13 = (Class3_Sub8) Class3_Sub8.aClass581_6.method33217(local8);
		if (local13 == null) {
			local13 = new Class3_Sub8();
			Class3_Sub8.aClass581_6.method33241(local13, local8);
		}
		if (local13.anIntArray178.length <= arg1) {
			@Pc(34) int[] local34 = new int[arg1 + 1];
			@Pc(39) int[] local39 = new int[arg1 + 1];
			@Pc(41) int local41;
			for (local41 = 0; local41 < local13.anIntArray178.length; local41++) {
				local34[local41] = local13.anIntArray178[local41];
				local39[local41] = local13.anIntArray179[local41];
			}
			for (local41 = local13.anIntArray178.length; local41 < arg1; local41++) {
				local34[local41] = -1;
				local39[local41] = 0;
			}
			local13.anIntArray178 = local34;
			local13.anIntArray179 = local39;
		}
		local13.anIntArray178[arg1] = arg2;
		local13.anIntArray179[arg1] = arg3;
	}

	@OriginalMember(owner = "client!kr", name = "bo", descriptor = "(Lclient!vs;B)V", line = 4297)
	static final void method25481(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1 != null) {
			Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1.method29216(local13, local23);
		}
	}
}
