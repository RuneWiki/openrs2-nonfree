package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaj")
public class Class11 implements Interface70 {

	@OriginalMember(owner = "client!aaj", name = "tq", descriptor = "I")
	public static int anInt36;

	@OriginalMember(owner = "client!aaj", name = "w", descriptor = "I")
	int anInt30;

	@OriginalMember(owner = "client!aaj", name = "c", descriptor = "I")
	int anInt31;

	@OriginalMember(owner = "client!aaj", name = "p", descriptor = "I")
	int anInt32;

	@OriginalMember(owner = "client!aaj", name = "l", descriptor = "I")
	int anInt33;

	@OriginalMember(owner = "client!aaj", name = "v", descriptor = "I")
	int anInt34;

	@OriginalMember(owner = "client!aaj", name = "y", descriptor = "I")
	int anInt35;

	@OriginalMember(owner = "client!aaj", name = "t", descriptor = "Z")
	boolean aBoolean5;

	@OriginalMember(owner = "client!aaj", name = "p", descriptor = "(Lclient!akv;B)Lclient!mm;", line = 28)
	public static Class403 method169(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(6) Class410 local6 = Class683.method36094()[arg0.method22478()];
		@Pc(13) Class402 local13 = Class700.method36485()[arg0.method22478()];
		@Pc(17) int local17 = arg0.method22487();
		@Pc(21) int local21 = arg0.method22487();
		@Pc(25) int local25 = arg0.method22549();
		@Pc(29) int local29 = arg0.method22500();
		@Pc(33) int local33 = arg0.method22478();
		return new Class403(local6, local13, local17, local21, local25, local29, local33);
	}

	@OriginalMember(owner = "client!aaj", name = "p", descriptor = "(I)V", line = 234)
	public static void method170() {
		Class354.aBoolean719 = true;
		Class77_Sub22.aString48 = Class589.aString234;
		Class117.aString44 = Class589.aString233;
		Class619.method32395(false);
		Class264.method26450();
		Class354.aClass322Array1 = null;
		Class528.aClass473_1 = null;
		Class668.method33179(8);
	}

	@OriginalMember(owner = "client!aaj", name = "<init>", descriptor = "()V", line = 953)
	Class11() {
	}

