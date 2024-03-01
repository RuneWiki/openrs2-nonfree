package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public class Class44 implements Interface31 {

	@OriginalMember(owner = "client!kv", name = "bh", descriptor = "Lclient!tk;")
	public static Class483 aClass483_5;

	@OriginalMember(owner = "client!kv", name = "gv", descriptor = "Lclient!qa;")
	static Class403 aClass403_7;

	@OriginalMember(owner = "client!kv", name = "tr", descriptor = "I")
	static int anInt2202;

	@OriginalMember(owner = "client!kv", name = "p", descriptor = "Lclient!kh;")
	public final Class277 aClass277_8;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "Lclient!kg;")
	public final Class276 aClass276_7;

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
	public final int anInt2200;

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
	public final int anInt2195;

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
	public final int anInt2198;

	@OriginalMember(owner = "client!kv", name = "x", descriptor = "I")
	public final int anInt2199;

	@OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
	public final int anInt2196;

	@OriginalMember(owner = "client!kv", name = "u", descriptor = "I")
	public final int anInt2197;

	@OriginalMember(owner = "client!kv", name = "y", descriptor = "I")
	public final int anInt2201;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!kh;Lclient!kg;IIIIIII)V", line = 16)
	Class44(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.aClass277_8 = arg0;
		this.aClass276_7 = arg1;
		this.anInt2200 = arg2 * 42664101;
		this.anInt2195 = arg3 * -807546119;
		this.anInt2198 = arg4 * 594143769;
		this.anInt2199 = arg5 * 1273534873;
		this.anInt2196 = arg6 * 656518669;
		this.anInt2197 = arg7 * -72483885;
		this.anInt2201 = arg8 * 1986259463;
	}

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "(Lclient!ahb;)Lclient!kv;", line = 29)
	static Class44 method15132(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(6) Class277 local6 = Class3_Sub30.method11638()[arg0.method20269()];
		@Pc(13) Class276 local13 = Class400.method27575()[arg0.method20269()];
		@Pc(17) int local17 = arg0.method20272();
		@Pc(21) int local21 = arg0.method20272();
		@Pc(25) int local25 = arg0.method20271();
		@Pc(29) int local29 = arg0.method20271();
		@Pc(33) int local33 = arg0.method20272();
		@Pc(37) int local37 = arg0.method20375();
		@Pc(41) int local41 = arg0.method20275();
		return new Class44(local6, local13, local17, local21, local25, local29, local33, local37, local41);
	}

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "()Lclient!ke;", line = 42)
	@Override
	public Class274 method25539() {
		return null;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)Lclient!ke;", line = 42)
	@Override
	public Class274 method25540() {
		return null;
	}

	@OriginalMember(owner = "client!kv", name = "er", descriptor = "(IZI)Z", line = 858)
	public static boolean method15137(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == Class58_Sub1.anInt1441 * 238815937) {
			Class58_Sub1.aBoolean325 = arg1;
		} else if (arg0 == Class58_Sub1.anInt1431 * 167719129) {
			Class58_Sub1.aBoolean323 = arg1;
		} else if (arg0 == Class58_Sub1.anInt1436 * -753431529) {
			Class58_Sub1.aBoolean324 = arg1;
		} else {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!kv", name = "bf", descriptor = "(Lclient!aml;Lclient!yx;I)I", line = 1392)
	static int method15135(@OriginalArg(0) Class3_Sub1_Sub7 arg0, @OriginalArg(1) Class611 arg1) {
		@Pc(3) String local3 = Class280.method25428(arg0);
		@Pc(7) int[] local7 = Class156.method23180(arg0);
		if (local7 != null) {
			local3 = local3 + Class228.method24519(local7);
		}
		@Pc(27) int local27 = arg1.method33582(local3, Class354.aClass6Array13);
		if (arg0.aBoolean469) {
			local27 += Class19_Sub1.aClass6_23.method16782() + 4;
		}
		return local27;
	}

	@OriginalMember(owner = "client!kv", name = "yu", descriptor = "(Lclient!vs;I)V", line = 8519)
	static final void method15136(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (client.anInt3194 * 963130851 == 2 && local12 < client.anInt3042 * -1645830611) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aClass313Array1[local12].aBoolean713 ? 1 : 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!kv", name = "afy", descriptor = "(Lclient!vs;B)V", line = 9929)
	static final void method15133(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class463.anInt5070 * 469310261;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class237.anInt3749 * -1063851471;
	}

	@OriginalMember(owner = "client!kv", name = "aps", descriptor = "(Lclient!vs;I)V", line = 11675)
	static final void method15134(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
	}
}
