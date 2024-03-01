package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kz")
public class Class291 implements Interface31 {

	@OriginalMember(owner = "client!kz", name = "l", descriptor = "I")
	public static int anInt4370;

	@OriginalMember(owner = "client!kz", name = "p", descriptor = "I")
	public final int anInt4369;

	@OriginalMember(owner = "client!kz", name = "<init>", descriptor = "(I)V", line = 8)
	Class291(@OriginalArg(0) int arg0) {
		this.anInt4369 = arg0 * 1841677355;
	}

	@OriginalMember(owner = "client!kz", name = "l", descriptor = "(Lclient!ahb;)Lclient!kz;", line = 13)
	public static Class291 method25541(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20375();
		return new Class291(local3);
	}

	@OriginalMember(owner = "client!kz", name = "a", descriptor = "(I)Lclient!ke;", line = 18)
	@Override
	public Class274 method25540() {
		return Class274.aClass274_11;
	}

	@OriginalMember(owner = "client!kz", name = "g", descriptor = "()Lclient!ke;", line = 18)
	@Override
	public Class274 method25539() {
		return Class274.aClass274_11;
	}

	@OriginalMember(owner = "client!kz", name = "p", descriptor = "(Lclient!ny;I)V", line = 23)
	public static void method25542(@OriginalArg(0) Class359 arg0) {
		Class287.aClass359_53 = arg0;
	}

	@OriginalMember(owner = "client!kz", name = "h", descriptor = "(Ljava/lang/String;I)[B", line = 92)
	public static byte[] method25544(@OriginalArg(0) String arg0) {
		@Pc(2) int local2 = arg0.length();
		if (local2 == 0) {
			return new byte[0];
		}
		@Pc(13) int local13 = local2 + 3 & 0xFFFFFFFC;
		@Pc(19) int local19 = local13 / 4 * 3;
		if (local13 - 2 >= local2 || Class80.method21595(arg0.charAt(local13 - 2)) == -1) {
			local19 -= 2;
		} else if (local13 - 1 >= local2 || Class80.method21595(arg0.charAt(local13 - 1)) == -1) {
			local19--;
		}
		@Pc(53) byte[] local53 = new byte[local19];
		Class427.method27913(arg0, local53, 0);
		return local53;
	}

	@OriginalMember(owner = "client!kz", name = "b", descriptor = "(Lclient!zz;III)V", line = 284)
	public static void method25543(@OriginalArg(0) Class634 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class536 local2 = Class27.method15271();
		Class316.method25839(arg0, arg1, arg2, local2);
	}

	@OriginalMember(owner = "client!kz", name = "jd", descriptor = "(IIILclient!afg;I)V", line = 8780)
	static void method25545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub4 arg3) {
		@Pc(10) long local10 = (long) (arg0 << 28 | arg2 << 14 | arg1);
		@Pc(15) Class3_Sub13 local15 = (Class3_Sub13) client.aClass581_19.method33217(local10);
		if (local15 == null) {
			local15 = new Class3_Sub13();
			client.aClass581_19.method33241(local15, local10);
			local15.aClass553_17.method32702(arg3);
			return;
		}
		@Pc(39) Class594 local39 = Class44_Sub3.aClass596_1.method33435(arg3.anInt1163 * 212444761);
		@Pc(44) int local44 = local39.anInt5476 * 1273870531;
		if (local39.anInt5473 * 1865134295 == 1) {
			local44 *= arg3.anInt1162 * 1019273181 + 1;
		}
		for (@Pc(65) Class3_Sub4 local65 = (Class3_Sub4) local15.aClass553_17.method32768(); local65 != null; local65 = (Class3_Sub4) local15.aClass553_17.method32709()) {
			local39 = Class44_Sub3.aClass596_1.method33435(local65.anInt1163 * 212444761);
			@Pc(80) int local80 = local39.anInt5476 * 1273870531;
			if (local39.anInt5473 * 1865134295 == 1) {
				local80 *= local65.anInt1162 * 1019273181 + 1;
			}
			if (local44 > local80) {
				Class221.method24418(arg3, local65);
				return;
			}
		}
		local15.aClass553_17.method32702(arg3);
	}
}
