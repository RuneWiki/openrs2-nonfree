package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ez")
public class Class164 {

	@OriginalMember(owner = "client!ez", name = "p", descriptor = "Lclient!ez;")
	static final Class164 aClass164_3 = new Class164(5);

	@OriginalMember(owner = "client!ez", name = "a", descriptor = "Lclient!ez;")
	static final Class164 aClass164_2 = new Class164(2);

	@OriginalMember(owner = "client!ez", name = "g", descriptor = "Lclient!ez;")
	static final Class164 aClass164_1 = new Class164(3);

	@OriginalMember(owner = "client!ez", name = "l", descriptor = "Lclient!ez;")
	static final Class164 aClass164_4 = new Class164(0);

	@OriginalMember(owner = "client!ez", name = "h", descriptor = "Lclient!ez;")
	static final Class164 aClass164_5 = new Class164(4);

	@OriginalMember(owner = "client!ez", name = "x", descriptor = "Lclient!ez;")
	static final Class164 aClass164_6 = new Class164(1);

	@OriginalMember(owner = "client!ez", name = "s", descriptor = "I")
	final int anInt3450;

	@OriginalMember(owner = "client!ez", name = "<init>", descriptor = "(I)V", line = 13)
	Class164(@OriginalArg(0) int arg0) {
		this.anInt3450 = arg0 * -1301133565;
	}

	@OriginalMember(owner = "client!ez", name = "p", descriptor = "(B)I", line = 18)
	int method23300() {
		return aClass164_3 == this ? -1 : this.anInt3450 * 1408883627 | 0x1000000;
	}

	@OriginalMember(owner = "client!ez", name = "a", descriptor = "()I", line = 18)
	int method23301() {
		return aClass164_3 == this ? -1 : this.anInt3450 * 1408883627 | 0x1000000;
	}

