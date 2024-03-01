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
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public class Class351 implements Callable {

	// $FF: synthetic field
	@OriginalMember(owner = "client!no", name = "this$0", descriptor = "Lclient!nl;")
	final Class348 this$0;

	@OriginalMember(owner = "client!no", name = "p", descriptor = "Ljava/net/URL;")
	URL anURL2;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "Lclient!aok;")
	Class3_Sub1_Sub12_Sub1 aClass3_Sub1_Sub12_Sub1_2;

	@OriginalMember(owner = "client!no", name = "p", descriptor = "(I)[Lclient!so;", line = 17)
	public static Class461[] method26585() {
		return new Class461[] { Class461.aClass461_1, Class461.aClass461_3, Class461.aClass461_5, Class461.aClass461_2, Class461.aClass461_4, Class461.aClass461_6 };
	}

	@OriginalMember(owner = "client!no", name = "g", descriptor = "(Lclient!and;I)V", line = 27)
	public static void method26587(@OriginalArg(0) Class3_Sub41_Sub1 arg0) {
		@Pc(4) Class3_Sub43 local4 = (Class3_Sub43) Class610.aClass553_57.method32768();
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

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!nl;Ljava/net/URL;Lclient!aok;)V", line = 87)
	Class351(@OriginalArg(0) Class348 arg0, @OriginalArg(1) URL arg1, @OriginalArg(2) Class3_Sub1_Sub12_Sub1 arg2) {
		this.this$0 = arg0;
		this.anURL2 = arg1;
		this.aClass3_Sub1_Sub12_Sub1_2 = arg2;
	}

	@OriginalMember(owner = "client!no", name = "p", descriptor = "()Ljava/lang/Object;", line = 93)
	public Object method26583() throws Exception {
		@Pc(3) URLConnection local3 = this.anURL2.openConnection();
		local3.setConnectTimeout(10000);
		local3.setReadTimeout(60000);
		@Pc(11) boolean local11 = true;
		try {
			local3.connect();
		} catch (@Pc(15) IOException local15) {
			this.this$0.aLong263 = Class176.method23413() * -5744719877693567329L;
			local11 = false;
		}
		return new Class344(this.this$0, local11 ? local3.getInputStream() : null, this.aClass3_Sub1_Sub12_Sub1_2, this.anURL2);
	}

	@OriginalMember(owner = "client!no", name = "call", descriptor = "()Ljava/lang/Object;", line = 93)
	@Override
	public Object call() throws Exception {
		@Pc(3) URLConnection local3 = this.anURL2.openConnection();
		local3.setConnectTimeout(10000);
		local3.setReadTimeout(60000);
		@Pc(11) boolean local11 = true;
		try {
			local3.connect();
		} catch (@Pc(15) IOException local15) {
			this.this$0.aLong263 = Class176.method23413() * -5744719877693567329L;
			local11 = false;
		}
		return new Class344(this.this$0, local11 ? local3.getInputStream() : null, this.aClass3_Sub1_Sub12_Sub1_2, this.anURL2);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "()Ljava/lang/Object;", line = 93)
	public Object method26584() throws Exception {
		@Pc(3) URLConnection local3 = this.anURL2.openConnection();
		local3.setConnectTimeout(10000);
		local3.setReadTimeout(60000);
		@Pc(11) boolean local11 = true;
		try {
			local3.connect();
		} catch (@Pc(15) IOException local15) {
			this.this$0.aLong263 = Class176.method23413() * -5744719877693567329L;
			local11 = false;
		}
		return new Class344(this.this$0, local11 ? local3.getInputStream() : null, this.aClass3_Sub1_Sub12_Sub1_2, this.anURL2);
	}

	@OriginalMember(owner = "client!no", name = "zv", descriptor = "(Lclient!vs;B)V", line = 8629)
	static final void method26586(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(28) boolean local28 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1] == 1;
		Class632.method33872(local13, local28);
	}

	@OriginalMember(owner = "client!no", name = "mi", descriptor = "(B)Z", line = 11645)
	static boolean method26588() {
		client.anInt3060 += -1421248967;
		client.aBoolean581 = true;
		return true;
	}
}
