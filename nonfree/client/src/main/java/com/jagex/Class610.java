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

@OriginalClass("client!yw")
public class Class610 {

	@OriginalMember(owner = "client!yw", name = "p", descriptor = "Lclient!wk;")
	static Class553 aClass553_57 = new Class553();

	@OriginalMember(owner = "client!yw", name = "<init>", descriptor = "()V", line = 11)
	Class610() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!yw", name = "x", descriptor = "()V", line = 16)
	public static void method33573() {
		aClass553_57 = new Class553();
	}

	@OriginalMember(owner = "client!yw", name = "s", descriptor = "()V", line = 16)
	public static void method33574() {
		aClass553_57 = new Class553();
	}

	@OriginalMember(owner = "client!yw", name = "y", descriptor = "(Lclient!and;)V", line = 27)
	public static void method33572(@OriginalArg(0) Class3_Sub41_Sub1 arg0) {
		@Pc(4) Class3_Sub43 local4 = (Class3_Sub43) aClass553_57.method32768();
		if (local4 == null) {
			return;
		}
		@Pc(13) int local13 = arg0.anInt2803 * 62066237;
		arg0.method20254(local4.anInt1489 * 14995405);
		for (@Pc(22) int local22 = 0; local22 < local4.anInt1490 * 1603693533; local22++) {
			if (local4.anIntArray200[local22] == 0) {
				try {
					@Pc(46) int local46 = local4.anIntArray199[local22];
					@Pc(54) Field local54;
					@Pc(58) int local58;
					if (local46 == 0) {
						local54 = local4.aFieldArray1[local22];
						local58 = local54.getInt(null);
						arg0.method20250(0);
						arg0.method20254(local58);
					} else if (local46 == 1) {
						local54 = local4.aFieldArray1[local22];
						local54.setInt(null, local4.anIntArray201[local22]);
						arg0.method20250(0);
					} else if (local46 == 2) {
						local54 = local4.aFieldArray1[local22];
						local58 = local54.getModifiers();
						arg0.method20250(0);
						arg0.method20254(local58);
					}
					@Pc(114) Method local114;
					if (local46 == 3) {
						local114 = local4.aMethodArray1[local22];
						@Pc(119) byte[][] local119 = local4.aByteArrayArrayArray11[local22];
						@Pc(123) Object[] local123 = new Object[local119.length];
						for (@Pc(125) int local125 = 0; local125 < local119.length; local125++) {
							@Pc(139) ObjectInputStream local139 = new ObjectInputStream(new ByteArrayInputStream(local119[local125]));
							local123[local125] = local139.readObject();
						}
						@Pc(151) Object local151 = local114.invoke(null, local123);
						if (local151 == null) {
							arg0.method20250(0);
						} else if (local151 instanceof Number) {
							arg0.method20250(1);
							arg0.method20409(((Number) local151).longValue());
						} else if (local151 instanceof String) {
							arg0.method20250(2);
							arg0.method20260((String) local151);
						} else {
							arg0.method20250(4);
						}
					} else if (local46 == 4) {
						local114 = local4.aMethodArray1[local22];
						local58 = local114.getModifiers();
						arg0.method20250(0);
						arg0.method20254(local58);
					}
				} catch (@Pc(210) ClassNotFoundException local210) {
					arg0.method20250(-10);
				} catch (@Pc(216) InvalidClassException local216) {
					arg0.method20250(-11);
				} catch (@Pc(222) StreamCorruptedException local222) {
					arg0.method20250(-12);
				} catch (@Pc(228) OptionalDataException local228) {
					arg0.method20250(-13);
				} catch (@Pc(234) IllegalAccessException local234) {
					arg0.method20250(-14);
				} catch (@Pc(240) IllegalArgumentException local240) {
					arg0.method20250(-15);
				} catch (@Pc(246) InvocationTargetException local246) {
					arg0.method20250(-16);
				} catch (@Pc(252) SecurityException local252) {
					arg0.method20250(-17);
				} catch (@Pc(258) IOException local258) {
					arg0.method20250(-18);
				} catch (@Pc(264) NullPointerException local264) {
					arg0.method20250(-19);
				} catch (@Pc(270) Exception local270) {
					arg0.method20250(-20);
				} catch (@Pc(276) Throwable local276) {
					arg0.method20250(-21);
				}
			} else {
				arg0.method20250(local4.anIntArray200[local22]);
			}
		}
		arg0.method20299(local13);
		local4.method33656();
	}

