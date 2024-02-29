package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public abstract class Class102 implements Interface5 {

	@OriginalMember(owner = "client!hu", name = "au", descriptor = "I")
	static int anInt955;

	@OriginalMember(owner = "client!hu", name = "p", descriptor = "Lclient!pw;")
	final Class478 aClass478_25;

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "Lclient!er;")
	Class232 aClass232_11;

	@OriginalMember(owner = "client!hu", name = "p", descriptor = "(I)[Lclient!vu;", line = 14)
	public static Class605[] method7915() {
		return new Class605[] { Class605.aClass605_3, Class605.aClass605_1, Class605.aClass605_2 };
	}

	@OriginalMember(owner = "client!hu", name = "l", descriptor = "(S)Z", line = 100)
	static boolean method7916() {
		try {
			@Pc(3) Class57 local3 = new Class57();
			@Pc(8) byte[] local8 = local3.method858(Class319.aByteArray75);
			Class667.method33160(local8);
			return true;
		} catch (@Pc(15) Exception local15) {
			return false;
		}
	}

	@OriginalMember(owner = "client!hu", name = "y", descriptor = "(JIZLclient!yi;I)Ljava/lang/String;", line = 114)
	public static String method7917(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class667 arg3) {
		@Pc(1) char local1 = ',';
		@Pc(3) char local3 = '.';
		if (arg3 == Class667.aClass667_6) {
			local1 = '.';
			local3 = ',';
		}
		if (arg3 == Class667.aClass667_11) {
			local3 = ' ';
		}
		@Pc(17) boolean local17 = false;
		if (arg0 < 0L) {
			local17 = true;
			arg0 = -arg0;
		}
		@Pc(31) StringBuilder local31 = new StringBuilder(26);
		@Pc(35) int local35;
		@Pc(41) int local41;
		if (arg1 > 0) {
			for (local35 = 0; local35 < arg1; local35++) {
				local41 = (int) arg0;
				arg0 /= 10L;
				local31.append((char) (local41 + 48 - (int) arg0 * 10));
			}
			local31.append(local1);
		}
		local35 = 0;
		while (true) {
			local41 = (int) arg0;
			arg0 /= 10L;
			local31.append((char) (local41 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local17) {
					local31.append('-');
				}
				return local31.reverse().toString();
			}
			if (arg2) {
				local35++;
				if (local35 % 3 == 0) {
					local31.append(local3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!pw;I)V", line = 320)
	Class102(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1) {
		this.aClass478_25 = arg0;
		this.aClass232_11 = new Class232(arg1);
	}

	@OriginalMember(owner = "client!hu", name = "bl", descriptor = "(Lclient!aqm;Lclient!aar;I)I", line = 1381)
	static int method7918(@OriginalArg(0) Class77_Sub1_Sub7 arg0, @OriginalArg(1) Class17 arg1) {
		@Pc(3) String local3 = Class24.method445(arg0);
		@Pc(7) int[] local7 = Class11.method171(arg0);
		if (local7 != null) {
			local3 = local3 + Class35_Sub21.method18312(local7);
		}
		@Pc(27) int local27 = arg1.method299(local3, Class148.aClass83Array6);
		if (arg0.aBoolean489) {
			local27 += Class653.aClass83_39.method18169() + 4;
		}
		return local27;
	}

	@OriginalMember(owner = "client!hu", name = "amu", descriptor = "(Lclient!yf;B)V", line = 11832)
	static final void method7919(@OriginalArg(0) Class665 arg0) {
		@Pc(17) boolean local17 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1;
		if (local17) {
			Class264.method26451(3);
		} else {
			Class264.method26451(2);
		}
	}
}
