package com.jagex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acu")
public class Class13_Sub19 extends Class13 {

	@OriginalMember(owner = "client!acu", name = "a", descriptor = "I")
	final int anInt738;

	@OriginalMember(owner = "client!acu", name = "g", descriptor = "I")
	final int anInt737;

	@OriginalMember(owner = "client!acu", name = "l", descriptor = "I")
	final int anInt736;

	@OriginalMember(owner = "client!acu", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 11)
	Class13_Sub19(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt738 = arg0.method20271() * 550663135;
		this.anInt737 = arg0.method20271() * 1918053949;
		this.anInt736 = arg0.method20269() * -1213191075;
	}

	@OriginalMember(owner = "client!acu", name = "a", descriptor = "(I)V", line = 18)
	@Override
	public void method16888() {
		@Pc(6) Class163 local6 = Class131.aClass163Array1[this.anInt738 * 297469983];
		@Pc(13) Class150 local13 = Class131.aClass150Array1[this.anInt737 * -803055339];
		local13.method23131(local6, this.anInt736 * 888866805);
	}

	@OriginalMember(owner = "client!acu", name = "h", descriptor = "()V", line = 18)
	@Override
	public void method16896() {
		@Pc(6) Class163 local6 = Class131.aClass163Array1[this.anInt738 * 297469983];
		@Pc(13) Class150 local13 = Class131.aClass150Array1[this.anInt737 * -803055339];
		local13.method23131(local6, this.anInt736 * 888866805);
	}

	@OriginalMember(owner = "client!acu", name = "l", descriptor = "(Lclient!ahb;II)V", line = 125)
	public static void method7198(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class3_Sub43 local3 = new Class3_Sub43();
		local3.anInt1490 = arg0.method20269() * -983415691;
		local3.anInt1489 = arg0.method20275() * 1393341701;
		local3.anIntArray199 = new int[local3.anInt1490 * 1603693533];
		local3.anIntArray200 = new int[local3.anInt1490 * 1603693533];
		local3.aFieldArray1 = new Field[local3.anInt1490 * 1603693533];
		local3.anIntArray201 = new int[local3.anInt1490 * 1603693533];
		local3.aMethodArray1 = new Method[local3.anInt1490 * 1603693533];
		local3.aByteArrayArrayArray11 = new byte[local3.anInt1490 * 1603693533][][];
		for (@Pc(61) int local61 = 0; local61 < local3.anInt1490 * 1603693533; local61++) {
			try {
				@Pc(71) int local71 = arg0.method20269();
				@Pc(83) String local83;
				@Pc(87) String local87;
				@Pc(89) int local89;
				if (local71 == 0 || local71 == 1 || local71 == 2) {
					local83 = arg0.method20283();
					local87 = arg0.method20283();
					local89 = 0;
					if (local71 == 1) {
						local89 = arg0.method20275();
					}
					local3.anIntArray199[local61] = local71;
					local3.anIntArray201[local61] = local89;
					if (Class325.method26005(local83).getClassLoader() == null) {
						throw new SecurityException();
					}
					local3.aFieldArray1[local61] = Class325.method26005(local83).getDeclaredField(local87);
				} else if (local71 == 3 || local71 == 4) {
					local83 = arg0.method20283();
					local87 = arg0.method20283();
					local89 = arg0.method20269();
					@Pc(146) String[] local146 = new String[local89];
					for (@Pc(148) int local148 = 0; local148 < local89; local148++) {
						local146[local148] = arg0.method20283();
					}
					@Pc(163) String local163 = arg0.method20283();
					@Pc(166) byte[][] local166 = new byte[local89][];
					@Pc(178) int local178;
					if (local71 == 3) {
						for (@Pc(171) int local171 = 0; local171 < local89; local171++) {
							local178 = arg0.method20275();
							local166[local171] = new byte[local178];
							arg0.method20286(local166[local171], 0, local178);
						}
					}
					local3.anIntArray199[local61] = local71;
					@Pc(201) Class[] local201 = new Class[local89];
					for (local178 = 0; local178 < local89; local178++) {
						local201[local178] = Class325.method26005(local146[local178]);
					}
					@Pc(220) Class local220 = Class325.method26005(local163);
					if (Class325.method26005(local83).getClassLoader() == null) {
						throw new SecurityException();
					}
					@Pc(234) Method[] local234 = Class325.method26005(local83).getDeclaredMethods();
					@Pc(236) Method[] local236 = local234;
					for (@Pc(238) int local238 = 0; local238 < local236.length; local238++) {
						@Pc(246) Method local246 = local236[local238];
						if (local246.getName().equals(local87)) {
							@Pc(254) Class[] local254 = local246.getParameterTypes();
							if (local201.length == local254.length) {
								@Pc(261) boolean local261 = true;
								for (@Pc(263) int local263 = 0; local263 < local201.length; local263++) {
									if (local201[local263] != local254[local263]) {
										local261 = false;
										break;
									}
								}
								if (local261 && local220 == local246.getReturnType()) {
									local3.aMethodArray1[local61] = local246;
								}
							}
						}
					}
					local3.aByteArrayArrayArray11[local61] = local166;
				}
			} catch (@Pc(299) ClassNotFoundException local299) {
				local3.anIntArray200[local61] = -1;
			} catch (@Pc(306) SecurityException local306) {
				local3.anIntArray200[local61] = -2;
			} catch (@Pc(313) NullPointerException local313) {
				local3.anIntArray200[local61] = -3;
			} catch (@Pc(320) Exception local320) {
				local3.anIntArray200[local61] = -4;
			} catch (@Pc(327) Throwable local327) {
				local3.anIntArray200[local61] = -5;
			}
		}
		Class610.aClass553_57.method32702(local3);
	}

	@OriginalMember(owner = "client!acu", name = "dq", descriptor = "(Lclient!de;Lclient!agk;Lclient!se;IIIII)V", line = 551)
	static void method7197(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class3_Sub26 arg1, @OriginalArg(2) Class452 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = arg3 - arg6 / 2 - 5;
		@Pc(11) int local11 = arg4 + 2;
		if (arg2.anInt5034 * -1874290321 != 0) {
			arg0.method17063(local7, local11, arg6 + 10, arg4 + arg5 - local11 + 1, arg2.anInt5034 * -1874290321);
		}
		if (arg2.anInt5035 * -329291339 != 0) {
			arg0.method17062(local7, local11, arg6 + 10, arg4 + arg5 - local11 + 1, arg2.anInt5035 * -329291339);
		}
		@Pc(64) int local64 = arg2.anInt5040 * 985187229;
		if (arg1.aBoolean300 && arg2.anInt5030 * 608289279 != -1) {
			local64 = arg2.anInt5030 * 608289279;
		}
		Class3_Sub3.aClass14_5.method3283(arg2.aString224, arg3, arg4, arg6, arg5, local64 | 0xFF000000, Class58_Sub1.aClass484_2.anInt5177 * -260489881, 1, 0, 0, null, null, null, 0, 0);
	}
}
