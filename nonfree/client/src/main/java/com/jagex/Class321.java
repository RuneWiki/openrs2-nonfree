package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public class Class321 {

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "Lclient!ig;")
	public static final Class321 aClass321_9 = new Class321(0, false);

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Lclient!ig;")
	public static final Class321 aClass321_4 = new Class321(1, false);

	@OriginalMember(owner = "client!ig", name = "v", descriptor = "Lclient!ig;")
	static final Class321 aClass321_6 = new Class321(2, true);

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "Lclient!ig;")
	public static final Class321 aClass321_3 = new Class321(3, false);

	@OriginalMember(owner = "client!ig", name = "y", descriptor = "Lclient!ig;")
	static final Class321 aClass321_5 = new Class321(4, true);

	@OriginalMember(owner = "client!ig", name = "w", descriptor = "Lclient!ig;")
	static final Class321 aClass321_7 = new Class321(5, true);

	@OriginalMember(owner = "client!ig", name = "t", descriptor = "Lclient!ig;")
	static final Class321 aClass321_8 = new Class321(6, true);

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
	public final int anInt4076;

	@OriginalMember(owner = "client!ig", name = "x", descriptor = "Z")
	final boolean aBoolean697;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(IZ)V", line = 14)
	Class321(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt4076 = arg0 * -1942521291;
		this.aBoolean697 = arg1;
	}

	@OriginalMember(owner = "client!ig", name = "v", descriptor = "(I)Lclient!ig;", line = 20)
	public static Class321 method27456(@OriginalArg(0) int arg0) {
		if (aClass321_9.anInt4076 * -2097182691 == arg0) {
			return aClass321_9;
		} else if (aClass321_4.anInt4076 * -2097182691 == arg0) {
			return aClass321_4;
		} else if (arg0 == aClass321_6.anInt4076 * -2097182691) {
			return aClass321_6;
		} else if (arg0 == aClass321_3.anInt4076 * -2097182691) {
			return aClass321_3;
		} else if (arg0 == aClass321_5.anInt4076 * -2097182691) {
			return aClass321_5;
		} else if (aClass321_7.anInt4076 * -2097182691 == arg0) {
			return aClass321_7;
		} else if (arg0 == aClass321_8.anInt4076 * -2097182691) {
			return aClass321_8;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "()Z", line = 31)
	public boolean method27457() {
		return this.aBoolean697;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)Z", line = 31)
	public boolean method27458() {
		return this.aBoolean697;
	}

	@OriginalMember(owner = "client!ig", name = "y", descriptor = "()Z", line = 31)
	public boolean method27459() {
		return this.aBoolean697;
	}

	@OriginalMember(owner = "client!ig", name = "w", descriptor = "()Z", line = 31)
	public boolean method27460() {
		return this.aBoolean697;
	}

	@OriginalMember(owner = "client!ig", name = "bj", descriptor = "(Lclient!yf;I)V", line = 4625)
	static final void method27461(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5782 -= -2111195934;
		if (arg0.aLongArray28[arg0.anInt5782 * 1572578961] < arg0.aLongArray28[arg0.anInt5782 * 1572578961 + 1]) {
			arg0.anInt5786 += arg0.anIntArray535[arg0.anInt5786 * 662605117] * -793595371;
		}
	}

	@OriginalMember(owner = "client!ig", name = "afm", descriptor = "(Lclient!yf;B)V", line = 10365)
	static final void method27462(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5781 -= -1374580330;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147 + 1];
		if (client.anInt3466 * 365872613 == 0 && (client.aBoolean620 && !client.aBoolean616 || client.aBoolean599)) {
			return;
		}
		@Pc(40) Class82 local40 = Class230.method25826();
		@Pc(46) Class77_Sub20 local46 = Class365.method28132(Class414.aClass414_85, local40.aClass16_1);
		local46.aClass77_Sub39_Sub1_2.method22408(0);
		@Pc(57) int local57 = local46.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
		local46.aClass77_Sub39_Sub1_2.method22440(local14);
		Class218.method25709(local46.aClass77_Sub39_Sub1_2, local25);
		local46.aClass77_Sub39_Sub1_2.method22462(local46.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local57);
		local40.method2004(local46);
	}

	@OriginalMember(owner = "client!ig", name = "ahi", descriptor = "(Lclient!yf;I)V", line = 10687)
	static final void method27463(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(15) Class77_Sub1_Sub8 local15 = Class136.method13911(local12);
		if (local15 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local15.anInt3007 * -1320299993;
		}
	}

	@OriginalMember(owner = "client!ig", name = "are", descriptor = "(Lclient!yf;S)V", line = 12435)
	static final void method27464(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub26_1.method15879() == 1 ? 1 : 0;
	}
}
