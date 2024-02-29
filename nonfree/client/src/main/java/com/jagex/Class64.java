package com.jagex;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acq")
public class Class64 {

	@OriginalMember(owner = "client!acq", name = "p", descriptor = "Lclient!zm;")
	static Class695 aClass695_1 = new Class695();

	@OriginalMember(owner = "client!acq", name = "<init>", descriptor = "()V", line = 11)
	Class64() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!acq", name = "w", descriptor = "()V", line = 16)
	public static void method925() {
		aClass695_1 = new Class695();
	}

	@OriginalMember(owner = "client!acq", name = "q", descriptor = "()V", line = 16)
	public static void method926() {
		aClass695_1 = new Class695();
	}

	@OriginalMember(owner = "client!acq", name = "t", descriptor = "()V", line = 16)
	public static void method927() {
		aClass695_1 = new Class695();
	}

	@OriginalMember(owner = "client!acq", name = "x", descriptor = "()Z", line = 20)
	public static boolean method928() {
		@Pc(4) Class77_Sub29 local4 = (Class77_Sub29) aClass695_1.method36395();
		return local4 != null;
	}

	@OriginalMember(owner = "client!acq", name = "d", descriptor = "()Z", line = 20)
	public static boolean method929() {
		@Pc(4) Class77_Sub29 local4 = (Class77_Sub29) aClass695_1.method36395();
		return local4 != null;
	}

	@OriginalMember(owner = "client!acq", name = "s", descriptor = "()Z", line = 20)
	public static boolean method930() {
		@Pc(4) Class77_Sub29 local4 = (Class77_Sub29) aClass695_1.method36395();
		return local4 != null;
	}

	@OriginalMember(owner = "client!acq", name = "r", descriptor = "()Z", line = 20)
	public static boolean method931() {
		@Pc(4) Class77_Sub29 local4 = (Class77_Sub29) aClass695_1.method36395();
		return local4 != null;
	}

	@OriginalMember(owner = "client!acq", name = "g", descriptor = "(Lclient!arc;)V", line = 27)
	public static void method932(@OriginalArg(0) Class77_Sub39_Sub1 arg0) {
		@Pc(4) Class77_Sub29 local4 = (Class77_Sub29) aClass695_1.method36395();
		if (local4 == null) {
			return;
		}
		@Pc(13) int local13 = arg0.anInt3089 * 31645619;
		arg0.method22417(local4.anInt1632 * -961081129);
		for (@Pc(22) int local22 = 0; local22 < local4.anInt1631 * 1681479879; local22++) {
			if (local4.anIntArray204[local22] == 0) {
				try {
					@Pc(46) int local46 = local4.anIntArray203[local22];
					@Pc(54) Field local54;
					@Pc(58) int local58;
					if (local46 == 0) {
						local54 = local4.aFieldArray1[local22];
						local58 = local54.getInt(null);
						arg0.method22403(0);
						arg0.method22417(local58);
					} else if (local46 == 1) {
						local54 = local4.aFieldArray1[local22];
						local54.setInt(null, local4.anIntArray205[local22]);
						arg0.method22403(0);
					} else if (local46 == 2) {
						local54 = local4.aFieldArray1[local22];
						local58 = local54.getModifiers();
						arg0.method22403(0);
						arg0.method22417(local58);
					}
					@Pc(114) Method local114;
					if (local46 == 3) {
						local114 = local4.aMethodArray1[local22];
						@Pc(119) byte[][] local119 = local4.aByteArrayArrayArray9[local22];
						@Pc(123) Object[] local123 = new Object[local119.length];
						for (@Pc(125) int local125 = 0; local125 < local119.length; local125++) {
							@Pc(139) ObjectInputStream local139 = new ObjectInputStream(new ByteArrayInputStream(local119[local125]));
							local123[local125] = local139.readObject();
						}
						@Pc(151) Object local151 = local114.invoke(null, local123);
						if (local151 == null) {
							arg0.method22403(0);
						} else if (local151 instanceof Number) {
							arg0.method22403(1);
							arg0.method22428(((Number) local151).longValue());
						} else if (local151 instanceof String) {
							arg0.method22403(2);
							arg0.method22440((String) local151);
						} else {
							arg0.method22403(4);
						}
					} else if (local46 == 4) {
						local114 = local4.aMethodArray1[local22];
						local58 = local114.getModifiers();
						arg0.method22403(0);
						arg0.method22417(local58);
					}
				} catch (@Pc(211) ClassNotFoundException local211) {
					arg0.method22403(-10);
				} catch (@Pc(217) InvalidClassException local217) {
					arg0.method22403(-11);
				} catch (@Pc(223) StreamCorruptedException local223) {
					arg0.method22403(-12);
				} catch (@Pc(229) OptionalDataException local229) {
					arg0.method22403(-13);
				} catch (@Pc(235) IllegalAccessException local235) {
					arg0.method22403(-14);
				} catch (@Pc(241) IllegalArgumentException local241) {
					arg0.method22403(-15);
				} catch (@Pc(247) InvocationTargetException local247) {
					arg0.method22403(-16);
				} catch (@Pc(253) SecurityException local253) {
					arg0.method22403(-17);
				} catch (@Pc(259) IOException local259) {
					arg0.method22403(-18);
				} catch (@Pc(265) NullPointerException local265) {
					arg0.method22403(-19);
				} catch (@Pc(271) Exception local271) {
					arg0.method22403(-20);
				} catch (@Pc(277) Throwable local277) {
					arg0.method22403(-21);
				}
			} else {
				arg0.method22403(local4.anIntArray204[local22]);
			}
		}
		arg0.method22573(local13);
		local4.method24063();
	}

	@OriginalMember(owner = "client!acq", name = "j", descriptor = "(Lclient!akv;I)V", line = 125)
	public static void method933(@OriginalArg(0) Class77_Sub39 arg0) {
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
		aClass695_1.method36383(local3);
	}

	@OriginalMember(owner = "client!acq", name = "i", descriptor = "(Lclient!akv;I)V", line = 125)
	public static void method934(@OriginalArg(0) Class77_Sub39 arg0) {
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
		aClass695_1.method36383(local3);
	}

	@OriginalMember(owner = "client!acq", name = "z", descriptor = "(Lclient!akv;I)V", line = 125)
	public static void method935(@OriginalArg(0) Class77_Sub39 arg0) {
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
		aClass695_1.method36383(local3);
	}

	@OriginalMember(owner = "client!acq", name = "k", descriptor = "(Lclient!akv;I)V", line = 125)
	public static void method936(@OriginalArg(0) Class77_Sub39 arg0) {
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
		aClass695_1.method36383(local3);
	}

	@OriginalMember(owner = "client!acq", name = "u", descriptor = "(Lclient!akv;I)V", line = 125)
	public static void method937(@OriginalArg(0) Class77_Sub39 arg0) {
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
		aClass695_1.method36383(local3);
	}

	@OriginalMember(owner = "client!acq", name = "o", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 214)
	static Class method938(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else if (arg0.equals("void")) {
			return Void.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!acq", name = "e", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 214)
	static Class method939(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else if (arg0.equals("void")) {
			return Void.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!acq", name = "f", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 214)
	static Class method940(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else if (arg0.equals("void")) {
			return Void.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!acq", name = "acb", descriptor = "(Lclient!yf;I)V", line = 9523)
	static final void method941(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13 & -1 - (0x1 << local23);
	}
}