	@OriginalMember(owner = "client!ez", name = "l", descriptor = "(Lclient!ahb;II)Ljava/lang/String;", line = 31)
	static String method23305(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = arg0.method20334();
			if (local3 > arg1) {
				local3 = arg1;
			}
			@Pc(11) byte[] local11 = new byte[local3];
			arg0.anInt2803 += Class154.aClass205_1.method24179(arg0.aByteArray51, arg0.anInt2803 * 62066237, local11, 0, local3) * -918980331;
			return Class60_Sub7.method13289(local11, 0, local3);
		} catch (@Pc(39) Exception local39) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ez", name = "y", descriptor = "(B)I", line = 335)
	static int method23306() {
		@Pc(6) int local6;
		if (Class510.aClass3_Sub45_37.aClass60_Sub26_1.method13832() == 0) {
			for (local6 = 0; local6 < client.anInt3154 * 1723265727; local6++) {
				if (client.anInterface46Array1[local6].method11581() == 's' || client.anInterface46Array1[local6].method11581() == 'S') {
					Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub26_1, 1);
					client.aBoolean568 = true;
					Class10.method715(Class600.aClass600_5);
					break;
				}
			}
		}
		if (Class602.aClass218_20 == Class218.aClass218_16) {
			if (Class626.aClass334_1 == null) {
				Class626.aClass334_1 = new Class334(Class117.aClass51_2, Class571.aClass348_3, Class398.aClass347_3, Class361.aBigInteger5, Class361.aBigInteger8);
			}
			if (!Class626.aClass334_1.method26276()) {
				return 0;
			}
			Class315.method25834(0, null, true);
			Class85.aBoolean534 = !Class357.method26657();
			Class231.aClass359_46 = Class273.method25350(Class85.aBoolean534 ? Class188.aClass188_31 : Class188.aClass188_29, false, 1, true);
			Class228.aClass359_43 = Class273.method25350(Class188.aClass188_30, false, 1, true);
			Class475.aClass359_86 = Class273.method25350(Class188.aClass188_36, false, 1, true);
		}
		@Pc(114) int local114;
		@Pc(106) boolean local106;
		if (Class218.aClass218_2 == Class602.aClass218_20) {
			local106 = Class228.aClass359_43.method26676();
			local114 = Class296.aClass46_Sub1Array1[Class188.aClass188_30.method23965()].method8535();
			@Pc(130) int local130 = local114 + Class296.aClass46_Sub1Array1[Class85.aBoolean534 ? Class188.aClass188_31.method23965() : Class188.aClass188_29.method23965()].method8535();
			@Pc(140) int local140 = local130 + Class296.aClass46_Sub1Array1[Class188.aClass188_36.method23965()].method8535();
			@Pc(150) int local150 = local140 + (local106 ? 100 : Class228.aClass359_43.method26706());
			if (local150 != 400) {
				return local150 / 4;
			}
			Class231.anInt3738 = Class231.aClass359_46.method26749() * -2087684995;
			Class379.anInt4703 = Class228.aClass359_43.method26749() * -1382923009;
			Class274.method25354(Class231.aClass359_46);
			@Pc(177) int local177 = Class510.aClass3_Sub45_37.aClass60_Sub19_1.method13635();
			Class231.aClass624_1 = new Class624(client.aClass543_2, Class469.aClass530_2, Class228.aClass359_43);
			@Pc(189) Class626[] local189 = Class231.aClass624_1.method33777(local177);
			if (local189.length == 0) {
				local189 = Class231.aClass624_1.method33777(0);
			}
			@Pc(204) Class224 local204 = new Class224(Class231.aClass359_46, Class475.aClass359_86);
			if (local189.length > 0) {
				Class231.anInterface18Array1 = new Interface18[local189.length];
				for (@Pc(213) int local213 = 0; local213 < Class231.anInterface18Array1.length; local213++) {
					Class231.anInterface18Array1[local213] = new Class227(Class231.aClass624_1.method33774(local189[local213].anInt5579 * 3021567), local189[local213].anInt5578 * 449796557, local189[local213].anInt5580 * 1290640577, local204);
				}
			}
		}
		if (Class218.aClass218_17 == Class602.aClass218_20) {
			Class379.aClass312_1 = new Class312(Class231.aClass359_46, Class475.aClass359_86, Class294.method25565());
		}
		if (Class602.aClass218_20 == Class218.aClass218_7) {
			local6 = Class379.aClass312_1.method25782();
			local114 = Class379.aClass312_1.method25784();
			if (local6 < local114) {
				return local6 * 100 / local114;
			}
		}
		if (Class218.aClass218_3 == Class602.aClass218_20) {
			if (Class231.anInterface18Array1 != null && Class231.anInterface18Array1.length > 0) {
				if (Class231.anInterface18Array1[0].method24490() < 100) {
					return 0;
				}
				if (Class231.anInterface18Array1.length > 1 && Class231.aClass624_1.method33776() && Class231.anInterface18Array1[1].method24490() < 100) {
					return 0;
				}
			}
			Class379.aClass312_1.method25797(client.anInterface34_1);
			Class134.method22909(Class613.aClass21_13);
			Class166.method23342(13);
		}
		if (Class218.aClass218_10 == Class602.aClass218_20) {
			Class294.aClass359_54 = Class273.method25350(Class188.aClass188_1, false, 1, true);
			Class491.aClass359_91 = Class273.method25350(Class188.aClass188_11, false, 1, true);
			Class602.aClass359_112 = Class273.method25350(Class188.aClass188_26, false, 1, true);
			Class73.aClass359_25 = Class273.method25350(Class188.aClass188_33, false, 1, true);
			Class453.aClass359_77 = Class273.method25350(Class188.aClass188_7, false, 1, true);
			Class430.aClass359_74 = Class273.method25350(Class188.aClass188_5, true, 1, true);
			Class55.aClass359_17 = Class273.method25350(Class188.aClass188_2, false, 1, true);
			Class72.aClass359_23 = Class273.method25350(Class188.aClass188_8, true, 1, true);
			Class13_Sub6.aClass359_2 = Class273.method25350(Class188.aClass188_34, true, 1, true);
			Class403.aClass359_66 = Class273.method25350(Class188.aClass188_9, false, 1, true);
			Class474.aClass359_85 = Class273.method25350(Class188.aClass188_10, false, 1, true);
			if (!Class202.aBoolean664) {
				Class462.aClass359_82 = Class273.method25350(Class188.aClass188_12, true, 1, false);
				Class427.aClass359_71 = Class273.method25350(Class188.aClass188_6, true, 1, false);
			}
			Class448.aClass359_76 = Class273.method25350(Class188.aClass188_37, false, 1, true);
			Class580.aClass359_105 = Class273.method25350(Class188.aClass188_14, false, 1, true);
			Class534.aClass359_97 = Class273.method25350(Class188.aClass188_4, false, 1, true);
			Class13_Sub18.aClass359_3 = Class273.method25350(Class188.aClass188_16, false, 1, true);
			Class27_Sub1.aClass359_4 = Class273.method25350(Class188.aClass188_17, false, 1, true);
			Class400.aClass359_64 = Class273.method25350(Class188.aClass188_18, false, 1, true);
			Class52.aClass359_16 = Class273.method25350(Class188.aClass188_19, false, 1, true);
			Class579.aClass359_102 = Class273.method25350(Class188.aClass188_20, true, 1, true);
			Class403.aClass359_65 = Class273.method25350(Class188.aClass188_21, false, 1, true);
			Class623.aClass359_116 = Class273.method25350(Class188.aClass188_13, false, 1, true);
			Class50_Sub1.aClass359_15 = Class273.method25350(Class188.aClass188_23, true, 1, true);
			Class485.aClass359_90 = Class273.method25350(Class188.aClass188_28, false, 1, true);
			Class276.aClass359_52 = Class273.method25350(Class188.aClass188_25, true, 1, true);
			Class161.aClass359_35 = Class273.method25350(Class188.aClass188_3, false, 1, true);
			Class329.aClass359_60 = Class273.method25350(Class188.aClass188_32, true, 1, true);
			Class557.aClass359_98 = Class273.method25350(Class188.aClass188_27, true, 1, true);
			Class127.aClass359_33 = Class273.method25350(Class188.aClass188_22, true, 1, true);
			Class343.aClass359_63 = Class273.method25350(Class188.aClass188_15, true, 2, true);
		}
		if (Class602.aClass218_20 == Class218.aClass218_5) {
			local6 = 0;
			for (local114 = 0; local114 < Class296.aClass46_Sub1Array1.length; local114++) {
				if (Class296.aClass46_Sub1Array1[local114] != null) {
					local6 += Class296.aClass46_Sub1Array1[local114].method8535() * Class231.anIntArray395[local114] / 100;
				}
			}
			if (local6 != 100) {
				if (Class231.anInt3740 * -384082965 < 0) {
					Class231.anInt3740 = local6 * -479726397;
				}
				return (local6 - Class231.anInt3740 * -384082965) * 100 / (100 - Class231.anInt3740 * -384082965);
			}
			Class438.method28215(Class294.aClass359_54);
			Class379.aClass312_1 = new Class312(Class294.aClass359_54, Class475.aClass359_86, Class294.method25565());
		}
		if (Class602.aClass218_20 == Class218.aClass218_12) {
			@Pc(654) byte[] local654 = Class276.aClass359_52.method26705(Class474.aClass474_1.anInt5121 * 152686723);
			if (local654 == null) {
				return 0;
			}
			Class510.aClass183_1 = new Class183();
			if (!Class202.aBoolean664) {
				Class510.aClass183_1.method23655(50, 7340032);
			}
			Class465.method28639(local654);
			Class166.method23342(8);
		}
		if (Class218.aClass218_4 == Class602.aClass218_20 && Class370.aClass417_1 == null) {
			Class370.aClass417_1 = new Class417(Class557.aClass359_98);
			Class121.method22822(Class370.aClass417_1);
		}
		if (Class602.aClass218_20 == Class218.aClass218_8) {
			local6 = Class181.method23546();
			if (local6 < 100) {
				return local6;
			}
			Class56.method12593(Class276.aClass359_52.method26705(Class474.aClass474_4.anInt5121 * 152686723));
			Class630.aClass493_1 = new Class493(Class276.aClass359_52);
			Class346.aShortArrayArray4 = Class630.aClass493_1.aShortArrayArray6;
			Class488.aShortArrayArrayArray5 = Class630.aClass493_1.aShortArrayArrayArray6;
			if (Class630.aClass493_1.anInt5227 * -1377571755 != -1 && Class630.aClass493_1.anInt5223 * 1140314633 != -1) {
				client.anInt3032 = Class630.aClass493_1.anInt5227 * 1629643639;
				client.anInt3131 = Class630.aClass493_1.anInt5223 * 308079217;
			}
			Class589.aClass489_2 = new Class489(Class276.aClass359_52);
			Class490.aClass494_1 = new Class494(Class276.aClass359_52);
			Class44.aClass483_5 = new Class483(Class276.aClass359_52);
			Class61.aClass495_2 = new Class495(Class276.aClass359_52);
			Class58.aClass484_2 = new Class484(Class276.aClass359_52);
		}
		if (Class218.aClass218_9 == Class602.aClass218_20) {
			if (Class630.aClass493_1.anInt5220 * -238210995 != -1 && !Class55.aClass359_17.method26673(Class630.aClass493_1.anInt5220 * -238210995, 0)) {
				return 99;
			}
			Class43_Sub5.aClass134_5 = new Class134(Class50_Sub1.aClass359_15);
			Class325.anInterface11_9 = new Class110(Class72.aClass359_23, Class13_Sub6.aClass359_2);
			Class3_Sub20.aClass625_1 = new Class625(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class399.aClass428_1 = new Class428(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class589.aClass489_2);
			FileFilter_Sub1.aClass597_1 = new Class597(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class294.aClass359_54);
			Class438.aClass589_1 = new Class589(client.aClass543_2, Class469.aClass530_2, Class580.aClass359_105);
			Class555.aClass499_5 = new Class499(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class598.aClass575_5 = new Class575(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class284.aClass465_1 = new Class465(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class294.aClass359_54);
			Class623.aClass415_2 = new Class415(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class294.aClass359_54);
			Class585.aClass228_2 = new Class228(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class55.aClass359_17);
			Class352.aClass621_1 = new Class621(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class16.aClass616_3 = new Class616(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class629.aClass457_11 = new Class457(client.aClass543_2, Class469.aClass530_2, true, Class448.aClass359_76, Class55.aClass359_17);
			client.aClass370_1.method27036(Class629.aClass457_11);
			Class30_Sub1.aClass379_1.method27251(new Class457(client.aClass543_2, Class469.aClass530_2, true, Class448.aClass359_76, Class55.aClass359_17));
			Class107.aClass454_3 = new Class454(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class294.aClass359_54);
			Class342.aClass629_3 = new Class629(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class294.aClass359_54);
			Class498.aClass579_1 = new Class579(client.aClass543_2, Class469.aClass530_2, true, Class534.aClass359_97, Class55.aClass359_17);
			Class44_Sub3.aClass596_1 = new Class596(client.aClass543_2, Class469.aClass530_2, true, Class3_Sub20.aClass625_1, Class13_Sub18.aClass359_3, Class55.aClass359_17);
			Class239.aClass505_1 = new Class505(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, true);
			Class279.aClass429_1 = new Class429(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class110.aClass436_1 = new Class436(client.aClass543_2, Class469.aClass530_2, Class27_Sub1.aClass359_4, Class491.aClass359_91, Class602.aClass359_112, Class279.aClass429_1);
			Class369.aClass413_1 = new Class413(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class375.aClass200_1 = new Class200(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25);
			Class19.aClass523_14 = new Class523(client.aClass543_2, Class469.aClass530_2, Class400.aClass359_64, Class55.aClass359_17);
			Class583.aClass609_1 = new Class609(client.aClass543_2, Class469.aClass530_2, Class52.aClass359_16, true);
			Class500.aClass70_Sub1_Sub2_12 = new Class70_Sub1_Sub2(client.aClass543_2, Class43.aClass43_60, Class469.aClass530_2, Class73.aClass359_25);
			Class429.aClass70_Sub1_Sub1_2 = new Class70_Sub1_Sub1(client.aClass543_2, Class43.aClass43_68, Class469.aClass530_2, Class73.aClass359_25);
			Class419.aClass70_Sub1_Sub2_11 = new Class70_Sub1_Sub2(client.aClass543_2, Class43.aClass43_62, Class469.aClass530_2, Class73.aClass359_25);
			Class69.aClass70_Sub1_Sub2_9 = new Class70_Sub1_Sub2(client.aClass543_2, Class43.aClass43_64, Class469.aClass530_2, Class73.aClass359_25);
			Class135.aClass70_Sub1_Sub2_10 = new Class70_Sub1_Sub2(client.aClass543_2, Class43.aClass43_59, Class469.aClass530_2, Class73.aClass359_25);
			Class499.aMap13 = Class330.method26173(new Class70_Sub1[] { Class500.aClass70_Sub1_Sub2_12, Class429.aClass70_Sub1_Sub1_2, Class419.aClass70_Sub1_Sub2_11, Class69.aClass70_Sub1_Sub2_9, Class135.aClass70_Sub1_Sub2_10 });
			Class308.aClass70_Sub2_3 = new Class70_Sub2(client.aClass543_2, Class469.aClass530_2, Class73.aClass359_25, Class499.aMap13);
			Class548.anInterface9_4 = new Class216();
			Class43_Sub1.method8382(Class453.aClass359_77, Class55.aClass359_17, Class294.aClass359_54, Class475.aClass359_86);
			Class291.method25542(Class161.aClass359_35);
			Class13_Sub23.aClass343_1 = new Class343(Class469.aClass530_2, Class403.aClass359_65, Class623.aClass359_116);
			Class622.aClass580_2 = new Class580(Class469.aClass530_2, Class403.aClass359_65, Class623.aClass359_116, new Class288());
			Class424.aClass165_1 = new Class165(Class429.aClass70_Sub1_Sub1_2, Class308.aClass70_Sub2_3, Class490.aClass494_1.method29304());
			Class457.method28515();
			Class160.method23213(Class110.aClass436_1);
			Class446.method28354(Class485.aClass359_90);
			Class30.method16448(Class55.aClass359_17, Class43_Sub5.aClass134_5, Class325.anInterface11_9);
			@Pc(1128) Class205 local1128 = new Class205(Class403.aClass359_66.method26691("huffman", ""));
			Class57.method12277(local1128);
			Class265.aClass47_1 = Class273.method25343();
			Class298.aClass3_Sub47_1 = new Class3_Sub47(true);
		}
		if (Class602.aClass218_20 == Class218.aClass218_1) {
			local6 = Class21.method17428(Class294.aClass359_54) + Class379.aClass312_1.method25781(true);
			local114 = Class513.method29602() + Class379.aClass312_1.method25784();
			if (local6 < local114) {
				return local6 * 100 / local114;
			}
		}
		if (Class218.aClass218_11 == Class602.aClass218_20) {
			Class58.method12384(Class579.aClass359_102, Class555.aClass499_5, Class598.aClass575_5, client.aClass370_1.method26954(), Class107.aClass454_3, Class342.aClass629_3, Class424.aClass165_1, Class424.aClass165_1);
		}
		if (Class218.aClass218_6 == Class602.aClass218_20) {
			Class302.aClass10_Sub1_1 = new Class10_Sub1(Class500.aClass70_Sub1_Sub2_12);
			Class180.method23541();
			Class430.aClass359_74.method26748(false, true);
			Class294.aClass359_54.method26748(true, true);
			Class475.aClass359_86.method26748(true, true);
			Class403.aClass359_66.method26748(true, true);
			client.aBoolean576 = true;
		}
		if (Class218.aClass218_13 == Class602.aClass218_20 && Class630.aClass493_1.anInt5221 * 376354043 != -1) {
			if (!Class33.method7569(Class630.aClass493_1.anInt5221 * 376354043, null)) {
				return 0;
			}
			local106 = true;
			for (local114 = 0; local114 < Class178.aClass186Array1[Class630.aClass493_1.anInt5221 * 376354043].aClass178Array8.length; local114++) {
				@Pc(1256) Class178 local1256 = Class178.aClass186Array1[Class630.aClass493_1.anInt5221 * 376354043].aClass178Array8[local114];
				if (local1256.anInt3492 * -107621169 == 5 && local1256.anInt3509 * 1314053873 != -1 && !Class294.aClass359_54.method26673(local1256.anInt3509 * 1314053873, 0)) {
					local106 = false;
				}
			}
			if (!local106) {
				return 0;
			}
		}
		if (Class602.aClass218_20 == Class218.aClass218_14) {
			Class392.method27428(true);
		}
		if (Class602.aClass218_20 == Class218.aClass218_15) {
			Class5.aClass221_4.method24396();
			try {
				Class383.aThread8.join();
			} catch (@Pc(1301) InterruptedException local1301) {
				return 0;
			}
			Class5.aClass221_4 = null;
			Class383.aThread8 = null;
			Class231.aClass359_46 = null;
			Class228.aClass359_43 = null;
			Class231.aClass624_1 = null;
			Class231.anInterface18Array1 = null;
			Class215.method24293();
			client.aBoolean567 = Class510.aClass3_Sub45_37.aClass60_Sub26_1.method13832() == 1;
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub26_1, 1);
			if (client.aBoolean567) {
				Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 0);
			} else if (Class510.aClass3_Sub45_37.aClass60_Sub10_1.aBoolean338 && Class298.aClass3_Sub47_1.anInt1811 * 573273029 < 512 && Class298.aClass3_Sub47_1.anInt1811 * 573273029 != 0) {
				Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 0);
			}
			Class26_Sub1_Sub1_Sub1.method16728();
			if (client.aBoolean567) {
				Class546.method32647(0, false);
				if (!client.aBoolean568) {
					Class10.method715(Class600.aClass600_15);
				}
			} else {
				Class546.method32647(Class510.aClass3_Sub45_37.aClass60_Sub10_1.method13373(), false);
				if (Class510.aClass3_Sub45_37.aClass60_Sub10_1.method13373() == 0) {
					Class10.method715(Class600.aClass600_10);
				}
			}
			Class157.method23193(Class510.aClass3_Sub45_37.aClass60_Sub11_1.method13403(), -1, -1, false);
			Class379.aClass312_1.method25797(client.anInterface34_1);
			Class134.method22909(Class613.aClass21_13);
			Class551.method32694(Class613.aClass21_13, Class294.aClass359_54);
			Class618.method33710(Class19_Sub1.aClass6Array10);
		}
		return Class438.method28213();
	}

	@OriginalMember(owner = "client!ez", name = "au", descriptor = "(Lclient!vs;I)V", line = 4125)
	static final void method23302(@OriginalArg(0) Class536 arg0) {
		@Pc(7) int local7 = arg0.anIntArray497[arg0.anInt5318 * -2140198955];
		arg0.anInt5319 -= 624249098;
		@Pc(21) int local21 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		if (local21 < 0 || local21 >= arg0.anIntArray495[local7]) {
			throw new RuntimeException();
		}
		arg0.anIntArrayArray62[local7][local21] = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
	}

	@OriginalMember(owner = "client!ez", name = "aht", descriptor = "(Lclient!vs;I)V", line = 10244)
	static final void method23303(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		if (Class552.aBoolean823) {
			Class157.method23193(3, local13, local23, false);
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class350.aFrame3 == null ? 0 : 1;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!ez", name = "aky", descriptor = "(Lclient!vs;I)V", line = 10863)
	static final void method23304(@OriginalArg(0) Class536 arg0) {
		if (Class80.aClass23_Sub1_1.method5887() != Class204.aClass204_3) {
			throw new RuntimeException();
		}
		@Pc(13) Class30_Sub3 local13 = (Class30_Sub3) Class80.aClass23_Sub1_1.method5827();
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) ((double) local13.method7830() * 2607.5945876176133D) & 0x3FFF;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) ((double) local13.method7848() * 2607.5945876176133D) & 0x3FFF;
	}
}
