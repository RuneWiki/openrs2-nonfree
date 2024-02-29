package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agk")
public class Class96_Sub23 extends Class96 {

	@OriginalMember(owner = "client!agk", name = "v", descriptor = "I")
	static final int anInt1019 = 1;

	@OriginalMember(owner = "client!agk", name = "c", descriptor = "I")
	static final int anInt1024 = 0;

	@OriginalMember(owner = "client!agk", name = "da", descriptor = "Lclient!akd;")
	public static Class77_Sub28 aClass77_Sub28_1;

	@OriginalMember(owner = "client!agk", name = "gl", descriptor = "Lclient!anx;")
	public static Class35_Sub15 aClass35_Sub15_1;

	@OriginalMember(owner = "client!agk", name = "w", descriptor = "I")
	final int anInt1022;

	@OriginalMember(owner = "client!agk", name = "t", descriptor = "I")
	final int anInt1021;

	@OriginalMember(owner = "client!agk", name = "y", descriptor = "I")
	final int anInt1023;

	@OriginalMember(owner = "client!agk", name = "d", descriptor = "I")
	final int anInt1026;

	@OriginalMember(owner = "client!agk", name = "s", descriptor = "I")
	final int anInt1027;

	@OriginalMember(owner = "client!agk", name = "x", descriptor = "I")
	final int anInt1025;

	@OriginalMember(owner = "client!agk", name = "l", descriptor = "I")
	final int anInt1020;

	@OriginalMember(owner = "client!agk", name = "g", descriptor = "I")
	final int anInt1029;

	@OriginalMember(owner = "client!agk", name = "q", descriptor = "I")
	final int anInt1031;

	@OriginalMember(owner = "client!agk", name = "r", descriptor = "I")
	final int anInt1028;

	@OriginalMember(owner = "client!agk", name = "z", descriptor = "I")
	final int anInt1030;

	@OriginalMember(owner = "client!agk", name = "j", descriptor = "I")
	final int anInt1018;

	@OriginalMember(owner = "client!agk", name = "i", descriptor = "I")
	final int anInt1032;

	@OriginalMember(owner = "client!agk", name = "<init>", descriptor = "(Lclient!akv;II)V", line = 30)
	Class96_Sub23(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		@Pc(9) int local9;
		if (arg1 == 0) {
			local9 = arg0.method22500();
			this.anInt1022 = (local9 >>> 16) * 864243367;
			this.anInt1021 = (local9 & 0xFFFF) * 95728365;
			this.anInt1023 = -1502874509;
		} else {
			this.anInt1022 = -864243367;
			this.anInt1021 = -95728365;
			this.anInt1023 = arg0.method22483() * 1502874509;
		}
		if (arg2 == 0) {
			local9 = arg0.method22500();
			this.anInt1026 = (local9 >>> 16) * 1580801859;
			this.anInt1027 = (local9 & 0xFFFF) * -894824431;
			this.anInt1025 = 1182536389;
		} else {
			this.anInt1026 = -1580801859;
			this.anInt1027 = 894824431;
			this.anInt1025 = arg0.method22483() * -1182536389;
		}
		if (arg1 == 0 && arg2 == 0) {
			this.anInt1020 = arg0.method22478() * -1646258969;
		} else {
			this.anInt1020 = 1646258969;
		}
		this.anInt1029 = arg0.method22483() * 1968944945;
		this.anInt1031 = arg0.method22478() * -1540457235;
		this.anInt1028 = arg0.method22478() * 816564809;
		this.anInt1030 = arg0.method22492() * -106069903;
		this.anInt1018 = arg0.method22483() * -970271505;
		this.anInt1032 = arg0.method22478() * 761746181;
	}