	@OriginalMember(owner = "client!aaj", name = "p", descriptor = "()J", line = 956)
	@Override
	public long method165() {
		@Pc(1) long[] local1 = Class77_Sub39.aLongArray18;
		@Pc(3) long local3 = -1L;
		@Pc(20) long local20 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (this.anInt32 * 255874607)) & 0xFFL)];
		@Pc(39) long local39 = local20 >>> 8 ^ local1[(int) ((local20 ^ (long) (this.anInt31 * -1041026141 >> 8)) & 0xFFL)];
		@Pc(56) long local56 = local39 >>> 8 ^ local1[(int) ((local39 ^ (long) (this.anInt31 * -1041026141)) & 0xFFL)];
		@Pc(75) long local75 = local56 >>> 8 ^ local1[(int) ((local56 ^ (long) (this.anInt34 * 1927749167 >> 24)) & 0xFFL)];
		@Pc(94) long local94 = local75 >>> 8 ^ local1[(int) ((local75 ^ (long) (this.anInt34 * 1927749167 >> 16)) & 0xFFL)];
		@Pc(113) long local113 = local94 >>> 8 ^ local1[(int) ((local94 ^ (long) (this.anInt34 * 1927749167 >> 8)) & 0xFFL)];
		@Pc(130) long local130 = local113 >>> 8 ^ local1[(int) ((local113 ^ (long) (this.anInt34 * 1927749167)) & 0xFFL)];
		@Pc(147) long local147 = local130 >>> 8 ^ local1[(int) ((local130 ^ (long) (this.anInt33 * 1824868691)) & 0xFFL)];
		@Pc(166) long local166 = local147 >>> 8 ^ local1[(int) ((local147 ^ (long) (this.anInt35 * -369060565 >> 24)) & 0xFFL)];
		@Pc(185) long local185 = local166 >>> 8 ^ local1[(int) ((local166 ^ (long) (this.anInt35 * -369060565 >> 16)) & 0xFFL)];
		@Pc(204) long local204 = local185 >>> 8 ^ local1[(int) ((local185 ^ (long) (this.anInt35 * -369060565 >> 8)) & 0xFFL)];
		@Pc(221) long local221 = local204 >>> 8 ^ local1[(int) ((local204 ^ (long) (this.anInt35 * -369060565)) & 0xFFL)];
		@Pc(238) long local238 = local221 >>> 8 ^ local1[(int) ((local221 ^ (long) (this.anInt30 * -1395126681)) & 0xFFL)];
		return local238 >>> 8 ^ local1[(int) ((local238 ^ (long) (this.aBoolean5 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!aaj", name = "v", descriptor = "()J", line = 956)
	@Override
	public long method166() {
		@Pc(1) long[] local1 = Class77_Sub39.aLongArray18;
		@Pc(3) long local3 = -1L;
		@Pc(20) long local20 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (this.anInt32 * 255874607)) & 0xFFL)];
		@Pc(39) long local39 = local20 >>> 8 ^ local1[(int) ((local20 ^ (long) (this.anInt31 * -1041026141 >> 8)) & 0xFFL)];
		@Pc(56) long local56 = local39 >>> 8 ^ local1[(int) ((local39 ^ (long) (this.anInt31 * -1041026141)) & 0xFFL)];
		@Pc(75) long local75 = local56 >>> 8 ^ local1[(int) ((local56 ^ (long) (this.anInt34 * 1927749167 >> 24)) & 0xFFL)];
		@Pc(94) long local94 = local75 >>> 8 ^ local1[(int) ((local75 ^ (long) (this.anInt34 * 1927749167 >> 16)) & 0xFFL)];
		@Pc(113) long local113 = local94 >>> 8 ^ local1[(int) ((local94 ^ (long) (this.anInt34 * 1927749167 >> 8)) & 0xFFL)];
		@Pc(130) long local130 = local113 >>> 8 ^ local1[(int) ((local113 ^ (long) (this.anInt34 * 1927749167)) & 0xFFL)];
		@Pc(147) long local147 = local130 >>> 8 ^ local1[(int) ((local130 ^ (long) (this.anInt33 * 1824868691)) & 0xFFL)];
		@Pc(166) long local166 = local147 >>> 8 ^ local1[(int) ((local147 ^ (long) (this.anInt35 * -369060565 >> 24)) & 0xFFL)];
		@Pc(185) long local185 = local166 >>> 8 ^ local1[(int) ((local166 ^ (long) (this.anInt35 * -369060565 >> 16)) & 0xFFL)];
		@Pc(204) long local204 = local185 >>> 8 ^ local1[(int) ((local185 ^ (long) (this.anInt35 * -369060565 >> 8)) & 0xFFL)];
		@Pc(221) long local221 = local204 >>> 8 ^ local1[(int) ((local204 ^ (long) (this.anInt35 * -369060565)) & 0xFFL)];
		@Pc(238) long local238 = local221 >>> 8 ^ local1[(int) ((local221 ^ (long) (this.anInt30 * -1395126681)) & 0xFFL)];
		return local238 >>> 8 ^ local1[(int) ((local238 ^ (long) (this.aBoolean5 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!aaj", name = "l", descriptor = "(Lclient!vs;)Z", line = 976)
	@Override
	public boolean method167(@OriginalArg(0) Interface70 arg0) {
		if (!(arg0 instanceof Class11)) {
			return false;
		}
		@Pc(7) Class11 local7 = (Class11) arg0;
		if (local7.anInt32 * 255874607 != this.anInt32 * 255874607) {
			return false;
		} else if (this.anInt31 * -1041026141 != local7.anInt31 * -1041026141) {
			return false;
		} else if (local7.anInt34 * 1927749167 != this.anInt34 * 1927749167) {
			return false;
		} else if (local7.anInt33 * 1824868691 != this.anInt33 * 1824868691) {
			return false;
		} else if (local7.anInt35 * -369060565 != this.anInt35 * -369060565) {
			return false;
		} else if (local7.anInt30 * -1395126681 == this.anInt30 * -1395126681) {
			return local7.aBoolean5 == this.aBoolean5;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aaj", name = "c", descriptor = "(Lclient!vs;)Z", line = 976)
	@Override
	public boolean method164(@OriginalArg(0) Interface70 arg0) {
		if (!(arg0 instanceof Class11)) {
			return false;
		}
		@Pc(7) Class11 local7 = (Class11) arg0;
		if (local7.anInt32 * 255874607 != this.anInt32 * 255874607) {
			return false;
		} else if (this.anInt31 * -1041026141 != local7.anInt31 * -1041026141) {
			return false;
		} else if (local7.anInt34 * 1927749167 != this.anInt34 * 1927749167) {
			return false;
		} else if (local7.anInt33 * 1824868691 != this.anInt33 * 1824868691) {
			return false;
		} else if (local7.anInt35 * -369060565 != this.anInt35 * -369060565) {
			return false;
		} else if (local7.anInt30 * -1395126681 == this.anInt30 * -1395126681) {
			return local7.aBoolean5 == this.aBoolean5;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aaj", name = "y", descriptor = "(Lclient!vs;)Z", line = 976)
	@Override
	public boolean method168(@OriginalArg(0) Interface70 arg0) {
		if (!(arg0 instanceof Class11)) {
			return false;
		}
		@Pc(7) Class11 local7 = (Class11) arg0;
		if (local7.anInt32 * 255874607 != this.anInt32 * 255874607) {
			return false;
		} else if (this.anInt31 * -1041026141 != local7.anInt31 * -1041026141) {
			return false;
		} else if (local7.anInt34 * 1927749167 != this.anInt34 * 1927749167) {
			return false;
		} else if (local7.anInt33 * 1824868691 != this.anInt33 * 1824868691) {
			return false;
		} else if (local7.anInt35 * -369060565 != this.anInt35 * -369060565) {
			return false;
		} else if (local7.anInt30 * -1395126681 == this.anInt30 * -1395126681) {
			return local7.aBoolean5 == this.aBoolean5;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aaj", name = "an", descriptor = "(Lclient!aqm;S)[I", line = 1151)
	static int[] method171(@OriginalArg(0) Class77_Sub1_Sub7 arg0) {
		@Pc(1) int[] local1 = null;
		if (Class693.method36369(arg0.anInt2987 * -1986934021)) {
			local1 = ((Class18) Class537.aClass35_Sub7_1.method18319((int) (arg0.aLong149 * -7225575275964615095L))).anIntArray7;
		} else if (arg0.anInt2983 * -1603986365 != -1) {
			local1 = ((Class18) Class537.aClass35_Sub7_1.method18319(arg0.anInt2983 * -1603986365)).anIntArray7;
		} else if (Class77_Sub4.method13217(arg0.anInt2987 * -1986934021)) {
			@Pc(54) Class77_Sub6 local54 = (Class77_Sub6) client.aClass12_22.method173((long) (arg0.aLong149 * -7225575275964615095L));
			if (local54 != null) {
				@Pc(61) Class104_Sub1_Sub1_Sub1_Sub1 local61 = (Class104_Sub1_Sub1_Sub1_Sub1) local54.anObject5;
				@Pc(64) Class333 local64 = local61.aClass333_1;
				if (local64.anIntArray437 != null) {
					local64 = local64.method27642(Class55.aClass124_1, Class55.aClass124_1);
				}
				if (local64 != null) {
					local1 = local64.anIntArray440;
				}
			}
		} else if (Class429.method28810(arg0.anInt2987 * -1986934021)) {
			@Pc(103) Class599 local103 = (Class599) client.aClass517_1.method30444().method18319((int) (arg0.aLong149 * -7225575275964615095L >>> 32 & 0x7FFFFFFFL));
			if (local103.anIntArray511 != null) {
				local103 = local103.method32006(Class55.aClass124_1, Class55.aClass124_1);
			}
			if (local103 != null) {
				local1 = local103.anIntArray513;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!aaj", name = "zj", descriptor = "(Lclient!yf;I)V", line = 9127)
	static final void method172(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass243_1.method26054(local12).method25954();
	}
}
