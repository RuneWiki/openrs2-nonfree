package com.jagex;

import jaclib.ping.Ping;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public class Class181 {

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "Lclient!fa;")
	Class166 aClass166_132;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "Lclient!fa;")
	Class166 aClass166_133;

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "Ljava/lang/String;")
	String aString175;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "Ljava/lang/String;")
	String aString176;

	@OriginalMember(owner = "client!fr", name = "x", descriptor = "[I")
	public int[] anIntArray373;

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "[I")
	public int[] anIntArray374;

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
	int anInt3584 = 1099668277;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V", line = 58)
	Class181() {
	}

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "(Lclient!fj;I)V", line = 61)
	void method23543(@OriginalArg(0) Class174 arg0) {
		@Pc(3) int local3 = arg0.method23393();
		this.aClass166_132 = Class366.method26906()[local3];
		@Pc(17) int local17;
		if (this.aClass166_132 == Class166.aClass166_93) {
			local17 = arg0.method23393();
			this.aClass166_133 = Class366.method26906()[local17];
			this.anInt3584 = arg0.method23393() * -1099668277;
		}
		this.aString175 = arg0.method23391();
		this.aString176 = arg0.method23391();
		local17 = arg0.method23393();
		this.anIntArray373 = new int[local17];
		this.anIntArray374 = new int[local17];
		for (@Pc(54) int local54 = 0; local54 < local17; local54++) {
			this.anIntArray373[local54] = arg0.method23393();
			this.anIntArray374[local54] = arg0.method23393();
		}
	}

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "(Lclient!fj;)V", line = 61)
	void method23544(@OriginalArg(0) Class174 arg0) {
		@Pc(3) int local3 = arg0.method23393();
		this.aClass166_132 = Class366.method26906()[local3];
		@Pc(17) int local17;
		if (this.aClass166_132 == Class166.aClass166_93) {
			local17 = arg0.method23393();
			this.aClass166_133 = Class366.method26906()[local17];
			this.anInt3584 = arg0.method23393() * -1099668277;
		}
		this.aString175 = arg0.method23391();
		this.aString176 = arg0.method23391();
		local17 = arg0.method23393();
		this.anIntArray373 = new int[local17];
		this.anIntArray374 = new int[local17];
		for (@Pc(54) int local54 = 0; local54 < local17; local54++) {
			this.anIntArray373[local54] = arg0.method23393();
			this.anIntArray374[local54] = arg0.method23393();
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!fj;)V", line = 61)
	void method23545(@OriginalArg(0) Class174 arg0) {
		@Pc(3) int local3 = arg0.method23393();
		this.aClass166_132 = Class366.method26906()[local3];
		@Pc(17) int local17;
		if (this.aClass166_132 == Class166.aClass166_93) {
			local17 = arg0.method23393();
			this.aClass166_133 = Class366.method26906()[local17];
			this.anInt3584 = arg0.method23393() * -1099668277;
		}
		this.aString175 = arg0.method23391();
		this.aString176 = arg0.method23391();
		local17 = arg0.method23393();
		this.anIntArray373 = new int[local17];
		this.anIntArray374 = new int[local17];
		for (@Pc(54) int local54 = 0; local54 < local17; local54++) {
			this.anIntArray373[local54] = arg0.method23393();
			this.anIntArray374[local54] = arg0.method23393();
		}
	}

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "(B)I", line = 69)
	public static int method23546() {
		if (Class331.anInt4593 * -374677527 == 0) {
			Class612.aClass612_2.method33630(new Class329("jaclib"));
			if (Class612.aClass612_2.method33629().method26162() != 100) {
				return 1;
			}
			if (!((Class329) Class612.aClass612_2.method33629()).method26165() && !Class36_Sub2.method8320()) {
				try {
					Class314.aClient1.method22259();
					Class445.method28339();
					Ping.init();
				} catch (@Pc(39) Exception_Sub6 local39) {
					Class47.method9237(Class603.aClass603_3, local39.aString71, local39.anInt2087 * -1308012799, local39.getCause());
				} catch (@Pc(52) Throwable local52) {
				}
			}
			Class331.anInt4593 = -1406801831;
		}
		@Pc(275) Class612[] local275;
		@Pc(277) int local277;
		@Pc(285) Class612 local285;
		@Pc(289) int local289;
		@Pc(295) int local295;
		if (Class331.anInt4593 * -374677527 == 1) {
			Class331.aClass612Array1 = Class612.method33637();
			Class612.aClass612_25.method33630(new Class324(Class276.aClass359_52));
			Class612.aClass612_3.method33630(new Class329("jaggl"));
			@Pc(81) Class329 local81 = new Class329("jagdx");
			if (!Class344.aString208.startsWith("win")) {
				local81.method26163();
			}
			Class612.aClass612_13.method33630(local81);
			Class612.aClass612_5.method33630(new Class329("sw3d"));
			Class612.aClass612_26.method33630(new Class329("hw3d"));
			@Pc(111) Class329 local111 = new Class329("jagtheora");
			local111.method26163();
			Class612.aClass612_7.method33630(local111);
			Class612.aClass612_4.method33630(new Class324(Class127.aClass359_33));
			Class612.aClass612_24.method33630(new Class324(Class50_Sub1.aClass359_15));
			Class612.aClass612_18.method33630(new Class324(Class73.aClass359_25));
			Class612.aClass612_10.method33630(new Class324(Class448.aClass359_76));
			Class612.aClass612_11.method33630(new Class324(Class580.aClass359_105));
			Class612.aClass612_20.method33630(new Class324(Class534.aClass359_97));
			Class612.aClass612_6.method33630(new Class324(Class13_Sub18.aClass359_3));
			Class612.aClass612_14.method33630(new Class324(Class27_Sub1.aClass359_4));
			Class612.aClass612_15.method33630(new Class324(Class400.aClass359_64));
			Class612.aClass612_16.method33630(new Class324(Class52.aClass359_16));
			Class612.aClass612_1.method33630(new Class324(Class403.aClass359_65));
			Class612.aClass612_8.method33630(new Class324(Class623.aClass359_116));
			Class612.aClass612_12.method33630(new Class324(Class485.aClass359_90));
			Class612.aClass612_17.method33630(new Class324(Class161.aClass359_35));
			Class612.aClass612_21.method33630(new Class318(Class403.aClass359_66, "huffman"));
			Class612.aClass612_19.method33630(new Class324(Class453.aClass359_77));
			Class612.aClass612_23.method33630(new Class324(Class474.aClass359_85));
			Class612.aClass612_22.method33630(new Class324(Class475.aClass359_86));
			Class612.aClass612_9.method33630(new Class325(Class579.aClass359_102, "details"));
			@Pc(255) int local255;
			for (local255 = 0; local255 < Class331.aClass612Array1.length; local255++) {
				if (Class331.aClass612Array1[local255].method33629() == null) {
					throw new RuntimeException();
				}
			}
			local255 = 0;
			local275 = Class331.aClass612Array1;
			for (local277 = 0; local277 < local275.length; local277++) {
				local285 = local275[local277];
				local289 = local285.method33627();
				local295 = local285.method33629().method26162();
				local255 += local289 * local295 / 100;
			}
			Class331.anInt4594 = local255 * 1841115227;
			Class331.anInt4593 = 1481363634;
		}
		if (Class331.aClass612Array1 == null) {
			return 100;
		}
		@Pc(317) int local317 = 0;
		@Pc(319) int local319 = 0;
		@Pc(321) boolean local321 = true;
		local275 = Class331.aClass612Array1;
		for (local277 = 0; local277 < local275.length; local277++) {
			local285 = local275[local277];
			local289 = local285.method33627();
			local295 = local285.method33629().method26162();
			if (local295 < 100) {
				local321 = false;
			}
			local317 += local289;
			local319 += local295 * local289 / 100;
		}
		if (local321) {
			if (!((Class329) Class612.aClass612_7.method33629()).method26165()) {
				try {
					Class314.aClient1.method22260();
				} catch (@Pc(376) Exception_Sub6 local376) {
				}
			}
			Class331.aClass612Array1 = null;
		}
		local319 -= Class331.anInt4594 * -1300463661;
		local317 -= Class331.anInt4594 * -1300463661;
		@Pc(400) int local400 = local317 > 0 ? local319 * 100 / local317 : 100;
		if (!local321 && local400 > 99) {
			local400 = 99;
		}
		return local400;
	}

	@OriginalMember(owner = "client!fr", name = "dl", descriptor = "(Lclient!vs;B)V", line = 4704)
	static final void method23549(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class537.method32551(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!fr", name = "ve", descriptor = "(Lclient!vs;I)V", line = 7964)
	static final void method23547(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1 != null && Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aClass488_1.aBoolean805 ? 1 : 0;
	}

	@OriginalMember(owner = "client!fr", name = "aqn", descriptor = "(Lclient!vs;B)V", line = 11846)
	static final void method23548(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(26) String local26 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		if (client.anInt3039 * 1115111877 == 18 && !Class146.method23084()) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class463.method28613(local12, local26) ? 1 : 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!fr", name = "arr", descriptor = "(Lclient!vs;B)V", line = 12156)
	static final void method23550(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class357.anInt4639 * 119438137;
	}
}