	@OriginalMember(owner = "client!agk", name = "c", descriptor = "(I)V", line = 69)
	@Override
	public void method19911() {
		@Pc(11) int local11;
		@Pc(18) int local18;
		@Pc(23) int local23;
		@Pc(33) Class104_Sub1_Sub1_Sub1 local33;
		@Pc(37) Class447 local37;
		if (this.anInt1022 * 1755412759 >= 0) {
			local11 = this.anInt1022 * 1123167744 + 256;
			local18 = this.anInt1021 * 653642240 + 256;
			local23 = this.anInt1020 * -402800937;
		} else {
			local33 = Class589.aClass222Array1[this.anInt1023 * -2057162939].method25755();
			local37 = local33.method24085().aClass447_61;
			local11 = (int) local37.aFloat277;
			local18 = (int) local37.aFloat278;
			local23 = local33.aByte100;
		}
		@Pc(60) int local60;
		@Pc(67) int local67;
		if (this.anInt1021 * -225215771 >= 0) {
			local60 = this.anInt1026 * 1204475392 + 256;
			local67 = this.anInt1027 * -1312693760 + 256;
		} else {
			local33 = Class589.aClass222Array1[this.anInt1025 * -1734843405].method25755();
			local37 = local33.method24085().aClass447_61;
			local60 = (int) local37.aFloat277;
			local67 = (int) local37.aFloat278;
			if (local23 < 0) {
				local23 = local33.aByte100;
			}
		}
		@Pc(101) int local101 = this.anInt1032 * -79068723 << 2;
		@Pc(155) Class104_Sub1_Sub1_Sub6 local155 = new Class104_Sub1_Sub1_Sub6(client.aClass517_1.method30435(), this.anInt1029 * -514047535, local23, local23, local11, local18, this.anInt1031 * 420167909 << 2, client.anInt3414, client.anInt3414 + this.anInt1030 * 1300119697, this.anInt1018 * 2088163855, local101, this.anInt1023 * -2057162939 + 1, this.anInt1025 * -1734843405 + 1, this.anInt1028 * -715241479 << 2, false, 0, 0);
		local155.method24184(local60, local67, this.anInt1028 * -715241479 << 2, this.anInt1030 * 1300119697 + client.anInt3414);
		client.aClass695_45.method36383(new Class77_Sub1_Sub4(local155));
	}

	@OriginalMember(owner = "client!agk", name = "y", descriptor = "()V", line = 69)
	@Override
	public void method19912() {
		@Pc(11) int local11;
		@Pc(18) int local18;
		@Pc(23) int local23;
		@Pc(33) Class104_Sub1_Sub1_Sub1 local33;
		@Pc(37) Class447 local37;
		if (this.anInt1022 * 1755412759 >= 0) {
			local11 = this.anInt1022 * 1123167744 + 256;
			local18 = this.anInt1021 * 653642240 + 256;
			local23 = this.anInt1020 * -402800937;
		} else {
			local33 = Class589.aClass222Array1[this.anInt1023 * -2057162939].method25755();
			local37 = local33.method24085().aClass447_61;
			local11 = (int) local37.aFloat277;
			local18 = (int) local37.aFloat278;
			local23 = local33.aByte100;
		}
		@Pc(60) int local60;
		@Pc(67) int local67;
		if (this.anInt1021 * -225215771 >= 0) {
			local60 = this.anInt1026 * 1204475392 + 256;
			local67 = this.anInt1027 * -1312693760 + 256;
		} else {
			local33 = Class589.aClass222Array1[this.anInt1025 * -1734843405].method25755();
			local37 = local33.method24085().aClass447_61;
			local60 = (int) local37.aFloat277;
			local67 = (int) local37.aFloat278;
			if (local23 < 0) {
				local23 = local33.aByte100;
			}
		}
		@Pc(101) int local101 = this.anInt1032 * -79068723 << 2;
		@Pc(155) Class104_Sub1_Sub1_Sub6 local155 = new Class104_Sub1_Sub1_Sub6(client.aClass517_1.method30435(), this.anInt1029 * -514047535, local23, local23, local11, local18, this.anInt1031 * 420167909 << 2, client.anInt3414, client.anInt3414 + this.anInt1030 * 1300119697, this.anInt1018 * 2088163855, local101, this.anInt1023 * -2057162939 + 1, this.anInt1025 * -1734843405 + 1, this.anInt1028 * -715241479 << 2, false, 0, 0);
		local155.method24184(local60, local67, this.anInt1028 * -715241479 << 2, this.anInt1030 * 1300119697 + client.anInt3414);
		client.aClass695_45.method36383(new Class77_Sub1_Sub4(local155));
	}

