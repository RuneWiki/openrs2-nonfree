package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public class Class533 {

	@OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
	public static final int anInt5250 = 5;

	@OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
	public static final int anInt5251 = 3;

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
	public static final int anInt5252 = 2;

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
	public static final int anInt5253 = 1;

	@OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
	public static final int anInt5254 = 0;

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
	public static final int anInt5255 = 8;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V", line = 11)
	Class533() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!rm", name = "z", descriptor = "(I)I", line = 339)
	static int method30604() {
		@Pc(6) int local6;
		if (Class51.aClass93_Sub36_1.aClass166_Sub45_1.method16505() == 0) {
			for (local6 = 0; local6 < client.anInt3448 * -1523148821; local6++) {
				if (client.anInterface66Array2[local6].method13686() == 's' || client.anInterface66Array2[local6].method13686() == 'S') {
					Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 1);
					client.aBoolean606 = true;
					Class481.method29755(Class73.aClass73_9);
					break;
				}
			}
		}
		if (Class370.aClass370_15 == Class146.aClass370_3) {
			if (Class275.aClass496_1 == null) {
				Class275.aClass496_1 = new Class496(Class520.aClass144_3, Class484.aClass493_2, Class477.aClass480_2, Class95.aBigInteger1, Class95.aBigInteger3);
			}
			if (!Class275.aClass496_1.method30032()) {
				return 0;
			}
			Class293.method26588(0, null, true);
			Class362.aBoolean729 = !Class319.method27222();
			Class17.aClass497_2 = Class384.method28156(Class362.aBoolean729 ? Class31.aClass31_29 : Class31.aClass31_7, false, 1, true);
			Class7.aClass497_1 = Class384.method28156(Class31.aClass31_28, false, 1, true);
			Class633.aClass497_137 = Class384.method28156(Class31.aClass31_9, false, 1, true);
			Class222.aClass497_97 = Class384.method28156(Class31.aClass31_25, true, 1, true);
		}
		@Pc(127) int local127;
		@Pc(115) boolean local115;
		if (Class370.aClass370_13 == Class146.aClass370_3) {
			local115 = Class7.aClass497_1.method30061();
			@Pc(119) boolean local119 = Class222.aClass497_97.method30061();
			local127 = Class569.aClass143_Sub1Array2[Class31.aClass31_28.method629()].method11071();
			@Pc(143) int local143 = local127 + Class569.aClass143_Sub1Array2[Class362.aBoolean729 ? Class31.aClass31_29.method629() : Class31.aClass31_7.method629()].method11071();
			@Pc(153) int local153 = local143 + Class569.aClass143_Sub1Array2[Class31.aClass31_9.method629()].method11071();
			@Pc(163) int local163 = local153 + (local119 ? 100 : Class222.aClass497_97.method30058());
			@Pc(173) int local173 = local163 + (local115 ? 100 : Class7.aClass497_1.method30058());
			if (local173 != 500) {
				return local173 / 5;
			}
			Class93_Sub26.aClass645_15 = new Class645(Class222.aClass497_97);
			Class659.aClass633_1 = new Class633(Class222.aClass497_97);
			Class292.method26580(Class93_Sub26.aClass645_15);
			@Pc(198) int local198 = Class51.aClass93_Sub36_1.aClass166_Sub38_1.method16321();
			Class363.aClass81_1 = new Class81(client.aClass702_4, Class106.aClass717_8, Class7.aClass497_1);
			@Pc(210) Class84[] local210 = Class363.aClass81_1.method1369(local198);
			if (local210.length == 0) {
				local210 = Class363.aClass81_1.method1369(0);
			}
			@Pc(224) Class385 local224 = new Class385(Class17.aClass497_2, Class633.aClass497_137);
			if (local210.length > 0) {
				Class362.anInterface30Array1 = new Interface30[local210.length];
				for (@Pc(233) int local233 = 0; local233 < Class362.anInterface30Array1.length; local233++) {
					Class362.anInterface30Array1[local233] = new Class366(Class363.aClass81_1.method1368(local210[local233].anInt258 * 1709991339), local210[local233].anInt256 * 1396449397, local210[local233].anInt257 * 1604660509, local224);
				}
			}
		}
		if (Class146.aClass370_3 == Class370.aClass370_7) {
			Class157.aClass462_2 = new Class462(Class694.aClass104_14, Class17.aClass497_2, Class633.aClass497_137, Class173.method23800());
		}
		@Pc(290) int local290;
		if (Class370.aClass370_8 == Class146.aClass370_3) {
			local6 = Class157.aClass462_2.method29256();
			local290 = Class157.aClass462_2.method29239();
			if (local6 < local290) {
				return local6 * 100 / local290;
			}
		}
		if (Class370.aClass370_9 == Class146.aClass370_3) {
			if (Class362.anInterface30Array1 != null && Class362.anInterface30Array1.length > 0) {
				if (Class362.anInterface30Array1[0].method27932() < 100) {
					return 0;
				}
				if (Class362.anInterface30Array1.length > 1 && Class363.aClass81_1.method1374() && Class362.anInterface30Array1[1].method27932() < 100) {
					return 0;
				}
			}
			Class157.aClass462_2.method29236(client.anInterface50_1);
			Class520.method30339(Class694.aClass104_14);
			Class481.method29756(11);
		}
		if (Class146.aClass370_3 == Class370.aClass370_10) {
			Class110_Sub7.aClass497_22 = Class384.method28156(Class31.aClass31_6, false, 1, true);
			Class623.aClass497_136 = Class384.method28156(Class31.aClass31_17, false, 1, true);
			Class110_Sub10.aClass497_23 = Class384.method28156(Class31.aClass31_8, false, 1, true);
			Class93_Sub3.aClass497_43 = Class384.method28156(Class31.aClass31_2, false, 1, true);
			Class166_Sub45.aClass497_60 = Class384.method28156(Class31.aClass31_24, false, 1, true);
			Class621.aClass497_135 = Class384.method28156(Class31.aClass31_36, false, 1, true);
			Class200.aClass497_96 = Class384.method28156(Class31.aClass31_41, false, 1, true);
			Class166_Sub15.aClass497_59 = Class384.method28156(Class31.aClass31_18, true, 1, true);
			Class86.aClass497_15 = Class384.method28156(Class31.aClass31_10, false, 1, true);
			Class230.aClass497_99 = Class384.method28156(Class31.aClass31_38, true, 1, true);
			Class40.aClass497_4 = Class384.method28156(Class31.aClass31_5, false, 1, true);
			Class542.aClass497_129 = Class384.method28156(Class31.aClass31_3, false, 1, true);
			Class337.aClass497_103 = Class384.method28156(Class31.aClass31_22, true, 1, false);
			Class124.aClass497_93 = Class384.method28156(Class31.aClass31_31, true, 1, false);
			Class493.aClass497_124 = Class384.method28156(Class31.aClass31_11, false, 1, true);
			Class47.aClass497_6 = Class384.method28156(Class31.aClass31_42, false, 1, true);
			Class514.aClass497_128 = Class384.method28156(Class31.aClass31_20, false, 1, true);
			Class157.aClass497_49 = Class384.method28156(Class31.aClass31_14, false, 1, true);
			Class705.aClass497_141 = Class384.method28156(Class31.aClass31_15, false, 1, true);
			Class327.aClass497_102 = Class384.method28156(Class31.aClass31_16, false, 1, true);
			Class443.aClass497_115 = Class384.method28156(Class31.aClass31_27, false, 1, true);
			Class144_Sub1.aClass497_42 = Class384.method28156(Class31.aClass31_1, true, 1, false);
			Class710.aClass497_143 = Class384.method28156(Class31.aClass31_32, true, 1, true);
			Class486.aClass497_123 = Class384.method28156(Class31.aClass31_19, false, 1, true);
			Class304.aClass497_101 = Class384.method28156(Class31.aClass31_23, false, 1, true);
			Class108_Sub1.aClass497_19 = Class384.method28156(Class31.aClass31_21, true, 1, true);
			Class577.aClass497_130 = Class384.method28156(Class31.aClass31_13, false, 1, true);
			Class75.aClass497_11 = Class384.method28156(Class31.aClass31_12, false, 1, true);
			Class446.aClass497_117 = Class384.method28156(Class31.aClass31_30, true, 1, true);
			Class590.aClass497_133 = Class384.method28156(Class31.aClass31_4, true, 1, true);
			Class364.aClass497_105 = Class384.method28156(Class31.aClass31_26, true, 1, true);
		}
		if (Class370.aClass370_22 == Class146.aClass370_3) {
			local6 = 0;
			local290 = 0;
			for (local127 = 0; local127 < Class569.aClass143_Sub1Array2.length; local127++) {
				if (Class569.aClass143_Sub1Array2[local127] != null) {
					local6 += Class569.aClass143_Sub1Array2[local127].method11071();
					local290++;
				}
			}
			if (local290 > 0) {
				local6 /= local290;
			}
			if (local6 != 100) {
				if (Class362.anInt4572 * -31438815 < 0) {
					Class362.anInt4572 = local6 * -790545439;
				}
				return (local6 - Class362.anInt4572 * -31438815) * 100 / (100 - Class362.anInt4572 * -31438815);
			}
			Class110_Sub4.method7302(Class93_Sub26.aClass645_15);
			Class157.aClass462_2 = new Class462(Class694.aClass104_14, Class110_Sub7.aClass497_22, Class633.aClass497_137, Class173.method23800());
		}
		if (Class146.aClass370_3 == Class370.aClass370_11) {
			@Pc(677) byte[] local677 = Class222.aClass497_97.method30059(Class649.aClass649_5.anInt5795 * -51136173);
			if (local677 == null) {
				return 0;
			}
			Class274.aClass258_1 = new Class258();
			Class274.aClass258_1.method26031(50, 7340032);
			Class151.method13979(local677);
			Class481.method29756(1);
		}
		if (Class146.aClass370_3 == Class370.aClass370_12 && Class125_Sub1.aClass586_1 == null) {
			Class125_Sub1.aClass586_1 = new Class586(Class590.aClass497_133);
			Class43.method843(Class125_Sub1.aClass586_1);
		}
		if (Class370.aClass370_5 == Class146.aClass370_3) {
			local6 = Class378.method28069();
			if (local6 < 100) {
				return local6;
			}
			Class27.method585(Class222.aClass497_97.method30059(Class649.aClass649_1.anInt5795 * -51136173));
			Class618.aShortArrayArray6 = Class93_Sub26.aClass645_15.aShortArrayArray8;
			Class111.aShortArrayArrayArray3 = Class93_Sub26.aClass645_15.aShortArrayArrayArray8;
			Class138_Sub3.aShortArrayArray4 = Class93_Sub26.aClass645_15.aShortArrayArray7;
			Class79_Sub1_Sub2.aShortArrayArrayArray1 = Class93_Sub26.aClass645_15.aShortArrayArrayArray9;
			if (Class93_Sub26.aClass645_15.anInt5774 * 68799883 != -1 && Class93_Sub26.aClass645_15.anInt5775 * 810262785 != -1) {
				client.anInt3511 = Class93_Sub26.aClass645_15.anInt5774 * -1828737035;
				client.anInt3512 = Class93_Sub26.aClass645_15.anInt5775 * 1053772179;
			}
			Class113.aClass651_2 = new Class651(Class222.aClass497_97);
			Class336.aClass644_1 = new Class644(Class222.aClass497_97);
			Class288.aClass636_1 = new Class636(Class222.aClass497_97);
			Class119.aClass650_2 = new Class650(Class222.aClass497_97);
			Class159.aClass637_2 = new Class637(Class222.aClass497_97);
		}
		if (Class370.aClass370_14 == Class146.aClass370_3) {
			if (-742728449 * Class93_Sub26.aClass645_15.anInt5773 != -1 && !Class86.aClass497_15.method30053(Class93_Sub26.aClass645_15.anInt5773 * -742728449, 0)) {
				return 99;
			}
			Class619.aClass225_8 = new Class225(Class108_Sub1.aClass497_19);
			Class636.anInterface24_10 = new Class111_Sub1(Class230.aClass497_99);
			Class124.aClass32_Sub21_7 = new Class32_Sub21(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class166_Sub6.aClass32_Sub5_1 = new Class32_Sub5(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class311.aClass32_Sub6_1 = new Class32_Sub6(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class74.aClass32_1 = new Class32(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class667.aClass667_73, 64, new Class52(Class30.class));
			Class276.aClass32_2 = new Class32(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class667.aClass667_72, 16, new Class52(Class77.class));
			Class19.aClass32_Sub7_5 = new Class32_Sub7(client.aClass702_4, Class106.aClass717_8, Class47.aClass497_6);
			Class682.aClass32_Sub1_3 = new Class32_Sub1(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class692.aClass32_Sub4_3 = new Class32_Sub4(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class366.aClass32_Sub8_1 = new Class32_Sub8(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class534.aClass32_Sub10_1 = new Class32_Sub10(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class343.aClass32_Sub19_1 = new Class32_Sub19(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class86.aClass497_15);
			Class638.aClass32_Sub22_1 = new Class32_Sub22(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class668.aClass32_Sub15_1 = new Class32_Sub15(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class273.aClass32_Sub14_8 = new Class32_Sub14(client.aClass702_4, Class106.aClass717_8, true, Class493.aClass497_124, Class86.aClass497_15);
			client.aClass532_1.method30449(Class273.aClass32_Sub14_8);
			Class392.aClass541_1.method30902(new Class32_Sub14(client.aClass702_4, Class106.aClass717_8, true, Class493.aClass497_124, Class86.aClass497_15));
			Class542.aClass32_Sub2_3 = new Class32_Sub2(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class466.aClass32_Sub20_3 = new Class32_Sub20(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class110_Sub7.aClass497_22);
			Class162.aClass32_Sub3_2 = new Class32_Sub3(client.aClass702_4, Class106.aClass717_8, true, Class514.aClass497_128, Class86.aClass497_15);
			Class277.aClass32_Sub12_1 = new Class32_Sub12(client.aClass702_4, Class106.aClass717_8, true, Class124.aClass32_Sub21_7, Class157.aClass497_49, Class86.aClass497_15);
			Class288.aClass55_Sub2_1 = new Class55_Sub2(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, true);
			client.aClass32_Sub13_1 = new Class32_Sub13(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class32.aClass32_Sub17_23 = new Class32_Sub17(client.aClass702_4, Class106.aClass717_8, Class705.aClass497_141, Class623.aClass497_136, Class110_Sub10.aClass497_23, Class93_Sub3.aClass497_43, client.aClass32_Sub13_1);
			Class123.aClass32_Sub11_2 = new Class32_Sub11(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class51.aClass32_Sub9_1 = new Class32_Sub9(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class501.aClass32_Sub18_1 = new Class32_Sub18(client.aClass702_4, Class106.aClass717_8, Class327.aClass497_102, Class86.aClass497_15);
			Class649.aClass55_Sub1_1 = new Class55_Sub1(client.aClass702_4, Class106.aClass717_8, Class443.aClass497_115, true);
			Class72.aClass79_Sub1_Sub2_2 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_63, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class21.aClass79_Sub1_Sub1_1 = new Class79_Sub1_Sub1(client.aClass702_4, Class138.aClass138_65, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class684.aClass79_Sub1_Sub2_6 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_67, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class39.aClass79_Sub1_Sub2_1 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_71, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class93_Sub26_Sub6.aClass79_Sub1_Sub2_3 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_68, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class429.aClass79_Sub1_Sub2_5 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_70, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class265.aClass79_Sub1_Sub2_4 = new Class79_Sub1_Sub2(client.aClass702_4, Class138.aClass138_72, Class106.aClass717_8, Class166_Sub45.aClass497_60);
			Class96.aMap9 = Class85.method1445(new Class79_Sub1[] { Class72.aClass79_Sub1_Sub2_2, Class21.aClass79_Sub1_Sub1_1, Class684.aClass79_Sub1_Sub2_6, Class39.aClass79_Sub1_Sub2_1, Class93_Sub26_Sub6.aClass79_Sub1_Sub2_3, Class429.aClass79_Sub1_Sub2_5, Class265.aClass79_Sub1_Sub2_4 });
			Class30.aClass32_Sub16_1 = new Class32_Sub16(client.aClass702_4, Class106.aClass717_8, Class166_Sub45.aClass497_60, Class96.aMap9);
			Class506.anInterface21_4 = new Class367();
			Class283.method26476(Class200.aClass497_96, Class86.aClass497_15, Class110_Sub7.aClass497_22, Class633.aClass497_137);
			Class81.aClass451_1 = new Class451(Class75.aClass497_11);
			Class283.aClass444_1 = new Class444(Class577.aClass497_130);
			Class599.aClass438_1 = new Class438(Class577.aClass497_130);
			Class449.aClass514_1 = new Class514(Class106.aClass717_8, Class486.aClass497_123, Class304.aClass497_101);
			Class372.aClass58_2 = new Class58(Class106.aClass717_8, Class486.aClass497_123, Class304.aClass497_101, new Class452());
			Class624.aClass120_1 = new Class120(Class21.aClass79_Sub1_Sub1_1, Class30.aClass32_Sub16_1, Class336.aClass644_1.method32594());
			Class610.method32021();
			Class450.method28938(Class32.aClass32_Sub17_23);
			Class120.method8671(Class599.aClass438_1, Class283.aClass444_1);
			Class711.method36813(Class86.aClass497_15, Class619.aClass225_8, Class636.anInterface24_10);
			@Pc(1211) Class337 local1211 = new Class337(Class40.aClass497_4.method30071("huffman", ""));
			Class339.method27489(local1211);
			Class553.aClass147_2 = Class450.method28933();
			Class125_Sub3.aClass93_Sub42_1 = new Class93_Sub42(true);
		}
		if (Class370.aClass370_20 == Class146.aClass370_3) {
			local6 = Class96_Sub3.method2329(Class110_Sub7.aClass497_22) + Class157.aClass462_2.method29267(true);
			local290 = Class15.method213() + Class157.aClass462_2.method29239();
			if (local6 < local290) {
				return local6 * 100 / local290;
			}
		}
		if (Class146.aClass370_3 == Class370.aClass370_16) {
			Class159.method14503(Class144_Sub1.aClass497_42, Class710.aClass497_143, Class682.aClass32_Sub1_3, Class692.aClass32_Sub4_3, client.aClass532_1.method30466(), Class542.aClass32_Sub2_3, Class466.aClass32_Sub20_3, Class624.aClass120_1, Class624.aClass120_1);
		}
		if (Class146.aClass370_3 == Class370.aClass370_17) {
			Class596.aClass113_Sub1_1 = new Class113_Sub1(Class72.aClass79_Sub1_Sub2_2);
			Class605.method31905();
			Class266.aClass306_1 = Class166_Sub29.method16069();
			Class166_Sub15.aClass497_59.method30065(false, true);
			Class110_Sub7.aClass497_22.method30065(true, true);
			Class633.aClass497_137.method30065(true, true);
			Class40.aClass497_4.method30065(true, true);
			client.aBoolean603 = true;
		}
		if (Class146.aClass370_3 == Class370.aClass370_18 && Class93_Sub26.aClass645_15.anInt5766 * -221025663 != -1) {
			if (!Class383.method28145(Class93_Sub26.aClass645_15.anInt5766 * -221025663, null)) {
				return 0;
			}
			local115 = true;
			for (local290 = 0; local290 < Class166_Sub1.aClass320Array1[Class93_Sub26.aClass645_15.anInt5766 * -221025663].aClass312Array3.length; local290++) {
				@Pc(1343) Class312 local1343 = Class166_Sub1.aClass320Array1[Class93_Sub26.aClass645_15.anInt5766 * -221025663].aClass312Array3[local290];
				if (local1343.anInt3971 * -158526639 == 5 && local1343.anInt3995 * -1566573331 != -1 && !Class110_Sub7.aClass497_22.method30053(local1343.anInt3995 * -1566573331, 0)) {
					local115 = false;
				}
			}
			if (!local115) {
				return 0;
			}
		}
		if (Class370.aClass370_19 == Class146.aClass370_3) {
			Class138.method11537(true);
		}
		if (Class146.aClass370_3 == Class370.aClass370_6) {
			Class653.aClass357_1.method27742();
			try {
				Class362.aThread6.join();
			} catch (@Pc(1388) InterruptedException local1388) {
				return 0;
			}
			Class653.aClass357_1 = null;
			Class362.aThread6 = null;
			Class17.aClass497_2 = null;
			Class7.aClass497_1 = null;
			Class363.aClass81_1 = null;
			Class362.anInterface30Array1 = null;
			Class14.aMap1.remove(Class31.aClass31_28);
			Class14.aMap1.remove(Class31.aClass31_7);
			Class14.aMap1.remove(Class31.aClass31_29);
			Class699.method36707();
			client.aBoolean595 = Class51.aClass93_Sub36_1.aClass166_Sub45_1.method16505() == 1;
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 1);
			if (client.aBoolean595) {
				Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0);
			} else if (Class51.aClass93_Sub36_1.aClass166_Sub4_1.aBoolean365 && Class125_Sub3.aClass93_Sub42_1.anInt2055 * 714183489 < 512 && Class125_Sub3.aClass93_Sub42_1.anInt2055 * 714183489 != 0) {
				Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0);
			}
			Class106_Sub1.method5148();
			if (client.aBoolean595) {
				Class543.method30948(0, false);
				if (!client.aBoolean606) {
					Class481.method29755(Class73.aClass73_10);
				}
			} else {
				Class543.method30948(Class51.aClass93_Sub36_1.aClass166_Sub4_1.method15424(), false);
				if (Class51.aClass93_Sub36_1.aClass166_Sub4_1.method15424() == 0) {
					Class481.method29755(Class73.aClass73_11);
				}
			}
			Class717.method36895(Class51.aClass93_Sub36_1.aClass166_Sub23_1.method15844(), -1, -1, false);
			Class157.aClass462_2.method29236(client.anInterface50_1);
			Class520.method30339(Class694.aClass104_14);
			Class379.method28101(Class694.aClass104_14, Class110_Sub7.aClass497_22);
		}
		return Class300.method26717();
	}

	@OriginalMember(owner = "client!rm", name = "q", descriptor = "(Lclient!hf;III)V", line = 534)
	static void method30606(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (client.aBoolean625) {
			@Pc(16) Class87 local16 = (Class87) (Class650.anInt5797 * -759562015 == -1 ? null : Class124.aClass32_Sub21_7.method18261(Class650.anInt5797 * -759562015));
			if (client.method25238(arg0).method13637() && (Class253.anInt3851 * 735260021 & 0x20) != 0 && (local16 == null || arg0.method26858(Class650.anInt5797 * -759562015, local16.anInt265 * 951920133) != local16.anInt265 * 951920133)) {
				Class280.method26458(client.aString145, client.aString142 + " " + Class430.aString206 + " " + arg0.aString165, Class271.anInt3885 * -308125347, 58, arg0.anInt4045 * 307668159, 0L, arg0.anInt3970 * 532402067, arg0.anInt3953 * -1549590237, true, false, (long) (arg0.anInt3970 * 532402067 << 0 | arg0.anInt3953 * -1549590237), false);
			}
		}
		for (@Pc(96) int local96 = 9; local96 >= 5; local96--) {
			@Pc(104) String local104 = Class255.method26009(arg0, local96);
			if (local104 != null) {
				Class280.method26458(local104, arg0.aString165, Class93_Sub32.method13929(arg0, local96), 1007, arg0.anInt4045 * 307668159, (long) (local96 + 1), arg0.anInt3970 * 532402067, arg0.anInt3953 * -1549590237, true, false, (long) (arg0.anInt3970 * 532402067 << 0 | arg0.anInt3953 * -1549590237), false);
			}
		}
		@Pc(154) String local154 = Class629.method32264(arg0);
		if (local154 != null) {
			Class280.method26458(local154, arg0.aString165, arg0.anInt4032 * -91207751, 25, arg0.anInt4045 * 307668159, 0L, arg0.anInt3970 * 532402067, arg0.anInt3953 * -1549590237, true, false, (long) (arg0.anInt3970 * 532402067 << 0 | arg0.anInt3953 * -1549590237), false);
		}
		for (@Pc(196) int local196 = 4; local196 >= 0; local196--) {
			@Pc(203) String local203 = Class255.method26009(arg0, local196);
			if (local203 != null) {
				Class280.method26458(local203, arg0.aString165, Class93_Sub32.method13929(arg0, local196), 57, arg0.anInt4045 * 307668159, (long) (local196 + 1), arg0.anInt3970 * 532402067, arg0.anInt3953 * -1549590237, true, false, (long) (arg0.anInt3970 * 532402067 << 0 | arg0.anInt3953 * -1549590237), false);
			}
		}
		if (!client.method25238(arg0).method13618()) {
			return;
		}
		if (arg0.aString163 == null) {
			Class280.method26458(Class74.aClass74_18.method1259(Class106.aClass717_8), "", -1, 30, arg0.anInt4045 * 307668159, 0L, arg0.anInt3970 * 532402067, arg0.anInt3953 * -1549590237, true, false, (long) (arg0.anInt3970 * 532402067 << 0 | arg0.anInt3953 * -1549590237), false);
		} else {
			Class280.method26458(arg0.aString163, "", -1, 30, arg0.anInt4045 * 307668159, 0L, arg0.anInt3970 * 532402067, arg0.anInt3953 * -1549590237, true, false, (long) (arg0.anInt3970 * 532402067 << 0 | arg0.anInt3953 * -1549590237), false);
		}
	}

	@OriginalMember(owner = "client!rm", name = "fi", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 5912)
	static final void method30602(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2) {
		arg0.aBoolean687 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] == 1;
		Class354.method27696(arg0);
	}

	@OriginalMember(owner = "client!rm", name = "oy", descriptor = "(Lclient!yf;I)V", line = 7602)
	static final void method30603(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class642.method32518(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!rm", name = "sd", descriptor = "(Lclient!yf;S)V", line = 8277)
	static final void method30607(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local11.anInt4045 * 307668159;
	}

	@OriginalMember(owner = "client!rm", name = "mp", descriptor = "(II)V", line = 12498)
	public static void method30605(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = client.aList4.indexOf(arg0);
		if (local4 == -1) {
			client.aList4.add(arg0);
		}
	}

	@OriginalMember(owner = "client!rm", name = "bfs", descriptor = "(Lclient!yf;I)V", line = 15152)
	static final void method30608(@OriginalArg(0) Class681 arg0) {
	}
}