	@OriginalMember(owner = "client!yw", name = "u", descriptor = "(Lclient!and;)V", line = 27)
	public static void method33575(@OriginalArg(0) Class3_Sub41_Sub1 arg0) {
		@Pc(4) Class3_Sub43 local4 = (Class3_Sub43) aClass553_57.method32768();
		if (local4 == null) {
			return;
		}
		@Pc(13) int local13 = arg0.anInt2803 * 62066237;
		arg0.method20254(local4.anInt1489 * 14995405);
		for (@Pc(22) int local22 = 0; local22 < local4.anInt1490 * 1603693533; local22++) {
			if (local4.anIntArray200[local22] == 0) {
				try {
					@Pc(46) int local46 = local4.anIntArray199[local22];
					@Pc(54) Field local54;
					@Pc(58) int local58;
					if (local46 == 0) {
						local54 = local4.aFieldArray1[local22];
						local58 = local54.getInt(null);
						arg0.method20250(0);
						arg0.method20254(local58);
					} else if (local46 == 1) {
						local54 = local4.aFieldArray1[local22];
						local54.setInt(null, local4.anIntArray201[local22]);
						arg0.method20250(0);
					} else if (local46 == 2) {
						local54 = local4.aFieldArray1[local22];
						local58 = local54.getModifiers();
						arg0.method20250(0);
						arg0.method20254(local58);
					}
					@Pc(114) Method local114;
					if (local46 == 3) {
						local114 = local4.aMethodArray1[local22];
						@Pc(119) byte[][] local119 = local4.aByteArrayArrayArray11[local22];
						@Pc(123) Object[] local123 = new Object[local119.length];
						for (@Pc(125) int local125 = 0; local125 < local119.length; local125++) {
							@Pc(139) ObjectInputStream local139 = new ObjectInputStream(new ByteArrayInputStream(local119[local125]));
							local123[local125] = local139.readObject();
						}
						@Pc(151) Object local151 = local114.invoke(null, local123);
						if (local151 == null) {
							arg0.method20250(0);
						} else if (local151 instanceof Number) {
							arg0.method20250(1);
							arg0.method20409(((Number) local151).longValue());
						} else if (local151 instanceof String) {
							arg0.method20250(2);
							arg0.method20260((String) local151);
						} else {
							arg0.method20250(4);
						}
					} else if (local46 == 4) {
						local114 = local4.aMethodArray1[local22];
						local58 = local114.getModifiers();
						arg0.method20250(0);
						arg0.method20254(local58);
					}
				} catch (@Pc(210) ClassNotFoundException local210) {
					arg0.method20250(-10);
				} catch (@Pc(216) InvalidClassException local216) {
					arg0.method20250(-11);
				} catch (@Pc(222) StreamCorruptedException local222) {
					arg0.method20250(-12);
				} catch (@Pc(228) OptionalDataException local228) {
					arg0.method20250(-13);
				} catch (@Pc(234) IllegalAccessException local234) {
					arg0.method20250(-14);
				} catch (@Pc(240) IllegalArgumentException local240) {
					arg0.method20250(-15);
				} catch (@Pc(246) InvocationTargetException local246) {
					arg0.method20250(-16);
				} catch (@Pc(252) SecurityException local252) {
					arg0.method20250(-17);
				} catch (@Pc(258) IOException local258) {
					arg0.method20250(-18);
				} catch (@Pc(264) NullPointerException local264) {
					arg0.method20250(-19);
				} catch (@Pc(270) Exception local270) {
					arg0.method20250(-20);
				} catch (@Pc(276) Throwable local276) {
					arg0.method20250(-21);
				}
			} else {
				arg0.method20250(local4.anIntArray200[local22]);
			}
		}
		arg0.method20299(local13);
		local4.method33656();
	}

	@OriginalMember(owner = "client!yw", name = "z", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 214)
	static Class method33576(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!yw", name = "c", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 214)
	static Class method33577(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!yw", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 214)
	static Class method33578(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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
}
