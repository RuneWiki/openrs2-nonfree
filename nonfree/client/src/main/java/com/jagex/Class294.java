package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public class Class294 {

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "[B")
	byte[] aByteArray72;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	int anInt4011;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "(I)[Lclient!zo;", line = 16)
	public static Class697[] method27019() {
		return new Class697[] { Class697.aClass697_7, Class697.aClass697_4, Class697.aClass697_5, Class697.aClass697_6, Class697.aClass697_3 };
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V", line = 69)
	public static void method27020() {
		Class304.aMap17.clear();
		Class304.aClass12_31.method188();
		Class304.aClass691_14.method36321();
		Class304.anInt4056 = 0;
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([B)V", line = 124)
	Class294(@OriginalArg(0) byte[] arg0) {
		this.aByteArray72 = arg0;
		this.anInt4011 = 0;
	}

	@OriginalMember(owner = "client!hc", name = "v", descriptor = "()I", line = 130)
	int method27021() {
		@Pc(1) short local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
			local1 = (short) (local1 | (this.aByteArray72[(this.anInt4011 += 1466398419) * 1138774363 - 1] & 0xFF) << local3 * 8);
		}
		return local1;
	}

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "()I", line = 130)
	int method27022() {
		@Pc(1) short local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
			local1 = (short) (local1 | (this.aByteArray72[(this.anInt4011 += 1466398419) * 1138774363 - 1] & 0xFF) << local3 * 8);
		}
		return local1;
	}

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "(I)I", line = 130)
	int method27023() {
		@Pc(1) short local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2; local3++) {
			local1 = (short) (local1 | (this.aByteArray72[(this.anInt4011 += 1466398419) * 1138774363 - 1] & 0xFF) << local3 * 8);
		}
		return local1;
	}

	@OriginalMember(owner = "client!hc", name = "w", descriptor = "()Ljava/lang/String;", line = 136)
	String method27024() {
		@Pc(3) int local3 = this.method27023();
		if (local3 == -1) {
			return null;
		} else if (local3 > 256) {
			throw new RuntimeException_Sub2();
		} else {
			@Pc(26) String local26 = new String(this.aByteArray72, this.anInt4011 * 1138774363, local3);
			this.anInt4011 += local3 * 1466398419;
			return local26;
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)Ljava/lang/String;", line = 136)
	String method27025() {
		@Pc(3) int local3 = this.method27023();
		if (local3 == -1) {
			return null;
		} else if (local3 > 256) {
			throw new RuntimeException_Sub2();
		} else {
			@Pc(26) String local26 = new String(this.aByteArray72, this.anInt4011 * 1138774363, local3);
			this.anInt4011 += local3 * 1466398419;
			return local26;
		}
	}

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "()Ljava/lang/String;", line = 136)
	String method27026() {
		@Pc(3) int local3 = this.method27023();
		if (local3 == -1) {
			return null;
		} else if (local3 > 256) {
			throw new RuntimeException_Sub2();
		} else {
			@Pc(26) String local26 = new String(this.aByteArray72, this.anInt4011 * 1138774363, local3);
			this.anInt4011 += local3 * 1466398419;
			return local26;
		}
	}

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "(Lclient!are;IB)V", line = 436)
	static void method27027(@OriginalArg(0) Class77_Sub1_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (!Class683.aBoolean861) {
			return;
		}
		@Pc(5) Class17 local5 = Class197.method25473();
		@Pc(7) int local7 = 0;
		@Pc(21) int local21;
		for (@Pc(13) Class77_Sub1_Sub7 local13 = (Class77_Sub1_Sub7) arg0.aClass691_11.method36335(); local13 != null; local13 = (Class77_Sub1_Sub7) arg0.aClass691_11.method36340()) {
			local21 = Class102.method7918(local13, local5);
			if (local21 > local7) {
				local7 = local21;
			}
		}
		local7 += 8;
		@Pc(45) int local45 = Class683.anInt5819 * -238165825 * -475442105 * arg0.anInt3023 + 21;
		Class102.anInt955 = (Class683.anInt5819 * -238165825 * arg0.anInt3023 * -475442105 + (Class683.aBoolean863 ? 26 : 22)) * 2050568967;
		local21 = Class639.anInt5719 * -1739196959 + Class624.anInt5644 * -620506573;
		if (local21 + local7 > Class149_Sub4.anInt2368 * 1771907305) {
			local21 = Class624.anInt5644 * -620506573 - local7;
		}
		if (local21 < 0) {
			local21 = 0;
		}
		@Pc(100) int local100 = Class683.aBoolean863 ? local5.anInt52 * 102396103 + 1 + 20 : 31;
		@Pc(111) int local111 = arg1 + 1 - local100 + local5.anInt52 * 102396103;
		if (local111 + local45 > Class19.anInt108 * -1091172141) {
			local111 = Class19.anInt108 * -1091172141 - local45;
		}
		if (local111 < 0) {
			local111 = 0;
		}
		Class155.anInt3189 = local21 * -228643305;
		Class75.anInt224 = local111 * 1135371673;
		Class131_Sub3.anInt1436 = local7 * 1938836795;
		Class683.aClass77_Sub1_Sub11_1 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "db", descriptor = "(Lclient!yf;B)V", line = 5162)
	static final void method27028(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class233.method25870(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!hc", name = "hm", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;Lclient!gs;B)V", line = 5893)
	static final void method27029(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2, @OriginalArg(3) Class283 arg3) {
		@Pc(12) int local12 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307];
		switch(arg3.anInt3965 * 1705314695) {
			case 0:
				if (client.anInt3453 * -1050164879 != 2 || local12 >= client.anInt3529 * -1979292205) {
					return;
				}
				arg0.aString177 = client.aClass162Array1[local12].aString131;
				break;
			case 1:
				arg0.aString177 = client.aClass243_1.method26054(local12).method25952();
				break;
			case 2:
				if (Class204.aClass50Array1 != null && local12 < Class204.aClass50Array1.length) {
					arg0.aString177 = Class204.aClass50Array1[local12].aString10;
				}
				break;
			case 3:
			case 5:
				arg0.aString177 = arg2.aClass77_Sub25_3.aClass358Array1[local12].aString209;
				break;
			case 4:
				arg0.aString177 = ((Class254) client.aClass243_1.method26027().get(local12)).method26196();
				break;
			default:
				throw new IllegalStateException();
		}
		arg0.aClass283_1 = arg3;
	}

	@OriginalMember(owner = "client!hc", name = "akj", descriptor = "(Lclient!yf;I)V", line = 11296)
	static final void method27030(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 1853997378;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		if (local13 >= 2) {
			throw new RuntimeException();
		}
		client.anInt3441 = local13 * -1871523627;
		@Pc(34) int local34 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		if (local34 + 1 >= client.anIntArrayArrayArray15[client.anInt3441 * -1351358339].length >> 1) {
			throw new RuntimeException();
		}
		client.anInt3395 = local34 * -2114709439;
		client.anInt3444 = 0;
		client.anInt3386 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2] * 1740105663;
		client.anInt3501 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3] * -24061415;
		@Pc(90) int local90 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 4];
		if (local90 >= 2) {
			throw new RuntimeException();
		}
		client.anInt3442 = local90 * 378787251;
		@Pc(111) int local111 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 5];
		if (local111 + 1 >= client.anIntArrayArrayArray15[client.anInt3442 * 1614995835].length >> 1) {
			throw new RuntimeException();
		}
		client.anInt3407 = local111 * -1920101379;
		Class11.anInt36 = -1822037319;
		Class142.anInt2017 = 309821991;
		Class70.anInt203 = 1899572639;
	}
}
