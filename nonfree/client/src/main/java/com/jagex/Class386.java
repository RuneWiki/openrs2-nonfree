package com.jagex;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public class Class386 {

	@OriginalMember(owner = "client!lt", name = "dc", descriptor = "Lclient!k;")
	public static Class355 aClass355_1;

	@OriginalMember(owner = "client!lt", name = "p", descriptor = "Lclient!lt;")
	public static final Class386 aClass386_1 = new Class386();

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "Lclient!lt;")
	public static final Class386 aClass386_2 = new Class386();

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "()V", line = 7)
	Class386() {
	}

	@OriginalMember(owner = "client!lt", name = "p", descriptor = "(Ljava/lang/Class;II)Lclient!yp;", line = 15)
	public static Interface75 method28346(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Map local2 = Class673.aMap24;
		synchronized (Class673.aMap24) {
			@Pc(8) Map local8 = (Map) Class673.aMap24.get(arg0);
			if (local8 == null) {
				local8 = new HashMap();
				@Pc(19) Interface75[] local19 = (Interface75[]) arg0.getEnumConstants();
				for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
					@Pc(29) Interface75 local29 = local19[local21];
					local8.put(local29.method36479(), local29);
				}
				Class673.aMap24.put(arg0, local8);
			}
			return (Interface75) local8.get(arg1);
		}
	}

	@OriginalMember(owner = "client!lt", name = "t", descriptor = "([BIII)Ljava/lang/String;", line = 151)
	public static String method28347(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) char[] local2 = new char[arg2];
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = arg0[local6 + arg1] & 0xFF;
			if (local17 != 0) {
				if (local17 >= 128 && local17 < 160) {
					@Pc(32) char local32 = Class680.aCharArray8[local17 - 128];
					if (local32 == '\u0000') {
						local32 = '?';
					}
					local17 = local32;
				}
				local2[local4++] = (char) local17;
			}
		}
		return new String(local2, 0, local4);
	}

	@OriginalMember(owner = "client!lt", name = "ee", descriptor = "(ZI)V", line = 908)
	public static void method28348(@OriginalArg(0) boolean arg0) {
		Class136_Sub1.aBoolean349 = arg0;
	}

	@OriginalMember(owner = "client!lt", name = "dl", descriptor = "(Lclient!yf;I)V", line = 5185)
	static final void method28349(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class347.method27850(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!lt", name = "aqv", descriptor = "(Lclient!yf;B)V", line = 12379)
	static final void method28350(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub11_1.method15306() == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!lt", name = "auj", descriptor = "(Lclient!yf;B)V", line = 12989)
	static final void method28351(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) (Class537.aLong285 * -4861593676329809233L / 60000L);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) ((Class537.aLong285 * -4861593676329809233L - Class280.method26667() - Class241.aLong246 * 656147693700925901L) / 60000L);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class262.aBoolean659 ? 1 : 0;
	}
}
