package com.jagex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public class Class400 implements Interface46 {

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
	public final int anInt4683;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I)V", line = 8)
	Class400(@OriginalArg(0) int arg0) {
		this.anInt4683 = arg0 * 1808171191;
	}

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "()Lclient!mt;", line = 18)
	@Override
	public Class406 method28558() {
		return Class406.aClass406_8;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)Lclient!mt;", line = 18)
	@Override
	public Class406 method28557() {
		return Class406.aClass406_8;
	}

	@OriginalMember(owner = "client!mi", name = "y", descriptor = "()Lclient!mt;", line = 18)
	@Override
	public Class406 method28559() {
		return Class406.aClass406_8;
	}

	@OriginalMember(owner = "client!mi", name = "w", descriptor = "()Lclient!mt;", line = 18)
	@Override
	public Class406 method28560() {
		return Class406.aClass406_8;
	}

	@OriginalMember(owner = "client!mi", name = "y", descriptor = "(Lclient!yf;S)V", line = 36)
	static void method28484(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class567.method31381();
	}

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "(Lclient!akv;IS)V", line = 125)
	public static void method28485(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class77_Sub29 local3 = new Class77_Sub29();
		local3.anInt1631 = arg0.method22478() * 420604151;
		local3.anInt1632 = arg0.method22500() * -1554062617;
		local3.anIntArray203 = new int[local3.anInt1631 * 1681479879];
		local3.anIntArray204 = new int[local3.anInt1631 * 1681479879];
		local3.aFieldArray1 = new Field[local3.anInt1631 * 1681479879];
		local3.anIntArray205 = new int[local3.anInt1631 * 1681479879];
		local3.aMethodArray1 = new Method[local3.anInt1631 * 1681479879];
		local3.aByteArrayArrayArray9 = new byte[local3.anInt1631 * 1681479879][][];
		for (@Pc(61) int local61 = 0; local61 < local3.anInt1631 * 1681479879; local61++) {
			try {
				@Pc(71) int local71 = arg0.method22478();
				@Pc(83) String local83;
				@Pc(87) String local87;
				@Pc(89) int local89;
				if (local71 == 0 || local71 == 1 || local71 == 2) {
					local83 = arg0.method22523();
					local87 = arg0.method22523();
					local89 = 0;
					if (local71 == 1) {
						local89 = arg0.method22500();
					}
					local3.anIntArray203[local61] = local71;
					local3.anIntArray205[local61] = local89;
					if (Class19.method406(local83).getClassLoader() == null) {
						throw new SecurityException();
					}
					local3.aFieldArray1[local61] = Class19.method406(local83).getDeclaredField(local87);
				} else if (local71 == 3 || local71 == 4) {
					local83 = arg0.method22523();
					local87 = arg0.method22523();
					local89 = arg0.method22478();
					@Pc(146) String[] local146 = new String[local89];
					for (@Pc(148) int local148 = 0; local148 < local89; local148++) {
						local146[local148] = arg0.method22523();
					}
					@Pc(163) String local163 = arg0.method22523();
					@Pc(166) byte[][] local166 = new byte[local89][];
					@Pc(178) int local178;
					if (local71 == 3) {
						for (@Pc(171) int local171 = 0; local171 < local89; local171++) {
							local178 = arg0.method22500();
							local166[local171] = new byte[local178];
							arg0.method22533(local166[local171], 0, local178);
						}
					}
					local3.anIntArray203[local61] = local71;
					@Pc(201) Class[] local201 = new Class[local89];
					for (local178 = 0; local178 < local89; local178++) {
						local201[local178] = Class19.method406(local146[local178]);
					}
					@Pc(220) Class local220 = Class19.method406(local163);
					if (Class19.method406(local83).getClassLoader() == null) {
						throw new SecurityException();
					}
					@Pc(234) Method[] local234 = Class19.method406(local83).getDeclaredMethods();
					@Pc(236) Method[] local236 = local234;
					for (@Pc(238) int local238 = 0; local238 < local236.length; local238++) {
						@Pc(246) Method local246 = local236[local238];
						if (local246.getName().equals(local87)) {
							@Pc(254) Class[] local254 = local246.getParameterTypes();
							if (local201.length == local254.length) {
								@Pc(261) boolean local261 = true;
								for (@Pc(263) int local263 = 0; local263 < local201.length; local263++) {
									if (local254[local263] != local201[local263]) {
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
					local3.aByteArrayArrayArray9[local61] = local166;
				}
			} catch (@Pc(299) ClassNotFoundException local299) {
				local3.anIntArray204[local61] = -1;
			} catch (@Pc(306) SecurityException local306) {
				local3.anIntArray204[local61] = -2;
			} catch (@Pc(313) NullPointerException local313) {
				local3.anIntArray204[local61] = -3;
			} catch (@Pc(320) Exception local320) {
				local3.anIntArray204[local61] = -4;
			} catch (@Pc(327) Throwable local327) {
				local3.anIntArray204[local61] = -5;
			}
		}
		Class64.aClass695_1.method36383(local3);
	}

	@OriginalMember(owner = "client!mi", name = "ne", descriptor = "(Lclient!yf;I)V", line = 6926)
	static final void method28486(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class352.method27914(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!mi", name = "aea", descriptor = "(Lclient!yf;I)V", line = 9864)
	static final void method28487(@OriginalArg(0) Class665 arg0) {
		@Pc(12) long local12 = arg0.aLongArray28[(arg0.anInt5782 -= 1091885681) * 1572578961];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local12 == -1L ? "" : Long.toString(local12, 36).toUpperCase();
	}

	@OriginalMember(owner = "client!mi", name = "aeb", descriptor = "(Lclient!yf;I)V", line = 9951)
	static final void method28488(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ((Class18) Class537.aClass35_Sub7_1.method18319(local12)).aBoolean7 ? 1 : 0;
	}
}
