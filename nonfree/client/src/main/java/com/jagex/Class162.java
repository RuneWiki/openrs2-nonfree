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

@OriginalClass("client!b")
public class Class162 {

	@OriginalMember(owner = "client!b", name = "l", descriptor = "Ljava/lang/String;")
	public String aString128;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Ljava/lang/String;")
	public String aString129;

	@OriginalMember(owner = "client!b", name = "v", descriptor = "I")
	public int anInt3260;

	@OriginalMember(owner = "client!b", name = "w", descriptor = "I")
	public int anInt3261;

	@OriginalMember(owner = "client!b", name = "y", descriptor = "I")
	public int anInt3262;

	@OriginalMember(owner = "client!b", name = "x", descriptor = "Ljava/lang/String;")
	public String aString130;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "Z")
	public boolean aBoolean556;

	@OriginalMember(owner = "client!b", name = "q", descriptor = "Z")
	public boolean aBoolean557;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "Ljava/lang/String;")
	public String aString131;

	@OriginalMember(owner = "client!b", name = "d", descriptor = "I")
	public int anInt3263;

	@OriginalMember(owner = "client!b", name = "v", descriptor = "(Lclient!arc;I)V", line = 27)
	public static void method24337(@OriginalArg(0) Class77_Sub39_Sub1 arg0) {
		@Pc(4) Class77_Sub29 local4 = (Class77_Sub29) Class64.aClass695_1.method36395();
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

	@OriginalMember(owner = "client!b", name = "l", descriptor = "(Lclient!yf;I)V", line = 32)
	static void method24338(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class97.method7766();
	}

	@OriginalMember(owner = "client!b", name = "q", descriptor = "(I)Lclient!alh;", line = 105)
	public static Class145_Sub1 method24339() {
		return Class527.method30680(Class680.aClass25_8.anInt122 * -1664252895);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(Lclient!yf;I)V", line = 4373)
	static final void method24340(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.anIntArray535[arg0.anInt5786 * 662605117];
	}

	@OriginalMember(owner = "client!b", name = "jo", descriptor = "(Lclient!yf;B)V", line = 6162)
	static final void method24341(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class491.method30030(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!b", name = "jj", descriptor = "(Lclient!yf;I)V", line = 6296)
	static final void method24342(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		Class345.method27832(local16, arg0);
	}

	@OriginalMember(owner = "client!b", name = "se", descriptor = "(Lclient!yf;B)V", line = 7924)
	static final void method24343(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3886 * 1994134509;
	}

	@OriginalMember(owner = "client!b", name = "sz", descriptor = "(Lclient!yf;I)V", line = 7930)
	static final void method24344(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3888 * -1866862435 == 1 ? local16.anInt3889 * 939166901 : -1;
	}

	@OriginalMember(owner = "client!b", name = "yj", descriptor = "(Lclient!yf;I)V", line = 8979)
	static final void method24345(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		Class29.method504(local13);
	}

	@OriginalMember(owner = "client!b", name = "mx", descriptor = "(I)V", line = 12030)
	public static final void method24346() {
		@Pc(2) Class82 local2 = Class230.method25826();
		@Pc(8) Class77_Sub20 local8 = Class365.method28132(Class414.aClass414_72, local2.aClass16_1);
		local8.aClass77_Sub39_Sub1_2.method22403(0);
		local2.method2004(local8);
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 12486)
	Class162() {
	}

	@OriginalMember(owner = "client!b", name = "asl", descriptor = "(Lclient!yf;I)V", line = 12597)
	static final void method24347(@OriginalArg(0) Class665 arg0) {
		@Pc(2) long local2 = Class280.method26667();
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) (local2 / 60000L);
	}
}
