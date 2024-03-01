package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public class Class243 {

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
	int anInt3834;

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
	int anInt3835;

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
	int anInt3836;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
	int anInt3837;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
	final int anInt3833;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "Lclient!vj;")
	final Class615 aClass615_1;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!alw;)V", line = 18)
	Class243(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInt3833 = arg0.method22436() * 421769509;
		this.aClass615_1 = (Class615) Class107.method18119(Class1.method10(), arg0.method22413());
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(IIIIB)V", line = 24)
	void method25881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class359.method27790(arg0, arg1, arg2, this.aClass615_1.anInt5629 * 2081439295, this.anInt3833 * -1294794067, this.aClass615_1.anInt5628 * 948246811, arg3, null);
		this.anInt3837 = arg0 * 920398435;
		this.anInt3834 = arg1 * -1231998259;
		this.anInt3836 = arg2 * -1848035729;
		this.anInt3835 = arg3 * -1520557853;
	}

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "(B)V", line = 32)
	void method25882() {
		Class359.method27790(this.anInt3837 * 1569957707, this.anInt3834 * -1679422971, this.anInt3836 * 1376446607, this.aClass615_1.anInt5629 * 2081439295, -1, this.aClass615_1.anInt5628 * 948246811, this.anInt3835 * -1340857141, null);
	}

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "()V", line = 32)
	void method25884() {
		Class359.method27790(this.anInt3837 * 1569957707, this.anInt3834 * -1679422971, this.anInt3836 * 1376446607, this.aClass615_1.anInt5629 * 2081439295, -1, this.aClass615_1.anInt5628 * 948246811, this.anInt3835 * -1340857141, null);
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "()V", line = 32)
	void method25885() {
		Class359.method27790(this.anInt3837 * 1569957707, this.anInt3834 * -1679422971, this.anInt3836 * 1376446607, this.aClass615_1.anInt5629 * 2081439295, -1, this.aClass615_1.anInt5628 * 948246811, this.anInt3835 * -1340857141, null);
	}

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "()V", line = 32)
	void method25886() {
		Class359.method27790(this.anInt3837 * 1569957707, this.anInt3834 * -1679422971, this.anInt3836 * 1376446607, this.aClass615_1.anInt5629 * 2081439295, -1, this.aClass615_1.anInt5628 * 948246811, this.anInt3835 * -1340857141, null);
	}

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "(I)Z", line = 36)
	boolean method25883() {
		if (this.anInt3833 * -1294794067 < 0) {
			return true;
		}
		@Pc(13) Class610 local13 = (Class610) Class273.aClass32_Sub14_8.method18261(this.anInt3833 * -1294794067);
		@Pc(22) boolean local22 = local13.method31978(this.aClass615_1.anInt5628 * 948246811);
		@Pc(26) int[] local26 = local13.method31989();
		if (local26 != null) {
			@Pc(30) int[] local30 = local26;
			for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
				@Pc(40) int local40 = local30[local32];
				local22 &= ((Class263) Class32.aClass32_Sub17_23.method18261(local40)).method26194();
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "()Z", line = 36)
	boolean method25887() {
		if (this.anInt3833 * -1294794067 < 0) {
			return true;
		}
		@Pc(13) Class610 local13 = (Class610) Class273.aClass32_Sub14_8.method18261(this.anInt3833 * -1294794067);
		@Pc(22) boolean local22 = local13.method31978(this.aClass615_1.anInt5628 * 948246811);
		@Pc(26) int[] local26 = local13.method31989();
		if (local26 != null) {
			@Pc(30) int[] local30 = local26;
			for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
				@Pc(40) int local40 = local30[local32];
				local22 &= ((Class263) Class32.aClass32_Sub17_23.method18261(local40)).method26194();
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(Lclient!alc;Lclient!alc;IZB)I", line = 149)
	static int method25890(@OriginalArg(0) Class154_Sub1 arg0, @OriginalArg(1) Class154_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		if (arg2 == 1) {
			local7 = arg0.anInt1652 * 1625257571;
			local12 = arg1.anInt1652 * 1625257571;
			if (!arg3) {
				if (local7 == -1) {
					local7 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local7 - local12;
		} else if (arg2 == 2) {
			return Class488.method29821(arg0.method14154(), arg1.method14154(), Class106.aClass717_8);
		} else if (arg2 == 3) {
			if (arg0.aString47.equals("-")) {
				if (arg1.aString47.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString47.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Class488.method29821(arg0.aString47, arg1.aString47, Class106.aClass717_8);
			}
		} else if (arg2 == 4) {
			return arg0.method14136() ? (arg1.method14136() ? 0 : 1) : (arg1.method14136() ? -1 : 0);
		} else if (arg2 == 5) {
			return arg0.method14139() ? (arg1.method14139() ? 0 : 1) : (arg1.method14139() ? -1 : 0);
		} else if (arg2 == 6) {
			return arg0.method14135() ? (arg1.method14135() ? 0 : 1) : (arg1.method14135() ? -1 : 0);
		} else if (arg2 == 7) {
			return arg0.method14133() ? (arg1.method14133() ? 0 : 1) : (arg1.method14133() ? -1 : 0);
		} else if (arg2 == 8) {
			local7 = arg0.anInt1655 * 1280583823;
			local12 = arg1.anInt1655 * 1280583823;
			if (arg3) {
				if (local7 == 1000) {
					local7 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local7 == -1) {
					local7 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local7 - local12;
		} else {
			return arg0.anInt1654 * 2079113925 - arg1.anInt1654 * 2079113925;
		}
	}

	@OriginalMember(owner = "client!ef", name = "ao", descriptor = "(Lclient!yf;B)V", line = 5008)
	static final void method25888(@OriginalArg(0) Class681 arg0) {
		@Pc(9) int local9 = arg0.anIntArray520[arg0.anInt5889 * -709694321] >> 16;
		@Pc(19) int local19 = arg0.anIntArray520[arg0.anInt5889 * -709694321] & 0xFFFF;
		@Pc(32) int local32 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (local32 < 0 || local32 > 5000) {
			throw new RuntimeException();
		}
		arg0.anIntArray518[local9] = local32;
		@Pc(48) byte local48 = -1;
		if (local19 == Class519.aClass519_88.method36920()) {
			local48 = 0;
		}
		for (@Pc(56) int local56 = 0; local56 < local32; local56++) {
			arg0.anIntArrayArray67[local9][local56] = local48;
		}
	}

	@OriginalMember(owner = "client!ef", name = "ei", descriptor = "(Lclient!yf;B)V", line = 5726)
	static final void method25891(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class258.method26141(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ef", name = "uf", descriptor = "(Lclient!yf;I)V", line = 8595)
	static final void method25889(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt3990 * -1543587533;
	}
}