	@OriginalMember(owner = "client!agk", name = "w", descriptor = "()V", line = 69)
	@Override
	public void method19913() {
		@Pc(11) int local11;
		@Pc(18) int local18;
		@Pc(23) int local23;
		@Pc(33) Class104_Sub1_Sub1_Sub1 local33;
		@Pc(37) Class447 local37;
		if (this.anInt1022 * 1755412759 >= 0) {
			local11 = this.anInt1022 * 1123167744 + 256;
			local18 = this.anInt1021 * 653642240 + 256;
			local23 = this.anInt1020 * -402800937;
		} else {
			local33 = Class589.aClass222Array1[this.anInt1023 * -2057162939].method25755();
			local37 = local33.method24085().aClass447_61;
			local11 = (int) local37.aFloat277;
			local18 = (int) local37.aFloat278;
			local23 = local33.aByte100;
		}
		@Pc(60) int local60;
		@Pc(67) int local67;
		if (this.anInt1021 * -225215771 >= 0) {
			local60 = this.anInt1026 * 1204475392 + 256;
			local67 = this.anInt1027 * -1312693760 + 256;
		} else {
			local33 = Class589.aClass222Array1[this.anInt1025 * -1734843405].method25755();
			local37 = local33.method24085().aClass447_61;
			local60 = (int) local37.aFloat277;
			local67 = (int) local37.aFloat278;
			if (local23 < 0) {
				local23 = local33.aByte100;
			}
		}
		@Pc(101) int local101 = this.anInt1032 * -79068723 << 2;
		@Pc(155) Class104_Sub1_Sub1_Sub6 local155 = new Class104_Sub1_Sub1_Sub6(client.aClass517_1.method30435(), this.anInt1029 * -514047535, local23, local23, local11, local18, this.anInt1031 * 420167909 << 2, client.anInt3414, client.anInt3414 + this.anInt1030 * 1300119697, this.anInt1018 * 2088163855, local101, this.anInt1023 * -2057162939 + 1, this.anInt1025 * -1734843405 + 1, this.anInt1028 * -715241479 << 2, false, 0, 0);
		local155.method24184(local60, local67, this.anInt1028 * -715241479 << 2, this.anInt1030 * 1300119697 + client.anInt3414);
		client.aClass695_45.method36383(new Class77_Sub1_Sub4(local155));
	}

	@OriginalMember(owner = "client!agk", name = "y", descriptor = "(IIZI)I", line = 69)
	public static int method8562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(6) Class77_Sub7 local6 = Class112.method9473(arg0, arg2);
		if (local6 == null) {
			return 0;
		}
		for (@Pc(12) int local12 = 0; local12 < local6.anIntArray192.length; local12++) {
			if (local6.anIntArray192[local12] >= 0 && ((Class18) Class537.aClass35_Sub7_1.method18319(local6.anIntArray192[local12])).anInt58 * 1160623023 == arg1) {
				local1 += Class22.method421(arg0, local12, arg2);
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!agk", name = "v", descriptor = "(II)Z", line = 76)
	public static boolean method8563(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!agk", name = "t", descriptor = "()Z", line = 99)
	@Override
	boolean method19904() {
		@Pc(8) Class679 local8 = (Class679) Class482.aClass35_Sub4_1.method18319(this.anInt1029 * -514047535);
		@Pc(12) boolean local12 = local8.method36057();
		@Pc(21) Class234 local21 = (Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local8.anInt5810 * -811043807);
		return local12 & local21.method25888();
	}

	@OriginalMember(owner = "client!agk", name = "l", descriptor = "(I)Z", line = 99)
	@Override
	boolean method19903() {
		@Pc(8) Class679 local8 = (Class679) Class482.aClass35_Sub4_1.method18319(this.anInt1029 * -514047535);
		@Pc(12) boolean local12 = local8.method36057();
		@Pc(21) Class234 local21 = (Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local8.anInt5810 * -811043807);
		return local12 & local21.method25888();
	}

	@OriginalMember(owner = "client!agk", name = "q", descriptor = "()Z", line = 99)
	@Override
	boolean method19905() {
		@Pc(8) Class679 local8 = (Class679) Class482.aClass35_Sub4_1.method18319(this.anInt1029 * -514047535);
		@Pc(12) boolean local12 = local8.method36057();
		@Pc(21) Class234 local21 = (Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local8.anInt5810 * -811043807);
		return local12 & local21.method25888();
	}

	@OriginalMember(owner = "client!agk", name = "g", descriptor = "(IIIB)I", line = 240)
	public static final int method8564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + ((arg0 & 0xFF) >> 2 << 10) + (arg2 >> 1);
	}

	@OriginalMember(owner = "client!agk", name = "ff", descriptor = "(Lclient!oi;ZFFFFIII)V", line = 2118)
	static void method8565(@OriginalArg(0) Class442 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = client.aClass517_1.method30431();
		@Pc(7) int local7 = client.aClass517_1.method30426();
		arg0.method29006(arg1, arg2, arg3, arg4, (float) local7, (float) local3, (float) arg5, (float) arg6);
	}

	@OriginalMember(owner = "client!agk", name = "ajv", descriptor = "(Lclient!yf;S)V", line = 11137)
	static final void method8566(@OriginalArg(0) Class665 arg0) {
		@Pc(1) String local1 = null;
		if (Class386.aClass355_1 != null) {
			local1 = Class386.aClass355_1.method27957();
		}
		if (local1 == null) {
			local1 = "";
		}
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local1;
	}
}
