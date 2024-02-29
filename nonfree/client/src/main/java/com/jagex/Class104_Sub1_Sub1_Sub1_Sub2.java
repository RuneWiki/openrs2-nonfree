package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apv")
public class Class104_Sub1_Sub1_Sub1_Sub2 extends Class104_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!apv", name = "cw", descriptor = "Ljava/lang/String;")
	public String aString82;

	@OriginalMember(owner = "client!apv", name = "ck", descriptor = "Ljava/lang/String;")
	String aString83;

	@OriginalMember(owner = "client!apv", name = "ch", descriptor = "Ljava/lang/String;")
	String aString84;

	@OriginalMember(owner = "client!apv", name = "do", descriptor = "I")
	int anInt2912;

	@OriginalMember(owner = "client!apv", name = "ca", descriptor = "Lclient!wr;")
	public Class628 aClass628_1;

	@OriginalMember(owner = "client!apv", name = "cp", descriptor = "Ljava/lang/String;")
	public String aString85;

	@OriginalMember(owner = "client!apv", name = "cz", descriptor = "B")
	public byte aByte77 = 0;

	@OriginalMember(owner = "client!apv", name = "cr", descriptor = "[I")
	public int[] anIntArray278 = new int[8];

	@OriginalMember(owner = "client!apv", name = "cx", descriptor = "[I")
	public int[] anIntArray277 = new int[8];

	@OriginalMember(owner = "client!apv", name = "ct", descriptor = "I")
	public int anInt2904 = 0;

	@OriginalMember(owner = "client!apv", name = "cv", descriptor = "I")
	public int anInt2906 = 0;

	@OriginalMember(owner = "client!apv", name = "cu", descriptor = "I")
	public int anInt2907 = -810466567;

	@OriginalMember(owner = "client!apv", name = "cm", descriptor = "I")
	public int anInt2908 = 0;

	@OriginalMember(owner = "client!apv", name = "ci", descriptor = "I")
	public int anInt2910 = 1021477997;

	@OriginalMember(owner = "client!apv", name = "co", descriptor = "Z")
	public boolean aBoolean485 = false;

	@OriginalMember(owner = "client!apv", name = "cn", descriptor = "I")
	public int anInt2911 = 0;

	@OriginalMember(owner = "client!apv", name = "cq", descriptor = "I")
	public int anInt2915 = -2018919677;

	@OriginalMember(owner = "client!apv", name = "cy", descriptor = "I")
	public int anInt2909 = -257035979;

	@OriginalMember(owner = "client!apv", name = "cs", descriptor = "I")
	public int anInt2913 = 1016440263;

	@OriginalMember(owner = "client!apv", name = "cd", descriptor = "I")
	public int anInt2916 = 1286676453;

	@OriginalMember(owner = "client!apv", name = "cj", descriptor = "I")
	public int anInt2914 = 0;

	@OriginalMember(owner = "client!apv", name = "ce", descriptor = "I")
	public int anInt2905 = -1640786827;

	@OriginalMember(owner = "client!apv", name = "dt", descriptor = "Lclient!gr;")
	public Class282 aClass282_1 = Class282.aClass282_4;

	@OriginalMember(owner = "client!apv", name = "dh", descriptor = "Lclient!wd;")
	public Class615 aClass615_1 = Class615.aClass615_4;

	@OriginalMember(owner = "client!apv", name = "dq", descriptor = "Z")
	public boolean aBoolean486 = false;

	@OriginalMember(owner = "client!apv", name = "<init>", descriptor = "(Lclient!tk;)V", line = 73)
	public Class104_Sub1_Sub1_Sub1_Sub2(@OriginalArg(0) Class556 arg0) {
		super(arg0, Class562.aClass80_Sub1_Sub1_2);
		this.method21169();
	}

	@OriginalMember(owner = "client!apv", name = "<init>", descriptor = "(Lclient!tk;I)V", line = 78)
	public Class104_Sub1_Sub1_Sub1_Sub2(@OriginalArg(0) Class556 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1, Class562.aClass80_Sub1_Sub1_2);
		this.method21169();
	}

	@OriginalMember(owner = "client!apv", name = "hu", descriptor = "(Lclient!akv;BI)V", line = 83)
	public void method21160(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) byte arg1) {
		this.aByte77 = arg1;
		@Pc(4) int local4 = -1;
		this.anInt2911 = 0;
		@Pc(12) int[] local12 = new int[Class636.aClass627_1.anIntArray519.length];
		@Pc(17) Class20[] local17 = new Class20[Class636.aClass627_1.anIntArray519.length];
		@Pc(22) Class18[] local22 = new Class18[Class636.aClass627_1.anIntArray519.length];
		@Pc(24) int local24;
		@Pc(39) int local39;
		@Pc(50) int local50;
		@Pc(56) int local56;
		@Pc(101) int local101;
		for (local24 = 0; local24 < Class636.aClass627_1.anIntArray519.length; local24++) {
			if (Class636.aClass627_1.anIntArray519[local24] != 1) {
				local39 = arg0.method22478();
				if (local39 == 0) {
					local12[local24] = 0;
				} else {
					local50 = arg0.method22478();
					local56 = (local39 << 8) + local50;
					if (local24 == 0 && local56 == 65535) {
						local4 = arg0.method22549();
						this.anInt2911 = arg0.method22478() * -569974883;
						break;
					}
					if (local56 >= 16384) {
						local56 -= 16384;
						local12[local24] = local56 | 0x40000000;
						local22[local24] = (Class18) Class537.aClass35_Sub7_1.method18319(local56);
						local101 = local22[local24].anInt53 * -1277070211;
						if (local101 != 0) {
							this.anInt2911 = local101 * -569974883;
						}
					} else {
						local12[local24] = local56 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (local4 == -1) {
			local24 = arg0.method22483();
			local39 = 0;
			for (local50 = 0; local50 < Class636.aClass627_1.anIntArray519.length; local50++) {
				if (Class636.aClass627_1.anIntArray519[local50] == 0) {
					if ((local24 & 0x1 << local39) != 0) {
						local17[local50] = Class481.method29823(local22[local50], arg0);
					}
					local39++;
				}
			}
		}
		@Pc(163) int[] local163 = new int[10];
		for (local39 = 0; local39 < 10; local39++) {
			local50 = arg0.method22478();
			if (Class101.aShortArrayArrayArray9.length < 1 || local50 < 0 || local50 >= Class101.aShortArrayArrayArray9[local39][0].length) {
				local50 = 0;
			}
			local163[local39] = local50;
		}
		@Pc(197) int[] local197 = new int[10];
		for (local50 = 0; local50 < 10; local50++) {
			local56 = arg0.method22478();
			if (Class479.aShortArrayArrayArray10.length < 1 || local56 < 0 || local56 >= Class479.aShortArrayArrayArray10[local50][0].length) {
				local56 = 0;
			}
			local197[local50] = local56;
		}
		this.anInt2912 = arg0.method22483() * -522485945;
		if (this.aClass628_1 == null) {
			this.aClass628_1 = new Class628();
		}
		local50 = this.aClass628_1.anInt5660 * 1568742735;
		@Pc(254) int[] local254 = this.aClass628_1.anIntArray523;
		this.aClass628_1.method32541(this.method21140(), local12, local17, local163, local197, this.aByte77 == 1, local4);
		if (local50 != local4) {
			@Pc(281) Class447 local281 = Class447.method29124(this.method24085().aClass447_61);
			local281.aFloat277 = (this.anIntArray274[0] << 9) + (this.method21095() << 8);
			local281.aFloat278 = (this.anIntArray275[0] << 9) + (this.method21095() << 8);
			this.method24102(local281);
			local281.method29130();
		}
		if (client.anInt3389 * -643758853 == this.anInt2867 * 1126388985 && local254 != null) {
			for (local101 = 0; local101 < local163.length; local101++) {
				if (local163[local101] != local254[local101]) {
					Class537.aClass35_Sub7_1.method17020();
					break;
				}
			}
		}
		if (this.aClass626_3 != null) {
			this.aClass626_3.method32499();
		}
		if (!this.aClass151_Sub1_3.method23396() || !this.aClass151_Sub1_3.aBoolean363) {
			return;
		}
		@Pc(365) Class570 local365 = this.method21105();
		if (!local365.method31448(this.aClass151_Sub1_3.method23399())) {
			this.aClass151_Sub1_3.method23401(-1);
			this.aClass151_Sub1_3.aBoolean363 = false;
		}
	}

	@OriginalMember(owner = "client!apv", name = "hm", descriptor = "(Lclient!akv;B)V", line = 83)
	public void method21161(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) byte arg1) {
		this.aByte77 = arg1;
		@Pc(4) int local4 = -1;
		this.anInt2911 = 0;
		@Pc(12) int[] local12 = new int[Class636.aClass627_1.anIntArray519.length];
		@Pc(17) Class20[] local17 = new Class20[Class636.aClass627_1.anIntArray519.length];
		@Pc(22) Class18[] local22 = new Class18[Class636.aClass627_1.anIntArray519.length];
		@Pc(24) int local24;
		@Pc(39) int local39;
		@Pc(50) int local50;
		@Pc(56) int local56;
		@Pc(101) int local101;
		for (local24 = 0; local24 < Class636.aClass627_1.anIntArray519.length; local24++) {
			if (Class636.aClass627_1.anIntArray519[local24] != 1) {
				local39 = arg0.method22478();
				if (local39 == 0) {
					local12[local24] = 0;
				} else {
					local50 = arg0.method22478();
					local56 = (local39 << 8) + local50;
					if (local24 == 0 && local56 == 65535) {
						local4 = arg0.method22549();
						this.anInt2911 = arg0.method22478() * -569974883;
						break;
					}
					if (local56 >= 16384) {
						local56 -= 16384;
						local12[local24] = local56 | 0x40000000;
						local22[local24] = (Class18) Class537.aClass35_Sub7_1.method18319(local56);
						local101 = local22[local24].anInt53 * -1277070211;
						if (local101 != 0) {
							this.anInt2911 = local101 * -569974883;
						}
					} else {
						local12[local24] = local56 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (local4 == -1) {
			local24 = arg0.method22483();
			local39 = 0;
			for (local50 = 0; local50 < Class636.aClass627_1.anIntArray519.length; local50++) {
				if (Class636.aClass627_1.anIntArray519[local50] == 0) {
					if ((local24 & 0x1 << local39) != 0) {
						local17[local50] = Class481.method29823(local22[local50], arg0);
					}
					local39++;
				}
			}
		}
		@Pc(163) int[] local163 = new int[10];
		for (local39 = 0; local39 < 10; local39++) {
			local50 = arg0.method22478();
			if (Class101.aShortArrayArrayArray9.length < 1 || local50 < 0 || local50 >= Class101.aShortArrayArrayArray9[local39][0].length) {
				local50 = 0;
			}
			local163[local39] = local50;
		}
		@Pc(197) int[] local197 = new int[10];
		for (local50 = 0; local50 < 10; local50++) {
			local56 = arg0.method22478();
			if (Class479.aShortArrayArrayArray10.length < 1 || local56 < 0 || local56 >= Class479.aShortArrayArrayArray10[local50][0].length) {
				local56 = 0;
			}
			local197[local50] = local56;
		}
		this.anInt2912 = arg0.method22483() * -522485945;
		if (this.aClass628_1 == null) {
			this.aClass628_1 = new Class628();
		}
		local50 = this.aClass628_1.anInt5660 * 1568742735;
		@Pc(254) int[] local254 = this.aClass628_1.anIntArray523;
		this.aClass628_1.method32541(this.method21140(), local12, local17, local163, local197, this.aByte77 == 1, local4);
		if (local50 != local4) {
			@Pc(281) Class447 local281 = Class447.method29124(this.method24085().aClass447_61);
			local281.aFloat277 = (this.anIntArray274[0] << 9) + (this.method21095() << 8);
			local281.aFloat278 = (this.anIntArray275[0] << 9) + (this.method21095() << 8);
			this.method24102(local281);
			local281.method29130();
		}
		if (client.anInt3389 * -643758853 == this.anInt2867 * 1126388985 && local254 != null) {
			for (local101 = 0; local101 < local163.length; local101++) {
				if (local163[local101] != local254[local101]) {
					Class537.aClass35_Sub7_1.method17020();
					break;
				}
			}
		}
		if (this.aClass626_3 != null) {
			this.aClass626_3.method32499();
		}
		if (!this.aClass151_Sub1_3.method23396() || !this.aClass151_Sub1_3.aBoolean363) {
			return;
		}
		@Pc(365) Class570 local365 = this.method21105();
		if (!local365.method31448(this.aClass151_Sub1_3.method23399())) {
			this.aClass151_Sub1_3.method23401(-1);
			this.aClass151_Sub1_3.aBoolean363 = false;
		}
	}

	@OriginalMember(owner = "client!apv", name = "hs", descriptor = "(Lclient!akv;B)V", line = 83)
	public void method21162(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) byte arg1) {
		this.aByte77 = arg1;
		@Pc(4) int local4 = -1;
		this.anInt2911 = 0;
		@Pc(12) int[] local12 = new int[Class636.aClass627_1.anIntArray519.length];
		@Pc(17) Class20[] local17 = new Class20[Class636.aClass627_1.anIntArray519.length];
		@Pc(22) Class18[] local22 = new Class18[Class636.aClass627_1.anIntArray519.length];
		@Pc(24) int local24;
		@Pc(39) int local39;
		@Pc(50) int local50;
		@Pc(56) int local56;
		@Pc(101) int local101;
		for (local24 = 0; local24 < Class636.aClass627_1.anIntArray519.length; local24++) {
			if (Class636.aClass627_1.anIntArray519[local24] != 1) {
				local39 = arg0.method22478();
				if (local39 == 0) {
					local12[local24] = 0;
				} else {
					local50 = arg0.method22478();
					local56 = (local39 << 8) + local50;
					if (local24 == 0 && local56 == 65535) {
						local4 = arg0.method22549();
						this.anInt2911 = arg0.method22478() * -569974883;
						break;
					}
					if (local56 >= 16384) {
						local56 -= 16384;
						local12[local24] = local56 | 0x40000000;
						local22[local24] = (Class18) Class537.aClass35_Sub7_1.method18319(local56);
						local101 = local22[local24].anInt53 * -1277070211;
						if (local101 != 0) {
							this.anInt2911 = local101 * -569974883;
						}
					} else {
						local12[local24] = local56 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (local4 == -1) {
			local24 = arg0.method22483();
			local39 = 0;
			for (local50 = 0; local50 < Class636.aClass627_1.anIntArray519.length; local50++) {
				if (Class636.aClass627_1.anIntArray519[local50] == 0) {
					if ((local24 & 0x1 << local39) != 0) {
						local17[local50] = Class481.method29823(local22[local50], arg0);
					}
					local39++;
				}
			}
		}
		@Pc(163) int[] local163 = new int[10];
		for (local39 = 0; local39 < 10; local39++) {
			local50 = arg0.method22478();
			if (Class101.aShortArrayArrayArray9.length < 1 || local50 < 0 || local50 >= Class101.aShortArrayArrayArray9[local39][0].length) {
				local50 = 0;
			}
			local163[local39] = local50;
		}
		@Pc(197) int[] local197 = new int[10];
		for (local50 = 0; local50 < 10; local50++) {
			local56 = arg0.method22478();
			if (Class479.aShortArrayArrayArray10.length < 1 || local56 < 0 || local56 >= Class479.aShortArrayArrayArray10[local50][0].length) {
				local56 = 0;
			}
			local197[local50] = local56;
		}
		this.anInt2912 = arg0.method22483() * -522485945;
		if (this.aClass628_1 == null) {
			this.aClass628_1 = new Class628();
		}
		local50 = this.aClass628_1.anInt5660 * 1568742735;
		@Pc(254) int[] local254 = this.aClass628_1.anIntArray523;
		this.aClass628_1.method32541(this.method21140(), local12, local17, local163, local197, this.aByte77 == 1, local4);
		if (local50 != local4) {
			@Pc(281) Class447 local281 = Class447.method29124(this.method24085().aClass447_61);
			local281.aFloat277 = (this.anIntArray274[0] << 9) + (this.method21095() << 8);
			local281.aFloat278 = (this.anIntArray275[0] << 9) + (this.method21095() << 8);
			this.method24102(local281);
			local281.method29130();
		}
		if (client.anInt3389 * -643758853 == this.anInt2867 * 1126388985 && local254 != null) {
			for (local101 = 0; local101 < local163.length; local101++) {
				if (local163[local101] != local254[local101]) {
					Class537.aClass35_Sub7_1.method17020();
					break;
				}
			}
		}
		if (this.aClass626_3 != null) {
			this.aClass626_3.method32499();
		}
		if (!this.aClass151_Sub1_3.method23396() || !this.aClass151_Sub1_3.aBoolean363) {
			return;
		}
		@Pc(365) Class570 local365 = this.method21105();
		if (!local365.method31448(this.aClass151_Sub1_3.method23399())) {
			this.aClass151_Sub1_3.method23401(-1);
			this.aClass151_Sub1_3.aBoolean363 = false;
		}
	}

	@OriginalMember(owner = "client!apv", name = "hw", descriptor = "(Lclient!akv;B)V", line = 168)
	public final void method21163(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.anInt3089 = 0;
		@Pc(6) int local6 = arg0.method22478();
		@Pc(11) byte local11 = (byte) (local6 & 0x1);
		@Pc(19) boolean local19 = (local6 & 0x4) != 0;
		@Pc(23) int local23 = super.method21095();
		this.method21092((local6 >> 3 & 0x7) + 1);
		@Pc(42) boolean local42 = (local6 & 0x40) != 0;
		@Pc(50) boolean local50 = (local6 & 0x80) != 0;
		@Pc(55) Class447 local55 = Class447.method29124(this.method24085().aClass447_61);
		local55.aFloat277 += this.method21095() - local23 << 8;
		local55.aFloat278 += this.method21095() - local23 << 8;
		this.method24102(local55);
		local55.method29130();
		if (local42) {
			this.aString83 = arg0.method22526();
		} else {
			this.aString83 = null;
		}
		if (local50) {
			this.aString84 = arg0.method22526();
		} else {
			this.aString84 = null;
		}
		this.aClass615_1 = (Class615) Class457.method29479(Class615.method32345(), arg0.method22481());
		if (Class661.aClass661_5 == client.aClass661_1 && client.anInt3466 * 365872613 >= 2) {
			this.aClass615_1 = Class615.aClass615_4;
		}
		this.method21160(arg0, local11);
		this.aString85 = arg0.method22523();
		this.aString82 = this.aString85;
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 == this) {
			RuntimeException_Sub1.aString115 = this.aString85;
		}
		this.anInt2904 = arg0.method22478() * 1539382797;
		if (local19) {
			this.anInt2908 = arg0.method22483() * -1240813047;
			if (this.anInt2908 * -825066439 == 65535) {
				this.anInt2908 = 1240813047;
			}
			this.anInt2906 = this.anInt2904 * -1924340515;
			this.anInt2907 = -810466567;
		} else {
			this.anInt2908 = 0;
			this.anInt2906 = arg0.method22478() * 1230406969;
			this.anInt2907 = arg0.method22478() * 810466567;
			if (this.anInt2907 * 800727223 == 255) {
				this.anInt2907 = -810466567;
			}
		}
		@Pc(215) int local215 = this.anInt2914 * -785793877;
		this.anInt2914 = arg0.method22478() * -1280025085;
		if (this.anInt2914 * -785793877 == 0) {
			Class576.method31612(this);
			return;
		}
		@Pc(233) int local233 = this.anInt2915 * -729876395;
		@Pc(238) int local238 = this.anInt2909 * -2046269725;
		@Pc(243) int local243 = this.anInt2913 * 1734964233;
		@Pc(248) int local248 = this.anInt2916 * -510526957;
		@Pc(253) int local253 = this.anInt2905 * 18694435;
		this.anInt2915 = arg0.method22483() * 2018919677;
		this.anInt2909 = arg0.method22483() * 257035979;
		this.anInt2913 = arg0.method22483() * -1016440263;
		this.anInt2916 = arg0.method22483() * -1286676453;
		this.anInt2905 = arg0.method22478() * 616756875;
		if (this.anInt2914 * -785793877 != local215 || this.anInt2915 * -729876395 != local233 || local238 != this.anInt2909 * -2046269725 || local243 != this.anInt2913 * 1734964233 || local248 != this.anInt2916 * -510526957 || local253 != this.anInt2905 * 18694435) {
			Class608.method32140(this);
		}
	}

	@OriginalMember(owner = "client!apv", name = "hx", descriptor = "(Lclient!akv;)V", line = 168)
	public final void method21164(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.anInt3089 = 0;
		@Pc(6) int local6 = arg0.method22478();
		@Pc(11) byte local11 = (byte) (local6 & 0x1);
		@Pc(19) boolean local19 = (local6 & 0x4) != 0;
		@Pc(23) int local23 = super.method21095();
		this.method21092((local6 >> 3 & 0x7) + 1);
		@Pc(42) boolean local42 = (local6 & 0x40) != 0;
		@Pc(50) boolean local50 = (local6 & 0x80) != 0;
		@Pc(55) Class447 local55 = Class447.method29124(this.method24085().aClass447_61);
		local55.aFloat277 += this.method21095() - local23 << 8;
		local55.aFloat278 += this.method21095() - local23 << 8;
		this.method24102(local55);
		local55.method29130();
		if (local42) {
			this.aString83 = arg0.method22526();
		} else {
			this.aString83 = null;
		}
		if (local50) {
			this.aString84 = arg0.method22526();
		} else {
			this.aString84 = null;
		}
		this.aClass615_1 = (Class615) Class457.method29479(Class615.method32345(), arg0.method22481());
		if (Class661.aClass661_5 == client.aClass661_1 && client.anInt3466 * 365872613 >= 2) {
			this.aClass615_1 = Class615.aClass615_4;
		}
		this.method21160(arg0, local11);
		this.aString85 = arg0.method22523();
		this.aString82 = this.aString85;
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 == this) {
			RuntimeException_Sub1.aString115 = this.aString85;
		}
		this.anInt2904 = arg0.method22478() * 1539382797;
		if (local19) {
			this.anInt2908 = arg0.method22483() * -1240813047;
			if (this.anInt2908 * -825066439 == 65535) {
				this.anInt2908 = 1240813047;
			}
			this.anInt2906 = this.anInt2904 * -1924340515;
			this.anInt2907 = -810466567;
		} else {
			this.anInt2908 = 0;
			this.anInt2906 = arg0.method22478() * 1230406969;
			this.anInt2907 = arg0.method22478() * 810466567;
			if (this.anInt2907 * 800727223 == 255) {
				this.anInt2907 = -810466567;
			}
		}
		@Pc(215) int local215 = this.anInt2914 * -785793877;
		this.anInt2914 = arg0.method22478() * -1280025085;
		if (this.anInt2914 * -785793877 == 0) {
			Class576.method31612(this);
			return;
		}
		@Pc(233) int local233 = this.anInt2915 * -729876395;
		@Pc(238) int local238 = this.anInt2909 * -2046269725;
		@Pc(243) int local243 = this.anInt2913 * 1734964233;
		@Pc(248) int local248 = this.anInt2916 * -510526957;
		@Pc(253) int local253 = this.anInt2905 * 18694435;
		this.anInt2915 = arg0.method22483() * 2018919677;
		this.anInt2909 = arg0.method22483() * 257035979;
		this.anInt2913 = arg0.method22483() * -1016440263;
		this.anInt2916 = arg0.method22483() * -1286676453;
		this.anInt2905 = arg0.method22478() * 616756875;
		if (this.anInt2914 * -785793877 != local215 || this.anInt2915 * -729876395 != local233 || local238 != this.anInt2909 * -2046269725 || local243 != this.anInt2913 * 1734964233 || local248 != this.anInt2916 * -510526957 || local253 != this.anInt2905 * 18694435) {
			Class608.method32140(this);
		}
	}

	@OriginalMember(owner = "client!apv", name = "he", descriptor = "(Lclient!akv;)V", line = 168)
	public final void method21165(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.anInt3089 = 0;
		@Pc(6) int local6 = arg0.method22478();
		@Pc(11) byte local11 = (byte) (local6 & 0x1);
		@Pc(19) boolean local19 = (local6 & 0x4) != 0;
		@Pc(23) int local23 = super.method21095();
		this.method21092((local6 >> 3 & 0x7) + 1);
		@Pc(42) boolean local42 = (local6 & 0x40) != 0;
		@Pc(50) boolean local50 = (local6 & 0x80) != 0;
		@Pc(55) Class447 local55 = Class447.method29124(this.method24085().aClass447_61);
		local55.aFloat277 += this.method21095() - local23 << 8;
		local55.aFloat278 += this.method21095() - local23 << 8;
		this.method24102(local55);
		local55.method29130();
		if (local42) {
			this.aString83 = arg0.method22526();
		} else {
			this.aString83 = null;
		}
		if (local50) {
			this.aString84 = arg0.method22526();
		} else {
			this.aString84 = null;
		}
		this.aClass615_1 = (Class615) Class457.method29479(Class615.method32345(), arg0.method22481());
		if (Class661.aClass661_5 == client.aClass661_1 && client.anInt3466 * 365872613 >= 2) {
			this.aClass615_1 = Class615.aClass615_4;
		}
		this.method21160(arg0, local11);
		this.aString85 = arg0.method22523();
		this.aString82 = this.aString85;
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 == this) {
			RuntimeException_Sub1.aString115 = this.aString85;
		}
		this.anInt2904 = arg0.method22478() * 1539382797;
		if (local19) {
			this.anInt2908 = arg0.method22483() * -1240813047;
			if (this.anInt2908 * -825066439 == 65535) {
				this.anInt2908 = 1240813047;
			}
			this.anInt2906 = this.anInt2904 * -1924340515;
			this.anInt2907 = -810466567;
		} else {
			this.anInt2908 = 0;
			this.anInt2906 = arg0.method22478() * 1230406969;
			this.anInt2907 = arg0.method22478() * 810466567;
			if (this.anInt2907 * 800727223 == 255) {
				this.anInt2907 = -810466567;
			}
		}
		@Pc(215) int local215 = this.anInt2914 * -785793877;
		this.anInt2914 = arg0.method22478() * -1280025085;
		if (this.anInt2914 * -785793877 == 0) {
			Class576.method31612(this);
			return;
		}
		@Pc(233) int local233 = this.anInt2915 * -729876395;
		@Pc(238) int local238 = this.anInt2909 * -2046269725;
		@Pc(243) int local243 = this.anInt2913 * 1734964233;
		@Pc(248) int local248 = this.anInt2916 * -510526957;
		@Pc(253) int local253 = this.anInt2905 * 18694435;
		this.anInt2915 = arg0.method22483() * 2018919677;
		this.anInt2909 = arg0.method22483() * 257035979;
		this.anInt2913 = arg0.method22483() * -1016440263;
		this.anInt2916 = arg0.method22483() * -1286676453;
		this.anInt2905 = arg0.method22478() * 616756875;
		if (this.anInt2914 * -785793877 != local215 || this.anInt2915 * -729876395 != local233 || local238 != this.anInt2909 * -2046269725 || local243 != this.anInt2913 * 1734964233 || local248 != this.anInt2916 * -510526957 || local253 != this.anInt2905 * 18694435) {
			Class608.method32140(this);
		}
	}

	@OriginalMember(owner = "client!apv", name = "ht", descriptor = "(Lclient!akv;B)V", line = 225)
	public void method21166(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.anInt3089 = 0;
		@Pc(6) int local6 = arg0.method22478();
		for (@Pc(8) int local8 = 0; local8 < this.anIntArray278.length; local8++) {
			if ((local6 & 0x1 << local8) == 0) {
				this.anIntArray278[local8] = -1;
				this.anIntArray277[local8] = -1;
			} else {
				@Pc(23) int local23 = arg0.method22478();
				@Pc(27) int local27 = arg0.method22483();
				this.anIntArray278[local8] = local23;
				this.anIntArray277[local8] = local27;
			}
		}
	}

	@OriginalMember(owner = "client!apv", name = "ho", descriptor = "(Lclient!akv;)V", line = 225)
	public void method21167(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.anInt3089 = 0;
		@Pc(6) int local6 = arg0.method22478();
		for (@Pc(8) int local8 = 0; local8 < this.anIntArray278.length; local8++) {
			if ((local6 & 0x1 << local8) == 0) {
				this.anIntArray278[local8] = -1;
				this.anIntArray277[local8] = -1;
			} else {
				@Pc(23) int local23 = arg0.method22478();
				@Pc(27) int local27 = arg0.method22483();
				this.anIntArray278[local8] = local23;
				this.anIntArray277[local8] = local27;
			}
		}
	}

	@OriginalMember(owner = "client!apv", name = "iq", descriptor = "(Lclient!akv;)V", line = 225)
	public void method21168(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.anInt3089 = 0;
		@Pc(6) int local6 = arg0.method22478();
		for (@Pc(8) int local8 = 0; local8 < this.anIntArray278.length; local8++) {
			if ((local6 & 0x1 << local8) == 0) {
				this.anIntArray278[local8] = -1;
				this.anIntArray277[local8] = -1;
			} else {
				@Pc(23) int local23 = arg0.method22478();
				@Pc(27) int local27 = arg0.method22483();
				this.anIntArray278[local8] = local23;
				this.anIntArray277[local8] = local27;
			}
		}
	}

	@OriginalMember(owner = "client!apv", name = "hz", descriptor = "(I)V", line = 242)
	void method21169() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anIntArray278.length; local1++) {
			this.anIntArray278[local1] = -1;
		}
		for (local1 = 0; local1 < this.anIntArray277.length; local1++) {
			this.anIntArray277[local1] = -1;
		}
	}

	@OriginalMember(owner = "client!apv", name = "fz", descriptor = "(Lclient!dx;S)Lclient!tu;", line = 247)
	@Override
	public Class563 method24144(@OriginalArg(0) Class86 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!apv", name = "fj", descriptor = "(Lclient!dx;)Lclient!tu;", line = 247)
	@Override
	public Class563 method24157(@OriginalArg(0) Class86 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!apv", name = "fh", descriptor = "(Lclient!dx;)Lclient!tu;", line = 247)
	@Override
	public Class563 method24155(@OriginalArg(0) Class86 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!apv", name = "ff", descriptor = "(Lclient!dx;I)Lclient!te;", line = 251)
	@Override
	Class551 method24143(@OriginalArg(0) Class86 arg0) {
		if (this.aClass628_1 == null || !this.method21172(arg0, 2048)) {
			return null;
		}
		@Pc(14) Class455 local14 = arg0.method20370();
		@Pc(17) Class455 local17 = this.method24094();
		@Pc(20) Class453 local20 = this.method24085();
		@Pc(25) int local25 = this.aClass503_7.method30242();
		@Pc(46) Class567 local46 = this.aClass556_23.aClass567ArrayArrayArray1[this.aByte100][(int) local20.aClass447_61.aFloat277 >> 9][(int) local20.aClass447_61.aFloat278 >> 9];
		if (local46 == null || local46.aClass104_Sub1_Sub4_1 == null) {
			this.anInt2872 = (int) ((float) (this.anInt2872 * -996512449) - (float) (this.anInt2872 * -996512449) / 10.0F) * -1299053889;
		} else {
			@Pc(61) int local61 = this.anInt2872 * -996512449 - local46.aClass104_Sub1_Sub4_1.aShort99;
			this.anInt2872 = (int) ((float) (this.anInt2872 * -996512449) - (float) local61 / 10.0F) * -1299053889;
		}
		local14.method29387(local17);
		local14.method29436(0.0F, (float) (-20 - -996512449 * this.anInt2872), 0.0F);
		@Pc(111) Class551 local111 = null;
		this.aBoolean482 = false;
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub2_1.method14938() == 1) {
			@Pc(124) Class570 local124 = this.method21105();
			if (local124.aBoolean803 && (this.aClass628_1.anInt5660 * 1568742735 == -1 || ((Class333) Class578.aClass35_Sub3_1.method18319(this.aClass628_1.anInt5660 * 1568742735)).aBoolean711)) {
				@Pc(160) Class151 local160 = this.aClass151_3.method23396() && this.aClass151_3.method23422() ? this.aClass151_3 : null;
				@Pc(177) Class151_Sub1 local177 = this.aClass151_Sub1_3.method23396() && (!this.aClass151_Sub1_3.aBoolean363 || local160 == null) ? this.aClass151_Sub1_3 : null;
				@Pc(180) short local180 = Class617.aClass629_1.aShort186;
				@Pc(183) byte local183 = Class617.aClass629_1.aByte174;
				if (this.aClass628_1.anInt5660 * 1568742735 != -1) {
					local180 = ((Class333) Class578.aClass35_Sub3_1.method18319(this.aClass628_1.anInt5660 * 1568742735)).aShort169;
					local183 = ((Class333) Class578.aClass35_Sub3_1.method18319(this.aClass628_1.anInt5660 * 1568742735)).aByte136;
				}
				@Pc(214) Class84 local214 = null;
				if (local180 > -1 && Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1.method15463() == 1) {
					local214 = Class143_Sub36.method16114(arg0, local25, this.anInt2883 * 1177236321, this.anInt2875 * -1556313745, this.anInt2876 * 956485751, this.aClass84Array3[0], local180, local183, local177 == null ? local160 : local177);
				} else {
					local214 = Class96_Sub4.method7126(arg0, local25, this.anInt2883 * 1177236321, this.anInt2875 * -1556313745, this.anInt2876 * 956485751, 1, this.aClass84Array3[0], 0, 0, 160, 240, local177 == null ? local160 : local177);
				}
				if (local214 != null) {
					if (this.aClass224Array21 == null || this.aClass224Array21.length < this.aClass84Array3.length + 1) {
						this.method24135(this.aClass84Array3.length + 1);
					}
					local111 = Class346.method27844(true);
					this.aBoolean482 = true;
					arg0.method20230(false);
					local214.method6813(local14, this.aClass224Array21[this.aClass84Array3.length], 0);
					arg0.method20230(true);
				}
			}
		}
		@Pc(338) int local338;
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 == this) {
			for (local338 = client.aClass73Array1.length - 1; local338 >= 0; local338--) {
				@Pc(344) Class73 local344 = client.aClass73Array1[local338];
				if (local344 != null && local344.anInt213 * 645502113 != -1) {
					@Pc(386) int local386;
					if (local344.anInt215 * 652406965 == 1) {
						@Pc(368) Class77_Sub6 local368 = (Class77_Sub6) client.aClass12_22.method173((long) (local344.anInt208 * -879249997));
						if (local368 != null) {
							@Pc(374) Class104_Sub1_Sub1_Sub1_Sub1 local374 = (Class104_Sub1_Sub1_Sub1_Sub1) local368.anObject5;
							@Pc(382) Class447 local382 = Class447.method29160(local374.method24085().aClass447_61, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61);
							local386 = (int) local382.aFloat277;
							@Pc(390) int local390 = (int) local382.aFloat278;
							this.method21170(arg0, local14, this.aClass84Array3[0], (long) local386, (long) local390, local344.anInt213 * 645502113, 92160000L);
						}
					}
					if (local344.anInt215 * 652406965 == 2) {
						@Pc(417) Class447 local417 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61;
						@Pc(427) long local427 = (long) (local344.anInt210 * 487170425 - (int) local417.aFloat277);
						@Pc(437) long local437 = (long) (local344.anInt211 * 631467137 - (int) local417.aFloat278);
						@Pc(445) long local445 = (long) (local344.anInt214 * -41335265 << 9);
						@Pc(449) long local449 = local445 * local445;
						this.method21170(arg0, local14, this.aClass84Array3[0], local427, local437, local344.anInt213 * 645502113, local449);
					}
					if (local344.anInt215 * 652406965 == 10 && local344.anInt208 * -879249997 >= 0 && local344.anInt208 * -879249997 < client.aClass104_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(489) Class104_Sub1_Sub1_Sub1_Sub2 local489 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local344.anInt208 * -879249997];
						if (local489 != null) {
							@Pc(499) Class447 local499 = Class447.method29160(local489.method24085().aClass447_61, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61);
							@Pc(503) int local503 = (int) local499.aFloat277;
							local386 = (int) local499.aFloat278;
							this.method21170(arg0, local14, this.aClass84Array3[0], (long) local503, (long) local386, local344.anInt213 * 645502113, 92160000L);
						}
					}
				}
			}
		}
		local14.method29387(local17);
		local14.method29436(0.0F, (float) (-5 - this.anInt2872 * -996512449), 0.0F);
		if (this.aClass224Array21 == null || this.aClass224Array21.length < this.aClass84Array3.length) {
			this.method24135(this.aClass84Array3.length);
		}
		if (local111 == null) {
			local111 = Class346.method27844(true);
		}
		this.method21077(arg0, this.aClass84Array3, local14, false);
		for (local338 = 0; local338 < this.aClass84Array3.length; local338++) {
			if (this.aClass84Array3[local338] == null) {
				this.aClass224Array21[local338].aBoolean644 = false;
			} else {
				this.aClass84Array3[local338].method6813(local14, this.aClass224Array21[local338], Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 == this ? 1 : 0);
			}
		}
		if (this.aClass626_3 != null) {
			@Pc(615) Class207 local615 = this.aClass626_3.method32532();
			arg0.method20120(local615);
		}
		for (local338 = 0; local338 < this.aClass84Array3.length; local338++) {
			if (this.aClass84Array3[local338] != null) {
				this.aBoolean482 |= this.aClass84Array3[local338].method6809();
			}
			this.aClass84Array3[local338] = null;
		}
		this.anInt2878 = client.anInt3447 * 842490719;
		return local111;
	}

	@OriginalMember(owner = "client!apv", name = "gt", descriptor = "(Lclient!dx;)Lclient!te;", line = 251)
	@Override
	Class551 method24167(@OriginalArg(0) Class86 arg0) {
		if (this.aClass628_1 == null || !this.method21172(arg0, 2048)) {
			return null;
		}
		@Pc(14) Class455 local14 = arg0.method20370();
		@Pc(17) Class455 local17 = this.method24094();
		@Pc(20) Class453 local20 = this.method24085();
		@Pc(25) int local25 = this.aClass503_7.method30242();
		@Pc(46) Class567 local46 = this.aClass556_23.aClass567ArrayArrayArray1[this.aByte100][(int) local20.aClass447_61.aFloat277 >> 9][(int) local20.aClass447_61.aFloat278 >> 9];
		if (local46 == null || local46.aClass104_Sub1_Sub4_1 == null) {
			this.anInt2872 = (int) ((float) (this.anInt2872 * -996512449) - (float) (this.anInt2872 * -996512449) / 10.0F) * -1299053889;
		} else {
			@Pc(61) int local61 = this.anInt2872 * -996512449 - local46.aClass104_Sub1_Sub4_1.aShort99;
			this.anInt2872 = (int) ((float) (this.anInt2872 * -996512449) - (float) local61 / 10.0F) * -1299053889;
		}
		local14.method29387(local17);
		local14.method29436(0.0F, (float) (-20 - -996512449 * this.anInt2872), 0.0F);
		@Pc(111) Class551 local111 = null;
		this.aBoolean482 = false;
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub2_1.method14938() == 1) {
			@Pc(124) Class570 local124 = this.method21105();
			if (local124.aBoolean803 && (this.aClass628_1.anInt5660 * 1568742735 == -1 || ((Class333) Class578.aClass35_Sub3_1.method18319(this.aClass628_1.anInt5660 * 1568742735)).aBoolean711)) {
				@Pc(160) Class151 local160 = this.aClass151_3.method23396() && this.aClass151_3.method23422() ? this.aClass151_3 : null;
				@Pc(177) Class151_Sub1 local177 = this.aClass151_Sub1_3.method23396() && (!this.aClass151_Sub1_3.aBoolean363 || local160 == null) ? this.aClass151_Sub1_3 : null;
				@Pc(180) short local180 = Class617.aClass629_1.aShort186;
				@Pc(183) byte local183 = Class617.aClass629_1.aByte174;
				if (this.aClass628_1.anInt5660 * 1568742735 != -1) {
					local180 = ((Class333) Class578.aClass35_Sub3_1.method18319(this.aClass628_1.anInt5660 * 1568742735)).aShort169;
					local183 = ((Class333) Class578.aClass35_Sub3_1.method18319(this.aClass628_1.anInt5660 * 1568742735)).aByte136;
				}
				@Pc(214) Class84 local214 = null;
				if (local180 > -1 && Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1.method15463() == 1) {
					local214 = Class143_Sub36.method16114(arg0, local25, this.anInt2883 * 1177236321, this.anInt2875 * -1556313745, this.anInt2876 * 956485751, this.aClass84Array3[0], local180, local183, local177 == null ? local160 : local177);
				} else {
					local214 = Class96_Sub4.method7126(arg0, local25, this.anInt2883 * 1177236321, this.anInt2875 * -1556313745, this.anInt2876 * 956485751, 1, this.aClass84Array3[0], 0, 0, 160, 240, local177 == null ? local160 : local177);
				}
				if (local214 != null) {
					if (this.aClass224Array21 == null || this.aClass224Array21.length < this.aClass84Array3.length + 1) {
						this.method24135(this.aClass84Array3.length + 1);
					}
					local111 = Class346.method27844(true);
					this.aBoolean482 = true;
					arg0.method20230(false);
					local214.method6813(local14, this.aClass224Array21[this.aClass84Array3.length], 0);
					arg0.method20230(true);
				}
			}
		}
		@Pc(338) int local338;
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 == this) {
			for (local338 = client.aClass73Array1.length - 1; local338 >= 0; local338--) {
				@Pc(344) Class73 local344 = client.aClass73Array1[local338];
				if (local344 != null && local344.anInt213 * 645502113 != -1) {
					@Pc(386) int local386;
					if (local344.anInt215 * 652406965 == 1) {
						@Pc(368) Class77_Sub6 local368 = (Class77_Sub6) client.aClass12_22.method173((long) (local344.anInt208 * -879249997));
						if (local368 != null) {
							@Pc(374) Class104_Sub1_Sub1_Sub1_Sub1 local374 = (Class104_Sub1_Sub1_Sub1_Sub1) local368.anObject5;
							@Pc(382) Class447 local382 = Class447.method29160(local374.method24085().aClass447_61, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61);
							local386 = (int) local382.aFloat277;
							@Pc(390) int local390 = (int) local382.aFloat278;
							this.method21170(arg0, local14, this.aClass84Array3[0], (long) local386, (long) local390, local344.anInt213 * 645502113, 92160000L);
						}
					}
					if (local344.anInt215 * 652406965 == 2) {
						@Pc(417) Class447 local417 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61;
						@Pc(427) long local427 = (long) (local344.anInt210 * 487170425 - (int) local417.aFloat277);
						@Pc(437) long local437 = (long) (local344.anInt211 * 631467137 - (int) local417.aFloat278);
						@Pc(445) long local445 = (long) (local344.anInt214 * -41335265 << 9);
						@Pc(449) long local449 = local445 * local445;
						this.method21170(arg0, local14, this.aClass84Array3[0], local427, local437, local344.anInt213 * 645502113, local449);
					}
					if (local344.anInt215 * 652406965 == 10 && local344.anInt208 * -879249997 >= 0 && local344.anInt208 * -879249997 < client.aClass104_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(489) Class104_Sub1_Sub1_Sub1_Sub2 local489 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local344.anInt208 * -879249997];
						if (local489 != null) {
							@Pc(499) Class447 local499 = Class447.method29160(local489.method24085().aClass447_61, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61);
							@Pc(503) int local503 = (int) local499.aFloat277;
							local386 = (int) local499.aFloat278;
							this.method21170(arg0, local14, this.aClass84Array3[0], (long) local503, (long) local386, local344.anInt213 * 645502113, 92160000L);
						}
					}
				}
			}
		}
		local14.method29387(local17);
		local14.method29436(0.0F, (float) (-5 - this.anInt2872 * -996512449), 0.0F);
		if (this.aClass224Array21 == null || this.aClass224Array21.length < this.aClass84Array3.length) {
			this.method24135(this.aClass84Array3.length);
		}
		if (local111 == null) {
			local111 = Class346.method27844(true);
		}
		this.method21077(arg0, this.aClass84Array3, local14, false);
		for (local338 = 0; local338 < this.aClass84Array3.length; local338++) {
			if (this.aClass84Array3[local338] == null) {
				this.aClass224Array21[local338].aBoolean644 = false;
			} else {
				this.aClass84Array3[local338].method6813(local14, this.aClass224Array21[local338], Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 == this ? 1 : 0);
			}
		}
		if (this.aClass626_3 != null) {
			@Pc(615) Class207 local615 = this.aClass626_3.method32532();
			arg0.method20120(local615);
		}
		for (local338 = 0; local338 < this.aClass84Array3.length; local338++) {
			if (this.aClass84Array3[local338] != null) {
				this.aBoolean482 |= this.aClass84Array3[local338].method6809();
			}
			this.aClass84Array3[local338] = null;
		}
		this.anInt2878 = client.anInt3447 * 842490719;
		return local111;
	}

	@OriginalMember(owner = "client!apv", name = "fs", descriptor = "(Lclient!dx;I)V", line = 352)
	@Override
	void method24153(@OriginalArg(0) Class86 arg0) {
		if (this.aClass628_1 == null || !this.aBoolean483 && !this.method21172(arg0, 0)) {
			return;
		}
		@Pc(16) Class455 local16 = arg0.method20370();
		local16.method29391(this.method24085());
		local16.method29436(0.0F, -5.0F, 0.0F);
		this.method21077(arg0, this.aClass84Array3, local16, this.aBoolean483);
		for (@Pc(36) int local36 = 0; local36 < this.aClass84Array3.length; local36++) {
			this.aClass84Array3[local36] = null;
		}
	}

	@OriginalMember(owner = "client!apv", name = "fn", descriptor = "(Lclient!dx;)V", line = 352)
	@Override
	void method24156(@OriginalArg(0) Class86 arg0) {
		if (this.aClass628_1 == null || !this.aBoolean483 && !this.method21172(arg0, 0)) {
			return;
		}
		@Pc(16) Class455 local16 = arg0.method20370();
		local16.method29391(this.method24085());
		local16.method29436(0.0F, -5.0F, 0.0F);
		this.method21077(arg0, this.aClass84Array3, local16, this.aBoolean483);
		for (@Pc(36) int local36 = 0; local36 < this.aClass84Array3.length; local36++) {
			this.aClass84Array3[local36] = null;
		}
	}

	@OriginalMember(owner = "client!apv", name = "hq", descriptor = "(Lclient!dx;Lclient!ow;Lclient!dv;JJIJ)V", line = 364)
	void method21170(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) long arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6) {
		@Pc(7) long local7 = arg4 * arg4 + arg3 * arg3;
		if (local7 < 262144L || local7 > arg6) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.aClass503_7.method30242()) & 0x3FFF;
		@Pc(51) Class84 local51 = Class283.method26701(arg0, local33, this.anInt2883 * 1177236321, this.anInt2875 * -1556313745, this.anInt2876 * 956485751, arg5);
		if (local51 != null) {
			arg0.method20230(false);
			local51.method6813(arg1, null, 0);
			arg0.method20230(true);
		}
	}

	@OriginalMember(owner = "client!apv", name = "ib", descriptor = "(Lclient!dx;Lclient!ow;Lclient!dv;JJIJ)V", line = 364)
	void method21171(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) long arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6) {
		@Pc(7) long local7 = arg4 * arg4 + arg3 * arg3;
		if (local7 < 262144L || local7 > arg6) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.aClass503_7.method30242()) & 0x3FFF;
		@Pc(51) Class84 local51 = Class283.method26701(arg0, local33, this.anInt2883 * 1177236321, this.anInt2875 * -1556313745, this.anInt2876 * 956485751, arg5);
		if (local51 != null) {
			arg0.method20230(false);
			local51.method6813(arg1, null, 0);
			arg0.method20230(true);
		}
	}

	@OriginalMember(owner = "client!apv", name = "hr", descriptor = "(Lclient!dx;IB)Z", line = 376)
	boolean method21172(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg1;
		@Pc(5) Class570 local5 = this.method21105();
		@Pc(20) Class151 local20 = this.aClass151_3.method23396() && !this.aClass151_3.method23422() ? this.aClass151_3 : null;
		@Pc(39) Class151_Sub1 local39 = !this.aClass151_Sub1_3.method23396() || this.aBoolean485 || this.aClass151_Sub1_3.aBoolean363 && local20 != null ? null : this.aClass151_Sub1_3;
		@Pc(44) int local44 = local5.anInt5355 * 680391951;
		@Pc(49) int local49 = local5.anInt5368 * 1366655921;
		if (local44 != 0 || local49 != 0 || local5.anInt5376 * 2079472619 != 0 || local5.anInt5379 * -97068925 != 0) {
			arg1 |= 0x7;
		}
		@Pc(73) int local73 = this.aClass503_7.method30242();
		@Pc(93) boolean local93 = this.aByte76 != 0 && client.anInt3414 >= this.anInt2891 * 569195869 && client.anInt3414 < this.anInt2892 * -507783033;
		if (local93) {
			arg1 |= 0x80000;
		}
		@Pc(126) Class84 local126 = this.aClass84Array3[0] = this.aClass628_1.method32563(arg0, arg1, Class96_Sub23.aClass35_Sub15_1, Class333.aClass35_Sub14_1, Class578.aClass35_Sub3_1, Class537.aClass35_Sub7_1, Class55.aClass124_1, Class55.aClass124_1, local20, local39, this.aClass151_Sub3_Sub1Array3, this.anIntArray267, local73, true, Class636.aClass627_1);
		@Pc(129) int local129 = Class131.method23061();
		if (Class504.anInt3376 * 721369631 < 96 && local129 > 50) {
			Class88.method5492();
		}
		if (client.aClass661_1 != Class661.aClass661_5 && local129 < 50) {
			@Pc(149) int local149 = 50 - local129;
			while (local149 > client.anInt3393 * -65833181) {
				Class331.aByteArrayArray14[client.anInt3393 * -65833181] = new byte[102400];
				client.anInt3393 += -102403957;
			}
			while (local149 < client.anInt3393 * -65833181) {
				client.anInt3393 -= -102403957;
				Class331.aByteArrayArray14[client.anInt3393 * -65833181] = null;
			}
		} else if (Class661.aClass661_5 != client.aClass661_1) {
			Class331.aByteArrayArray14 = new byte[50][];
			client.anInt3393 = 0;
		}
		if (local126 == null) {
			return false;
		}
		this.anInt2870 = local126.method6824() * -4362271;
		this.anInt2901 = local126.method6828() * 2001645007;
		local126.method6821();
		this.method21100(local126);
		if (local44 == 0 && local49 == 0) {
			this.method21103(local73, this.method21095() << 9, this.method21095() << 9, 0, 0);
		} else {
			this.method21103(local73, local44, local49, local5.anInt5373 * 1532427929, local5.anInt5366 * 26013715);
			if (this.anInt2883 * 1177236321 != 0) {
				local126.method6799(this.anInt2883 * 1177236321);
			}
			if (this.anInt2875 * -1556313745 != 0) {
				local126.method6800(this.anInt2875 * -1556313745);
			}
			if (this.anInt2876 * 956485751 != 0) {
				local126.method6872(0, this.anInt2876 * 956485751, 0);
			}
		}
		if (local93) {
			local126.method6837(this.aByte73, this.aByte74, this.aByte75, this.aByte76 & 0xFF);
		}
		if (!this.aBoolean485) {
			this.method21102(arg0, local5, local1, local44, local49, local73);
		}
		return true;
	}

	@OriginalMember(owner = "client!apv", name = "if", descriptor = "(Lclient!dx;I)Z", line = 376)
	boolean method21173(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg1;
		@Pc(5) Class570 local5 = this.method21105();
		@Pc(20) Class151 local20 = this.aClass151_3.method23396() && !this.aClass151_3.method23422() ? this.aClass151_3 : null;
		@Pc(39) Class151_Sub1 local39 = !this.aClass151_Sub1_3.method23396() || this.aBoolean485 || this.aClass151_Sub1_3.aBoolean363 && local20 != null ? null : this.aClass151_Sub1_3;
		@Pc(44) int local44 = local5.anInt5355 * 680391951;
		@Pc(49) int local49 = local5.anInt5368 * 1366655921;
		if (local44 != 0 || local49 != 0 || local5.anInt5376 * 2079472619 != 0 || local5.anInt5379 * -97068925 != 0) {
			arg1 |= 0x7;
		}
		@Pc(73) int local73 = this.aClass503_7.method30242();
		@Pc(93) boolean local93 = this.aByte76 != 0 && client.anInt3414 >= this.anInt2891 * 569195869 && client.anInt3414 < this.anInt2892 * -507783033;
		if (local93) {
			arg1 |= 0x80000;
		}
		@Pc(126) Class84 local126 = this.aClass84Array3[0] = this.aClass628_1.method32563(arg0, arg1, Class96_Sub23.aClass35_Sub15_1, Class333.aClass35_Sub14_1, Class578.aClass35_Sub3_1, Class537.aClass35_Sub7_1, Class55.aClass124_1, Class55.aClass124_1, local20, local39, this.aClass151_Sub3_Sub1Array3, this.anIntArray267, local73, true, Class636.aClass627_1);
		@Pc(129) int local129 = Class131.method23061();
		if (Class504.anInt3376 * 721369631 < 96 && local129 > 50) {
			Class88.method5492();
		}
		if (client.aClass661_1 != Class661.aClass661_5 && local129 < 50) {
			@Pc(149) int local149 = 50 - local129;
			while (local149 > client.anInt3393 * -65833181) {
				Class331.aByteArrayArray14[client.anInt3393 * -65833181] = new byte[102400];
				client.anInt3393 += -102403957;
			}
			while (local149 < client.anInt3393 * -65833181) {
				client.anInt3393 -= -102403957;
				Class331.aByteArrayArray14[client.anInt3393 * -65833181] = null;
			}
		} else if (Class661.aClass661_5 != client.aClass661_1) {
			Class331.aByteArrayArray14 = new byte[50][];
			client.anInt3393 = 0;
		}
		if (local126 == null) {
			return false;
		}
		this.anInt2870 = local126.method6824() * -4362271;
		this.anInt2901 = local126.method6828() * 2001645007;
		local126.method6821();
		this.method21100(local126);
		if (local44 == 0 && local49 == 0) {
			this.method21103(local73, this.method21095() << 9, this.method21095() << 9, 0, 0);
		} else {
			this.method21103(local73, local44, local49, local5.anInt5373 * 1532427929, local5.anInt5366 * 26013715);
			if (this.anInt2883 * 1177236321 != 0) {
				local126.method6799(this.anInt2883 * 1177236321);
			}
			if (this.anInt2875 * -1556313745 != 0) {
				local126.method6800(this.anInt2875 * -1556313745);
			}
			if (this.anInt2876 * 956485751 != 0) {
				local126.method6872(0, this.anInt2876 * 956485751, 0);
			}
		}
		if (local93) {
			local126.method6837(this.aByte73, this.aByte74, this.aByte75, this.aByte76 & 0xFF);
		}
		if (!this.aBoolean485) {
			this.method21102(arg0, local5, local1, local44, local49, local73);
		}
		return true;
	}

	@OriginalMember(owner = "client!apv", name = "id", descriptor = "(Lclient!dx;I)Z", line = 376)
	boolean method21174(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg1;
		@Pc(5) Class570 local5 = this.method21105();
		@Pc(20) Class151 local20 = this.aClass151_3.method23396() && !this.aClass151_3.method23422() ? this.aClass151_3 : null;
		@Pc(39) Class151_Sub1 local39 = !this.aClass151_Sub1_3.method23396() || this.aBoolean485 || this.aClass151_Sub1_3.aBoolean363 && local20 != null ? null : this.aClass151_Sub1_3;
		@Pc(44) int local44 = local5.anInt5355 * 680391951;
		@Pc(49) int local49 = local5.anInt5368 * 1366655921;
		if (local44 != 0 || local49 != 0 || local5.anInt5376 * 2079472619 != 0 || local5.anInt5379 * -97068925 != 0) {
			arg1 |= 0x7;
		}
		@Pc(73) int local73 = this.aClass503_7.method30242();
		@Pc(93) boolean local93 = this.aByte76 != 0 && client.anInt3414 >= this.anInt2891 * 569195869 && client.anInt3414 < this.anInt2892 * -507783033;
		if (local93) {
			arg1 |= 0x80000;
		}
		@Pc(126) Class84 local126 = this.aClass84Array3[0] = this.aClass628_1.method32563(arg0, arg1, Class96_Sub23.aClass35_Sub15_1, Class333.aClass35_Sub14_1, Class578.aClass35_Sub3_1, Class537.aClass35_Sub7_1, Class55.aClass124_1, Class55.aClass124_1, local20, local39, this.aClass151_Sub3_Sub1Array3, this.anIntArray267, local73, true, Class636.aClass627_1);
		@Pc(129) int local129 = Class131.method23061();
		if (Class504.anInt3376 * 721369631 < 96 && local129 > 50) {
			Class88.method5492();
		}
		if (client.aClass661_1 != Class661.aClass661_5 && local129 < 50) {
			@Pc(149) int local149 = 50 - local129;
			while (local149 > client.anInt3393 * -65833181) {
				Class331.aByteArrayArray14[client.anInt3393 * -65833181] = new byte[102400];
				client.anInt3393 += -102403957;
			}
			while (local149 < client.anInt3393 * -65833181) {
				client.anInt3393 -= -102403957;
				Class331.aByteArrayArray14[client.anInt3393 * -65833181] = null;
			}
		} else if (Class661.aClass661_5 != client.aClass661_1) {
			Class331.aByteArrayArray14 = new byte[50][];
			client.anInt3393 = 0;
		}
		if (local126 == null) {
			return false;
		}
		this.anInt2870 = local126.method6824() * -4362271;
		this.anInt2901 = local126.method6828() * 2001645007;
		local126.method6821();
		this.method21100(local126);
		if (local44 == 0 && local49 == 0) {
			this.method21103(local73, this.method21095() << 9, this.method21095() << 9, 0, 0);
		} else {
			this.method21103(local73, local44, local49, local5.anInt5373 * 1532427929, local5.anInt5366 * 26013715);
			if (this.anInt2883 * 1177236321 != 0) {
				local126.method6799(this.anInt2883 * 1177236321);
			}
			if (this.anInt2875 * -1556313745 != 0) {
				local126.method6800(this.anInt2875 * -1556313745);
			}
			if (this.anInt2876 * 956485751 != 0) {
				local126.method6872(0, this.anInt2876 * 956485751, 0);
			}
		}
		if (local93) {
			local126.method6837(this.aByte73, this.aByte74, this.aByte75, this.aByte76 & 0xFF);
		}
		if (!this.aBoolean485) {
			this.method21102(arg0, local5, local1, local44, local49, local73);
		}
		return true;
	}

	@OriginalMember(owner = "client!apv", name = "ip", descriptor = "(Z)Ljava/lang/String;", line = 422)
	public String method21175(@OriginalArg(0) boolean arg0) {
		@Pc(1) String local1 = "";
		if (this.aString83 != null) {
			local1 = this.aString83;
		}
		if (arg0) {
			local1 = local1 + this.aString85;
		} else {
			local1 = local1 + this.aString82;
		}
		if (this.aString84 != null) {
			local1 = local1 + this.aString84;
		}
		return local1;
	}

	@OriginalMember(owner = "client!apv", name = "hj", descriptor = "(ZI)Ljava/lang/String;", line = 422)
	public String method21176(@OriginalArg(0) boolean arg0) {
		@Pc(1) String local1 = "";
		if (this.aString83 != null) {
			local1 = this.aString83;
		}
		if (arg0) {
			local1 = local1 + this.aString85;
		} else {
			local1 = local1 + this.aString82;
		}
		if (this.aString84 != null) {
			local1 = local1 + this.aString84;
		}
		return local1;
	}

	@OriginalMember(owner = "client!apv", name = "ii", descriptor = "(Z)Ljava/lang/String;", line = 422)
	public String method21177(@OriginalArg(0) boolean arg0) {
		@Pc(1) String local1 = "";
		if (this.aString83 != null) {
			local1 = this.aString83;
		}
		if (arg0) {
			local1 = local1 + this.aString85;
		} else {
			local1 = local1 + this.aString82;
		}
		if (this.aString84 != null) {
			local1 = local1 + this.aString84;
		}
		return local1;
	}

	@OriginalMember(owner = "client!apv", name = "iw", descriptor = "(Z)Ljava/lang/String;", line = 422)
	public String method21178(@OriginalArg(0) boolean arg0) {
		@Pc(1) String local1 = "";
		if (this.aString83 != null) {
			local1 = this.aString83;
		}
		if (arg0) {
			local1 = local1 + this.aString85;
		} else {
			local1 = local1 + this.aString82;
		}
		if (this.aString84 != null) {
			local1 = local1 + this.aString84;
		}
		return local1;
	}

	@OriginalMember(owner = "client!apv", name = "it", descriptor = "(Z)Ljava/lang/String;", line = 431)
	public String method21179(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.aString85 : this.aString82;
	}

	@OriginalMember(owner = "client!apv", name = "in", descriptor = "(Z)Ljava/lang/String;", line = 431)
	public String method21180(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.aString85 : this.aString82;
	}

	@OriginalMember(owner = "client!apv", name = "hh", descriptor = "(ZI)Ljava/lang/String;", line = 431)
	public String method21181(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.aString85 : this.aString82;
	}

	@OriginalMember(owner = "client!apv", name = "hb", descriptor = "(IIBB)V", line = 436)
	public final void method21182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aClass151_3.method23396() && this.aClass151_3.method23398().anInt3769 * -492433165 == 1) {
			this.anIntArray272 = null;
			this.aClass151_3.method23401(-1);
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass535Array3.length; local23++) {
			if (this.aClass535Array3[local23].anInt5185 * -1183861629 != -1) {
				@Pc(49) Class679 local49 = (Class679) Class482.aClass35_Sub4_1.method18319(this.aClass535Array3[local23].anInt5185 * -1183861629);
				if (local49.aBoolean860 && local49.anInt5810 * -811043807 != -1 && ((Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local49.anInt5810 * -811043807)).anInt3769 * -492433165 == 1) {
					this.aClass535Array3[local23].aClass151_9.method23401(-1);
					this.aClass535Array3[local23].anInt5185 = -496843307;
				}
			}
		}
		this.anInt2910 = 1021477997;
		if (arg0 < 0 || arg0 >= client.aClass517_1.method30411() || arg1 < 0 || arg1 >= client.aClass517_1.method30417()) {
			this.method21186(arg0, arg1);
		} else if (this.anIntArray274[0] >= 0 && this.anIntArray274[0] < client.aClass517_1.method30411() && this.anIntArray275[0] >= 0 && this.anIntArray275[0] < client.aClass517_1.method30417()) {
			this.method21188(arg0, arg1, arg2);
		} else {
			this.method21186(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!apv", name = "ig", descriptor = "(IIB)V", line = 436)
	public final void method21183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aClass151_3.method23396() && this.aClass151_3.method23398().anInt3769 * -492433165 == 1) {
			this.anIntArray272 = null;
			this.aClass151_3.method23401(-1);
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass535Array3.length; local23++) {
			if (this.aClass535Array3[local23].anInt5185 * -1183861629 != -1) {
				@Pc(49) Class679 local49 = (Class679) Class482.aClass35_Sub4_1.method18319(this.aClass535Array3[local23].anInt5185 * -1183861629);
				if (local49.aBoolean860 && local49.anInt5810 * -811043807 != -1 && ((Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local49.anInt5810 * -811043807)).anInt3769 * -492433165 == 1) {
					this.aClass535Array3[local23].aClass151_9.method23401(-1);
					this.aClass535Array3[local23].anInt5185 = -496843307;
				}
			}
		}
		this.anInt2910 = 1021477997;
		if (arg0 < 0 || arg0 >= client.aClass517_1.method30411() || arg1 < 0 || arg1 >= client.aClass517_1.method30417()) {
			this.method21186(arg0, arg1);
		} else if (this.anIntArray274[0] >= 0 && this.anIntArray274[0] < client.aClass517_1.method30411() && this.anIntArray275[0] >= 0 && this.anIntArray275[0] < client.aClass517_1.method30417()) {
			this.method21188(arg0, arg1, arg2);
		} else {
			this.method21186(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!apv", name = "ic", descriptor = "(IIB)V", line = 436)
	public final void method21184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aClass151_3.method23396() && this.aClass151_3.method23398().anInt3769 * -492433165 == 1) {
			this.anIntArray272 = null;
			this.aClass151_3.method23401(-1);
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass535Array3.length; local23++) {
			if (this.aClass535Array3[local23].anInt5185 * -1183861629 != -1) {
				@Pc(49) Class679 local49 = (Class679) Class482.aClass35_Sub4_1.method18319(this.aClass535Array3[local23].anInt5185 * -1183861629);
				if (local49.aBoolean860 && local49.anInt5810 * -811043807 != -1 && ((Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local49.anInt5810 * -811043807)).anInt3769 * -492433165 == 1) {
					this.aClass535Array3[local23].aClass151_9.method23401(-1);
					this.aClass535Array3[local23].anInt5185 = -496843307;
				}
			}
		}
		this.anInt2910 = 1021477997;
		if (arg0 < 0 || arg0 >= client.aClass517_1.method30411() || arg1 < 0 || arg1 >= client.aClass517_1.method30417()) {
			this.method21186(arg0, arg1);
		} else if (this.anIntArray274[0] >= 0 && this.anIntArray274[0] < client.aClass517_1.method30411() && this.anIntArray275[0] >= 0 && this.anIntArray275[0] < client.aClass517_1.method30417()) {
			this.method21188(arg0, arg1, arg2);
		} else {
			this.method21186(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!apv", name = "iy", descriptor = "(IIB)V", line = 436)
	public final void method21185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aClass151_3.method23396() && this.aClass151_3.method23398().anInt3769 * -492433165 == 1) {
			this.anIntArray272 = null;
			this.aClass151_3.method23401(-1);
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass535Array3.length; local23++) {
			if (this.aClass535Array3[local23].anInt5185 * -1183861629 != -1) {
				@Pc(49) Class679 local49 = (Class679) Class482.aClass35_Sub4_1.method18319(this.aClass535Array3[local23].anInt5185 * -1183861629);
				if (local49.aBoolean860 && local49.anInt5810 * -811043807 != -1 && ((Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local49.anInt5810 * -811043807)).anInt3769 * -492433165 == 1) {
					this.aClass535Array3[local23].aClass151_9.method23401(-1);
					this.aClass535Array3[local23].anInt5185 = -496843307;
				}
			}
		}
		this.anInt2910 = 1021477997;
		if (arg0 < 0 || arg0 >= client.aClass517_1.method30411() || arg1 < 0 || arg1 >= client.aClass517_1.method30417()) {
			this.method21186(arg0, arg1);
		} else if (this.anIntArray274[0] >= 0 && this.anIntArray274[0] < client.aClass517_1.method30411() && this.anIntArray275[0] >= 0 && this.anIntArray275[0] < client.aClass517_1.method30417()) {
			this.method21188(arg0, arg1, arg2);
		} else {
			this.method21186(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!apv", name = "hg", descriptor = "(III)V", line = 456)
	public void method21186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2900 = 0;
		this.anInt2877 = 0;
		this.anInt2882 = 0;
		this.anIntArray274[0] = arg0;
		this.anIntArray275[0] = arg1;
		@Pc(22) int local22 = this.method21095();
		@Pc(27) Class447 local27 = Class447.method29124(this.method24085().aClass447_61);
		local27.aFloat277 = local22 * 256 + this.anIntArray274[0] * 512;
		local27.aFloat278 = local22 * 256 + this.anIntArray275[0] * 512;
		this.method24102(local27);
		local27.method29130();
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 == this) {
			client.aClass517_1.method30443().method32293();
		}
		if (this.aClass626_3 != null) {
			this.aClass626_3.method32499();
		}
	}

	@OriginalMember(owner = "client!apv", name = "iu", descriptor = "(II)V", line = 456)
	public void method21187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2900 = 0;
		this.anInt2877 = 0;
		this.anInt2882 = 0;
		this.anIntArray274[0] = arg0;
		this.anIntArray275[0] = arg1;
		@Pc(22) int local22 = this.method21095();
		@Pc(27) Class447 local27 = Class447.method29124(this.method24085().aClass447_61);
		local27.aFloat277 = local22 * 256 + this.anIntArray274[0] * 512;
		local27.aFloat278 = local22 * 256 + this.anIntArray275[0] * 512;
		this.method24102(local27);
		local27.method29130();
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 == this) {
			client.aClass517_1.method30443().method32293();
		}
		if (this.aClass626_3 != null) {
			this.aClass626_3.method32499();
		}
	}

	@OriginalMember(owner = "client!apv", name = "hv", descriptor = "(IIBI)V", line = 472)
	final void method21188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.anInt2900 * -1763707177 < this.anIntArray274.length - 1) {
			this.anInt2900 += 990207207;
		}
		for (@Pc(20) int local20 = this.anInt2900 * -1763707177; local20 > 0; local20--) {
			this.anIntArray274[local20] = this.anIntArray274[local20 - 1];
			this.anIntArray275[local20] = this.anIntArray275[local20 - 1];
			this.aByteArray47[local20] = this.aByteArray47[local20 - 1];
		}
		this.anIntArray274[0] = arg0;
		this.anIntArray275[0] = arg1;
		this.aByteArray47[0] = arg2;
	}

	@OriginalMember(owner = "client!apv", name = "is", descriptor = "(IIB)V", line = 472)
	final void method21189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.anInt2900 * -1763707177 < this.anIntArray274.length - 1) {
			this.anInt2900 += 990207207;
		}
		for (@Pc(20) int local20 = this.anInt2900 * -1763707177; local20 > 0; local20--) {
			this.anIntArray274[local20] = this.anIntArray274[local20 - 1];
			this.anIntArray275[local20] = this.anIntArray275[local20 - 1];
			this.aByteArray47[local20] = this.aByteArray47[local20 - 1];
		}
		this.anIntArray274[0] = arg0;
		this.anIntArray275[0] = arg1;
		this.aByteArray47[0] = arg2;
	}

	@OriginalMember(owner = "client!apv", name = "ix", descriptor = "(IIB)V", line = 472)
	final void method21190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.anInt2900 * -1763707177 < this.anIntArray274.length - 1) {
			this.anInt2900 += 990207207;
		}
		for (@Pc(20) int local20 = this.anInt2900 * -1763707177; local20 > 0; local20--) {
			this.anIntArray274[local20] = this.anIntArray274[local20 - 1];
			this.anIntArray275[local20] = this.anIntArray275[local20 - 1];
			this.aByteArray47[local20] = this.aByteArray47[local20 - 1];
		}
		this.anIntArray274[0] = arg0;
		this.anIntArray275[0] = arg1;
		this.aByteArray47[0] = arg2;
	}

	@OriginalMember(owner = "client!apv", name = "hk", descriptor = "(I)Z", line = 484)
	public final boolean method21191() {
		return this.aClass628_1 != null;
	}

	@OriginalMember(owner = "client!apv", name = "iz", descriptor = "()Z", line = 484)
	public final boolean method21192() {
		return this.aClass628_1 != null;
	}

	@OriginalMember(owner = "client!apv", name = "ia", descriptor = "()Z", line = 484)
	public final boolean method21193() {
		return this.aClass628_1 != null;
	}

	@OriginalMember(owner = "client!apv", name = "ij", descriptor = "()Z", line = 484)
	public final boolean method21194() {
		return this.aClass628_1 != null;
	}

	@OriginalMember(owner = "client!apv", name = "bq", descriptor = "(B)I", line = 489)
	@Override
	public int method21095() {
		return this.aClass628_1 == null || this.aClass628_1.anInt5660 * 1568742735 == -1 ? super.method21095() : ((Class333) Class578.aClass35_Sub3_1.method18319(this.aClass628_1.anInt5660 * 1568742735)).anInt4117 * -1821838479;
	}

	@OriginalMember(owner = "client!apv", name = "fw", descriptor = "()I", line = 489)
	@Override
	public int method21096() {
		return this.aClass628_1 == null || this.aClass628_1.anInt5660 * 1568742735 == -1 ? super.method21095() : ((Class333) Class578.aClass35_Sub3_1.method18319(this.aClass628_1.anInt5660 * 1568742735)).anInt4117 * -1821838479;
	}

	@OriginalMember(owner = "client!apv", name = "fi", descriptor = "()I", line = 489)
	@Override
	public int method21097() {
		return this.aClass628_1 == null || this.aClass628_1.anInt5660 * 1568742735 == -1 ? super.method21095() : ((Class333) Class578.aClass35_Sub3_1.method18319(this.aClass628_1.anInt5660 * 1568742735)).anInt4117 * -1821838479;
	}

	@OriginalMember(owner = "client!apv", name = "cf", descriptor = "(B)I", line = 494)
	@Override
	int method21140() {
		return this.anInt2912 * -298812809;
	}

	@OriginalMember(owner = "client!apv", name = "eh", descriptor = "()I", line = 494)
	@Override
	int method21148() {
		return this.anInt2912 * -298812809;
	}

	@OriginalMember(owner = "client!apv", name = "ej", descriptor = "()I", line = 494)
	@Override
	int method21145() {
		return this.anInt2912 * -298812809;
	}

	@OriginalMember(owner = "client!apv", name = "eo", descriptor = "()I", line = 494)
	@Override
	int method21149() {
		return this.anInt2912 * -298812809;
	}

	@OriginalMember(owner = "client!apv", name = "ep", descriptor = "()I", line = 498)
	@Override
	public int method21147() {
		return -1;
	}

	@OriginalMember(owner = "client!apv", name = "cl", descriptor = "(B)I", line = 498)
	@Override
	public int method21156() {
		return -1;
	}

	@OriginalMember(owner = "client!apv", name = "fb", descriptor = "(Lclient!dx;IIB)Z", line = 502)
	@Override
	boolean method24137(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass628_1 == null || !this.method21172(arg0, 131072)) {
			return false;
		}
		@Pc(13) Class455 local13 = this.method24094();
		@Pc(15) boolean local15 = false;
		@Pc(17) int local17;
		for (local17 = 0; local17 < this.aClass84Array3.length; local17++) {
			if (this.aClass84Array3[local17] != null && this.aClass84Array3[local17].aBoolean152 && this.aClass84Array3[local17].method6818(arg1, arg2, local13, true, 0)) {
				local15 = true;
				break;
			}
		}
		for (local17 = 0; local17 < this.aClass84Array3.length; local17++) {
			this.aClass84Array3[local17] = null;
		}
		return local15;
	}

	@OriginalMember(owner = "client!apv", name = "fy", descriptor = "(Lclient!dx;II)Z", line = 502)
	@Override
	boolean method24165(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass628_1 == null || !this.method21172(arg0, 131072)) {
			return false;
		}
		@Pc(13) Class455 local13 = this.method24094();
		@Pc(15) boolean local15 = false;
		@Pc(17) int local17;
		for (local17 = 0; local17 < this.aClass84Array3.length; local17++) {
			if (this.aClass84Array3[local17] != null && this.aClass84Array3[local17].aBoolean152 && this.aClass84Array3[local17].method6818(arg1, arg2, local13, true, 0)) {
				local15 = true;
				break;
			}
		}
		for (local17 = 0; local17 < this.aClass84Array3.length; local17++) {
			this.aClass84Array3[local17] = null;
		}
		return local15;
	}

	@OriginalMember(owner = "client!apv", name = "fa", descriptor = "(Lclient!dx;II)Z", line = 502)
	@Override
	boolean method24158(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass628_1 == null || !this.method21172(arg0, 131072)) {
			return false;
		}
		@Pc(13) Class455 local13 = this.method24094();
		@Pc(15) boolean local15 = false;
		@Pc(17) int local17;
		for (local17 = 0; local17 < this.aClass84Array3.length; local17++) {
			if (this.aClass84Array3[local17] != null && this.aClass84Array3[local17].aBoolean152 && this.aClass84Array3[local17].method6818(arg1, arg2, local13, true, 0)) {
				local15 = true;
				break;
			}
		}
		for (local17 = 0; local17 < this.aClass84Array3.length; local17++) {
			this.aClass84Array3[local17] = null;
		}
		return local15;
	}

	@OriginalMember(owner = "client!apv", name = "fg", descriptor = "(Lclient!dx;II)Z", line = 502)
	@Override
	boolean method24163(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass628_1 == null || !this.method21172(arg0, 131072)) {
			return false;
		}
		@Pc(13) Class455 local13 = this.method24094();
		@Pc(15) boolean local15 = false;
		@Pc(17) int local17;
		for (local17 = 0; local17 < this.aClass84Array3.length; local17++) {
			if (this.aClass84Array3[local17] != null && this.aClass84Array3[local17].aBoolean152 && this.aClass84Array3[local17].method6818(arg1, arg2, local13, true, 0)) {
				local15 = true;
				break;
			}
		}
		for (local17 = 0; local17 < this.aClass84Array3.length; local17++) {
			this.aClass84Array3[local17] = null;
		}
		return local15;
	}

	@OriginalMember(owner = "client!apv", name = "fp", descriptor = "(Lclient!dx;II)Z", line = 502)
	@Override
	boolean method24159(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass628_1 == null || !this.method21172(arg0, 131072)) {
			return false;
		}
		@Pc(13) Class455 local13 = this.method24094();
		@Pc(15) boolean local15 = false;
		@Pc(17) int local17;
		for (local17 = 0; local17 < this.aClass84Array3.length; local17++) {
			if (this.aClass84Array3[local17] != null && this.aClass84Array3[local17].aBoolean152 && this.aClass84Array3[local17].method6818(arg1, arg2, local13, true, 0)) {
				local15 = true;
				break;
			}
		}
		for (local17 = 0; local17 < this.aClass84Array3.length; local17++) {
			this.aClass84Array3[local17] = null;
		}
		return local15;
	}

	@OriginalMember(owner = "client!apv", name = "fx", descriptor = "()Z", line = 519)
	@Override
	final boolean method24148() {
		return false;
	}

	@OriginalMember(owner = "client!apv", name = "fu", descriptor = "(B)Z", line = 519)
	@Override
	final boolean method24138() {
		return false;
	}

	@OriginalMember(owner = "client!apv", name = "fo", descriptor = "(Lclient!dx;Lclient!alc;IIIZI)V", line = 523)
	@Override
	final void method24141(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apv", name = "fr", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 523)
	@Override
	final void method24161(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apv", name = "fc", descriptor = "(Lclient!dx;Lclient!alc;IIIZ)V", line = 523)
	@Override
	final void method24166(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apv", name = "fd", descriptor = "(I)V", line = 527)
	@Override
	final void method24142() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apv", name = "gj", descriptor = "()V", line = 527)
	@Override
	final void method24150() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apv", name = "gr", descriptor = "()V", line = 527)
	@Override
	final void method24136() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apv", name = "gi", descriptor = "()V", line = 527)
	@Override
	final void method24164() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!apv", name = "ei", descriptor = "()Z", line = 531)
	@Override
	public boolean method21150() {
		return Class617.aClass629_1.aBoolean847;
	}

	@OriginalMember(owner = "client!apv", name = "en", descriptor = "()Z", line = 531)
	@Override
	public boolean method21153() {
		return Class617.aClass629_1.aBoolean847;
	}

	@OriginalMember(owner = "client!apv", name = "cw", descriptor = "(I)Z", line = 531)
	@Override
	public boolean method21142() {
		return Class617.aClass629_1.aBoolean847;
	}

	@OriginalMember(owner = "client!apv", name = "ed", descriptor = "()Z", line = 531)
	@Override
	public boolean method21151() {
		return Class617.aClass629_1.aBoolean847;
	}

	@OriginalMember(owner = "client!apv", name = "ee", descriptor = "()Z", line = 531)
	@Override
	public boolean method21152() {
		return Class617.aClass629_1.aBoolean847;
	}

	@OriginalMember(owner = "client!apv", name = "er", descriptor = "()Lclient!sf;", line = 535)
	@Override
	public Class532 method21154() {
		if (this.aClass532_3 != null) {
			if (this.aClass532_3.aString227 == null) {
				return null;
			}
			if (client.anInt3518 * -700159681 == 0 || client.anInt3518 * -700159681 == 3 || client.anInt3518 * -700159681 == 1 && Class38.method669(this.aString82)) {
				return this.aClass532_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!apv", name = "ex", descriptor = "()Lclient!sf;", line = 535)
	@Override
	public Class532 method21155() {
		if (this.aClass532_3 != null) {
			if (this.aClass532_3.aString227 == null) {
				return null;
			}
			if (client.anInt3518 * -700159681 == 0 || client.anInt3518 * -700159681 == 3 || client.anInt3518 * -700159681 == 1 && Class38.method669(this.aString82)) {
				return this.aClass532_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!apv", name = "ef", descriptor = "()Lclient!sf;", line = 535)
	@Override
	public Class532 method21141() {
		if (this.aClass532_3 != null) {
			if (this.aClass532_3.aString227 == null) {
				return null;
			}
			if (client.anInt3518 * -700159681 == 0 || client.anInt3518 * -700159681 == 3 || client.anInt3518 * -700159681 == 1 && Class38.method669(this.aString82)) {
				return this.aClass532_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!apv", name = "ck", descriptor = "(I)Lclient!sf;", line = 535)
	@Override
	public Class532 method21143() {
		if (this.aClass532_3 != null) {
			if (this.aClass532_3.aString227 == null) {
				return null;
			}
			if (client.anInt3518 * -700159681 == 0 || client.anInt3518 * -700159681 == 3 || client.anInt3518 * -700159681 == 1 && Class38.method669(this.aString82)) {
				return this.aClass532_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!apv", name = "hy", descriptor = "(Ljava/lang/String;III)V", line = 543)
	public void method21195(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method21114(arg0, arg1, arg2, Class475.method29690() * Class617.aClass629_1.anInt5678 * 2023048963);
	}

	@OriginalMember(owner = "client!apv", name = "ik", descriptor = "(Ljava/lang/String;II)V", line = 543)
	public void method21196(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method21114(arg0, arg1, arg2, Class475.method29690() * Class617.aClass629_1.anInt5678 * 2023048963);
	}

	@OriginalMember(owner = "client!apv", name = "ir", descriptor = "(Ljava/lang/String;II)V", line = 543)
	public void method21197(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method21114(arg0, arg1, arg2, Class475.method29690() * Class617.aClass629_1.anInt5678 * 2023048963);
	}

	@OriginalMember(owner = "client!apv", name = "im", descriptor = "(Ljava/lang/String;II)V", line = 543)
	public void method21198(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method21114(arg0, arg1, arg2, Class475.method29690() * Class617.aClass629_1.anInt5678 * 2023048963);
	}

	@OriginalMember(owner = "client!apv", name = "io", descriptor = "(Ljava/lang/String;II)V", line = 543)
	public void method21199(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method21114(arg0, arg1, arg2, Class475.method29690() * Class617.aClass629_1.anInt5678 * 2023048963);
	}

	@OriginalMember(owner = "client!apv", name = "il", descriptor = "(Ljava/lang/String;II)V", line = 543)
	public void method21200(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method21114(arg0, arg1, arg2, Class475.method29690() * Class617.aClass629_1.anInt5678 * 2023048963);
	}

	@OriginalMember(owner = "client!apv", name = "ih", descriptor = "(Ljava/lang/String;II)V", line = 543)
	public void method21201(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method21114(arg0, arg1, arg2, Class475.method29690() * Class617.aClass629_1.anInt5678 * 2023048963);
	}

	@OriginalMember(owner = "client!apv", name = "w", descriptor = "()Lclient!ik;", line = 547)
	@Override
	public Class324 method21054() {
		return Class324.aClass324_1;
	}

	@OriginalMember(owner = "client!apv", name = "p", descriptor = "(I)Lclient!ik;", line = 547)
	@Override
	public Class324 method21053() {
		return Class324.aClass324_1;
	}

	@OriginalMember(owner = "client!apv", name = "q", descriptor = "()Lclient!ik;", line = 547)
	@Override
	public Class324 method21058() {
		return Class324.aClass324_1;
	}

	@OriginalMember(owner = "client!apv", name = "x", descriptor = "()Lclient!ik;", line = 547)
	@Override
	public Class324 method21062() {
		return Class324.aClass324_1;
	}

	@OriginalMember(owner = "client!apv", name = "t", descriptor = "()Lclient!ik;", line = 547)
	@Override
	public Class324 method21056() {
		return Class324.aClass324_1;
	}

	@OriginalMember(owner = "client!apv", name = "d", descriptor = "()I", line = 551)
	@Override
	public int method21057() {
		return this.anInt2867 * 1126388985;
	}

	@OriginalMember(owner = "client!apv", name = "c", descriptor = "(B)I", line = 551)
	@Override
	public int method21050() {
		return this.anInt2867 * 1126388985;
	}

	@OriginalMember(owner = "client!apv", name = "s", descriptor = "()I", line = 551)
	@Override
	public int method21049() {
		return this.anInt2867 * 1126388985;
	}

	@OriginalMember(owner = "client!apv", name = "r", descriptor = "()I", line = 551)
	@Override
	public int method21060() {
		return this.anInt2867 * 1126388985;
	}

	@OriginalMember(owner = "client!apv", name = "v", descriptor = "(I)Lclient!aks;", line = 555)
	@Override
	public Class77_Sub36 method21051() {
		@Pc(3) Class595 local3 = client.aClass517_1.method30409();
		return Class77_Sub33.method14159(this.aByte100, (int) this.method24085().aClass447_61.aFloat277 + local3.anInt5504 * 1852947968, -((int) this.method24085().aClass447_61.aFloat276), (int) this.method24085().aClass447_61.aFloat278 + local3.anInt5506 * -139729408);
	}

	@OriginalMember(owner = "client!apv", name = "g", descriptor = "()Lclient!aks;", line = 555)
	@Override
	public Class77_Sub36 method21061() {
		@Pc(3) Class595 local3 = client.aClass517_1.method30409();
		return Class77_Sub33.method14159(this.aByte100, (int) this.method24085().aClass447_61.aFloat277 + local3.anInt5504 * 1852947968, -((int) this.method24085().aClass447_61.aFloat276), (int) this.method24085().aClass447_61.aFloat278 + local3.anInt5506 * -139729408);
	}

	@OriginalMember(owner = "client!apv", name = "z", descriptor = "()Lclient!aks;", line = 555)
	@Override
	public Class77_Sub36 method21065() {
		@Pc(3) Class595 local3 = client.aClass517_1.method30409();
		return Class77_Sub33.method14159(this.aByte100, (int) this.method24085().aClass447_61.aFloat277 + local3.anInt5504 * 1852947968, -((int) this.method24085().aClass447_61.aFloat276), (int) this.method24085().aClass447_61.aFloat278 + local3.anInt5506 * -139729408);
	}

	@OriginalMember(owner = "client!apv", name = "j", descriptor = "()Lclient!aks;", line = 555)
	@Override
	public Class77_Sub36 method21063() {
		@Pc(3) Class595 local3 = client.aClass517_1.method30409();
		return Class77_Sub33.method14159(this.aByte100, (int) this.method24085().aClass447_61.aFloat277 + local3.anInt5504 * 1852947968, -((int) this.method24085().aClass447_61.aFloat276), (int) this.method24085().aClass447_61.aFloat278 + local3.anInt5506 * -139729408);
	}

	@OriginalMember(owner = "client!apv", name = "i", descriptor = "()Lclient!aks;", line = 555)
	@Override
	public Class77_Sub36 method21064() {
		@Pc(3) Class595 local3 = client.aClass517_1.method30409();
		return Class77_Sub33.method14159(this.aByte100, (int) this.method24085().aClass447_61.aFloat277 + local3.anInt5504 * 1852947968, -((int) this.method24085().aClass447_61.aFloat276), (int) this.method24085().aClass447_61.aFloat278 + local3.anInt5506 * -139729408);
	}

	@OriginalMember(owner = "client!apv", name = "u", descriptor = "()Lclient!ot;", line = 560)
	@Override
	public Class452 method21066() {
		@Pc(1) Class452 local1 = Class452.method29269();
		local1.method29295(Class436.method28911(this.aClass503_7.anInt5069 * 949937137), 0.0F, 0.0F);
		return local1;
	}

	@OriginalMember(owner = "client!apv", name = "l", descriptor = "(I)Lclient!ot;", line = 560)
	@Override
	public Class452 method21052() {
		@Pc(1) Class452 local1 = Class452.method29269();
		local1.method29295(Class436.method28911(this.aClass503_7.anInt5069 * 949937137), 0.0F, 0.0F);
		return local1;
	}

	@OriginalMember(owner = "client!apv", name = "k", descriptor = "()Lclient!ot;", line = 560)
	@Override
	public Class452 method21067() {
		@Pc(1) Class452 local1 = Class452.method29269();
		local1.method29295(Class436.method28911(this.aClass503_7.anInt5069 * 949937137), 0.0F, 0.0F);
		return local1;
	}

	@OriginalMember(owner = "client!apv", name = "e", descriptor = "()Lclient!ot;", line = 560)
	@Override
	public Class452 method21059() {
		@Pc(1) Class452 local1 = Class452.method29269();
		local1.method29295(Class436.method28911(this.aClass503_7.anInt5069 * 949937137), 0.0F, 0.0F);
		return local1;
	}

	@OriginalMember(owner = "client!apv", name = "y", descriptor = "(I)Lclient!oo;", line = 566)
	@Override
	public Class447 method21055() {
		return Class447.method29119();
	}

	@OriginalMember(owner = "client!apv", name = "f", descriptor = "()Lclient!oo;", line = 566)
	@Override
	public Class447 method21068() {
		return Class447.method29119();
	}

	@OriginalMember(owner = "client!apv", name = "cv", descriptor = "(B)I", line = 570)
	@Override
	public int method21144() {
		return -(this.anInt2867 * 1126388985) - 1;
	}

	@OriginalMember(owner = "client!apv", name = "ek", descriptor = "()I", line = 570)
	@Override
	public int method21157() {
		return -(this.anInt2867 * 1126388985) - 1;
	}

	@OriginalMember(owner = "client!apv", name = "fv", descriptor = "()I", line = 570)
	@Override
	public int method21146() {
		return -(this.anInt2867 * 1126388985) - 1;
	}

	@OriginalMember(owner = "client!apv", name = "fq", descriptor = "()I", line = 570)
	@Override
	public int method21158() {
		return -(this.anInt2867 * 1126388985) - 1;
	}

	@OriginalMember(owner = "client!apv", name = "fm", descriptor = "()I", line = 570)
	@Override
	public int method21159() {
		return -(this.anInt2867 * 1126388985) - 1;
	}
}
