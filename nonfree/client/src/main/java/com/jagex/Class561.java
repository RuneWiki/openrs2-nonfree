package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public class Class561 {

	@OriginalMember(owner = "client!tr", name = "y", descriptor = "I")
	static final int anInt5287 = 4;

	@OriginalMember(owner = "client!tr", name = "u", descriptor = "I")
	static final int anInt5288 = 13;

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
	static final int anInt5289 = 3;

	@OriginalMember(owner = "client!tr", name = "v", descriptor = "I")
	static final int anInt5290 = 2;

	@OriginalMember(owner = "client!tr", name = "w", descriptor = "I")
	static final int anInt5291 = 5;

	@OriginalMember(owner = "client!tr", name = "t", descriptor = "I")
	static final int anInt5292 = 2;

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
	static final int anInt5293 = 3;

	@OriginalMember(owner = "client!tr", name = "x", descriptor = "I")
	static final int anInt5294 = 4;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
	static final int anInt5295 = 5;

	@OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
	static final int anInt5297 = 7;

	@OriginalMember(owner = "client!tr", name = "z", descriptor = "I")
	static final int anInt5298 = 9;

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
	static final int anInt5300 = 11;

	@OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
	static final int anInt5301 = 10;

	@OriginalMember(owner = "client!tr", name = "s", descriptor = "I")
	static final int anInt5302 = 6;

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
	static final int anInt5303 = 14;

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
	static final int anInt5304 = 15;

	@OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
	static final int anInt5305 = 16;

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
	public static final int anInt5306 = 31;

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
	static final int anInt5308 = 1;

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
	public static final int anInt5310 = 0;

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
	static final int anInt5314 = 8;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
	static final int anInt5315 = 12;

	@OriginalMember(owner = "client!tr", name = "au", descriptor = "I")
	int anInt5296;

	@OriginalMember(owner = "client!tr", name = "ag", descriptor = "I")
	int anInt5299;

	@OriginalMember(owner = "client!tr", name = "n", descriptor = "Lclient!ajv;")
	public Class77_Sub22 aClass77_Sub22_3;

	@OriginalMember(owner = "client!tr", name = "al", descriptor = "I")
	int anInt5311;

	@OriginalMember(owner = "client!tr", name = "ak", descriptor = "I")
	int anInt5313;

	@OriginalMember(owner = "client!tr", name = "ar", descriptor = "I")
	int anInt5309 = -1682295449;

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
	public int anInt5307;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "Z")
	boolean aBoolean798;

	@OriginalMember(owner = "client!tr", name = "m", descriptor = "Z")
	boolean aBoolean799;

	@OriginalMember(owner = "client!tr", name = "aj", descriptor = "[S")
	short[] aShortArray142;

	@OriginalMember(owner = "client!tr", name = "ai", descriptor = "I")
	public int anInt5286;

	@OriginalMember(owner = "client!tr", name = "ao", descriptor = "I")
	int anInt5312;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!dx;ILclient!akv;I)V", line = 46)
	public Class561(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub39 arg2, @OriginalArg(3) int arg3) {
		if (Class542.anIntArray484 == null) {
			Class367.method28146();
		}
		this.anInt5307 = arg2.method22478() * 725934419;
		this.aBoolean798 = (this.anInt5307 * 551684827 & 0x8) != 0;
		this.aBoolean799 = (this.anInt5307 * 551684827 & 0x10) != 0;
		this.anInt5307 = (this.anInt5307 * 551684827 & 0x7) * 725934419;
		@Pc(56) int local56 = arg2.method22483() << arg3;
		@Pc(62) int local62 = arg2.method22483() << arg3;
		@Pc(68) int local68 = arg2.method22483() << arg3;
		@Pc(72) int local72 = arg2.method22478();
		@Pc(78) int local78 = local72 * 2 + 1;
		this.aShortArray142 = new short[local78];
		@Pc(84) int local84;
		for (local84 = 0; local84 < this.aShortArray142.length; local84++) {
			@Pc(94) short local94 = (short) arg2.method22483();
			@Pc(98) int local98 = local94 >>> 8;
			@Pc(102) int local102 = local94 & 0xFF;
			if (local98 >= local78) {
				local98 = local78 - 1;
			}
			if (local102 > local78 - local98) {
				local102 = local78 - local98;
			}
			this.aShortArray142[local84] = (short) (local98 << 8 | local102);
		}
		local72 = (local72 << arg1) + (0x1 << arg1 >> 1);
		local84 = Class656.anIntArray532 == null ? Class424.anIntArray462[Class340.method27746(arg2.method22483()) & 0xFFFF] : Class656.anIntArray532[arg2.method22483()];
		@Pc(163) int local163 = arg2.method22478();
		this.anInt5286 = (local163 & 0x1F) * -1397346521;
		this.anInt5312 = ((local163 & 0xE0) << 3) * -1243202849;
		if (this.anInt5286 * -1065201513 != 31) {
			this.method31298();
		}
		this.anInt5309 = arg2.method22487() * 1682295449;
		this.method31293(arg0, local56, local68, local62, local72, local84);
	}

	@OriginalMember(owner = "client!tr", name = "s", descriptor = "(Lclient!yf;S)V", line = 56)
	static void method31291(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1] = ((Class303) Class252.aClass42_Sub2_1.method18319(arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1])).method27174(Class55.aClass124_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!tr", name = "w", descriptor = "(Lclient!dx;IIIII)V", line = 77)
	void method31292(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass77_Sub22_3 = arg0.method20026(arg1, arg2, arg3, arg4, arg5, 1.0F);
	}

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "(Lclient!dx;IIIIIS)V", line = 77)
	void method31293(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass77_Sub22_3 = arg0.method20026(arg1, arg2, arg3, arg4, arg5, 1.0F);
	}

	@OriginalMember(owner = "client!tr", name = "v", descriptor = "(B)V", line = 80)
	public static void method31294() {
		Class609.aClass83_38 = null;
		Class156.anInt3238 = 1312565957;
	}

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "(IIIII)V", line = 81)
	public void method31295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5299 = arg0 * -404288561;
		this.anInt5296 = arg3 * 79930929;
		this.anInt5313 = arg2 * -1948643261;
		this.anInt5311 = arg1 * 1970030293;
	}

	@OriginalMember(owner = "client!tr", name = "t", descriptor = "(IIII)V", line = 81)
	public void method31296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5299 = arg0 * -404288561;
		this.anInt5296 = arg3 * 79930929;
		this.anInt5313 = arg2 * -1948643261;
		this.anInt5311 = arg1 * 1970030293;
	}

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "(IIII)V", line = 81)
	public void method31297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5299 = arg0 * -404288561;
		this.anInt5296 = arg3 * 79930929;
		this.anInt5313 = arg2 * -1948643261;
		this.anInt5311 = arg1 * 1970030293;
	}

	@OriginalMember(owner = "client!tr", name = "v", descriptor = "(I)V", line = 88)
	void method31298() {
		switch(this.anInt5286 * -1065201513) {
			case 2:
				this.anInt5299 = -404288561;
				this.anInt5296 = 0;
				this.anInt5313 = -796780544;
				this.anInt5311 = 1647749120;
				break;
			case 3:
				this.anInt5299 = -404288561;
				this.anInt5296 = 0;
				this.anInt5313 = -796780544;
				this.anInt5311 = -999469056;
				break;
			case 4:
				this.anInt5299 = -1617154244;
				this.anInt5296 = 0;
				this.anInt5313 = -796780544;
				this.anInt5311 = 1647749120;
				break;
			case 5:
				this.anInt5299 = -1617154244;
				this.anInt5296 = 0;
				this.anInt5313 = -796780544;
				this.anInt5311 = -1998938112;
				break;
			case 6:
				this.anInt5299 = -1212865683;
				this.anInt5296 = -767625984;
				this.anInt5313 = -1909405440;
				this.anInt5311 = 1647749120;
				break;
			case 7:
				this.anInt5299 = -1212865683;
				this.anInt5296 = -767625984;
				this.anInt5313 = -1909405440;
				this.anInt5311 = -999469056;
				break;
			case 8:
				this.anInt5299 = -1212865683;
				this.anInt5296 = 244892672;
				this.anInt5313 = 1749093376;
				this.anInt5311 = 1647749120;
				break;
			case 9:
				this.anInt5299 = -1212865683;
				this.anInt5296 = 244892672;
				this.anInt5313 = 1749093376;
				this.anInt5311 = -999469056;
				break;
			case 10:
				this.anInt5299 = -1212865683;
				this.anInt5296 = -1780144640;
				this.anInt5313 = -1272936960;
				this.anInt5311 = 1647749120;
				break;
			case 11:
				this.anInt5299 = -1212865683;
				this.anInt5296 = -1780144640;
				this.anInt5313 = -1272936960;
				this.anInt5311 = -999469056;
				break;
			case 12:
				this.anInt5299 = -808577122;
				this.anInt5296 = 0;
				this.anInt5313 = -796780544;
				this.anInt5311 = 1647749120;
				break;
			case 13:
				this.anInt5299 = -808577122;
				this.anInt5296 = 0;
				this.anInt5313 = -796780544;
				this.anInt5311 = -1998938112;
				break;
			case 14:
				this.anInt5299 = -404288561;
				this.anInt5296 = -767625984;
				this.anInt5313 = -1909405440;
				this.anInt5311 = 1647749120;
				break;
			case 15:
				this.anInt5299 = -404288561;
				this.anInt5296 = -1780144640;
				this.anInt5313 = -1272936960;
				this.anInt5311 = -999469056;
				break;
			case 16:
				this.anInt5299 = -404288561;
				this.anInt5296 = 1502304000;
				this.anInt5313 = -636468480;
				this.anInt5311 = -1998938112;
				break;
			default:
				this.anInt5296 = 0;
				this.anInt5299 = 0;
				this.anInt5313 = -796780544;
				this.anInt5311 = 1647749120;
		}
	}

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "(IZI)V", line = 190)
	void method31299(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(28) int local28;
		if (arg1) {
			local28 = 2048;
		} else {
			@Pc(17) int local17 = this.anInt5311 * 1285866109 * arg0 / 50 + this.anInt5312 * 765198623 & 0x7FF;
			switch(this.anInt5299 * -1278600401) {
				case 1:
					local28 = (Class436.anIntArray464[local17 << 3] >> 4) + 1024;
					break;
				case 2:
					local28 = local17;
					break;
				case 3:
					local28 = Class542.anIntArray484[local17] >> 1;
					break;
				case 4:
					local28 = local17 >> 10 << 11;
					break;
				case 5:
					local28 = (local17 < 1024 ? local17 : 2048 - local17) << 1;
					break;
				default:
					local28 = 2048;
			}
		}
		this.aClass77_Sub22_3.method13564((float) ((local28 * this.anInt5313 * 1187953771 >> 11) + this.anInt5296 * 1109127889) / 2048.0F);
		this.aClass77_Sub22_3.method13582();
	}

	@OriginalMember(owner = "client!tr", name = "x", descriptor = "()V", line = 219)
	static void method31300() {
		Class542.anIntArray484 = Class96_Sub2.method7091(2048, 35, 8, 8, 4, 0.4F, true);
	}

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "()V", line = 219)
	static void method31301() {
		Class542.anIntArray484 = Class96_Sub2.method7091(2048, 35, 8, 8, 4, 0.4F, true);
	}

	@OriginalMember(owner = "client!tr", name = "ny", descriptor = "(Lclient!yf;I)V", line = 7065)
	static final void method31302(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class562.method31324(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!tr", name = "zc", descriptor = "(Lclient!yf;B)V", line = 9100)
	static final void method31303(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(28) boolean local28 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] == 1;
		@Pc(38) int local38 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(43) Class241 local43 = client.aClass243_1.method26054(local13);
		if (local43.method26002() == null) {
			local43.method25999(client.anInterface26_1);
		}
		if (!local28) {
			@Pc(144) Class343 local144 = (Class343) Class61.aClass35_Sub11_1.method18319(local38);
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local144.method27799(local43.method26002().method131(local144.aClass75_1.anInt223 * -1270946121));
			return;
		}
		@Pc(59) Class75_Sub2 local59 = (Class75_Sub2) Class562.aClass80_Sub1_Sub1_2.method18319(local38);
		switch(local59.aClass498_6.aClass489_7.anInt5048 * 973874463) {
			case 3:
				arg0.aLongArray28[(arg0.anInt5782 += 1091885681) * 1572578961 - 1] = local43.method26002().method125(local59.anInt223 * -1270946121);
				break;
			case 4:
				arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local43.method26002().method131(local59.anInt223 * -1270946121);
				break;
			default:
				arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local43.method26002().method144(local59.anInt223 * -1270946121);
		}
	}

	@OriginalMember(owner = "client!tr", name = "adv", descriptor = "(Lclient!yf;I)V", line = 9777)
	static final void method31304(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class142.method14873((char) local12) ? 1 : 0;
	}

	@OriginalMember(owner = "client!tr", name = "aqs", descriptor = "(Lclient!yf;B)V", line = 12375)
	static final void method31305(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub13_1.method15359();
	}
}
