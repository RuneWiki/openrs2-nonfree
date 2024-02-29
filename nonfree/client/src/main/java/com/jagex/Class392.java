package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public class Class392 {

	@OriginalMember(owner = "client!m", name = "dn", descriptor = "Lclient!mg;")
	public static Class398 aClass398_1;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V", line = 9)
	Class392() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!m", name = "v", descriptor = "()V", line = 13)
	static void method28377() {
	}

	@OriginalMember(owner = "client!m", name = "l", descriptor = "()V", line = 13)
	static void method28378() {
	}

	@OriginalMember(owner = "client!m", name = "w", descriptor = "()I", line = 16)
	public static int method28379() {
		@Pc(3) Canvas local3 = new Canvas();
		local3.setSize(100, 100);
		@Pc(19) Class86 local19 = Class345.method27828(0, local3, null, null, null, null, null, null, 0);
		@Pc(22) long local22 = Class280.method26667();
		@Pc(24) int local24;
		for (local24 = 0; local24 < 10000; local24++) {
			local19.method20089(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		}
		local24 = (int) (Class280.method26667() - local22);
		local19.method19986(0, 0, 100, 100, -16777216);
		local19.method19929();
		return local24;
	}

	@OriginalMember(owner = "client!m", name = "y", descriptor = "()I", line = 16)
	public static int method28380() {
		@Pc(3) Canvas local3 = new Canvas();
		local3.setSize(100, 100);
		@Pc(19) Class86 local19 = Class345.method27828(0, local3, null, null, null, null, null, null, 0);
		@Pc(22) long local22 = Class280.method26667();
		@Pc(24) int local24;
		for (local24 = 0; local24 < 10000; local24++) {
			local19.method20089(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		}
		local24 = (int) (Class280.method26667() - local22);
		local19.method19986(0, 0, 100, 100, -16777216);
		local19.method19929();
		return local24;
	}

	@OriginalMember(owner = "client!m", name = "t", descriptor = "()I", line = 16)
	public static int method28381() {
		@Pc(3) Canvas local3 = new Canvas();
		local3.setSize(100, 100);
		@Pc(19) Class86 local19 = Class345.method27828(0, local3, null, null, null, null, null, null, 0);
		@Pc(22) long local22 = Class280.method26667();
		@Pc(24) int local24;
		for (local24 = 0; local24 < 10000; local24++) {
			local19.method20089(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		}
		local24 = (int) (Class280.method26667() - local22);
		local19.method19986(0, 0, 100, 100, -16777216);
		local19.method19929();
		return local24;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!asj;", line = 75)
	public static RuntimeException_Sub1 method28382(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub1 local5;
		if (arg0 instanceof RuntimeException_Sub1) {
			local5 = (RuntimeException_Sub1) arg0;
			local5.aString116 = local5.aString116 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!m", name = "aw", descriptor = "(Lclient!dx;IIIIILclient!dj;Lclient!aar;Ljava/lang/String;B)V", line = 1222)
	static void method28383(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class94 arg6, @OriginalArg(7) Class17 arg7, @OriginalArg(8) String arg8) {
		@Pc(9) int local9 = 255 - Class330.anInt4096 * -1558940039 - Class683.anInt5837 * -1927425233;
		if (local9 < 0) {
			local9 = 0;
		}
		if (Class37.aClass83_1 == null || Class494.aClass83_29 == null) {
			if (Class470.aClass478_125.method29730(Class671.anInt5794 * -118519815) && Class470.aClass478_125.method29730(Class98.anInt940 * 1950013631)) {
				Class37.aClass83_1 = arg0.method20076(Class210.method25593(Class470.aClass478_125, Class671.anInt5794 * -118519815, 0), true);
				@Pc(50) Class89 local50 = Class210.method25593(Class470.aClass478_125, Class98.anInt940 * 1950013631, 0);
				Class494.aClass83_29 = arg0.method20076(local50, true);
				local50.method6726();
				Class304.aClass83_26 = arg0.method20076(local50, true);
			} else {
				arg0.method20088(arg1, arg2, arg3, arg5, local9 << 24 | Class486.anInt5040 * 400215733, 1);
			}
		}
		if (Class37.aClass83_1 != null && Class494.aClass83_29 != null) {
			@Pc(93) int local93 = (arg3 - Class494.aClass83_29.method18169() * 2) / Class37.aClass83_1.method18169();
			for (@Pc(95) int local95 = 0; local95 < local93; local95++) {
				Class37.aClass83_1.method18123(arg1 + Class494.aClass83_29.method18169() + local95 * Class37.aClass83_1.method18169(), arg2);
			}
			Class494.aClass83_29.method18123(arg1, arg2);
			Class304.aClass83_26.method18123(arg3 + arg1 - Class304.aClass83_26.method18169(), arg2);
		}
		arg6.method7602(arg8, arg1 + 3, (20 - arg7.anInt52 * 102396103) / 2 + arg7.anInt52 * 102396103 + arg2, Class96_Sub6.anInt826 * 1593226795 | 0xFF000000, -1);
		arg0.method20088(arg1, arg5 + arg2, arg3, arg4 - arg5, local9 << 24 | Class486.anInt5040 * 400215733, 1);
	}

	@OriginalMember(owner = "client!m", name = "cg", descriptor = "(Lclient!yf;B)V", line = 4843)
	static final void method28384(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class215.method25650(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!m", name = "iv", descriptor = "(Lclient!yf;B)V", line = 6126)
	static final void method28385(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class473.method29654(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!m", name = "ahv", descriptor = "(Lclient!yf;I)V", line = 10772)
	static final void method28386(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) Class691 local33 = Class136.method13913(local13 >> 14 & 0x3FFF, local13 & 0x3FFF);
		@Pc(35) boolean local35 = false;
		for (@Pc(40) Class77_Sub1_Sub8 local40 = (Class77_Sub1_Sub8) local33.method36335(); local40 != null; local40 = (Class77_Sub1_Sub8) local33.method36340()) {
			if (local40.anInt3004 * 848546455 == local23) {
				local35 = true;
				break;
			}
		}
		if (local35) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!m", name = "li", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 11999)
	public static final void method28387(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(2) Class82 local2 = Class230.method25826();
		@Pc(8) Class77_Sub20 local8 = Class365.method28132(Class414.aClass414_108, local2.aClass16_1);
		if (arg1.length() > 30) {
			arg1 = arg1.substring(0, 30);
		}
		local8.aClass77_Sub39_Sub1_2.method22403(Class664.method33107(arg0) + Class664.method33107(arg1));
		local8.aClass77_Sub39_Sub1_2.method22440(arg0);
		local8.aClass77_Sub39_Sub1_2.method22440(arg1);
		local2.method2004(local8);
	}
}
