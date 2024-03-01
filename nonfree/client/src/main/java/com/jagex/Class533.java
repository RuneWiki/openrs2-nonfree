package com.jagex;

import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public class Class533 {

	@OriginalMember(owner = "client!vo", name = "bs", descriptor = "Lclient!co;")
	public static Class6 aClass6_35;

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "Lclient!sr;")
	final Class464 aClass464_3;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
	final int anInt5312;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!sr;I)V", line = 13)
	public Class533(@OriginalArg(0) Class464 arg0, @OriginalArg(1) int arg1) {
		this.aClass464_3 = arg0;
		this.anInt5312 = arg1 * 1863711991;
	}

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "()Lclient!aow;", line = 19)
	public Class26_Sub1_Sub5_Sub1 method32504() {
		@Pc(25) Class3_Sub13 local25 = (Class3_Sub13) client.aClass581_19.method33217((long) (this.aClass464_3.anInt5072 * 324147675 << 28 | this.aClass464_3.anInt5073 * 1360175441 << 14 | this.aClass464_3.anInt5071 * -1567811631));
		if (local25 == null) {
			return null;
		}
		@Pc(34) Class464 local34 = client.aClass370_1.method26942();
		@Pc(45) int local45 = this.aClass464_3.anInt5071 * -1567811631 - local34.anInt5071 * -1567811631;
		@Pc(56) int local56 = this.aClass464_3.anInt5073 * 1360175441 - local34.anInt5073 * 1360175441;
		if (local45 >= 0 && local56 >= 0 && local45 < client.aClass370_1.method26943() && local56 < client.aClass370_1.method27062() && client.aClass370_1.method26950() != null) {
			for (@Pc(80) Class3_Sub4 local80 = (Class3_Sub4) local25.aClass553_17.method32768(); local80 != null; local80 = (Class3_Sub4) local25.aClass553_17.method32709()) {
				if (local80.anInt1163 * 212444761 == this.anInt5312 * 722437319) {
					return (Class26_Sub1_Sub5_Sub1) client.aClass370_1.method26950().method28050(this.aClass464_3.anInt5072 * 324147675, local45, local56);
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "()Lclient!aow;", line = 19)
	public Class26_Sub1_Sub5_Sub1 method32505() {
		@Pc(25) Class3_Sub13 local25 = (Class3_Sub13) client.aClass581_19.method33217((long) (this.aClass464_3.anInt5072 * 324147675 << 28 | this.aClass464_3.anInt5073 * 1360175441 << 14 | this.aClass464_3.anInt5071 * -1567811631));
		if (local25 == null) {
			return null;
		}
		@Pc(34) Class464 local34 = client.aClass370_1.method26942();
		@Pc(45) int local45 = this.aClass464_3.anInt5071 * -1567811631 - local34.anInt5071 * -1567811631;
		@Pc(56) int local56 = this.aClass464_3.anInt5073 * 1360175441 - local34.anInt5073 * 1360175441;
		if (local45 >= 0 && local56 >= 0 && local45 < client.aClass370_1.method26943() && local56 < client.aClass370_1.method27062() && client.aClass370_1.method26950() != null) {
			for (@Pc(80) Class3_Sub4 local80 = (Class3_Sub4) local25.aClass553_17.method32768(); local80 != null; local80 = (Class3_Sub4) local25.aClass553_17.method32709()) {
				if (local80.anInt1163 * 212444761 == this.anInt5312 * 722437319) {
					return (Class26_Sub1_Sub5_Sub1) client.aClass370_1.method26950().method28050(this.aClass464_3.anInt5072 * 324147675, local45, local56);
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "(I)Lclient!aow;", line = 19)
	public Class26_Sub1_Sub5_Sub1 method32506() {
		@Pc(25) Class3_Sub13 local25 = (Class3_Sub13) client.aClass581_19.method33217((long) (this.aClass464_3.anInt5072 * 324147675 << 28 | this.aClass464_3.anInt5073 * 1360175441 << 14 | this.aClass464_3.anInt5071 * -1567811631));
		if (local25 == null) {
			return null;
		}
		@Pc(34) Class464 local34 = client.aClass370_1.method26942();
		@Pc(45) int local45 = this.aClass464_3.anInt5071 * -1567811631 - local34.anInt5071 * -1567811631;
		@Pc(56) int local56 = this.aClass464_3.anInt5073 * 1360175441 - local34.anInt5073 * 1360175441;
		if (local45 >= 0 && local56 >= 0 && local45 < client.aClass370_1.method26943() && local56 < client.aClass370_1.method27062() && client.aClass370_1.method26950() != null) {
			for (@Pc(80) Class3_Sub4 local80 = (Class3_Sub4) local25.aClass553_17.method32768(); local80 != null; local80 = (Class3_Sub4) local25.aClass553_17.method32709()) {
				if (local80.anInt1163 * 212444761 == this.anInt5312 * 722437319) {
					return (Class26_Sub1_Sub5_Sub1) client.aClass370_1.method26950().method28050(this.aClass464_3.anInt5072 * 324147675, local45, local56);
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "(Lclient!de;Lclient!fo;I)V", line = 20)
	static void method32508(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class178 arg1) {
		@Pc(37) boolean local37 = Class44_Sub3.aClass596_1.method33436(arg0, arg1.anInt3559 * 1976441867, arg1.anInt3563 * -1429853457, arg1.anInt3532 * 1688841995, -846603747 * arg1.anInt3511 | 0xFF000000, arg1.anInt3501 * -58397333, arg1.aBoolean642 ? Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1 : null) == null;
		if (local37) {
			Class232.aClass553_49.method32702(new Class3_Sub3(arg1.anInt3559 * 1976441867, arg1.anInt3563 * -1429853457, arg1.anInt3532 * 1688841995, arg1.anInt3511 * -846603747 | 0xFF000000, arg1.anInt3501 * -58397333, arg1.aBoolean642));
			Class223.method24442(arg1);
		}
	}

	@OriginalMember(owner = "client!vo", name = "s", descriptor = "(Lclient!ags;Lclient!ags;B)V", line = 38)
	public static void method32507(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class3_Sub1 arg1) {
		if (arg0.aClass3_Sub1_67 != null) {
			arg0.method33669();
		}
		arg0.aClass3_Sub1_67 = arg1;
		arg0.aClass3_Sub1_66 = arg1.aClass3_Sub1_66;
		arg0.aClass3_Sub1_67.aClass3_Sub1_66 = arg0;
		arg0.aClass3_Sub1_66.aClass3_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!vo", name = "t", descriptor = "(I)V", line = 275)
	static final void method32510() {
		if (Class190.anInt3648 * -1033304397 == 1 || Class190.anInt3648 * -1033304397 == 102) {
			return;
		}
		try {
			@Pc(21) short local21;
			if (Class190.anInt3638 * -965138061 == 0 && Class190.anInt3648 * -1033304397 < 95) {
				local21 = 500;
			} else {
				local21 = 2000;
			}
			if (Class190.aBoolean659 && Class190.anInt3648 * -1033304397 >= 64) {
				local21 = 6000;
			}
			if (Class190.anInt3670 * 1734568685 == 240 && Class190.anInt3648 * -1033304397 != 218 && Class190.anInt3671 * -780345315 != 42 || Class190.anInt3670 * 1734568685 == 166 && Class190.anInt3669 * 1840232743 != 49 && Class190.anInt3669 * 1840232743 != 52) {
				Class190.anInt3667 += -1667366607;
			}
			if (Class190.anInt3667 * 819443665 > local21) {
				Class615.aClass82_3.method21604();
				if (Class190.anInt3638 * -965138061 >= 3) {
					Class190.anInt3648 = -1846339461;
					Class43.method9493(-5);
					Class555.method32796();
					return;
				}
				if (Class190.anInt3670 * 1734568685 == 240) {
					FileFilter_Sub1.aClass585_1.method33273();
				} else {
					Class570.aClass585_5.method33273();
				}
				Class190.anInt3667 = 0;
				Class190.anInt3638 += 1390158779;
				Class190.anInt3648 = -1925288139;
			}
			@Pc(148) Class3_Sub23 local148;
			@Pc(169) int local169;
			@Pc(226) int local226;
			if (Class190.anInt3648 * -1033304397 == 15) {
				if (Class190.anInt3670 * 1734568685 == 240) {
					Class615.aClass82_3.method21606(Class49.method9255(FileFilter_Sub1.aClass585_1.method33272(), 15000), FileFilter_Sub1.aClass585_1.aString242);
				} else {
					Class615.aClass82_3.method21606(Class49.method9255(Class570.aClass585_5.method33272(), 15000), Class570.aClass585_5.aString242);
				}
				Class615.aClass82_3.method21599();
				local148 = Class368.method26925();
				if (Class190.aBoolean659) {
					local148.aClass3_Sub41_Sub1_1.method20250(Class293.aClass293_10.anInt4371 * 946648601);
					local148.aClass3_Sub41_Sub1_1.method20251(0);
					local169 = local148.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
					local148.aClass3_Sub41_Sub1_1.method20254(797);
					local148.aClass3_Sub41_Sub1_1.method20254(1);
					if (Class190.anInt3670 * 1734568685 == 240) {
						local148.aClass3_Sub41_Sub1_1.method20250(client.anInt3039 * 1115111877 == 14 ? 1 : 0);
					}
					@Pc(199) Class3_Sub41 local199 = Class149.method23126();
					local199.method20250(Class190.anInt3639 * 1219357829);
					local199.method20251((int) (Math.random() * 9.9999999E7D));
					local199.method20250(Class469.aClass530_2.method33765());
					local199.method20254(client.anInt3073 * -720912181);
					for (local226 = 0; local226 < 6; local226++) {
						local199.method20254((int) (Math.random() * 9.9999999E7D));
					}
					local199.method20409(client.aLong233 * 94527785818802101L);
					local199.method20250(client.aClass543_2.anInt5326 * 1050721143);
					local199.method20250((int) (Math.random() * 9.9999999E7D));
					local199.method20298(Class361.aBigInteger7, Class361.aBigInteger6);
					local148.aClass3_Sub41_Sub1_1.method20248(local199.aByteArray51, 0, local199.anInt2803 * 62066237);
					local148.aClass3_Sub41_Sub1_1.method20265(local148.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local169);
				} else {
					local148.aClass3_Sub41_Sub1_1.method20250(Class293.aClass293_2.anInt4371 * 946648601);
				}
				Class615.aClass82_3.method21601(local148);
				Class615.aClass82_3.method21617();
				Class190.anInt3648 = -197371695;
			}
			@Pc(335) int local335;
			if (Class190.anInt3648 * -1033304397 == 35) {
				if (!Class615.aClass82_3.method21621().method12856(1)) {
					return;
				}
				Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, 1);
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
				local335 = Class615.aClass82_3.aClass3_Sub41_Sub1_2.method20269();
				if (local335 != 0) {
					Class190.anInt3648 = -1846339461;
					Class218.method24358(local335);
					Class43.method9493(local335);
					Class615.aClass82_3.method21604();
					Class555.method32796();
					return;
				}
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
				if (Class190.aBoolean659) {
					Class190.anInt3648 = -236846034;
				} else {
					Class190.anInt3648 = 128596306;
				}
			}
			if (Class190.anInt3648 * -1033304397 == 42) {
				if (!Class615.aClass82_3.method21621().method12856(2)) {
					return;
				}
				Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, 2);
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = Class615.aClass82_3.aClass3_Sub41_Sub1_2.method20271() * -918980331;
				Class190.anInt3648 = -315794712;
			}
			if (Class190.anInt3648 * -1033304397 == 56) {
				if (!Class615.aClass82_3.method21621().method12856(Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 * 62066237)) {
					return;
				}
				Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 * 62066237);
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.method20295(Class190.anIntArray386);
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
				@Pc(448) String local448 = Class615.aClass82_3.aClass3_Sub41_Sub1_2.method20284();
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
				@Pc(456) String local456 = Class300.aClass300_10.method25639();
				Class23.method5938(local448, true, local456, client.aBoolean569);
				Class190.anInt3648 = 2093358784;
			}
			if (Class190.anInt3648 * -1033304397 == 64) {
				if (!Class615.aClass82_3.method21621().method12856(1)) {
					return;
				}
				Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, 1);
				if ((Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51[0] & 0xFF) == 1) {
					Class190.anInt3648 = -394743390;
				}
			}
			if (Class190.anInt3648 * -1033304397 == 70) {
				if (!Class615.aClass82_3.method21621().method12856(16)) {
					return;
				}
				Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, 16);
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = -1818783408;
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.method20295(Class190.anIntArray386);
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
				Class190.aLong241 = Class615.aClass82_3.aClass3_Sub41_Sub1_2.method20371() * 8189732161531925055L;
				Class190.aLong242 = Class615.aClass82_3.aClass3_Sub41_Sub1_2.method20371() * 2016401035969746977L;
				Class190.anInt3648 = 128596306;
			}
			if (Class190.anInt3648 * -1033304397 == 86) {
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
				Class615.aClass82_3.method21599();
				local148 = Class368.method26925();
				@Pc(570) Class3_Sub41_Sub1 local570 = local148.aClass3_Sub41_Sub1_1;
				@Pc(603) int local603;
				@Pc(632) Class3_Sub41 local632;
				@Pc(742) Class3_Sub41 local742;
				@Pc(579) Class293 local579;
				if (Class190.anInt3670 * 1734568685 == 240) {
					if (Class190.aBoolean659) {
						local579 = Class293.aClass293_11;
					} else {
						local579 = Class293.aClass293_12;
					}
					local570.method20250(local579.anInt4371 * 946648601);
					local570.method20251(0);
					local226 = local570.anInt2803 * 62066237;
					local603 = local570.anInt2803 * 62066237;
					if (!Class190.aBoolean659) {
						local570.method20254(797);
						local570.method20254(1);
						local570.method20250(client.anInt3039 * 1115111877 == 14 ? 1 : 0);
						local603 = local570.anInt2803 * 62066237;
						local632 = Class360.method26763();
						local570.method20248(local632.aByteArray51, 0, local632.anInt2803 * 62066237);
						local603 = local570.anInt2803 * 62066237;
						local570.method20250(Class190.aLong241 * -7592338111309603393L == -1L ? 1 : 0);
						if (Class190.aLong241 * -7592338111309603393L == -1L) {
							local570.method20260(Class190.aString178);
						} else {
							local570.method20409(Class190.aLong241 * -7592338111309603393L);
						}
					}
					local570.method20250(Class492.method29292());
					local570.method20251(Class128.anInt3317 * 2037417253);
					local570.method20251(Class575.anInt5428 * 1261116487);
					local570.method20250(Class510.aClass3_Sub45_37.aClass60_Sub27_2.method13857());
					Class527.method32429(local570);
					local570.method20260(client.aString150);
					local570.method20254(client.anInt3073 * -720912181);
					local632 = Class510.aClass3_Sub45_37.method13007();
					local570.method20250(local632.anInt2803 * 62066237);
					local570.method20248(local632.aByteArray51, 0, local632.anInt2803 * 62066237);
					client.aBoolean573 = true;
					local742 = new Class3_Sub41(Class298.aClass3_Sub47_1.method13199());
					Class298.aClass3_Sub47_1.method13198(local742);
					local570.method20248(local742.aByteArray51, 0, local742.aByteArray51.length);
					local570.method20254(client.anInt3060 * 369203209);
					local570.method20254(client.anInt3082 * 277198609);
					local570.method20254(client.anInt3056 * -116258853);
					local570.method20260(Class511.aString232);
					local570.method20250(client.aString145 == null ? 0 : 1);
					if (client.aString145 != null) {
						local570.method20260(client.aString145);
					}
					local570.method20250(Class370.aClass417_1.method27802("jagtheora") ? 1 : 0);
					local570.method20250(client.aBoolean565 ? 1 : 0);
					local570.method20250(client.aBoolean570 ? 1 : 0);
					local570.method20250(Class293.anInt4372 * 1855718387);
					local570.method20254(client.anInt3078 * -176919787);
					local570.method20260(client.aString147);
					local570.method20250(Class570.aClass585_4 != null && Class570.aClass585_4.anInt5458 * 146668341 == FileFilter_Sub1.aClass585_1.anInt5458 * 146668341 ? 0 : 1);
					local570.method20251(Class570.aClass585_5.anInt5458 * 146668341);
					local570.method20251(Class570.aClass585_6.anInt5458 * 146668341);
					Class374.method27227(local570);
					local570.method20296(Class190.anIntArray386, local603, local570.anInt2803 * 62066237);
					local570.method20265(local570.anInt2803 * 62066237 - local226);
				} else {
					if (Class190.aBoolean659) {
						local579 = Class293.aClass293_11;
					} else {
						local579 = Class293.aClass293_4;
					}
					local570.method20250(local579.anInt4371 * 946648601);
					local570.method20251(0);
					local226 = local570.anInt2803 * 62066237;
					local603 = local570.anInt2803 * 62066237;
					if (!Class190.aBoolean659) {
						local570.method20254(797);
						local570.method20254(1);
						local632 = Class360.method26763();
						local570.method20248(local632.aByteArray51, 0, local632.anInt2803 * 62066237);
						local603 = local570.anInt2803 * 62066237;
						local570.method20250(Class190.aLong241 * -7592338111309603393L == -1L ? 1 : 0);
						if (Class190.aLong241 * -7592338111309603393L == -1L) {
							local570.method20260(Class190.aString178);
						} else {
							local570.method20409(Class190.aLong241 * -7592338111309603393L);
						}
					}
					local570.method20250(client.aClass543_2.anInt5326 * 1050721143);
					local570.method20250(Class469.aClass530_2.method33765());
					local570.method20250(Class492.method29292());
					local570.method20251(Class128.anInt3317 * 2037417253);
					local570.method20251(Class575.anInt5428 * 1261116487);
					local570.method20250(Class510.aClass3_Sub45_37.aClass60_Sub27_2.method13857());
					Class527.method32429(local570);
					local570.method20260(client.aString150);
					local632 = Class510.aClass3_Sub45_37.method13007();
					local570.method20250(local632.anInt2803 * 62066237);
					local570.method20248(local632.aByteArray51, 0, local632.anInt2803 * 62066237);
					local742 = new Class3_Sub41(Class298.aClass3_Sub47_1.method13199());
					Class298.aClass3_Sub47_1.method13198(local742);
					local570.method20248(local742.aByteArray51, 0, local742.aByteArray51.length);
					local570.method20254(client.anInt3060 * 369203209);
					local570.method20260(Class511.aString232);
					local570.method20254(client.anInt3073 * -720912181);
					local570.method20254(client.anInt3078 * -176919787);
					local570.method20260(client.aString147);
					local570.method20250(Class293.anInt4372 * 1855718387);
					Class374.method27227(local570);
					local570.method20296(Class190.anIntArray386, local603, local570.anInt2803 * 62066237);
					local570.method20265(local570.anInt2803 * 62066237 - local226);
				}
				Class615.aClass82_3.method21601(local148);
				Class615.aClass82_3.method21617();
				Class615.aClass82_3.aClass577_2 = new Class577(Class190.anIntArray386);
				for (@Pc(1127) int local1127 = 0; local1127 < 4; local1127++) {
					Class190.anIntArray386[local1127] += 50;
				}
				Class615.aClass82_3.aClass577_3 = new Class577(Class190.anIntArray386);
				new Class577(Class190.anIntArray386);
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.method19823(Class615.aClass82_3.aClass577_3);
				Class190.anIntArray386 = null;
				Class190.anInt3648 = 691410341;
			}
			if (Class190.anInt3648 * -1033304397 == 95) {
				if (!Class615.aClass82_3.method21621().method12856(1)) {
					return;
				}
				Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, 1);
				local335 = Class615.aClass82_3.aClass3_Sub41_Sub1_2.method20269();
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
				if (local335 == 21) {
					Class190.anInt3648 = -710538102;
				} else if (local335 == 1) {
					Class190.anInt3648 = 651936002;
					Class43.method9493(local335);
					return;
				} else if (local335 == 52) {
					Class153.anInt3441 = local335 * -504649223;
					Class190.anInt3648 = 1827211700;
				} else if (local335 == 2) {
					if (Class190.aBoolean660) {
						Class190.aBoolean660 = false;
						Class190.anInt3648 = -1925288139;
						return;
					}
					if (Class190.anInt3670 * 1734568685 == 240) {
						Class302.aClass10_Sub1_1.method738();
						Class190.anInt3648 = -216499456;
					} else {
						Class190.anInt3648 = -187198406;
					}
				} else if (local335 == 15) {
					Class615.aClass82_3.anInt2915 = 219278622;
					Class190.anInt3648 = 1906160378;
				} else if (local335 == 23 && Class190.anInt3638 * -965138061 < 3) {
					Class190.anInt3667 = 0;
					Class190.anInt3638 += 1390158779;
					Class190.anInt3648 = -1925288139;
					Class615.aClass82_3.method21604();
					return;
				} else if (local335 == 42) {
					Class190.anInt3648 = 1224923326;
					Class43.method9493(local335);
					return;
				} else if (Class190.anInt3670 * 1734568685 == 166 && local335 == 49 && client.anInt3039 * 1115111877 != 10) {
					if (Class190.anInt3669 * 1840232743 != 52) {
						Class43.method9493(local335);
					}
					return;
				} else if (!Class190.aBoolean662 || Class190.aBoolean659 || Class190.anInt3639 * 1219357829 == -1 || local335 != 35) {
					if (local335 != 53) {
						Class190.anInt3648 = -1846339461;
						Class43.method9493(local335);
						Class615.aClass82_3.method21604();
						Class555.method32796();
						return;
					}
					Class190.anInt3648 = -1381601865;
				} else {
					Class190.aBoolean659 = true;
					Class190.anInt3667 = 0;
					Class190.anInt3648 = -1925288139;
					Class615.aClass82_3.method21604();
					return;
				}
			}
			if (Class190.anInt3648 * -1033304397 == 126) {
				if (!Class615.aClass82_3.method21621().method12856(1)) {
					return;
				}
				Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, 1);
				local335 = Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51[0] & 0xFF;
				Class190.anInt3674 = local335 * 1077298198;
				Class190.anInt3648 = -1846339461;
				Class43.method9493(21);
				Class615.aClass82_3.method21604();
				Class555.method32796();
				return;
			}
			if (Class190.anInt3648 * -1033304397 == 218) {
				if (!Class615.aClass82_3.method21621().method12856(2)) {
					return;
				}
				Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, 2);
				Class190.anInt3677 = (((Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51[0] & 0xFF) << 8) + (Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51[1] & 0xFF)) * 1855240697;
				Class190.anInt3648 = 691410341;
				return;
			}
			if (Class190.anInt3648 * -1033304397 == 245) {
				if (!Class615.aClass82_3.method21621().method12856(4)) {
					return;
				}
				Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, 4);
				Class190.anInt3678 = Class615.aClass82_3.aClass3_Sub41_Sub1_2.method20275() * 33972259;
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
				Class190.anInt3648 = -1846339461;
				Class43.method9493(53);
				Class615.aClass82_3.method21604();
				Class555.method32796();
				return;
			}
			if (Class190.anInt3648 * -1033304397 == 192) {
				if (Class153.anInt3441 * 2140325961 == 29) {
					if (!Class615.aClass82_3.method21621().method12856(1)) {
						return;
					}
					Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, 1);
					Class190.anInt3676 = (Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51[0] & 0xFF) * -29746817;
				} else if (Class153.anInt3441 * 2140325961 == 45) {
					if (!Class615.aClass82_3.method21621().method12856(3)) {
						return;
					}
					Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, 3);
					Class190.anInt3676 = (Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51[0] & 0xFF) * -29746817;
					Class190.anInt3675 = ((Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51[2] & 0xFF) + ((Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51[1] & 0xFF) << 8)) * -383429193;
				} else {
					throw new IllegalStateException();
				}
				Class190.anInt3648 = -1846339461;
				Class43.method9493(Class153.anInt3441 * 2140325961);
				Class615.aClass82_3.method21604();
				Class555.method32796();
				return;
			}
			if (Class190.anInt3648 * -1033304397 == 220) {
				if (!Class615.aClass82_3.method21621().method12856(2)) {
					return;
				}
				Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, 2);
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
				Class552.anInt5332 = Class615.aClass82_3.aClass3_Sub41_Sub1_2.method20271() * 1930583741;
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
				Class190.anInt3648 = -700364813;
				return;
			}
			if (Class190.anInt3648 * -1033304397 == 233) {
				if (!Class615.aClass82_3.method21621().method12856(Class552.anInt5332 * -969536363)) {
					return;
				}
				Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, Class552.anInt5332 * -969536363);
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
				@Pc(1674) byte[] local1674 = new byte[Class552.anInt5332 * -969536363 + 1];
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.method19830(local1674, 0, Class552.anInt5332 * -969536363);
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
				@Pc(1692) Class3_Sub41 local1692 = new Class3_Sub41(local1674);
				@Pc(1696) String local1696 = local1692.method20283();
				Class485.method29178(local1696, true, client.aBoolean569);
				Class43.method9493(Class153.anInt3441 * 2140325961);
				if (Class190.anInt3670 * 1734568685 == 166 && client.anInt3039 * 1115111877 != 10) {
					Class190.anInt3648 = 691410341;
				} else {
					Class190.anInt3648 = -1846339461;
					Class615.aClass82_3.method21604();
					Class555.method32796();
				}
				return;
			}
			if (Class190.anInt3648 * -1033304397 == 256) {
				if (!Class615.aClass82_3.method21621().method12856(2)) {
					return;
				}
				Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, 2);
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
				Class615.aClass82_3.anInt2915 = Class615.aClass82_3.aClass3_Sub41_Sub1_2.method20271() * -109639311;
				Class190.anInt3648 = -1500024882;
			}
			@Pc(1844) Class3_Sub41_Sub1 local1844;
			if (Class190.anInt3648 * -1033304397 == 266) {
				if (!Class615.aClass82_3.method21621().method12856(Class615.aClass82_3.anInt2915 * -64841839)) {
					return;
				}
				Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, Class615.aClass82_3.anInt2915 * -64841839);
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
				@Pc(1809) boolean local1809 = Class615.aClass82_3.aClass3_Sub41_Sub1_2.method20269() == 1;
				while (true) {
					if (Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 * 62066237 >= Class615.aClass82_3.anInt2915 * -64841839) {
						if (local1809) {
							@Pc(1841) Class3_Sub23 local1841 = Class368.method26925();
							local1844 = local1841.aClass3_Sub41_Sub1_1;
							local1844.method20250(Class293.aClass293_7.anInt4371 * 946648601);
							Class615.aClass82_3.method21601(local1841);
							Class615.aClass82_3.method21617();
							Class190.anInt3648 = -1352300815;
						} else {
							Class190.anInt3648 = -216499456;
						}
						break;
					}
					@Pc(1825) Class304 local1825 = Class500.aClass70_Sub1_Sub2_12.method14716(Class615.aClass82_3.aClass3_Sub41_Sub1_2);
					Class302.aClass10_Sub1_1.anInterface58_2.method33310(local1825.anInt4428 * 1628864065, local1825.anObject17);
				}
			}
			if (Class190.anInt3648 * -1033304397 == 131) {
				if (!Class615.aClass82_3.method21621().method12856(1)) {
					return;
				}
				Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, 1);
				local335 = Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51[0] & 0xFF;
				if (local335 != 2) {
					if (local335 != 29 && local335 != 45) {
						Class190.anInt3648 = -1846339461;
						Class43.method9493(local335);
						Class615.aClass82_3.method21604();
						Class555.method32796();
						return;
					}
					Class153.anInt3441 = local335 * -504649223;
					Class190.anInt3648 = 1985109056;
					return;
				}
				Class190.anInt3648 = -187198406;
			}
			if (Class190.anInt3648 * -1033304397 == 142) {
				if (!Class615.aClass82_3.method21621().method12856(1)) {
					return;
				}
				Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, 1);
				Class256.anInt4194 = (Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51[0] & 0xFF) * -1565338527;
				Class190.anInt3648 = -1470723832;
			}
			@Pc(1968) Class3_Sub41_Sub1 local1968;
			if (Class190.anInt3648 * -1033304397 == 152) {
				local1968 = Class615.aClass82_3.aClass3_Sub41_Sub1_2;
				if (Class190.anInt3670 * 1734568685 == 240) {
					if (!Class615.aClass82_3.method21621().method12856(Class256.anInt4194 * 110022561)) {
						return;
					}
					Class615.aClass82_3.method21621().method12848(local1968.aByteArray51, 0, Class256.anInt4194 * 110022561);
					local1968.anInt2803 = 0;
					client.anInt3116 = local1968.method20269() * 132184101;
					client.anInt3101 = local1968.method20269() * -1017065983;
					client.aBoolean591 = local1968.method20269() == 1;
					client.aBoolean592 = local1968.method20269() == 1;
					client.aBoolean593 = local1968.method20269() == 1;
					client.aBoolean594 = local1968.method20269() == 1;
					client.anInt3115 = local1968.method20271() * -447017549;
					client.aBoolean584 = local1968.method20269() == 1;
					Class357.anInt4639 = local1968.method20274() * -61078775;
					client.aBoolean590 = local1968.method20269() == 1;
					Class24.aString39 = local1968.method20283();
					client.aClass370_1.method26954().method28490(client.aBoolean590);
					Class30_Sub1.aClass379_1.method27250().method26954().method28490(client.aBoolean590);
					Class44_Sub3.aClass596_1.method33453(client.aBoolean590);
					Class498.aClass579_1.method33186(client.aBoolean590);
				} else if (Class615.aClass82_3.method21621().method12856(Class256.anInt4194 * 110022561)) {
					Class615.aClass82_3.method21621().method12848(local1968.aByteArray51, 0, Class256.anInt4194 * 110022561);
					local1968.anInt2803 = 0;
					client.anInt3116 = local1968.method20269() * 132184101;
					client.anInt3101 = local1968.method20269() * -1017065983;
					client.aBoolean591 = local1968.method20269() == 1;
					Class357.anInt4639 = local1968.method20274() * -61078775;
					Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte77 = (byte) local1968.method20269();
					client.aBoolean592 = local1968.method20269() == 1;
					client.aBoolean593 = local1968.method20269() == 1;
					Class545.aLong284 = local1968.method20371() * -8411951881428327409L;
					Class215.aLong243 = (Class545.aLong284 * -1465639016483960081L - Class176.method23413() - local1968.method20411()) * -765158361044553335L;
					local169 = local1968.method20269();
					client.aBoolean584 = (local169 & 0x1) != 0;
					Class174.aBoolean625 = (local169 & 0x2) != 0;
					Class30_Sub3.anInt848 = local1968.method20275() * 842552083;
					Class140.anInt3425 = local1968.method20275() * -800142855;
					Class209.anInt3699 = local1968.method20271() * -1739156873;
					Class160.anInt3442 = local1968.method20271() * 1401248437;
					Class193.anInt3683 = local1968.method20271() * 242829479;
					Class5_Sub3.anInt95 = local1968.method20275() * -1121235477;
					Class128.aClass140_1 = new Class140(Class5_Sub3.anInt95 * 1823699651);
					(new Thread(Class128.aClass140_1)).start();
					Class3_Sub1_Sub19.anInt5551 = local1968.method20269() * 1770369985;
					Class13_Sub7.anInt608 = local1968.method20271() * 23578325;
					Class276.anInt4321 = local1968.method20271() * -1769412217;
					Class613.aBoolean849 = local1968.method20269() == 1;
					Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aString75 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aString77 = RuntimeException_Sub3.aString121 = local1968.method20284();
					Class19_Sub2.anInt2889 = local1968.method20269() * 48096449;
					Class134.anInt3382 = local1968.method20275() * 1975214749;
					Class570.aClass585_4 = new Class585();
					Class570.aClass585_4.anInt5458 = local1968.method20271() * 664190749;
					if (Class570.aClass585_4.anInt5458 * 146668341 == 65535) {
						Class570.aClass585_4.anInt5458 = -664190749;
					}
					Class570.aClass585_4.aString242 = local1968.method20284();
					if (Class1.aClass527_1 != Class527.aClass527_10) {
						Class570.aClass585_4.anInt5459 = Class570.aClass585_4.anInt5458 * -1027819553 + 117580992;
						Class570.aClass585_4.anInt5457 = Class570.aClass585_4.anInt5458 * 550241065 + -147881328;
					}
					if (Class1.aClass527_1 != Class527.aClass527_6 && (Class1.aClass527_1 != Class527.aClass527_4 || client.anInt3116 * -1336253523 < 2) && FileFilter_Sub1.aClass585_1.method33275(Class570.aClass585_3)) {
						Class342.method26473();
					}
				} else {
					return;
				}
				if (client.aBoolean591 && !client.aBoolean593 || client.aBoolean584) {
					try {
						Class588.method33291(Class524.anApplet2, "zap");
					} catch (@Pc(2391) Throwable local2391) {
						if (client.aBoolean595) {
							try {
								Class524.anApplet2.getAppletContext().showDocument(new URL(Class524.anApplet2.getCodeBase(), "blank.ws"), "tbi");
							} catch (@Pc(2405) Exception local2405) {
							}
						}
					}
				} else {
					try {
						Class588.method33291(Class524.anApplet2, "unzap");
					} catch (@Pc(2413) Throwable local2413) {
					}
				}
				if (Class527.aClass527_10 == Class1.aClass527_1) {
					Class300.aClass300_17.method25643();
				}
				if (Class190.anInt3670 * 1734568685 != 240) {
					Class190.anInt3648 = -1846339461;
					Class43.method9493(2);
					Class127.method22878();
					Class166.method23342(18);
					Class615.aClass82_3.aClass301_2 = null;
					return;
				}
				Class190.anInt3648 = -1589146849;
			}
			if (Class190.anInt3648 * -1033304397 == 173) {
				if (!Class615.aClass82_3.method21621().method12856(3)) {
					return;
				}
				Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, 3);
				Class190.anInt3648 = 1422295021;
			}
			if (Class190.anInt3648 * -1033304397 == 183) {
				local1968 = Class615.aClass82_3.aClass3_Sub41_Sub1_2;
				local1968.anInt2803 = 0;
				if (local1968.method19839()) {
					if (!Class615.aClass82_3.method21621().method12856(1)) {
						return;
					}
					Class615.aClass82_3.method21621().method12848(local1968.aByteArray51, 3, 1);
				}
				Class615.aClass82_3.aClass301_2 = Class146.method23081()[local1968.method19832()];
				Class615.aClass82_3.anInt2915 = local1968.method20271() * -109639311;
				Class190.anInt3648 = 1540718038;
			}
			if (Class190.anInt3648 * -1033304397 == 162) {
				if (!Class615.aClass82_3.method21621().method12856(Class615.aClass82_3.anInt2915 * -64841839)) {
					return;
				}
				Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, Class615.aClass82_3.anInt2915 * -64841839);
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
				local335 = Class615.aClass82_3.anInt2915 * -64841839;
				Class190.anInt3648 = -1846339461;
				Class43.method9493(2);
				Class572.method33076();
				Class402.method27621(Class615.aClass82_3.aClass3_Sub41_Sub1_2);
				local169 = local335 - Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 * 62066237;
				local1844 = new Class3_Sub41_Sub1(local169);
				System.arraycopy(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 * 62066237, local1844.aByteArray51, 0, local169);
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 += local169 * -918980331;
				if (Class301.aClass301_46 == Class615.aClass82_3.aClass301_2) {
					client.aClass370_1.method26969(new Class374(Class380.aClass380_6, local1844));
				} else {
					client.aClass370_1.method26969(new Class374(Class380.aClass380_5, local1844));
				}
				if (local335 != Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 * 62066237) {
					throw new RuntimeException(Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 * 62066237 + " " + local335);
				}
				Class615.aClass82_3.aClass301_2 = null;
				return;
			}
			if (Class190.anInt3648 * -1033304397 == 206) {
				if (-64841839 * Class615.aClass82_3.anInt2915 == -2) {
					if (!Class615.aClass82_3.method21621().method12856(2)) {
						return;
					}
					Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, 2);
					Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
					Class615.aClass82_3.anInt2915 = Class615.aClass82_3.aClass3_Sub41_Sub1_2.method20271() * -109639311;
				}
				if (!Class615.aClass82_3.method21621().method12856(Class615.aClass82_3.anInt2915 * -64841839)) {
					return;
				}
				Class615.aClass82_3.method21621().method12848(Class615.aClass82_3.aClass3_Sub41_Sub1_2.aByteArray51, 0, Class615.aClass82_3.anInt2915 * -64841839);
				Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 = 0;
				local335 = Class615.aClass82_3.anInt2915 * -64841839;
				Class190.anInt3648 = -1846339461;
				Class43.method9493(15);
				Class520.method29766();
				Class30_Sub3.method7853(true);
				Class402.method27621(Class615.aClass82_3.aClass3_Sub41_Sub1_2);
				if (Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 * 62066237 != local335) {
					throw new RuntimeException(Class615.aClass82_3.aClass3_Sub41_Sub1_2.anInt2803 * 62066237 + " " + local335);
				}
				Class615.aClass82_3.aClass301_2 = null;
				return;
			}
		} catch (@Pc(2773) IOException local2773) {
			Class615.aClass82_3.method21604();
			if (Class190.anInt3638 * -965138061 < 3) {
				if (Class190.anInt3670 * 1734568685 == 240) {
					FileFilter_Sub1.aClass585_1.method33273();
				} else {
					Class570.aClass585_5.method33273();
				}
				Class190.anInt3667 = 0;
				Class190.anInt3638 += 1390158779;
				Class190.anInt3648 = -1925288139;
			} else {
				Class190.anInt3648 = -1846339461;
				Class43.method9493(-4);
				Class555.method32796();
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "aem", descriptor = "(Lclient!vs;B)V", line = 9653)
	static final void method32509(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(17) Class3_Sub1_Sub14 local17 = Class13_Sub23.aClass343_1.method26476(local12);
		if (local17.anIntArray263 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17.anIntArray263.length;
		}
	}
}
