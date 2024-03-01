package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public abstract class Class34 implements Interface19 {

	@OriginalMember(owner = "client!ht", name = "x", descriptor = "J")
	long aLong100;

	@OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
	int anInt2352;

	@OriginalMember(owner = "client!ht", name = "l", descriptor = "Lclient!dw;")
	Class14 aClass14_7;

	@OriginalMember(owner = "client!ht", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_28;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "Lclient!ny;")
	final Class359 aClass359_27;

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "Lclient!kv;")
	final Class44 aClass44_5;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!ny;Lclient!ny;Lclient!kv;)V", line = 19)
	Class34(@OriginalArg(0) Class359 arg0, @OriginalArg(1) Class359 arg1, @OriginalArg(2) Class44 arg2) {
		this.aClass359_28 = arg0;
		this.aClass359_27 = arg1;
		this.aClass44_5 = arg2;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZI)V", line = 26)
	@Override
	public void method24606(@OriginalArg(0) boolean arg0) {
		@Pc(19) int local19 = this.aClass44_5.aClass277_8.method25394(this.aClass44_5.anInt2198 * 338285097, client.anInt3032 * 581921171) + this.aClass44_5.anInt2200 * 55371565;
		@Pc(39) int local39 = this.aClass44_5.aClass276_7.method25383(this.aClass44_5.anInt2199 * -1628722519, client.anInt3131 * -645382887) + this.aClass44_5.anInt2195 * 2009354057;
		this.method16487(arg0, local19, local39);
		this.method16488(arg0, local19, local39);
		@Pc(55) String local55 = Class5.aClass221_4.method24385();
		if (Class176.method23413() - this.aLong100 * -8209451533183591687L > 10000L) {
			local55 = local55 + " (" + Class5.aClass221_4.method24392().anInt3725 * 2076865137 + ")";
		}
		this.aClass14_7.method3282(local55, this.aClass44_5.anInt2198 * 338285097 / 2 + local19, this.aClass44_5.anInt2199 * -1628722519 / 2 + local39 + 4 + this.aClass44_5.anInt2196 * -1540009787, this.aClass44_5.anInt2201 * 328557495, -1);
	}

	@OriginalMember(owner = "client!ht", name = "l", descriptor = "(Z)V", line = 26)
	@Override
	public void method24605(@OriginalArg(0) boolean arg0) {
		@Pc(19) int local19 = this.aClass44_5.aClass277_8.method25394(this.aClass44_5.anInt2198 * 338285097, client.anInt3032 * 581921171) + this.aClass44_5.anInt2200 * 55371565;
		@Pc(39) int local39 = this.aClass44_5.aClass276_7.method25383(this.aClass44_5.anInt2199 * -1628722519, client.anInt3131 * -645382887) + this.aClass44_5.anInt2195 * 2009354057;
		this.method16487(arg0, local19, local39);
		this.method16488(arg0, local19, local39);
		@Pc(55) String local55 = Class5.aClass221_4.method24385();
		if (Class176.method23413() - this.aLong100 * -8209451533183591687L > 10000L) {
			local55 = local55 + " (" + Class5.aClass221_4.method24392().anInt3725 * 2076865137 + ")";
		}
		this.aClass14_7.method3282(local55, this.aClass44_5.anInt2198 * 338285097 / 2 + local19, this.aClass44_5.anInt2199 * -1628722519 / 2 + local39 + 4 + this.aClass44_5.anInt2196 * -1540009787, this.aClass44_5.anInt2201 * 328557495, -1);
	}

	@OriginalMember(owner = "client!ht", name = "p", descriptor = "(I)V", line = 36)
	@Override
	public void method24604() {
		@Pc(9) Class611 local9 = Class179.method23534(this.aClass359_27, this.aClass44_5.anInt2197 * 1924731995);
		this.aClass14_7 = Class613.aClass21_13.method17096(local9, (Class15_Sub1[]) Class137.method22939(this.aClass359_28, this.aClass44_5.anInt2197 * 1924731995), true);
	}

	@OriginalMember(owner = "client!ht", name = "h", descriptor = "()V", line = 36)
	@Override
	public void method24603() {
		@Pc(9) Class611 local9 = Class179.method23534(this.aClass359_27, this.aClass44_5.anInt2197 * 1924731995);
		this.aClass14_7 = Class613.aClass21_13.method17096(local9, (Class15_Sub1[]) Class137.method22939(this.aClass359_28, this.aClass44_5.anInt2197 * 1924731995), true);
	}

	@OriginalMember(owner = "client!ht", name = "x", descriptor = "()V", line = 36)
	@Override
	public void method24608() {
		@Pc(9) Class611 local9 = Class179.method23534(this.aClass359_27, this.aClass44_5.anInt2197 * 1924731995);
		this.aClass14_7 = Class613.aClass21_13.method17096(local9, (Class15_Sub1[]) Class137.method22939(this.aClass359_28, this.aClass44_5.anInt2197 * 1924731995), true);
	}

	@OriginalMember(owner = "client!ht", name = "s", descriptor = "()V", line = 36)
	@Override
	public void method24607() {
		@Pc(9) Class611 local9 = Class179.method23534(this.aClass359_27, this.aClass44_5.anInt2197 * 1924731995);
		this.aClass14_7 = Class613.aClass21_13.method17096(local9, (Class15_Sub1[]) Class137.method22939(this.aClass359_28, this.aClass44_5.anInt2197 * 1924731995), true);
	}

	@OriginalMember(owner = "client!ht", name = "u", descriptor = "()V", line = 36)
	@Override
	public void method24609() {
		@Pc(9) Class611 local9 = Class179.method23534(this.aClass359_27, this.aClass44_5.anInt2197 * 1924731995);
		this.aClass14_7 = Class613.aClass21_13.method17096(local9, (Class15_Sub1[]) Class137.method22939(this.aClass359_28, this.aClass44_5.anInt2197 * 1924731995), true);
	}

	@OriginalMember(owner = "client!ht", name = "y", descriptor = "()Z", line = 41)
	@Override
	public boolean method24610() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass359_28.method26674(this.aClass44_5.anInt2197 * 1924731995)) {
			local1 = false;
		}
		if (!this.aClass359_27.method26674(this.aClass44_5.anInt2197 * 1924731995)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "(I)Z", line = 41)
	@Override
	public boolean method24602() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass359_28.method26674(this.aClass44_5.anInt2197 * 1924731995)) {
			local1 = false;
		}
		if (!this.aClass359_27.method26674(this.aClass44_5.anInt2197 * 1924731995)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ht", name = "z", descriptor = "(B)I", line = 51)
	int method16489() {
		@Pc(3) int local3 = Class5.aClass221_4.method24391();
		@Pc(7) int local7 = local3 * 100;
		if (this.anInt2352 * -175710367 == local3 && local3 != 0) {
			@Pc(20) int local20 = Class5.aClass221_4.method24390();
			if (local20 > local3) {
				@Pc(32) long local32 = this.aLong100 * -8209451533183591687L - Class5.aClass221_4.method24394();
				if (local32 > 0L) {
					@Pc(48) long local48 = local32 * 10000L / (long) local3 * (long) (local20 - local3);
					@Pc(58) long local58 = (Class176.method23413() - this.aLong100 * -8209451533183591687L) * 10000L;
					if (local58 < local48) {
						local7 = (int) ((long) (local3 * 100) + (long) (local20 - local3) * local58 * 100L / local48);
					} else {
						local7 = local20 * 100;
					}
				}
			}
		} else {
			this.anInt2352 = local3 * -391117663;
			this.aLong100 = Class176.method23413() * 5321510391410673481L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "()I", line = 51)
	int method16493() {
		@Pc(3) int local3 = Class5.aClass221_4.method24391();
		@Pc(7) int local7 = local3 * 100;
		if (this.anInt2352 * -175710367 == local3 && local3 != 0) {
			@Pc(20) int local20 = Class5.aClass221_4.method24390();
			if (local20 > local3) {
				@Pc(32) long local32 = this.aLong100 * -8209451533183591687L - Class5.aClass221_4.method24394();
				if (local32 > 0L) {
					@Pc(48) long local48 = local32 * 10000L / (long) local3 * (long) (local20 - local3);
					@Pc(58) long local58 = (Class176.method23413() - this.aLong100 * -8209451533183591687L) * 10000L;
					if (local58 < local48) {
						local7 = (int) ((long) (local3 * 100) + (long) (local20 - local3) * local58 * 100L / local48);
					} else {
						local7 = local20 * 100;
					}
				}
			}
		} else {
			this.anInt2352 = local3 * -391117663;
			this.aLong100 = Class176.method23413() * 5321510391410673481L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ht", name = "as", descriptor = "(II)V", line = 153)
	public static void method16499(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(15, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V", line = 170)
	public static void method16494() {
		Class331.anInt4593 = 0;
		Class331.anInt4594 = 0;
	}

	@OriginalMember(owner = "client!ht", name = "hj", descriptor = "(IIIIZB)V", line = 4320)
	static final void method16497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (client.aClass370_1.method26950() == null) {
			Class613.aClass21_13.method17063(arg0, arg1, arg2, arg3, -16777216);
			return;
		}
		@Pc(16) Class320 local16 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
		@Pc(18) boolean local18 = false;
		if (client.anInt3065 * -1773414811 == 4) {
			if ((int) local16.aFloat259 < 0 || (int) local16.aFloat259 >= client.aClass370_1.method26943() * 512 || (int) local16.aFloat261 < 0 || (int) local16.aFloat261 >= client.aClass370_1.method27062() * 512) {
				local18 = true;
			}
			if (Class72.anInt2086 * 81180077 == 3 && !Class80.aClass23_Sub1_1.method5824()) {
				local18 = true;
			}
			if (local18 && ((int) local16.aFloat259 < 0 || (int) local16.aFloat259 >= client.aClass370_1.method26943() * 512 || (int) local16.aFloat261 > 0 || (int) local16.aFloat261 >= client.aClass370_1.method27062() * 512) && Class72.anInt2086 * 81180077 == 3 && Class200.method24151()) {
				Class80.aClass23_Sub1_1.method5798(true);
				Class30_Sub3.method7853(false);
			}
		} else if (!client.aBoolean582) {
			local18 = true;
		}
		if (local18) {
			Class613.aClass21_13.method17063(arg0, arg1, arg2, arg3, -16777216);
			return;
		}
		client.anInt3100 += 1611321595;
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 != null && (int) local16.aFloat259 - (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16630() - 1) * 256 >> 9 == Class2.anInt5 * 1749463705 && (int) local16.aFloat261 - (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16630() - 1) * 256 >> 9 == Class2.anInt2 * 818719855) {
			Class2.anInt5 = -2115862953;
			Class2.anInt2 = -383922831;
			Class410.method27677();
		}
		Class570.method33034();
		if (!arg4) {
			Class13_Sub4.method5625();
		}
		Class620.method33756();
		@Pc(178) int local178;
		for (local178 = 0; local178 < client.aClass398Array1.length; local178++) {
			if (client.aClass398Array1[local178] != null && !client.aClass398Array1[local178].method27531() && client.aClass398Array1[local178].method27532(Class613.aClass21_13)) {
				client.aClass398Array1[local178].method27540(client.aClass370_1.method26950());
			}
		}
		Class434.method27991(arg0, arg1, arg2, arg3, true);
		@Pc(220) int local220 = client.anInt3167 * -56286437;
		@Pc(224) int local224 = client.anInt3168 * -237460069;
		@Pc(228) int local228 = client.anInt3169 * -1579786087;
		@Pc(232) int local232 = client.anInt3047 * -1546836989;
		Class339.method26434(local220, local224);
		@Pc(283) int local283;
		if (Class72.anInt2086 * 81180077 == 5) {
			local178 = (int) client.aFloat237;
			if (client.anInt3090 * -1278643255 >> 8 > local178) {
				local178 = client.anInt3090 * -1278643255 >> 8;
			}
			if (client.aBooleanArray22[4] && client.anIntArray291[4] + 128 > local178) {
				local178 = client.anIntArray291[4] + 128;
			}
			local283 = client.anInt3079 * -872004161 + (int) client.aFloat238 & 0x3FFF;
			Class412.method27703(Class403.anInt4808 * 110680385, Class186.method23926((int) local16.aFloat259, (int) local16.aFloat261, Class141.anInt3427 * 1197232991) - client.anInt3089 * 1439269037, Class48.anInt1088 * 1640811813, local178, local283, (local178 >> 3) * 3 + 600 << 2, local232);
		} else if (Class72.anInt2086 * 81180077 == 4) {
			local178 = (int) client.aFloat237;
			if (client.anInt3090 * -1278643255 >> 8 > local178) {
				local178 = client.anInt3090 * -1278643255 >> 8;
			}
			if (client.aBooleanArray22[4] && client.anIntArray291[4] + 128 > local178) {
				local178 = client.anIntArray291[4] + 128;
			}
			local283 = (int) client.aFloat238 & 0x3FFF;
			Class412.method27703(Class403.anInt4808 * 110680385, Class186.method23926(client.anInt3085 * 1771104941, client.anInt3086 * 1828029883, Class141.anInt3427 * 1197232991) - client.anInt3089 * 1439269037, Class48.anInt1088 * 1640811813, local178, local283, (local178 >> 3) * 3 + 600 << 2, local232);
		} else if (Class72.anInt2086 * 81180077 == 6) {
			Class135.method22924(local232);
		}
		local178 = Class586.anInt5460 * -1129330577;
		local283 = Class140.anInt3424 * 1701665129;
		@Pc(418) int local418 = Class149.anInt3434 * -324079631;
		@Pc(422) int local422 = Class30.anInt2350 * 1495770999;
		@Pc(426) int local426 = Class3_Sub35_Sub1.anInt2644 * -446514573;
		@Pc(470) int local470;
		for (@Pc(428) int local428 = 0; local428 < 5; local428++) {
			if (client.aBooleanArray22[local428]) {
				local470 = (int) (Math.random() * (double) (client.anIntArray317[local428] * 2 + 1) - (double) client.anIntArray317[local428] + Math.sin((double) client.anIntArray318[local428] / 100.0D * (double) client.anIntArray319[local428]) * (double) client.anIntArray291[local428]);
				if (local428 == 0) {
					Class586.anInt5460 += (local470 << 2) * 1317181071;
				}
				if (local428 == 1) {
					Class140.anInt3424 += (local470 << 2) * -1930901799;
				}
				if (local428 == 2) {
					Class149.anInt3434 += (local470 << 2) * 1723080977;
				}
				if (local428 == 3) {
					Class3_Sub35_Sub1.anInt2644 = (Class3_Sub35_Sub1.anInt2644 * -446514573 + local470 & 0x3FFF) * 1729985211;
				}
				if (local428 == 4) {
					Class30.anInt2350 += local470 * 1250124359;
					if (Class30.anInt2350 * 1495770999 < 1024) {
						Class30.anInt2350 = 227089408;
					} else if (Class30.anInt2350 * 1495770999 > 3072) {
						Class30.anInt2350 = 681268224;
					}
				}
			}
		}
		if (Class586.anInt5460 * -1129330577 < 0) {
			Class586.anInt5460 = 0;
		}
		if (Class586.anInt5460 * -1129330577 > (client.aClass370_1.method26950().anInt4901 * 406964363 << 9) - 1) {
			Class586.anInt5460 = ((client.aClass370_1.method26950().anInt4901 * 406964363 << 9) - 1) * 1317181071;
		}
		if (Class149.anInt3434 * -324079631 < 0) {
			Class149.anInt3434 = 0;
		}
		if (Class149.anInt3434 * -324079631 > (client.aClass370_1.method26950().anInt4902 * 2009656297 << 9) - 1) {
			Class149.anInt3434 = ((client.aClass370_1.method26950().anInt4902 * 2009656297 << 9) - 1) * 1723080977;
		}
		Class180.method23542();
		Class613.aClass21_13.method17054(local220, local224, local228, local232);
		Class613.aClass21_13.method17059(true);
		Class613.aClass21_13.method17079(local220, local224, local228 + local220, local224 + local232);
		@Pc(635) Class480 local635 = client.aClass370_1.method26953().method28870();
		local470 = local635.method28940();
		@Pc(643) Class210 local643 = new Class210();
		@Pc(647) Class464 local647 = client.aClass370_1.method26942();
		if (Class150.method23135()) {
			Class402.aClass23_Sub1_2.method5920(local643, client.aClass332_51, client.aClass328_96, local647.anInt5071 * -1567811631 << 9, local647.anInt5073 * 1360175441 << 9);
		} else if (Class72.anInt2086 * 81180077 == 3) {
			Class80.aClass23_Sub1_1.method5920(local643, client.aClass332_51, client.aClass328_96, local647.anInt5071 * -1567811631 << 9, local647.anInt5073 * 1360175441 << 9);
		} else {
			client.aClass332_51.method26201((float) -(Class586.anInt5460 * -1129330577), (float) -(Class140.anInt3424 * 1701665129), (float) -(Class149.anInt3434 * -324079631));
			client.aClass332_51.method26198(0.0F, -1.0F, 0.0F, Class317.method25842(-(Class3_Sub35_Sub1.anInt2644 * -446514573) & 0x3FFF));
			client.aClass332_51.method26198(-1.0F, 0.0F, 0.0F, Class317.method25842(-(Class30.anInt2350 * 1495770999) & 0x3FFF));
			client.aClass332_51.method26198(0.0F, 0.0F, -1.0F, Class317.method25842(-(Class150.anInt3437 * 108174769) & 0x3FFF));
			Class11_Sub1.method818(client.aClass328_96, (float) (local228 / 2), (float) (local232 / 2), (float) (client.anInt3171 * -845991465 << 1), (float) (client.anInt3171 * -845991465 << 1), local228, local232);
		}
		Class613.aClass21_13.method17106(client.aClass332_51);
		Class613.aClass21_13.method17322(client.aClass328_96);
		if (local635.method28941() == null) {
			Class613.aClass21_13.method17061(3, local470);
		} else {
			Class613.aClass21_13.method17111(1.0F);
			Class613.aClass21_13.method17132(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
			if (Class72.anInt2086 * 81180077 == 3) {
				@Pc(806) int local806 = (int) ((double) Class80.aClass23_Sub1_1.method5835() * 2607.5945876176133D);
				@Pc(814) int local814 = (int) ((double) Class80.aClass23_Sub1_1.method5836() * 2607.5945876176133D);
				local635.method28941().method27456(Class613.aClass21_13, Class135.anInt3399 * -612721 << 3, local220, local224, local228, local232, local806, local814, 0, local470, true, false);
			} else {
				local635.method28941().method27456(Class613.aClass21_13, Class135.anInt3399 * -612721 << 3, local220, local224, local228, local232, Class30.anInt2350 * 1495770999, Class3_Sub35_Sub1.anInt2644 * -446514573, Class150.anInt3437 * 108174769, local470, true, false);
			}
			Class613.aClass21_13.method17028();
		}
		Class613.aClass21_13.method17059(false);
		Class501.method29455(client.aClass332_51, client.aClass328_96, local228, local232);
		client.aClass370_1.method26953().method28896(client.aClass370_1);
		@Pc(898) byte local898 = Class510.aClass3_Sub45_37.aClass60_Sub21_2.method13688() == 2 ? (byte) (client.anInt3100 * -630801869) : 1;
		if (Class150.method23135() || Class72.anInt2086 * 81180077 == 3) {
			client.aClass370_1.method26950().method28174(client.anInt3034, local643.anInt3702 * 2136972833, local643.anInt3700 * 1720809095, local643.anInt3701 * -810103147, client.aClass370_1.method26957(), client.anIntArray304, client.anIntArray305, client.anIntArray296, client.anIntArray306, client.anIntArray307, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 + 1, local898, (int) local16.aFloat259 >> 9, (int) local16.aFloat261 >> 9, Class510.aClass3_Sub45_37.aClass60_Sub4_1.method12894() == 0, true, 0, true);
		} else {
			client.aClass370_1.method26950().method28174(client.anInt3034, Class586.anInt5460 * -1129330577, Class140.anInt3424 * 1701665129, Class149.anInt3434 * -324079631, client.aClass370_1.method26957(), client.anIntArray304, client.anIntArray305, client.anIntArray296, client.anIntArray306, client.anIntArray307, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 + 1, local898, (int) local16.aFloat259 >> 9, (int) local16.aFloat261 >> 9, Class510.aClass3_Sub45_37.aClass60_Sub4_1.method12894() == 0, true, 0, true);
		}
		client.anInt3045 += -1165731975;
		if (!Class613.aClass21_13.method17123() && client.anInt3039 * 1115111877 == 5) {
			Class422.method27876(local220, local224, local228, local232);
		}
		client.aClass370_1.method26950().method28056();
		Class586.anInt5460 = local178 * 1317181071;
		Class140.anInt3424 = local283 * -1930901799;
		Class149.anInt3434 = local418 * 1723080977;
		Class30.anInt2350 = local422 * 1250124359;
		Class3_Sub35_Sub1.anInt2644 = local426 * 1729985211;
		if (client.aBoolean572 && Class117.aClass51_2.method9835() == 0) {
			client.aBoolean572 = false;
		}
		if (client.aBoolean572) {
			Class613.aClass21_13.method17063(local220, local224, local228, local232, -16777216);
			Class250.method25081(Class601.aClass601_152.method33512(Class469.aClass530_2), false, Class613.aClass21_13, Class454.aClass14_12, Class222.aClass611_7);
		}
		Class11_Sub1.method818(client.aClass328_96, (float) (local228 / 2 + local220), (float) (local224 + local232 / 2), (float) (client.anInt3171 * -845991465 << 1), (float) (client.anInt3171 * -845991465 << 1), local228, local232);
		Class613.aClass21_13.method17322(client.aClass328_96);
		Class19_Sub2.method21426(client.aClass328_96);
	}

	@OriginalMember(owner = "client!ht", name = "id", descriptor = "(II)V", line = 4547)
	static final void method16498(@OriginalArg(0) int arg0) {
		client.anIntArray304 = new int[arg0];
		client.anIntArray305 = new int[arg0];
		client.anIntArray296 = new int[arg0];
		client.anIntArray306 = new int[arg0];
		client.anIntArray307 = new int[arg0];
	}

	@OriginalMember(owner = "client!ht", name = "jc", descriptor = "(Lclient!vs;I)V", line = 5701)
	static final void method16495(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class13_Sub5.method5646(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ht", name = "agj", descriptor = "(Lclient!vs;B)V", line = 10038)
	static final void method16496(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class58_Sub1.anInt1434 * 1235407417 == 100 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ht", name = "n", descriptor = "(ZII)V")
	abstract void method16486(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(ZIII)V")
	abstract void method16487(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(ZIIS)V")
	abstract void method16488(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "(ZII)V")
	abstract void method16490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "(ZII)V")
	abstract void method16491(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ht", name = "r", descriptor = "(ZII)V")
	abstract void method16492(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
