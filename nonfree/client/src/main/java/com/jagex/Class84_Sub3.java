package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.misc.Unsafe;

@OriginalClass("client!aey")
public class Class84_Sub3 extends Class84 {

	@OriginalMember(owner = "client!aey", name = "l", descriptor = "I")
	static final int anInt768 = 4;

	@OriginalMember(owner = "client!aey", name = "y", descriptor = "I")
	static final int anInt785 = 7;

	@OriginalMember(owner = "client!aey", name = "cg", descriptor = "Lclient!kl;")
	static Class364 aClass364_1;

	@OriginalMember(owner = "client!aey", name = "ap", descriptor = "I")
	int anInt767;

	@OriginalMember(owner = "client!aey", name = "bf", descriptor = "[J")
	long[] aLongArray9;

	@OriginalMember(owner = "client!aey", name = "e", descriptor = "[S")
	short[] aShortArray27;

	@OriginalMember(owner = "client!aey", name = "x", descriptor = "S")
	short aShort22;

	@OriginalMember(owner = "client!aey", name = "d", descriptor = "S")
	short aShort23;

	@OriginalMember(owner = "client!aey", name = "g", descriptor = "[I")
	int[] anIntArray70;

	@OriginalMember(owner = "client!aey", name = "z", descriptor = "[I")
	int[] anIntArray71;

	@OriginalMember(owner = "client!aey", name = "k", descriptor = "[S")
	short[] aShortArray28;

	@OriginalMember(owner = "client!aey", name = "a", descriptor = "[B")
	byte[] aByteArray17;

	@OriginalMember(owner = "client!aey", name = "f", descriptor = "[S")
	short[] aShortArray29;

	@OriginalMember(owner = "client!aey", name = "o", descriptor = "[S")
	short[] aShortArray30;

	@OriginalMember(owner = "client!aey", name = "bh", descriptor = "I")
	int anInt773;

	@OriginalMember(owner = "client!aey", name = "i", descriptor = "[[I")
	int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!aey", name = "h", descriptor = "[F")
	float[] aFloatArray29;

	@OriginalMember(owner = "client!aey", name = "aj", descriptor = "Lclient!lg;")
	Class376 aClass376_1;

	@OriginalMember(owner = "client!aey", name = "al", descriptor = "[S")
	short[] aShortArray31;

	@OriginalMember(owner = "client!aey", name = "ao", descriptor = "[B")
	byte[] aByteArray18;

	@OriginalMember(owner = "client!aey", name = "bb", descriptor = "[I")
	int[] anIntArray74;

	@OriginalMember(owner = "client!aey", name = "j", descriptor = "[I")
	int[] anIntArray75;

	@OriginalMember(owner = "client!aey", name = "m", descriptor = "[F")
	float[] aFloatArray30;

	@OriginalMember(owner = "client!aey", name = "ar", descriptor = "[S")
	short[] aShortArray32;

	@OriginalMember(owner = "client!aey", name = "ad", descriptor = "[[I")
	int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!aey", name = "ac", descriptor = "[S")
	short[] aShortArray33;

	@OriginalMember(owner = "client!aey", name = "an", descriptor = "I")
	int anInt776;

	@OriginalMember(owner = "client!aey", name = "ax", descriptor = "[S")
	short[] aShortArray34;

	@OriginalMember(owner = "client!aey", name = "bl", descriptor = "I")
	int anInt777;

	@OriginalMember(owner = "client!aey", name = "au", descriptor = "[S")
	short[] aShortArray35;

	@OriginalMember(owner = "client!aey", name = "aw", descriptor = "I")
	int anInt778;

	@OriginalMember(owner = "client!aey", name = "ak", descriptor = "[S")
	short[] aShortArray36;

	@OriginalMember(owner = "client!aey", name = "bc", descriptor = "I")
	int anInt779;

	@OriginalMember(owner = "client!aey", name = "bj", descriptor = "I")
	int anInt780;

	@OriginalMember(owner = "client!aey", name = "bx", descriptor = "[I")
	int[] anIntArray77;

	@OriginalMember(owner = "client!aey", name = "bd", descriptor = "[I")
	int[] anIntArray78;

	@OriginalMember(owner = "client!aey", name = "by", descriptor = "[I")
	int[] anIntArray79;

	@OriginalMember(owner = "client!aey", name = "bu", descriptor = "[[I")
	int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!aey", name = "bi", descriptor = "[Lclient!dk;")
	Class205[] aClass205Array3;

	@OriginalMember(owner = "client!aey", name = "bg", descriptor = "[Lclient!cs;")
	Class195[] aClass195Array3;

	@OriginalMember(owner = "client!aey", name = "bs", descriptor = "I")
	int anInt781;

	@OriginalMember(owner = "client!aey", name = "bt", descriptor = "[Lclient!lk;")
	Class378[] aClass378Array1;

	@OriginalMember(owner = "client!aey", name = "bz", descriptor = "[Lclient!ke;")
	Class360[] aClass360Array1;

	@OriginalMember(owner = "client!aey", name = "bw", descriptor = "[S")
	short[] aShortArray37;

	@OriginalMember(owner = "client!aey", name = "b", descriptor = "[S")
	short[] aShortArray38;

	@OriginalMember(owner = "client!aey", name = "az", descriptor = "I")
	int anInt782;

	@OriginalMember(owner = "client!aey", name = "bv", descriptor = "I")
	int anInt783;

	@OriginalMember(owner = "client!aey", name = "ab", descriptor = "I")
	int anInt784;

	@OriginalMember(owner = "client!aey", name = "n", descriptor = "[S")
	short[] aShortArray39;

	@OriginalMember(owner = "client!aey", name = "bq", descriptor = "I")
	int anInt786;

	@OriginalMember(owner = "client!aey", name = "be", descriptor = "I")
	int anInt788;

	@OriginalMember(owner = "client!aey", name = "cb", descriptor = "Z")
	boolean aBoolean160;

	@OriginalMember(owner = "client!aey", name = "s", descriptor = "I")
	int anInt770;

	@OriginalMember(owner = "client!aey", name = "r", descriptor = "I")
	int anInt771;

	@OriginalMember(owner = "client!aey", name = "u", descriptor = "I")
	int anInt772;

	@OriginalMember(owner = "client!aey", name = "ai", descriptor = "I")
	int anInt774;

	@OriginalMember(owner = "client!aey", name = "ag", descriptor = "I")
	int anInt775;

	@OriginalMember(owner = "client!aey", name = "aq", descriptor = "Z")
	boolean aBoolean154;

	@OriginalMember(owner = "client!aey", name = "am", descriptor = "Z")
	boolean aBoolean155;

	@OriginalMember(owner = "client!aey", name = "ay", descriptor = "Z")
	boolean aBoolean156;

	@OriginalMember(owner = "client!aey", name = "af", descriptor = "Z")
	boolean aBoolean157;

	@OriginalMember(owner = "client!aey", name = "aa", descriptor = "Z")
	boolean aBoolean158;

	@OriginalMember(owner = "client!aey", name = "ba", descriptor = "Z")
	boolean aBoolean159;

	@OriginalMember(owner = "client!aey", name = "bn", descriptor = "[F")
	float[] aFloatArray28;

	@OriginalMember(owner = "client!aey", name = "bp", descriptor = "[I")
	int[] anIntArray73;

	@OriginalMember(owner = "client!aey", name = "bm", descriptor = "[I")
	int[] anIntArray81;

	@OriginalMember(owner = "client!aey", name = "bo", descriptor = "[I")
	final int[] anIntArray76;

	@OriginalMember(owner = "client!aey", name = "bk", descriptor = "[I")
	final int[] anIntArray72;

	@OriginalMember(owner = "client!aey", name = "br", descriptor = "[I")
	final int[] anIntArray80;

	@OriginalMember(owner = "client!aey", name = "w", descriptor = "Lclient!aed;")
	final Class86_Sub1 aClass86_Sub1_4;

	@OriginalMember(owner = "client!aey", name = "t", descriptor = "I")
	int anInt769;

	@OriginalMember(owner = "client!aey", name = "q", descriptor = "I")
	int anInt787;

	@OriginalMember(owner = "client!aey", name = "at", descriptor = "Lclient!lw;")
	Class389 aClass389_1;

	@OriginalMember(owner = "client!aey", name = "as", descriptor = "Lclient!lw;")
	Class389 aClass389_4;

	@OriginalMember(owner = "client!aey", name = "ae", descriptor = "Lclient!lw;")
	Class389 aClass389_2;

	@OriginalMember(owner = "client!aey", name = "ah", descriptor = "Lclient!lw;")
	Class389 aClass389_3;

	@OriginalMember(owner = "client!aey", name = "av", descriptor = "Lclient!ka;")
	Class356 aClass356_1;

	@OriginalMember(owner = "client!aey", name = "<init>", descriptor = "(Lclient!aed;IIZZ)V", line = 100)
	Class84_Sub3(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt770 = 0;
		this.anInt771 = 0;
		this.anInt772 = 0;
		this.anInt774 = 0;
		this.anInt775 = 0;
		this.aBoolean154 = false;
		this.aBoolean155 = true;
		this.aBoolean156 = false;
		this.aBoolean157 = false;
		this.aBoolean158 = false;
		this.aBoolean159 = false;
		this.aFloatArray28 = new float[2];
		this.anIntArray73 = new int[1];
		this.anIntArray81 = new int[1];
		this.anIntArray76 = new int[8];
		this.anIntArray72 = new int[8];
		this.anIntArray80 = new int[8];
		this.aClass86_Sub1_4 = arg0;
		this.anInt769 = arg1;
		this.anInt787 = arg2;
		this.aBoolean154 = arg4;
		if (arg3 || Class362.method28048(this.anInt769, this.anInt787)) {
			this.aClass389_1 = new Class389(Class362.method28066(this.anInt769, this.anInt787));
		}
		if (arg3 || Class362.method28059(this.anInt769, this.anInt787)) {
			this.aClass389_4 = new Class389(Class362.method28074(this.anInt769, this.anInt787));
		}
		if (arg3 || Class362.method28058(this.anInt769, this.anInt787)) {
			this.aClass389_2 = new Class389(Class362.method28071(this.anInt769, this.anInt787));
		}
		if (arg3 || Class362.method28053(this.anInt769, this.anInt787)) {
			this.aClass389_3 = new Class389(Class362.method28069(this.anInt769, this.anInt787));
		}
		if (arg3 || Class362.method28062(this.anInt769, this.anInt787)) {
			this.aClass356_1 = new Class356(Class362.method28077(this.anInt769, this.anInt787));
		}
		if (arg3 && arg4) {
			this.aClass389_1.anInterface36_23 = this.aClass389_1.anInterface36_22 = this.aClass86_Sub1_4.method20656(this.aBoolean154);
			this.aClass389_4.anInterface36_23 = this.aClass389_4.anInterface36_22 = this.aClass86_Sub1_4.method20656(this.aBoolean154);
			this.aClass389_2.anInterface36_23 = this.aClass389_2.anInterface36_22 = this.aClass86_Sub1_4.method20656(this.aBoolean154);
			this.aClass389_3.anInterface36_23 = this.aClass389_3.anInterface36_22 = this.aClass86_Sub1_4.method20656(this.aBoolean154);
		}
	}

	@OriginalMember(owner = "client!aey", name = "<init>", descriptor = "(Lclient!aed;Lclient!dz;IIII)V", line = 119)
	Class84_Sub3(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(9) Class209 local9 = arg0.aClass209_9;
		@Pc(12) Interface44 local12 = arg0.anInterface44_6;
		@Pc(16) int[] local16 = new int[arg1.anInt3735];
		this.anIntArray77 = new int[arg1.anInt3738 + 1];
		for (@Pc(25) int local25 = 0; local25 < arg1.anInt3735; local25++) {
			if (arg1.aByteArray65 == null || arg1.aByteArray65[local25] != 2) {
				if (arg1.aShortArray106 != null && arg1.aShortArray106[local25] != -1) {
					@Pc(58) Class215 local58 = local9.method25584(arg1.aShortArray106[local25] & 0xFFFF);
					if (((this.anInt787 & 0x40) == 0 || !local58.aBoolean641) && local58.aBoolean637) {
						continue;
					}
				}
				local16[this.anInt774++] = local25;
				this.anIntArray77[arg1.aShortArray101[local25]]++;
				this.anIntArray77[arg1.aShortArray98[local25]]++;
				this.anIntArray77[arg1.aShortArray103[local25]]++;
			}
		}
		this.anInt775 = this.anInt774;
		@Pc(123) long[] local123 = new long[this.anInt774];
		@Pc(132) boolean local132 = (this.anInt769 & 0x100) != 0;
		@Pc(142) int local142;
		@Pc(146) int local146;
		@Pc(159) int local159;
		@Pc(378) int local378;
		@Pc(279) short local279;
		for (@Pc(134) int local134 = 0; local134 < this.anInt774; local134++) {
			local142 = local16[local134];
			@Pc(144) Class215 local144 = null;
			local146 = 0;
			@Pc(148) byte local148 = 0;
			@Pc(150) byte local150 = 0;
			@Pc(152) byte local152 = 0;
			@Pc(157) boolean local157;
			if (arg1.aClass204Array1 != null) {
				local157 = false;
				for (local159 = 0; local159 < arg1.aClass204Array1.length; local159++) {
					@Pc(169) Class204 local169 = arg1.aClass204Array1[local159];
					if (local142 == local169.anInt3566 * 1329690033) {
						@Pc(183) Class394 local183 = local12.method28576(local169.anInt3563 * 452560563);
						if (local183.aBoolean732) {
							local157 = true;
						}
						if (local183.anInt4595 * 651115273 != -1) {
							@Pc(202) Class215 local202 = local9.method25584(local183.anInt4595 * 651115273);
							if (local202.aClass597_2 == Class597.aClass597_5) {
								this.aBoolean156 = true;
							}
						}
					}
				}
				if (local157) {
					local123[local134] = Long.MAX_VALUE;
					this.anInt775--;
					continue;
				}
			}
			if (arg1.aClass205Array4 != null) {
				local157 = false;
				for (local159 = 0; local159 < arg1.aClass205Array4.length; local159++) {
					@Pc(241) Class205 local241 = arg1.aClass205Array4[local159];
					if (local142 == local241.anInt3568 * -1916225325) {
						@Pc(257) Class396 local257 = this.aClass86_Sub1_4.anInterface47_6.method28528(local241.anInt3569 * 1708272351);
						if (local257.aBoolean743) {
							local157 = true;
						}
					}
				}
				if (local157) {
					local123[local134] = Long.MAX_VALUE;
					this.anInt775--;
					continue;
				}
			}
			local279 = -1;
			if (arg1.aShortArray106 != null) {
				local279 = arg1.aShortArray106[local142];
				if (local279 != -1) {
					local144 = local9.method25584(local279 & 0xFFFF);
					if ((this.anInt787 & 0x40) != 0 && local144.aBoolean641) {
						local279 = -1;
						local144 = null;
					} else {
						local150 = local144.aByte118;
						local152 = local144.aByte119;
					}
				}
			}
			@Pc(334) boolean local334 = arg1.aByteArray67 != null && arg1.aByteArray67[local142] != 0 || local144 != null && local144.aClass597_2 != Class597.aClass597_4;
			if ((local132 || local334) && arg1.aByteArray66 != null) {
				local146 += arg1.aByteArray66[local142] << 17;
			}
			if (local334) {
				local146 += 65536;
			}
			local146 += (local150 & 0xFF) << 8;
			local146 += local152 & 0xFF;
			local378 = local148 + ((local279 & 0xFFFF) << 16);
			@Pc(384) int local384 = local378 + (local134 & 0xFFFF);
			local123[local134] = ((long) local146 << 32) + (long) local384;
			this.aBoolean156 |= local334;
			this.aBoolean157 |= local144 != null && (local144.aByte113 != 0 || local144.aByte114 != 0);
		}
		Class426.method28770(local123, local16);
		this.anInt770 = arg1.anInt3732;
		this.anInt771 = arg1.anInt3738;
		this.anIntArray70 = arg1.anIntArray353;
		this.anIntArray71 = arg1.anIntArray352;
		this.anIntArray75 = arg1.anIntArray357;
		this.aShortArray28 = arg1.aShortArray100;
		@Pc(450) Class373[] local450 = new Class373[this.anInt771];
		this.aClass205Array3 = arg1.aClass205Array4;
		this.aClass195Array3 = arg1.aClass195Array4;
		@Pc(499) int local499;
		if (arg1.aClass204Array1 != null) {
			this.anInt781 = arg1.aClass204Array1.length;
			this.aClass378Array1 = new Class378[this.anInt781];
			this.aClass360Array1 = new Class360[this.anInt781];
			for (local142 = 0; local142 < this.anInt781; local142++) {
				@Pc(487) Class204 local487 = arg1.aClass204Array1[local142];
				@Pc(495) Class394 local495 = local12.method28576(local487.anInt3563 * 452560563);
				local378 = -1;
				for (local499 = 0; local499 < this.anInt774; local499++) {
					if (local16[local499] == local487.anInt3566 * 1329690033) {
						local378 = local499;
						break;
					}
				}
				if (local378 == -1) {
					throw new RuntimeException();
				}
				local499 = Class656.anIntArray532[arg1.aShortArray104[local487.anInt3566 * 1329690033] & 0xFFFF] & 0xFFFFFF;
				local499 |= 255 - (arg1.aByteArray67 == null ? 0 : arg1.aByteArray67[local487.anInt3566 * 1329690033]) << 24;
				this.aClass378Array1[local142] = new Class378(local378, arg1.aShortArray101[local487.anInt3566 * 1329690033], arg1.aShortArray98[local487.anInt3566 * 1329690033], arg1.aShortArray103[local487.anInt3566 * 1329690033], local495.anInt4596 * -312833239, local495.anInt4597 * -407898751, local495.anInt4595 * 651115273, local495.anInt4599 * -1616229305, local495.anInt4594 * 1576328455, local495.aBoolean732, local495.aBoolean731, local487.anInt3564 * -1972242819);
				this.aClass360Array1[local142] = new Class360(local499);
			}
		}
		local142 = this.anInt774 * 3;
		this.aShortArray27 = new short[local142];
		this.aShortArray29 = new short[local142];
		this.aShortArray30 = new short[local142];
		this.aShortArray38 = new short[local142];
		this.aShortArray39 = new short[local142];
		this.aByteArray17 = new byte[local142];
		this.aFloatArray30 = new float[local142];
		this.aFloatArray29 = new float[local142];
		this.aShortArray31 = new short[this.anInt774];
		this.aByteArray18 = new byte[this.anInt774];
		this.aShortArray36 = new short[this.anInt774];
		this.aShortArray35 = new short[this.anInt774];
		this.aShortArray34 = new short[this.anInt774];
		this.aShortArray32 = new short[this.anInt774];
		if (arg1.aShortArray102 != null) {
			this.aShortArray33 = new short[this.anInt774];
		}
		this.aShort22 = (short) arg3;
		this.aShort23 = (short) arg4;
		this.aShortArray37 = new short[local142];
		this.aLongArray9 = new long[local142];
		@Pc(716) int local716 = 0;
		for (local146 = 0; local146 < arg1.anInt3738; local146++) {
			local378 = this.anIntArray77[local146];
			this.anIntArray77[local146] = local716;
			local716 += local378;
			local450[local146] = new Class373();
		}
		this.anIntArray77[arg1.anInt3738] = local716;
		@Pc(757) Class226 local757 = this.method6760(arg1, local16, this.anInt774);
		@Pc(761) Class387[] local761 = new Class387[arg1.anInt3735];
		@Pc(772) short local772;
		@Pc(782) short local782;
		@Pc(792) int local792;
		@Pc(812) int local812;
		for (local499 = 0; local499 < arg1.anInt3735; local499++) {
			local772 = arg1.aShortArray101[local499];
			local279 = arg1.aShortArray98[local499];
			local782 = arg1.aShortArray103[local499];
			local792 = this.anIntArray70[local279] - this.anIntArray70[local772];
			@Pc(802) int local802 = this.anIntArray71[local279] - this.anIntArray71[local772];
			local812 = this.anIntArray75[local279] - this.anIntArray75[local772];
			@Pc(822) int local822 = this.anIntArray70[local782] - this.anIntArray70[local772];
			@Pc(832) int local832 = this.anIntArray71[local782] - this.anIntArray71[local772];
			@Pc(842) int local842 = this.anIntArray75[local782] - this.anIntArray75[local772];
			@Pc(850) int local850 = local802 * local842 - local832 * local812;
			@Pc(858) int local858 = local812 * local822 - local842 * local792;
			@Pc(866) int local866;
			for (local866 = local792 * local832 - local822 * local802; local850 > 8192 || local858 > 8192 || local866 > 8192 || local850 < -8192 || local858 < -8192 || local866 < -8192; local866 >>= 0x1) {
				local850 >>= 0x1;
				local858 >>= 0x1;
			}
			@Pc(912) int local912 = (int) Math.sqrt((double) (local850 * local850 + local858 * local858 + local866 * local866));
			if (local912 <= 0) {
				local912 = 1;
			}
			local850 = local850 * 256 / local912;
			local858 = local858 * 256 / local912;
			local866 = local866 * 256 / local912;
			@Pc(944) byte local944 = arg1.aByteArray65 == null ? 0 : arg1.aByteArray65[local499];
			if (local944 == 0) {
				@Pc(950) Class373 local950 = local450[local772];
				local950.anInt4564 += local850;
				local950.anInt4565 += local858;
				local950.anInt4563 += local866;
				local950.anInt4566++;
				@Pc(978) Class373 local978 = local450[local279];
				local978.anInt4564 += local850;
				local978.anInt4565 += local858;
				local978.anInt4563 += local866;
				local978.anInt4566++;
				@Pc(1006) Class373 local1006 = local450[local782];
				local1006.anInt4564 += local850;
				local1006.anInt4565 += local858;
				local1006.anInt4563 += local866;
				local1006.anInt4566++;
			} else if (local944 == 1) {
				@Pc(1042) Class387 local1042 = local761[local499] = new Class387();
				local1042.anInt4589 = local850;
				local1042.anInt4588 = local858;
				local1042.anInt4587 = local866;
			}
		}
		@Pc(1070) int local1070;
		for (local499 = 0; local499 < this.anInt774; local499++) {
			@Pc(1063) int local1063 = local16[local499];
			local1070 = arg1.aShortArray104[local1063] & 0xFFFF;
			local159 = arg1.aByteArray67 == null ? 0 : arg1.aByteArray67[local1063] & 0xFF;
			@Pc(1092) short local1092 = arg1.aShortArray106 == null ? -1 : arg1.aShortArray106[local1063];
			if (local1092 != -1 && (this.anInt787 & 0x40) != 0 && local9.method25584(local1092).aBoolean641) {
				local1092 = -1;
			}
			@Pc(1110) float local1110 = 0.0F;
			@Pc(1112) float local1112 = 0.0F;
			@Pc(1114) float local1114 = 0.0F;
			@Pc(1116) float local1116 = 0.0F;
			@Pc(1118) float local1118 = 0.0F;
			@Pc(1120) float local1120 = 0.0F;
			@Pc(1271) short local1271;
			@Pc(1170) long local1170;
			@Pc(1183) long local1183;
			@Pc(1196) long local1196;
			if (local1092 == -1) {
				local1196 = 0L;
				local1183 = 0L;
				local1170 = 0L;
			} else {
				@Pc(1133) short local1133 = arg1.aShortArray105 == null ? -1 : arg1.aShortArray105[local1063];
				@Pc(1143) int local1143;
				if (local1133 == 32766) {
					local1143 = arg1.aByteArray68[local1063] & 0xFF;
					@Pc(1150) int local1150 = arg1.aByteArray63[local1063] & 0xFF;
					@Pc(1157) int local1157 = arg1.aByteArray64[local1063] & 0xFF;
					@Pc(1167) int local1167 = local1143 + arg1.anIntArray356[arg1.aShortArray101[local1063]];
					local1170 = local1167;
					@Pc(1180) int local1180 = local1150 + arg1.anIntArray356[arg1.aShortArray98[local1063]];
					local1183 = local1167;
					@Pc(1193) int local1193 = local1157 + arg1.anIntArray356[arg1.aShortArray103[local1063]];
					local1196 = local1167;
					local1110 = arg1.aFloatArray98[local1167];
					local1112 = arg1.aFloatArray97[local1167];
					local1114 = arg1.aFloatArray98[local1180];
					local1116 = arg1.aFloatArray97[local1180];
					local1118 = arg1.aFloatArray98[local1193];
					local1120 = arg1.aFloatArray97[local1193];
				} else if (local1133 == -1) {
					local1110 = 0.0F;
					local1112 = 1.0F;
					local1170 = 65535L;
					local1114 = 1.0F;
					local1116 = 1.0F;
					local1183 = 131071L;
					local1118 = 0.0F;
					local1120 = 0.0F;
					local1196 = 196607L;
				} else {
					@Pc(1253) int local1253 = local1133 & 0xFFFF;
					local1143 = 0;
					@Pc(1257) byte local1257 = 0;
					@Pc(1259) byte local1259 = 0;
					@Pc(1264) byte local1264 = arg1.aByteArray62[local1253];
					@Pc(1276) short local1276;
					@Pc(1281) short local1281;
					@Pc(1314) float local1314;
					@Pc(1322) float local1322;
					@Pc(1330) float local1330;
					@Pc(1410) float local1410;
					@Pc(1418) float local1418;
					@Pc(1426) float local1426;
					@Pc(1434) float local1434;
					@Pc(1442) float local1442;
					@Pc(1450) float local1450;
					if (local1264 == 0) {
						local1271 = arg1.aShortArray101[local1063];
						local1276 = arg1.aShortArray98[local1063];
						local1281 = arg1.aShortArray103[local1063];
						@Pc(1286) short local1286 = arg1.aShortArray107[local1253];
						@Pc(1291) short local1291 = arg1.aShortArray99[local1253];
						@Pc(1296) short local1296 = arg1.aShortArray108[local1253];
						@Pc(1302) float local1302 = (float) arg1.anIntArray353[local1286];
						@Pc(1308) float local1308 = (float) arg1.anIntArray352[local1286];
						local1314 = arg1.anIntArray357[local1286];
						local1322 = (float) arg1.anIntArray353[local1291] - local1302;
						local1330 = (float) arg1.anIntArray352[local1291] - local1308;
						@Pc(1338) float local1338 = (float) arg1.anIntArray357[local1291] - local1314;
						@Pc(1346) float local1346 = (float) arg1.anIntArray353[local1296] - local1302;
						@Pc(1354) float local1354 = (float) arg1.anIntArray352[local1296] - local1308;
						@Pc(1362) float local1362 = (float) arg1.anIntArray357[local1296] - local1314;
						@Pc(1370) float local1370 = (float) arg1.anIntArray353[local1271] - local1302;
						@Pc(1378) float local1378 = (float) arg1.anIntArray352[local1271] - local1308;
						@Pc(1386) float local1386 = (float) arg1.anIntArray357[local1271] - local1314;
						@Pc(1394) float local1394 = (float) arg1.anIntArray353[local1276] - local1302;
						@Pc(1402) float local1402 = (float) arg1.anIntArray352[local1276] - local1308;
						local1410 = (float) arg1.anIntArray357[local1276] - local1314;
						local1418 = (float) arg1.anIntArray353[local1281] - local1302;
						local1426 = (float) arg1.anIntArray352[local1281] - local1308;
						local1434 = (float) arg1.anIntArray357[local1281] - local1314;
						local1442 = local1330 * local1362 - local1338 * local1354;
						local1450 = local1338 * local1346 - local1322 * local1362;
						@Pc(1458) float local1458 = local1322 * local1354 - local1330 * local1346;
						@Pc(1466) float local1466 = local1354 * local1458 - local1362 * local1450;
						@Pc(1474) float local1474 = local1362 * local1442 - local1346 * local1458;
						@Pc(1482) float local1482 = local1346 * local1450 - local1354 * local1442;
						@Pc(1496) float local1496 = 1.0F / (local1466 * local1322 + local1474 * local1330 + local1482 * local1338);
						local1110 = (local1466 * local1370 + local1474 * local1378 + local1482 * local1386) * local1496;
						local1114 = (local1466 * local1394 + local1474 * local1402 + local1482 * local1410) * local1496;
						local1118 = (local1466 * local1418 + local1474 * local1426 + local1482 * local1434) * local1496;
						@Pc(1546) float local1546 = local1330 * local1458 - local1338 * local1450;
						@Pc(1554) float local1554 = local1338 * local1442 - local1322 * local1458;
						@Pc(1562) float local1562 = local1322 * local1450 - local1330 * local1442;
						@Pc(1576) float local1576 = 1.0F / (local1546 * local1346 + local1554 * local1354 + local1562 * local1362);
						local1112 = (local1546 * local1370 + local1554 * local1378 + local1562 * local1386) * local1576;
						local1116 = (local1546 * local1394 + local1554 * local1402 + local1562 * local1410) * local1576;
						local1120 = (local1546 * local1418 + local1554 * local1426 + local1562 * local1434) * local1576;
					} else {
						local1271 = arg1.aShortArray101[local1063];
						local1276 = arg1.aShortArray98[local1063];
						local1281 = arg1.aShortArray103[local1063];
						@Pc(1639) int local1639 = local757.anIntArray366[local1253];
						@Pc(1644) int local1644 = local757.anIntArray365[local1253];
						@Pc(1649) int local1649 = local757.anIntArray367[local1253];
						@Pc(1654) float[] local1654 = local757.aFloatArrayArray22[local1253];
						@Pc(1659) byte local1659 = arg1.aByteArray70[local1253];
						local1314 = (float) arg1.anIntArray361[local1253] / 256.0F;
						if (local1264 == 1) {
							local1322 = (float) arg1.anIntArray360[local1253] / 1024.0F;
							method6749(arg1.anIntArray353[local1271], arg1.anIntArray352[local1271], arg1.anIntArray357[local1271], local1639, local1644, local1649, local1654, local1322, local1659, local1314, this.aFloatArray28);
							local1110 = this.aFloatArray28[0];
							local1112 = this.aFloatArray28[1];
							method6749(arg1.anIntArray353[local1276], arg1.anIntArray352[local1276], arg1.anIntArray357[local1276], local1639, local1644, local1649, local1654, local1322, local1659, local1314, this.aFloatArray28);
							local1114 = this.aFloatArray28[0];
							local1116 = this.aFloatArray28[1];
							method6749(arg1.anIntArray353[local1281], arg1.anIntArray352[local1281], arg1.anIntArray357[local1281], local1639, local1644, local1649, local1654, local1322, local1659, local1314, this.aFloatArray28);
							local1118 = this.aFloatArray28[0];
							local1120 = this.aFloatArray28[1];
							local1330 = local1322 / 2.0F;
							if ((local1659 & 0x1) == 0) {
								if (local1114 - local1110 > local1330) {
									local1114 -= local1322;
									local1257 = 1;
								} else if (local1110 - local1114 > local1330) {
									local1114 += local1322;
									local1257 = 2;
								}
								if (local1118 - local1110 > local1330) {
									local1118 -= local1322;
									local1259 = 1;
								} else if (local1110 - local1118 > local1330) {
									local1118 += local1322;
									local1259 = 2;
								}
							} else {
								if (local1116 - local1112 > local1330) {
									local1116 -= local1322;
									local1257 = 1;
								} else if (local1112 - local1116 > local1330) {
									local1116 += local1322;
									local1257 = 2;
								}
								if (local1120 - local1112 > local1330) {
									local1120 -= local1322;
									local1259 = 1;
								} else if (local1112 - local1120 > local1330) {
									local1120 += local1322;
									local1259 = 2;
								}
							}
						} else if (local1264 == 2) {
							local1322 = (float) arg1.anIntArray362[local1253] / 256.0F;
							local1330 = (float) arg1.anIntArray363[local1253] / 256.0F;
							@Pc(1913) int local1913 = arg1.anIntArray353[local1276] - arg1.anIntArray353[local1271];
							@Pc(1923) int local1923 = arg1.anIntArray352[local1276] - arg1.anIntArray352[local1271];
							@Pc(1933) int local1933 = arg1.anIntArray357[local1276] - arg1.anIntArray357[local1271];
							@Pc(1943) int local1943 = arg1.anIntArray353[local1281] - arg1.anIntArray353[local1271];
							@Pc(1953) int local1953 = arg1.anIntArray352[local1281] - arg1.anIntArray352[local1271];
							@Pc(1963) int local1963 = arg1.anIntArray357[local1281] - arg1.anIntArray357[local1271];
							@Pc(1971) int local1971 = local1923 * local1963 - local1953 * local1933;
							@Pc(1979) int local1979 = local1933 * local1943 - local1963 * local1913;
							@Pc(1987) int local1987 = local1913 * local1953 - local1943 * local1923;
							local1410 = 64.0F / (float) arg1.anIntArray358[local1253];
							local1418 = 64.0F / (float) arg1.anIntArray359[local1253];
							local1426 = 64.0F / (float) arg1.anIntArray360[local1253];
							local1434 = ((float) local1971 * local1654[0] + (float) local1979 * local1654[1] + (float) local1987 * local1654[2]) / local1410;
							local1442 = ((float) local1971 * local1654[3] + (float) local1979 * local1654[4] + (float) local1987 * local1654[5]) / local1418;
							local1450 = ((float) local1971 * local1654[6] + (float) local1979 * local1654[7] + (float) local1987 * local1654[8]) / local1426;
							local1143 = method6752(local1434, local1442, local1450);
							method6758(arg1.anIntArray353[local1271], arg1.anIntArray352[local1271], arg1.anIntArray357[local1271], local1639, local1644, local1649, local1143, local1654, local1659, local1314, local1322, local1330, this.aFloatArray28);
							local1110 = this.aFloatArray28[0];
							local1112 = this.aFloatArray28[1];
							method6758(arg1.anIntArray353[local1276], arg1.anIntArray352[local1276], arg1.anIntArray357[local1276], local1639, local1644, local1649, local1143, local1654, local1659, local1314, local1322, local1330, this.aFloatArray28);
							local1114 = this.aFloatArray28[0];
							local1116 = this.aFloatArray28[1];
							method6758(arg1.anIntArray353[local1281], arg1.anIntArray352[local1281], arg1.anIntArray357[local1281], local1639, local1644, local1649, local1143, local1654, local1659, local1314, local1322, local1330, this.aFloatArray28);
							local1118 = this.aFloatArray28[0];
							local1120 = this.aFloatArray28[1];
						} else if (local1264 == 3) {
							method6746(arg1.anIntArray353[local1271], arg1.anIntArray352[local1271], arg1.anIntArray357[local1271], local1639, local1644, local1649, local1654, local1659, local1314, this.aFloatArray28);
							local1110 = this.aFloatArray28[0];
							local1112 = this.aFloatArray28[1];
							method6746(arg1.anIntArray353[local1276], arg1.anIntArray352[local1276], arg1.anIntArray357[local1276], local1639, local1644, local1649, local1654, local1659, local1314, this.aFloatArray28);
							local1114 = this.aFloatArray28[0];
							local1116 = this.aFloatArray28[1];
							method6746(arg1.anIntArray353[local1281], arg1.anIntArray352[local1281], arg1.anIntArray357[local1281], local1639, local1644, local1649, local1654, local1659, local1314, this.aFloatArray28);
							local1118 = this.aFloatArray28[0];
							local1120 = this.aFloatArray28[1];
							if ((local1659 & 0x1) == 0) {
								if (local1114 - local1110 > 0.5F) {
									local1114--;
									local1257 = 1;
								} else if (local1110 - local1114 > 0.5F) {
									local1114++;
									local1257 = 2;
								}
								if (local1118 - local1110 > 0.5F) {
									local1118--;
									local1259 = 1;
								} else if (local1110 - local1118 > 0.5F) {
									local1118++;
									local1259 = 2;
								}
							} else {
								if (local1116 - local1112 > 0.5F) {
									local1116--;
									local1257 = 1;
								} else if (local1112 - local1116 > 0.5F) {
									local1116++;
									local1257 = 2;
								}
								if (local1120 - local1112 > 0.5F) {
									local1120--;
									local1259 = 1;
								} else if (local1112 - local1120 > 0.5F) {
									local1120++;
									local1259 = 2;
								}
							}
						}
					}
					local1170 = local1143 << 16 | local1253;
					local1183 = (long) (local1257 << 19) | local1170;
					local1196 = (long) (local1259 << 19) | local1170;
				}
			}
			@Pc(2427) byte local2427 = arg1.aByteArray65 == null ? 0 : arg1.aByteArray65[local1063];
			if (local2427 == 0) {
				@Pc(2436) long local2436 = (long) ((local1070 << 8) + local159);
				@Pc(2441) short local2441 = arg1.aShortArray101[local1063];
				@Pc(2446) short local2446 = arg1.aShortArray98[local1063];
				local1271 = arg1.aShortArray103[local1063];
				@Pc(2455) Class373 local2455 = local450[local2441];
				this.aShortArray36[local499] = this.method6962(arg1, local2441, local499, local2436 | local1170 << 24, local2455.anInt4564, local2455.anInt4565, local2455.anInt4563, local2455.anInt4566, local1110, local1112);
				@Pc(2483) Class373 local2483 = local450[local2446];
				this.aShortArray35[local499] = this.method6962(arg1, local2446, local499, local2436 | local1183 << 24, local2483.anInt4564, local2483.anInt4565, local2483.anInt4563, local2483.anInt4566, local1114, local1116);
				@Pc(2511) Class373 local2511 = local450[local1271];
				this.aShortArray34[local499] = this.method6962(arg1, local1271, local499, local2436 | local1196 << 24, local2511.anInt4564, local2511.anInt4565, local2511.anInt4563, local2511.anInt4566, local1118, local1120);
			} else if (local2427 == 1) {
				@Pc(2543) Class387 local2543 = local761[local1063];
				@Pc(2575) long local2575 = ((long) (local2543.anInt4589 & Integer.MIN_VALUE) << 9) + ((long) (local2543.anInt4588 + 256) << 32) + ((long) (local2543.anInt4587 + 256) << 24) + (long) (local1070 << 8) + (long) local159;
				this.aShortArray36[local499] = this.method6962(arg1, arg1.aShortArray101[local1063], local499, local2575 | local1170 << 41, local2543.anInt4589, local2543.anInt4588, local2543.anInt4587, 0, local1110, local1112);
				this.aShortArray35[local499] = this.method6962(arg1, arg1.aShortArray98[local1063], local499, local2575 | local1170 << 41, local2543.anInt4589, local2543.anInt4588, local2543.anInt4587, 0, local1114, local1116);
				this.aShortArray34[local499] = this.method6962(arg1, arg1.aShortArray103[local1063], local499, local2575 | local1170 << 41, local2543.anInt4589, local2543.anInt4588, local2543.anInt4587, 0, local1118, local1120);
			}
			if (arg1.aByteArray67 != null) {
				this.aByteArray18[local499] = arg1.aByteArray67[local1063];
			}
			if (arg1.aShortArray102 != null) {
				this.aShortArray33[local499] = arg1.aShortArray102[local1063];
			}
			this.aShortArray31[local499] = arg1.aShortArray104[local1063];
			this.aShortArray32[local499] = local1092;
		}
		if (this.anInt775 > 0) {
			local499 = 1;
			local772 = this.aShortArray32[0];
			for (local1070 = 0; local1070 < this.anInt775; local1070++) {
				local782 = this.aShortArray32[local1070];
				if (local782 != local772) {
					local499++;
					local772 = local782;
				}
			}
			this.anIntArray78 = new int[local499];
			this.anIntArray79 = new int[local499];
			this.anIntArray74 = new int[local499 + 1];
			this.anIntArray74[0] = 0;
			local1070 = this.anInt772;
			local159 = 0;
			local499 = 0;
			local772 = this.aShortArray32[0];
			for (local792 = 0; local792 < this.anInt775; local792++) {
				@Pc(2761) short local2761 = this.aShortArray32[local792];
				if (local2761 != local772) {
					this.anIntArray78[local499] = local1070;
					this.anIntArray79[local499] = local159 - local1070 + 1;
					local499++;
					this.anIntArray74[local499] = local792;
					local1070 = this.anInt772;
					local159 = 0;
					local772 = local2761;
				}
				local812 = this.aShortArray36[local792] & 0xFFFF;
				if (local812 < local1070) {
					local1070 = local812;
				}
				if (local812 > local159) {
					local159 = local812;
				}
				local812 = this.aShortArray35[local792] & 0xFFFF;
				if (local812 < local1070) {
					local1070 = local812;
				}
				if (local812 > local159) {
					local159 = local812;
				}
				local812 = this.aShortArray34[local792] & 0xFFFF;
				if (local812 < local1070) {
					local1070 = local812;
				}
				if (local812 > local159) {
					local159 = local812;
				}
			}
			this.anIntArray78[local499] = local1070;
			this.anIntArray79[local499] = local159 - local1070 + 1;
			local499++;
			this.anIntArray74[local499] = this.anInt775;
		}
		this.aLongArray9 = null;
		this.aShortArray27 = method6970(this.aShortArray27, this.anInt772);
		this.aShortArray29 = method6970(this.aShortArray29, this.anInt772);
		this.aShortArray30 = method6970(this.aShortArray30, this.anInt772);
		this.aShortArray38 = method6970(this.aShortArray38, this.anInt772);
		this.aShortArray39 = method6970(this.aShortArray39, this.anInt772);
		this.aByteArray17 = method6966(this.aByteArray17, this.anInt772);
		this.aFloatArray30 = method6974(this.aFloatArray30, this.anInt772);
		this.aFloatArray29 = method6974(this.aFloatArray29, this.anInt772);
		if (arg1.anIntArray354 != null && Class362.method28109(arg2, this.anInt787)) {
			this.anIntArrayArray11 = arg1.method25675(false);
		}
		if (arg1.aClass204Array1 != null && Class362.method28111(arg2, this.anInt787)) {
			this.anIntArrayArray13 = arg1.method25680();
		}
		if (arg1.anIntArray355 != null && Class362.method28106(arg2, this.anInt787)) {
			local499 = 0;
			@Pc(2962) int[] local2962 = new int[256];
			for (local1070 = 0; local1070 < this.anInt774; local1070++) {
				local159 = arg1.anIntArray355[local16[local1070]];
				if (local159 >= 0) {
					@Pc(2981) int local2981 = local2962[local159]++;
					if (local159 > local499) {
						local499 = local159;
					}
				}
			}
			this.anIntArrayArray12 = new int[local499 + 1][];
			for (local1070 = 0; local1070 <= local499; local1070++) {
				this.anIntArrayArray12[local1070] = new int[local2962[local1070]];
				local2962[local1070] = 0;
			}
			for (local1070 = 0; local1070 < this.anInt774; local1070++) {
				local159 = arg1.anIntArray355[local16[local1070]];
				if (local159 >= 0) {
					this.anIntArrayArray12[local159][local2962[local159]++] = local1070;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "hh", descriptor = "(Lclient!dz;IIJIIIIFF)S", line = 666)
	short method6962(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(4) int local4 = this.anIntArray77[arg1];
		@Pc(11) int local11 = this.anIntArray77[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray37[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray37[local15] & 0xFFFF) - 1;
			if (this.aLongArray9[local15] == arg3) {
				return (short) local35;
			}
		}
		this.aShortArray37[local13] = (short) (this.anInt772 + 1);
		this.aLongArray9[local13] = arg3;
		this.aShortArray29[this.anInt772] = (short) arg2;
		this.aShortArray27[this.anInt772] = (short) arg1;
		this.aShortArray30[this.anInt772] = (short) arg4;
		this.aShortArray38[this.anInt772] = (short) arg5;
		this.aShortArray39[this.anInt772] = (short) arg6;
		this.aByteArray17[this.anInt772] = (byte) arg7;
		this.aFloatArray30[this.anInt772] = arg8;
		this.aFloatArray29[this.anInt772] = arg9;
		return (short) this.anInt772++;
	}

	@OriginalMember(owner = "client!aey", name = "ic", descriptor = "(Lclient!dz;IIJIIIIFF)S", line = 666)
	short method6963(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(4) int local4 = this.anIntArray77[arg1];
		@Pc(11) int local11 = this.anIntArray77[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray37[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray37[local15] & 0xFFFF) - 1;
			if (this.aLongArray9[local15] == arg3) {
				return (short) local35;
			}
		}
		this.aShortArray37[local13] = (short) (this.anInt772 + 1);
		this.aLongArray9[local13] = arg3;
		this.aShortArray29[this.anInt772] = (short) arg2;
		this.aShortArray27[this.anInt772] = (short) arg1;
		this.aShortArray30[this.anInt772] = (short) arg4;
		this.aShortArray38[this.anInt772] = (short) arg5;
		this.aShortArray39[this.anInt772] = (short) arg6;
		this.aByteArray17[this.anInt772] = (byte) arg7;
		this.aFloatArray30[this.anInt772] = arg8;
		this.aFloatArray29[this.anInt772] = arg9;
		return (short) this.anInt772++;
	}

	@OriginalMember(owner = "client!aey", name = "iy", descriptor = "(Lclient!dz;IIJIIIIFF)S", line = 666)
	short method6964(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(4) int local4 = this.anIntArray77[arg1];
		@Pc(11) int local11 = this.anIntArray77[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray37[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray37[local15] & 0xFFFF) - 1;
			if (this.aLongArray9[local15] == arg3) {
				return (short) local35;
			}
		}
		this.aShortArray37[local13] = (short) (this.anInt772 + 1);
		this.aLongArray9[local13] = arg3;
		this.aShortArray29[this.anInt772] = (short) arg2;
		this.aShortArray27[this.anInt772] = (short) arg1;
		this.aShortArray30[this.anInt772] = (short) arg4;
		this.aShortArray38[this.anInt772] = (short) arg5;
		this.aShortArray39[this.anInt772] = (short) arg6;
		this.aByteArray17[this.anInt772] = (byte) arg7;
		this.aFloatArray30[this.anInt772] = arg8;
		this.aFloatArray29[this.anInt772] = arg9;
		return (short) this.anInt772++;
	}

	@OriginalMember(owner = "client!aey", name = "iu", descriptor = "(Lclient!dz;IIJIIIIFF)S", line = 666)
	short method6965(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(4) int local4 = this.anIntArray77[arg1];
		@Pc(11) int local11 = this.anIntArray77[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray37[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray37[local15] & 0xFFFF) - 1;
			if (this.aLongArray9[local15] == arg3) {
				return (short) local35;
			}
		}
		this.aShortArray37[local13] = (short) (this.anInt772 + 1);
		this.aLongArray9[local13] = arg3;
		this.aShortArray29[this.anInt772] = (short) arg2;
		this.aShortArray27[this.anInt772] = (short) arg1;
		this.aShortArray30[this.anInt772] = (short) arg4;
		this.aShortArray38[this.anInt772] = (short) arg5;
		this.aShortArray39[this.anInt772] = (short) arg6;
		this.aByteArray17[this.anInt772] = (byte) arg7;
		this.aFloatArray30[this.anInt772] = arg8;
		this.aFloatArray29[this.anInt772] = arg9;
		return (short) this.anInt772++;
	}

	@OriginalMember(owner = "client!aey", name = "hb", descriptor = "([BI)[B", line = 691)
	static byte[] method6966(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aey", name = "iz", descriptor = "([BI)[B", line = 691)
	static byte[] method6967(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aey", name = "is", descriptor = "([BI)[B", line = 691)
	static byte[] method6968(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aey", name = "ix", descriptor = "([BI)[B", line = 691)
	static byte[] method6969(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aey", name = "hg", descriptor = "([SI)[S", line = 697)
	static short[] method6970(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aey", name = "ij", descriptor = "([SI)[S", line = 697)
	static short[] method6971(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aey", name = "ik", descriptor = "([SI)[S", line = 697)
	static short[] method6972(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aey", name = "ia", descriptor = "([SI)[S", line = 697)
	static short[] method6973(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aey", name = "hv", descriptor = "([FI)[F", line = 703)
	static float[] method6974(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aey", name = "ir", descriptor = "([FI)[F", line = 703)
	static float[] method6975(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aey", name = "im", descriptor = "([FI)[F", line = 703)
	static float[] method6976(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aey", name = "x", descriptor = "()I", line = 709)
	@Override
	public int method6875() {
		return this.anInt769;
	}

	@OriginalMember(owner = "client!aey", name = "bf", descriptor = "()I", line = 709)
	@Override
	public int method6801() {
		return this.anInt769;
	}

	@OriginalMember(owner = "client!aey", name = "bu", descriptor = "()I", line = 709)
	@Override
	public int method6850() {
		return this.anInt769;
	}

	@OriginalMember(owner = "client!aey", name = "q", descriptor = "(I)V", line = 713)
	@Override
	public void method6795(@OriginalArg(0) int arg0) {
		if (this.aClass389_1 != null) {
			this.aClass389_1.aBoolean730 = Class362.method28066(arg0, this.anInt787);
		}
		if (this.aClass389_4 != null) {
			this.aClass389_4.aBoolean730 = Class362.method28074(arg0, this.anInt787);
		}
		if (this.aClass389_2 != null) {
			this.aClass389_2.aBoolean730 = Class362.method28071(arg0, this.anInt787);
		}
		if (this.aClass389_3 != null) {
			this.aClass389_3.aBoolean730 = Class362.method28069(arg0, this.anInt787);
		}
		this.anInt769 = arg0;
		if (this.aClass376_1 != null && (this.anInt769 & 0x10000) == 0) {
			this.aShortArray30 = this.aClass376_1.aShortArray128;
			this.aShortArray38 = this.aClass376_1.aShortArray127;
			this.aShortArray39 = this.aClass376_1.aShortArray129;
			this.aByteArray17 = this.aClass376_1.aByteArray84;
			this.aClass376_1 = null;
		}
		this.aBoolean155 = true;
		this.method6979();
	}

	@OriginalMember(owner = "client!aey", name = "bn", descriptor = "(I)V", line = 713)
	@Override
	public void method6852(@OriginalArg(0) int arg0) {
		if (this.aClass389_1 != null) {
			this.aClass389_1.aBoolean730 = Class362.method28066(arg0, this.anInt787);
		}
		if (this.aClass389_4 != null) {
			this.aClass389_4.aBoolean730 = Class362.method28074(arg0, this.anInt787);
		}
		if (this.aClass389_2 != null) {
			this.aClass389_2.aBoolean730 = Class362.method28071(arg0, this.anInt787);
		}
		if (this.aClass389_3 != null) {
			this.aClass389_3.aBoolean730 = Class362.method28069(arg0, this.anInt787);
		}
		this.anInt769 = arg0;
		if (this.aClass376_1 != null && (this.anInt769 & 0x10000) == 0) {
			this.aShortArray30 = this.aClass376_1.aShortArray128;
			this.aShortArray38 = this.aClass376_1.aShortArray127;
			this.aShortArray39 = this.aClass376_1.aShortArray129;
			this.aByteArray17 = this.aClass376_1.aByteArray84;
			this.aClass376_1 = null;
		}
		this.aBoolean155 = true;
		this.method6979();
	}

	@OriginalMember(owner = "client!aey", name = "d", descriptor = "()V", line = 730)
	@Override
	public void method6796() {
		if (this.anInt772 > 0 && this.anInt775 > 0) {
			this.method7010();
			this.method7009();
			this.method6979();
		}
	}

	@OriginalMember(owner = "client!aey", name = "bp", descriptor = "()V", line = 730)
	@Override
	public void method6823() {
		if (this.anInt772 > 0 && this.anInt775 > 0) {
			this.method7010();
			this.method7009();
			this.method6979();
		}
	}

	@OriginalMember(owner = "client!aey", name = "bm", descriptor = "()V", line = 730)
	@Override
	public void method6854() {
		if (this.anInt772 > 0 && this.anInt775 > 0) {
			this.method7010();
			this.method7009();
			this.method6979();
		}
	}

	@OriginalMember(owner = "client!aey", name = "bk", descriptor = "()V", line = 730)
	@Override
	public void method6869() {
		if (this.anInt772 > 0 && this.anInt775 > 0) {
			this.method7010();
			this.method7009();
			this.method6979();
		}
	}

	@OriginalMember(owner = "client!aey", name = "bo", descriptor = "()V", line = 730)
	@Override
	public void method6957() {
		if (this.anInt772 > 0 && this.anInt775 > 0) {
			this.method7010();
			this.method7009();
			this.method6979();
		}
	}

	@OriginalMember(owner = "client!aey", name = "t", descriptor = "(BIZ)Lclient!dv;", line = 739)
	@Override
	public Class84 method6794(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class84_Sub3 local22;
		@Pc(14) Class84_Sub3 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass86_Sub1_4.aClass84_Sub3Array6[arg0 - 1];
			local22 = this.aClass86_Sub1_4.aClass84_Sub3Array5[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class84_Sub3(this.aClass86_Sub1_4, 0, 0, true, false);
		}
		return this.method6977(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!aey", name = "bz", descriptor = "(BIZ)Lclient!dv;", line = 739)
	@Override
	public Class84 method6849(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class84_Sub3 local22;
		@Pc(14) Class84_Sub3 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass86_Sub1_4.aClass84_Sub3Array6[arg0 - 1];
			local22 = this.aClass86_Sub1_4.aClass84_Sub3Array5[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class84_Sub3(this.aClass86_Sub1_4, 0, 0, true, false);
		}
		return this.method6977(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!aey", name = "bt", descriptor = "(BIZ)Lclient!dv;", line = 739)
	@Override
	public Class84 method6848(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class84_Sub3 local22;
		@Pc(14) Class84_Sub3 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass86_Sub1_4.aClass84_Sub3Array6[arg0 - 1];
			local22 = this.aClass86_Sub1_4.aClass84_Sub3Array5[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class84_Sub3(this.aClass86_Sub1_4, 0, 0, true, false);
		}
		return this.method6977(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!aey", name = "hk", descriptor = "(Lclient!aey;Lclient!aey;IZZ)Lclient!dv;", line = 752)
	Class84 method6977(@OriginalArg(0) Class84_Sub3 arg0, @OriginalArg(1) Class84_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		arg0.anInt769 = arg2;
		arg0.anInt787 = this.anInt787;
		arg0.aShort22 = this.aShort22;
		arg0.aShort23 = this.aShort23;
		arg0.anInt770 = this.anInt770;
		arg0.anInt771 = this.anInt771;
		arg0.anInt772 = this.anInt772;
		arg0.anInt774 = this.anInt774;
		arg0.anInt775 = this.anInt775;
		arg0.anInt781 = this.anInt781;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean156 = this.aBoolean156;
		} else {
			arg0.aBoolean156 = true;
		}
		arg0.aBoolean157 = this.aBoolean157;
		@Pc(59) boolean local59 = Class362.method28012(arg2, this.anInt787);
		@Pc(64) boolean local64 = Class362.method28016(arg2, this.anInt787);
		@Pc(69) boolean local69 = Class362.method28019(arg2, this.anInt787);
		@Pc(75) boolean local75 = local59 | local64 | local69;
		@Pc(166) int local166;
		if (local75) {
			if (!local59) {
				arg0.anIntArray70 = this.anIntArray70;
			} else if (arg1.anIntArray70 == null || arg1.anIntArray70.length < this.anInt770) {
				arg0.anIntArray70 = arg1.anIntArray70 = new int[this.anInt770];
			} else {
				arg0.anIntArray70 = arg1.anIntArray70;
			}
			if (!local64) {
				arg0.anIntArray71 = this.anIntArray71;
			} else if (arg1.anIntArray71 == null || arg1.anIntArray71.length < this.anInt770) {
				arg0.anIntArray71 = arg1.anIntArray71 = new int[this.anInt770];
			} else {
				arg0.anIntArray71 = arg1.anIntArray71;
			}
			if (!local69) {
				arg0.anIntArray75 = this.anIntArray75;
			} else if (arg1.anIntArray75 == null || arg1.anIntArray75.length < this.anInt770) {
				arg0.anIntArray75 = arg1.anIntArray75 = new int[this.anInt770];
			} else {
				arg0.anIntArray75 = arg1.anIntArray75;
			}
			for (local166 = 0; local166 < this.anInt770; local166++) {
				if (local59) {
					arg0.anIntArray70[local166] = this.anIntArray70[local166];
				}
				if (local64) {
					arg0.anIntArray71[local166] = this.anIntArray71[local166];
				}
				if (local69) {
					arg0.anIntArray75[local166] = this.anIntArray75[local166];
				}
			}
		} else {
			arg0.anIntArray70 = this.anIntArray70;
			arg0.anIntArray71 = this.anIntArray71;
			arg0.anIntArray75 = this.anIntArray75;
		}
		if (Class362.method28066(arg2, this.anInt787)) {
			arg0.aClass389_1 = arg1.aClass389_1;
			arg0.aClass389_1.anInterface36_22 = this.aClass389_1.anInterface36_22;
			arg0.aClass389_1.aBoolean729 = this.aClass389_1.aBoolean729;
			arg0.aClass389_1.aBoolean730 = true;
		} else if (Class362.method28048(arg2, this.anInt787)) {
			arg0.aClass389_1 = this.aClass389_1;
		} else {
			arg0.aClass389_1 = null;
		}
		if (Class362.method28026(arg2, this.anInt787)) {
			if (arg1.aShortArray31 == null || arg1.aShortArray31.length < this.anInt774) {
				arg0.aShortArray31 = arg1.aShortArray31 = new short[this.anInt774];
			} else {
				arg0.aShortArray31 = arg1.aShortArray31;
			}
			for (local166 = 0; local166 < this.anInt774; local166++) {
				arg0.aShortArray31[local166] = this.aShortArray31[local166];
			}
		} else {
			arg0.aShortArray31 = this.aShortArray31;
		}
		if (Class362.method28029(arg2, this.anInt787)) {
			if (arg1.aByteArray18 == null || arg1.aByteArray18.length < this.anInt774) {
				arg0.aByteArray18 = arg1.aByteArray18 = new byte[this.anInt774];
			} else {
				arg0.aByteArray18 = arg1.aByteArray18;
			}
			for (local166 = 0; local166 < this.anInt774; local166++) {
				arg0.aByteArray18[local166] = this.aByteArray18[local166];
			}
		} else {
			arg0.aByteArray18 = this.aByteArray18;
		}
		if (Class362.method28071(arg2, this.anInt787)) {
			arg0.aClass389_2 = arg1.aClass389_2;
			arg0.aClass389_2.anInterface36_22 = this.aClass389_2.anInterface36_22;
			arg0.aClass389_2.aBoolean729 = this.aClass389_2.aBoolean729;
			arg0.aClass389_2.aBoolean730 = true;
		} else if (Class362.method28058(arg2, this.anInt787)) {
			arg0.aClass389_2 = this.aClass389_2;
		} else {
			arg0.aClass389_2 = null;
		}
		@Pc(469) int local469;
		if (Class362.method28025(arg2, this.anInt787)) {
			if (arg1.aShortArray30 == null || arg1.aShortArray30.length < this.anInt772) {
				local166 = this.anInt772;
				arg0.aShortArray30 = arg1.aShortArray30 = new short[local166];
				arg0.aShortArray38 = arg1.aShortArray38 = new short[local166];
				arg0.aShortArray39 = arg1.aShortArray39 = new short[local166];
			} else {
				arg0.aShortArray30 = arg1.aShortArray30;
				arg0.aShortArray38 = arg1.aShortArray38;
				arg0.aShortArray39 = arg1.aShortArray39;
			}
			if (this.aClass376_1 == null) {
				arg0.aClass376_1 = null;
				for (local166 = 0; local166 < this.anInt772; local166++) {
					arg0.aShortArray30[local166] = this.aShortArray30[local166];
					arg0.aShortArray38[local166] = this.aShortArray38[local166];
					arg0.aShortArray39[local166] = this.aShortArray39[local166];
				}
			} else {
				if (arg1.aClass376_1 == null) {
					arg1.aClass376_1 = new Class376();
				}
				@Pc(457) Class376 local457 = arg0.aClass376_1 = arg1.aClass376_1;
				if (local457.aShortArray128 == null || local457.aShortArray128.length < this.anInt772) {
					local469 = this.anInt772;
					local457.aShortArray128 = new short[local469];
					local457.aShortArray127 = new short[local469];
					local457.aShortArray129 = new short[local469];
					local457.aByteArray84 = new byte[local469];
				}
				for (local469 = 0; local469 < this.anInt772; local469++) {
					arg0.aShortArray30[local469] = this.aShortArray30[local469];
					arg0.aShortArray38[local469] = this.aShortArray38[local469];
					arg0.aShortArray39[local469] = this.aShortArray39[local469];
					local457.aShortArray128[local469] = this.aClass376_1.aShortArray128[local469];
					local457.aShortArray127[local469] = this.aClass376_1.aShortArray127[local469];
					local457.aShortArray129[local469] = this.aClass376_1.aShortArray129[local469];
					local457.aByteArray84[local469] = this.aClass376_1.aByteArray84[local469];
				}
			}
			arg0.aByteArray17 = this.aByteArray17;
		} else {
			arg0.aClass376_1 = this.aClass376_1;
			arg0.aShortArray30 = this.aShortArray30;
			arg0.aShortArray38 = this.aShortArray38;
			arg0.aShortArray39 = this.aShortArray39;
			arg0.aByteArray17 = this.aByteArray17;
		}
		if (Class362.method28069(arg2, this.anInt787)) {
			arg0.aClass389_3 = arg1.aClass389_3;
			arg0.aClass389_3.anInterface36_22 = this.aClass389_3.anInterface36_22;
			arg0.aClass389_3.aBoolean729 = this.aClass389_3.aBoolean729;
			arg0.aClass389_3.aBoolean730 = true;
		} else if (Class362.method28053(arg2, this.anInt787)) {
			arg0.aClass389_3 = this.aClass389_3;
		} else {
			arg0.aClass389_3 = null;
		}
		if (Class362.method28032(arg2, this.anInt787)) {
			if (arg1.aFloatArray30 == null || arg1.aFloatArray30.length < this.anInt774) {
				local166 = this.anInt772;
				arg0.aFloatArray30 = arg1.aFloatArray30 = new float[local166];
				arg0.aFloatArray29 = arg1.aFloatArray29 = new float[local166];
			} else {
				arg0.aFloatArray30 = arg1.aFloatArray30;
				arg0.aFloatArray29 = arg1.aFloatArray29;
			}
			for (local166 = 0; local166 < this.anInt772; local166++) {
				arg0.aFloatArray30[local166] = this.aFloatArray30[local166];
				arg0.aFloatArray29[local166] = this.aFloatArray29[local166];
			}
		} else {
			arg0.aFloatArray30 = this.aFloatArray30;
			arg0.aFloatArray29 = this.aFloatArray29;
		}
		if (Class362.method28074(arg2, this.anInt787)) {
			arg0.aClass389_4 = arg1.aClass389_4;
			arg0.aClass389_4.anInterface36_22 = this.aClass389_4.anInterface36_22;
			arg0.aClass389_4.aBoolean729 = this.aClass389_4.aBoolean729;
			arg0.aClass389_4.aBoolean730 = true;
		} else if (Class362.method28059(arg2, this.anInt787)) {
			arg0.aClass389_4 = this.aClass389_4;
		} else {
			arg0.aClass389_4 = null;
		}
		if (Class362.method28033(arg2, this.anInt787)) {
			if (arg1.aShortArray36 == null || arg1.aShortArray36.length < this.anInt774) {
				local166 = this.anInt774;
				arg0.aShortArray36 = arg1.aShortArray36 = new short[local166];
				arg0.aShortArray35 = arg1.aShortArray35 = new short[local166];
				arg0.aShortArray34 = arg1.aShortArray34 = new short[local166];
			} else {
				arg0.aShortArray36 = arg1.aShortArray36;
				arg0.aShortArray35 = arg1.aShortArray35;
				arg0.aShortArray34 = arg1.aShortArray34;
			}
			for (local166 = 0; local166 < this.anInt774; local166++) {
				arg0.aShortArray36[local166] = this.aShortArray36[local166];
				arg0.aShortArray35[local166] = this.aShortArray35[local166];
				arg0.aShortArray34[local166] = this.aShortArray34[local166];
			}
		} else {
			arg0.aShortArray36 = this.aShortArray36;
			arg0.aShortArray35 = this.aShortArray35;
			arg0.aShortArray34 = this.aShortArray34;
		}
		if (Class362.method28077(arg2, this.anInt787)) {
			arg0.aClass356_1 = arg1.aClass356_1;
			arg0.aClass356_1.anInterface38_5 = this.aClass356_1.anInterface38_5;
			arg0.aClass356_1.aBoolean721 = this.aClass356_1.aBoolean721;
			arg0.aClass356_1.aBoolean720 = true;
		} else if (Class362.method28062(arg2, this.anInt787)) {
			arg0.aClass356_1 = this.aClass356_1;
		} else {
			arg0.aClass356_1 = null;
		}
		if (Class362.method28041(arg2, this.anInt787)) {
			if (arg1.aShortArray32 == null || arg1.aShortArray32.length < this.anInt774) {
				local166 = this.anInt774;
				arg0.aShortArray32 = arg1.aShortArray32 = new short[local166];
			} else {
				arg0.aShortArray32 = arg1.aShortArray32;
			}
			for (local166 = 0; local166 < this.anInt774; local166++) {
				arg0.aShortArray32[local166] = this.aShortArray32[local166];
			}
		} else {
			arg0.aShortArray32 = this.aShortArray32;
		}
		if (!Class362.method28042(arg2, this.anInt787)) {
			arg0.aClass360Array1 = this.aClass360Array1;
		} else if (arg1.aClass360Array1 == null || arg1.aClass360Array1.length < this.anInt781) {
			local166 = this.anInt781;
			arg0.aClass360Array1 = arg1.aClass360Array1 = new Class360[local166];
			for (local469 = 0; local469 < this.anInt781; local469++) {
				arg0.aClass360Array1[local469] = this.aClass360Array1[local469].method28001();
			}
		} else {
			arg0.aClass360Array1 = arg1.aClass360Array1;
			for (local166 = 0; local166 < this.anInt781; local166++) {
				arg0.aClass360Array1[local166].method28003(this.aClass360Array1[local166]);
			}
		}
		arg0.aClass378Array1 = this.aClass378Array1;
		if (this.aBoolean158) {
			arg0.anInt776 = this.anInt776;
			arg0.anInt784 = this.anInt784;
			arg0.anInt782 = this.anInt782;
			arg0.anInt779 = this.anInt779;
			arg0.anInt767 = this.anInt767;
			arg0.anInt778 = this.anInt778;
			arg0.anInt780 = this.anInt780;
			arg0.anInt783 = this.anInt783;
			arg0.aBoolean158 = true;
		} else {
			arg0.aBoolean158 = false;
		}
		if (this.aBoolean159) {
			arg0.anInt777 = this.anInt777;
			arg0.aBoolean159 = true;
		} else {
			arg0.aBoolean159 = false;
		}
		arg0.anIntArrayArray11 = this.anIntArrayArray11;
		arg0.anIntArrayArray12 = this.anIntArrayArray12;
		arg0.anIntArrayArray13 = this.anIntArrayArray13;
		arg0.aShortArray37 = this.aShortArray37;
		arg0.anIntArray77 = this.anIntArray77;
		arg0.aShortArray27 = this.aShortArray27;
		arg0.aShortArray29 = this.aShortArray29;
		arg0.aShortArray28 = this.aShortArray28;
		arg0.aShortArray33 = this.aShortArray33;
		arg0.anIntArray74 = this.anIntArray74;
		arg0.anIntArray79 = this.anIntArray79;
		arg0.anIntArray78 = this.anIntArray78;
		arg0.aClass205Array3 = this.aClass205Array3;
		arg0.aClass195Array3 = this.aClass195Array3;
		return arg0;
	}

	@OriginalMember(owner = "client!aey", name = "io", descriptor = "(Lclient!aey;Lclient!aey;IZZ)Lclient!dv;", line = 752)
	Class84 method6978(@OriginalArg(0) Class84_Sub3 arg0, @OriginalArg(1) Class84_Sub3 arg1, @OriginalArg(2) int arg2) {
		arg0.anInt769 = arg2;
		arg0.anInt787 = this.anInt787;
		arg0.aShort22 = this.aShort22;
		arg0.aShort23 = this.aShort23;
		arg0.anInt770 = this.anInt770;
		arg0.anInt771 = this.anInt771;
		arg0.anInt772 = this.anInt772;
		arg0.anInt774 = this.anInt774;
		arg0.anInt775 = this.anInt775;
		arg0.anInt781 = this.anInt781;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean156 = this.aBoolean156;
		} else {
			arg0.aBoolean156 = true;
		}
		arg0.aBoolean157 = this.aBoolean157;
		@Pc(59) boolean local59 = Class362.method28012(arg2, this.anInt787);
		@Pc(64) boolean local64 = Class362.method28016(arg2, this.anInt787);
		@Pc(69) boolean local69 = Class362.method28019(arg2, this.anInt787);
		@Pc(75) boolean local75 = local59 | local64 | local69;
		@Pc(166) int local166;
		if (local75) {
			if (!local59) {
				arg0.anIntArray70 = this.anIntArray70;
			} else if (arg1.anIntArray70 == null || arg1.anIntArray70.length < this.anInt770) {
				arg0.anIntArray70 = arg1.anIntArray70 = new int[this.anInt770];
			} else {
				arg0.anIntArray70 = arg1.anIntArray70;
			}
			if (!local64) {
				arg0.anIntArray71 = this.anIntArray71;
			} else if (arg1.anIntArray71 == null || arg1.anIntArray71.length < this.anInt770) {
				arg0.anIntArray71 = arg1.anIntArray71 = new int[this.anInt770];
			} else {
				arg0.anIntArray71 = arg1.anIntArray71;
			}
			if (!local69) {
				arg0.anIntArray75 = this.anIntArray75;
			} else if (arg1.anIntArray75 == null || arg1.anIntArray75.length < this.anInt770) {
				arg0.anIntArray75 = arg1.anIntArray75 = new int[this.anInt770];
			} else {
				arg0.anIntArray75 = arg1.anIntArray75;
			}
			for (local166 = 0; local166 < this.anInt770; local166++) {
				if (local59) {
					arg0.anIntArray70[local166] = this.anIntArray70[local166];
				}
				if (local64) {
					arg0.anIntArray71[local166] = this.anIntArray71[local166];
				}
				if (local69) {
					arg0.anIntArray75[local166] = this.anIntArray75[local166];
				}
			}
		} else {
			arg0.anIntArray70 = this.anIntArray70;
			arg0.anIntArray71 = this.anIntArray71;
			arg0.anIntArray75 = this.anIntArray75;
		}
		if (Class362.method28066(arg2, this.anInt787)) {
			arg0.aClass389_1 = arg1.aClass389_1;
			arg0.aClass389_1.anInterface36_22 = this.aClass389_1.anInterface36_22;
			arg0.aClass389_1.aBoolean729 = this.aClass389_1.aBoolean729;
			arg0.aClass389_1.aBoolean730 = true;
		} else if (Class362.method28048(arg2, this.anInt787)) {
			arg0.aClass389_1 = this.aClass389_1;
		} else {
			arg0.aClass389_1 = null;
		}
		if (Class362.method28026(arg2, this.anInt787)) {
			if (arg1.aShortArray31 == null || arg1.aShortArray31.length < this.anInt774) {
				arg0.aShortArray31 = arg1.aShortArray31 = new short[this.anInt774];
			} else {
				arg0.aShortArray31 = arg1.aShortArray31;
			}
			for (local166 = 0; local166 < this.anInt774; local166++) {
				arg0.aShortArray31[local166] = this.aShortArray31[local166];
			}
		} else {
			arg0.aShortArray31 = this.aShortArray31;
		}
		if (Class362.method28029(arg2, this.anInt787)) {
			if (arg1.aByteArray18 == null || arg1.aByteArray18.length < this.anInt774) {
				arg0.aByteArray18 = arg1.aByteArray18 = new byte[this.anInt774];
			} else {
				arg0.aByteArray18 = arg1.aByteArray18;
			}
			for (local166 = 0; local166 < this.anInt774; local166++) {
				arg0.aByteArray18[local166] = this.aByteArray18[local166];
			}
		} else {
			arg0.aByteArray18 = this.aByteArray18;
		}
		if (Class362.method28071(arg2, this.anInt787)) {
			arg0.aClass389_2 = arg1.aClass389_2;
			arg0.aClass389_2.anInterface36_22 = this.aClass389_2.anInterface36_22;
			arg0.aClass389_2.aBoolean729 = this.aClass389_2.aBoolean729;
			arg0.aClass389_2.aBoolean730 = true;
		} else if (Class362.method28058(arg2, this.anInt787)) {
			arg0.aClass389_2 = this.aClass389_2;
		} else {
			arg0.aClass389_2 = null;
		}
		@Pc(469) int local469;
		if (Class362.method28025(arg2, this.anInt787)) {
			if (arg1.aShortArray30 == null || arg1.aShortArray30.length < this.anInt772) {
				local166 = this.anInt772;
				arg0.aShortArray30 = arg1.aShortArray30 = new short[local166];
				arg0.aShortArray38 = arg1.aShortArray38 = new short[local166];
				arg0.aShortArray39 = arg1.aShortArray39 = new short[local166];
			} else {
				arg0.aShortArray30 = arg1.aShortArray30;
				arg0.aShortArray38 = arg1.aShortArray38;
				arg0.aShortArray39 = arg1.aShortArray39;
			}
			if (this.aClass376_1 == null) {
				arg0.aClass376_1 = null;
				for (local166 = 0; local166 < this.anInt772; local166++) {
					arg0.aShortArray30[local166] = this.aShortArray30[local166];
					arg0.aShortArray38[local166] = this.aShortArray38[local166];
					arg0.aShortArray39[local166] = this.aShortArray39[local166];
				}
			} else {
				if (arg1.aClass376_1 == null) {
					arg1.aClass376_1 = new Class376();
				}
				@Pc(457) Class376 local457 = arg0.aClass376_1 = arg1.aClass376_1;
				if (local457.aShortArray128 == null || local457.aShortArray128.length < this.anInt772) {
					local469 = this.anInt772;
					local457.aShortArray128 = new short[local469];
					local457.aShortArray127 = new short[local469];
					local457.aShortArray129 = new short[local469];
					local457.aByteArray84 = new byte[local469];
				}
				for (local469 = 0; local469 < this.anInt772; local469++) {
					arg0.aShortArray30[local469] = this.aShortArray30[local469];
					arg0.aShortArray38[local469] = this.aShortArray38[local469];
					arg0.aShortArray39[local469] = this.aShortArray39[local469];
					local457.aShortArray128[local469] = this.aClass376_1.aShortArray128[local469];
					local457.aShortArray127[local469] = this.aClass376_1.aShortArray127[local469];
					local457.aShortArray129[local469] = this.aClass376_1.aShortArray129[local469];
					local457.aByteArray84[local469] = this.aClass376_1.aByteArray84[local469];
				}
			}
			arg0.aByteArray17 = this.aByteArray17;
		} else {
			arg0.aClass376_1 = this.aClass376_1;
			arg0.aShortArray30 = this.aShortArray30;
			arg0.aShortArray38 = this.aShortArray38;
			arg0.aShortArray39 = this.aShortArray39;
			arg0.aByteArray17 = this.aByteArray17;
		}
		if (Class362.method28069(arg2, this.anInt787)) {
			arg0.aClass389_3 = arg1.aClass389_3;
			arg0.aClass389_3.anInterface36_22 = this.aClass389_3.anInterface36_22;
			arg0.aClass389_3.aBoolean729 = this.aClass389_3.aBoolean729;
			arg0.aClass389_3.aBoolean730 = true;
		} else if (Class362.method28053(arg2, this.anInt787)) {
			arg0.aClass389_3 = this.aClass389_3;
		} else {
			arg0.aClass389_3 = null;
		}
		if (Class362.method28032(arg2, this.anInt787)) {
			if (arg1.aFloatArray30 == null || arg1.aFloatArray30.length < this.anInt774) {
				local166 = this.anInt772;
				arg0.aFloatArray30 = arg1.aFloatArray30 = new float[local166];
				arg0.aFloatArray29 = arg1.aFloatArray29 = new float[local166];
			} else {
				arg0.aFloatArray30 = arg1.aFloatArray30;
				arg0.aFloatArray29 = arg1.aFloatArray29;
			}
			for (local166 = 0; local166 < this.anInt772; local166++) {
				arg0.aFloatArray30[local166] = this.aFloatArray30[local166];
				arg0.aFloatArray29[local166] = this.aFloatArray29[local166];
			}
		} else {
			arg0.aFloatArray30 = this.aFloatArray30;
			arg0.aFloatArray29 = this.aFloatArray29;
		}
		if (Class362.method28074(arg2, this.anInt787)) {
			arg0.aClass389_4 = arg1.aClass389_4;
			arg0.aClass389_4.anInterface36_22 = this.aClass389_4.anInterface36_22;
			arg0.aClass389_4.aBoolean729 = this.aClass389_4.aBoolean729;
			arg0.aClass389_4.aBoolean730 = true;
		} else if (Class362.method28059(arg2, this.anInt787)) {
			arg0.aClass389_4 = this.aClass389_4;
		} else {
			arg0.aClass389_4 = null;
		}
		if (Class362.method28033(arg2, this.anInt787)) {
			if (arg1.aShortArray36 == null || arg1.aShortArray36.length < this.anInt774) {
				local166 = this.anInt774;
				arg0.aShortArray36 = arg1.aShortArray36 = new short[local166];
				arg0.aShortArray35 = arg1.aShortArray35 = new short[local166];
				arg0.aShortArray34 = arg1.aShortArray34 = new short[local166];
			} else {
				arg0.aShortArray36 = arg1.aShortArray36;
				arg0.aShortArray35 = arg1.aShortArray35;
				arg0.aShortArray34 = arg1.aShortArray34;
			}
			for (local166 = 0; local166 < this.anInt774; local166++) {
				arg0.aShortArray36[local166] = this.aShortArray36[local166];
				arg0.aShortArray35[local166] = this.aShortArray35[local166];
				arg0.aShortArray34[local166] = this.aShortArray34[local166];
			}
		} else {
			arg0.aShortArray36 = this.aShortArray36;
			arg0.aShortArray35 = this.aShortArray35;
			arg0.aShortArray34 = this.aShortArray34;
		}
		if (Class362.method28077(arg2, this.anInt787)) {
			arg0.aClass356_1 = arg1.aClass356_1;
			arg0.aClass356_1.anInterface38_5 = this.aClass356_1.anInterface38_5;
			arg0.aClass356_1.aBoolean721 = this.aClass356_1.aBoolean721;
			arg0.aClass356_1.aBoolean720 = true;
		} else if (Class362.method28062(arg2, this.anInt787)) {
			arg0.aClass356_1 = this.aClass356_1;
		} else {
			arg0.aClass356_1 = null;
		}
		if (Class362.method28041(arg2, this.anInt787)) {
			if (arg1.aShortArray32 == null || arg1.aShortArray32.length < this.anInt774) {
				local166 = this.anInt774;
				arg0.aShortArray32 = arg1.aShortArray32 = new short[local166];
			} else {
				arg0.aShortArray32 = arg1.aShortArray32;
			}
			for (local166 = 0; local166 < this.anInt774; local166++) {
				arg0.aShortArray32[local166] = this.aShortArray32[local166];
			}
		} else {
			arg0.aShortArray32 = this.aShortArray32;
		}
		if (!Class362.method28042(arg2, this.anInt787)) {
			arg0.aClass360Array1 = this.aClass360Array1;
		} else if (arg1.aClass360Array1 == null || arg1.aClass360Array1.length < this.anInt781) {
			local166 = this.anInt781;
			arg0.aClass360Array1 = arg1.aClass360Array1 = new Class360[local166];
			for (local469 = 0; local469 < this.anInt781; local469++) {
				arg0.aClass360Array1[local469] = this.aClass360Array1[local469].method28001();
			}
		} else {
			arg0.aClass360Array1 = arg1.aClass360Array1;
			for (local166 = 0; local166 < this.anInt781; local166++) {
				arg0.aClass360Array1[local166].method28003(this.aClass360Array1[local166]);
			}
		}
		arg0.aClass378Array1 = this.aClass378Array1;
		if (this.aBoolean158) {
			arg0.anInt776 = this.anInt776;
			arg0.anInt784 = this.anInt784;
			arg0.anInt782 = this.anInt782;
			arg0.anInt779 = this.anInt779;
			arg0.anInt767 = this.anInt767;
			arg0.anInt778 = this.anInt778;
			arg0.anInt780 = this.anInt780;
			arg0.anInt783 = this.anInt783;
			arg0.aBoolean158 = true;
		} else {
			arg0.aBoolean158 = false;
		}
		if (this.aBoolean159) {
			arg0.anInt777 = this.anInt777;
			arg0.aBoolean159 = true;
		} else {
			arg0.aBoolean159 = false;
		}
		arg0.anIntArrayArray11 = this.anIntArrayArray11;
		arg0.anIntArrayArray12 = this.anIntArrayArray12;
		arg0.anIntArrayArray13 = this.anIntArrayArray13;
		arg0.aShortArray37 = this.aShortArray37;
		arg0.anIntArray77 = this.anIntArray77;
		arg0.aShortArray27 = this.aShortArray27;
		arg0.aShortArray29 = this.aShortArray29;
		arg0.aShortArray28 = this.aShortArray28;
		arg0.aShortArray33 = this.aShortArray33;
		arg0.anIntArray74 = this.anIntArray74;
		arg0.anIntArray79 = this.anIntArray79;
		arg0.anIntArray78 = this.anIntArray78;
		arg0.aClass205Array3 = this.aClass205Array3;
		arg0.aClass195Array3 = this.aClass195Array3;
		return arg0;
	}

	@OriginalMember(owner = "client!aey", name = "hy", descriptor = "()V", line = 1022)
	void method6979() {
		if (!this.aBoolean155) {
			return;
		}
		this.aBoolean155 = false;
		if (this.aClass205Array3 == null && this.aClass195Array3 == null && this.aClass378Array1 == null && !Class362.method28020(this.anInt769, this.anInt787)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray70 != null && !Class362.method28083(this.anInt769, this.anInt787)) {
				if (this.aClass389_1 == null || this.aClass389_1.method28353()) {
					if (!this.aBoolean158) {
						this.method6991();
					}
					local23 = true;
				} else {
					this.aBoolean155 = true;
				}
			}
			if (this.anIntArray71 != null && !Class362.method28085(this.anInt769, this.anInt787)) {
				if (this.aClass389_1 == null || this.aClass389_1.method28353()) {
					if (!this.aBoolean158) {
						this.method6991();
					}
					local25 = true;
				} else {
					this.aBoolean155 = true;
				}
			}
			if (this.anIntArray75 != null && !Class362.method28089(this.anInt769, this.anInt787)) {
				if (this.aClass389_1 == null || this.aClass389_1.method28353()) {
					if (!this.aBoolean158) {
						this.method6991();
					}
					local27 = true;
				} else {
					this.aBoolean155 = true;
				}
			}
			if (local23) {
				this.anIntArray70 = null;
			}
			if (local25) {
				this.anIntArray71 = null;
			}
			if (local27) {
				this.anIntArray75 = null;
			}
		}
		if (this.aShortArray37 != null && this.anIntArray70 == null && this.anIntArray71 == null && this.anIntArray75 == null) {
			this.aShortArray37 = null;
			this.anIntArray77 = null;
		}
		if (this.aByteArray17 != null && !Class362.method28091(this.anInt769, this.anInt787)) {
			label204: {
				label203: {
					if ((this.anInt787 & 0x37) == 0) {
						if (this.aClass389_2 == null || this.aClass389_2.method28353()) {
							break label203;
						}
					} else if (this.aClass389_3 == null || this.aClass389_3.method28353()) {
						break label203;
					}
					this.aBoolean155 = true;
					break label204;
				}
				this.aShortArray39 = null;
				this.aShortArray38 = null;
				this.aShortArray30 = null;
				this.aByteArray17 = null;
			}
		}
		if (this.aShortArray31 != null && !Class362.method28096(this.anInt769, this.anInt787)) {
			if (this.aClass389_2 == null || this.aClass389_2.method28353()) {
				this.aShortArray31 = null;
			} else {
				this.aBoolean155 = true;
			}
		}
		if (this.aByteArray18 != null && !Class362.method28100(this.anInt769, this.anInt787)) {
			if (this.aClass389_2 == null || this.aClass389_2.method28353()) {
				this.aByteArray18 = null;
			} else {
				this.aBoolean155 = true;
			}
		}
		if (this.aFloatArray30 != null && !Class362.method28102(this.anInt769, this.anInt787)) {
			if (this.aClass389_4 == null || this.aClass389_4.method28353()) {
				this.aFloatArray29 = null;
				this.aFloatArray30 = null;
			} else {
				this.aBoolean155 = true;
			}
		}
		if (this.aShortArray32 != null && !Class362.method28116(this.anInt769, this.anInt787)) {
			if (this.aClass389_2 == null || this.aClass389_2.method28353()) {
				this.aShortArray32 = null;
			} else {
				this.aBoolean155 = true;
			}
		}
		if (this.aShortArray36 != null && !Class362.method28114(this.anInt769, this.anInt787)) {
			if ((this.aClass356_1 == null || this.aClass356_1.method27965()) && (this.aClass389_2 == null || this.aClass389_2.method28353())) {
				this.aShortArray34 = null;
				this.aShortArray35 = null;
				this.aShortArray36 = null;
			} else {
				this.aBoolean155 = true;
			}
		}
		if (this.aShortArray27 != null) {
			if (this.aClass389_1 == null || this.aClass389_1.method28353()) {
				this.aShortArray27 = null;
			} else {
				this.aBoolean155 = true;
			}
		}
		if (this.aShortArray29 != null) {
			if (this.aClass389_2 == null || this.aClass389_2.method28353()) {
				this.aShortArray29 = null;
			} else {
				this.aBoolean155 = true;
			}
		}
		if (this.anIntArrayArray12 != null && !Class362.method28106(this.anInt769, this.anInt787)) {
			this.anIntArrayArray12 = null;
			this.aShortArray33 = null;
		}
		if (this.anIntArrayArray11 != null && !Class362.method28109(this.anInt769, this.anInt787)) {
			this.anIntArrayArray11 = null;
			this.aShortArray28 = null;
		}
		if (this.anIntArrayArray13 != null && !Class362.method28111(this.anInt769, this.anInt787)) {
			this.anIntArrayArray13 = null;
		}
		if (this.anIntArray74 != null && (this.anInt769 & 0x800) == 0 && (this.anInt769 & 0x40000) == 0) {
			this.anIntArray74 = null;
			this.anIntArray79 = null;
			this.anIntArray78 = null;
		}
	}

	@OriginalMember(owner = "client!aey", name = "hs", descriptor = "()V", line = 1120)
	void method6980() {
		if (this.aClass389_1 != null) {
			this.aClass389_1.aBoolean729 = false;
		}
	}

	@OriginalMember(owner = "client!aey", name = "il", descriptor = "()V", line = 1120)
	void method6981() {
		if (this.aClass389_1 != null) {
			this.aClass389_1.aBoolean729 = false;
		}
	}

	@OriginalMember(owner = "client!aey", name = "hm", descriptor = "()V", line = 1124)
	void method6982() {
		if (this.aClass389_2 != null) {
			this.aClass389_2.aBoolean729 = false;
		}
	}

	@OriginalMember(owner = "client!aey", name = "hx", descriptor = "()V", line = 1128)
	void method6983() {
		if ((this.anInt787 & 0x37) == 0) {
			if (this.aClass389_2 != null) {
				this.aClass389_2.aBoolean729 = false;
			}
		} else if (this.aClass389_3 != null) {
			this.aClass389_3.aBoolean729 = false;
		}
	}

	@OriginalMember(owner = "client!aey", name = "iv", descriptor = "()V", line = 1128)
	void method6984() {
		if ((this.anInt787 & 0x37) == 0) {
			if (this.aClass389_2 != null) {
				this.aClass389_2.aBoolean729 = false;
			}
		} else if (this.aClass389_3 != null) {
			this.aClass389_3.aBoolean729 = false;
		}
	}

	@OriginalMember(owner = "client!aey", name = "ih", descriptor = "()V", line = 1128)
	void method6985() {
		if ((this.anInt787 & 0x37) == 0) {
			if (this.aClass389_2 != null) {
				this.aClass389_2.aBoolean729 = false;
			}
		} else if (this.aClass389_3 != null) {
			this.aClass389_3.aBoolean729 = false;
		}
	}

	@OriginalMember(owner = "client!aey", name = "ie", descriptor = "()V", line = 1128)
	void method6986() {
		if ((this.anInt787 & 0x37) == 0) {
			if (this.aClass389_2 != null) {
				this.aClass389_2.aBoolean729 = false;
			}
		} else if (this.aClass389_3 != null) {
			this.aClass389_3.aBoolean729 = false;
		}
	}

	@OriginalMember(owner = "client!aey", name = "js", descriptor = "()V", line = 1137)
	void method6987() {
		if (this.aClass356_1 != null) {
			this.aClass356_1.aBoolean721 = false;
		}
	}

	@OriginalMember(owner = "client!aey", name = "he", descriptor = "()V", line = 1137)
	void method6988() {
		if (this.aClass356_1 != null) {
			this.aClass356_1.aBoolean721 = false;
		}
	}

	@OriginalMember(owner = "client!aey", name = "jz", descriptor = "()V", line = 1137)
	void method6989() {
		if (this.aClass356_1 != null) {
			this.aClass356_1.aBoolean721 = false;
		}
	}

	@OriginalMember(owner = "client!aey", name = "jr", descriptor = "()V", line = 1137)
	void method6990() {
		if (this.aClass356_1 != null) {
			this.aClass356_1.aBoolean721 = false;
		}
	}

	@OriginalMember(owner = "client!aey", name = "s", descriptor = "(I)V", line = 1141)
	@Override
	public void method6797(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt771; local9++) {
			@Pc(29) int local29 = this.anIntArray75[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray75[local9] = this.anIntArray75[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "br", descriptor = "(I)V", line = 1141)
	@Override
	public void method6857(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt771; local9++) {
			@Pc(29) int local29 = this.anIntArray75[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray75[local9] = this.anIntArray75[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "r", descriptor = "(I)V", line = 1153)
	@Override
	public void method6798(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt771; local9++) {
			local29 = this.anIntArray75[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray75[local9] = this.anIntArray75[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt772; local9++) {
			local29 = this.aShortArray39[local9] * local3 + this.aShortArray30[local9] * local7 >> 14;
			this.aShortArray39[local9] = (short) (this.aShortArray39[local9] * local7 - this.aShortArray30[local9] * local3 >> 14);
			this.aShortArray30[local9] = (short) local29;
		}
		this.method6980();
		this.method6983();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "fj", descriptor = "(I)V", line = 1153)
	@Override
	public void method6858(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt771; local9++) {
			local29 = this.anIntArray75[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray75[local9] = this.anIntArray75[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt772; local9++) {
			local29 = this.aShortArray39[local9] * local3 + this.aShortArray30[local9] * local7 >> 14;
			this.aShortArray39[local9] = (short) (this.aShortArray39[local9] * local7 - this.aShortArray30[local9] * local3 >> 14);
			this.aShortArray30[local9] = (short) local29;
		}
		this.method6980();
		this.method6983();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "fd", descriptor = "(I)V", line = 1153)
	@Override
	public void method6853(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt771; local9++) {
			local29 = this.anIntArray75[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray75[local9] = this.anIntArray75[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt772; local9++) {
			local29 = this.aShortArray39[local9] * local3 + this.aShortArray30[local9] * local7 >> 14;
			this.aShortArray39[local9] = (short) (this.aShortArray39[local9] * local7 - this.aShortArray30[local9] * local3 >> 14);
			this.aShortArray30[local9] = (short) local29;
		}
		this.method6980();
		this.method6983();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "fh", descriptor = "(I)V", line = 1153)
	@Override
	public void method6947(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt771; local9++) {
			local29 = this.anIntArray75[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray75[local9] = this.anIntArray75[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt772; local9++) {
			local29 = this.aShortArray39[local9] * local3 + this.aShortArray30[local9] * local7 >> 14;
			this.aShortArray39[local9] = (short) (this.aShortArray39[local9] * local7 - this.aShortArray30[local9] * local3 >> 14);
			this.aShortArray30[local9] = (short) local29;
		}
		this.method6980();
		this.method6983();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "bq", descriptor = "(I)V", line = 1171)
	@Override
	public void method6886(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt771; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local7 - this.anIntArray75[local9] * local3 >> 14;
			this.anIntArray75[local9] = this.anIntArray71[local9] * local3 + this.anIntArray75[local9] * local7 >> 14;
			this.anIntArray71[local9] = local29;
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "bh", descriptor = "(I)V", line = 1171)
	@Override
	public void method6859(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt771; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local7 - this.anIntArray75[local9] * local3 >> 14;
			this.anIntArray75[local9] = this.anIntArray71[local9] * local3 + this.anIntArray75[local9] * local7 >> 14;
			this.anIntArray71[local9] = local29;
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "be", descriptor = "(I)V", line = 1171)
	@Override
	public void method6949(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt771; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local7 - this.anIntArray75[local9] * local3 >> 14;
			this.anIntArray75[local9] = this.anIntArray71[local9] * local3 + this.anIntArray75[local9] * local7 >> 14;
			this.anIntArray71[local9] = local29;
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "g", descriptor = "(I)V", line = 1171)
	@Override
	public void method6799(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt771; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local7 - this.anIntArray75[local9] * local3 >> 14;
			this.anIntArray75[local9] = this.anIntArray71[local9] * local3 + this.anIntArray75[local9] * local7 >> 14;
			this.anIntArray71[local9] = local29;
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "z", descriptor = "(I)V", line = 1183)
	@Override
	public void method6800(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt771; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray71[local9] = this.anIntArray71[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "cg", descriptor = "(I)V", line = 1183)
	@Override
	public void method6861(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt771; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray71[local9] = this.anIntArray71[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "cb", descriptor = "(I)V", line = 1183)
	@Override
	public void method6860(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt771; local9++) {
			@Pc(29) int local29 = this.anIntArray71[local9] * local3 + this.anIntArray70[local9] * local7 >> 14;
			this.anIntArray71[local9] = this.anIntArray71[local9] * local7 - this.anIntArray70[local9] * local3 >> 14;
			this.anIntArray70[local9] = local29;
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "j", descriptor = "(III)V", line = 1195)
	@Override
	public void method6872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt771; local1++) {
			if (arg0 != 0) {
				this.anIntArray70[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray71[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray75[local1] += arg2;
			}
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "fn", descriptor = "(III)V", line = 1195)
	@Override
	public void method6948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt771; local1++) {
			if (arg0 != 0) {
				this.anIntArray70[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray71[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray75[local1] += arg2;
			}
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "fg", descriptor = "(III)V", line = 1195)
	@Override
	public void method6923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt771; local1++) {
			if (arg0 != 0) {
				this.anIntArray70[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray71[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray75[local1] += arg2;
			}
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "i", descriptor = "()V", line = 1205)
	@Override
	public void method6802() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt771; local1++) {
			this.anIntArray75[local1] = -this.anIntArray75[local1];
		}
		for (local1 = 0; local1 < this.anInt772; local1++) {
			this.aShortArray39[local1] = (short) -this.aShortArray39[local1];
		}
		for (local1 = 0; local1 < this.anInt774; local1++) {
			@Pc(45) short local45 = this.aShortArray36[local1];
			this.aShortArray36[local1] = this.aShortArray34[local1];
			this.aShortArray34[local1] = local45;
		}
		this.method6980();
		this.method6983();
		this.method6988();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "cf", descriptor = "()V", line = 1205)
	@Override
	public void method6863() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt771; local1++) {
			this.anIntArray75[local1] = -this.anIntArray75[local1];
		}
		for (local1 = 0; local1 < this.anInt772; local1++) {
			this.aShortArray39[local1] = (short) -this.aShortArray39[local1];
		}
		for (local1 = 0; local1 < this.anInt774; local1++) {
			@Pc(45) short local45 = this.aShortArray36[local1];
			this.aShortArray36[local1] = this.aShortArray34[local1];
			this.aShortArray34[local1] = local45;
		}
		this.method6980();
		this.method6983();
		this.method6988();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "cl", descriptor = "()V", line = 1205)
	@Override
	public void method6899() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt771; local1++) {
			this.anIntArray75[local1] = -this.anIntArray75[local1];
		}
		for (local1 = 0; local1 < this.anInt772; local1++) {
			this.aShortArray39[local1] = (short) -this.aShortArray39[local1];
		}
		for (local1 = 0; local1 < this.anInt774; local1++) {
			@Pc(45) short local45 = this.aShortArray36[local1];
			this.aShortArray36[local1] = this.aShortArray34[local1];
			this.aShortArray34[local1] = local45;
		}
		this.method6980();
		this.method6983();
		this.method6988();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "cp", descriptor = "()V", line = 1205)
	@Override
	public void method6959() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt771; local1++) {
			this.anIntArray75[local1] = -this.anIntArray75[local1];
		}
		for (local1 = 0; local1 < this.anInt772; local1++) {
			this.aShortArray39[local1] = (short) -this.aShortArray39[local1];
		}
		for (local1 = 0; local1 < this.anInt774; local1++) {
			@Pc(45) short local45 = this.aShortArray36[local1];
			this.aShortArray36[local1] = this.aShortArray34[local1];
			this.aShortArray34[local1] = local45;
		}
		this.method6980();
		this.method6983();
		this.method6988();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "cc", descriptor = "()V", line = 1205)
	@Override
	public void method6955() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt771; local1++) {
			this.anIntArray75[local1] = -this.anIntArray75[local1];
		}
		for (local1 = 0; local1 < this.anInt772; local1++) {
			this.aShortArray39[local1] = (short) -this.aShortArray39[local1];
		}
		for (local1 = 0; local1 < this.anInt774; local1++) {
			@Pc(45) short local45 = this.aShortArray36[local1];
			this.aShortArray36[local1] = this.aShortArray34[local1];
			this.aShortArray34[local1] = local45;
		}
		this.method6980();
		this.method6983();
		this.method6988();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "k", descriptor = "(III)V", line = 1219)
	@Override
	public void method6803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt771; local1++) {
			if (arg0 != 128) {
				this.anIntArray70[local1] = this.anIntArray70[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray71[local1] = this.anIntArray71[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray75[local1] = this.anIntArray75[local1] * arg2 >> 7;
			}
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "cw", descriptor = "(III)V", line = 1219)
	@Override
	public void method6805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt771; local1++) {
			if (arg0 != 128) {
				this.anIntArray70[local1] = this.anIntArray70[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray71[local1] = this.anIntArray71[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray75[local1] = this.anIntArray75[local1] * arg2 >> 7;
			}
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "ck", descriptor = "(III)V", line = 1219)
	@Override
	public void method6807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt771; local1++) {
			if (arg0 != 128) {
				this.anIntArray70[local1] = this.anIntArray70[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray71[local1] = this.anIntArray71[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray75[local1] = this.anIntArray75[local1] * arg2 >> 7;
			}
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "u", descriptor = "(IILclient!cj;Lclient!cj;III)V", line = 1229)
	@Override
	public void method6804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean158) {
			this.method6991();
		}
		@Pc(9) int local9 = arg4 + this.anInt782;
		@Pc(14) int local14 = arg4 + this.anInt779;
		@Pc(19) int local19 = arg6 + this.anInt780;
		@Pc(24) int local24 = arg6 + this.anInt783;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + arg2.anInt608 * 127780559 >> arg2.anInt609 * -1495101509 >= arg2.anInt607 * -1924295585 || local19 < 0 || local24 + arg2.anInt608 * 127780559 >> arg2.anInt609 * -1495101509 >= arg2.anInt606 * -1466328823)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local9 < 0 || local14 + arg3.anInt608 * 127780559 >> arg3.anInt609 * -1495101509 >= arg3.anInt607 * -1924295585 || local19 < 0 || local24 + arg3.anInt608 * 127780559 >> arg3.anInt609 * -1495101509 >= arg3.anInt606 * -1466328823) {
				return;
			}
		} else {
			local9 >>= arg2.anInt609 * -1495101509;
			local14 = local14 + (arg2.anInt608 * 127780559 - 1) >> arg2.anInt609 * -1495101509;
			local19 >>= arg2.anInt609 * -1495101509;
			local24 = local24 + (arg2.anInt608 * 127780559 - 1) >> arg2.anInt609 * -1495101509;
			if (arg2.method5500(local9, local19) == arg5 && arg2.method5500(local14, local19) == arg5 && arg2.method5500(local9, local24) == arg5 && arg2.method5500(local14, local24) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt771; local195++) {
				this.anIntArray71[local195] = this.anIntArray71[local195] + arg2.method5496(this.anIntArray70[local195] + arg4, this.anIntArray75[local195] + arg6) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				local195 = this.anInt767;
				if (local195 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt771; local239++) {
					local252 = (this.anIntArray71[local239] << 16) / local195;
					if (local252 < arg1) {
						this.anIntArray71[local239] += (arg2.method5496(this.anIntArray70[local239] + arg4, this.anIntArray75[local239] + arg6) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(323) int local323;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 16;
					local239 = (arg1 >> 8 & 0xFF) * 16;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local323 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt608 * 127780559 >= arg2.anInt607 * -1924295585 << arg2.anInt609 * -1495101509 || arg6 - (local239 >> 1) < 0 || arg6 + (local239 >> 1) + arg2.anInt608 * 127780559 >= arg2.anInt606 * -1466328823 << arg2.anInt609 * -1495101509) {
						return;
					}
					this.method6767(arg2, arg4, arg5, arg6, local195, local239, local252, local323);
				} else if (arg0 == 4) {
					local195 = this.anInt778 - this.anInt767;
					for (local239 = 0; local239 < this.anInt771; local239++) {
						this.anIntArray71[local239] = this.anIntArray71[local239] + (arg3.method5496(this.anIntArray70[local239] + arg4, this.anIntArray75[local239] + arg6) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.anInt778 - this.anInt767;
					for (local239 = 0; local239 < this.anInt771; local239++) {
						local252 = this.anIntArray70[local239] + arg4;
						local323 = this.anIntArray75[local239] + arg6;
						@Pc(468) int local468 = arg2.method5496(local252, local323);
						@Pc(474) int local474 = arg3.method5496(local252, local323);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray71[local239] = ((this.anIntArray71[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "ch", descriptor = "(IILclient!cj;Lclient!cj;III)V", line = 1229)
	@Override
	public void method6867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean158) {
			this.method6991();
		}
		@Pc(9) int local9 = arg4 + this.anInt782;
		@Pc(14) int local14 = arg4 + this.anInt779;
		@Pc(19) int local19 = arg6 + this.anInt780;
		@Pc(24) int local24 = arg6 + this.anInt783;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + arg2.anInt608 * 127780559 >> arg2.anInt609 * -1495101509 >= arg2.anInt607 * -1924295585 || local19 < 0 || local24 + arg2.anInt608 * 127780559 >> arg2.anInt609 * -1495101509 >= arg2.anInt606 * -1466328823)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local9 < 0 || local14 + arg3.anInt608 * 127780559 >> arg3.anInt609 * -1495101509 >= arg3.anInt607 * -1924295585 || local19 < 0 || local24 + arg3.anInt608 * 127780559 >> arg3.anInt609 * -1495101509 >= arg3.anInt606 * -1466328823) {
				return;
			}
		} else {
			local9 >>= arg2.anInt609 * -1495101509;
			local14 = local14 + (arg2.anInt608 * 127780559 - 1) >> arg2.anInt609 * -1495101509;
			local19 >>= arg2.anInt609 * -1495101509;
			local24 = local24 + (arg2.anInt608 * 127780559 - 1) >> arg2.anInt609 * -1495101509;
			if (arg2.method5500(local9, local19) == arg5 && arg2.method5500(local14, local19) == arg5 && arg2.method5500(local9, local24) == arg5 && arg2.method5500(local14, local24) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt771; local195++) {
				this.anIntArray71[local195] = this.anIntArray71[local195] + arg2.method5496(this.anIntArray70[local195] + arg4, this.anIntArray75[local195] + arg6) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				local195 = this.anInt767;
				if (local195 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt771; local239++) {
					local252 = (this.anIntArray71[local239] << 16) / local195;
					if (local252 < arg1) {
						this.anIntArray71[local239] += (arg2.method5496(this.anIntArray70[local239] + arg4, this.anIntArray75[local239] + arg6) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(323) int local323;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 16;
					local239 = (arg1 >> 8 & 0xFF) * 16;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local323 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt608 * 127780559 >= arg2.anInt607 * -1924295585 << arg2.anInt609 * -1495101509 || arg6 - (local239 >> 1) < 0 || arg6 + (local239 >> 1) + arg2.anInt608 * 127780559 >= arg2.anInt606 * -1466328823 << arg2.anInt609 * -1495101509) {
						return;
					}
					this.method6767(arg2, arg4, arg5, arg6, local195, local239, local252, local323);
				} else if (arg0 == 4) {
					local195 = this.anInt778 - this.anInt767;
					for (local239 = 0; local239 < this.anInt771; local239++) {
						this.anIntArray71[local239] = this.anIntArray71[local239] + (arg3.method5496(this.anIntArray70[local239] + arg4, this.anIntArray75[local239] + arg6) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.anInt778 - this.anInt767;
					for (local239 = 0; local239 < this.anInt771; local239++) {
						local252 = this.anIntArray70[local239] + arg4;
						local323 = this.anIntArray75[local239] + arg6;
						@Pc(468) int local468 = arg2.method5496(local252, local323);
						@Pc(474) int local474 = arg3.method5496(local252, local323);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray71[local239] = ((this.anIntArray71[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "cz", descriptor = "(IILclient!cj;Lclient!cj;III)V", line = 1229)
	@Override
	public void method6904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean158) {
			this.method6991();
		}
		@Pc(9) int local9 = arg4 + this.anInt782;
		@Pc(14) int local14 = arg4 + this.anInt779;
		@Pc(19) int local19 = arg6 + this.anInt780;
		@Pc(24) int local24 = arg6 + this.anInt783;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + arg2.anInt608 * 127780559 >> arg2.anInt609 * -1495101509 >= arg2.anInt607 * -1924295585 || local19 < 0 || local24 + arg2.anInt608 * 127780559 >> arg2.anInt609 * -1495101509 >= arg2.anInt606 * -1466328823)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local9 < 0 || local14 + arg3.anInt608 * 127780559 >> arg3.anInt609 * -1495101509 >= arg3.anInt607 * -1924295585 || local19 < 0 || local24 + arg3.anInt608 * 127780559 >> arg3.anInt609 * -1495101509 >= arg3.anInt606 * -1466328823) {
				return;
			}
		} else {
			local9 >>= arg2.anInt609 * -1495101509;
			local14 = local14 + (arg2.anInt608 * 127780559 - 1) >> arg2.anInt609 * -1495101509;
			local19 >>= arg2.anInt609 * -1495101509;
			local24 = local24 + (arg2.anInt608 * 127780559 - 1) >> arg2.anInt609 * -1495101509;
			if (arg2.method5500(local9, local19) == arg5 && arg2.method5500(local14, local19) == arg5 && arg2.method5500(local9, local24) == arg5 && arg2.method5500(local14, local24) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt771; local195++) {
				this.anIntArray71[local195] = this.anIntArray71[local195] + arg2.method5496(this.anIntArray70[local195] + arg4, this.anIntArray75[local195] + arg6) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				local195 = this.anInt767;
				if (local195 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt771; local239++) {
					local252 = (this.anIntArray71[local239] << 16) / local195;
					if (local252 < arg1) {
						this.anIntArray71[local239] += (arg2.method5496(this.anIntArray70[local239] + arg4, this.anIntArray75[local239] + arg6) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(323) int local323;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 16;
					local239 = (arg1 >> 8 & 0xFF) * 16;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local323 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt608 * 127780559 >= arg2.anInt607 * -1924295585 << arg2.anInt609 * -1495101509 || arg6 - (local239 >> 1) < 0 || arg6 + (local239 >> 1) + arg2.anInt608 * 127780559 >= arg2.anInt606 * -1466328823 << arg2.anInt609 * -1495101509) {
						return;
					}
					this.method6767(arg2, arg4, arg5, arg6, local195, local239, local252, local323);
				} else if (arg0 == 4) {
					local195 = this.anInt778 - this.anInt767;
					for (local239 = 0; local239 < this.anInt771; local239++) {
						this.anIntArray71[local239] = this.anIntArray71[local239] + (arg3.method5496(this.anIntArray70[local239] + arg4, this.anIntArray75[local239] + arg6) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.anInt778 - this.anInt767;
					for (local239 = 0; local239 < this.anInt771; local239++) {
						local252 = this.anIntArray70[local239] + arg4;
						local323 = this.anIntArray75[local239] + arg6;
						@Pc(468) int local468 = arg2.method5496(local252, local323);
						@Pc(474) int local474 = arg3.method5496(local252, local323);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray71[local239] = ((this.anIntArray71[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "ca", descriptor = "(IILclient!cj;Lclient!cj;III)V", line = 1229)
	@Override
	public void method6868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean158) {
			this.method6991();
		}
		@Pc(9) int local9 = arg4 + this.anInt782;
		@Pc(14) int local14 = arg4 + this.anInt779;
		@Pc(19) int local19 = arg6 + this.anInt780;
		@Pc(24) int local24 = arg6 + this.anInt783;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + arg2.anInt608 * 127780559 >> arg2.anInt609 * -1495101509 >= arg2.anInt607 * -1924295585 || local19 < 0 || local24 + arg2.anInt608 * 127780559 >> arg2.anInt609 * -1495101509 >= arg2.anInt606 * -1466328823)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local9 < 0 || local14 + arg3.anInt608 * 127780559 >> arg3.anInt609 * -1495101509 >= arg3.anInt607 * -1924295585 || local19 < 0 || local24 + arg3.anInt608 * 127780559 >> arg3.anInt609 * -1495101509 >= arg3.anInt606 * -1466328823) {
				return;
			}
		} else {
			local9 >>= arg2.anInt609 * -1495101509;
			local14 = local14 + (arg2.anInt608 * 127780559 - 1) >> arg2.anInt609 * -1495101509;
			local19 >>= arg2.anInt609 * -1495101509;
			local24 = local24 + (arg2.anInt608 * 127780559 - 1) >> arg2.anInt609 * -1495101509;
			if (arg2.method5500(local9, local19) == arg5 && arg2.method5500(local14, local19) == arg5 && arg2.method5500(local9, local24) == arg5 && arg2.method5500(local14, local24) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt771; local195++) {
				this.anIntArray71[local195] = this.anIntArray71[local195] + arg2.method5496(this.anIntArray70[local195] + arg4, this.anIntArray75[local195] + arg6) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				local195 = this.anInt767;
				if (local195 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt771; local239++) {
					local252 = (this.anIntArray71[local239] << 16) / local195;
					if (local252 < arg1) {
						this.anIntArray71[local239] += (arg2.method5496(this.anIntArray70[local239] + arg4, this.anIntArray75[local239] + arg6) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(323) int local323;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 16;
					local239 = (arg1 >> 8 & 0xFF) * 16;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local323 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt608 * 127780559 >= arg2.anInt607 * -1924295585 << arg2.anInt609 * -1495101509 || arg6 - (local239 >> 1) < 0 || arg6 + (local239 >> 1) + arg2.anInt608 * 127780559 >= arg2.anInt606 * -1466328823 << arg2.anInt609 * -1495101509) {
						return;
					}
					this.method6767(arg2, arg4, arg5, arg6, local195, local239, local252, local323);
				} else if (arg0 == 4) {
					local195 = this.anInt778 - this.anInt767;
					for (local239 = 0; local239 < this.anInt771; local239++) {
						this.anIntArray71[local239] = this.anIntArray71[local239] + (arg3.method5496(this.anIntArray70[local239] + arg4, this.anIntArray75[local239] + arg6) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.anInt778 - this.anInt767;
					for (local239 = 0; local239 < this.anInt771; local239++) {
						local252 = this.anIntArray70[local239] + arg4;
						local323 = this.anIntArray75[local239] + arg6;
						@Pc(468) int local468 = arg2.method5496(local252, local323);
						@Pc(474) int local474 = arg3.method5496(local252, local323);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray71[local239] = ((this.anIntArray71[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "ho", descriptor = "()V", line = 1293)
	void method6991() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt771; local17++) {
			@Pc(26) int local26 = this.anIntArray70[local17];
			@Pc(31) int local31 = this.anIntArray71[local17];
			@Pc(36) int local36 = this.anIntArray75[local17];
			if (local26 < local1) {
				local1 = local26;
			}
			if (local26 > local7) {
				local7 = local26;
			}
			if (local31 < local3) {
				local3 = local31;
			}
			if (local31 > local9) {
				local9 = local31;
			}
			if (local36 < local5) {
				local5 = local36;
			}
			if (local36 > local11) {
				local11 = local36;
			}
			@Pc(74) int local74 = local26 * local26 + local36 * local36;
			if (local74 > local13) {
				local13 = local74;
			}
			local74 = local26 * local26 + local36 * local36 + local31 * local31;
			if (local74 > local15) {
				local15 = local74;
			}
		}
		this.anInt782 = local1;
		this.anInt779 = local7;
		this.anInt767 = local3;
		this.anInt778 = local9;
		this.anInt780 = local5;
		this.anInt783 = local11;
		this.anInt784 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt776 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean158 = true;
	}

	@OriginalMember(owner = "client!aey", name = "jv", descriptor = "()V", line = 1293)
	void method6992() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt771; local17++) {
			@Pc(26) int local26 = this.anIntArray70[local17];
			@Pc(31) int local31 = this.anIntArray71[local17];
			@Pc(36) int local36 = this.anIntArray75[local17];
			if (local26 < local1) {
				local1 = local26;
			}
			if (local26 > local7) {
				local7 = local26;
			}
			if (local31 < local3) {
				local3 = local31;
			}
			if (local31 > local9) {
				local9 = local31;
			}
			if (local36 < local5) {
				local5 = local36;
			}
			if (local36 > local11) {
				local11 = local36;
			}
			@Pc(74) int local74 = local26 * local26 + local36 * local36;
			if (local74 > local13) {
				local13 = local74;
			}
			local74 = local26 * local26 + local36 * local36 + local31 * local31;
			if (local74 > local15) {
				local15 = local74;
			}
		}
		this.anInt782 = local1;
		this.anInt779 = local7;
		this.anInt767 = local3;
		this.anInt778 = local9;
		this.anInt780 = local5;
		this.anInt783 = local11;
		this.anInt784 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt776 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean158 = true;
	}

	@OriginalMember(owner = "client!aey", name = "af", descriptor = "()V", line = 1328)
	@Override
	public void method6829() {
		if (this.aBoolean159) {
			return;
		}
		if (!this.aBoolean158) {
			this.method6991();
		}
		this.anInt777 = this.anInt767;
		this.aBoolean159 = true;
	}

	@OriginalMember(owner = "client!aey", name = "di", descriptor = "()V", line = 1328)
	@Override
	public void method6891() {
		if (this.aBoolean159) {
			return;
		}
		if (!this.aBoolean158) {
			this.method6991();
		}
		this.anInt777 = this.anInt767;
		this.aBoolean159 = true;
	}

	@OriginalMember(owner = "client!aey", name = "ac", descriptor = "()I", line = 1336)
	@Override
	public int method6820() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt784;
	}

	@OriginalMember(owner = "client!aey", name = "dr", descriptor = "()I", line = 1336)
	@Override
	public int method6862() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt784;
	}

	@OriginalMember(owner = "client!aey", name = "dp", descriptor = "()I", line = 1336)
	@Override
	public int method6856() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt784;
	}

	@OriginalMember(owner = "client!aey", name = "du", descriptor = "()I", line = 1336)
	@Override
	public int method6895() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt784;
	}

	@OriginalMember(owner = "client!aey", name = "dk", descriptor = "()I", line = 1336)
	@Override
	public int method6896() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt784;
	}

	@OriginalMember(owner = "client!aey", name = "ds", descriptor = "()I", line = 1336)
	@Override
	public int method6897() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt784;
	}

	@OriginalMember(owner = "client!aey", name = "df", descriptor = "()I", line = 1336)
	@Override
	public int method6898() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt784;
	}

	@OriginalMember(owner = "client!aey", name = "de", descriptor = "()I", line = 1336)
	@Override
	public int method6894() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt784;
	}

	@OriginalMember(owner = "client!aey", name = "av", descriptor = "()I", line = 1341)
	@Override
	public int method6821() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt776;
	}

	@OriginalMember(owner = "client!aey", name = "dc", descriptor = "()I", line = 1341)
	@Override
	public int method6901() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt776;
	}

	@OriginalMember(owner = "client!aey", name = "db", descriptor = "()I", line = 1341)
	@Override
	public int method6793() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt776;
	}

	@OriginalMember(owner = "client!aey", name = "dx", descriptor = "()I", line = 1341)
	@Override
	public int method6827() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt776;
	}

	@OriginalMember(owner = "client!aey", name = "dl", descriptor = "()I", line = 1341)
	@Override
	public int method6902() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt776;
	}

	@OriginalMember(owner = "client!aey", name = "at", descriptor = "()I", line = 1346)
	@Override
	public int method6906() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt782;
	}

	@OriginalMember(owner = "client!aey", name = "fa", descriptor = "()I", line = 1346)
	@Override
	public int method6864() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt782;
	}

	@OriginalMember(owner = "client!aey", name = "ae", descriptor = "()I", line = 1351)
	@Override
	public int method6822() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt779;
	}

	@OriginalMember(owner = "client!aey", name = "dd", descriptor = "()I", line = 1351)
	@Override
	public int method6808() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt779;
	}

	@OriginalMember(owner = "client!aey", name = "dj", descriptor = "()I", line = 1351)
	@Override
	public int method6900() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt779;
	}

	@OriginalMember(owner = "client!aey", name = "dg", descriptor = "()I", line = 1351)
	@Override
	public int method6903() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt779;
	}

	@OriginalMember(owner = "client!aey", name = "eh", descriptor = "()I", line = 1356)
	@Override
	public int method6926() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt767;
	}

	@OriginalMember(owner = "client!aey", name = "ej", descriptor = "()I", line = 1356)
	@Override
	public int method6842() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt767;
	}

	@OriginalMember(owner = "client!aey", name = "ah", descriptor = "()I", line = 1356)
	@Override
	public int method6824() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt767;
	}

	@OriginalMember(owner = "client!aey", name = "as", descriptor = "()I", line = 1361)
	@Override
	public int method6825() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt778;
	}

	@OriginalMember(owner = "client!aey", name = "eq", descriptor = "()I", line = 1361)
	@Override
	public int method6831() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt778;
	}

	@OriginalMember(owner = "client!aey", name = "eo", descriptor = "()I", line = 1361)
	@Override
	public int method6907() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt778;
	}

	@OriginalMember(owner = "client!aey", name = "ep", descriptor = "()I", line = 1361)
	@Override
	public int method6913() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt778;
	}

	@OriginalMember(owner = "client!aey", name = "es", descriptor = "()I", line = 1361)
	@Override
	public int method6910() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt778;
	}

	@OriginalMember(owner = "client!aey", name = "aq", descriptor = "()I", line = 1366)
	@Override
	public int method6826() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt780;
	}

	@OriginalMember(owner = "client!aey", name = "ed", descriptor = "()I", line = 1366)
	@Override
	public int method6960() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt780;
	}

	@OriginalMember(owner = "client!aey", name = "ei", descriptor = "()I", line = 1366)
	@Override
	public int method6911() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt780;
	}

	@OriginalMember(owner = "client!aey", name = "am", descriptor = "()I", line = 1371)
	@Override
	public int method6817() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt783;
	}

	@OriginalMember(owner = "client!aey", name = "ee", descriptor = "()I", line = 1371)
	@Override
	public int method6909() {
		if (!this.aBoolean158) {
			this.method6991();
		}
		return this.anInt783;
	}

	@OriginalMember(owner = "client!aey", name = "ay", descriptor = "()I", line = 1376)
	@Override
	public int method6828() {
		if (!this.aBoolean159) {
			this.method6829();
		}
		return this.anInt777;
	}

	@OriginalMember(owner = "client!aey", name = "en", descriptor = "()I", line = 1376)
	@Override
	public int method6914() {
		if (!this.aBoolean159) {
			this.method6829();
		}
		return this.anInt777;
	}

	@OriginalMember(owner = "client!aey", name = "ex", descriptor = "()I", line = 1376)
	@Override
	public int method6915() {
		if (!this.aBoolean159) {
			this.method6829();
		}
		return this.anInt777;
	}

	@OriginalMember(owner = "client!aey", name = "bw", descriptor = "(Lclient!dv;IIIZ)V", line = 1381)
	@Override
	public void method6855(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class84_Sub3 local2 = (Class84_Sub3) arg0;
		if (this.anInt774 == 0 || local2.anInt774 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt771;
		@Pc(15) int[] local15 = local2.anIntArray70;
		@Pc(18) int[] local18 = local2.anIntArray71;
		@Pc(21) int[] local21 = local2.anIntArray75;
		@Pc(24) short[] local24 = local2.aShortArray30;
		@Pc(27) short[] local27 = local2.aShortArray38;
		@Pc(30) short[] local30 = local2.aShortArray39;
		@Pc(33) byte[] local33 = local2.aByteArray17;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass376_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass376_1.aShortArray128;
			local44 = this.aClass376_1.aShortArray127;
			local48 = this.aClass376_1.aShortArray129;
			local52 = this.aClass376_1.aByteArray84;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass376_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass376_1.aShortArray128;
			local72 = local2.aClass376_1.aShortArray127;
			local76 = local2.aClass376_1.aShortArray129;
			local80 = local2.aClass376_1.aByteArray84;
		}
		@Pc(92) int[] local92 = local2.anIntArray77;
		@Pc(95) short[] local95 = local2.aShortArray37;
		if (!local2.aBoolean158) {
			local2.method6991();
		}
		@Pc(103) int local103 = local2.anInt767;
		@Pc(106) int local106 = local2.anInt778;
		@Pc(109) int local109 = local2.anInt782;
		@Pc(112) int local112 = local2.anInt779;
		@Pc(115) int local115 = local2.anInt780;
		@Pc(118) int local118 = local2.anInt783;
		for (@Pc(120) int local120 = 0; local120 < this.anInt771; local120++) {
			@Pc(131) int local131 = this.anIntArray71[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray70[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray75[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray77[local120];
						@Pc(180) int local180 = this.anIntArray77[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray37[local182] != 0; local182++) {
							local168 = (this.aShortArray37[local182] & 0xFFFF) - 1;
							if (this.aByteArray17[local168] != 0) {
								break;
							}
						}
						if (local168 != -1) {
							for (local182 = 0; local182 < local12; local182++) {
								if (local145 == local15[local182] && local159 == local21[local182] && local131 == local18[local182]) {
									@Pc(234) int local234 = -1;
									local173 = local92[local182];
									local180 = local92[local182 + 1];
									for (@Pc(246) int local246 = local173; local246 < local180 && local95[local246] != 0; local246++) {
										local234 = local95[local246] - 1 & 0xFFFF;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass376_1 = new Class376();
											local40 = this.aClass376_1.aShortArray128 = Class77_Sub42.method22709(this.aShortArray30);
											local44 = this.aClass376_1.aShortArray127 = Class77_Sub42.method22709(this.aShortArray38);
											local48 = this.aClass376_1.aShortArray129 = Class77_Sub42.method22709(this.aShortArray39);
											local52 = this.aClass376_1.aByteArray84 = Class137.method14101(this.aByteArray17);
										}
										if (local68 == null) {
											@Pc(325) Class376 local325 = local2.aClass376_1 = new Class376();
											local68 = local325.aShortArray128 = Class77_Sub42.method22709(local24);
											local72 = local325.aShortArray127 = Class77_Sub42.method22709(local27);
											local76 = local325.aShortArray129 = Class77_Sub42.method22709(local30);
											local80 = local325.aByteArray84 = Class137.method14101(local33);
										}
										@Pc(358) short local358 = this.aShortArray30[local168];
										@Pc(363) short local363 = this.aShortArray38[local168];
										@Pc(368) short local368 = this.aShortArray39[local168];
										@Pc(373) byte local373 = this.aByteArray17[local168];
										local173 = local92[local182];
										local180 = local92[local182 + 1];
										@Pc(385) int local385;
										@Pc(394) int local394;
										for (local385 = local173; local385 < local180; local385++) {
											local394 = local95[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local80[local394] != 0) {
												local68[local394] += local358;
												local72[local394] += local363;
												local76[local394] += local368;
												local80[local394] += local373;
											}
										}
										local358 = local24[local234];
										local363 = local27[local234];
										local368 = local30[local234];
										local373 = local33[local234];
										local173 = this.anIntArray77[local120];
										local180 = this.anIntArray77[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray37[local385] != 0; local385++) {
											local394 = (this.aShortArray37[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										local2.method6983();
										this.method6983();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "bg", descriptor = "(Lclient!dv;IIIZ)V", line = 1381)
	@Override
	public void method6841(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class84_Sub3 local2 = (Class84_Sub3) arg0;
		if (this.anInt774 == 0 || local2.anInt774 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt771;
		@Pc(15) int[] local15 = local2.anIntArray70;
		@Pc(18) int[] local18 = local2.anIntArray71;
		@Pc(21) int[] local21 = local2.anIntArray75;
		@Pc(24) short[] local24 = local2.aShortArray30;
		@Pc(27) short[] local27 = local2.aShortArray38;
		@Pc(30) short[] local30 = local2.aShortArray39;
		@Pc(33) byte[] local33 = local2.aByteArray17;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass376_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass376_1.aShortArray128;
			local44 = this.aClass376_1.aShortArray127;
			local48 = this.aClass376_1.aShortArray129;
			local52 = this.aClass376_1.aByteArray84;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass376_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass376_1.aShortArray128;
			local72 = local2.aClass376_1.aShortArray127;
			local76 = local2.aClass376_1.aShortArray129;
			local80 = local2.aClass376_1.aByteArray84;
		}
		@Pc(92) int[] local92 = local2.anIntArray77;
		@Pc(95) short[] local95 = local2.aShortArray37;
		if (!local2.aBoolean158) {
			local2.method6991();
		}
		@Pc(103) int local103 = local2.anInt767;
		@Pc(106) int local106 = local2.anInt778;
		@Pc(109) int local109 = local2.anInt782;
		@Pc(112) int local112 = local2.anInt779;
		@Pc(115) int local115 = local2.anInt780;
		@Pc(118) int local118 = local2.anInt783;
		for (@Pc(120) int local120 = 0; local120 < this.anInt771; local120++) {
			@Pc(131) int local131 = this.anIntArray71[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray70[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray75[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray77[local120];
						@Pc(180) int local180 = this.anIntArray77[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray37[local182] != 0; local182++) {
							local168 = (this.aShortArray37[local182] & 0xFFFF) - 1;
							if (this.aByteArray17[local168] != 0) {
								break;
							}
						}
						if (local168 != -1) {
							for (local182 = 0; local182 < local12; local182++) {
								if (local145 == local15[local182] && local159 == local21[local182] && local131 == local18[local182]) {
									@Pc(234) int local234 = -1;
									local173 = local92[local182];
									local180 = local92[local182 + 1];
									for (@Pc(246) int local246 = local173; local246 < local180 && local95[local246] != 0; local246++) {
										local234 = local95[local246] - 1 & 0xFFFF;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass376_1 = new Class376();
											local40 = this.aClass376_1.aShortArray128 = Class77_Sub42.method22709(this.aShortArray30);
											local44 = this.aClass376_1.aShortArray127 = Class77_Sub42.method22709(this.aShortArray38);
											local48 = this.aClass376_1.aShortArray129 = Class77_Sub42.method22709(this.aShortArray39);
											local52 = this.aClass376_1.aByteArray84 = Class137.method14101(this.aByteArray17);
										}
										if (local68 == null) {
											@Pc(325) Class376 local325 = local2.aClass376_1 = new Class376();
											local68 = local325.aShortArray128 = Class77_Sub42.method22709(local24);
											local72 = local325.aShortArray127 = Class77_Sub42.method22709(local27);
											local76 = local325.aShortArray129 = Class77_Sub42.method22709(local30);
											local80 = local325.aByteArray84 = Class137.method14101(local33);
										}
										@Pc(358) short local358 = this.aShortArray30[local168];
										@Pc(363) short local363 = this.aShortArray38[local168];
										@Pc(368) short local368 = this.aShortArray39[local168];
										@Pc(373) byte local373 = this.aByteArray17[local168];
										local173 = local92[local182];
										local180 = local92[local182 + 1];
										@Pc(385) int local385;
										@Pc(394) int local394;
										for (local385 = local173; local385 < local180; local385++) {
											local394 = local95[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local80[local394] != 0) {
												local68[local394] += local358;
												local72[local394] += local363;
												local76[local394] += local368;
												local80[local394] += local373;
											}
										}
										local358 = local24[local234];
										local363 = local27[local234];
										local368 = local30[local234];
										local373 = local33[local234];
										local173 = this.anIntArray77[local120];
										local180 = this.anIntArray77[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray37[local385] != 0; local385++) {
											local394 = (this.aShortArray37[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										local2.method6983();
										this.method6983();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "bs", descriptor = "(Lclient!dv;IIIZ)V", line = 1381)
	@Override
	public void method6847(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class84_Sub3 local2 = (Class84_Sub3) arg0;
		if (this.anInt774 == 0 || local2.anInt774 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt771;
		@Pc(15) int[] local15 = local2.anIntArray70;
		@Pc(18) int[] local18 = local2.anIntArray71;
		@Pc(21) int[] local21 = local2.anIntArray75;
		@Pc(24) short[] local24 = local2.aShortArray30;
		@Pc(27) short[] local27 = local2.aShortArray38;
		@Pc(30) short[] local30 = local2.aShortArray39;
		@Pc(33) byte[] local33 = local2.aByteArray17;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass376_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass376_1.aShortArray128;
			local44 = this.aClass376_1.aShortArray127;
			local48 = this.aClass376_1.aShortArray129;
			local52 = this.aClass376_1.aByteArray84;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass376_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass376_1.aShortArray128;
			local72 = local2.aClass376_1.aShortArray127;
			local76 = local2.aClass376_1.aShortArray129;
			local80 = local2.aClass376_1.aByteArray84;
		}
		@Pc(92) int[] local92 = local2.anIntArray77;
		@Pc(95) short[] local95 = local2.aShortArray37;
		if (!local2.aBoolean158) {
			local2.method6991();
		}
		@Pc(103) int local103 = local2.anInt767;
		@Pc(106) int local106 = local2.anInt778;
		@Pc(109) int local109 = local2.anInt782;
		@Pc(112) int local112 = local2.anInt779;
		@Pc(115) int local115 = local2.anInt780;
		@Pc(118) int local118 = local2.anInt783;
		for (@Pc(120) int local120 = 0; local120 < this.anInt771; local120++) {
			@Pc(131) int local131 = this.anIntArray71[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray70[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray75[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray77[local120];
						@Pc(180) int local180 = this.anIntArray77[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray37[local182] != 0; local182++) {
							local168 = (this.aShortArray37[local182] & 0xFFFF) - 1;
							if (this.aByteArray17[local168] != 0) {
								break;
							}
						}
						if (local168 != -1) {
							for (local182 = 0; local182 < local12; local182++) {
								if (local145 == local15[local182] && local159 == local21[local182] && local131 == local18[local182]) {
									@Pc(234) int local234 = -1;
									local173 = local92[local182];
									local180 = local92[local182 + 1];
									for (@Pc(246) int local246 = local173; local246 < local180 && local95[local246] != 0; local246++) {
										local234 = local95[local246] - 1 & 0xFFFF;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass376_1 = new Class376();
											local40 = this.aClass376_1.aShortArray128 = Class77_Sub42.method22709(this.aShortArray30);
											local44 = this.aClass376_1.aShortArray127 = Class77_Sub42.method22709(this.aShortArray38);
											local48 = this.aClass376_1.aShortArray129 = Class77_Sub42.method22709(this.aShortArray39);
											local52 = this.aClass376_1.aByteArray84 = Class137.method14101(this.aByteArray17);
										}
										if (local68 == null) {
											@Pc(325) Class376 local325 = local2.aClass376_1 = new Class376();
											local68 = local325.aShortArray128 = Class77_Sub42.method22709(local24);
											local72 = local325.aShortArray127 = Class77_Sub42.method22709(local27);
											local76 = local325.aShortArray129 = Class77_Sub42.method22709(local30);
											local80 = local325.aByteArray84 = Class137.method14101(local33);
										}
										@Pc(358) short local358 = this.aShortArray30[local168];
										@Pc(363) short local363 = this.aShortArray38[local168];
										@Pc(368) short local368 = this.aShortArray39[local168];
										@Pc(373) byte local373 = this.aByteArray17[local168];
										local173 = local92[local182];
										local180 = local92[local182 + 1];
										@Pc(385) int local385;
										@Pc(394) int local394;
										for (local385 = local173; local385 < local180; local385++) {
											local394 = local95[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local80[local394] != 0) {
												local68[local394] += local358;
												local72[local394] += local363;
												local76[local394] += local368;
												local80[local394] += local373;
											}
										}
										local358 = local24[local234];
										local363 = local27[local234];
										local368 = local30[local234];
										local373 = local33[local234];
										local173 = this.anIntArray77[local120];
										local180 = this.anIntArray77[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray37[local385] != 0; local385++) {
											local394 = (this.aShortArray37[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										local2.method6983();
										this.method6983();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "bi", descriptor = "(Lclient!dv;IIIZ)V", line = 1381)
	@Override
	public void method6845(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class84_Sub3 local2 = (Class84_Sub3) arg0;
		if (this.anInt774 == 0 || local2.anInt774 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt771;
		@Pc(15) int[] local15 = local2.anIntArray70;
		@Pc(18) int[] local18 = local2.anIntArray71;
		@Pc(21) int[] local21 = local2.anIntArray75;
		@Pc(24) short[] local24 = local2.aShortArray30;
		@Pc(27) short[] local27 = local2.aShortArray38;
		@Pc(30) short[] local30 = local2.aShortArray39;
		@Pc(33) byte[] local33 = local2.aByteArray17;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass376_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass376_1.aShortArray128;
			local44 = this.aClass376_1.aShortArray127;
			local48 = this.aClass376_1.aShortArray129;
			local52 = this.aClass376_1.aByteArray84;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass376_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass376_1.aShortArray128;
			local72 = local2.aClass376_1.aShortArray127;
			local76 = local2.aClass376_1.aShortArray129;
			local80 = local2.aClass376_1.aByteArray84;
		}
		@Pc(92) int[] local92 = local2.anIntArray77;
		@Pc(95) short[] local95 = local2.aShortArray37;
		if (!local2.aBoolean158) {
			local2.method6991();
		}
		@Pc(103) int local103 = local2.anInt767;
		@Pc(106) int local106 = local2.anInt778;
		@Pc(109) int local109 = local2.anInt782;
		@Pc(112) int local112 = local2.anInt779;
		@Pc(115) int local115 = local2.anInt780;
		@Pc(118) int local118 = local2.anInt783;
		for (@Pc(120) int local120 = 0; local120 < this.anInt771; local120++) {
			@Pc(131) int local131 = this.anIntArray71[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray70[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray75[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray77[local120];
						@Pc(180) int local180 = this.anIntArray77[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray37[local182] != 0; local182++) {
							local168 = (this.aShortArray37[local182] & 0xFFFF) - 1;
							if (this.aByteArray17[local168] != 0) {
								break;
							}
						}
						if (local168 != -1) {
							for (local182 = 0; local182 < local12; local182++) {
								if (local145 == local15[local182] && local159 == local21[local182] && local131 == local18[local182]) {
									@Pc(234) int local234 = -1;
									local173 = local92[local182];
									local180 = local92[local182 + 1];
									for (@Pc(246) int local246 = local173; local246 < local180 && local95[local246] != 0; local246++) {
										local234 = local95[local246] - 1 & 0xFFFF;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass376_1 = new Class376();
											local40 = this.aClass376_1.aShortArray128 = Class77_Sub42.method22709(this.aShortArray30);
											local44 = this.aClass376_1.aShortArray127 = Class77_Sub42.method22709(this.aShortArray38);
											local48 = this.aClass376_1.aShortArray129 = Class77_Sub42.method22709(this.aShortArray39);
											local52 = this.aClass376_1.aByteArray84 = Class137.method14101(this.aByteArray17);
										}
										if (local68 == null) {
											@Pc(325) Class376 local325 = local2.aClass376_1 = new Class376();
											local68 = local325.aShortArray128 = Class77_Sub42.method22709(local24);
											local72 = local325.aShortArray127 = Class77_Sub42.method22709(local27);
											local76 = local325.aShortArray129 = Class77_Sub42.method22709(local30);
											local80 = local325.aByteArray84 = Class137.method14101(local33);
										}
										@Pc(358) short local358 = this.aShortArray30[local168];
										@Pc(363) short local363 = this.aShortArray38[local168];
										@Pc(368) short local368 = this.aShortArray39[local168];
										@Pc(373) byte local373 = this.aByteArray17[local168];
										local173 = local92[local182];
										local180 = local92[local182 + 1];
										@Pc(385) int local385;
										@Pc(394) int local394;
										for (local385 = local173; local385 < local180; local385++) {
											local394 = local95[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local80[local394] != 0) {
												local68[local394] += local358;
												local72[local394] += local363;
												local76[local394] += local368;
												local80[local394] += local373;
											}
										}
										local358 = local24[local234];
										local363 = local27[local234];
										local368 = local30[local234];
										local373 = local33[local234];
										local173 = this.anIntArray77[local120];
										local180 = this.anIntArray77[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray37[local385] != 0; local385++) {
											local394 = (this.aShortArray37[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										local2.method6983();
										this.method6983();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "er", descriptor = "(I)V", line = 1513)
	@Override
	public void method6917(@OriginalArg(0) int arg0) {
		this.aShort22 = (short) arg0;
		this.method6982();
	}

	@OriginalMember(owner = "client!aey", name = "an", descriptor = "(I)V", line = 1513)
	@Override
	public void method6830(@OriginalArg(0) int arg0) {
		this.aShort22 = (short) arg0;
		this.method6982();
	}

	@OriginalMember(owner = "client!aey", name = "ef", descriptor = "(I)V", line = 1513)
	@Override
	public void method6916(@OriginalArg(0) int arg0) {
		this.aShort22 = (short) arg0;
		this.method6982();
	}

	@OriginalMember(owner = "client!aey", name = "ab", descriptor = "(I)V", line = 1518)
	@Override
	public void method6892(@OriginalArg(0) int arg0) {
		this.aShort23 = (short) arg0;
		this.method6980();
		this.method6983();
	}

	@OriginalMember(owner = "client!aey", name = "ew", descriptor = "(I)V", line = 1518)
	@Override
	public void method6919(@OriginalArg(0) int arg0) {
		this.aShort23 = (short) arg0;
		this.method6980();
		this.method6983();
	}

	@OriginalMember(owner = "client!aey", name = "em", descriptor = "(I)V", line = 1518)
	@Override
	public void method6918(@OriginalArg(0) int arg0) {
		this.aShort23 = (short) arg0;
		this.method6980();
		this.method6983();
	}

	@OriginalMember(owner = "client!aey", name = "et", descriptor = "(I)V", line = 1518)
	@Override
	public void method6877(@OriginalArg(0) int arg0) {
		this.aShort23 = (short) arg0;
		this.method6980();
		this.method6983();
	}

	@OriginalMember(owner = "client!aey", name = "aa", descriptor = "()I", line = 1524)
	@Override
	public int method6832() {
		return this.aShort22;
	}

	@OriginalMember(owner = "client!aey", name = "eu", descriptor = "()I", line = 1524)
	@Override
	public int method6946() {
		return this.aShort22;
	}

	@OriginalMember(owner = "client!aey", name = "ap", descriptor = "()I", line = 1528)
	@Override
	public int method6833() {
		return this.aShort23;
	}

	@OriginalMember(owner = "client!aey", name = "ea", descriptor = "()I", line = 1528)
	@Override
	public int method6921() {
		return this.aShort23;
	}

	@OriginalMember(owner = "client!aey", name = "aw", descriptor = "()[B", line = 1532)
	@Override
	public byte[] method6834() {
		return this.aByteArray18;
	}

	@OriginalMember(owner = "client!aey", name = "ec", descriptor = "()[B", line = 1532)
	@Override
	public byte[] method6922() {
		return this.aByteArray18;
	}

	@OriginalMember(owner = "client!aey", name = "eg", descriptor = "(SS)V", line = 1536)
	@Override
	public void method6924(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt774; local1++) {
			if (this.aShortArray31[local1] == arg0) {
				this.aShortArray31[local1] = arg1;
			}
		}
		if (this.aClass378Array1 != null) {
			for (local1 = 0; local1 < this.anInt781; local1++) {
				@Pc(32) Class378 local32 = this.aClass378Array1[local1];
				@Pc(37) Class360 local37 = this.aClass360Array1[local1];
				local37.anInt4510 = local37.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local32.anInt4579] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6982();
	}

	@OriginalMember(owner = "client!aey", name = "el", descriptor = "(SS)V", line = 1536)
	@Override
	public void method6956(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt774; local1++) {
			if (this.aShortArray31[local1] == arg0) {
				this.aShortArray31[local1] = arg1;
			}
		}
		if (this.aClass378Array1 != null) {
			for (local1 = 0; local1 < this.anInt781; local1++) {
				@Pc(32) Class378 local32 = this.aClass378Array1[local1];
				@Pc(37) Class360 local37 = this.aClass360Array1[local1];
				local37.anInt4510 = local37.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local32.anInt4579] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6982();
	}

	@OriginalMember(owner = "client!aey", name = "az", descriptor = "(SS)V", line = 1536)
	@Override
	public void method6835(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt774; local1++) {
			if (this.aShortArray31[local1] == arg0) {
				this.aShortArray31[local1] = arg1;
			}
		}
		if (this.aClass378Array1 != null) {
			for (local1 = 0; local1 < this.anInt781; local1++) {
				@Pc(32) Class378 local32 = this.aClass378Array1[local1];
				@Pc(37) Class360 local37 = this.aClass360Array1[local1];
				local37.anInt4510 = local37.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local32.anInt4579] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6982();
	}

	@OriginalMember(owner = "client!aey", name = "bc", descriptor = "(B[B)V", line = 1550)
	@Override
	public void method6865(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt774; local3++) {
				this.aByteArray18[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt774; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray18[local3] = (byte) local39;
			}
		}
		this.method6982();
	}

	@OriginalMember(owner = "client!aey", name = "eb", descriptor = "(B[B)V", line = 1550)
	@Override
	public void method6920(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt774; local3++) {
				this.aByteArray18[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt774; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray18[local3] = (byte) local39;
			}
		}
		this.method6982();
	}

	@OriginalMember(owner = "client!aey", name = "ey", descriptor = "(B[B)V", line = 1550)
	@Override
	public void method6925(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt774; local3++) {
				this.aByteArray18[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt774; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray18[local3] = (byte) local39;
			}
		}
		this.method6982();
	}

	@OriginalMember(owner = "client!aey", name = "ez", descriptor = "(B[B)V", line = 1550)
	@Override
	public void method6927(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt774; local3++) {
				this.aByteArray18[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt774; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray18[local3] = (byte) local39;
			}
		}
		this.method6982();
	}

	@OriginalMember(owner = "client!aey", name = "bj", descriptor = "(SS)V", line = 1565)
	@Override
	public void method6890(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class209 local3 = this.aClass86_Sub1_4.aClass209_9;
		for (@Pc(5) int local5 = 0; local5 < this.anInt774; local5++) {
			if (this.aShortArray32[local5] == arg0) {
				this.aShortArray32[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class215 local36 = local3.method25584(arg0 & 0xFFFF);
			local24 = local36.aByte122;
			local26 = local36.aByte117;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class215 local56 = local3.method25584(arg1 & 0xFFFF);
			local44 = local56.aByte122;
			local46 = local56.aByte117;
			if (local56.aByte113 != 0 || local56.aByte114 != 0) {
				this.aBoolean157 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass378Array1 != null) {
			for (@Pc(90) int local90 = 0; local90 < this.anInt781; local90++) {
				@Pc(99) Class378 local99 = this.aClass378Array1[local90];
				@Pc(104) Class360 local104 = this.aClass360Array1[local90];
				local104.anInt4510 = local104.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local99.anInt4579] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6982();
	}

	@OriginalMember(owner = "client!aey", name = "ek", descriptor = "(SS)V", line = 1565)
	@Override
	public void method6929(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class209 local3 = this.aClass86_Sub1_4.aClass209_9;
		for (@Pc(5) int local5 = 0; local5 < this.anInt774; local5++) {
			if (this.aShortArray32[local5] == arg0) {
				this.aShortArray32[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class215 local36 = local3.method25584(arg0 & 0xFFFF);
			local24 = local36.aByte122;
			local26 = local36.aByte117;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class215 local56 = local3.method25584(arg1 & 0xFFFF);
			local44 = local56.aByte122;
			local46 = local56.aByte117;
			if (local56.aByte113 != 0 || local56.aByte114 != 0) {
				this.aBoolean157 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass378Array1 != null) {
			for (@Pc(90) int local90 = 0; local90 < this.anInt781; local90++) {
				@Pc(99) Class378 local99 = this.aClass378Array1[local90];
				@Pc(104) Class360 local104 = this.aClass360Array1[local90];
				local104.anInt4510 = local104.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local99.anInt4579] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6982();
	}

	@OriginalMember(owner = "client!aey", name = "ev", descriptor = "(SS)V", line = 1565)
	@Override
	public void method6928(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class209 local3 = this.aClass86_Sub1_4.aClass209_9;
		for (@Pc(5) int local5 = 0; local5 < this.anInt774; local5++) {
			if (this.aShortArray32[local5] == arg0) {
				this.aShortArray32[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class215 local36 = local3.method25584(arg0 & 0xFFFF);
			local24 = local36.aByte122;
			local26 = local36.aByte117;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class215 local56 = local3.method25584(arg1 & 0xFFFF);
			local44 = local56.aByte122;
			local46 = local56.aByte117;
			if (local56.aByte113 != 0 || local56.aByte114 != 0) {
				this.aBoolean157 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass378Array1 != null) {
			for (@Pc(90) int local90 = 0; local90 < this.anInt781; local90++) {
				@Pc(99) Class378 local99 = this.aClass378Array1[local90];
				@Pc(104) Class360 local104 = this.aClass360Array1[local90];
				local104.anInt4510 = local104.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local99.anInt4579] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6982();
	}

	@OriginalMember(owner = "client!aey", name = "fv", descriptor = "(SS)V", line = 1565)
	@Override
	public void method6930(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class209 local3 = this.aClass86_Sub1_4.aClass209_9;
		for (@Pc(5) int local5 = 0; local5 < this.anInt774; local5++) {
			if (this.aShortArray32[local5] == arg0) {
				this.aShortArray32[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class215 local36 = local3.method25584(arg0 & 0xFFFF);
			local24 = local36.aByte122;
			local26 = local36.aByte117;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class215 local56 = local3.method25584(arg1 & 0xFFFF);
			local44 = local56.aByte122;
			local46 = local56.aByte117;
			if (local56.aByte113 != 0 || local56.aByte114 != 0) {
				this.aBoolean157 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass378Array1 != null) {
			for (@Pc(90) int local90 = 0; local90 < this.anInt781; local90++) {
				@Pc(99) Class378 local99 = this.aClass378Array1[local90];
				@Pc(104) Class360 local104 = this.aClass360Array1[local90];
				local104.anInt4510 = local104.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local99.anInt4579] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6982();
	}

	@OriginalMember(owner = "client!aey", name = "bv", descriptor = "(IIII)V", line = 1597)
	@Override
	public void method6837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt774; local1++) {
			@Pc(12) int local12 = this.aShortArray31[local1] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local28 += (arg2 - local28) * arg3 >> 7;
			}
			this.aShortArray31[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass378Array1 != null) {
			for (local1 = 0; local1 < this.anInt781; local1++) {
				@Pc(97) Class378 local97 = this.aClass378Array1[local1];
				@Pc(102) Class360 local102 = this.aClass360Array1[local1];
				local102.anInt4510 = local102.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local97.anInt4579] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6982();
	}

	@OriginalMember(owner = "client!aey", name = "fm", descriptor = "(IIII)V", line = 1597)
	@Override
	public void method6912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt774; local1++) {
			@Pc(12) int local12 = this.aShortArray31[local1] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local28 += (arg2 - local28) * arg3 >> 7;
			}
			this.aShortArray31[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass378Array1 != null) {
			for (local1 = 0; local1 < this.anInt781; local1++) {
				@Pc(97) Class378 local97 = this.aClass378Array1[local1];
				@Pc(102) Class360 local102 = this.aClass360Array1[local1];
				local102.anInt4510 = local102.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local97.anInt4579] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6982();
	}

	@OriginalMember(owner = "client!aey", name = "fq", descriptor = "(IIII)V", line = 1597)
	@Override
	public void method6931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt774; local1++) {
			@Pc(12) int local12 = this.aShortArray31[local1] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local28 += (arg2 - local28) * arg3 >> 7;
			}
			this.aShortArray31[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass378Array1 != null) {
			for (local1 = 0; local1 < this.anInt781; local1++) {
				@Pc(97) Class378 local97 = this.aClass378Array1[local1];
				@Pc(102) Class360 local102 = this.aClass360Array1[local1];
				local102.anInt4510 = local102.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local97.anInt4579] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6982();
	}

	@OriginalMember(owner = "client!aey", name = "fz", descriptor = "()Z", line = 1618)
	@Override
	public boolean method6838() {
		if (this.aShortArray32 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray32.length; local6++) {
			if (this.aShortArray32[local6] != -1 && !this.aClass86_Sub1_4.aClass370_3.method28232(this.aClass86_Sub1_4.aClass209_9.method25584(this.aShortArray32[local6]), -1)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aey", name = "fi", descriptor = "()Z", line = 1618)
	@Override
	public boolean method6866() {
		if (this.aShortArray32 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray32.length; local6++) {
			if (this.aShortArray32[local6] != -1 && !this.aClass86_Sub1_4.aClass370_3.method28232(this.aClass86_Sub1_4.aClass209_9.method25584(this.aShortArray32[local6]), -1)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aey", name = "ff", descriptor = "()Z", line = 1618)
	@Override
	public boolean method6940() {
		if (this.aShortArray32 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray32.length; local6++) {
			if (this.aShortArray32[local6] != -1 && !this.aClass86_Sub1_4.aClass370_3.method28232(this.aClass86_Sub1_4.aClass209_9.method25584(this.aShortArray32[local6]), -1)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aey", name = "ba", descriptor = "()Z", line = 1618)
	@Override
	public boolean method6839() {
		if (this.aShortArray32 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray32.length; local6++) {
			if (this.aShortArray32[local6] != -1 && !this.aClass86_Sub1_4.aClass370_3.method28232(this.aClass86_Sub1_4.aClass209_9.method25584(this.aShortArray32[local6]), -1)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aey", name = "bl", descriptor = "()Z", line = 1626)
	@Override
	public boolean method6809() {
		return this.aBoolean156;
	}

	@OriginalMember(owner = "client!aey", name = "fs", descriptor = "()Z", line = 1626)
	@Override
	public boolean method6941() {
		return this.aBoolean156;
	}

	@OriginalMember(owner = "client!aey", name = "fb", descriptor = "()Z", line = 1626)
	@Override
	public boolean method6942() {
		return this.aBoolean156;
	}

	@OriginalMember(owner = "client!aey", name = "fu", descriptor = "()Z", line = 1626)
	@Override
	public boolean method6943() {
		return this.aBoolean156;
	}

	@OriginalMember(owner = "client!aey", name = "bb", descriptor = "()Z", line = 1630)
	@Override
	public boolean method6840() {
		return this.aBoolean157;
	}

	@OriginalMember(owner = "client!aey", name = "fo", descriptor = "()Z", line = 1630)
	@Override
	public boolean method6944() {
		return this.aBoolean157;
	}

	@OriginalMember(owner = "client!aey", name = "f", descriptor = "()V", line = 1633)
	@Override
	void method6958() {
	}

	@OriginalMember(owner = "client!aey", name = "fp", descriptor = "()V", line = 1633)
	@Override
	void method6950() {
	}

	@OriginalMember(owner = "client!aey", name = "fy", descriptor = "()V", line = 1633)
	@Override
	void method6951() {
	}

	@OriginalMember(owner = "client!aey", name = "o", descriptor = "()V", line = 1634)
	@Override
	void method6883() {
	}

	@OriginalMember(owner = "client!aey", name = "fc", descriptor = "()V", line = 1634)
	@Override
	void method6954() {
	}

	@OriginalMember(owner = "client!aey", name = "fr", descriptor = "()V", line = 1634)
	@Override
	void method6953() {
	}

	@OriginalMember(owner = "client!aey", name = "fx", descriptor = "()V", line = 1634)
	@Override
	void method6836() {
	}

	@OriginalMember(owner = "client!aey", name = "ai", descriptor = "()Z", line = 1637)
	@Override
	boolean method6811() {
		if (this.anIntArrayArray11 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt770; local6++) {
			this.anIntArray70[local6] <<= 0x4;
			this.anIntArray71[local6] <<= 0x4;
			this.anIntArray75[local6] <<= 0x4;
		}
		this.anInt786 = 0;
		this.anInt773 = 0;
		this.anInt788 = 0;
		return true;
	}

	@OriginalMember(owner = "client!aey", name = "cr", descriptor = "()Z", line = 1637)
	@Override
	boolean method6844() {
		if (this.anIntArrayArray11 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt770; local6++) {
			this.anIntArray70[local6] <<= 0x4;
			this.anIntArray71[local6] <<= 0x4;
			this.anIntArray75[local6] <<= 0x4;
		}
		this.anInt786 = 0;
		this.anInt773 = 0;
		this.anInt788 = 0;
		return true;
	}

	@OriginalMember(owner = "client!aey", name = "co", descriptor = "(I[IIIIZI[I)V", line = 1650)
	@Override
	void method6893(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			this.anInt786 = 0;
			this.anInt773 = 0;
			this.anInt788 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray11.length) {
					local46 = this.anIntArrayArray11[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local56]) != 0) {
							this.anInt786 += this.anIntArray70[local56];
							this.anInt773 += this.anIntArray71[local56];
							this.anInt788 += this.anIntArray75[local56];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				this.anInt786 = this.anInt786 / local18 + arg2;
				this.anInt773 = this.anInt773 / local18 + arg3;
				this.anInt788 = this.anInt788 / local18 + arg4;
				this.aBoolean160 = true;
			} else {
				this.anInt786 = arg2;
				this.anInt773 = arg3;
				this.anInt788 = arg4;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local29 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local36 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local29;
				arg4 = local36;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local247 = this.anIntArrayArray11[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
							this.anIntArray70[local48] += arg2;
							this.anIntArray71[local48] += arg3;
							this.anIntArray75[local48] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(366) int local366;
		@Pc(391) int local391;
		@Pc(416) int local416;
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(475) int local475;
		@Pc(483) int local483;
		@Pc(642) int local642;
		@Pc(670) int local670;
		@Pc(675) int local675;
		@Pc(685) int local685;
		@Pc(690) int local690;
		@Pc(695) int local695;
		@Pc(700) int local700;
		@Pc(822) int[] local822;
		@Pc(824) int local824;
		@Pc(829) int local829;
		@Pc(834) int local834;
		@Pc(836) int local836;
		@Pc(962) int local962;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray11.length) {
						local247 = this.anIntArrayArray11[local29];
						for (local249 = 0; local249 < local247.length; local249++) {
							local48 = local247[local249];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
								this.anIntArray70[local48] -= this.anInt786;
								this.anIntArray71[local48] -= this.anInt773;
								this.anIntArray75[local48] -= this.anInt788;
								if (arg4 != 0) {
									local56 = Class436.anIntArray464[arg4];
									local366 = Class436.anIntArray463[arg4];
									local391 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local366 + 16383 >> 14;
									this.anIntArray71[local48] = this.anIntArray71[local48] * local366 - this.anIntArray70[local48] * local56 + 16383 >> 14;
									this.anIntArray70[local48] = local391;
								}
								if (arg2 != 0) {
									local56 = Class436.anIntArray464[arg2];
									local366 = Class436.anIntArray463[arg2];
									local391 = this.anIntArray71[local48] * local366 - this.anIntArray75[local48] * local56 + 16383 >> 14;
									this.anIntArray75[local48] = this.anIntArray71[local48] * local56 + this.anIntArray75[local48] * local366 + 16383 >> 14;
									this.anIntArray71[local48] = local391;
								}
								if (arg3 != 0) {
									local56 = Class436.anIntArray464[arg3];
									local366 = Class436.anIntArray463[arg3];
									local391 = this.anIntArray75[local48] * local56 + this.anIntArray70[local48] * local366 + 16383 >> 14;
									this.anIntArray75[local48] = this.anIntArray75[local48] * local366 - this.anIntArray70[local48] * local56 + 16383 >> 14;
									this.anIntArray70[local48] = local391;
								}
								this.anIntArray70[local48] += this.anInt786;
								this.anIntArray71[local48] += this.anInt773;
								this.anIntArray75[local48] += this.anInt788;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray11.length) {
							local247 = this.anIntArrayArray11[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local48 = local247[local249];
								if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
									local56 = this.anIntArray77[local48];
									local366 = this.anIntArray77[local48 + 1];
									for (local391 = local56; local391 < local366 && this.aShortArray37[local391] != 0; local391++) {
										local416 = (this.aShortArray37[local391] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local455 = Class436.anIntArray464[arg4];
											local459 = Class436.anIntArray463[arg4];
											local463 = this.aShortArray38[local416] * local455 + this.aShortArray30[local416] * local459 + 16383 >> 14;
											this.aShortArray38[local416] = (short) (this.aShortArray38[local416] * local459 - this.aShortArray30[local416] * local455 + 16383 >> 14);
											this.aShortArray30[local416] = (short) local463;
										}
										if (arg2 != 0) {
											local455 = Class436.anIntArray464[arg2];
											local459 = Class436.anIntArray463[arg2];
											local463 = this.aShortArray38[local416] * local459 - this.aShortArray39[local416] * local455 + 16383 >> 14;
											this.aShortArray39[local416] = (short) (this.aShortArray38[local416] * local455 + this.aShortArray39[local416] * local459 + 16383 >> 14);
											this.aShortArray38[local416] = (short) local463;
										}
										if (arg3 != 0) {
											local455 = Class436.anIntArray464[arg3];
											local459 = Class436.anIntArray463[arg3];
											local463 = this.aShortArray39[local416] * local455 + this.aShortArray30[local416] * local459 + 16383 >> 14;
											this.aShortArray39[local416] = (short) (this.aShortArray39[local416] * local459 - this.aShortArray30[local416] * local455 + 16383 >> 14);
											this.aShortArray30[local416] = (short) local463;
										}
									}
								}
							}
						}
					}
					this.method6983();
				}
			} else {
				local18 = arg7[9] << 4;
				local29 = arg7[10] << 4;
				local36 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local48 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (this.aBoolean160) {
					local366 = arg7[0] * this.anInt786 + arg7[3] * this.anInt773 + arg7[6] * this.anInt788 + 8192 >> 14;
					local391 = arg7[1] * this.anInt786 + arg7[4] * this.anInt773 + arg7[7] * this.anInt788 + 8192 >> 14;
					local416 = arg7[2] * this.anInt786 + arg7[5] * this.anInt773 + arg7[8] * this.anInt788 + 8192 >> 14;
					local366 += local249;
					local391 += local48;
					local416 += local56;
					this.anInt786 = local366;
					this.anInt773 = local391;
					this.anInt788 = local416;
					this.aBoolean160 = false;
				}
				@Pc(443) int[] local443 = new int[9];
				local391 = Class436.anIntArray463[arg2];
				local416 = Class436.anIntArray464[arg2];
				local455 = Class436.anIntArray463[arg3];
				local459 = Class436.anIntArray464[arg3];
				local463 = Class436.anIntArray463[arg4];
				local467 = Class436.anIntArray464[arg4];
				local475 = local416 * local463 + 8192 >> 14;
				local483 = local416 * local467 + 8192 >> 14;
				local443[0] = local455 * local463 + local459 * local483 + 8192 >> 14;
				local443[1] = -local455 * local467 + local459 * local475 + 8192 >> 14;
				local443[2] = local459 * local391 + 8192 >> 14;
				local443[3] = local391 * local467 + 8192 >> 14;
				local443[4] = local391 * local463 + 8192 >> 14;
				local443[5] = -local416;
				local443[6] = -local459 * local463 + local455 * local483 + 8192 >> 14;
				local443[7] = local459 * local467 + local455 * local475 + 8192 >> 14;
				local443[8] = local455 * local391 + 8192 >> 14;
				@Pc(614) int local614 = local443[0] * -this.anInt786 + local443[1] * -this.anInt773 + local443[2] * -this.anInt788 + 8192 >> 14;
				local642 = local443[3] * -this.anInt786 + local443[4] * -this.anInt773 + local443[5] * -this.anInt788 + 8192 >> 14;
				local670 = local443[6] * -this.anInt786 + local443[7] * -this.anInt773 + local443[8] * -this.anInt788 + 8192 >> 14;
				local675 = local614 + this.anInt786;
				@Pc(680) int local680 = local642 + this.anInt773;
				local685 = local670 + this.anInt788;
				@Pc(688) int[] local688 = new int[9];
				for (local690 = 0; local690 < 3; local690++) {
					for (local695 = 0; local695 < 3; local695++) {
						local700 = 0;
						for (@Pc(702) int local702 = 0; local702 < 3; local702++) {
							local700 += local443[local690 * 3 + local702] * arg7[local695 * 3 + local702];
						}
						local688[local690 * 3 + local695] = local700 + 8192 >> 14;
					}
				}
				local690 = local443[0] * local249 + local443[1] * local48 + local443[2] * local56 + 8192 >> 14;
				local695 = local443[3] * local249 + local443[4] * local48 + local443[5] * local56 + 8192 >> 14;
				local700 = local443[6] * local249 + local443[7] * local48 + local443[8] * local56 + 8192 >> 14;
				local690 += local675;
				local695 += local680;
				local700 += local685;
				local822 = new int[9];
				for (local824 = 0; local824 < 3; local824++) {
					for (local829 = 0; local829 < 3; local829++) {
						local834 = 0;
						for (local836 = 0; local836 < 3; local836++) {
							local834 += arg7[local824 * 3 + local836] * local688[local829 + local836 * 3];
						}
						local822[local824 * 3 + local829] = local834 + 8192 >> 14;
					}
				}
				local824 = arg7[0] * local690 + arg7[1] * local695 + arg7[2] * local700 + 8192 >> 14;
				local829 = arg7[3] * local690 + arg7[4] * local695 + arg7[5] * local700 + 8192 >> 14;
				local834 = arg7[6] * local690 + arg7[7] * local695 + arg7[8] * local700 + 8192 >> 14;
				local824 += local18;
				local829 += local29;
				local834 += local36;
				for (local836 = 0; local836 < local2; local836++) {
					local962 = arg1[local836];
					if (local962 < this.anIntArrayArray11.length) {
						@Pc(972) int[] local972 = this.anIntArrayArray11[local962];
						for (@Pc(974) int local974 = 0; local974 < local972.length; local974++) {
							@Pc(982) int local982 = local972[local974];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local982]) != 0) {
								@Pc(1024) int local1024 = local822[0] * this.anIntArray70[local982] + local822[1] * this.anIntArray71[local982] + local822[2] * this.anIntArray75[local982] + 8192 >> 14;
								@Pc(1055) int local1055 = local822[3] * this.anIntArray70[local982] + local822[4] * this.anIntArray71[local982] + local822[5] * this.anIntArray75[local982] + 8192 >> 14;
								@Pc(1086) int local1086 = local822[6] * this.anIntArray70[local982] + local822[7] * this.anIntArray71[local982] + local822[8] * this.anIntArray75[local982] + 8192 >> 14;
								@Pc(1090) int local1090 = local1024 + local824;
								@Pc(1094) int local1094 = local1055 + local829;
								@Pc(1098) int local1098 = local1086 + local834;
								this.anIntArray70[local982] = local1090;
								this.anIntArray71[local982] = local1094;
								this.anIntArray75[local982] = local1098;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2424) boolean local2424;
			@Pc(2520) Class378 local2520;
			@Pc(2525) Class360 local2525;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					local2424 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray12.length) {
							local46 = this.anIntArrayArray12[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								if (this.aShortArray33 == null || (arg6 & this.aShortArray33[local56]) != 0) {
									local366 = (this.aByteArray18[local56] & 0xFF) + arg2 * 8;
									if (local366 < 0) {
										local366 = 0;
									} else if (local366 > 255) {
										local366 = 255;
									}
									this.aByteArray18[local56] = (byte) local366;
								}
							}
							local2424 |= local46.length > 0;
						}
					}
					if (local2424) {
						if (this.aClass378Array1 != null) {
							for (local29 = 0; local29 < this.anInt781; local29++) {
								local2520 = this.aClass378Array1[local29];
								local2525 = this.aClass360Array1[local29];
								local2525.anInt4510 = local2525.anInt4510 & 0xFFFFFF | 255 - (this.aByteArray18[local2520.anInt4579] & 0xFF) << 24;
							}
						}
						this.method6982();
					}
				}
			} else if (arg0 != 7) {
				@Pc(2764) Class360 local2764;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray13.length) {
								local247 = this.anIntArrayArray13[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass360Array1[local247[local249]];
									local2764.anInt4508 += arg2;
									local2764.anInt4505 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray13.length) {
								local247 = this.anIntArrayArray13[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass360Array1[local247[local249]];
									local2764.anInt4509 = local2764.anInt4509 * arg2 >> 7;
									local2764.anInt4507 = local2764.anInt4507 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray13 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray13.length) {
							local247 = this.anIntArrayArray13[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2764 = this.aClass360Array1[local247[local249]];
								local2764.anInt4506 = local2764.anInt4506 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray12 != null) {
				local2424 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray12.length) {
						local46 = this.anIntArrayArray12[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							if (this.aShortArray33 == null || (arg6 & this.aShortArray33[local56]) != 0) {
								local366 = this.aShortArray31[local56] & 0xFFFF;
								local391 = local366 >> 10 & 0x3F;
								local416 = local366 >> 7 & 0x7;
								local455 = local366 & 0x7F;
								@Pc(2625) int local2625 = local391 + arg2 & 0x3F;
								local416 += arg3 / 4;
								if (local416 < 0) {
									local416 = 0;
								} else if (local416 > 7) {
									local416 = 7;
								}
								local455 += arg4;
								if (local455 < 0) {
									local455 = 0;
								} else if (local455 > 127) {
									local455 = 127;
								}
								this.aShortArray31[local56] = (short) (local2625 << 10 | local416 << 7 | local455);
							}
						}
						local2424 |= local46.length > 0;
					}
				}
				if (local2424) {
					if (this.aClass378Array1 != null) {
						for (local29 = 0; local29 < this.anInt781; local29++) {
							local2520 = this.aClass378Array1[local29];
							local2525 = this.aClass360Array1[local29];
							local2525.anInt4510 = local2525.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local2520.anInt4579] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method6982();
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local247 = this.anIntArrayArray11[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
							this.anIntArray70[local48] -= this.anInt786;
							this.anIntArray71[local48] -= this.anInt773;
							this.anIntArray75[local48] -= this.anInt788;
							this.anIntArray70[local48] = this.anIntArray70[local48] * arg2 >> 7;
							this.anIntArray71[local48] = this.anIntArray71[local48] * arg3 >> 7;
							this.anIntArray75[local48] = this.anIntArray75[local48] * arg4 >> 7;
							this.anIntArray70[local48] += this.anInt786;
							this.anIntArray71[local48] += this.anInt773;
							this.anIntArray75[local48] += this.anInt788;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local29 = arg7[10] << 4;
			local36 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local48 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (this.aBoolean160) {
				local366 = arg7[0] * this.anInt786 + arg7[3] * this.anInt773 + arg7[6] * this.anInt788 + 8192 >> 14;
				local391 = arg7[1] * this.anInt786 + arg7[4] * this.anInt773 + arg7[7] * this.anInt788 + 8192 >> 14;
				local416 = arg7[2] * this.anInt786 + arg7[5] * this.anInt773 + arg7[8] * this.anInt788 + 8192 >> 14;
				local366 += local249;
				local391 += local48;
				local416 += local56;
				this.anInt786 = local366;
				this.anInt773 = local391;
				this.anInt788 = local416;
				this.aBoolean160 = false;
			}
			local366 = arg2 << 15 >> 7;
			local391 = arg3 << 15 >> 7;
			local416 = arg4 << 15 >> 7;
			local455 = local366 * -this.anInt786 + 8192 >> 14;
			local459 = local391 * -this.anInt773 + 8192 >> 14;
			local463 = local416 * -this.anInt788 + 8192 >> 14;
			local467 = local455 + this.anInt786;
			local475 = local459 + this.anInt773;
			local483 = local463 + this.anInt788;
			@Pc(1838) int[] local1838 = new int[] { local366 * arg7[0] + 8192 >> 14, local366 * arg7[3] + 8192 >> 14, local366 * arg7[6] + 8192 >> 14, local391 * arg7[1] + 8192 >> 14, local391 * arg7[4] + 8192 >> 14, local391 * arg7[7] + 8192 >> 14, local416 * arg7[2] + 8192 >> 14, local416 * arg7[5] + 8192 >> 14, local416 * arg7[8] + 8192 >> 14 };
			local642 = local366 * local249 + 8192 >> 14;
			local670 = local391 * local48 + 8192 >> 14;
			local675 = local416 * local56 + 8192 >> 14;
			@Pc(1974) int local1974 = local642 + local467;
			@Pc(1978) int local1978 = local670 + local475;
			@Pc(1982) int local1982 = local675 + local483;
			@Pc(1985) int[] local1985 = new int[9];
			@Pc(1992) int local1992;
			for (local685 = 0; local685 < 3; local685++) {
				for (local1992 = 0; local1992 < 3; local1992++) {
					local690 = 0;
					for (local695 = 0; local695 < 3; local695++) {
						local690 += arg7[local685 * 3 + local695] * local1838[local1992 + local695 * 3];
					}
					local1985[local685 * 3 + local1992] = local690 + 8192 >> 14;
				}
			}
			local685 = arg7[0] * local1974 + arg7[1] * local1978 + arg7[2] * local1982 + 8192 >> 14;
			local1992 = arg7[3] * local1974 + arg7[4] * local1978 + arg7[5] * local1982 + 8192 >> 14;
			local690 = arg7[6] * local1974 + arg7[7] * local1978 + arg7[8] * local1982 + 8192 >> 14;
			local685 += local18;
			local1992 += local29;
			local690 += local36;
			for (local695 = 0; local695 < local2; local695++) {
				local700 = arg1[local695];
				if (local700 < this.anIntArrayArray11.length) {
					local822 = this.anIntArrayArray11[local700];
					for (local824 = 0; local824 < local822.length; local824++) {
						local829 = local822[local824];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local829]) != 0) {
							local834 = local1985[0] * this.anIntArray70[local829] + local1985[1] * this.anIntArray71[local829] + local1985[2] * this.anIntArray75[local829] + 8192 >> 14;
							local836 = local1985[3] * this.anIntArray70[local829] + local1985[4] * this.anIntArray71[local829] + local1985[5] * this.anIntArray75[local829] + 8192 >> 14;
							local962 = local1985[6] * this.anIntArray70[local829] + local1985[7] * this.anIntArray71[local829] + local1985[8] * this.anIntArray75[local829] + 8192 >> 14;
							@Pc(2253) int local2253 = local834 + local685;
							@Pc(2257) int local2257 = local836 + local1992;
							@Pc(2261) int local2261 = local962 + local690;
							this.anIntArray70[local829] = local2253;
							this.anIntArray71[local829] = local2257;
							this.anIntArray75[local829] = local2261;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "cn", descriptor = "(I[IIIIZI[I)V", line = 1650)
	@Override
	void method6876(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			this.anInt786 = 0;
			this.anInt773 = 0;
			this.anInt788 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray11.length) {
					local46 = this.anIntArrayArray11[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local56]) != 0) {
							this.anInt786 += this.anIntArray70[local56];
							this.anInt773 += this.anIntArray71[local56];
							this.anInt788 += this.anIntArray75[local56];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				this.anInt786 = this.anInt786 / local18 + arg2;
				this.anInt773 = this.anInt773 / local18 + arg3;
				this.anInt788 = this.anInt788 / local18 + arg4;
				this.aBoolean160 = true;
			} else {
				this.anInt786 = arg2;
				this.anInt773 = arg3;
				this.anInt788 = arg4;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local29 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local36 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local29;
				arg4 = local36;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local247 = this.anIntArrayArray11[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
							this.anIntArray70[local48] += arg2;
							this.anIntArray71[local48] += arg3;
							this.anIntArray75[local48] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(366) int local366;
		@Pc(391) int local391;
		@Pc(416) int local416;
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(475) int local475;
		@Pc(483) int local483;
		@Pc(642) int local642;
		@Pc(670) int local670;
		@Pc(675) int local675;
		@Pc(685) int local685;
		@Pc(690) int local690;
		@Pc(695) int local695;
		@Pc(700) int local700;
		@Pc(822) int[] local822;
		@Pc(824) int local824;
		@Pc(829) int local829;
		@Pc(834) int local834;
		@Pc(836) int local836;
		@Pc(962) int local962;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray11.length) {
						local247 = this.anIntArrayArray11[local29];
						for (local249 = 0; local249 < local247.length; local249++) {
							local48 = local247[local249];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
								this.anIntArray70[local48] -= this.anInt786;
								this.anIntArray71[local48] -= this.anInt773;
								this.anIntArray75[local48] -= this.anInt788;
								if (arg4 != 0) {
									local56 = Class436.anIntArray464[arg4];
									local366 = Class436.anIntArray463[arg4];
									local391 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local366 + 16383 >> 14;
									this.anIntArray71[local48] = this.anIntArray71[local48] * local366 - this.anIntArray70[local48] * local56 + 16383 >> 14;
									this.anIntArray70[local48] = local391;
								}
								if (arg2 != 0) {
									local56 = Class436.anIntArray464[arg2];
									local366 = Class436.anIntArray463[arg2];
									local391 = this.anIntArray71[local48] * local366 - this.anIntArray75[local48] * local56 + 16383 >> 14;
									this.anIntArray75[local48] = this.anIntArray71[local48] * local56 + this.anIntArray75[local48] * local366 + 16383 >> 14;
									this.anIntArray71[local48] = local391;
								}
								if (arg3 != 0) {
									local56 = Class436.anIntArray464[arg3];
									local366 = Class436.anIntArray463[arg3];
									local391 = this.anIntArray75[local48] * local56 + this.anIntArray70[local48] * local366 + 16383 >> 14;
									this.anIntArray75[local48] = this.anIntArray75[local48] * local366 - this.anIntArray70[local48] * local56 + 16383 >> 14;
									this.anIntArray70[local48] = local391;
								}
								this.anIntArray70[local48] += this.anInt786;
								this.anIntArray71[local48] += this.anInt773;
								this.anIntArray75[local48] += this.anInt788;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray11.length) {
							local247 = this.anIntArrayArray11[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local48 = local247[local249];
								if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
									local56 = this.anIntArray77[local48];
									local366 = this.anIntArray77[local48 + 1];
									for (local391 = local56; local391 < local366 && this.aShortArray37[local391] != 0; local391++) {
										local416 = (this.aShortArray37[local391] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local455 = Class436.anIntArray464[arg4];
											local459 = Class436.anIntArray463[arg4];
											local463 = this.aShortArray38[local416] * local455 + this.aShortArray30[local416] * local459 + 16383 >> 14;
											this.aShortArray38[local416] = (short) (this.aShortArray38[local416] * local459 - this.aShortArray30[local416] * local455 + 16383 >> 14);
											this.aShortArray30[local416] = (short) local463;
										}
										if (arg2 != 0) {
											local455 = Class436.anIntArray464[arg2];
											local459 = Class436.anIntArray463[arg2];
											local463 = this.aShortArray38[local416] * local459 - this.aShortArray39[local416] * local455 + 16383 >> 14;
											this.aShortArray39[local416] = (short) (this.aShortArray38[local416] * local455 + this.aShortArray39[local416] * local459 + 16383 >> 14);
											this.aShortArray38[local416] = (short) local463;
										}
										if (arg3 != 0) {
											local455 = Class436.anIntArray464[arg3];
											local459 = Class436.anIntArray463[arg3];
											local463 = this.aShortArray39[local416] * local455 + this.aShortArray30[local416] * local459 + 16383 >> 14;
											this.aShortArray39[local416] = (short) (this.aShortArray39[local416] * local459 - this.aShortArray30[local416] * local455 + 16383 >> 14);
											this.aShortArray30[local416] = (short) local463;
										}
									}
								}
							}
						}
					}
					this.method6983();
				}
			} else {
				local18 = arg7[9] << 4;
				local29 = arg7[10] << 4;
				local36 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local48 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (this.aBoolean160) {
					local366 = arg7[0] * this.anInt786 + arg7[3] * this.anInt773 + arg7[6] * this.anInt788 + 8192 >> 14;
					local391 = arg7[1] * this.anInt786 + arg7[4] * this.anInt773 + arg7[7] * this.anInt788 + 8192 >> 14;
					local416 = arg7[2] * this.anInt786 + arg7[5] * this.anInt773 + arg7[8] * this.anInt788 + 8192 >> 14;
					local366 += local249;
					local391 += local48;
					local416 += local56;
					this.anInt786 = local366;
					this.anInt773 = local391;
					this.anInt788 = local416;
					this.aBoolean160 = false;
				}
				@Pc(443) int[] local443 = new int[9];
				local391 = Class436.anIntArray463[arg2];
				local416 = Class436.anIntArray464[arg2];
				local455 = Class436.anIntArray463[arg3];
				local459 = Class436.anIntArray464[arg3];
				local463 = Class436.anIntArray463[arg4];
				local467 = Class436.anIntArray464[arg4];
				local475 = local416 * local463 + 8192 >> 14;
				local483 = local416 * local467 + 8192 >> 14;
				local443[0] = local455 * local463 + local459 * local483 + 8192 >> 14;
				local443[1] = -local455 * local467 + local459 * local475 + 8192 >> 14;
				local443[2] = local459 * local391 + 8192 >> 14;
				local443[3] = local391 * local467 + 8192 >> 14;
				local443[4] = local391 * local463 + 8192 >> 14;
				local443[5] = -local416;
				local443[6] = -local459 * local463 + local455 * local483 + 8192 >> 14;
				local443[7] = local459 * local467 + local455 * local475 + 8192 >> 14;
				local443[8] = local455 * local391 + 8192 >> 14;
				@Pc(614) int local614 = local443[0] * -this.anInt786 + local443[1] * -this.anInt773 + local443[2] * -this.anInt788 + 8192 >> 14;
				local642 = local443[3] * -this.anInt786 + local443[4] * -this.anInt773 + local443[5] * -this.anInt788 + 8192 >> 14;
				local670 = local443[6] * -this.anInt786 + local443[7] * -this.anInt773 + local443[8] * -this.anInt788 + 8192 >> 14;
				local675 = local614 + this.anInt786;
				@Pc(680) int local680 = local642 + this.anInt773;
				local685 = local670 + this.anInt788;
				@Pc(688) int[] local688 = new int[9];
				for (local690 = 0; local690 < 3; local690++) {
					for (local695 = 0; local695 < 3; local695++) {
						local700 = 0;
						for (@Pc(702) int local702 = 0; local702 < 3; local702++) {
							local700 += local443[local690 * 3 + local702] * arg7[local695 * 3 + local702];
						}
						local688[local690 * 3 + local695] = local700 + 8192 >> 14;
					}
				}
				local690 = local443[0] * local249 + local443[1] * local48 + local443[2] * local56 + 8192 >> 14;
				local695 = local443[3] * local249 + local443[4] * local48 + local443[5] * local56 + 8192 >> 14;
				local700 = local443[6] * local249 + local443[7] * local48 + local443[8] * local56 + 8192 >> 14;
				local690 += local675;
				local695 += local680;
				local700 += local685;
				local822 = new int[9];
				for (local824 = 0; local824 < 3; local824++) {
					for (local829 = 0; local829 < 3; local829++) {
						local834 = 0;
						for (local836 = 0; local836 < 3; local836++) {
							local834 += arg7[local824 * 3 + local836] * local688[local829 + local836 * 3];
						}
						local822[local824 * 3 + local829] = local834 + 8192 >> 14;
					}
				}
				local824 = arg7[0] * local690 + arg7[1] * local695 + arg7[2] * local700 + 8192 >> 14;
				local829 = arg7[3] * local690 + arg7[4] * local695 + arg7[5] * local700 + 8192 >> 14;
				local834 = arg7[6] * local690 + arg7[7] * local695 + arg7[8] * local700 + 8192 >> 14;
				local824 += local18;
				local829 += local29;
				local834 += local36;
				for (local836 = 0; local836 < local2; local836++) {
					local962 = arg1[local836];
					if (local962 < this.anIntArrayArray11.length) {
						@Pc(972) int[] local972 = this.anIntArrayArray11[local962];
						for (@Pc(974) int local974 = 0; local974 < local972.length; local974++) {
							@Pc(982) int local982 = local972[local974];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local982]) != 0) {
								@Pc(1024) int local1024 = local822[0] * this.anIntArray70[local982] + local822[1] * this.anIntArray71[local982] + local822[2] * this.anIntArray75[local982] + 8192 >> 14;
								@Pc(1055) int local1055 = local822[3] * this.anIntArray70[local982] + local822[4] * this.anIntArray71[local982] + local822[5] * this.anIntArray75[local982] + 8192 >> 14;
								@Pc(1086) int local1086 = local822[6] * this.anIntArray70[local982] + local822[7] * this.anIntArray71[local982] + local822[8] * this.anIntArray75[local982] + 8192 >> 14;
								@Pc(1090) int local1090 = local1024 + local824;
								@Pc(1094) int local1094 = local1055 + local829;
								@Pc(1098) int local1098 = local1086 + local834;
								this.anIntArray70[local982] = local1090;
								this.anIntArray71[local982] = local1094;
								this.anIntArray75[local982] = local1098;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2424) boolean local2424;
			@Pc(2520) Class378 local2520;
			@Pc(2525) Class360 local2525;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					local2424 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray12.length) {
							local46 = this.anIntArrayArray12[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								if (this.aShortArray33 == null || (arg6 & this.aShortArray33[local56]) != 0) {
									local366 = (this.aByteArray18[local56] & 0xFF) + arg2 * 8;
									if (local366 < 0) {
										local366 = 0;
									} else if (local366 > 255) {
										local366 = 255;
									}
									this.aByteArray18[local56] = (byte) local366;
								}
							}
							local2424 |= local46.length > 0;
						}
					}
					if (local2424) {
						if (this.aClass378Array1 != null) {
							for (local29 = 0; local29 < this.anInt781; local29++) {
								local2520 = this.aClass378Array1[local29];
								local2525 = this.aClass360Array1[local29];
								local2525.anInt4510 = local2525.anInt4510 & 0xFFFFFF | 255 - (this.aByteArray18[local2520.anInt4579] & 0xFF) << 24;
							}
						}
						this.method6982();
					}
				}
			} else if (arg0 != 7) {
				@Pc(2764) Class360 local2764;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray13.length) {
								local247 = this.anIntArrayArray13[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass360Array1[local247[local249]];
									local2764.anInt4508 += arg2;
									local2764.anInt4505 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray13.length) {
								local247 = this.anIntArrayArray13[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass360Array1[local247[local249]];
									local2764.anInt4509 = local2764.anInt4509 * arg2 >> 7;
									local2764.anInt4507 = local2764.anInt4507 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray13 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray13.length) {
							local247 = this.anIntArrayArray13[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2764 = this.aClass360Array1[local247[local249]];
								local2764.anInt4506 = local2764.anInt4506 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray12 != null) {
				local2424 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray12.length) {
						local46 = this.anIntArrayArray12[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							if (this.aShortArray33 == null || (arg6 & this.aShortArray33[local56]) != 0) {
								local366 = this.aShortArray31[local56] & 0xFFFF;
								local391 = local366 >> 10 & 0x3F;
								local416 = local366 >> 7 & 0x7;
								local455 = local366 & 0x7F;
								@Pc(2625) int local2625 = local391 + arg2 & 0x3F;
								local416 += arg3 / 4;
								if (local416 < 0) {
									local416 = 0;
								} else if (local416 > 7) {
									local416 = 7;
								}
								local455 += arg4;
								if (local455 < 0) {
									local455 = 0;
								} else if (local455 > 127) {
									local455 = 127;
								}
								this.aShortArray31[local56] = (short) (local2625 << 10 | local416 << 7 | local455);
							}
						}
						local2424 |= local46.length > 0;
					}
				}
				if (local2424) {
					if (this.aClass378Array1 != null) {
						for (local29 = 0; local29 < this.anInt781; local29++) {
							local2520 = this.aClass378Array1[local29];
							local2525 = this.aClass360Array1[local29];
							local2525.anInt4510 = local2525.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local2520.anInt4579] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method6982();
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local247 = this.anIntArrayArray11[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
							this.anIntArray70[local48] -= this.anInt786;
							this.anIntArray71[local48] -= this.anInt773;
							this.anIntArray75[local48] -= this.anInt788;
							this.anIntArray70[local48] = this.anIntArray70[local48] * arg2 >> 7;
							this.anIntArray71[local48] = this.anIntArray71[local48] * arg3 >> 7;
							this.anIntArray75[local48] = this.anIntArray75[local48] * arg4 >> 7;
							this.anIntArray70[local48] += this.anInt786;
							this.anIntArray71[local48] += this.anInt773;
							this.anIntArray75[local48] += this.anInt788;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local29 = arg7[10] << 4;
			local36 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local48 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (this.aBoolean160) {
				local366 = arg7[0] * this.anInt786 + arg7[3] * this.anInt773 + arg7[6] * this.anInt788 + 8192 >> 14;
				local391 = arg7[1] * this.anInt786 + arg7[4] * this.anInt773 + arg7[7] * this.anInt788 + 8192 >> 14;
				local416 = arg7[2] * this.anInt786 + arg7[5] * this.anInt773 + arg7[8] * this.anInt788 + 8192 >> 14;
				local366 += local249;
				local391 += local48;
				local416 += local56;
				this.anInt786 = local366;
				this.anInt773 = local391;
				this.anInt788 = local416;
				this.aBoolean160 = false;
			}
			local366 = arg2 << 15 >> 7;
			local391 = arg3 << 15 >> 7;
			local416 = arg4 << 15 >> 7;
			local455 = local366 * -this.anInt786 + 8192 >> 14;
			local459 = local391 * -this.anInt773 + 8192 >> 14;
			local463 = local416 * -this.anInt788 + 8192 >> 14;
			local467 = local455 + this.anInt786;
			local475 = local459 + this.anInt773;
			local483 = local463 + this.anInt788;
			@Pc(1838) int[] local1838 = new int[] { local366 * arg7[0] + 8192 >> 14, local366 * arg7[3] + 8192 >> 14, local366 * arg7[6] + 8192 >> 14, local391 * arg7[1] + 8192 >> 14, local391 * arg7[4] + 8192 >> 14, local391 * arg7[7] + 8192 >> 14, local416 * arg7[2] + 8192 >> 14, local416 * arg7[5] + 8192 >> 14, local416 * arg7[8] + 8192 >> 14 };
			local642 = local366 * local249 + 8192 >> 14;
			local670 = local391 * local48 + 8192 >> 14;
			local675 = local416 * local56 + 8192 >> 14;
			@Pc(1974) int local1974 = local642 + local467;
			@Pc(1978) int local1978 = local670 + local475;
			@Pc(1982) int local1982 = local675 + local483;
			@Pc(1985) int[] local1985 = new int[9];
			@Pc(1992) int local1992;
			for (local685 = 0; local685 < 3; local685++) {
				for (local1992 = 0; local1992 < 3; local1992++) {
					local690 = 0;
					for (local695 = 0; local695 < 3; local695++) {
						local690 += arg7[local685 * 3 + local695] * local1838[local1992 + local695 * 3];
					}
					local1985[local685 * 3 + local1992] = local690 + 8192 >> 14;
				}
			}
			local685 = arg7[0] * local1974 + arg7[1] * local1978 + arg7[2] * local1982 + 8192 >> 14;
			local1992 = arg7[3] * local1974 + arg7[4] * local1978 + arg7[5] * local1982 + 8192 >> 14;
			local690 = arg7[6] * local1974 + arg7[7] * local1978 + arg7[8] * local1982 + 8192 >> 14;
			local685 += local18;
			local1992 += local29;
			local690 += local36;
			for (local695 = 0; local695 < local2; local695++) {
				local700 = arg1[local695];
				if (local700 < this.anIntArrayArray11.length) {
					local822 = this.anIntArrayArray11[local700];
					for (local824 = 0; local824 < local822.length; local824++) {
						local829 = local822[local824];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local829]) != 0) {
							local834 = local1985[0] * this.anIntArray70[local829] + local1985[1] * this.anIntArray71[local829] + local1985[2] * this.anIntArray75[local829] + 8192 >> 14;
							local836 = local1985[3] * this.anIntArray70[local829] + local1985[4] * this.anIntArray71[local829] + local1985[5] * this.anIntArray75[local829] + 8192 >> 14;
							local962 = local1985[6] * this.anIntArray70[local829] + local1985[7] * this.anIntArray71[local829] + local1985[8] * this.anIntArray75[local829] + 8192 >> 14;
							@Pc(2253) int local2253 = local834 + local685;
							@Pc(2257) int local2257 = local836 + local1992;
							@Pc(2261) int local2261 = local962 + local690;
							this.anIntArray70[local829] = local2253;
							this.anIntArray71[local829] = local2257;
							this.anIntArray75[local829] = local2261;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "cq", descriptor = "(I[IIIIZI[I)V", line = 1650)
	@Override
	void method6870(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			this.anInt786 = 0;
			this.anInt773 = 0;
			this.anInt788 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray11.length) {
					local46 = this.anIntArrayArray11[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local56]) != 0) {
							this.anInt786 += this.anIntArray70[local56];
							this.anInt773 += this.anIntArray71[local56];
							this.anInt788 += this.anIntArray75[local56];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				this.anInt786 = this.anInt786 / local18 + arg2;
				this.anInt773 = this.anInt773 / local18 + arg3;
				this.anInt788 = this.anInt788 / local18 + arg4;
				this.aBoolean160 = true;
			} else {
				this.anInt786 = arg2;
				this.anInt773 = arg3;
				this.anInt788 = arg4;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local29 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local36 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local29;
				arg4 = local36;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local247 = this.anIntArrayArray11[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
							this.anIntArray70[local48] += arg2;
							this.anIntArray71[local48] += arg3;
							this.anIntArray75[local48] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(366) int local366;
		@Pc(391) int local391;
		@Pc(416) int local416;
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(475) int local475;
		@Pc(483) int local483;
		@Pc(642) int local642;
		@Pc(670) int local670;
		@Pc(675) int local675;
		@Pc(685) int local685;
		@Pc(690) int local690;
		@Pc(695) int local695;
		@Pc(700) int local700;
		@Pc(822) int[] local822;
		@Pc(824) int local824;
		@Pc(829) int local829;
		@Pc(834) int local834;
		@Pc(836) int local836;
		@Pc(962) int local962;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray11.length) {
						local247 = this.anIntArrayArray11[local29];
						for (local249 = 0; local249 < local247.length; local249++) {
							local48 = local247[local249];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
								this.anIntArray70[local48] -= this.anInt786;
								this.anIntArray71[local48] -= this.anInt773;
								this.anIntArray75[local48] -= this.anInt788;
								if (arg4 != 0) {
									local56 = Class436.anIntArray464[arg4];
									local366 = Class436.anIntArray463[arg4];
									local391 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local366 + 16383 >> 14;
									this.anIntArray71[local48] = this.anIntArray71[local48] * local366 - this.anIntArray70[local48] * local56 + 16383 >> 14;
									this.anIntArray70[local48] = local391;
								}
								if (arg2 != 0) {
									local56 = Class436.anIntArray464[arg2];
									local366 = Class436.anIntArray463[arg2];
									local391 = this.anIntArray71[local48] * local366 - this.anIntArray75[local48] * local56 + 16383 >> 14;
									this.anIntArray75[local48] = this.anIntArray71[local48] * local56 + this.anIntArray75[local48] * local366 + 16383 >> 14;
									this.anIntArray71[local48] = local391;
								}
								if (arg3 != 0) {
									local56 = Class436.anIntArray464[arg3];
									local366 = Class436.anIntArray463[arg3];
									local391 = this.anIntArray75[local48] * local56 + this.anIntArray70[local48] * local366 + 16383 >> 14;
									this.anIntArray75[local48] = this.anIntArray75[local48] * local366 - this.anIntArray70[local48] * local56 + 16383 >> 14;
									this.anIntArray70[local48] = local391;
								}
								this.anIntArray70[local48] += this.anInt786;
								this.anIntArray71[local48] += this.anInt773;
								this.anIntArray75[local48] += this.anInt788;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray11.length) {
							local247 = this.anIntArrayArray11[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local48 = local247[local249];
								if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
									local56 = this.anIntArray77[local48];
									local366 = this.anIntArray77[local48 + 1];
									for (local391 = local56; local391 < local366 && this.aShortArray37[local391] != 0; local391++) {
										local416 = (this.aShortArray37[local391] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local455 = Class436.anIntArray464[arg4];
											local459 = Class436.anIntArray463[arg4];
											local463 = this.aShortArray38[local416] * local455 + this.aShortArray30[local416] * local459 + 16383 >> 14;
											this.aShortArray38[local416] = (short) (this.aShortArray38[local416] * local459 - this.aShortArray30[local416] * local455 + 16383 >> 14);
											this.aShortArray30[local416] = (short) local463;
										}
										if (arg2 != 0) {
											local455 = Class436.anIntArray464[arg2];
											local459 = Class436.anIntArray463[arg2];
											local463 = this.aShortArray38[local416] * local459 - this.aShortArray39[local416] * local455 + 16383 >> 14;
											this.aShortArray39[local416] = (short) (this.aShortArray38[local416] * local455 + this.aShortArray39[local416] * local459 + 16383 >> 14);
											this.aShortArray38[local416] = (short) local463;
										}
										if (arg3 != 0) {
											local455 = Class436.anIntArray464[arg3];
											local459 = Class436.anIntArray463[arg3];
											local463 = this.aShortArray39[local416] * local455 + this.aShortArray30[local416] * local459 + 16383 >> 14;
											this.aShortArray39[local416] = (short) (this.aShortArray39[local416] * local459 - this.aShortArray30[local416] * local455 + 16383 >> 14);
											this.aShortArray30[local416] = (short) local463;
										}
									}
								}
							}
						}
					}
					this.method6983();
				}
			} else {
				local18 = arg7[9] << 4;
				local29 = arg7[10] << 4;
				local36 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local48 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (this.aBoolean160) {
					local366 = arg7[0] * this.anInt786 + arg7[3] * this.anInt773 + arg7[6] * this.anInt788 + 8192 >> 14;
					local391 = arg7[1] * this.anInt786 + arg7[4] * this.anInt773 + arg7[7] * this.anInt788 + 8192 >> 14;
					local416 = arg7[2] * this.anInt786 + arg7[5] * this.anInt773 + arg7[8] * this.anInt788 + 8192 >> 14;
					local366 += local249;
					local391 += local48;
					local416 += local56;
					this.anInt786 = local366;
					this.anInt773 = local391;
					this.anInt788 = local416;
					this.aBoolean160 = false;
				}
				@Pc(443) int[] local443 = new int[9];
				local391 = Class436.anIntArray463[arg2];
				local416 = Class436.anIntArray464[arg2];
				local455 = Class436.anIntArray463[arg3];
				local459 = Class436.anIntArray464[arg3];
				local463 = Class436.anIntArray463[arg4];
				local467 = Class436.anIntArray464[arg4];
				local475 = local416 * local463 + 8192 >> 14;
				local483 = local416 * local467 + 8192 >> 14;
				local443[0] = local455 * local463 + local459 * local483 + 8192 >> 14;
				local443[1] = -local455 * local467 + local459 * local475 + 8192 >> 14;
				local443[2] = local459 * local391 + 8192 >> 14;
				local443[3] = local391 * local467 + 8192 >> 14;
				local443[4] = local391 * local463 + 8192 >> 14;
				local443[5] = -local416;
				local443[6] = -local459 * local463 + local455 * local483 + 8192 >> 14;
				local443[7] = local459 * local467 + local455 * local475 + 8192 >> 14;
				local443[8] = local455 * local391 + 8192 >> 14;
				@Pc(614) int local614 = local443[0] * -this.anInt786 + local443[1] * -this.anInt773 + local443[2] * -this.anInt788 + 8192 >> 14;
				local642 = local443[3] * -this.anInt786 + local443[4] * -this.anInt773 + local443[5] * -this.anInt788 + 8192 >> 14;
				local670 = local443[6] * -this.anInt786 + local443[7] * -this.anInt773 + local443[8] * -this.anInt788 + 8192 >> 14;
				local675 = local614 + this.anInt786;
				@Pc(680) int local680 = local642 + this.anInt773;
				local685 = local670 + this.anInt788;
				@Pc(688) int[] local688 = new int[9];
				for (local690 = 0; local690 < 3; local690++) {
					for (local695 = 0; local695 < 3; local695++) {
						local700 = 0;
						for (@Pc(702) int local702 = 0; local702 < 3; local702++) {
							local700 += local443[local690 * 3 + local702] * arg7[local695 * 3 + local702];
						}
						local688[local690 * 3 + local695] = local700 + 8192 >> 14;
					}
				}
				local690 = local443[0] * local249 + local443[1] * local48 + local443[2] * local56 + 8192 >> 14;
				local695 = local443[3] * local249 + local443[4] * local48 + local443[5] * local56 + 8192 >> 14;
				local700 = local443[6] * local249 + local443[7] * local48 + local443[8] * local56 + 8192 >> 14;
				local690 += local675;
				local695 += local680;
				local700 += local685;
				local822 = new int[9];
				for (local824 = 0; local824 < 3; local824++) {
					for (local829 = 0; local829 < 3; local829++) {
						local834 = 0;
						for (local836 = 0; local836 < 3; local836++) {
							local834 += arg7[local824 * 3 + local836] * local688[local829 + local836 * 3];
						}
						local822[local824 * 3 + local829] = local834 + 8192 >> 14;
					}
				}
				local824 = arg7[0] * local690 + arg7[1] * local695 + arg7[2] * local700 + 8192 >> 14;
				local829 = arg7[3] * local690 + arg7[4] * local695 + arg7[5] * local700 + 8192 >> 14;
				local834 = arg7[6] * local690 + arg7[7] * local695 + arg7[8] * local700 + 8192 >> 14;
				local824 += local18;
				local829 += local29;
				local834 += local36;
				for (local836 = 0; local836 < local2; local836++) {
					local962 = arg1[local836];
					if (local962 < this.anIntArrayArray11.length) {
						@Pc(972) int[] local972 = this.anIntArrayArray11[local962];
						for (@Pc(974) int local974 = 0; local974 < local972.length; local974++) {
							@Pc(982) int local982 = local972[local974];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local982]) != 0) {
								@Pc(1024) int local1024 = local822[0] * this.anIntArray70[local982] + local822[1] * this.anIntArray71[local982] + local822[2] * this.anIntArray75[local982] + 8192 >> 14;
								@Pc(1055) int local1055 = local822[3] * this.anIntArray70[local982] + local822[4] * this.anIntArray71[local982] + local822[5] * this.anIntArray75[local982] + 8192 >> 14;
								@Pc(1086) int local1086 = local822[6] * this.anIntArray70[local982] + local822[7] * this.anIntArray71[local982] + local822[8] * this.anIntArray75[local982] + 8192 >> 14;
								@Pc(1090) int local1090 = local1024 + local824;
								@Pc(1094) int local1094 = local1055 + local829;
								@Pc(1098) int local1098 = local1086 + local834;
								this.anIntArray70[local982] = local1090;
								this.anIntArray71[local982] = local1094;
								this.anIntArray75[local982] = local1098;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2424) boolean local2424;
			@Pc(2520) Class378 local2520;
			@Pc(2525) Class360 local2525;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					local2424 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray12.length) {
							local46 = this.anIntArrayArray12[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								if (this.aShortArray33 == null || (arg6 & this.aShortArray33[local56]) != 0) {
									local366 = (this.aByteArray18[local56] & 0xFF) + arg2 * 8;
									if (local366 < 0) {
										local366 = 0;
									} else if (local366 > 255) {
										local366 = 255;
									}
									this.aByteArray18[local56] = (byte) local366;
								}
							}
							local2424 |= local46.length > 0;
						}
					}
					if (local2424) {
						if (this.aClass378Array1 != null) {
							for (local29 = 0; local29 < this.anInt781; local29++) {
								local2520 = this.aClass378Array1[local29];
								local2525 = this.aClass360Array1[local29];
								local2525.anInt4510 = local2525.anInt4510 & 0xFFFFFF | 255 - (this.aByteArray18[local2520.anInt4579] & 0xFF) << 24;
							}
						}
						this.method6982();
					}
				}
			} else if (arg0 != 7) {
				@Pc(2764) Class360 local2764;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray13.length) {
								local247 = this.anIntArrayArray13[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass360Array1[local247[local249]];
									local2764.anInt4508 += arg2;
									local2764.anInt4505 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray13.length) {
								local247 = this.anIntArrayArray13[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass360Array1[local247[local249]];
									local2764.anInt4509 = local2764.anInt4509 * arg2 >> 7;
									local2764.anInt4507 = local2764.anInt4507 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray13 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray13.length) {
							local247 = this.anIntArrayArray13[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2764 = this.aClass360Array1[local247[local249]];
								local2764.anInt4506 = local2764.anInt4506 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray12 != null) {
				local2424 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray12.length) {
						local46 = this.anIntArrayArray12[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							if (this.aShortArray33 == null || (arg6 & this.aShortArray33[local56]) != 0) {
								local366 = this.aShortArray31[local56] & 0xFFFF;
								local391 = local366 >> 10 & 0x3F;
								local416 = local366 >> 7 & 0x7;
								local455 = local366 & 0x7F;
								@Pc(2625) int local2625 = local391 + arg2 & 0x3F;
								local416 += arg3 / 4;
								if (local416 < 0) {
									local416 = 0;
								} else if (local416 > 7) {
									local416 = 7;
								}
								local455 += arg4;
								if (local455 < 0) {
									local455 = 0;
								} else if (local455 > 127) {
									local455 = 127;
								}
								this.aShortArray31[local56] = (short) (local2625 << 10 | local416 << 7 | local455);
							}
						}
						local2424 |= local46.length > 0;
					}
				}
				if (local2424) {
					if (this.aClass378Array1 != null) {
						for (local29 = 0; local29 < this.anInt781; local29++) {
							local2520 = this.aClass378Array1[local29];
							local2525 = this.aClass360Array1[local29];
							local2525.anInt4510 = local2525.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local2520.anInt4579] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method6982();
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local247 = this.anIntArrayArray11[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
							this.anIntArray70[local48] -= this.anInt786;
							this.anIntArray71[local48] -= this.anInt773;
							this.anIntArray75[local48] -= this.anInt788;
							this.anIntArray70[local48] = this.anIntArray70[local48] * arg2 >> 7;
							this.anIntArray71[local48] = this.anIntArray71[local48] * arg3 >> 7;
							this.anIntArray75[local48] = this.anIntArray75[local48] * arg4 >> 7;
							this.anIntArray70[local48] += this.anInt786;
							this.anIntArray71[local48] += this.anInt773;
							this.anIntArray75[local48] += this.anInt788;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local29 = arg7[10] << 4;
			local36 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local48 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (this.aBoolean160) {
				local366 = arg7[0] * this.anInt786 + arg7[3] * this.anInt773 + arg7[6] * this.anInt788 + 8192 >> 14;
				local391 = arg7[1] * this.anInt786 + arg7[4] * this.anInt773 + arg7[7] * this.anInt788 + 8192 >> 14;
				local416 = arg7[2] * this.anInt786 + arg7[5] * this.anInt773 + arg7[8] * this.anInt788 + 8192 >> 14;
				local366 += local249;
				local391 += local48;
				local416 += local56;
				this.anInt786 = local366;
				this.anInt773 = local391;
				this.anInt788 = local416;
				this.aBoolean160 = false;
			}
			local366 = arg2 << 15 >> 7;
			local391 = arg3 << 15 >> 7;
			local416 = arg4 << 15 >> 7;
			local455 = local366 * -this.anInt786 + 8192 >> 14;
			local459 = local391 * -this.anInt773 + 8192 >> 14;
			local463 = local416 * -this.anInt788 + 8192 >> 14;
			local467 = local455 + this.anInt786;
			local475 = local459 + this.anInt773;
			local483 = local463 + this.anInt788;
			@Pc(1838) int[] local1838 = new int[] { local366 * arg7[0] + 8192 >> 14, local366 * arg7[3] + 8192 >> 14, local366 * arg7[6] + 8192 >> 14, local391 * arg7[1] + 8192 >> 14, local391 * arg7[4] + 8192 >> 14, local391 * arg7[7] + 8192 >> 14, local416 * arg7[2] + 8192 >> 14, local416 * arg7[5] + 8192 >> 14, local416 * arg7[8] + 8192 >> 14 };
			local642 = local366 * local249 + 8192 >> 14;
			local670 = local391 * local48 + 8192 >> 14;
			local675 = local416 * local56 + 8192 >> 14;
			@Pc(1974) int local1974 = local642 + local467;
			@Pc(1978) int local1978 = local670 + local475;
			@Pc(1982) int local1982 = local675 + local483;
			@Pc(1985) int[] local1985 = new int[9];
			@Pc(1992) int local1992;
			for (local685 = 0; local685 < 3; local685++) {
				for (local1992 = 0; local1992 < 3; local1992++) {
					local690 = 0;
					for (local695 = 0; local695 < 3; local695++) {
						local690 += arg7[local685 * 3 + local695] * local1838[local1992 + local695 * 3];
					}
					local1985[local685 * 3 + local1992] = local690 + 8192 >> 14;
				}
			}
			local685 = arg7[0] * local1974 + arg7[1] * local1978 + arg7[2] * local1982 + 8192 >> 14;
			local1992 = arg7[3] * local1974 + arg7[4] * local1978 + arg7[5] * local1982 + 8192 >> 14;
			local690 = arg7[6] * local1974 + arg7[7] * local1978 + arg7[8] * local1982 + 8192 >> 14;
			local685 += local18;
			local1992 += local29;
			local690 += local36;
			for (local695 = 0; local695 < local2; local695++) {
				local700 = arg1[local695];
				if (local700 < this.anIntArrayArray11.length) {
					local822 = this.anIntArrayArray11[local700];
					for (local824 = 0; local824 < local822.length; local824++) {
						local829 = local822[local824];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local829]) != 0) {
							local834 = local1985[0] * this.anIntArray70[local829] + local1985[1] * this.anIntArray71[local829] + local1985[2] * this.anIntArray75[local829] + 8192 >> 14;
							local836 = local1985[3] * this.anIntArray70[local829] + local1985[4] * this.anIntArray71[local829] + local1985[5] * this.anIntArray75[local829] + 8192 >> 14;
							local962 = local1985[6] * this.anIntArray70[local829] + local1985[7] * this.anIntArray71[local829] + local1985[8] * this.anIntArray75[local829] + 8192 >> 14;
							@Pc(2253) int local2253 = local834 + local685;
							@Pc(2257) int local2257 = local836 + local1992;
							@Pc(2261) int local2261 = local962 + local690;
							this.anIntArray70[local829] = local2253;
							this.anIntArray71[local829] = local2257;
							this.anIntArray75[local829] = local2261;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "al", descriptor = "(I[IIIIZI[I)V", line = 1650)
	@Override
	void method6846(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			this.anInt786 = 0;
			this.anInt773 = 0;
			this.anInt788 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray11.length) {
					local46 = this.anIntArrayArray11[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local56]) != 0) {
							this.anInt786 += this.anIntArray70[local56];
							this.anInt773 += this.anIntArray71[local56];
							this.anInt788 += this.anIntArray75[local56];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				this.anInt786 = this.anInt786 / local18 + arg2;
				this.anInt773 = this.anInt773 / local18 + arg3;
				this.anInt788 = this.anInt788 / local18 + arg4;
				this.aBoolean160 = true;
			} else {
				this.anInt786 = arg2;
				this.anInt773 = arg3;
				this.anInt788 = arg4;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local29 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local36 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local29;
				arg4 = local36;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local247 = this.anIntArrayArray11[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
							this.anIntArray70[local48] += arg2;
							this.anIntArray71[local48] += arg3;
							this.anIntArray75[local48] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(366) int local366;
		@Pc(391) int local391;
		@Pc(416) int local416;
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(475) int local475;
		@Pc(483) int local483;
		@Pc(642) int local642;
		@Pc(670) int local670;
		@Pc(675) int local675;
		@Pc(685) int local685;
		@Pc(690) int local690;
		@Pc(695) int local695;
		@Pc(700) int local700;
		@Pc(822) int[] local822;
		@Pc(824) int local824;
		@Pc(829) int local829;
		@Pc(834) int local834;
		@Pc(836) int local836;
		@Pc(962) int local962;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray11.length) {
						local247 = this.anIntArrayArray11[local29];
						for (local249 = 0; local249 < local247.length; local249++) {
							local48 = local247[local249];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
								this.anIntArray70[local48] -= this.anInt786;
								this.anIntArray71[local48] -= this.anInt773;
								this.anIntArray75[local48] -= this.anInt788;
								if (arg4 != 0) {
									local56 = Class436.anIntArray464[arg4];
									local366 = Class436.anIntArray463[arg4];
									local391 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local366 + 16383 >> 14;
									this.anIntArray71[local48] = this.anIntArray71[local48] * local366 - this.anIntArray70[local48] * local56 + 16383 >> 14;
									this.anIntArray70[local48] = local391;
								}
								if (arg2 != 0) {
									local56 = Class436.anIntArray464[arg2];
									local366 = Class436.anIntArray463[arg2];
									local391 = this.anIntArray71[local48] * local366 - this.anIntArray75[local48] * local56 + 16383 >> 14;
									this.anIntArray75[local48] = this.anIntArray71[local48] * local56 + this.anIntArray75[local48] * local366 + 16383 >> 14;
									this.anIntArray71[local48] = local391;
								}
								if (arg3 != 0) {
									local56 = Class436.anIntArray464[arg3];
									local366 = Class436.anIntArray463[arg3];
									local391 = this.anIntArray75[local48] * local56 + this.anIntArray70[local48] * local366 + 16383 >> 14;
									this.anIntArray75[local48] = this.anIntArray75[local48] * local366 - this.anIntArray70[local48] * local56 + 16383 >> 14;
									this.anIntArray70[local48] = local391;
								}
								this.anIntArray70[local48] += this.anInt786;
								this.anIntArray71[local48] += this.anInt773;
								this.anIntArray75[local48] += this.anInt788;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray11.length) {
							local247 = this.anIntArrayArray11[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local48 = local247[local249];
								if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
									local56 = this.anIntArray77[local48];
									local366 = this.anIntArray77[local48 + 1];
									for (local391 = local56; local391 < local366 && this.aShortArray37[local391] != 0; local391++) {
										local416 = (this.aShortArray37[local391] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local455 = Class436.anIntArray464[arg4];
											local459 = Class436.anIntArray463[arg4];
											local463 = this.aShortArray38[local416] * local455 + this.aShortArray30[local416] * local459 + 16383 >> 14;
											this.aShortArray38[local416] = (short) (this.aShortArray38[local416] * local459 - this.aShortArray30[local416] * local455 + 16383 >> 14);
											this.aShortArray30[local416] = (short) local463;
										}
										if (arg2 != 0) {
											local455 = Class436.anIntArray464[arg2];
											local459 = Class436.anIntArray463[arg2];
											local463 = this.aShortArray38[local416] * local459 - this.aShortArray39[local416] * local455 + 16383 >> 14;
											this.aShortArray39[local416] = (short) (this.aShortArray38[local416] * local455 + this.aShortArray39[local416] * local459 + 16383 >> 14);
											this.aShortArray38[local416] = (short) local463;
										}
										if (arg3 != 0) {
											local455 = Class436.anIntArray464[arg3];
											local459 = Class436.anIntArray463[arg3];
											local463 = this.aShortArray39[local416] * local455 + this.aShortArray30[local416] * local459 + 16383 >> 14;
											this.aShortArray39[local416] = (short) (this.aShortArray39[local416] * local459 - this.aShortArray30[local416] * local455 + 16383 >> 14);
											this.aShortArray30[local416] = (short) local463;
										}
									}
								}
							}
						}
					}
					this.method6983();
				}
			} else {
				local18 = arg7[9] << 4;
				local29 = arg7[10] << 4;
				local36 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local48 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (this.aBoolean160) {
					local366 = arg7[0] * this.anInt786 + arg7[3] * this.anInt773 + arg7[6] * this.anInt788 + 8192 >> 14;
					local391 = arg7[1] * this.anInt786 + arg7[4] * this.anInt773 + arg7[7] * this.anInt788 + 8192 >> 14;
					local416 = arg7[2] * this.anInt786 + arg7[5] * this.anInt773 + arg7[8] * this.anInt788 + 8192 >> 14;
					local366 += local249;
					local391 += local48;
					local416 += local56;
					this.anInt786 = local366;
					this.anInt773 = local391;
					this.anInt788 = local416;
					this.aBoolean160 = false;
				}
				@Pc(443) int[] local443 = new int[9];
				local391 = Class436.anIntArray463[arg2];
				local416 = Class436.anIntArray464[arg2];
				local455 = Class436.anIntArray463[arg3];
				local459 = Class436.anIntArray464[arg3];
				local463 = Class436.anIntArray463[arg4];
				local467 = Class436.anIntArray464[arg4];
				local475 = local416 * local463 + 8192 >> 14;
				local483 = local416 * local467 + 8192 >> 14;
				local443[0] = local455 * local463 + local459 * local483 + 8192 >> 14;
				local443[1] = -local455 * local467 + local459 * local475 + 8192 >> 14;
				local443[2] = local459 * local391 + 8192 >> 14;
				local443[3] = local391 * local467 + 8192 >> 14;
				local443[4] = local391 * local463 + 8192 >> 14;
				local443[5] = -local416;
				local443[6] = -local459 * local463 + local455 * local483 + 8192 >> 14;
				local443[7] = local459 * local467 + local455 * local475 + 8192 >> 14;
				local443[8] = local455 * local391 + 8192 >> 14;
				@Pc(614) int local614 = local443[0] * -this.anInt786 + local443[1] * -this.anInt773 + local443[2] * -this.anInt788 + 8192 >> 14;
				local642 = local443[3] * -this.anInt786 + local443[4] * -this.anInt773 + local443[5] * -this.anInt788 + 8192 >> 14;
				local670 = local443[6] * -this.anInt786 + local443[7] * -this.anInt773 + local443[8] * -this.anInt788 + 8192 >> 14;
				local675 = local614 + this.anInt786;
				@Pc(680) int local680 = local642 + this.anInt773;
				local685 = local670 + this.anInt788;
				@Pc(688) int[] local688 = new int[9];
				for (local690 = 0; local690 < 3; local690++) {
					for (local695 = 0; local695 < 3; local695++) {
						local700 = 0;
						for (@Pc(702) int local702 = 0; local702 < 3; local702++) {
							local700 += local443[local690 * 3 + local702] * arg7[local695 * 3 + local702];
						}
						local688[local690 * 3 + local695] = local700 + 8192 >> 14;
					}
				}
				local690 = local443[0] * local249 + local443[1] * local48 + local443[2] * local56 + 8192 >> 14;
				local695 = local443[3] * local249 + local443[4] * local48 + local443[5] * local56 + 8192 >> 14;
				local700 = local443[6] * local249 + local443[7] * local48 + local443[8] * local56 + 8192 >> 14;
				local690 += local675;
				local695 += local680;
				local700 += local685;
				local822 = new int[9];
				for (local824 = 0; local824 < 3; local824++) {
					for (local829 = 0; local829 < 3; local829++) {
						local834 = 0;
						for (local836 = 0; local836 < 3; local836++) {
							local834 += arg7[local824 * 3 + local836] * local688[local829 + local836 * 3];
						}
						local822[local824 * 3 + local829] = local834 + 8192 >> 14;
					}
				}
				local824 = arg7[0] * local690 + arg7[1] * local695 + arg7[2] * local700 + 8192 >> 14;
				local829 = arg7[3] * local690 + arg7[4] * local695 + arg7[5] * local700 + 8192 >> 14;
				local834 = arg7[6] * local690 + arg7[7] * local695 + arg7[8] * local700 + 8192 >> 14;
				local824 += local18;
				local829 += local29;
				local834 += local36;
				for (local836 = 0; local836 < local2; local836++) {
					local962 = arg1[local836];
					if (local962 < this.anIntArrayArray11.length) {
						@Pc(972) int[] local972 = this.anIntArrayArray11[local962];
						for (@Pc(974) int local974 = 0; local974 < local972.length; local974++) {
							@Pc(982) int local982 = local972[local974];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local982]) != 0) {
								@Pc(1024) int local1024 = local822[0] * this.anIntArray70[local982] + local822[1] * this.anIntArray71[local982] + local822[2] * this.anIntArray75[local982] + 8192 >> 14;
								@Pc(1055) int local1055 = local822[3] * this.anIntArray70[local982] + local822[4] * this.anIntArray71[local982] + local822[5] * this.anIntArray75[local982] + 8192 >> 14;
								@Pc(1086) int local1086 = local822[6] * this.anIntArray70[local982] + local822[7] * this.anIntArray71[local982] + local822[8] * this.anIntArray75[local982] + 8192 >> 14;
								@Pc(1090) int local1090 = local1024 + local824;
								@Pc(1094) int local1094 = local1055 + local829;
								@Pc(1098) int local1098 = local1086 + local834;
								this.anIntArray70[local982] = local1090;
								this.anIntArray71[local982] = local1094;
								this.anIntArray75[local982] = local1098;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2424) boolean local2424;
			@Pc(2520) Class378 local2520;
			@Pc(2525) Class360 local2525;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					local2424 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray12.length) {
							local46 = this.anIntArrayArray12[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								if (this.aShortArray33 == null || (arg6 & this.aShortArray33[local56]) != 0) {
									local366 = (this.aByteArray18[local56] & 0xFF) + arg2 * 8;
									if (local366 < 0) {
										local366 = 0;
									} else if (local366 > 255) {
										local366 = 255;
									}
									this.aByteArray18[local56] = (byte) local366;
								}
							}
							local2424 |= local46.length > 0;
						}
					}
					if (local2424) {
						if (this.aClass378Array1 != null) {
							for (local29 = 0; local29 < this.anInt781; local29++) {
								local2520 = this.aClass378Array1[local29];
								local2525 = this.aClass360Array1[local29];
								local2525.anInt4510 = local2525.anInt4510 & 0xFFFFFF | 255 - (this.aByteArray18[local2520.anInt4579] & 0xFF) << 24;
							}
						}
						this.method6982();
					}
				}
			} else if (arg0 != 7) {
				@Pc(2764) Class360 local2764;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray13.length) {
								local247 = this.anIntArrayArray13[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass360Array1[local247[local249]];
									local2764.anInt4508 += arg2;
									local2764.anInt4505 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray13.length) {
								local247 = this.anIntArrayArray13[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass360Array1[local247[local249]];
									local2764.anInt4509 = local2764.anInt4509 * arg2 >> 7;
									local2764.anInt4507 = local2764.anInt4507 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray13 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray13.length) {
							local247 = this.anIntArrayArray13[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2764 = this.aClass360Array1[local247[local249]];
								local2764.anInt4506 = local2764.anInt4506 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray12 != null) {
				local2424 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray12.length) {
						local46 = this.anIntArrayArray12[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							if (this.aShortArray33 == null || (arg6 & this.aShortArray33[local56]) != 0) {
								local366 = this.aShortArray31[local56] & 0xFFFF;
								local391 = local366 >> 10 & 0x3F;
								local416 = local366 >> 7 & 0x7;
								local455 = local366 & 0x7F;
								@Pc(2625) int local2625 = local391 + arg2 & 0x3F;
								local416 += arg3 / 4;
								if (local416 < 0) {
									local416 = 0;
								} else if (local416 > 7) {
									local416 = 7;
								}
								local455 += arg4;
								if (local455 < 0) {
									local455 = 0;
								} else if (local455 > 127) {
									local455 = 127;
								}
								this.aShortArray31[local56] = (short) (local2625 << 10 | local416 << 7 | local455);
							}
						}
						local2424 |= local46.length > 0;
					}
				}
				if (local2424) {
					if (this.aClass378Array1 != null) {
						for (local29 = 0; local29 < this.anInt781; local29++) {
							local2520 = this.aClass378Array1[local29];
							local2525 = this.aClass360Array1[local29];
							local2525.anInt4510 = local2525.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local2520.anInt4579] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method6982();
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local247 = this.anIntArrayArray11[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local48]) != 0) {
							this.anIntArray70[local48] -= this.anInt786;
							this.anIntArray71[local48] -= this.anInt773;
							this.anIntArray75[local48] -= this.anInt788;
							this.anIntArray70[local48] = this.anIntArray70[local48] * arg2 >> 7;
							this.anIntArray71[local48] = this.anIntArray71[local48] * arg3 >> 7;
							this.anIntArray75[local48] = this.anIntArray75[local48] * arg4 >> 7;
							this.anIntArray70[local48] += this.anInt786;
							this.anIntArray71[local48] += this.anInt773;
							this.anIntArray75[local48] += this.anInt788;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local29 = arg7[10] << 4;
			local36 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local48 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (this.aBoolean160) {
				local366 = arg7[0] * this.anInt786 + arg7[3] * this.anInt773 + arg7[6] * this.anInt788 + 8192 >> 14;
				local391 = arg7[1] * this.anInt786 + arg7[4] * this.anInt773 + arg7[7] * this.anInt788 + 8192 >> 14;
				local416 = arg7[2] * this.anInt786 + arg7[5] * this.anInt773 + arg7[8] * this.anInt788 + 8192 >> 14;
				local366 += local249;
				local391 += local48;
				local416 += local56;
				this.anInt786 = local366;
				this.anInt773 = local391;
				this.anInt788 = local416;
				this.aBoolean160 = false;
			}
			local366 = arg2 << 15 >> 7;
			local391 = arg3 << 15 >> 7;
			local416 = arg4 << 15 >> 7;
			local455 = local366 * -this.anInt786 + 8192 >> 14;
			local459 = local391 * -this.anInt773 + 8192 >> 14;
			local463 = local416 * -this.anInt788 + 8192 >> 14;
			local467 = local455 + this.anInt786;
			local475 = local459 + this.anInt773;
			local483 = local463 + this.anInt788;
			@Pc(1838) int[] local1838 = new int[] { local366 * arg7[0] + 8192 >> 14, local366 * arg7[3] + 8192 >> 14, local366 * arg7[6] + 8192 >> 14, local391 * arg7[1] + 8192 >> 14, local391 * arg7[4] + 8192 >> 14, local391 * arg7[7] + 8192 >> 14, local416 * arg7[2] + 8192 >> 14, local416 * arg7[5] + 8192 >> 14, local416 * arg7[8] + 8192 >> 14 };
			local642 = local366 * local249 + 8192 >> 14;
			local670 = local391 * local48 + 8192 >> 14;
			local675 = local416 * local56 + 8192 >> 14;
			@Pc(1974) int local1974 = local642 + local467;
			@Pc(1978) int local1978 = local670 + local475;
			@Pc(1982) int local1982 = local675 + local483;
			@Pc(1985) int[] local1985 = new int[9];
			@Pc(1992) int local1992;
			for (local685 = 0; local685 < 3; local685++) {
				for (local1992 = 0; local1992 < 3; local1992++) {
					local690 = 0;
					for (local695 = 0; local695 < 3; local695++) {
						local690 += arg7[local685 * 3 + local695] * local1838[local1992 + local695 * 3];
					}
					local1985[local685 * 3 + local1992] = local690 + 8192 >> 14;
				}
			}
			local685 = arg7[0] * local1974 + arg7[1] * local1978 + arg7[2] * local1982 + 8192 >> 14;
			local1992 = arg7[3] * local1974 + arg7[4] * local1978 + arg7[5] * local1982 + 8192 >> 14;
			local690 = arg7[6] * local1974 + arg7[7] * local1978 + arg7[8] * local1982 + 8192 >> 14;
			local685 += local18;
			local1992 += local29;
			local690 += local36;
			for (local695 = 0; local695 < local2; local695++) {
				local700 = arg1[local695];
				if (local700 < this.anIntArrayArray11.length) {
					local822 = this.anIntArrayArray11[local700];
					for (local824 = 0; local824 < local822.length; local824++) {
						local829 = local822[local824];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local829]) != 0) {
							local834 = local1985[0] * this.anIntArray70[local829] + local1985[1] * this.anIntArray71[local829] + local1985[2] * this.anIntArray75[local829] + 8192 >> 14;
							local836 = local1985[3] * this.anIntArray70[local829] + local1985[4] * this.anIntArray71[local829] + local1985[5] * this.anIntArray75[local829] + 8192 >> 14;
							local962 = local1985[6] * this.anIntArray70[local829] + local1985[7] * this.anIntArray71[local829] + local1985[8] * this.anIntArray75[local829] + 8192 >> 14;
							@Pc(2253) int local2253 = local834 + local685;
							@Pc(2257) int local2257 = local836 + local1992;
							@Pc(2261) int local2261 = local962 + local690;
							this.anIntArray70[local829] = local2253;
							this.anIntArray71[local829] = local2257;
							this.anIntArray75[local829] = local2261;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "cy", descriptor = "(IIII)V", line = 2114)
	@Override
	void method6878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(14) int local14;
		if (arg0 == 0) {
			local3 = 0;
			this.anInt786 = 0;
			this.anInt773 = 0;
			this.anInt788 = 0;
			for (local14 = 0; local14 < this.anInt771; local14++) {
				this.anInt786 += this.anIntArray70[local14];
				this.anInt773 += this.anIntArray71[local14];
				this.anInt788 += this.anIntArray75[local14];
				local3++;
			}
			if (local3 > 0) {
				this.anInt786 = this.anInt786 / local3 + arg1;
				this.anInt773 = this.anInt773 / local3 + arg2;
				this.anInt788 = this.anInt788 / local3 + arg3;
			} else {
				this.anInt786 = arg1;
				this.anInt773 = arg2;
				this.anInt788 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt771; local3++) {
				this.anIntArray70[local3] += arg1;
				this.anIntArray71[local3] += arg2;
				this.anIntArray75[local3] += arg3;
			}
		} else {
			@Pc(167) int local167;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt771; local3++) {
					this.anIntArray70[local3] -= this.anInt786;
					this.anIntArray71[local3] -= this.anInt773;
					this.anIntArray75[local3] -= this.anInt788;
					if (arg3 != 0) {
						local14 = Class436.anIntArray464[arg3];
						local167 = Class436.anIntArray463[arg3];
						local185 = this.anIntArray71[local3] * local14 + this.anIntArray70[local3] * local167 + 16383 >> 14;
						this.anIntArray71[local3] = this.anIntArray71[local3] * local167 - this.anIntArray70[local3] * local14 + 16383 >> 14;
						this.anIntArray70[local3] = local185;
					}
					if (arg1 != 0) {
						local14 = Class436.anIntArray464[arg1];
						local167 = Class436.anIntArray463[arg1];
						local185 = this.anIntArray71[local3] * local167 - this.anIntArray75[local3] * local14 + 16383 >> 14;
						this.anIntArray75[local3] = this.anIntArray71[local3] * local14 + this.anIntArray75[local3] * local167 + 16383 >> 14;
						this.anIntArray71[local3] = local185;
					}
					if (arg2 != 0) {
						local14 = Class436.anIntArray464[arg2];
						local167 = Class436.anIntArray463[arg2];
						local185 = this.anIntArray75[local3] * local14 + this.anIntArray70[local3] * local167 + 16383 >> 14;
						this.anIntArray75[local3] = this.anIntArray75[local3] * local167 - this.anIntArray70[local3] * local14 + 16383 >> 14;
						this.anIntArray70[local3] = local185;
					}
					this.anIntArray70[local3] += this.anInt786;
					this.anIntArray71[local3] += this.anInt773;
					this.anIntArray75[local3] += this.anInt788;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt771; local3++) {
					this.anIntArray70[local3] -= this.anInt786;
					this.anIntArray71[local3] -= this.anInt773;
					this.anIntArray75[local3] -= this.anInt788;
					this.anIntArray70[local3] = this.anIntArray70[local3] * arg1 / 128;
					this.anIntArray71[local3] = this.anIntArray71[local3] * arg2 / 128;
					this.anIntArray75[local3] = this.anIntArray75[local3] * arg3 / 128;
					this.anIntArray70[local3] += this.anInt786;
					this.anIntArray71[local3] += this.anInt773;
					this.anIntArray75[local3] += this.anInt788;
				}
			} else {
				@Pc(503) Class378 local503;
				@Pc(508) Class360 local508;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt774; local3++) {
						local14 = (this.aByteArray18[local3] & 0xFF) + arg1 * 8;
						if (local14 < 0) {
							local14 = 0;
						} else if (local14 > 255) {
							local14 = 255;
						}
						this.aByteArray18[local3] = (byte) local14;
					}
					if (this.aClass378Array1 != null) {
						for (local3 = 0; local3 < this.anInt781; local3++) {
							local503 = this.aClass378Array1[local3];
							local508 = this.aClass360Array1[local3];
							local508.anInt4510 = local508.anInt4510 & 0xFFFFFF | 255 - (this.aByteArray18[local503.anInt4579] & 0xFF) << 24;
						}
					}
					this.method6982();
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt774; local3++) {
						local14 = this.aShortArray31[local3] & 0xFFFF;
						local167 = local14 >> 10 & 0x3F;
						local185 = local14 >> 7 & 0x7;
						@Pc(563) int local563 = local14 & 0x7F;
						@Pc(569) int local569 = local167 + arg1 & 0x3F;
						local185 += arg2 / 4;
						if (local185 < 0) {
							local185 = 0;
						} else if (local185 > 7) {
							local185 = 7;
						}
						local563 += arg3;
						if (local563 < 0) {
							local563 = 0;
						} else if (local563 > 127) {
							local563 = 127;
						}
						this.aShortArray31[local3] = (short) (local569 << 10 | local185 << 7 | local563);
					}
					if (this.aClass378Array1 != null) {
						for (local3 = 0; local3 < this.anInt781; local3++) {
							local503 = this.aClass378Array1[local3];
							local508 = this.aClass360Array1[local3];
							local508.anInt4510 = local508.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local503.anInt4579] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method6982();
				} else {
					@Pc(671) Class360 local671;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt781; local3++) {
							local671 = this.aClass360Array1[local3];
							local671.anInt4508 += arg1;
							local671.anInt4505 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt781; local3++) {
							local671 = this.aClass360Array1[local3];
							local671.anInt4509 = local671.anInt4509 * arg1 >> 7;
							local671.anInt4507 = local671.anInt4507 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt781; local3++) {
							local671 = this.aClass360Array1[local3];
							local671.anInt4506 = local671.anInt4506 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "ao", descriptor = "(IIII)V", line = 2114)
	@Override
	void method6908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(14) int local14;
		if (arg0 == 0) {
			local3 = 0;
			this.anInt786 = 0;
			this.anInt773 = 0;
			this.anInt788 = 0;
			for (local14 = 0; local14 < this.anInt771; local14++) {
				this.anInt786 += this.anIntArray70[local14];
				this.anInt773 += this.anIntArray71[local14];
				this.anInt788 += this.anIntArray75[local14];
				local3++;
			}
			if (local3 > 0) {
				this.anInt786 = this.anInt786 / local3 + arg1;
				this.anInt773 = this.anInt773 / local3 + arg2;
				this.anInt788 = this.anInt788 / local3 + arg3;
			} else {
				this.anInt786 = arg1;
				this.anInt773 = arg2;
				this.anInt788 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt771; local3++) {
				this.anIntArray70[local3] += arg1;
				this.anIntArray71[local3] += arg2;
				this.anIntArray75[local3] += arg3;
			}
		} else {
			@Pc(167) int local167;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt771; local3++) {
					this.anIntArray70[local3] -= this.anInt786;
					this.anIntArray71[local3] -= this.anInt773;
					this.anIntArray75[local3] -= this.anInt788;
					if (arg3 != 0) {
						local14 = Class436.anIntArray464[arg3];
						local167 = Class436.anIntArray463[arg3];
						local185 = this.anIntArray71[local3] * local14 + this.anIntArray70[local3] * local167 + 16383 >> 14;
						this.anIntArray71[local3] = this.anIntArray71[local3] * local167 - this.anIntArray70[local3] * local14 + 16383 >> 14;
						this.anIntArray70[local3] = local185;
					}
					if (arg1 != 0) {
						local14 = Class436.anIntArray464[arg1];
						local167 = Class436.anIntArray463[arg1];
						local185 = this.anIntArray71[local3] * local167 - this.anIntArray75[local3] * local14 + 16383 >> 14;
						this.anIntArray75[local3] = this.anIntArray71[local3] * local14 + this.anIntArray75[local3] * local167 + 16383 >> 14;
						this.anIntArray71[local3] = local185;
					}
					if (arg2 != 0) {
						local14 = Class436.anIntArray464[arg2];
						local167 = Class436.anIntArray463[arg2];
						local185 = this.anIntArray75[local3] * local14 + this.anIntArray70[local3] * local167 + 16383 >> 14;
						this.anIntArray75[local3] = this.anIntArray75[local3] * local167 - this.anIntArray70[local3] * local14 + 16383 >> 14;
						this.anIntArray70[local3] = local185;
					}
					this.anIntArray70[local3] += this.anInt786;
					this.anIntArray71[local3] += this.anInt773;
					this.anIntArray75[local3] += this.anInt788;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt771; local3++) {
					this.anIntArray70[local3] -= this.anInt786;
					this.anIntArray71[local3] -= this.anInt773;
					this.anIntArray75[local3] -= this.anInt788;
					this.anIntArray70[local3] = this.anIntArray70[local3] * arg1 / 128;
					this.anIntArray71[local3] = this.anIntArray71[local3] * arg2 / 128;
					this.anIntArray75[local3] = this.anIntArray75[local3] * arg3 / 128;
					this.anIntArray70[local3] += this.anInt786;
					this.anIntArray71[local3] += this.anInt773;
					this.anIntArray75[local3] += this.anInt788;
				}
			} else {
				@Pc(503) Class378 local503;
				@Pc(508) Class360 local508;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt774; local3++) {
						local14 = (this.aByteArray18[local3] & 0xFF) + arg1 * 8;
						if (local14 < 0) {
							local14 = 0;
						} else if (local14 > 255) {
							local14 = 255;
						}
						this.aByteArray18[local3] = (byte) local14;
					}
					if (this.aClass378Array1 != null) {
						for (local3 = 0; local3 < this.anInt781; local3++) {
							local503 = this.aClass378Array1[local3];
							local508 = this.aClass360Array1[local3];
							local508.anInt4510 = local508.anInt4510 & 0xFFFFFF | 255 - (this.aByteArray18[local503.anInt4579] & 0xFF) << 24;
						}
					}
					this.method6982();
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt774; local3++) {
						local14 = this.aShortArray31[local3] & 0xFFFF;
						local167 = local14 >> 10 & 0x3F;
						local185 = local14 >> 7 & 0x7;
						@Pc(563) int local563 = local14 & 0x7F;
						@Pc(569) int local569 = local167 + arg1 & 0x3F;
						local185 += arg2 / 4;
						if (local185 < 0) {
							local185 = 0;
						} else if (local185 > 7) {
							local185 = 7;
						}
						local563 += arg3;
						if (local563 < 0) {
							local563 = 0;
						} else if (local563 > 127) {
							local563 = 127;
						}
						this.aShortArray31[local3] = (short) (local569 << 10 | local185 << 7 | local563);
					}
					if (this.aClass378Array1 != null) {
						for (local3 = 0; local3 < this.anInt781; local3++) {
							local503 = this.aClass378Array1[local3];
							local508 = this.aClass360Array1[local3];
							local508.anInt4510 = local508.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local503.anInt4579] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method6982();
				} else {
					@Pc(671) Class360 local671;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt781; local3++) {
							local671 = this.aClass360Array1[local3];
							local671.anInt4508 += arg1;
							local671.anInt4505 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt781; local3++) {
							local671 = this.aClass360Array1[local3];
							local671.anInt4509 = local671.anInt4509 * arg1 >> 7;
							local671.anInt4507 = local671.anInt4507 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt781; local3++) {
							local671 = this.aClass360Array1[local3];
							local671.anInt4506 = local671.anInt4506 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "ag", descriptor = "(I[IIIIIZ)V", line = 2259)
	@Override
	void method6812(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			this.anInt786 = 0;
			this.anInt773 = 0;
			this.anInt788 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray11.length) {
					local46 = this.anIntArrayArray11[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						this.anInt786 += this.anIntArray70[local56];
						this.anInt773 += this.anIntArray71[local56];
						this.anInt788 += this.anIntArray75[local56];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				this.anInt786 = this.anInt786 / local18 + local8;
				this.anInt773 = this.anInt773 / local18 + local12;
				this.anInt788 = this.anInt788 / local18 + local16;
			} else {
				this.anInt786 = local8;
				this.anInt773 = local12;
				this.anInt788 = local16;
			}
			return;
		}
		@Pc(159) int[] local159;
		@Pc(161) int local161;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local159 = this.anIntArrayArray11[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray70[local48] += local8;
						this.anIntArray71[local48] += local12;
						this.anIntArray75[local48] += local16;
					}
				}
			}
			return;
		}
		@Pc(271) int local271;
		@Pc(289) int local289;
		@Pc(746) int local746;
		@Pc(752) int local752;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local159 = this.anIntArrayArray11[local29];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray70[local48] -= this.anInt786;
							this.anIntArray71[local48] -= this.anInt773;
							this.anIntArray75[local48] -= this.anInt788;
							if (arg4 != 0) {
								local56 = Class436.anIntArray464[arg4];
								local271 = Class436.anIntArray463[arg4];
								local289 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray71[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							if (arg2 != 0) {
								local56 = Class436.anIntArray464[arg2];
								local271 = Class436.anIntArray463[arg2];
								local289 = this.anIntArray71[local48] * local271 - this.anIntArray75[local48] * local56 + 16383 >> 14;
								this.anIntArray75[local48] = this.anIntArray71[local48] * local56 + this.anIntArray75[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class436.anIntArray464[arg3];
								local271 = Class436.anIntArray463[arg3];
								local289 = this.anIntArray75[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray75[local48] = this.anIntArray75[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							this.anIntArray70[local48] += this.anInt786;
							this.anIntArray71[local48] += this.anInt773;
							this.anIntArray75[local48] += this.anInt788;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray70[local48] -= this.anInt786;
							this.anIntArray71[local48] -= this.anInt773;
							this.anIntArray75[local48] -= this.anInt788;
							if (arg2 != 0) {
								local56 = Class436.anIntArray464[arg2];
								local271 = Class436.anIntArray463[arg2];
								local289 = this.anIntArray71[local48] * local271 - this.anIntArray75[local48] * local56 + 16383 >> 14;
								this.anIntArray75[local48] = this.anIntArray71[local48] * local56 + this.anIntArray75[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = local289;
							}
							if (arg4 != 0) {
								local56 = Class436.anIntArray464[arg4];
								local271 = Class436.anIntArray463[arg4];
								local289 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray71[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class436.anIntArray464[arg3];
								local271 = Class436.anIntArray463[arg3];
								local289 = this.anIntArray75[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray75[local48] = this.anIntArray75[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							this.anIntArray70[local48] += this.anInt786;
							this.anIntArray71[local48] += this.anInt773;
							this.anIntArray75[local48] += this.anInt788;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray11.length) {
						local159 = this.anIntArrayArray11[local29];
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							local56 = this.anIntArray77[local48];
							local271 = this.anIntArray77[local48 + 1];
							for (local289 = local56; local289 < local271 && this.aShortArray37[local289] != 0; local289++) {
								local746 = (this.aShortArray37[local289] & 0xFFFF) - 1;
								@Pc(756) int local756;
								@Pc(774) int local774;
								if (arg4 != 0) {
									local752 = Class436.anIntArray464[arg4];
									local756 = Class436.anIntArray463[arg4];
									local774 = this.aShortArray38[local746] * local752 + this.aShortArray30[local746] * local756 + 16383 >> 14;
									this.aShortArray38[local746] = (short) (this.aShortArray38[local746] * local756 - this.aShortArray30[local746] * local752 + 16383 >> 14);
									this.aShortArray30[local746] = (short) local774;
								}
								if (arg2 != 0) {
									local752 = Class436.anIntArray464[arg2];
									local756 = Class436.anIntArray463[arg2];
									local774 = this.aShortArray38[local746] * local756 - this.aShortArray39[local746] * local752 + 16383 >> 14;
									this.aShortArray39[local746] = (short) (this.aShortArray38[local746] * local752 + this.aShortArray39[local746] * local756 + 16383 >> 14);
									this.aShortArray38[local746] = (short) local774;
								}
								if (arg3 != 0) {
									local752 = Class436.anIntArray464[arg3];
									local756 = Class436.anIntArray463[arg3];
									local774 = this.aShortArray39[local746] * local752 + this.aShortArray30[local746] * local756 + 16383 >> 14;
									this.aShortArray39[local746] = (short) (this.aShortArray39[local746] * local756 - this.aShortArray30[local746] * local752 + 16383 >> 14);
									this.aShortArray30[local746] = (short) local774;
								}
							}
						}
					}
				}
				this.method6983();
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local159 = this.anIntArrayArray11[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray70[local48] -= this.anInt786;
						this.anIntArray71[local48] -= this.anInt773;
						this.anIntArray75[local48] -= this.anInt788;
						this.anIntArray70[local48] = this.anIntArray70[local48] * arg2 >> 7;
						this.anIntArray71[local48] = this.anIntArray71[local48] * arg3 >> 7;
						this.anIntArray75[local48] = this.anIntArray75[local48] * arg4 >> 7;
						this.anIntArray70[local48] += this.anInt786;
						this.anIntArray71[local48] += this.anInt773;
						this.anIntArray75[local48] += this.anInt788;
					}
				}
			}
		} else {
			@Pc(1058) boolean local1058;
			@Pc(1143) Class378 local1143;
			@Pc(1148) Class360 local1148;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					local1058 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray12.length) {
							local46 = this.anIntArrayArray12[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								local271 = (this.aByteArray18[local56] & 0xFF) + arg2 * 8;
								if (local271 < 0) {
									local271 = 0;
								} else if (local271 > 255) {
									local271 = 255;
								}
								this.aByteArray18[local56] = (byte) local271;
							}
							local1058 |= local46.length > 0;
						}
					}
					if (local1058) {
						if (this.aClass378Array1 != null) {
							for (local29 = 0; local29 < this.anInt781; local29++) {
								local1143 = this.aClass378Array1[local29];
								local1148 = this.aClass360Array1[local29];
								local1148.anInt4510 = local1148.anInt4510 & 0xFFFFFF | 255 - (this.aByteArray18[local1143.anInt4579] & 0xFF) << 24;
							}
						}
						this.method6982();
					}
				}
			} else if (arg0 != 7) {
				@Pc(1376) Class360 local1376;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray13.length) {
								local159 = this.anIntArrayArray13[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass360Array1[local159[local161]];
									local1376.anInt4508 += arg2;
									local1376.anInt4505 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray13.length) {
								local159 = this.anIntArrayArray13[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass360Array1[local159[local161]];
									local1376.anInt4509 = local1376.anInt4509 * arg2 >> 7;
									local1376.anInt4507 = local1376.anInt4507 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray13 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray13.length) {
							local159 = this.anIntArrayArray13[local29];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1376 = this.aClass360Array1[local159[local161]];
								local1376.anInt4506 = local1376.anInt4506 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray12 != null) {
				local1058 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray12.length) {
						local46 = this.anIntArrayArray12[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							local271 = this.aShortArray31[local56] & 0xFFFF;
							local289 = local271 >> 10 & 0x3F;
							local746 = local271 >> 7 & 0x7;
							local752 = local271 & 0x7F;
							@Pc(1237) int local1237 = local289 + arg2 & 0x3F;
							local746 += arg3 / 4;
							if (local746 < 0) {
								local746 = 0;
							} else if (local746 > 7) {
								local746 = 7;
							}
							local752 += arg4;
							if (local752 < 0) {
								local752 = 0;
							} else if (local752 > 127) {
								local752 = 127;
							}
							this.aShortArray31[local56] = (short) (local1237 << 10 | local746 << 7 | local752);
						}
						local1058 |= local46.length > 0;
					}
				}
				if (local1058) {
					if (this.aClass378Array1 != null) {
						for (local29 = 0; local29 < this.anInt781; local29++) {
							local1143 = this.aClass378Array1[local29];
							local1148 = this.aClass360Array1[local29];
							local1148.anInt4510 = local1148.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local1143.anInt4579] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method6982();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "cu", descriptor = "(I[IIIIIZ)V", line = 2259)
	@Override
	void method6810(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			this.anInt786 = 0;
			this.anInt773 = 0;
			this.anInt788 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray11.length) {
					local46 = this.anIntArrayArray11[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						this.anInt786 += this.anIntArray70[local56];
						this.anInt773 += this.anIntArray71[local56];
						this.anInt788 += this.anIntArray75[local56];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				this.anInt786 = this.anInt786 / local18 + local8;
				this.anInt773 = this.anInt773 / local18 + local12;
				this.anInt788 = this.anInt788 / local18 + local16;
			} else {
				this.anInt786 = local8;
				this.anInt773 = local12;
				this.anInt788 = local16;
			}
			return;
		}
		@Pc(159) int[] local159;
		@Pc(161) int local161;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local159 = this.anIntArrayArray11[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray70[local48] += local8;
						this.anIntArray71[local48] += local12;
						this.anIntArray75[local48] += local16;
					}
				}
			}
			return;
		}
		@Pc(271) int local271;
		@Pc(289) int local289;
		@Pc(746) int local746;
		@Pc(752) int local752;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local159 = this.anIntArrayArray11[local29];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray70[local48] -= this.anInt786;
							this.anIntArray71[local48] -= this.anInt773;
							this.anIntArray75[local48] -= this.anInt788;
							if (arg4 != 0) {
								local56 = Class436.anIntArray464[arg4];
								local271 = Class436.anIntArray463[arg4];
								local289 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray71[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							if (arg2 != 0) {
								local56 = Class436.anIntArray464[arg2];
								local271 = Class436.anIntArray463[arg2];
								local289 = this.anIntArray71[local48] * local271 - this.anIntArray75[local48] * local56 + 16383 >> 14;
								this.anIntArray75[local48] = this.anIntArray71[local48] * local56 + this.anIntArray75[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class436.anIntArray464[arg3];
								local271 = Class436.anIntArray463[arg3];
								local289 = this.anIntArray75[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray75[local48] = this.anIntArray75[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							this.anIntArray70[local48] += this.anInt786;
							this.anIntArray71[local48] += this.anInt773;
							this.anIntArray75[local48] += this.anInt788;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray70[local48] -= this.anInt786;
							this.anIntArray71[local48] -= this.anInt773;
							this.anIntArray75[local48] -= this.anInt788;
							if (arg2 != 0) {
								local56 = Class436.anIntArray464[arg2];
								local271 = Class436.anIntArray463[arg2];
								local289 = this.anIntArray71[local48] * local271 - this.anIntArray75[local48] * local56 + 16383 >> 14;
								this.anIntArray75[local48] = this.anIntArray71[local48] * local56 + this.anIntArray75[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = local289;
							}
							if (arg4 != 0) {
								local56 = Class436.anIntArray464[arg4];
								local271 = Class436.anIntArray463[arg4];
								local289 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray71[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class436.anIntArray464[arg3];
								local271 = Class436.anIntArray463[arg3];
								local289 = this.anIntArray75[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray75[local48] = this.anIntArray75[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							this.anIntArray70[local48] += this.anInt786;
							this.anIntArray71[local48] += this.anInt773;
							this.anIntArray75[local48] += this.anInt788;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray11.length) {
						local159 = this.anIntArrayArray11[local29];
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							local56 = this.anIntArray77[local48];
							local271 = this.anIntArray77[local48 + 1];
							for (local289 = local56; local289 < local271 && this.aShortArray37[local289] != 0; local289++) {
								local746 = (this.aShortArray37[local289] & 0xFFFF) - 1;
								@Pc(756) int local756;
								@Pc(774) int local774;
								if (arg4 != 0) {
									local752 = Class436.anIntArray464[arg4];
									local756 = Class436.anIntArray463[arg4];
									local774 = this.aShortArray38[local746] * local752 + this.aShortArray30[local746] * local756 + 16383 >> 14;
									this.aShortArray38[local746] = (short) (this.aShortArray38[local746] * local756 - this.aShortArray30[local746] * local752 + 16383 >> 14);
									this.aShortArray30[local746] = (short) local774;
								}
								if (arg2 != 0) {
									local752 = Class436.anIntArray464[arg2];
									local756 = Class436.anIntArray463[arg2];
									local774 = this.aShortArray38[local746] * local756 - this.aShortArray39[local746] * local752 + 16383 >> 14;
									this.aShortArray39[local746] = (short) (this.aShortArray38[local746] * local752 + this.aShortArray39[local746] * local756 + 16383 >> 14);
									this.aShortArray38[local746] = (short) local774;
								}
								if (arg3 != 0) {
									local752 = Class436.anIntArray464[arg3];
									local756 = Class436.anIntArray463[arg3];
									local774 = this.aShortArray39[local746] * local752 + this.aShortArray30[local746] * local756 + 16383 >> 14;
									this.aShortArray39[local746] = (short) (this.aShortArray39[local746] * local756 - this.aShortArray30[local746] * local752 + 16383 >> 14);
									this.aShortArray30[local746] = (short) local774;
								}
							}
						}
					}
				}
				this.method6983();
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local159 = this.anIntArrayArray11[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray70[local48] -= this.anInt786;
						this.anIntArray71[local48] -= this.anInt773;
						this.anIntArray75[local48] -= this.anInt788;
						this.anIntArray70[local48] = this.anIntArray70[local48] * arg2 >> 7;
						this.anIntArray71[local48] = this.anIntArray71[local48] * arg3 >> 7;
						this.anIntArray75[local48] = this.anIntArray75[local48] * arg4 >> 7;
						this.anIntArray70[local48] += this.anInt786;
						this.anIntArray71[local48] += this.anInt773;
						this.anIntArray75[local48] += this.anInt788;
					}
				}
			}
		} else {
			@Pc(1058) boolean local1058;
			@Pc(1143) Class378 local1143;
			@Pc(1148) Class360 local1148;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					local1058 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray12.length) {
							local46 = this.anIntArrayArray12[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								local271 = (this.aByteArray18[local56] & 0xFF) + arg2 * 8;
								if (local271 < 0) {
									local271 = 0;
								} else if (local271 > 255) {
									local271 = 255;
								}
								this.aByteArray18[local56] = (byte) local271;
							}
							local1058 |= local46.length > 0;
						}
					}
					if (local1058) {
						if (this.aClass378Array1 != null) {
							for (local29 = 0; local29 < this.anInt781; local29++) {
								local1143 = this.aClass378Array1[local29];
								local1148 = this.aClass360Array1[local29];
								local1148.anInt4510 = local1148.anInt4510 & 0xFFFFFF | 255 - (this.aByteArray18[local1143.anInt4579] & 0xFF) << 24;
							}
						}
						this.method6982();
					}
				}
			} else if (arg0 != 7) {
				@Pc(1376) Class360 local1376;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray13.length) {
								local159 = this.anIntArrayArray13[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass360Array1[local159[local161]];
									local1376.anInt4508 += arg2;
									local1376.anInt4505 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray13.length) {
								local159 = this.anIntArrayArray13[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass360Array1[local159[local161]];
									local1376.anInt4509 = local1376.anInt4509 * arg2 >> 7;
									local1376.anInt4507 = local1376.anInt4507 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray13 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray13.length) {
							local159 = this.anIntArrayArray13[local29];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1376 = this.aClass360Array1[local159[local161]];
								local1376.anInt4506 = local1376.anInt4506 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray12 != null) {
				local1058 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray12.length) {
						local46 = this.anIntArrayArray12[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							local271 = this.aShortArray31[local56] & 0xFFFF;
							local289 = local271 >> 10 & 0x3F;
							local746 = local271 >> 7 & 0x7;
							local752 = local271 & 0x7F;
							@Pc(1237) int local1237 = local289 + arg2 & 0x3F;
							local746 += arg3 / 4;
							if (local746 < 0) {
								local746 = 0;
							} else if (local746 > 7) {
								local746 = 7;
							}
							local752 += arg4;
							if (local752 < 0) {
								local752 = 0;
							} else if (local752 > 127) {
								local752 = 127;
							}
							this.aShortArray31[local56] = (short) (local1237 << 10 | local746 << 7 | local752);
						}
						local1058 |= local46.length > 0;
					}
				}
				if (local1058) {
					if (this.aClass378Array1 != null) {
						for (local29 = 0; local29 < this.anInt781; local29++) {
							local1143 = this.aClass378Array1[local29];
							local1148 = this.aClass360Array1[local29];
							local1148.anInt4510 = local1148.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local1143.anInt4579] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method6982();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "cm", descriptor = "(I[IIIIIZ)V", line = 2259)
	@Override
	void method6873(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			this.anInt786 = 0;
			this.anInt773 = 0;
			this.anInt788 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray11.length) {
					local46 = this.anIntArrayArray11[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						this.anInt786 += this.anIntArray70[local56];
						this.anInt773 += this.anIntArray71[local56];
						this.anInt788 += this.anIntArray75[local56];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				this.anInt786 = this.anInt786 / local18 + local8;
				this.anInt773 = this.anInt773 / local18 + local12;
				this.anInt788 = this.anInt788 / local18 + local16;
			} else {
				this.anInt786 = local8;
				this.anInt773 = local12;
				this.anInt788 = local16;
			}
			return;
		}
		@Pc(159) int[] local159;
		@Pc(161) int local161;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local159 = this.anIntArrayArray11[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray70[local48] += local8;
						this.anIntArray71[local48] += local12;
						this.anIntArray75[local48] += local16;
					}
				}
			}
			return;
		}
		@Pc(271) int local271;
		@Pc(289) int local289;
		@Pc(746) int local746;
		@Pc(752) int local752;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local159 = this.anIntArrayArray11[local29];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray70[local48] -= this.anInt786;
							this.anIntArray71[local48] -= this.anInt773;
							this.anIntArray75[local48] -= this.anInt788;
							if (arg4 != 0) {
								local56 = Class436.anIntArray464[arg4];
								local271 = Class436.anIntArray463[arg4];
								local289 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray71[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							if (arg2 != 0) {
								local56 = Class436.anIntArray464[arg2];
								local271 = Class436.anIntArray463[arg2];
								local289 = this.anIntArray71[local48] * local271 - this.anIntArray75[local48] * local56 + 16383 >> 14;
								this.anIntArray75[local48] = this.anIntArray71[local48] * local56 + this.anIntArray75[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class436.anIntArray464[arg3];
								local271 = Class436.anIntArray463[arg3];
								local289 = this.anIntArray75[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray75[local48] = this.anIntArray75[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							this.anIntArray70[local48] += this.anInt786;
							this.anIntArray71[local48] += this.anInt773;
							this.anIntArray75[local48] += this.anInt788;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray70[local48] -= this.anInt786;
							this.anIntArray71[local48] -= this.anInt773;
							this.anIntArray75[local48] -= this.anInt788;
							if (arg2 != 0) {
								local56 = Class436.anIntArray464[arg2];
								local271 = Class436.anIntArray463[arg2];
								local289 = this.anIntArray71[local48] * local271 - this.anIntArray75[local48] * local56 + 16383 >> 14;
								this.anIntArray75[local48] = this.anIntArray71[local48] * local56 + this.anIntArray75[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = local289;
							}
							if (arg4 != 0) {
								local56 = Class436.anIntArray464[arg4];
								local271 = Class436.anIntArray463[arg4];
								local289 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray71[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class436.anIntArray464[arg3];
								local271 = Class436.anIntArray463[arg3];
								local289 = this.anIntArray75[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray75[local48] = this.anIntArray75[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							this.anIntArray70[local48] += this.anInt786;
							this.anIntArray71[local48] += this.anInt773;
							this.anIntArray75[local48] += this.anInt788;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray11.length) {
						local159 = this.anIntArrayArray11[local29];
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							local56 = this.anIntArray77[local48];
							local271 = this.anIntArray77[local48 + 1];
							for (local289 = local56; local289 < local271 && this.aShortArray37[local289] != 0; local289++) {
								local746 = (this.aShortArray37[local289] & 0xFFFF) - 1;
								@Pc(756) int local756;
								@Pc(774) int local774;
								if (arg4 != 0) {
									local752 = Class436.anIntArray464[arg4];
									local756 = Class436.anIntArray463[arg4];
									local774 = this.aShortArray38[local746] * local752 + this.aShortArray30[local746] * local756 + 16383 >> 14;
									this.aShortArray38[local746] = (short) (this.aShortArray38[local746] * local756 - this.aShortArray30[local746] * local752 + 16383 >> 14);
									this.aShortArray30[local746] = (short) local774;
								}
								if (arg2 != 0) {
									local752 = Class436.anIntArray464[arg2];
									local756 = Class436.anIntArray463[arg2];
									local774 = this.aShortArray38[local746] * local756 - this.aShortArray39[local746] * local752 + 16383 >> 14;
									this.aShortArray39[local746] = (short) (this.aShortArray38[local746] * local752 + this.aShortArray39[local746] * local756 + 16383 >> 14);
									this.aShortArray38[local746] = (short) local774;
								}
								if (arg3 != 0) {
									local752 = Class436.anIntArray464[arg3];
									local756 = Class436.anIntArray463[arg3];
									local774 = this.aShortArray39[local746] * local752 + this.aShortArray30[local746] * local756 + 16383 >> 14;
									this.aShortArray39[local746] = (short) (this.aShortArray39[local746] * local756 - this.aShortArray30[local746] * local752 + 16383 >> 14);
									this.aShortArray30[local746] = (short) local774;
								}
							}
						}
					}
				}
				this.method6983();
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local159 = this.anIntArrayArray11[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray70[local48] -= this.anInt786;
						this.anIntArray71[local48] -= this.anInt773;
						this.anIntArray75[local48] -= this.anInt788;
						this.anIntArray70[local48] = this.anIntArray70[local48] * arg2 >> 7;
						this.anIntArray71[local48] = this.anIntArray71[local48] * arg3 >> 7;
						this.anIntArray75[local48] = this.anIntArray75[local48] * arg4 >> 7;
						this.anIntArray70[local48] += this.anInt786;
						this.anIntArray71[local48] += this.anInt773;
						this.anIntArray75[local48] += this.anInt788;
					}
				}
			}
		} else {
			@Pc(1058) boolean local1058;
			@Pc(1143) Class378 local1143;
			@Pc(1148) Class360 local1148;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					local1058 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray12.length) {
							local46 = this.anIntArrayArray12[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								local271 = (this.aByteArray18[local56] & 0xFF) + arg2 * 8;
								if (local271 < 0) {
									local271 = 0;
								} else if (local271 > 255) {
									local271 = 255;
								}
								this.aByteArray18[local56] = (byte) local271;
							}
							local1058 |= local46.length > 0;
						}
					}
					if (local1058) {
						if (this.aClass378Array1 != null) {
							for (local29 = 0; local29 < this.anInt781; local29++) {
								local1143 = this.aClass378Array1[local29];
								local1148 = this.aClass360Array1[local29];
								local1148.anInt4510 = local1148.anInt4510 & 0xFFFFFF | 255 - (this.aByteArray18[local1143.anInt4579] & 0xFF) << 24;
							}
						}
						this.method6982();
					}
				}
			} else if (arg0 != 7) {
				@Pc(1376) Class360 local1376;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray13.length) {
								local159 = this.anIntArrayArray13[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass360Array1[local159[local161]];
									local1376.anInt4508 += arg2;
									local1376.anInt4505 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray13.length) {
								local159 = this.anIntArrayArray13[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass360Array1[local159[local161]];
									local1376.anInt4509 = local1376.anInt4509 * arg2 >> 7;
									local1376.anInt4507 = local1376.anInt4507 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray13 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray13.length) {
							local159 = this.anIntArrayArray13[local29];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1376 = this.aClass360Array1[local159[local161]];
								local1376.anInt4506 = local1376.anInt4506 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray12 != null) {
				local1058 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray12.length) {
						local46 = this.anIntArrayArray12[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							local271 = this.aShortArray31[local56] & 0xFFFF;
							local289 = local271 >> 10 & 0x3F;
							local746 = local271 >> 7 & 0x7;
							local752 = local271 & 0x7F;
							@Pc(1237) int local1237 = local289 + arg2 & 0x3F;
							local746 += arg3 / 4;
							if (local746 < 0) {
								local746 = 0;
							} else if (local746 > 7) {
								local746 = 7;
							}
							local752 += arg4;
							if (local752 < 0) {
								local752 = 0;
							} else if (local752 > 127) {
								local752 = 127;
							}
							this.aShortArray31[local56] = (short) (local1237 << 10 | local746 << 7 | local752);
						}
						local1058 |= local46.length > 0;
					}
				}
				if (local1058) {
					if (this.aClass378Array1 != null) {
						for (local29 = 0; local29 < this.anInt781; local29++) {
							local1143 = this.aClass378Array1[local29];
							local1148 = this.aClass360Array1[local29];
							local1148.anInt4510 = local1148.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local1143.anInt4579] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method6982();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "ci", descriptor = "(I[IIIIIZ)V", line = 2259)
	@Override
	void method6874(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			this.anInt786 = 0;
			this.anInt773 = 0;
			this.anInt788 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray11.length) {
					local46 = this.anIntArrayArray11[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						this.anInt786 += this.anIntArray70[local56];
						this.anInt773 += this.anIntArray71[local56];
						this.anInt788 += this.anIntArray75[local56];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				this.anInt786 = this.anInt786 / local18 + local8;
				this.anInt773 = this.anInt773 / local18 + local12;
				this.anInt788 = this.anInt788 / local18 + local16;
			} else {
				this.anInt786 = local8;
				this.anInt773 = local12;
				this.anInt788 = local16;
			}
			return;
		}
		@Pc(159) int[] local159;
		@Pc(161) int local161;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local159 = this.anIntArrayArray11[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray70[local48] += local8;
						this.anIntArray71[local48] += local12;
						this.anIntArray75[local48] += local16;
					}
				}
			}
			return;
		}
		@Pc(271) int local271;
		@Pc(289) int local289;
		@Pc(746) int local746;
		@Pc(752) int local752;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local159 = this.anIntArrayArray11[local29];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray70[local48] -= this.anInt786;
							this.anIntArray71[local48] -= this.anInt773;
							this.anIntArray75[local48] -= this.anInt788;
							if (arg4 != 0) {
								local56 = Class436.anIntArray464[arg4];
								local271 = Class436.anIntArray463[arg4];
								local289 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray71[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							if (arg2 != 0) {
								local56 = Class436.anIntArray464[arg2];
								local271 = Class436.anIntArray463[arg2];
								local289 = this.anIntArray71[local48] * local271 - this.anIntArray75[local48] * local56 + 16383 >> 14;
								this.anIntArray75[local48] = this.anIntArray71[local48] * local56 + this.anIntArray75[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class436.anIntArray464[arg3];
								local271 = Class436.anIntArray463[arg3];
								local289 = this.anIntArray75[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray75[local48] = this.anIntArray75[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							this.anIntArray70[local48] += this.anInt786;
							this.anIntArray71[local48] += this.anInt773;
							this.anIntArray75[local48] += this.anInt788;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray70[local48] -= this.anInt786;
							this.anIntArray71[local48] -= this.anInt773;
							this.anIntArray75[local48] -= this.anInt788;
							if (arg2 != 0) {
								local56 = Class436.anIntArray464[arg2];
								local271 = Class436.anIntArray463[arg2];
								local289 = this.anIntArray71[local48] * local271 - this.anIntArray75[local48] * local56 + 16383 >> 14;
								this.anIntArray75[local48] = this.anIntArray71[local48] * local56 + this.anIntArray75[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = local289;
							}
							if (arg4 != 0) {
								local56 = Class436.anIntArray464[arg4];
								local271 = Class436.anIntArray463[arg4];
								local289 = this.anIntArray71[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray71[local48] = this.anIntArray71[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class436.anIntArray464[arg3];
								local271 = Class436.anIntArray463[arg3];
								local289 = this.anIntArray75[local48] * local56 + this.anIntArray70[local48] * local271 + 16383 >> 14;
								this.anIntArray75[local48] = this.anIntArray75[local48] * local271 - this.anIntArray70[local48] * local56 + 16383 >> 14;
								this.anIntArray70[local48] = local289;
							}
							this.anIntArray70[local48] += this.anInt786;
							this.anIntArray71[local48] += this.anInt773;
							this.anIntArray75[local48] += this.anInt788;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray11.length) {
						local159 = this.anIntArrayArray11[local29];
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							local56 = this.anIntArray77[local48];
							local271 = this.anIntArray77[local48 + 1];
							for (local289 = local56; local289 < local271 && this.aShortArray37[local289] != 0; local289++) {
								local746 = (this.aShortArray37[local289] & 0xFFFF) - 1;
								@Pc(756) int local756;
								@Pc(774) int local774;
								if (arg4 != 0) {
									local752 = Class436.anIntArray464[arg4];
									local756 = Class436.anIntArray463[arg4];
									local774 = this.aShortArray38[local746] * local752 + this.aShortArray30[local746] * local756 + 16383 >> 14;
									this.aShortArray38[local746] = (short) (this.aShortArray38[local746] * local756 - this.aShortArray30[local746] * local752 + 16383 >> 14);
									this.aShortArray30[local746] = (short) local774;
								}
								if (arg2 != 0) {
									local752 = Class436.anIntArray464[arg2];
									local756 = Class436.anIntArray463[arg2];
									local774 = this.aShortArray38[local746] * local756 - this.aShortArray39[local746] * local752 + 16383 >> 14;
									this.aShortArray39[local746] = (short) (this.aShortArray38[local746] * local752 + this.aShortArray39[local746] * local756 + 16383 >> 14);
									this.aShortArray38[local746] = (short) local774;
								}
								if (arg3 != 0) {
									local752 = Class436.anIntArray464[arg3];
									local756 = Class436.anIntArray463[arg3];
									local774 = this.aShortArray39[local746] * local752 + this.aShortArray30[local746] * local756 + 16383 >> 14;
									this.aShortArray39[local746] = (short) (this.aShortArray39[local746] * local756 - this.aShortArray30[local746] * local752 + 16383 >> 14);
									this.aShortArray30[local746] = (short) local774;
								}
							}
						}
					}
				}
				this.method6983();
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray11.length) {
					local159 = this.anIntArrayArray11[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray70[local48] -= this.anInt786;
						this.anIntArray71[local48] -= this.anInt773;
						this.anIntArray75[local48] -= this.anInt788;
						this.anIntArray70[local48] = this.anIntArray70[local48] * arg2 >> 7;
						this.anIntArray71[local48] = this.anIntArray71[local48] * arg3 >> 7;
						this.anIntArray75[local48] = this.anIntArray75[local48] * arg4 >> 7;
						this.anIntArray70[local48] += this.anInt786;
						this.anIntArray71[local48] += this.anInt773;
						this.anIntArray75[local48] += this.anInt788;
					}
				}
			}
		} else {
			@Pc(1058) boolean local1058;
			@Pc(1143) Class378 local1143;
			@Pc(1148) Class360 local1148;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					local1058 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray12.length) {
							local46 = this.anIntArrayArray12[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								local271 = (this.aByteArray18[local56] & 0xFF) + arg2 * 8;
								if (local271 < 0) {
									local271 = 0;
								} else if (local271 > 255) {
									local271 = 255;
								}
								this.aByteArray18[local56] = (byte) local271;
							}
							local1058 |= local46.length > 0;
						}
					}
					if (local1058) {
						if (this.aClass378Array1 != null) {
							for (local29 = 0; local29 < this.anInt781; local29++) {
								local1143 = this.aClass378Array1[local29];
								local1148 = this.aClass360Array1[local29];
								local1148.anInt4510 = local1148.anInt4510 & 0xFFFFFF | 255 - (this.aByteArray18[local1143.anInt4579] & 0xFF) << 24;
							}
						}
						this.method6982();
					}
				}
			} else if (arg0 != 7) {
				@Pc(1376) Class360 local1376;
				if (arg0 == 8) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray13.length) {
								local159 = this.anIntArrayArray13[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass360Array1[local159[local161]];
									local1376.anInt4508 += arg2;
									local1376.anInt4505 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray13 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray13.length) {
								local159 = this.anIntArrayArray13[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass360Array1[local159[local161]];
									local1376.anInt4509 = local1376.anInt4509 * arg2 >> 7;
									local1376.anInt4507 = local1376.anInt4507 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray13 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray13.length) {
							local159 = this.anIntArrayArray13[local29];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1376 = this.aClass360Array1[local159[local161]];
								local1376.anInt4506 = local1376.anInt4506 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray12 != null) {
				local1058 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray12.length) {
						local46 = this.anIntArrayArray12[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							local271 = this.aShortArray31[local56] & 0xFFFF;
							local289 = local271 >> 10 & 0x3F;
							local746 = local271 >> 7 & 0x7;
							local752 = local271 & 0x7F;
							@Pc(1237) int local1237 = local289 + arg2 & 0x3F;
							local746 += arg3 / 4;
							if (local746 < 0) {
								local746 = 0;
							} else if (local746 > 7) {
								local746 = 7;
							}
							local752 += arg4;
							if (local752 < 0) {
								local752 = 0;
							} else if (local752 > 127) {
								local752 = 127;
							}
							this.aShortArray31[local56] = (short) (local1237 << 10 | local746 << 7 | local752);
						}
						local1058 |= local46.length > 0;
					}
				}
				if (local1058) {
					if (this.aClass378Array1 != null) {
						for (local29 = 0; local29 < this.anInt781; local29++) {
							local1143 = this.aClass378Array1[local29];
							local1148 = this.aClass360Array1[local29];
							local1148.anInt4510 = local1148.anInt4510 & 0xFF000000 | Class656.anIntArray532[this.aShortArray31[local1143.anInt4579] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method6982();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "cx", descriptor = "()V", line = 2562)
	@Override
	void method6932() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt770; local1++) {
			this.anIntArray70[local1] = this.anIntArray70[local1] + 7 >> 4;
			this.anIntArray71[local1] = this.anIntArray71[local1] + 7 >> 4;
			this.anIntArray75[local1] = this.anIntArray75[local1] + 7 >> 4;
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "ct", descriptor = "()V", line = 2562)
	@Override
	void method6880() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt770; local1++) {
			this.anIntArray70[local1] = this.anIntArray70[local1] + 7 >> 4;
			this.anIntArray71[local1] = this.anIntArray71[local1] + 7 >> 4;
			this.anIntArray75[local1] = this.anIntArray75[local1] + 7 >> 4;
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "cv", descriptor = "()V", line = 2562)
	@Override
	void method6815() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt770; local1++) {
			this.anIntArray70[local1] = this.anIntArray70[local1] + 7 >> 4;
			this.anIntArray71[local1] = this.anIntArray71[local1] + 7 >> 4;
			this.anIntArray75[local1] = this.anIntArray75[local1] + 7 >> 4;
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "ak", descriptor = "()V", line = 2562)
	@Override
	void method6881() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt770; local1++) {
			this.anIntArray70[local1] = this.anIntArray70[local1] + 7 >> 4;
			this.anIntArray71[local1] = this.anIntArray71[local1] + 7 >> 4;
			this.anIntArray75[local1] = this.anIntArray75[local1] + 7 >> 4;
		}
		this.method6980();
		this.aBoolean158 = false;
	}

	@OriginalMember(owner = "client!aey", name = "cs", descriptor = "(Lclient!ow;IZ)V", line = 2572)
	@Override
	public void method6879(@OriginalArg(0) Class455 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray28 == null) {
			return;
		}
		@Pc(5) Class455 local5 = arg0;
		if (arg2) {
			local5 = this.aClass86_Sub1_4.aClass455_38;
			local5.method29405(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt771; local19++) {
			if ((arg1 & this.aShortArray28[local19]) != 0) {
				local5.method29442((float) this.anIntArray70[local19], (float) this.anIntArray71[local19], (float) this.anIntArray75[local19], local17);
				this.anIntArray70[local19] = (int) local17[0];
				this.anIntArray71[local19] = (int) local17[1];
				this.anIntArray75[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "cd", descriptor = "(Lclient!ow;IZ)V", line = 2572)
	@Override
	public void method6905(@OriginalArg(0) Class455 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray28 == null) {
			return;
		}
		@Pc(5) Class455 local5 = arg0;
		if (arg2) {
			local5 = this.aClass86_Sub1_4.aClass455_38;
			local5.method29405(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt771; local19++) {
			if ((arg1 & this.aShortArray28[local19]) != 0) {
				local5.method29442((float) this.anIntArray70[local19], (float) this.anIntArray71[local19], (float) this.anIntArray75[local19], local17);
				this.anIntArray70[local19] = (int) local17[0];
				this.anIntArray71[local19] = (int) local17[1];
				this.anIntArray75[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "au", descriptor = "(Lclient!ow;IZ)V", line = 2572)
	@Override
	public void method6816(@OriginalArg(0) Class455 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray28 == null) {
			return;
		}
		@Pc(5) Class455 local5 = arg0;
		if (arg2) {
			local5 = this.aClass86_Sub1_4.aClass455_38;
			local5.method29405(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt771; local19++) {
			if ((arg1 & this.aShortArray28[local19]) != 0) {
				local5.method29442((float) this.anIntArray70[local19], (float) this.anIntArray71[local19], (float) this.anIntArray75[local19], local17);
				this.anIntArray70[local19] = (int) local17[0];
				this.anIntArray71[local19] = (int) local17[1];
				this.anIntArray75[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "bx", descriptor = "()[Lclient!cs;", line = 2589)
	@Override
	public Class195[] method6843() {
		return this.aClass195Array3;
	}

	@OriginalMember(owner = "client!aey", name = "fe", descriptor = "()[Lclient!cs;", line = 2589)
	@Override
	public Class195[] method6936() {
		return this.aClass195Array3;
	}

	@OriginalMember(owner = "client!aey", name = "fw", descriptor = "()[Lclient!cs;", line = 2589)
	@Override
	public Class195[] method6806() {
		return this.aClass195Array3;
	}

	@OriginalMember(owner = "client!aey", name = "by", descriptor = "()[Lclient!dk;", line = 2593)
	@Override
	public Class205[] method6938() {
		return this.aClass205Array3;
	}

	@OriginalMember(owner = "client!aey", name = "ft", descriptor = "()[Lclient!dk;", line = 2593)
	@Override
	public Class205[] method6934() {
		return this.aClass205Array3;
	}

	@OriginalMember(owner = "client!aey", name = "fl", descriptor = "()[Lclient!dk;", line = 2593)
	@Override
	public Class205[] method6933() {
		return this.aClass205Array3;
	}

	@OriginalMember(owner = "client!aey", name = "fk", descriptor = "()[Lclient!dk;", line = 2593)
	@Override
	public Class205[] method6935() {
		return this.aClass205Array3;
	}

	@OriginalMember(owner = "client!aey", name = "bd", descriptor = "(Lclient!ow;)V", line = 2597)
	@Override
	public void method6851(@OriginalArg(0) Class455 arg0) {
		@Pc(3) Class442 local3 = this.aClass86_Sub1_4.aClass442_87;
		local3.method28969(arg0);
		@Pc(11) int local11;
		if (this.aClass205Array3 != null) {
			for (local11 = 0; local11 < this.aClass205Array3.length; local11++) {
				@Pc(21) Class205 local21 = this.aClass205Array3[local11];
				@Pc(23) Class205 local23 = local21;
				if (local21.aClass205_1 != null) {
					local23 = local21.aClass205_1;
				}
				local23.anInt3573 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray70[local21.anInt3572 * 1404619919] + local3.aFloatArray109[4] * (float) this.anIntArray71[local21.anInt3572 * 1404619919] + local3.aFloatArray109[8] * (float) this.anIntArray75[local21.anInt3572 * 1404619919]) * -697779603;
				local23.anInt3580 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray70[local21.anInt3572 * 1404619919] + local3.aFloatArray109[5] * (float) this.anIntArray71[local21.anInt3572 * 1404619919] + local3.aFloatArray109[9] * (float) this.anIntArray75[local21.anInt3572 * 1404619919]) * 880720549;
				local23.anInt3574 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray70[local21.anInt3572 * 1404619919] + local3.aFloatArray109[6] * (float) this.anIntArray71[local21.anInt3572 * 1404619919] + local3.aFloatArray109[10] * (float) this.anIntArray75[local21.anInt3572 * 1404619919]) * -487629419;
				local23.anInt3575 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray70[local21.anInt3570 * 496404005] + local3.aFloatArray109[4] * (float) this.anIntArray71[local21.anInt3570 * 496404005] + local3.aFloatArray109[8] * (float) this.anIntArray75[local21.anInt3570 * 496404005]) * 1861716229;
				local23.anInt3567 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray70[local21.anInt3570 * 496404005] + local3.aFloatArray109[5] * (float) this.anIntArray71[local21.anInt3570 * 496404005] + local3.aFloatArray109[9] * (float) this.anIntArray75[local21.anInt3570 * 496404005]) * 968631629;
				local23.anInt3576 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray70[local21.anInt3570 * 496404005] + local3.aFloatArray109[6] * (float) this.anIntArray71[local21.anInt3570 * 496404005] + local3.aFloatArray109[10] * (float) this.anIntArray75[local21.anInt3570 * 496404005]) * -337212495;
				local23.anInt3578 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray70[local21.anInt3571 * 1123614299] + local3.aFloatArray109[4] * (float) this.anIntArray71[local21.anInt3571 * 1123614299] + local3.aFloatArray109[8] * (float) this.anIntArray75[local21.anInt3571 * 1123614299]) * -289878931;
				local23.anInt3579 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray70[local21.anInt3571 * 1123614299] + local3.aFloatArray109[5] * (float) this.anIntArray71[local21.anInt3571 * 1123614299] + local3.aFloatArray109[9] * (float) this.anIntArray75[local21.anInt3571 * 1123614299]) * 286740539;
				local23.anInt3577 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray70[local21.anInt3571 * 1123614299] + local3.aFloatArray109[6] * (float) this.anIntArray71[local21.anInt3571 * 1123614299] + local3.aFloatArray109[10] * (float) this.anIntArray75[local21.anInt3571 * 1123614299]) * -2010684097;
			}
		}
		if (this.aClass195Array3 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass195Array3.length; local11++) {
			@Pc(505) Class195 local505 = this.aClass195Array3[local11];
			@Pc(507) Class195 local507 = local505;
			if (local505.aClass195_2 != null) {
				local507 = local505.aClass195_2;
			}
			if (local505.aClass442_96 == null) {
				local505.aClass442_96 = new Class442(local3);
			} else {
				local505.aClass442_96.method28954(local3);
			}
			local507.anInt3547 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray70[local505.anInt3550 * -1634673991] + local3.aFloatArray109[4] * (float) this.anIntArray71[local505.anInt3550 * -1634673991] + local3.aFloatArray109[8] * (float) this.anIntArray75[local505.anInt3550 * -1634673991]) * 1976103833;
			local507.anInt3548 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray70[local505.anInt3550 * -1634673991] + local3.aFloatArray109[5] * (float) this.anIntArray71[local505.anInt3550 * -1634673991] + local3.aFloatArray109[9] * (float) this.anIntArray75[local505.anInt3550 * -1634673991]) * 1216251817;
			local507.anInt3546 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray70[local505.anInt3550 * -1634673991] + local3.aFloatArray109[6] * (float) this.anIntArray71[local505.anInt3550 * -1634673991] + local3.aFloatArray109[10] * (float) this.anIntArray75[local505.anInt3550 * -1634673991]) * -1645064349;
		}
	}

	@OriginalMember(owner = "client!aey", name = "da", descriptor = "(Lclient!ow;)V", line = 2597)
	@Override
	public void method6961(@OriginalArg(0) Class455 arg0) {
		@Pc(3) Class442 local3 = this.aClass86_Sub1_4.aClass442_87;
		local3.method28969(arg0);
		@Pc(11) int local11;
		if (this.aClass205Array3 != null) {
			for (local11 = 0; local11 < this.aClass205Array3.length; local11++) {
				@Pc(21) Class205 local21 = this.aClass205Array3[local11];
				@Pc(23) Class205 local23 = local21;
				if (local21.aClass205_1 != null) {
					local23 = local21.aClass205_1;
				}
				local23.anInt3573 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray70[local21.anInt3572 * 1404619919] + local3.aFloatArray109[4] * (float) this.anIntArray71[local21.anInt3572 * 1404619919] + local3.aFloatArray109[8] * (float) this.anIntArray75[local21.anInt3572 * 1404619919]) * -697779603;
				local23.anInt3580 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray70[local21.anInt3572 * 1404619919] + local3.aFloatArray109[5] * (float) this.anIntArray71[local21.anInt3572 * 1404619919] + local3.aFloatArray109[9] * (float) this.anIntArray75[local21.anInt3572 * 1404619919]) * 880720549;
				local23.anInt3574 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray70[local21.anInt3572 * 1404619919] + local3.aFloatArray109[6] * (float) this.anIntArray71[local21.anInt3572 * 1404619919] + local3.aFloatArray109[10] * (float) this.anIntArray75[local21.anInt3572 * 1404619919]) * -487629419;
				local23.anInt3575 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray70[local21.anInt3570 * 496404005] + local3.aFloatArray109[4] * (float) this.anIntArray71[local21.anInt3570 * 496404005] + local3.aFloatArray109[8] * (float) this.anIntArray75[local21.anInt3570 * 496404005]) * 1861716229;
				local23.anInt3567 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray70[local21.anInt3570 * 496404005] + local3.aFloatArray109[5] * (float) this.anIntArray71[local21.anInt3570 * 496404005] + local3.aFloatArray109[9] * (float) this.anIntArray75[local21.anInt3570 * 496404005]) * 968631629;
				local23.anInt3576 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray70[local21.anInt3570 * 496404005] + local3.aFloatArray109[6] * (float) this.anIntArray71[local21.anInt3570 * 496404005] + local3.aFloatArray109[10] * (float) this.anIntArray75[local21.anInt3570 * 496404005]) * -337212495;
				local23.anInt3578 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray70[local21.anInt3571 * 1123614299] + local3.aFloatArray109[4] * (float) this.anIntArray71[local21.anInt3571 * 1123614299] + local3.aFloatArray109[8] * (float) this.anIntArray75[local21.anInt3571 * 1123614299]) * -289878931;
				local23.anInt3579 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray70[local21.anInt3571 * 1123614299] + local3.aFloatArray109[5] * (float) this.anIntArray71[local21.anInt3571 * 1123614299] + local3.aFloatArray109[9] * (float) this.anIntArray75[local21.anInt3571 * 1123614299]) * 286740539;
				local23.anInt3577 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray70[local21.anInt3571 * 1123614299] + local3.aFloatArray109[6] * (float) this.anIntArray71[local21.anInt3571 * 1123614299] + local3.aFloatArray109[10] * (float) this.anIntArray75[local21.anInt3571 * 1123614299]) * -2010684097;
			}
		}
		if (this.aClass195Array3 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass195Array3.length; local11++) {
			@Pc(505) Class195 local505 = this.aClass195Array3[local11];
			@Pc(507) Class195 local507 = local505;
			if (local505.aClass195_2 != null) {
				local507 = local505.aClass195_2;
			}
			if (local505.aClass442_96 == null) {
				local505.aClass442_96 = new Class442(local3);
			} else {
				local505.aClass442_96.method28954(local3);
			}
			local507.anInt3547 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray70[local505.anInt3550 * -1634673991] + local3.aFloatArray109[4] * (float) this.anIntArray71[local505.anInt3550 * -1634673991] + local3.aFloatArray109[8] * (float) this.anIntArray75[local505.anInt3550 * -1634673991]) * 1976103833;
			local507.anInt3548 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray70[local505.anInt3550 * -1634673991] + local3.aFloatArray109[5] * (float) this.anIntArray71[local505.anInt3550 * -1634673991] + local3.aFloatArray109[9] * (float) this.anIntArray75[local505.anInt3550 * -1634673991]) * 1216251817;
			local507.anInt3546 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray70[local505.anInt3550 * -1634673991] + local3.aFloatArray109[6] * (float) this.anIntArray71[local505.anInt3550 * -1634673991] + local3.aFloatArray109[10] * (float) this.anIntArray75[local505.anInt3550 * -1634673991]) * -1645064349;
		}
	}

	@OriginalMember(owner = "client!aey", name = "dv", descriptor = "(Lclient!ow;)V", line = 2597)
	@Override
	public void method6887(@OriginalArg(0) Class455 arg0) {
		@Pc(3) Class442 local3 = this.aClass86_Sub1_4.aClass442_87;
		local3.method28969(arg0);
		@Pc(11) int local11;
		if (this.aClass205Array3 != null) {
			for (local11 = 0; local11 < this.aClass205Array3.length; local11++) {
				@Pc(21) Class205 local21 = this.aClass205Array3[local11];
				@Pc(23) Class205 local23 = local21;
				if (local21.aClass205_1 != null) {
					local23 = local21.aClass205_1;
				}
				local23.anInt3573 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray70[local21.anInt3572 * 1404619919] + local3.aFloatArray109[4] * (float) this.anIntArray71[local21.anInt3572 * 1404619919] + local3.aFloatArray109[8] * (float) this.anIntArray75[local21.anInt3572 * 1404619919]) * -697779603;
				local23.anInt3580 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray70[local21.anInt3572 * 1404619919] + local3.aFloatArray109[5] * (float) this.anIntArray71[local21.anInt3572 * 1404619919] + local3.aFloatArray109[9] * (float) this.anIntArray75[local21.anInt3572 * 1404619919]) * 880720549;
				local23.anInt3574 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray70[local21.anInt3572 * 1404619919] + local3.aFloatArray109[6] * (float) this.anIntArray71[local21.anInt3572 * 1404619919] + local3.aFloatArray109[10] * (float) this.anIntArray75[local21.anInt3572 * 1404619919]) * -487629419;
				local23.anInt3575 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray70[local21.anInt3570 * 496404005] + local3.aFloatArray109[4] * (float) this.anIntArray71[local21.anInt3570 * 496404005] + local3.aFloatArray109[8] * (float) this.anIntArray75[local21.anInt3570 * 496404005]) * 1861716229;
				local23.anInt3567 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray70[local21.anInt3570 * 496404005] + local3.aFloatArray109[5] * (float) this.anIntArray71[local21.anInt3570 * 496404005] + local3.aFloatArray109[9] * (float) this.anIntArray75[local21.anInt3570 * 496404005]) * 968631629;
				local23.anInt3576 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray70[local21.anInt3570 * 496404005] + local3.aFloatArray109[6] * (float) this.anIntArray71[local21.anInt3570 * 496404005] + local3.aFloatArray109[10] * (float) this.anIntArray75[local21.anInt3570 * 496404005]) * -337212495;
				local23.anInt3578 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray70[local21.anInt3571 * 1123614299] + local3.aFloatArray109[4] * (float) this.anIntArray71[local21.anInt3571 * 1123614299] + local3.aFloatArray109[8] * (float) this.anIntArray75[local21.anInt3571 * 1123614299]) * -289878931;
				local23.anInt3579 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray70[local21.anInt3571 * 1123614299] + local3.aFloatArray109[5] * (float) this.anIntArray71[local21.anInt3571 * 1123614299] + local3.aFloatArray109[9] * (float) this.anIntArray75[local21.anInt3571 * 1123614299]) * 286740539;
				local23.anInt3577 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray70[local21.anInt3571 * 1123614299] + local3.aFloatArray109[6] * (float) this.anIntArray71[local21.anInt3571 * 1123614299] + local3.aFloatArray109[10] * (float) this.anIntArray75[local21.anInt3571 * 1123614299]) * -2010684097;
			}
		}
		if (this.aClass195Array3 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass195Array3.length; local11++) {
			@Pc(505) Class195 local505 = this.aClass195Array3[local11];
			@Pc(507) Class195 local507 = local505;
			if (local505.aClass195_2 != null) {
				local507 = local505.aClass195_2;
			}
			if (local505.aClass442_96 == null) {
				local505.aClass442_96 = new Class442(local3);
			} else {
				local505.aClass442_96.method28954(local3);
			}
			local507.anInt3547 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray70[local505.anInt3550 * -1634673991] + local3.aFloatArray109[4] * (float) this.anIntArray71[local505.anInt3550 * -1634673991] + local3.aFloatArray109[8] * (float) this.anIntArray75[local505.anInt3550 * -1634673991]) * 1976103833;
			local507.anInt3548 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray70[local505.anInt3550 * -1634673991] + local3.aFloatArray109[5] * (float) this.anIntArray71[local505.anInt3550 * -1634673991] + local3.aFloatArray109[9] * (float) this.anIntArray75[local505.anInt3550 * -1634673991]) * 1216251817;
			local507.anInt3546 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray70[local505.anInt3550 * -1634673991] + local3.aFloatArray109[6] * (float) this.anIntArray71[local505.anInt3550 * -1634673991] + local3.aFloatArray109[10] * (float) this.anIntArray75[local505.anInt3550 * -1634673991]) * -1645064349;
		}
	}

	@OriginalMember(owner = "client!aey", name = "ar", descriptor = "(IILclient!ow;ZI)Z", line = 2630)
	@Override
	public boolean method6818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method6993(arg0, arg1, 0, 0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aey", name = "do", descriptor = "(IILclient!ow;ZI)Z", line = 2630)
	@Override
	public boolean method6882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method6993(arg0, arg1, 0, 0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aey", name = "dt", descriptor = "(IILclient!ow;ZI)Z", line = 2630)
	@Override
	public boolean method6937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method6993(arg0, arg1, 0, 0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aey", name = "dh", descriptor = "(IILclient!ow;ZI)Z", line = 2630)
	@Override
	public boolean method6884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method6993(arg0, arg1, 0, 0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aey", name = "dq", descriptor = "(IILclient!ow;ZI)Z", line = 2630)
	@Override
	public boolean method6885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method6993(arg0, arg1, 0, 0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aey", name = "dn", descriptor = "(IILclient!ow;ZI)Z", line = 2630)
	@Override
	public boolean method6952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method6993(arg0, arg1, 0, 0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aey", name = "iq", descriptor = "(IIIILclient!ow;ZI)Z", line = 2634)
	boolean method6993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class442 local3 = this.aClass86_Sub1_4.aClass442_87;
		local3.method28969(arg4);
		local3.method28965(this.aClass86_Sub1_4.aClass442_93);
		@Pc(13) boolean local13 = false;
		@Pc(15) float local15 = Float.MAX_VALUE;
		@Pc(17) float local17 = -3.4028235E38F;
		@Pc(19) float local19 = Float.MAX_VALUE;
		@Pc(21) float local21 = -3.4028235E38F;
		if (!this.aBoolean158) {
			this.method6991();
		}
		@Pc(34) int local34 = this.anInt779 - this.anInt782 >> 1;
		@Pc(42) int local42 = this.anInt778 - this.anInt767 >> 1;
		@Pc(50) int local50 = this.anInt783 - this.anInt780 >> 1;
		@Pc(55) int local55 = this.anInt782 + local34;
		@Pc(60) int local60 = this.anInt767 + local42;
		@Pc(65) int local65 = this.anInt780 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg6);
		@Pc(77) int local77 = local60 - (local42 << arg6);
		@Pc(83) int local83 = local65 - (local50 << arg6);
		@Pc(89) int local89 = local55 + (local34 << arg6);
		@Pc(95) int local95 = local60 + (local42 << arg6);
		@Pc(101) int local101 = local65 + (local50 << arg6);
		this.anIntArray76[0] = local71;
		this.anIntArray72[0] = local77;
		this.anIntArray80[0] = local83;
		this.anIntArray76[1] = local89;
		this.anIntArray72[1] = local77;
		this.anIntArray80[1] = local83;
		this.anIntArray76[2] = local71;
		this.anIntArray72[2] = local95;
		this.anIntArray80[2] = local83;
		this.anIntArray76[3] = local89;
		this.anIntArray72[3] = local95;
		this.anIntArray80[3] = local83;
		this.anIntArray76[4] = local71;
		this.anIntArray72[4] = local77;
		this.anIntArray80[4] = local101;
		this.anIntArray76[5] = local89;
		this.anIntArray72[5] = local77;
		this.anIntArray80[5] = local101;
		this.anIntArray76[6] = local71;
		this.anIntArray72[6] = local95;
		this.anIntArray80[6] = local101;
		this.anIntArray76[7] = local89;
		this.anIntArray72[7] = local95;
		this.anIntArray80[7] = local101;
		@Pc(327) float local327;
		@Pc(353) float local353;
		@Pc(270) float local270;
		@Pc(296) float local296;
		@Pc(232) float local232;
		@Pc(238) float local238;
		@Pc(244) float local244;
		@Pc(223) int local223;
		for (local223 = 0; local223 < 8; local223++) {
			local232 = this.anIntArray76[local223];
			local238 = this.anIntArray72[local223];
			local244 = this.anIntArray80[local223];
			local270 = local3.aFloatArray109[2] * local232 + local3.aFloatArray109[6] * local238 + local3.aFloatArray109[10] * local244 + local3.aFloatArray109[14];
			local296 = local3.aFloatArray109[3] * local232 + local3.aFloatArray109[7] * local238 + local3.aFloatArray109[11] * local244 + local3.aFloatArray109[15];
			if (local270 >= -local296) {
				local327 = local3.aFloatArray109[0] * local232 + local3.aFloatArray109[4] * local238 + local3.aFloatArray109[8] * local244 + local3.aFloatArray109[12];
				local353 = local3.aFloatArray109[1] * local232 + local3.aFloatArray109[5] * local238 + local3.aFloatArray109[9] * local244 + local3.aFloatArray109[13];
				@Pc(365) float local365 = this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local327 / local296;
				@Pc(377) float local377 = this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local353 / local296;
				if (local365 < local15) {
					local15 = local365;
				}
				if (local365 > local17) {
					local17 = local365;
				}
				if (local377 < local19) {
					local19 = local377;
				}
				if (local377 > local21) {
					local21 = local377;
				}
				local13 = true;
			}
		}
		local223 = arg0 + arg2;
		@Pc(413) int local413 = arg1 + arg3;
		if (local13 && (float) local223 > local15 && (float) arg0 < local17 && (float) local413 > local19 && (float) arg1 < local21) {
			if (arg5) {
				return true;
			}
			if (this.anIntArray73.length < this.anInt772) {
				this.anIntArray73 = new int[this.anInt772];
				this.anIntArray81 = new int[this.anInt772];
			}
			@Pc(457) int local457;
			for (local457 = 0; local457 < this.anInt771; local457++) {
				local232 = this.anIntArray70[local457];
				local238 = this.anIntArray71[local457];
				local244 = this.anIntArray75[local457];
				local270 = local3.aFloatArray109[2] * local232 + local3.aFloatArray109[6] * local238 + local3.aFloatArray109[10] * local244 + local3.aFloatArray109[14];
				local296 = local3.aFloatArray109[3] * local232 + local3.aFloatArray109[7] * local238 + local3.aFloatArray109[11] * local244 + local3.aFloatArray109[15];
				@Pc(593) int local593;
				@Pc(600) int local600;
				@Pc(602) int local602;
				@Pc(620) int local620;
				if (local270 >= -local296) {
					local327 = local3.aFloatArray109[0] * local232 + local3.aFloatArray109[4] * local238 + local3.aFloatArray109[8] * local244 + local3.aFloatArray109[12];
					local353 = local3.aFloatArray109[1] * local232 + local3.aFloatArray109[5] * local238 + local3.aFloatArray109[9] * local244 + local3.aFloatArray109[13];
					local593 = this.anIntArray77[local457];
					local600 = this.anIntArray77[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray73[local620] = (int) (this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local327 / local296);
						this.anIntArray81[local620] = (int) (this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local353 / local296);
					}
				} else {
					local593 = this.anIntArray77[local457];
					local600 = this.anIntArray77[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray73[local620] = -999999;
					}
				}
			}
			for (local457 = 0; local457 < this.anInt774; local457++) {
				if (this.anIntArray73[this.aShortArray36[local457] & 0xFFFF] != -999999 && this.anIntArray73[this.aShortArray35[local457] & 0xFFFF] != -999999 && this.anIntArray73[this.aShortArray34[local457] & 0xFFFF] != -999999 && this.method6998(arg0, arg1, local223, local413, this.anIntArray81[this.aShortArray36[local457] & 0xFFFF], this.anIntArray81[this.aShortArray35[local457] & 0xFFFF], this.anIntArray81[this.aShortArray34[local457] & 0xFFFF], this.anIntArray73[this.aShortArray36[local457] & 0xFFFF], this.anIntArray73[this.aShortArray35[local457] & 0xFFFF], this.anIntArray73[this.aShortArray34[local457] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aey", name = "jn", descriptor = "(IIIILclient!ow;ZI)Z", line = 2634)
	boolean method6994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class442 local3 = this.aClass86_Sub1_4.aClass442_87;
		local3.method28969(arg4);
		local3.method28965(this.aClass86_Sub1_4.aClass442_93);
		@Pc(13) boolean local13 = false;
		@Pc(15) float local15 = Float.MAX_VALUE;
		@Pc(17) float local17 = -3.4028235E38F;
		@Pc(19) float local19 = Float.MAX_VALUE;
		@Pc(21) float local21 = -3.4028235E38F;
		if (!this.aBoolean158) {
			this.method6991();
		}
		@Pc(34) int local34 = this.anInt779 - this.anInt782 >> 1;
		@Pc(42) int local42 = this.anInt778 - this.anInt767 >> 1;
		@Pc(50) int local50 = this.anInt783 - this.anInt780 >> 1;
		@Pc(55) int local55 = this.anInt782 + local34;
		@Pc(60) int local60 = this.anInt767 + local42;
		@Pc(65) int local65 = this.anInt780 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg6);
		@Pc(77) int local77 = local60 - (local42 << arg6);
		@Pc(83) int local83 = local65 - (local50 << arg6);
		@Pc(89) int local89 = local55 + (local34 << arg6);
		@Pc(95) int local95 = local60 + (local42 << arg6);
		@Pc(101) int local101 = local65 + (local50 << arg6);
		this.anIntArray76[0] = local71;
		this.anIntArray72[0] = local77;
		this.anIntArray80[0] = local83;
		this.anIntArray76[1] = local89;
		this.anIntArray72[1] = local77;
		this.anIntArray80[1] = local83;
		this.anIntArray76[2] = local71;
		this.anIntArray72[2] = local95;
		this.anIntArray80[2] = local83;
		this.anIntArray76[3] = local89;
		this.anIntArray72[3] = local95;
		this.anIntArray80[3] = local83;
		this.anIntArray76[4] = local71;
		this.anIntArray72[4] = local77;
		this.anIntArray80[4] = local101;
		this.anIntArray76[5] = local89;
		this.anIntArray72[5] = local77;
		this.anIntArray80[5] = local101;
		this.anIntArray76[6] = local71;
		this.anIntArray72[6] = local95;
		this.anIntArray80[6] = local101;
		this.anIntArray76[7] = local89;
		this.anIntArray72[7] = local95;
		this.anIntArray80[7] = local101;
		@Pc(327) float local327;
		@Pc(353) float local353;
		@Pc(270) float local270;
		@Pc(296) float local296;
		@Pc(232) float local232;
		@Pc(238) float local238;
		@Pc(244) float local244;
		@Pc(223) int local223;
		for (local223 = 0; local223 < 8; local223++) {
			local232 = this.anIntArray76[local223];
			local238 = this.anIntArray72[local223];
			local244 = this.anIntArray80[local223];
			local270 = local3.aFloatArray109[2] * local232 + local3.aFloatArray109[6] * local238 + local3.aFloatArray109[10] * local244 + local3.aFloatArray109[14];
			local296 = local3.aFloatArray109[3] * local232 + local3.aFloatArray109[7] * local238 + local3.aFloatArray109[11] * local244 + local3.aFloatArray109[15];
			if (local270 >= -local296) {
				local327 = local3.aFloatArray109[0] * local232 + local3.aFloatArray109[4] * local238 + local3.aFloatArray109[8] * local244 + local3.aFloatArray109[12];
				local353 = local3.aFloatArray109[1] * local232 + local3.aFloatArray109[5] * local238 + local3.aFloatArray109[9] * local244 + local3.aFloatArray109[13];
				@Pc(365) float local365 = this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local327 / local296;
				@Pc(377) float local377 = this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local353 / local296;
				if (local365 < local15) {
					local15 = local365;
				}
				if (local365 > local17) {
					local17 = local365;
				}
				if (local377 < local19) {
					local19 = local377;
				}
				if (local377 > local21) {
					local21 = local377;
				}
				local13 = true;
			}
		}
		local223 = arg0 + arg2;
		@Pc(413) int local413 = arg1 + arg3;
		if (local13 && (float) local223 > local15 && (float) arg0 < local17 && (float) local413 > local19 && (float) arg1 < local21) {
			if (arg5) {
				return true;
			}
			if (this.anIntArray73.length < this.anInt772) {
				this.anIntArray73 = new int[this.anInt772];
				this.anIntArray81 = new int[this.anInt772];
			}
			@Pc(457) int local457;
			for (local457 = 0; local457 < this.anInt771; local457++) {
				local232 = this.anIntArray70[local457];
				local238 = this.anIntArray71[local457];
				local244 = this.anIntArray75[local457];
				local270 = local3.aFloatArray109[2] * local232 + local3.aFloatArray109[6] * local238 + local3.aFloatArray109[10] * local244 + local3.aFloatArray109[14];
				local296 = local3.aFloatArray109[3] * local232 + local3.aFloatArray109[7] * local238 + local3.aFloatArray109[11] * local244 + local3.aFloatArray109[15];
				@Pc(593) int local593;
				@Pc(600) int local600;
				@Pc(602) int local602;
				@Pc(620) int local620;
				if (local270 >= -local296) {
					local327 = local3.aFloatArray109[0] * local232 + local3.aFloatArray109[4] * local238 + local3.aFloatArray109[8] * local244 + local3.aFloatArray109[12];
					local353 = local3.aFloatArray109[1] * local232 + local3.aFloatArray109[5] * local238 + local3.aFloatArray109[9] * local244 + local3.aFloatArray109[13];
					local593 = this.anIntArray77[local457];
					local600 = this.anIntArray77[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray73[local620] = (int) (this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local327 / local296);
						this.anIntArray81[local620] = (int) (this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local353 / local296);
					}
				} else {
					local593 = this.anIntArray77[local457];
					local600 = this.anIntArray77[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray73[local620] = -999999;
					}
				}
			}
			for (local457 = 0; local457 < this.anInt774; local457++) {
				if (this.anIntArray73[this.aShortArray36[local457] & 0xFFFF] != -999999 && this.anIntArray73[this.aShortArray35[local457] & 0xFFFF] != -999999 && this.anIntArray73[this.aShortArray34[local457] & 0xFFFF] != -999999 && this.method6998(arg0, arg1, local223, local413, this.anIntArray81[this.aShortArray36[local457] & 0xFFFF], this.anIntArray81[this.aShortArray35[local457] & 0xFFFF], this.anIntArray81[this.aShortArray34[local457] & 0xFFFF], this.anIntArray73[this.aShortArray36[local457] & 0xFFFF], this.anIntArray73[this.aShortArray35[local457] & 0xFFFF], this.anIntArray73[this.aShortArray34[local457] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aey", name = "jl", descriptor = "(IIIILclient!ow;ZI)Z", line = 2634)
	boolean method6995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class442 local3 = this.aClass86_Sub1_4.aClass442_87;
		local3.method28969(arg4);
		local3.method28965(this.aClass86_Sub1_4.aClass442_93);
		@Pc(13) boolean local13 = false;
		@Pc(15) float local15 = Float.MAX_VALUE;
		@Pc(17) float local17 = -3.4028235E38F;
		@Pc(19) float local19 = Float.MAX_VALUE;
		@Pc(21) float local21 = -3.4028235E38F;
		if (!this.aBoolean158) {
			this.method6991();
		}
		@Pc(34) int local34 = this.anInt779 - this.anInt782 >> 1;
		@Pc(42) int local42 = this.anInt778 - this.anInt767 >> 1;
		@Pc(50) int local50 = this.anInt783 - this.anInt780 >> 1;
		@Pc(55) int local55 = this.anInt782 + local34;
		@Pc(60) int local60 = this.anInt767 + local42;
		@Pc(65) int local65 = this.anInt780 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg6);
		@Pc(77) int local77 = local60 - (local42 << arg6);
		@Pc(83) int local83 = local65 - (local50 << arg6);
		@Pc(89) int local89 = local55 + (local34 << arg6);
		@Pc(95) int local95 = local60 + (local42 << arg6);
		@Pc(101) int local101 = local65 + (local50 << arg6);
		this.anIntArray76[0] = local71;
		this.anIntArray72[0] = local77;
		this.anIntArray80[0] = local83;
		this.anIntArray76[1] = local89;
		this.anIntArray72[1] = local77;
		this.anIntArray80[1] = local83;
		this.anIntArray76[2] = local71;
		this.anIntArray72[2] = local95;
		this.anIntArray80[2] = local83;
		this.anIntArray76[3] = local89;
		this.anIntArray72[3] = local95;
		this.anIntArray80[3] = local83;
		this.anIntArray76[4] = local71;
		this.anIntArray72[4] = local77;
		this.anIntArray80[4] = local101;
		this.anIntArray76[5] = local89;
		this.anIntArray72[5] = local77;
		this.anIntArray80[5] = local101;
		this.anIntArray76[6] = local71;
		this.anIntArray72[6] = local95;
		this.anIntArray80[6] = local101;
		this.anIntArray76[7] = local89;
		this.anIntArray72[7] = local95;
		this.anIntArray80[7] = local101;
		@Pc(327) float local327;
		@Pc(353) float local353;
		@Pc(270) float local270;
		@Pc(296) float local296;
		@Pc(232) float local232;
		@Pc(238) float local238;
		@Pc(244) float local244;
		@Pc(223) int local223;
		for (local223 = 0; local223 < 8; local223++) {
			local232 = this.anIntArray76[local223];
			local238 = this.anIntArray72[local223];
			local244 = this.anIntArray80[local223];
			local270 = local3.aFloatArray109[2] * local232 + local3.aFloatArray109[6] * local238 + local3.aFloatArray109[10] * local244 + local3.aFloatArray109[14];
			local296 = local3.aFloatArray109[3] * local232 + local3.aFloatArray109[7] * local238 + local3.aFloatArray109[11] * local244 + local3.aFloatArray109[15];
			if (local270 >= -local296) {
				local327 = local3.aFloatArray109[0] * local232 + local3.aFloatArray109[4] * local238 + local3.aFloatArray109[8] * local244 + local3.aFloatArray109[12];
				local353 = local3.aFloatArray109[1] * local232 + local3.aFloatArray109[5] * local238 + local3.aFloatArray109[9] * local244 + local3.aFloatArray109[13];
				@Pc(365) float local365 = this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local327 / local296;
				@Pc(377) float local377 = this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local353 / local296;
				if (local365 < local15) {
					local15 = local365;
				}
				if (local365 > local17) {
					local17 = local365;
				}
				if (local377 < local19) {
					local19 = local377;
				}
				if (local377 > local21) {
					local21 = local377;
				}
				local13 = true;
			}
		}
		local223 = arg0 + arg2;
		@Pc(413) int local413 = arg1 + arg3;
		if (local13 && (float) local223 > local15 && (float) arg0 < local17 && (float) local413 > local19 && (float) arg1 < local21) {
			if (arg5) {
				return true;
			}
			if (this.anIntArray73.length < this.anInt772) {
				this.anIntArray73 = new int[this.anInt772];
				this.anIntArray81 = new int[this.anInt772];
			}
			@Pc(457) int local457;
			for (local457 = 0; local457 < this.anInt771; local457++) {
				local232 = this.anIntArray70[local457];
				local238 = this.anIntArray71[local457];
				local244 = this.anIntArray75[local457];
				local270 = local3.aFloatArray109[2] * local232 + local3.aFloatArray109[6] * local238 + local3.aFloatArray109[10] * local244 + local3.aFloatArray109[14];
				local296 = local3.aFloatArray109[3] * local232 + local3.aFloatArray109[7] * local238 + local3.aFloatArray109[11] * local244 + local3.aFloatArray109[15];
				@Pc(593) int local593;
				@Pc(600) int local600;
				@Pc(602) int local602;
				@Pc(620) int local620;
				if (local270 >= -local296) {
					local327 = local3.aFloatArray109[0] * local232 + local3.aFloatArray109[4] * local238 + local3.aFloatArray109[8] * local244 + local3.aFloatArray109[12];
					local353 = local3.aFloatArray109[1] * local232 + local3.aFloatArray109[5] * local238 + local3.aFloatArray109[9] * local244 + local3.aFloatArray109[13];
					local593 = this.anIntArray77[local457];
					local600 = this.anIntArray77[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray73[local620] = (int) (this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local327 / local296);
						this.anIntArray81[local620] = (int) (this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local353 / local296);
					}
				} else {
					local593 = this.anIntArray77[local457];
					local600 = this.anIntArray77[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray73[local620] = -999999;
					}
				}
			}
			for (local457 = 0; local457 < this.anInt774; local457++) {
				if (this.anIntArray73[this.aShortArray36[local457] & 0xFFFF] != -999999 && this.anIntArray73[this.aShortArray35[local457] & 0xFFFF] != -999999 && this.anIntArray73[this.aShortArray34[local457] & 0xFFFF] != -999999 && this.method6998(arg0, arg1, local223, local413, this.anIntArray81[this.aShortArray36[local457] & 0xFFFF], this.anIntArray81[this.aShortArray35[local457] & 0xFFFF], this.anIntArray81[this.aShortArray34[local457] & 0xFFFF], this.anIntArray73[this.aShortArray36[local457] & 0xFFFF], this.anIntArray73[this.aShortArray35[local457] & 0xFFFF], this.anIntArray73[this.aShortArray34[local457] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aey", name = "jo", descriptor = "(IIIILclient!ow;ZI)Z", line = 2634)
	boolean method6996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class442 local3 = this.aClass86_Sub1_4.aClass442_87;
		local3.method28969(arg4);
		local3.method28965(this.aClass86_Sub1_4.aClass442_93);
		@Pc(13) boolean local13 = false;
		@Pc(15) float local15 = Float.MAX_VALUE;
		@Pc(17) float local17 = -3.4028235E38F;
		@Pc(19) float local19 = Float.MAX_VALUE;
		@Pc(21) float local21 = -3.4028235E38F;
		if (!this.aBoolean158) {
			this.method6991();
		}
		@Pc(34) int local34 = this.anInt779 - this.anInt782 >> 1;
		@Pc(42) int local42 = this.anInt778 - this.anInt767 >> 1;
		@Pc(50) int local50 = this.anInt783 - this.anInt780 >> 1;
		@Pc(55) int local55 = this.anInt782 + local34;
		@Pc(60) int local60 = this.anInt767 + local42;
		@Pc(65) int local65 = this.anInt780 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg6);
		@Pc(77) int local77 = local60 - (local42 << arg6);
		@Pc(83) int local83 = local65 - (local50 << arg6);
		@Pc(89) int local89 = local55 + (local34 << arg6);
		@Pc(95) int local95 = local60 + (local42 << arg6);
		@Pc(101) int local101 = local65 + (local50 << arg6);
		this.anIntArray76[0] = local71;
		this.anIntArray72[0] = local77;
		this.anIntArray80[0] = local83;
		this.anIntArray76[1] = local89;
		this.anIntArray72[1] = local77;
		this.anIntArray80[1] = local83;
		this.anIntArray76[2] = local71;
		this.anIntArray72[2] = local95;
		this.anIntArray80[2] = local83;
		this.anIntArray76[3] = local89;
		this.anIntArray72[3] = local95;
		this.anIntArray80[3] = local83;
		this.anIntArray76[4] = local71;
		this.anIntArray72[4] = local77;
		this.anIntArray80[4] = local101;
		this.anIntArray76[5] = local89;
		this.anIntArray72[5] = local77;
		this.anIntArray80[5] = local101;
		this.anIntArray76[6] = local71;
		this.anIntArray72[6] = local95;
		this.anIntArray80[6] = local101;
		this.anIntArray76[7] = local89;
		this.anIntArray72[7] = local95;
		this.anIntArray80[7] = local101;
		@Pc(327) float local327;
		@Pc(353) float local353;
		@Pc(270) float local270;
		@Pc(296) float local296;
		@Pc(232) float local232;
		@Pc(238) float local238;
		@Pc(244) float local244;
		@Pc(223) int local223;
		for (local223 = 0; local223 < 8; local223++) {
			local232 = this.anIntArray76[local223];
			local238 = this.anIntArray72[local223];
			local244 = this.anIntArray80[local223];
			local270 = local3.aFloatArray109[2] * local232 + local3.aFloatArray109[6] * local238 + local3.aFloatArray109[10] * local244 + local3.aFloatArray109[14];
			local296 = local3.aFloatArray109[3] * local232 + local3.aFloatArray109[7] * local238 + local3.aFloatArray109[11] * local244 + local3.aFloatArray109[15];
			if (local270 >= -local296) {
				local327 = local3.aFloatArray109[0] * local232 + local3.aFloatArray109[4] * local238 + local3.aFloatArray109[8] * local244 + local3.aFloatArray109[12];
				local353 = local3.aFloatArray109[1] * local232 + local3.aFloatArray109[5] * local238 + local3.aFloatArray109[9] * local244 + local3.aFloatArray109[13];
				@Pc(365) float local365 = this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local327 / local296;
				@Pc(377) float local377 = this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local353 / local296;
				if (local365 < local15) {
					local15 = local365;
				}
				if (local365 > local17) {
					local17 = local365;
				}
				if (local377 < local19) {
					local19 = local377;
				}
				if (local377 > local21) {
					local21 = local377;
				}
				local13 = true;
			}
		}
		local223 = arg0 + arg2;
		@Pc(413) int local413 = arg1 + arg3;
		if (local13 && (float) local223 > local15 && (float) arg0 < local17 && (float) local413 > local19 && (float) arg1 < local21) {
			if (arg5) {
				return true;
			}
			if (this.anIntArray73.length < this.anInt772) {
				this.anIntArray73 = new int[this.anInt772];
				this.anIntArray81 = new int[this.anInt772];
			}
			@Pc(457) int local457;
			for (local457 = 0; local457 < this.anInt771; local457++) {
				local232 = this.anIntArray70[local457];
				local238 = this.anIntArray71[local457];
				local244 = this.anIntArray75[local457];
				local270 = local3.aFloatArray109[2] * local232 + local3.aFloatArray109[6] * local238 + local3.aFloatArray109[10] * local244 + local3.aFloatArray109[14];
				local296 = local3.aFloatArray109[3] * local232 + local3.aFloatArray109[7] * local238 + local3.aFloatArray109[11] * local244 + local3.aFloatArray109[15];
				@Pc(593) int local593;
				@Pc(600) int local600;
				@Pc(602) int local602;
				@Pc(620) int local620;
				if (local270 >= -local296) {
					local327 = local3.aFloatArray109[0] * local232 + local3.aFloatArray109[4] * local238 + local3.aFloatArray109[8] * local244 + local3.aFloatArray109[12];
					local353 = local3.aFloatArray109[1] * local232 + local3.aFloatArray109[5] * local238 + local3.aFloatArray109[9] * local244 + local3.aFloatArray109[13];
					local593 = this.anIntArray77[local457];
					local600 = this.anIntArray77[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray73[local620] = (int) (this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local327 / local296);
						this.anIntArray81[local620] = (int) (this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local353 / local296);
					}
				} else {
					local593 = this.anIntArray77[local457];
					local600 = this.anIntArray77[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray37[local602] != 0; local602++) {
						local620 = (this.aShortArray37[local602] & 0xFFFF) - 1;
						this.anIntArray73[local620] = -999999;
					}
				}
			}
			for (local457 = 0; local457 < this.anInt774; local457++) {
				if (this.anIntArray73[this.aShortArray36[local457] & 0xFFFF] != -999999 && this.anIntArray73[this.aShortArray35[local457] & 0xFFFF] != -999999 && this.anIntArray73[this.aShortArray34[local457] & 0xFFFF] != -999999 && this.method6998(arg0, arg1, local223, local413, this.anIntArray81[this.aShortArray36[local457] & 0xFFFF], this.anIntArray81[this.aShortArray35[local457] & 0xFFFF], this.anIntArray81[this.aShortArray34[local457] & 0xFFFF], this.anIntArray73[this.aShortArray36[local457] & 0xFFFF], this.anIntArray73[this.aShortArray35[local457] & 0xFFFF], this.anIntArray73[this.aShortArray34[local457] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aey", name = "jk", descriptor = "(IIIIIIIIII)Z", line = 2749)
	boolean method6997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 < arg4 && arg3 < arg5 && arg3 < arg6) {
			return false;
		} else if (arg1 > arg4 && arg1 > arg5 && arg1 > arg6) {
			return false;
		} else if (arg2 < arg7 && arg2 < arg8 && arg2 < arg9) {
			return false;
		} else {
			return arg0 <= arg7 || arg0 <= arg8 || arg0 <= arg9;
		}
	}

	@OriginalMember(owner = "client!aey", name = "ib", descriptor = "(IIIIIIIIII)Z", line = 2749)
	boolean method6998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 < arg4 && arg3 < arg5 && arg3 < arg6) {
			return false;
		} else if (arg1 > arg4 && arg1 > arg5 && arg1 > arg6) {
			return false;
		} else if (arg2 < arg7 && arg2 < arg8 && arg2 < arg9) {
			return false;
		} else {
			return arg0 <= arg7 || arg0 <= arg8 || arg0 <= arg9;
		}
	}

	@OriginalMember(owner = "client!aey", name = "jd", descriptor = "(IIIIIIIIII)Z", line = 2749)
	boolean method6999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 < arg4 && arg3 < arg5 && arg3 < arg6) {
			return false;
		} else if (arg1 > arg4 && arg1 > arg5 && arg1 > arg6) {
			return false;
		} else if (arg2 < arg7 && arg2 < arg8 && arg2 < arg9) {
			return false;
		} else {
			return arg0 <= arg7 || arg0 <= arg8 || arg0 <= arg9;
		}
	}

	@OriginalMember(owner = "client!aey", name = "jg", descriptor = "(IIIIIIIIII)Z", line = 2749)
	boolean method7000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 < arg4 && arg3 < arg5 && arg3 < arg6) {
			return false;
		} else if (arg1 > arg4 && arg1 > arg5 && arg1 > arg6) {
			return false;
		} else if (arg2 < arg7 && arg2 < arg8 && arg2 < arg9) {
			return false;
		} else {
			return arg0 <= arg7 || arg0 <= arg8 || arg0 <= arg9;
		}
	}

	@OriginalMember(owner = "client!aey", name = "ad", descriptor = "(Lclient!arp;)Lclient!arp;", line = 2757)
	@Override
	public Class77_Sub1_Sub16 method6819(@OriginalArg(0) Class77_Sub1_Sub16 arg0) {
		if (this.anInt772 == 0) {
			return null;
		}
		if (!this.aBoolean158) {
			this.method6991();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass86_Sub1_4.anInt2831 > 0) {
			local29 = this.anInt782 - (this.anInt778 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local45 = this.anInt779 - (this.anInt767 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		} else {
			local29 = this.anInt782 - (this.anInt767 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local45 = this.anInt779 - (this.anInt778 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass86_Sub1_4.anInt2851 > 0) {
			local98 = this.anInt780 - (this.anInt778 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local114 = this.anInt783 - (this.anInt767 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		} else {
			local98 = this.anInt780 - (this.anInt767 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local114 = this.anInt783 - (this.anInt778 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class77_Sub1_Sub16_Sub2 local162 = (Class77_Sub1_Sub16_Sub2) arg0;
		@Pc(171) Class77_Sub1_Sub16_Sub2 local171;
		if (local162 != null && local162.method23588(local153, local159)) {
			local171 = local162;
			local162.method23590();
		} else {
			local171 = new Class77_Sub1_Sub16_Sub2(this.aClass86_Sub1_4, local153, local159);
		}
		local171.method23586(local29, local98, local45, local114);
		this.method7001(local171);
		return local171;
	}

	@OriginalMember(owner = "client!aey", name = "dz", descriptor = "(Lclient!arp;)Lclient!arp;", line = 2757)
	@Override
	public Class77_Sub1_Sub16 method6889(@OriginalArg(0) Class77_Sub1_Sub16 arg0) {
		if (this.anInt772 == 0) {
			return null;
		}
		if (!this.aBoolean158) {
			this.method6991();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass86_Sub1_4.anInt2831 > 0) {
			local29 = this.anInt782 - (this.anInt778 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local45 = this.anInt779 - (this.anInt767 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		} else {
			local29 = this.anInt782 - (this.anInt767 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local45 = this.anInt779 - (this.anInt778 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass86_Sub1_4.anInt2851 > 0) {
			local98 = this.anInt780 - (this.anInt778 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local114 = this.anInt783 - (this.anInt767 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		} else {
			local98 = this.anInt780 - (this.anInt767 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local114 = this.anInt783 - (this.anInt778 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class77_Sub1_Sub16_Sub2 local162 = (Class77_Sub1_Sub16_Sub2) arg0;
		@Pc(171) Class77_Sub1_Sub16_Sub2 local171;
		if (local162 != null && local162.method23588(local153, local159)) {
			local171 = local162;
			local162.method23590();
		} else {
			local171 = new Class77_Sub1_Sub16_Sub2(this.aClass86_Sub1_4, local153, local159);
		}
		local171.method23586(local29, local98, local45, local114);
		this.method7001(local171);
		return local171;
	}

	@OriginalMember(owner = "client!aey", name = "dy", descriptor = "(Lclient!arp;)Lclient!arp;", line = 2757)
	@Override
	public Class77_Sub1_Sub16 method6871(@OriginalArg(0) Class77_Sub1_Sub16 arg0) {
		if (this.anInt772 == 0) {
			return null;
		}
		if (!this.aBoolean158) {
			this.method6991();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass86_Sub1_4.anInt2831 > 0) {
			local29 = this.anInt782 - (this.anInt778 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local45 = this.anInt779 - (this.anInt767 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		} else {
			local29 = this.anInt782 - (this.anInt767 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local45 = this.anInt779 - (this.anInt778 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass86_Sub1_4.anInt2851 > 0) {
			local98 = this.anInt780 - (this.anInt778 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local114 = this.anInt783 - (this.anInt767 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		} else {
			local98 = this.anInt780 - (this.anInt767 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local114 = this.anInt783 - (this.anInt778 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class77_Sub1_Sub16_Sub2 local162 = (Class77_Sub1_Sub16_Sub2) arg0;
		@Pc(171) Class77_Sub1_Sub16_Sub2 local171;
		if (local162 != null && local162.method23588(local153, local159)) {
			local171 = local162;
			local162.method23590();
		} else {
			local171 = new Class77_Sub1_Sub16_Sub2(this.aClass86_Sub1_4, local153, local159);
		}
		local171.method23586(local29, local98, local45, local114);
		this.method7001(local171);
		return local171;
	}

	@OriginalMember(owner = "client!aey", name = "dm", descriptor = "(Lclient!arp;)Lclient!arp;", line = 2757)
	@Override
	public Class77_Sub1_Sub16 method6888(@OriginalArg(0) Class77_Sub1_Sub16 arg0) {
		if (this.anInt772 == 0) {
			return null;
		}
		if (!this.aBoolean158) {
			this.method6991();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass86_Sub1_4.anInt2831 > 0) {
			local29 = this.anInt782 - (this.anInt778 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local45 = this.anInt779 - (this.anInt767 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		} else {
			local29 = this.anInt782 - (this.anInt767 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local45 = this.anInt779 - (this.anInt778 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass86_Sub1_4.anInt2851 > 0) {
			local98 = this.anInt780 - (this.anInt778 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local114 = this.anInt783 - (this.anInt767 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		} else {
			local98 = this.anInt780 - (this.anInt767 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local114 = this.anInt783 - (this.anInt778 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class77_Sub1_Sub16_Sub2 local162 = (Class77_Sub1_Sub16_Sub2) arg0;
		@Pc(171) Class77_Sub1_Sub16_Sub2 local171;
		if (local162 != null && local162.method23588(local153, local159)) {
			local171 = local162;
			local162.method23590();
		} else {
			local171 = new Class77_Sub1_Sub16_Sub2(this.aClass86_Sub1_4, local153, local159);
		}
		local171.method23586(local29, local98, local45, local114);
		this.method7001(local171);
		return local171;
	}

	@OriginalMember(owner = "client!aey", name = "dw", descriptor = "(Lclient!arp;)Lclient!arp;", line = 2757)
	@Override
	public Class77_Sub1_Sub16 method6945(@OriginalArg(0) Class77_Sub1_Sub16 arg0) {
		if (this.anInt772 == 0) {
			return null;
		}
		if (!this.aBoolean158) {
			this.method6991();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass86_Sub1_4.anInt2831 > 0) {
			local29 = this.anInt782 - (this.anInt778 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local45 = this.anInt779 - (this.anInt767 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		} else {
			local29 = this.anInt782 - (this.anInt767 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local45 = this.anInt779 - (this.anInt778 * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass86_Sub1_4.anInt2851 > 0) {
			local98 = this.anInt780 - (this.anInt778 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local114 = this.anInt783 - (this.anInt767 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		} else {
			local98 = this.anInt780 - (this.anInt767 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
			local114 = this.anInt783 - (this.anInt778 * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class77_Sub1_Sub16_Sub2 local162 = (Class77_Sub1_Sub16_Sub2) arg0;
		@Pc(171) Class77_Sub1_Sub16_Sub2 local171;
		if (local162 != null && local162.method23588(local153, local159)) {
			local171 = local162;
			local162.method23590();
		} else {
			local171 = new Class77_Sub1_Sub16_Sub2(this.aClass86_Sub1_4, local153, local159);
		}
		local171.method23586(local29, local98, local45, local114);
		this.method7001(local171);
		return local171;
	}

	@OriginalMember(owner = "client!aey", name = "if", descriptor = "(Lclient!asy;)V", line = 2794)
	void method7001(@OriginalArg(0) Class77_Sub1_Sub16_Sub2 arg0) {
		if (this.anIntArray73.length < this.anInt772) {
			this.anIntArray73 = new int[this.anInt772];
			this.anIntArray81 = new int[this.anInt772];
		}
		@Pc(17) int local17;
		@Pc(44) int local44;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(79) int local79;
		@Pc(81) int local81;
		@Pc(99) int local99;
		for (local17 = 0; local17 < this.anInt771; local17++) {
			local44 = (this.anIntArray70[local17] - (this.anIntArray71[local17] * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830) - arg0.anInt3178;
			local67 = (this.anIntArray75[local17] - (this.anIntArray71[local17] * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830) - arg0.anInt3176;
			local72 = this.anIntArray77[local17];
			local79 = this.anIntArray77[local17 + 1];
			for (local81 = local72; local81 < local79 && this.aShortArray37[local81] != 0; local81++) {
				local99 = (this.aShortArray37[local81] & 0xFFFF) - 1;
				this.anIntArray73[local99] = local44;
				this.anIntArray81[local99] = local67;
			}
		}
		for (local17 = 0; local17 < this.anInt775; local17++) {
			if (this.aByteArray18 == null || this.aByteArray18[local17] <= 128) {
				local44 = this.aShortArray36[local17] & 0xFFFF;
				local67 = this.aShortArray35[local17] & 0xFFFF;
				local72 = this.aShortArray34[local17] & 0xFFFF;
				local79 = this.anIntArray73[local44];
				local81 = this.anIntArray73[local67];
				local99 = this.anIntArray73[local72];
				@Pc(170) int local170 = this.anIntArray81[local44];
				@Pc(175) int local175 = this.anIntArray81[local67];
				@Pc(180) int local180 = this.anIntArray81[local72];
				if ((local79 - local81) * (local175 - local180) - (local175 - local170) * (local99 - local81) > 0) {
					arg0.method23593(local170, local175, local180, local79, local81, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "jp", descriptor = "(Lclient!asy;)V", line = 2794)
	void method7002(@OriginalArg(0) Class77_Sub1_Sub16_Sub2 arg0) {
		if (this.anIntArray73.length < this.anInt772) {
			this.anIntArray73 = new int[this.anInt772];
			this.anIntArray81 = new int[this.anInt772];
		}
		@Pc(17) int local17;
		@Pc(44) int local44;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(79) int local79;
		@Pc(81) int local81;
		@Pc(99) int local99;
		for (local17 = 0; local17 < this.anInt771; local17++) {
			local44 = (this.anIntArray70[local17] - (this.anIntArray71[local17] * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830) - arg0.anInt3178;
			local67 = (this.anIntArray75[local17] - (this.anIntArray71[local17] * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830) - arg0.anInt3176;
			local72 = this.anIntArray77[local17];
			local79 = this.anIntArray77[local17 + 1];
			for (local81 = local72; local81 < local79 && this.aShortArray37[local81] != 0; local81++) {
				local99 = (this.aShortArray37[local81] & 0xFFFF) - 1;
				this.anIntArray73[local99] = local44;
				this.anIntArray81[local99] = local67;
			}
		}
		for (local17 = 0; local17 < this.anInt775; local17++) {
			if (this.aByteArray18 == null || this.aByteArray18[local17] <= 128) {
				local44 = this.aShortArray36[local17] & 0xFFFF;
				local67 = this.aShortArray35[local17] & 0xFFFF;
				local72 = this.aShortArray34[local17] & 0xFFFF;
				local79 = this.anIntArray73[local44];
				local81 = this.anIntArray73[local67];
				local99 = this.anIntArray73[local72];
				@Pc(170) int local170 = this.anIntArray81[local44];
				@Pc(175) int local175 = this.anIntArray81[local67];
				@Pc(180) int local180 = this.anIntArray81[local72];
				if ((local79 - local81) * (local175 - local180) - (local175 - local170) * (local99 - local81) > 0) {
					arg0.method23593(local170, local175, local180, local79, local81, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "jx", descriptor = "(Lclient!asy;)V", line = 2794)
	void method7003(@OriginalArg(0) Class77_Sub1_Sub16_Sub2 arg0) {
		if (this.anIntArray73.length < this.anInt772) {
			this.anIntArray73 = new int[this.anInt772];
			this.anIntArray81 = new int[this.anInt772];
		}
		@Pc(17) int local17;
		@Pc(44) int local44;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(79) int local79;
		@Pc(81) int local81;
		@Pc(99) int local99;
		for (local17 = 0; local17 < this.anInt771; local17++) {
			local44 = (this.anIntArray70[local17] - (this.anIntArray71[local17] * this.aClass86_Sub1_4.anInt2831 >> 8) >> this.aClass86_Sub1_4.anInt2830) - arg0.anInt3178;
			local67 = (this.anIntArray75[local17] - (this.anIntArray71[local17] * this.aClass86_Sub1_4.anInt2851 >> 8) >> this.aClass86_Sub1_4.anInt2830) - arg0.anInt3176;
			local72 = this.anIntArray77[local17];
			local79 = this.anIntArray77[local17 + 1];
			for (local81 = local72; local81 < local79 && this.aShortArray37[local81] != 0; local81++) {
				local99 = (this.aShortArray37[local81] & 0xFFFF) - 1;
				this.anIntArray73[local99] = local44;
				this.anIntArray81[local99] = local67;
			}
		}
		for (local17 = 0; local17 < this.anInt775; local17++) {
			if (this.aByteArray18 == null || this.aByteArray18[local17] <= 128) {
				local44 = this.aShortArray36[local17] & 0xFFFF;
				local67 = this.aShortArray35[local17] & 0xFFFF;
				local72 = this.aShortArray34[local17] & 0xFFFF;
				local79 = this.anIntArray73[local44];
				local81 = this.anIntArray73[local67];
				local99 = this.anIntArray73[local72];
				@Pc(170) int local170 = this.anIntArray81[local44];
				@Pc(175) int local175 = this.anIntArray81[local67];
				@Pc(180) int local180 = this.anIntArray81[local72];
				if ((local79 - local81) * (local175 - local180) - (local175 - local170) * (local99 - local81) > 0) {
					arg0.method23593(local170, local175, local180, local79, local81, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aey", name = "ce", descriptor = "(Lclient!ow;Lclient!eh;I)V", line = 2828)
	@Override
	public void method6814(@OriginalArg(0) Class455 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) int arg2) {
		if (aClass364_1 != null) {
			aClass364_1.method28130();
		}
		if (arg1 != null) {
			arg1.aBoolean644 = false;
		}
		if (this.anInt772 == 0) {
			return;
		}
		@Pc(16) Class442 local16 = this.aClass86_Sub1_4.aClass442_89;
		@Pc(20) Class442 local20 = this.aClass86_Sub1_4.aClass442_87;
		@Pc(24) Class442 local24 = this.aClass86_Sub1_4.aClass442_82;
		local20.method28969(arg0);
		local24.method28954(local20);
		local24.method28965(this.aClass86_Sub1_4.aClass442_93);
		if (!this.aBoolean158) {
			this.method6991();
		}
		@Pc(44) float[] local44 = this.aClass86_Sub1_4.aFloatArray70;
		local20.method28984(0.0F, (float) this.anInt767, 0.0F, local44);
		@Pc(56) float local56 = local44[0];
		@Pc(60) float local60 = local44[1];
		@Pc(64) float local64 = local44[2];
		local20.method28984(0.0F, (float) this.anInt778, 0.0F, local44);
		@Pc(76) float local76 = local44[0];
		@Pc(80) float local80 = local44[1];
		@Pc(84) float local84 = local44[2];
		@Pc(121) float local121;
		@Pc(147) float local147;
		for (@Pc(86) int local86 = 0; local86 < 6; local86++) {
			@Pc(95) float[] local95 = this.aClass86_Sub1_4.aFloatArrayArray21[local86];
			local121 = local95[0] * local56 + local95[1] * local60 + local95[2] * local64 + local95[3] + (float) this.anInt784;
			local147 = local95[0] * local76 + local95[1] * local80 + local95[2] * local84 + local95[3] + (float) this.anInt784;
			if (local121 < 0.0F && local147 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(162) boolean local162 = false;
			@Pc(164) boolean local164 = true;
			@Pc(172) int local172 = this.anInt782 + this.anInt779 >> 1;
			@Pc(180) int local180 = this.anInt780 + this.anInt783 >> 1;
			@Pc(185) int local185 = this.anInt767;
			@Pc(216) float local216 = local24.aFloatArray109[0] * (float) local172 + local24.aFloatArray109[4] * (float) local185 + local24.aFloatArray109[8] * (float) local180 + local24.aFloatArray109[12];
			@Pc(245) float local245 = local24.aFloatArray109[1] * (float) local172 + local24.aFloatArray109[5] * (float) local185 + local24.aFloatArray109[9] * (float) local180 + local24.aFloatArray109[13];
			local121 = local24.aFloatArray109[2] * (float) local172 + local24.aFloatArray109[6] * (float) local185 + local24.aFloatArray109[10] * (float) local180 + local24.aFloatArray109[14];
			local147 = local24.aFloatArray109[3] * (float) local172 + local24.aFloatArray109[7] * (float) local185 + local24.aFloatArray109[11] * (float) local180 + local24.aFloatArray109[15];
			if (local121 >= -local147) {
				arg1.anInt3745 = (int) (this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local216 / local147);
				arg1.anInt3746 = (int) (this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local245 / local147);
			} else {
				local162 = true;
			}
			local185 = this.anInt778;
			@Pc(375) float local375 = local24.aFloatArray109[0] * (float) local172 + local24.aFloatArray109[4] * (float) local185 + local24.aFloatArray109[8] * (float) local180 + local24.aFloatArray109[12];
			@Pc(404) float local404 = local24.aFloatArray109[1] * (float) local172 + local24.aFloatArray109[5] * (float) local185 + local24.aFloatArray109[9] * (float) local180 + local24.aFloatArray109[13];
			@Pc(433) float local433 = local24.aFloatArray109[2] * (float) local172 + local24.aFloatArray109[6] * (float) local185 + local24.aFloatArray109[10] * (float) local180 + local24.aFloatArray109[14];
			@Pc(462) float local462 = local24.aFloatArray109[3] * (float) local172 + local24.aFloatArray109[7] * (float) local185 + local24.aFloatArray109[11] * (float) local180 + local24.aFloatArray109[15];
			if (local433 >= -local462) {
				arg1.anInt3748 = (int) (this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local375 / local462);
				arg1.anInt3747 = (int) (this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local404 / local462);
			} else {
				local162 = true;
			}
			@Pc(528) float local528;
			@Pc(536) float local536;
			if (local162) {
				if (local121 < -local147 && local433 < -local462) {
					local164 = false;
				} else {
					@Pc(544) float local544;
					@Pc(552) float local552;
					if (local121 < -local147) {
						local528 = (local121 + local147) / (local433 + local462) - 1.0F;
						local536 = local216 + local528 * (local375 - local216);
						local544 = local245 + local528 * (local404 - local245);
						local552 = local147 + local528 * (local462 - local147);
						arg1.anInt3745 = (int) (this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local536 / local552);
						arg1.anInt3746 = (int) (this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local544 / local552);
					} else if (local433 < -local462) {
						local528 = (local433 + local462) / (local121 + local147) - 1.0F;
						local536 = local375 + local528 * (local216 - local375);
						local544 = local404 + local528 * (local245 - local404);
						local552 = local462 + local528 * (local147 - local462);
						arg1.anInt3748 = (int) (this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local536 / local552);
						arg1.anInt3747 = (int) (this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local544 / local552);
					}
				}
			}
			if (local164) {
				if (local121 / local147 > local433 / local462) {
					local528 = local216 + local16.aFloatArray109[0] * (float) this.anInt784 + local16.aFloatArray109[12];
					local536 = local147 + local16.aFloatArray109[3] * (float) this.anInt784 + local16.aFloatArray109[15];
					arg1.anInt3744 = (int) (this.aClass86_Sub1_4.aFloat207 - (float) arg1.anInt3745 + this.aClass86_Sub1_4.aFloat197 * local528 / local536);
				} else {
					local528 = local375 + local16.aFloatArray109[0] * (float) this.anInt784 + local16.aFloatArray109[12];
					local536 = local462 + local16.aFloatArray109[3] * (float) this.anInt784 + local16.aFloatArray109[15];
					arg1.anInt3744 = (int) (this.aClass86_Sub1_4.aFloat207 - (float) arg1.anInt3748 + this.aClass86_Sub1_4.aFloat197 * local528 / local536);
				}
				arg1.aBoolean644 = true;
			}
		}
		this.aClass86_Sub1_4.method20622(arg2);
		this.method7004(arg0);
		this.aClass86_Sub1_4.method20622(0);
		local20.method28969(arg0);
		local20.method28965(this.aClass86_Sub1_4.aClass442_79);
		this.method7007(local20);
	}

	@OriginalMember(owner = "client!aey", name = "ax", descriptor = "(Lclient!ow;Lclient!eh;I)V", line = 2828)
	@Override
	public void method6813(@OriginalArg(0) Class455 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) int arg2) {
		if (aClass364_1 != null) {
			aClass364_1.method28130();
		}
		if (arg1 != null) {
			arg1.aBoolean644 = false;
		}
		if (this.anInt772 == 0) {
			return;
		}
		@Pc(16) Class442 local16 = this.aClass86_Sub1_4.aClass442_89;
		@Pc(20) Class442 local20 = this.aClass86_Sub1_4.aClass442_87;
		@Pc(24) Class442 local24 = this.aClass86_Sub1_4.aClass442_82;
		local20.method28969(arg0);
		local24.method28954(local20);
		local24.method28965(this.aClass86_Sub1_4.aClass442_93);
		if (!this.aBoolean158) {
			this.method6991();
		}
		@Pc(44) float[] local44 = this.aClass86_Sub1_4.aFloatArray70;
		local20.method28984(0.0F, (float) this.anInt767, 0.0F, local44);
		@Pc(56) float local56 = local44[0];
		@Pc(60) float local60 = local44[1];
		@Pc(64) float local64 = local44[2];
		local20.method28984(0.0F, (float) this.anInt778, 0.0F, local44);
		@Pc(76) float local76 = local44[0];
		@Pc(80) float local80 = local44[1];
		@Pc(84) float local84 = local44[2];
		@Pc(121) float local121;
		@Pc(147) float local147;
		for (@Pc(86) int local86 = 0; local86 < 6; local86++) {
			@Pc(95) float[] local95 = this.aClass86_Sub1_4.aFloatArrayArray21[local86];
			local121 = local95[0] * local56 + local95[1] * local60 + local95[2] * local64 + local95[3] + (float) this.anInt784;
			local147 = local95[0] * local76 + local95[1] * local80 + local95[2] * local84 + local95[3] + (float) this.anInt784;
			if (local121 < 0.0F && local147 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(162) boolean local162 = false;
			@Pc(164) boolean local164 = true;
			@Pc(172) int local172 = this.anInt782 + this.anInt779 >> 1;
			@Pc(180) int local180 = this.anInt780 + this.anInt783 >> 1;
			@Pc(185) int local185 = this.anInt767;
			@Pc(216) float local216 = local24.aFloatArray109[0] * (float) local172 + local24.aFloatArray109[4] * (float) local185 + local24.aFloatArray109[8] * (float) local180 + local24.aFloatArray109[12];
			@Pc(245) float local245 = local24.aFloatArray109[1] * (float) local172 + local24.aFloatArray109[5] * (float) local185 + local24.aFloatArray109[9] * (float) local180 + local24.aFloatArray109[13];
			local121 = local24.aFloatArray109[2] * (float) local172 + local24.aFloatArray109[6] * (float) local185 + local24.aFloatArray109[10] * (float) local180 + local24.aFloatArray109[14];
			local147 = local24.aFloatArray109[3] * (float) local172 + local24.aFloatArray109[7] * (float) local185 + local24.aFloatArray109[11] * (float) local180 + local24.aFloatArray109[15];
			if (local121 >= -local147) {
				arg1.anInt3745 = (int) (this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local216 / local147);
				arg1.anInt3746 = (int) (this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local245 / local147);
			} else {
				local162 = true;
			}
			local185 = this.anInt778;
			@Pc(375) float local375 = local24.aFloatArray109[0] * (float) local172 + local24.aFloatArray109[4] * (float) local185 + local24.aFloatArray109[8] * (float) local180 + local24.aFloatArray109[12];
			@Pc(404) float local404 = local24.aFloatArray109[1] * (float) local172 + local24.aFloatArray109[5] * (float) local185 + local24.aFloatArray109[9] * (float) local180 + local24.aFloatArray109[13];
			@Pc(433) float local433 = local24.aFloatArray109[2] * (float) local172 + local24.aFloatArray109[6] * (float) local185 + local24.aFloatArray109[10] * (float) local180 + local24.aFloatArray109[14];
			@Pc(462) float local462 = local24.aFloatArray109[3] * (float) local172 + local24.aFloatArray109[7] * (float) local185 + local24.aFloatArray109[11] * (float) local180 + local24.aFloatArray109[15];
			if (local433 >= -local462) {
				arg1.anInt3748 = (int) (this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local375 / local462);
				arg1.anInt3747 = (int) (this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local404 / local462);
			} else {
				local162 = true;
			}
			@Pc(528) float local528;
			@Pc(536) float local536;
			if (local162) {
				if (local121 < -local147 && local433 < -local462) {
					local164 = false;
				} else {
					@Pc(544) float local544;
					@Pc(552) float local552;
					if (local121 < -local147) {
						local528 = (local121 + local147) / (local433 + local462) - 1.0F;
						local536 = local216 + local528 * (local375 - local216);
						local544 = local245 + local528 * (local404 - local245);
						local552 = local147 + local528 * (local462 - local147);
						arg1.anInt3745 = (int) (this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local536 / local552);
						arg1.anInt3746 = (int) (this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local544 / local552);
					} else if (local433 < -local462) {
						local528 = (local433 + local462) / (local121 + local147) - 1.0F;
						local536 = local375 + local528 * (local216 - local375);
						local544 = local404 + local528 * (local245 - local404);
						local552 = local462 + local528 * (local147 - local462);
						arg1.anInt3748 = (int) (this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local536 / local552);
						arg1.anInt3747 = (int) (this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local544 / local552);
					}
				}
			}
			if (local164) {
				if (local121 / local147 > local433 / local462) {
					local528 = local216 + local16.aFloatArray109[0] * (float) this.anInt784 + local16.aFloatArray109[12];
					local536 = local147 + local16.aFloatArray109[3] * (float) this.anInt784 + local16.aFloatArray109[15];
					arg1.anInt3744 = (int) (this.aClass86_Sub1_4.aFloat207 - (float) arg1.anInt3745 + this.aClass86_Sub1_4.aFloat197 * local528 / local536);
				} else {
					local528 = local375 + local16.aFloatArray109[0] * (float) this.anInt784 + local16.aFloatArray109[12];
					local536 = local462 + local16.aFloatArray109[3] * (float) this.anInt784 + local16.aFloatArray109[15];
					arg1.anInt3744 = (int) (this.aClass86_Sub1_4.aFloat207 - (float) arg1.anInt3748 + this.aClass86_Sub1_4.aFloat197 * local528 / local536);
				}
				arg1.aBoolean644 = true;
			}
		}
		this.aClass86_Sub1_4.method20622(arg2);
		this.method7004(arg0);
		this.aClass86_Sub1_4.method20622(0);
		local20.method28969(arg0);
		local20.method28965(this.aClass86_Sub1_4.aClass442_79);
		this.method7007(local20);
	}

	@OriginalMember(owner = "client!aey", name = "cj", descriptor = "(Lclient!ow;Lclient!eh;I)V", line = 2828)
	@Override
	public void method6939(@OriginalArg(0) Class455 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) int arg2) {
		if (aClass364_1 != null) {
			aClass364_1.method28130();
		}
		if (arg1 != null) {
			arg1.aBoolean644 = false;
		}
		if (this.anInt772 == 0) {
			return;
		}
		@Pc(16) Class442 local16 = this.aClass86_Sub1_4.aClass442_89;
		@Pc(20) Class442 local20 = this.aClass86_Sub1_4.aClass442_87;
		@Pc(24) Class442 local24 = this.aClass86_Sub1_4.aClass442_82;
		local20.method28969(arg0);
		local24.method28954(local20);
		local24.method28965(this.aClass86_Sub1_4.aClass442_93);
		if (!this.aBoolean158) {
			this.method6991();
		}
		@Pc(44) float[] local44 = this.aClass86_Sub1_4.aFloatArray70;
		local20.method28984(0.0F, (float) this.anInt767, 0.0F, local44);
		@Pc(56) float local56 = local44[0];
		@Pc(60) float local60 = local44[1];
		@Pc(64) float local64 = local44[2];
		local20.method28984(0.0F, (float) this.anInt778, 0.0F, local44);
		@Pc(76) float local76 = local44[0];
		@Pc(80) float local80 = local44[1];
		@Pc(84) float local84 = local44[2];
		@Pc(121) float local121;
		@Pc(147) float local147;
		for (@Pc(86) int local86 = 0; local86 < 6; local86++) {
			@Pc(95) float[] local95 = this.aClass86_Sub1_4.aFloatArrayArray21[local86];
			local121 = local95[0] * local56 + local95[1] * local60 + local95[2] * local64 + local95[3] + (float) this.anInt784;
			local147 = local95[0] * local76 + local95[1] * local80 + local95[2] * local84 + local95[3] + (float) this.anInt784;
			if (local121 < 0.0F && local147 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(162) boolean local162 = false;
			@Pc(164) boolean local164 = true;
			@Pc(172) int local172 = this.anInt782 + this.anInt779 >> 1;
			@Pc(180) int local180 = this.anInt780 + this.anInt783 >> 1;
			@Pc(185) int local185 = this.anInt767;
			@Pc(216) float local216 = local24.aFloatArray109[0] * (float) local172 + local24.aFloatArray109[4] * (float) local185 + local24.aFloatArray109[8] * (float) local180 + local24.aFloatArray109[12];
			@Pc(245) float local245 = local24.aFloatArray109[1] * (float) local172 + local24.aFloatArray109[5] * (float) local185 + local24.aFloatArray109[9] * (float) local180 + local24.aFloatArray109[13];
			local121 = local24.aFloatArray109[2] * (float) local172 + local24.aFloatArray109[6] * (float) local185 + local24.aFloatArray109[10] * (float) local180 + local24.aFloatArray109[14];
			local147 = local24.aFloatArray109[3] * (float) local172 + local24.aFloatArray109[7] * (float) local185 + local24.aFloatArray109[11] * (float) local180 + local24.aFloatArray109[15];
			if (local121 >= -local147) {
				arg1.anInt3745 = (int) (this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local216 / local147);
				arg1.anInt3746 = (int) (this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local245 / local147);
			} else {
				local162 = true;
			}
			local185 = this.anInt778;
			@Pc(375) float local375 = local24.aFloatArray109[0] * (float) local172 + local24.aFloatArray109[4] * (float) local185 + local24.aFloatArray109[8] * (float) local180 + local24.aFloatArray109[12];
			@Pc(404) float local404 = local24.aFloatArray109[1] * (float) local172 + local24.aFloatArray109[5] * (float) local185 + local24.aFloatArray109[9] * (float) local180 + local24.aFloatArray109[13];
			@Pc(433) float local433 = local24.aFloatArray109[2] * (float) local172 + local24.aFloatArray109[6] * (float) local185 + local24.aFloatArray109[10] * (float) local180 + local24.aFloatArray109[14];
			@Pc(462) float local462 = local24.aFloatArray109[3] * (float) local172 + local24.aFloatArray109[7] * (float) local185 + local24.aFloatArray109[11] * (float) local180 + local24.aFloatArray109[15];
			if (local433 >= -local462) {
				arg1.anInt3748 = (int) (this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local375 / local462);
				arg1.anInt3747 = (int) (this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local404 / local462);
			} else {
				local162 = true;
			}
			@Pc(528) float local528;
			@Pc(536) float local536;
			if (local162) {
				if (local121 < -local147 && local433 < -local462) {
					local164 = false;
				} else {
					@Pc(544) float local544;
					@Pc(552) float local552;
					if (local121 < -local147) {
						local528 = (local121 + local147) / (local433 + local462) - 1.0F;
						local536 = local216 + local528 * (local375 - local216);
						local544 = local245 + local528 * (local404 - local245);
						local552 = local147 + local528 * (local462 - local147);
						arg1.anInt3745 = (int) (this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local536 / local552);
						arg1.anInt3746 = (int) (this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local544 / local552);
					} else if (local433 < -local462) {
						local528 = (local433 + local462) / (local121 + local147) - 1.0F;
						local536 = local375 + local528 * (local216 - local375);
						local544 = local404 + local528 * (local245 - local404);
						local552 = local462 + local528 * (local147 - local462);
						arg1.anInt3748 = (int) (this.aClass86_Sub1_4.aFloat207 + this.aClass86_Sub1_4.aFloat197 * local536 / local552);
						arg1.anInt3747 = (int) (this.aClass86_Sub1_4.aFloat198 + this.aClass86_Sub1_4.aFloat199 * local544 / local552);
					}
				}
			}
			if (local164) {
				if (local121 / local147 > local433 / local462) {
					local528 = local216 + local16.aFloatArray109[0] * (float) this.anInt784 + local16.aFloatArray109[12];
					local536 = local147 + local16.aFloatArray109[3] * (float) this.anInt784 + local16.aFloatArray109[15];
					arg1.anInt3744 = (int) (this.aClass86_Sub1_4.aFloat207 - (float) arg1.anInt3745 + this.aClass86_Sub1_4.aFloat197 * local528 / local536);
				} else {
					local528 = local375 + local16.aFloatArray109[0] * (float) this.anInt784 + local16.aFloatArray109[12];
					local536 = local462 + local16.aFloatArray109[3] * (float) this.anInt784 + local16.aFloatArray109[15];
					arg1.anInt3744 = (int) (this.aClass86_Sub1_4.aFloat207 - (float) arg1.anInt3748 + this.aClass86_Sub1_4.aFloat197 * local528 / local536);
				}
				arg1.aBoolean644 = true;
			}
		}
		this.aClass86_Sub1_4.method20622(arg2);
		this.method7004(arg0);
		this.aClass86_Sub1_4.method20622(0);
		local20.method28969(arg0);
		local20.method28965(this.aClass86_Sub1_4.aClass442_79);
		this.method7007(local20);
	}

	@OriginalMember(owner = "client!aey", name = "id", descriptor = "(Lclient!ow;)V", line = 2931)
	void method7004(@OriginalArg(0) Class455 arg0) {
		if (this.anInt775 == 0 || (!this.method7010() || !this.method7009())) {
			return;
		}
		if (aClass364_1 != null) {
		}
		this.aClass86_Sub1_4.method20600();
		this.aClass86_Sub1_4.method20527();
		@Pc(22) Class109 local22 = this.aClass86_Sub1_4.aClass109_3;
		this.aClass86_Sub1_4.method20670(0, this.aClass389_1.anInterface36_22);
		this.aClass86_Sub1_4.method20670(1, this.aClass389_2.anInterface36_22);
		this.aClass86_Sub1_4.method20670(2, this.aClass389_4.anInterface36_22);
		this.aClass86_Sub1_4.method20659(this.aClass356_1.anInterface38_5);
		this.aClass86_Sub1_4.aClass442_87.method28969(arg0);
		local22.method9101(this.aClass86_Sub1_4.aClass442_87);
		local22.aClass442_48.method28951();
		if (this.aClass86_Sub1_4.aBoolean447) {
			@Pc(70) Class202 local70 = this.aClass86_Sub1_4.method20575();
			local22.aClass450_10.method29234(0.0F, 1.0F, 0.0F, (float) -this.aClass86_Sub1_4.anInt2839);
			local22.aClass450_10.method29253(3.0F / (float) (local70.anInt3553 * -1095140607));
			local22.aClass447_31.method29133((float) (local70.anInt3554 * 2113275141 >> 16 & 0xFF) / 255.0F, (float) (local70.anInt3554 * 2113275141 >> 8 & 0xFF) / 255.0F, (float) (local70.anInt3554 * 2113275141 >> 0 & 0xFF) / 255.0F);
		} else {
			local22.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
			local22.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
		}
		if (this.aClass86_Sub1_4.anInt2841 > 0) {
			local22.aClass450_11.method29234(0.0F, 0.0F, 1.0F, -this.aClass86_Sub1_4.aFloat205);
			local22.aClass447_33.method29133((float) (this.aClass86_Sub1_4.anInt2840 >> 16 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_4.anInt2840 >> 8 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_4.anInt2840 >> 0 & 0xFF) / 255.0F);
			this.aClass86_Sub1_4.aClass442_87.method28969(arg0);
			this.aClass86_Sub1_4.aClass442_87.method29034();
			local22.aClass450_10.method29255(this.aClass86_Sub1_4.aClass442_87);
			this.aClass86_Sub1_4.aClass442_87.method28969(arg0);
			this.aClass86_Sub1_4.aClass442_87.method28965(this.aClass86_Sub1_4.aClass442_79);
			this.aClass86_Sub1_4.aClass442_87.method29034();
			local22.aClass450_11.method29255(this.aClass86_Sub1_4.aClass442_87);
			local22.aClass450_11.method29253(1.0F / (this.aClass86_Sub1_4.aFloat206 - this.aClass86_Sub1_4.aFloat205));
		} else {
			local22.aClass450_11.method29234(0.0F, 0.0F, 0.0F, 0.0F);
			local22.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
		}
		@Pc(282) int local282;
		@Pc(289) int local289;
		if ((this.anInt787 & 0x37) == 0) {
			this.aClass86_Sub1_4.method20658(this.aClass86_Sub1_4.aClass113_18);
			if (this.aClass86_Sub1_4.aBoolean434) {
				this.aClass86_Sub1_4.method20522(false);
			}
			for (@Pc(272) int local272 = 0; local272 < this.anIntArray78.length; local272++) {
				local282 = this.anIntArray74[local272];
				local289 = this.anIntArray74[local272 + 1];
				@Pc(294) short local294 = this.aShortArray32[local282];
				@Pc(296) boolean local296 = false;
				@Pc(298) byte local298 = 0;
				if (local294 == -1) {
					local22.anInterface37_18 = this.aClass86_Sub1_4.anInterface37_23;
					@Pc(385) float[] local385 = local22.aClass442_48.aFloatArray109;
					local22.aClass442_48.aFloatArray109[13] = 0.0F;
					local385[12] = 0.0F;
				} else {
					@Pc(310) Class215 local310 = this.aClass86_Sub1_4.aClass209_9.method25584(local294 & 0xFFFF);
					local22.anInterface37_18 = this.aClass86_Sub1_4.aClass370_3.method28225(local310);
					local296 = !Class683.method36096(local310.aByte118);
					local22.aClass442_48.aFloatArray109[12] = (float) (this.aClass86_Sub1_4.anInt2845 % 128000) / 1000.0F * (float) local310.aByte113 / 64.0F % 1.0F;
					local22.aClass442_48.aFloatArray109[13] = (float) (this.aClass86_Sub1_4.anInt2845 % 128000) / 1000.0F * (float) local310.aByte114 / 64.0F % 1.0F;
					if (local310.aClass597_2 == Class597.aClass597_3) {
						local298 = local310.aByte115;
					}
				}
				this.aClass86_Sub1_4.method20583(local298);
				local22.anInt1089 = this.anIntArray78[local272];
				local22.anInt1087 = this.anIntArray79[local272];
				local22.anInt1090 = local282 * 3;
				local22.anInt1091 = local289 - local282;
				local22.method9117(local296);
			}
		} else {
			this.aClass86_Sub1_4.method20670(3, this.aClass389_3.anInterface36_22);
			this.aClass86_Sub1_4.method20658(this.aClass86_Sub1_4.aClass113_20);
			@Pc(444) Class455 local444 = this.aClass86_Sub1_4.aClass455_38;
			local444.method29387(arg0);
			local444.method29409();
			local282 = 0;
			@Pc(571) int local571;
			if (this.aClass86_Sub1_4.aBoolean434) {
				this.aClass86_Sub1_4.method20522(true);
			} else {
				local22.aClass447_34.method29133(this.aClass86_Sub1_4.aFloatArray71[0], this.aClass86_Sub1_4.aFloatArray71[1], this.aClass86_Sub1_4.aFloatArray71[2]);
				local22.aClass447_34.method29209(local444);
				local22.aClass447_35.method29133(this.aClass86_Sub1_4.aFloat204 * this.aClass86_Sub1_4.aFloat195, this.aClass86_Sub1_4.aFloat204 * this.aClass86_Sub1_4.aFloat209, this.aClass86_Sub1_4.aFloat204 * this.aClass86_Sub1_4.aFloat196);
				local22.aClass447_36.method29133(-this.aClass86_Sub1_4.aFloat208 * this.aClass86_Sub1_4.aFloat195, -this.aClass86_Sub1_4.aFloat208 * this.aClass86_Sub1_4.aFloat209, -this.aClass86_Sub1_4.aFloat208 * this.aClass86_Sub1_4.aFloat196);
				local22.aClass447_37.method29133(this.aClass86_Sub1_4.aFloat203 * this.aClass86_Sub1_4.aFloat195, this.aClass86_Sub1_4.aFloat203 * this.aClass86_Sub1_4.aFloat209, this.aClass86_Sub1_4.aFloat203 * this.aClass86_Sub1_4.aFloat196);
				if (this.aClass86_Sub1_4.anInt2828 > 0) {
					local282 = this.aClass86_Sub1_4.anInt2828;
					@Pc(569) Class447 local569 = this.aClass86_Sub1_4.aClass447_59;
					for (local571 = 0; local571 < local282; local571++) {
						@Pc(580) Class77_Sub22 local580 = this.aClass86_Sub1_4.aClass77_Sub22Array18[local571];
						@Pc(584) int local584 = local580.method13557();
						local569.method29136(local580.aClass447_47);
						local569.method29204(local444);
						local22.aFloatArray48[local571 * 4] = local569.aFloat277;
						local22.aFloatArray48[local571 * 4 + 1] = local569.aFloat276;
						local22.aFloatArray48[local571 * 4 + 2] = local569.aFloat278;
						local22.aFloatArray48[local571 * 4 + 3] = 1.0F / (float) (local580.method13555() * local580.method13555());
						@Pc(645) float local645 = local580.method13561() / 255.0F;
						local22.aFloatArray47[local571 * 4] = (float) (local584 >> 16 & 0xFF) * local645;
						local22.aFloatArray47[local571 * 4 + 1] = (float) (local584 >> 8 & 0xFF) * local645;
						local22.aFloatArray47[local571 * 4 + 2] = (float) (local584 & 0xFF) * local645;
						local22.aFloatArray47[local571 * 4 + 3] = 1.0F;
					}
				}
			}
			for (local289 = 0; local289 < this.anIntArray78.length; local289++) {
				local571 = this.anIntArray74[local289];
				@Pc(721) int local721 = this.anIntArray74[local289 + 1];
				@Pc(726) short local726 = this.aShortArray32[local571];
				@Pc(728) byte local728 = 11;
				@Pc(730) Class215 local730 = null;
				@Pc(732) byte local732 = 0;
				if (local726 == -1) {
					local22.anInterface37_18 = this.aClass86_Sub1_4.anInterface37_23;
					@Pc(817) float[] local817 = local22.aClass442_48.aFloatArray109;
					local22.aClass442_48.aFloatArray109[13] = 0.0F;
					local817[12] = 0.0F;
				} else {
					local730 = this.aClass86_Sub1_4.aClass209_9.method25584(local726 & 0xFFFF);
					local22.anInterface37_18 = this.aClass86_Sub1_4.aClass370_3.method28225(local730);
					local728 = local730.aByte118;
					local22.method9097(local730.aByte119);
					local22.aClass442_48.aFloatArray109[12] = (float) (this.aClass86_Sub1_4.anInt2845 % 128000) / 1000.0F * (float) local730.aByte113 / 64.0F % 1.0F;
					local22.aClass442_48.aFloatArray109[13] = (float) (this.aClass86_Sub1_4.anInt2845 % 128000) / 1000.0F * (float) local730.aByte114 / 64.0F % 1.0F;
					if (local730.aClass597_2 == Class597.aClass597_3) {
						local732 = local730.aByte115;
					}
				}
				this.aClass86_Sub1_4.method20583(local732);
				local22.anInt1089 = this.anIntArray78[local289];
				local22.anInt1087 = this.anIntArray79[local289];
				local22.anInt1090 = local571 * 3;
				local22.anInt1091 = local721 - local571;
				switch(local728) {
					case 1:
						local22.aClass447_32.method29133(this.aClass86_Sub1_4.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_4.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_4.aClass442_78.aFloatArray109[14]);
						local22.aClass447_32.method29204(local444);
						local22.method9116(local282);
						break;
					case 2:
					case 3:
					case 4:
					default:
						local22.method9103(local282);
						break;
					case 5:
						if (this.aClass86_Sub1_4.aBoolean434) {
							local22.method9103(local282);
						} else {
							@Pc(877) Class122_Sub1_Sub1 local877 = this.aClass86_Sub1_4.aClass122_Sub1_Sub1_3;
							local877.method18532(local730.aByte119, local730.anInt3728 * 1880963453);
							local877.aClass442_56.method28969(arg0);
							local877.aClass442_55.method28969(arg0);
							local877.aClass442_55.method28965(this.aClass86_Sub1_4.aClass442_84);
							local877.anInt2587 = this.anIntArray78[local289] * -89724309;
							local877.anInt2588 = this.anIntArray79[local289] * -890917363;
							local877.anInt2589 = local571 * -1012786239;
							local877.anInt2586 = (local721 - local571) * -694101341;
							local877.method18536();
						}
						break;
					case 6:
						local22.method9117(!Class683.method36096(local728));
						break;
					case 7:
						local22.aClass447_32.method29133(this.aClass86_Sub1_4.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_4.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_4.aClass442_78.aFloatArray109[14]);
						local22.aClass447_32.method29204(local444);
						local22.aClass442_49.method28969(arg0);
						local22.anInterface40_3 = this.aClass86_Sub1_4.method20458();
						local22.method9111(local282);
				}
			}
		}
		this.method6979();
	}

	@OriginalMember(owner = "client!aey", name = "jh", descriptor = "(Lclient!ow;)V", line = 2931)
	void method7005(@OriginalArg(0) Class455 arg0) {
		if (this.anInt775 == 0 || (!this.method7010() || !this.method7009())) {
			return;
		}
		if (aClass364_1 != null) {
		}
		this.aClass86_Sub1_4.method20600();
		this.aClass86_Sub1_4.method20527();
		@Pc(22) Class109 local22 = this.aClass86_Sub1_4.aClass109_3;
		this.aClass86_Sub1_4.method20670(0, this.aClass389_1.anInterface36_22);
		this.aClass86_Sub1_4.method20670(1, this.aClass389_2.anInterface36_22);
		this.aClass86_Sub1_4.method20670(2, this.aClass389_4.anInterface36_22);
		this.aClass86_Sub1_4.method20659(this.aClass356_1.anInterface38_5);
		this.aClass86_Sub1_4.aClass442_87.method28969(arg0);
		local22.method9101(this.aClass86_Sub1_4.aClass442_87);
		local22.aClass442_48.method28951();
		if (this.aClass86_Sub1_4.aBoolean447) {
			@Pc(70) Class202 local70 = this.aClass86_Sub1_4.method20575();
			local22.aClass450_10.method29234(0.0F, 1.0F, 0.0F, (float) -this.aClass86_Sub1_4.anInt2839);
			local22.aClass450_10.method29253(3.0F / (float) (local70.anInt3553 * -1095140607));
			local22.aClass447_31.method29133((float) (local70.anInt3554 * 2113275141 >> 16 & 0xFF) / 255.0F, (float) (local70.anInt3554 * 2113275141 >> 8 & 0xFF) / 255.0F, (float) (local70.anInt3554 * 2113275141 >> 0 & 0xFF) / 255.0F);
		} else {
			local22.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
			local22.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
		}
		if (this.aClass86_Sub1_4.anInt2841 > 0) {
			local22.aClass450_11.method29234(0.0F, 0.0F, 1.0F, -this.aClass86_Sub1_4.aFloat205);
			local22.aClass447_33.method29133((float) (this.aClass86_Sub1_4.anInt2840 >> 16 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_4.anInt2840 >> 8 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_4.anInt2840 >> 0 & 0xFF) / 255.0F);
			this.aClass86_Sub1_4.aClass442_87.method28969(arg0);
			this.aClass86_Sub1_4.aClass442_87.method29034();
			local22.aClass450_10.method29255(this.aClass86_Sub1_4.aClass442_87);
			this.aClass86_Sub1_4.aClass442_87.method28969(arg0);
			this.aClass86_Sub1_4.aClass442_87.method28965(this.aClass86_Sub1_4.aClass442_79);
			this.aClass86_Sub1_4.aClass442_87.method29034();
			local22.aClass450_11.method29255(this.aClass86_Sub1_4.aClass442_87);
			local22.aClass450_11.method29253(1.0F / (this.aClass86_Sub1_4.aFloat206 - this.aClass86_Sub1_4.aFloat205));
		} else {
			local22.aClass450_11.method29234(0.0F, 0.0F, 0.0F, 0.0F);
			local22.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
		}
		@Pc(282) int local282;
		@Pc(289) int local289;
		if ((this.anInt787 & 0x37) == 0) {
			this.aClass86_Sub1_4.method20658(this.aClass86_Sub1_4.aClass113_18);
			if (this.aClass86_Sub1_4.aBoolean434) {
				this.aClass86_Sub1_4.method20522(false);
			}
			for (@Pc(272) int local272 = 0; local272 < this.anIntArray78.length; local272++) {
				local282 = this.anIntArray74[local272];
				local289 = this.anIntArray74[local272 + 1];
				@Pc(294) short local294 = this.aShortArray32[local282];
				@Pc(296) boolean local296 = false;
				@Pc(298) byte local298 = 0;
				if (local294 == -1) {
					local22.anInterface37_18 = this.aClass86_Sub1_4.anInterface37_23;
					@Pc(385) float[] local385 = local22.aClass442_48.aFloatArray109;
					local22.aClass442_48.aFloatArray109[13] = 0.0F;
					local385[12] = 0.0F;
				} else {
					@Pc(310) Class215 local310 = this.aClass86_Sub1_4.aClass209_9.method25584(local294 & 0xFFFF);
					local22.anInterface37_18 = this.aClass86_Sub1_4.aClass370_3.method28225(local310);
					local296 = !Class683.method36096(local310.aByte118);
					local22.aClass442_48.aFloatArray109[12] = (float) (this.aClass86_Sub1_4.anInt2845 % 128000) / 1000.0F * (float) local310.aByte113 / 64.0F % 1.0F;
					local22.aClass442_48.aFloatArray109[13] = (float) (this.aClass86_Sub1_4.anInt2845 % 128000) / 1000.0F * (float) local310.aByte114 / 64.0F % 1.0F;
					if (local310.aClass597_2 == Class597.aClass597_3) {
						local298 = local310.aByte115;
					}
				}
				this.aClass86_Sub1_4.method20583(local298);
				local22.anInt1089 = this.anIntArray78[local272];
				local22.anInt1087 = this.anIntArray79[local272];
				local22.anInt1090 = local282 * 3;
				local22.anInt1091 = local289 - local282;
				local22.method9117(local296);
			}
		} else {
			this.aClass86_Sub1_4.method20670(3, this.aClass389_3.anInterface36_22);
			this.aClass86_Sub1_4.method20658(this.aClass86_Sub1_4.aClass113_20);
			@Pc(444) Class455 local444 = this.aClass86_Sub1_4.aClass455_38;
			local444.method29387(arg0);
			local444.method29409();
			local282 = 0;
			@Pc(571) int local571;
			if (this.aClass86_Sub1_4.aBoolean434) {
				this.aClass86_Sub1_4.method20522(true);
			} else {
				local22.aClass447_34.method29133(this.aClass86_Sub1_4.aFloatArray71[0], this.aClass86_Sub1_4.aFloatArray71[1], this.aClass86_Sub1_4.aFloatArray71[2]);
				local22.aClass447_34.method29209(local444);
				local22.aClass447_35.method29133(this.aClass86_Sub1_4.aFloat204 * this.aClass86_Sub1_4.aFloat195, this.aClass86_Sub1_4.aFloat204 * this.aClass86_Sub1_4.aFloat209, this.aClass86_Sub1_4.aFloat204 * this.aClass86_Sub1_4.aFloat196);
				local22.aClass447_36.method29133(-this.aClass86_Sub1_4.aFloat208 * this.aClass86_Sub1_4.aFloat195, -this.aClass86_Sub1_4.aFloat208 * this.aClass86_Sub1_4.aFloat209, -this.aClass86_Sub1_4.aFloat208 * this.aClass86_Sub1_4.aFloat196);
				local22.aClass447_37.method29133(this.aClass86_Sub1_4.aFloat203 * this.aClass86_Sub1_4.aFloat195, this.aClass86_Sub1_4.aFloat203 * this.aClass86_Sub1_4.aFloat209, this.aClass86_Sub1_4.aFloat203 * this.aClass86_Sub1_4.aFloat196);
				if (this.aClass86_Sub1_4.anInt2828 > 0) {
					local282 = this.aClass86_Sub1_4.anInt2828;
					@Pc(569) Class447 local569 = this.aClass86_Sub1_4.aClass447_59;
					for (local571 = 0; local571 < local282; local571++) {
						@Pc(580) Class77_Sub22 local580 = this.aClass86_Sub1_4.aClass77_Sub22Array18[local571];
						@Pc(584) int local584 = local580.method13557();
						local569.method29136(local580.aClass447_47);
						local569.method29204(local444);
						local22.aFloatArray48[local571 * 4] = local569.aFloat277;
						local22.aFloatArray48[local571 * 4 + 1] = local569.aFloat276;
						local22.aFloatArray48[local571 * 4 + 2] = local569.aFloat278;
						local22.aFloatArray48[local571 * 4 + 3] = 1.0F / (float) (local580.method13555() * local580.method13555());
						@Pc(645) float local645 = local580.method13561() / 255.0F;
						local22.aFloatArray47[local571 * 4] = (float) (local584 >> 16 & 0xFF) * local645;
						local22.aFloatArray47[local571 * 4 + 1] = (float) (local584 >> 8 & 0xFF) * local645;
						local22.aFloatArray47[local571 * 4 + 2] = (float) (local584 & 0xFF) * local645;
						local22.aFloatArray47[local571 * 4 + 3] = 1.0F;
					}
				}
			}
			for (local289 = 0; local289 < this.anIntArray78.length; local289++) {
				local571 = this.anIntArray74[local289];
				@Pc(721) int local721 = this.anIntArray74[local289 + 1];
				@Pc(726) short local726 = this.aShortArray32[local571];
				@Pc(728) byte local728 = 11;
				@Pc(730) Class215 local730 = null;
				@Pc(732) byte local732 = 0;
				if (local726 == -1) {
					local22.anInterface37_18 = this.aClass86_Sub1_4.anInterface37_23;
					@Pc(817) float[] local817 = local22.aClass442_48.aFloatArray109;
					local22.aClass442_48.aFloatArray109[13] = 0.0F;
					local817[12] = 0.0F;
				} else {
					local730 = this.aClass86_Sub1_4.aClass209_9.method25584(local726 & 0xFFFF);
					local22.anInterface37_18 = this.aClass86_Sub1_4.aClass370_3.method28225(local730);
					local728 = local730.aByte118;
					local22.method9097(local730.aByte119);
					local22.aClass442_48.aFloatArray109[12] = (float) (this.aClass86_Sub1_4.anInt2845 % 128000) / 1000.0F * (float) local730.aByte113 / 64.0F % 1.0F;
					local22.aClass442_48.aFloatArray109[13] = (float) (this.aClass86_Sub1_4.anInt2845 % 128000) / 1000.0F * (float) local730.aByte114 / 64.0F % 1.0F;
					if (local730.aClass597_2 == Class597.aClass597_3) {
						local732 = local730.aByte115;
					}
				}
				this.aClass86_Sub1_4.method20583(local732);
				local22.anInt1089 = this.anIntArray78[local289];
				local22.anInt1087 = this.anIntArray79[local289];
				local22.anInt1090 = local571 * 3;
				local22.anInt1091 = local721 - local571;
				switch(local728) {
					case 1:
						local22.aClass447_32.method29133(this.aClass86_Sub1_4.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_4.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_4.aClass442_78.aFloatArray109[14]);
						local22.aClass447_32.method29204(local444);
						local22.method9116(local282);
						break;
					case 2:
					case 3:
					case 4:
					default:
						local22.method9103(local282);
						break;
					case 5:
						if (this.aClass86_Sub1_4.aBoolean434) {
							local22.method9103(local282);
						} else {
							@Pc(877) Class122_Sub1_Sub1 local877 = this.aClass86_Sub1_4.aClass122_Sub1_Sub1_3;
							local877.method18532(local730.aByte119, local730.anInt3728 * 1880963453);
							local877.aClass442_56.method28969(arg0);
							local877.aClass442_55.method28969(arg0);
							local877.aClass442_55.method28965(this.aClass86_Sub1_4.aClass442_84);
							local877.anInt2587 = this.anIntArray78[local289] * -89724309;
							local877.anInt2588 = this.anIntArray79[local289] * -890917363;
							local877.anInt2589 = local571 * -1012786239;
							local877.anInt2586 = (local721 - local571) * -694101341;
							local877.method18536();
						}
						break;
					case 6:
						local22.method9117(!Class683.method36096(local728));
						break;
					case 7:
						local22.aClass447_32.method29133(this.aClass86_Sub1_4.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_4.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_4.aClass442_78.aFloatArray109[14]);
						local22.aClass447_32.method29204(local444);
						local22.aClass442_49.method28969(arg0);
						local22.anInterface40_3 = this.aClass86_Sub1_4.method20458();
						local22.method9111(local282);
				}
			}
		}
		this.method6979();
	}

	@OriginalMember(owner = "client!aey", name = "jw", descriptor = "(Lclient!ow;)V", line = 2931)
	void method7006(@OriginalArg(0) Class455 arg0) {
		if (this.anInt775 == 0 || (!this.method7010() || !this.method7009())) {
			return;
		}
		if (aClass364_1 != null) {
		}
		this.aClass86_Sub1_4.method20600();
		this.aClass86_Sub1_4.method20527();
		@Pc(22) Class109 local22 = this.aClass86_Sub1_4.aClass109_3;
		this.aClass86_Sub1_4.method20670(0, this.aClass389_1.anInterface36_22);
		this.aClass86_Sub1_4.method20670(1, this.aClass389_2.anInterface36_22);
		this.aClass86_Sub1_4.method20670(2, this.aClass389_4.anInterface36_22);
		this.aClass86_Sub1_4.method20659(this.aClass356_1.anInterface38_5);
		this.aClass86_Sub1_4.aClass442_87.method28969(arg0);
		local22.method9101(this.aClass86_Sub1_4.aClass442_87);
		local22.aClass442_48.method28951();
		if (this.aClass86_Sub1_4.aBoolean447) {
			@Pc(70) Class202 local70 = this.aClass86_Sub1_4.method20575();
			local22.aClass450_10.method29234(0.0F, 1.0F, 0.0F, (float) -this.aClass86_Sub1_4.anInt2839);
			local22.aClass450_10.method29253(3.0F / (float) (local70.anInt3553 * -1095140607));
			local22.aClass447_31.method29133((float) (local70.anInt3554 * 2113275141 >> 16 & 0xFF) / 255.0F, (float) (local70.anInt3554 * 2113275141 >> 8 & 0xFF) / 255.0F, (float) (local70.anInt3554 * 2113275141 >> 0 & 0xFF) / 255.0F);
		} else {
			local22.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
			local22.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
		}
		if (this.aClass86_Sub1_4.anInt2841 > 0) {
			local22.aClass450_11.method29234(0.0F, 0.0F, 1.0F, -this.aClass86_Sub1_4.aFloat205);
			local22.aClass447_33.method29133((float) (this.aClass86_Sub1_4.anInt2840 >> 16 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_4.anInt2840 >> 8 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_4.anInt2840 >> 0 & 0xFF) / 255.0F);
			this.aClass86_Sub1_4.aClass442_87.method28969(arg0);
			this.aClass86_Sub1_4.aClass442_87.method29034();
			local22.aClass450_10.method29255(this.aClass86_Sub1_4.aClass442_87);
			this.aClass86_Sub1_4.aClass442_87.method28969(arg0);
			this.aClass86_Sub1_4.aClass442_87.method28965(this.aClass86_Sub1_4.aClass442_79);
			this.aClass86_Sub1_4.aClass442_87.method29034();
			local22.aClass450_11.method29255(this.aClass86_Sub1_4.aClass442_87);
			local22.aClass450_11.method29253(1.0F / (this.aClass86_Sub1_4.aFloat206 - this.aClass86_Sub1_4.aFloat205));
		} else {
			local22.aClass450_11.method29234(0.0F, 0.0F, 0.0F, 0.0F);
			local22.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
		}
		@Pc(282) int local282;
		@Pc(289) int local289;
		if ((this.anInt787 & 0x37) == 0) {
			this.aClass86_Sub1_4.method20658(this.aClass86_Sub1_4.aClass113_18);
			if (this.aClass86_Sub1_4.aBoolean434) {
				this.aClass86_Sub1_4.method20522(false);
			}
			for (@Pc(272) int local272 = 0; local272 < this.anIntArray78.length; local272++) {
				local282 = this.anIntArray74[local272];
				local289 = this.anIntArray74[local272 + 1];
				@Pc(294) short local294 = this.aShortArray32[local282];
				@Pc(296) boolean local296 = false;
				@Pc(298) byte local298 = 0;
				if (local294 == -1) {
					local22.anInterface37_18 = this.aClass86_Sub1_4.anInterface37_23;
					@Pc(385) float[] local385 = local22.aClass442_48.aFloatArray109;
					local22.aClass442_48.aFloatArray109[13] = 0.0F;
					local385[12] = 0.0F;
				} else {
					@Pc(310) Class215 local310 = this.aClass86_Sub1_4.aClass209_9.method25584(local294 & 0xFFFF);
					local22.anInterface37_18 = this.aClass86_Sub1_4.aClass370_3.method28225(local310);
					local296 = !Class683.method36096(local310.aByte118);
					local22.aClass442_48.aFloatArray109[12] = (float) (this.aClass86_Sub1_4.anInt2845 % 128000) / 1000.0F * (float) local310.aByte113 / 64.0F % 1.0F;
					local22.aClass442_48.aFloatArray109[13] = (float) (this.aClass86_Sub1_4.anInt2845 % 128000) / 1000.0F * (float) local310.aByte114 / 64.0F % 1.0F;
					if (local310.aClass597_2 == Class597.aClass597_3) {
						local298 = local310.aByte115;
					}
				}
				this.aClass86_Sub1_4.method20583(local298);
				local22.anInt1089 = this.anIntArray78[local272];
				local22.anInt1087 = this.anIntArray79[local272];
				local22.anInt1090 = local282 * 3;
				local22.anInt1091 = local289 - local282;
				local22.method9117(local296);
			}
		} else {
			this.aClass86_Sub1_4.method20670(3, this.aClass389_3.anInterface36_22);
			this.aClass86_Sub1_4.method20658(this.aClass86_Sub1_4.aClass113_20);
			@Pc(444) Class455 local444 = this.aClass86_Sub1_4.aClass455_38;
			local444.method29387(arg0);
			local444.method29409();
			local282 = 0;
			@Pc(571) int local571;
			if (this.aClass86_Sub1_4.aBoolean434) {
				this.aClass86_Sub1_4.method20522(true);
			} else {
				local22.aClass447_34.method29133(this.aClass86_Sub1_4.aFloatArray71[0], this.aClass86_Sub1_4.aFloatArray71[1], this.aClass86_Sub1_4.aFloatArray71[2]);
				local22.aClass447_34.method29209(local444);
				local22.aClass447_35.method29133(this.aClass86_Sub1_4.aFloat204 * this.aClass86_Sub1_4.aFloat195, this.aClass86_Sub1_4.aFloat204 * this.aClass86_Sub1_4.aFloat209, this.aClass86_Sub1_4.aFloat204 * this.aClass86_Sub1_4.aFloat196);
				local22.aClass447_36.method29133(-this.aClass86_Sub1_4.aFloat208 * this.aClass86_Sub1_4.aFloat195, -this.aClass86_Sub1_4.aFloat208 * this.aClass86_Sub1_4.aFloat209, -this.aClass86_Sub1_4.aFloat208 * this.aClass86_Sub1_4.aFloat196);
				local22.aClass447_37.method29133(this.aClass86_Sub1_4.aFloat203 * this.aClass86_Sub1_4.aFloat195, this.aClass86_Sub1_4.aFloat203 * this.aClass86_Sub1_4.aFloat209, this.aClass86_Sub1_4.aFloat203 * this.aClass86_Sub1_4.aFloat196);
				if (this.aClass86_Sub1_4.anInt2828 > 0) {
					local282 = this.aClass86_Sub1_4.anInt2828;
					@Pc(569) Class447 local569 = this.aClass86_Sub1_4.aClass447_59;
					for (local571 = 0; local571 < local282; local571++) {
						@Pc(580) Class77_Sub22 local580 = this.aClass86_Sub1_4.aClass77_Sub22Array18[local571];
						@Pc(584) int local584 = local580.method13557();
						local569.method29136(local580.aClass447_47);
						local569.method29204(local444);
						local22.aFloatArray48[local571 * 4] = local569.aFloat277;
						local22.aFloatArray48[local571 * 4 + 1] = local569.aFloat276;
						local22.aFloatArray48[local571 * 4 + 2] = local569.aFloat278;
						local22.aFloatArray48[local571 * 4 + 3] = 1.0F / (float) (local580.method13555() * local580.method13555());
						@Pc(645) float local645 = local580.method13561() / 255.0F;
						local22.aFloatArray47[local571 * 4] = (float) (local584 >> 16 & 0xFF) * local645;
						local22.aFloatArray47[local571 * 4 + 1] = (float) (local584 >> 8 & 0xFF) * local645;
						local22.aFloatArray47[local571 * 4 + 2] = (float) (local584 & 0xFF) * local645;
						local22.aFloatArray47[local571 * 4 + 3] = 1.0F;
					}
				}
			}
			for (local289 = 0; local289 < this.anIntArray78.length; local289++) {
				local571 = this.anIntArray74[local289];
				@Pc(721) int local721 = this.anIntArray74[local289 + 1];
				@Pc(726) short local726 = this.aShortArray32[local571];
				@Pc(728) byte local728 = 11;
				@Pc(730) Class215 local730 = null;
				@Pc(732) byte local732 = 0;
				if (local726 == -1) {
					local22.anInterface37_18 = this.aClass86_Sub1_4.anInterface37_23;
					@Pc(817) float[] local817 = local22.aClass442_48.aFloatArray109;
					local22.aClass442_48.aFloatArray109[13] = 0.0F;
					local817[12] = 0.0F;
				} else {
					local730 = this.aClass86_Sub1_4.aClass209_9.method25584(local726 & 0xFFFF);
					local22.anInterface37_18 = this.aClass86_Sub1_4.aClass370_3.method28225(local730);
					local728 = local730.aByte118;
					local22.method9097(local730.aByte119);
					local22.aClass442_48.aFloatArray109[12] = (float) (this.aClass86_Sub1_4.anInt2845 % 128000) / 1000.0F * (float) local730.aByte113 / 64.0F % 1.0F;
					local22.aClass442_48.aFloatArray109[13] = (float) (this.aClass86_Sub1_4.anInt2845 % 128000) / 1000.0F * (float) local730.aByte114 / 64.0F % 1.0F;
					if (local730.aClass597_2 == Class597.aClass597_3) {
						local732 = local730.aByte115;
					}
				}
				this.aClass86_Sub1_4.method20583(local732);
				local22.anInt1089 = this.anIntArray78[local289];
				local22.anInt1087 = this.anIntArray79[local289];
				local22.anInt1090 = local571 * 3;
				local22.anInt1091 = local721 - local571;
				switch(local728) {
					case 1:
						local22.aClass447_32.method29133(this.aClass86_Sub1_4.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_4.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_4.aClass442_78.aFloatArray109[14]);
						local22.aClass447_32.method29204(local444);
						local22.method9116(local282);
						break;
					case 2:
					case 3:
					case 4:
					default:
						local22.method9103(local282);
						break;
					case 5:
						if (this.aClass86_Sub1_4.aBoolean434) {
							local22.method9103(local282);
						} else {
							@Pc(877) Class122_Sub1_Sub1 local877 = this.aClass86_Sub1_4.aClass122_Sub1_Sub1_3;
							local877.method18532(local730.aByte119, local730.anInt3728 * 1880963453);
							local877.aClass442_56.method28969(arg0);
							local877.aClass442_55.method28969(arg0);
							local877.aClass442_55.method28965(this.aClass86_Sub1_4.aClass442_84);
							local877.anInt2587 = this.anIntArray78[local289] * -89724309;
							local877.anInt2588 = this.anIntArray79[local289] * -890917363;
							local877.anInt2589 = local571 * -1012786239;
							local877.anInt2586 = (local721 - local571) * -694101341;
							local877.method18536();
						}
						break;
					case 6:
						local22.method9117(!Class683.method36096(local728));
						break;
					case 7:
						local22.aClass447_32.method29133(this.aClass86_Sub1_4.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_4.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_4.aClass442_78.aFloatArray109[14]);
						local22.aClass447_32.method29204(local444);
						local22.aClass442_49.method28969(arg0);
						local22.anInterface40_3 = this.aClass86_Sub1_4.method20458();
						local22.method9111(local282);
				}
			}
		}
		this.method6979();
	}

	@OriginalMember(owner = "client!aey", name = "ii", descriptor = "(Lclient!oi;)V", line = 3105)
	void method7007(@OriginalArg(0) Class442 arg0) {
		if (this.aClass378Array1 == null) {
			return;
		}
		this.aClass86_Sub1_4.method20230(!this.aBoolean156);
		@Pc(16) Class455 local16 = this.aClass86_Sub1_4.aClass455_38;
		@Pc(20) Class106 local20 = this.aClass86_Sub1_4.aClass106_3;
		@Pc(28) boolean local28 = this.aClass86_Sub1_4.anInt2841 > 0;
		if (local28) {
			local20.aClass447_16.method29133((float) (this.aClass86_Sub1_4.anInt2840 >> 16 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_4.anInt2840 >> 8 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_4.anInt2840 >> 0 & 0xFF) / 255.0F);
		} else {
			local20.aClass447_16.method29133(0.0F, 0.0F, 0.0F);
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt781; local72++) {
			@Pc(81) Class378 local81 = this.aClass378Array1[local72];
			@Pc(86) Class360 local86 = this.aClass360Array1[local72];
			if (!local81.aBoolean728 || !this.aClass86_Sub1_4.method20183()) {
				@Pc(115) float local115 = (float) (this.anIntArray70[local81.anInt4578] + this.anIntArray70[local81.anInt4577] + this.anIntArray70[local81.anInt4576]) * 0.3333333F;
				@Pc(136) float local136 = (float) (this.anIntArray71[local81.anInt4578] + this.anIntArray71[local81.anInt4577] + this.anIntArray71[local81.anInt4576]) * 0.3333333F;
				@Pc(157) float local157 = (float) (this.anIntArray75[local81.anInt4578] + this.anIntArray75[local81.anInt4577] + this.anIntArray75[local81.anInt4576]) * 0.3333333F;
				@Pc(183) float local183 = arg0.aFloatArray109[0] * local115 + arg0.aFloatArray109[4] * local136 + arg0.aFloatArray109[8] * local157 + arg0.aFloatArray109[12];
				@Pc(209) float local209 = arg0.aFloatArray109[1] * local115 + arg0.aFloatArray109[5] * local136 + arg0.aFloatArray109[9] * local157 + arg0.aFloatArray109[13];
				@Pc(235) float local235 = arg0.aFloatArray109[2] * local115 + arg0.aFloatArray109[6] * local136 + arg0.aFloatArray109[10] * local157 + arg0.aFloatArray109[14];
				@Pc(256) float local256 = (float) (1.0D / Math.sqrt((double) (local183 * local183 + local209 * local209 + local235 * local235))) * (float) local81.anInt4580;
				local16.method29399(local86.anInt4506, local86.anInt4509 * local81.aShort170 >> 7, local86.anInt4507 * local81.aShort172 >> 7, local183 + (float) local86.anInt4508 - local183 * local256, local209 + (float) local86.anInt4505 - local209 * local256, local235 - local235 * local256);
				local16.method29438(this.aClass86_Sub1_4.aClass455_37);
				this.aClass86_Sub1_4.aClass442_82.method28969(local16);
				local20.method8969(this.aClass86_Sub1_4.aClass442_82);
				local20.aClass442_41.method28951();
				local20.anInt1046 = local86.anInt4510;
				if (local28) {
					local20.aFloat118 = 1.0F - (this.aClass86_Sub1_4.aFloat206 - local235) / (this.aClass86_Sub1_4.aFloat206 - this.aClass86_Sub1_4.aFloat205);
				}
				local20.anInterface37_15 = null;
				if (local81.aShort171 != -1) {
					local20.anInterface37_15 = this.aClass86_Sub1_4.aClass370_3.method28225(this.aClass86_Sub1_4.aClass209_9.method25584(local81.aShort171 & 0xFFFF));
				}
				local20.method8970(local28);
			}
		}
		this.aClass86_Sub1_4.method20230(true);
	}

	@OriginalMember(owner = "client!aey", name = "jy", descriptor = "()Z", line = 3146)
	boolean method7008() {
		if (this.aClass356_1.aBoolean721) {
			return true;
		}
		if (this.aClass356_1.anInterface38_6 == null) {
			this.aClass356_1.anInterface38_6 = this.aClass86_Sub1_4.method20772(false);
		}
		@Pc(20) Interface38 local20 = this.aClass356_1.anInterface38_6;
		local20.method28728(this.anInt775 * 6);
		@Pc(30) Unsafe local30 = this.aClass86_Sub1_4.anUnsafe4;
		if (local30 != null) {
			@Pc(37) int local37 = this.anInt775 * 6;
			@Pc(42) long local42 = local20.method28745(0, local37);
			if (local42 == 0L) {
				return false;
			}
			for (@Pc(50) int local50 = 0; local50 < this.anInt775; local50++) {
				local30.putShort(local42, this.aShortArray36[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray35[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray34[local50]);
				local42 += 2L;
			}
			local20.method28746();
			this.aClass356_1.anInterface38_5 = local20;
			this.aClass356_1.aBoolean721 = true;
			this.aBoolean155 = true;
			return true;
		}
		@Pc(108) ByteBuffer local108 = this.aClass86_Sub1_4.aByteBuffer7;
		local108.clear();
		for (@Pc(113) int local113 = 0; local113 < this.anInt775; local113++) {
			local108.putShort(this.aShortArray36[local113]);
			local108.putShort(this.aShortArray35[local113]);
			local108.putShort(this.aShortArray34[local113]);
		}
		if (local20.method28755(0, local108.position(), this.aClass86_Sub1_4.aLong121)) {
			this.aClass356_1.anInterface38_5 = local20;
			this.aClass356_1.aBoolean721 = true;
			this.aBoolean155 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aey", name = "ip", descriptor = "()Z", line = 3146)
	boolean method7009() {
		if (this.aClass356_1.aBoolean721) {
			return true;
		}
		if (this.aClass356_1.anInterface38_6 == null) {
			this.aClass356_1.anInterface38_6 = this.aClass86_Sub1_4.method20772(false);
		}
		@Pc(20) Interface38 local20 = this.aClass356_1.anInterface38_6;
		local20.method28728(this.anInt775 * 6);
		@Pc(30) Unsafe local30 = this.aClass86_Sub1_4.anUnsafe4;
		if (local30 != null) {
			@Pc(37) int local37 = this.anInt775 * 6;
			@Pc(42) long local42 = local20.method28745(0, local37);
			if (local42 == 0L) {
				return false;
			}
			for (@Pc(50) int local50 = 0; local50 < this.anInt775; local50++) {
				local30.putShort(local42, this.aShortArray36[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray35[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray34[local50]);
				local42 += 2L;
			}
			local20.method28746();
			this.aClass356_1.anInterface38_5 = local20;
			this.aClass356_1.aBoolean721 = true;
			this.aBoolean155 = true;
			return true;
		}
		@Pc(108) ByteBuffer local108 = this.aClass86_Sub1_4.aByteBuffer7;
		local108.clear();
		for (@Pc(113) int local113 = 0; local113 < this.anInt775; local113++) {
			local108.putShort(this.aShortArray36[local113]);
			local108.putShort(this.aShortArray35[local113]);
			local108.putShort(this.aShortArray34[local113]);
		}
		if (local20.method28755(0, local108.position(), this.aClass86_Sub1_4.aLong121)) {
			this.aClass356_1.anInterface38_5 = local20;
			this.aClass356_1.aBoolean721 = true;
			this.aBoolean155 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aey", name = "iw", descriptor = "()Z", line = 3188)
	boolean method7010() {
		@Pc(7) boolean local7 = !this.aClass389_2.aBoolean729;
		@Pc(20) boolean local20 = (this.anInt787 & 0x37) != 0 && !this.aClass389_3.aBoolean729;
		@Pc(28) boolean local28 = !this.aClass389_1.aBoolean729;
		@Pc(36) boolean local36 = !this.aClass389_4.aBoolean729;
		if (!local28 && !local7 && !local20 && !local36) {
			return true;
		}
		@Pc(48) boolean local48 = true;
		@Pc(69) Interface36 local69;
		@Pc(81) Unsafe local81;
		@Pc(149) ByteBuffer local149;
		@Pc(154) int local154;
		@Pc(95) int local95;
		@Pc(104) short local104;
		@Pc(88) int local88;
		@Pc(93) long local93;
		if (local28 && this.aShortArray27 != null) {
			if (this.aClass389_1.anInterface36_23 == null) {
				this.aClass389_1.anInterface36_23 = this.aClass86_Sub1_4.method20656(this.aBoolean154);
			}
			local69 = this.aClass389_1.anInterface36_23;
			local69.method28760(this.anInt772 * 12, 12);
			local81 = this.aClass86_Sub1_4.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass86_Sub1_4.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt772; local154++) {
					local149.putFloat((float) this.anIntArray70[this.aShortArray27[local154]]);
					local149.putFloat((float) this.anIntArray71[this.aShortArray27[local154]]);
					local149.putFloat((float) this.anIntArray75[this.aShortArray27[local154]]);
				}
				local69.method28755(0, local149.position(), this.aClass86_Sub1_4.aLong121);
			} else {
				local88 = this.anInt772 * 12;
				local93 = local69.method28745(0, local88);
				for (local95 = 0; local95 < this.anInt772; local95++) {
					local104 = this.aShortArray27[local95];
					local81.putFloat(local93, (float) this.anIntArray70[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray71[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray75[local104]);
					local93 += 4L;
				}
				local69.method28746();
			}
			this.aClass389_1.anInterface36_22 = local69;
			this.aClass389_1.aBoolean729 = true;
		}
		@Pc(647) int local647;
		@Pc(600) short[] local600;
		@Pc(568) int local568;
		if (local7) {
			if (this.aClass389_2.anInterface36_23 == null) {
				this.aClass389_2.anInterface36_23 = this.aClass86_Sub1_4.method20656(this.aBoolean154);
			}
			local69 = this.aClass389_2.anInterface36_23;
			local69.method28760(this.anInt772 * 4, 4);
			local81 = this.aClass86_Sub1_4.anUnsafe4;
			@Pc(311) int local311;
			@Pc(346) float local346;
			@Pc(366) float local366;
			@Pc(465) int local465;
			@Pc(264) short[] local264;
			if (local81 == null) {
				local149 = this.aClass86_Sub1_4.aByteBuffer7;
				local149.clear();
				if ((this.anInt787 & 0x37) == 0) {
					@Pc(604) short[] local604;
					@Pc(612) byte[] local612;
					if (this.aClass376_1 == null) {
						local600 = this.aShortArray30;
						local604 = this.aShortArray38;
						local264 = this.aShortArray39;
						local612 = this.aByteArray17;
					} else {
						local600 = this.aClass376_1.aShortArray128;
						local604 = this.aClass376_1.aShortArray127;
						local264 = this.aClass376_1.aShortArray129;
						local612 = this.aClass376_1.aByteArray84;
					}
					@Pc(635) float local635 = this.aClass86_Sub1_4.aFloat204 * 768.0F / (float) this.aShort23;
					@Pc(645) float local645 = this.aClass86_Sub1_4.aFloat208 * 768.0F / (float) this.aShort23;
					for (local647 = 0; local647 < this.anInt772; local647++) {
						@Pc(656) short local656 = this.aShortArray29[local647];
						local311 = this.method7019(this.aShortArray31[local656] & 0xFFFF, this.aShortArray32[local656], this.aShort22);
						@Pc(682) float local682 = (float) (local311 >> 16 & 0xFF) * this.aClass86_Sub1_4.aFloat195;
						@Pc(693) float local693 = (float) (local311 >> 8 & 0xFF) * this.aClass86_Sub1_4.aFloat209;
						local346 = (float) (local311 & 0xFF) * this.aClass86_Sub1_4.aFloat196;
						@Pc(706) byte local706 = local612[local647];
						if (local706 == 0) {
							local366 = (this.aClass86_Sub1_4.aFloatArray71[0] * (float) local600[local647] + this.aClass86_Sub1_4.aFloatArray71[1] * (float) local604[local647] + this.aClass86_Sub1_4.aFloatArray71[2] * (float) local264[local647]) * 0.0026041667F;
						} else {
							local366 = (this.aClass86_Sub1_4.aFloatArray71[0] * (float) local600[local647] + this.aClass86_Sub1_4.aFloatArray71[1] * (float) local604[local647] + this.aClass86_Sub1_4.aFloatArray71[2] * (float) local264[local647]) / ((float) local706 * 256.0F);
						}
						@Pc(796) float local796 = this.aClass86_Sub1_4.aFloat203 + local366 * (local366 < 0.0F ? local645 : local635);
						@Pc(801) int local801 = (int) (local682 * local796);
						if (local801 < 0) {
							local801 = 0;
						} else if (local801 > 255) {
							local801 = 255;
						}
						@Pc(816) int local816 = (int) (local693 * local796);
						if (local816 < 0) {
							local816 = 0;
						} else if (local816 > 255) {
							local816 = 255;
						}
						local465 = (int) (local346 * local796);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						local149.putInt(255 - this.aByteArray18[local656] << 24 | local801 << 16 | local816 << 8 | local465);
					}
				} else {
					for (local154 = 0; local154 < this.anInt772; local154++) {
						@Pc(876) short local876 = this.aShortArray29[local154];
						local95 = 255 - this.aByteArray18[local876] << 24 | this.method7019(this.aShortArray31[local876] & 0xFFFF, this.aShortArray32[local876], this.aShort22);
						local149.putInt(local95);
					}
				}
				local69.method28755(0, local149.position(), this.aClass86_Sub1_4.aLong121);
			} else {
				local88 = this.anInt772 * 4;
				local93 = local69.method28745(0, local88);
				if ((this.anInt787 & 0x37) == 0) {
					@Pc(268) short[] local268;
					@Pc(272) short[] local272;
					@Pc(276) byte[] local276;
					if (this.aClass376_1 == null) {
						local264 = this.aShortArray30;
						local268 = this.aShortArray38;
						local272 = this.aShortArray39;
						local276 = this.aByteArray17;
					} else {
						local264 = this.aClass376_1.aShortArray128;
						local268 = this.aClass376_1.aShortArray127;
						local272 = this.aClass376_1.aShortArray129;
						local276 = this.aClass376_1.aByteArray84;
					}
					@Pc(299) float local299 = this.aClass86_Sub1_4.aFloat204 * 768.0F / (float) this.aShort23;
					@Pc(309) float local309 = this.aClass86_Sub1_4.aFloat208 * 768.0F / (float) this.aShort23;
					for (local311 = 0; local311 < this.anInt772; local311++) {
						@Pc(320) short local320 = this.aShortArray29[local311];
						@Pc(335) int local335 = this.method7019(this.aShortArray31[local320] & 0xFFFF, this.aShortArray32[local320], this.aShort22);
						local346 = (float) (local335 >> 16 & 0xFF) * this.aClass86_Sub1_4.aFloat195;
						@Pc(357) float local357 = (float) (local335 >> 8 & 0xFF) * this.aClass86_Sub1_4.aFloat209;
						local366 = (float) (local335 & 0xFF) * this.aClass86_Sub1_4.aFloat196;
						@Pc(370) byte local370 = local276[local311];
						@Pc(407) float local407;
						if (local370 == 0) {
							local407 = (this.aClass86_Sub1_4.aFloatArray71[0] * (float) local264[local311] + this.aClass86_Sub1_4.aFloatArray71[1] * (float) local268[local311] + this.aClass86_Sub1_4.aFloatArray71[2] * (float) local272[local311]) * 0.0026041667F;
						} else {
							local407 = (this.aClass86_Sub1_4.aFloatArray71[0] * (float) local264[local311] + this.aClass86_Sub1_4.aFloatArray71[1] * (float) local268[local311] + this.aClass86_Sub1_4.aFloatArray71[2] * (float) local272[local311]) / ((float) local370 * 256.0F);
						}
						@Pc(460) float local460 = this.aClass86_Sub1_4.aFloat203 + local407 * (local407 < 0.0F ? local309 : local299);
						local465 = (int) (local346 * local460);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						@Pc(480) int local480 = (int) (local357 * local460);
						if (local480 < 0) {
							local480 = 0;
						} else if (local480 > 255) {
							local480 = 255;
						}
						@Pc(495) int local495 = (int) (local366 * local460);
						if (local495 < 0) {
							local495 = 0;
						} else if (local495 > 255) {
							local495 = 255;
						}
						local81.putInt(local93, 255 - this.aByteArray18[local320] << 24 | local465 << 16 | local480 << 8 | local495);
						local93 += 4L;
					}
				} else {
					for (local95 = 0; local95 < this.anInt772; local95++) {
						local104 = this.aShortArray29[local95];
						local568 = 255 - this.aByteArray18[local104] << 24 | this.method7019(this.aShortArray31[local104] & 0xFFFF, this.aShortArray32[local104], this.aShort22);
						local81.putInt(local93, local568);
						local93 += 4L;
					}
				}
				local69.method28746();
			}
			this.aClass389_2.anInterface36_22 = local69;
			this.aClass389_2.aBoolean729 = true;
		}
		if (local20) {
			if (this.aClass389_3.anInterface36_23 == null) {
				this.aClass389_3.anInterface36_23 = this.aClass86_Sub1_4.method20656(this.aBoolean154);
			}
			local69 = this.aClass389_3.anInterface36_23;
			local69.method28760(this.anInt772 * 12, 12);
			@Pc(956) short[] local956;
			@Pc(960) short[] local960;
			@Pc(968) byte[] local968;
			if (this.aClass376_1 == null) {
				local956 = this.aShortArray30;
				local960 = this.aShortArray38;
				local600 = this.aShortArray39;
				local968 = this.aByteArray17;
			} else {
				local956 = this.aClass376_1.aShortArray128;
				local960 = this.aClass376_1.aShortArray127;
				local600 = this.aClass376_1.aShortArray129;
				local968 = this.aClass376_1.aByteArray84;
			}
			@Pc(985) Unsafe local985 = this.aClass86_Sub1_4.anUnsafe4;
			if (local985 == null) {
				@Pc(1073) ByteBuffer local1073 = this.aClass86_Sub1_4.aByteBuffer7;
				local1073.clear();
				for (local568 = 0; local568 < this.anInt772; local568++) {
					@Pc(1098) Class447 local1098 = new Class447((float) local956[local568], (float) local960[local568], (float) local600[local568]);
					if (local1098.method29170() != 0.0F) {
						if (local968[local568] > 1) {
							local1098.method29191((float) local968[local568]);
						}
						local1098.method29145();
					}
					local1073.putFloat(local1098.aFloat277);
					local1073.putFloat(local1098.aFloat276);
					local1073.putFloat(local1098.aFloat278);
				}
				local69.method28755(0, local1073.position(), this.aClass86_Sub1_4.aLong121);
			} else {
				@Pc(992) int local992 = this.anInt772 * 12;
				@Pc(997) long local997 = local69.method28745(0, local992);
				for (local647 = 0; local647 < this.anInt772; local647++) {
					@Pc(1019) Class447 local1019 = new Class447((float) local956[local647], (float) local960[local647], (float) local600[local647]);
					if (local1019.method29170() != 0.0F) {
						if (local968[local647] > 1) {
							local1019.method29191((float) local968[local647]);
						}
						local1019.method29145();
					}
					local985.putFloat(local997, local1019.aFloat277);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat276);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat278);
					local997 += 4L;
				}
				local69.method28746();
			}
			this.aClass389_3.anInterface36_22 = local69;
			this.aClass389_3.aBoolean729 = true;
		}
		if (local36) {
			if (this.aClass389_4.anInterface36_23 == null) {
				this.aClass389_4.anInterface36_23 = this.aClass86_Sub1_4.method20656(this.aBoolean154);
			}
			local69 = this.aClass389_4.anInterface36_23;
			local69.method28760(this.anInt772 * 8, 8);
			local81 = this.aClass86_Sub1_4.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass86_Sub1_4.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt772; local154++) {
					local149.putFloat(this.aFloatArray30[local154]);
					local149.putFloat(this.aFloatArray29[local154]);
				}
				local69.method28755(0, local149.position(), this.aClass86_Sub1_4.aLong121);
			} else {
				local88 = this.anInt772 * 8;
				local93 = local69.method28745(0, local88);
				for (local95 = 0; local95 < this.anInt772; local95++) {
					local81.putFloat(local93, this.aFloatArray30[local95]);
					local93 += 4L;
					local81.putFloat(local93, this.aFloatArray29[local95]);
					local93 += 4L;
				}
				local69.method28746();
			}
			this.aClass389_4.anInterface36_22 = local69;
			this.aClass389_4.aBoolean729 = true;
		}
		return local48;
	}

	@OriginalMember(owner = "client!aey", name = "jb", descriptor = "()Z", line = 3188)
	boolean method7011() {
		@Pc(7) boolean local7 = !this.aClass389_2.aBoolean729;
		@Pc(20) boolean local20 = (this.anInt787 & 0x37) != 0 && !this.aClass389_3.aBoolean729;
		@Pc(28) boolean local28 = !this.aClass389_1.aBoolean729;
		@Pc(36) boolean local36 = !this.aClass389_4.aBoolean729;
		if (!local28 && !local7 && !local20 && !local36) {
			return true;
		}
		@Pc(48) boolean local48 = true;
		@Pc(69) Interface36 local69;
		@Pc(81) Unsafe local81;
		@Pc(149) ByteBuffer local149;
		@Pc(154) int local154;
		@Pc(95) int local95;
		@Pc(104) short local104;
		@Pc(88) int local88;
		@Pc(93) long local93;
		if (local28 && this.aShortArray27 != null) {
			if (this.aClass389_1.anInterface36_23 == null) {
				this.aClass389_1.anInterface36_23 = this.aClass86_Sub1_4.method20656(this.aBoolean154);
			}
			local69 = this.aClass389_1.anInterface36_23;
			local69.method28760(this.anInt772 * 12, 12);
			local81 = this.aClass86_Sub1_4.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass86_Sub1_4.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt772; local154++) {
					local149.putFloat((float) this.anIntArray70[this.aShortArray27[local154]]);
					local149.putFloat((float) this.anIntArray71[this.aShortArray27[local154]]);
					local149.putFloat((float) this.anIntArray75[this.aShortArray27[local154]]);
				}
				local69.method28755(0, local149.position(), this.aClass86_Sub1_4.aLong121);
			} else {
				local88 = this.anInt772 * 12;
				local93 = local69.method28745(0, local88);
				for (local95 = 0; local95 < this.anInt772; local95++) {
					local104 = this.aShortArray27[local95];
					local81.putFloat(local93, (float) this.anIntArray70[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray71[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray75[local104]);
					local93 += 4L;
				}
				local69.method28746();
			}
			this.aClass389_1.anInterface36_22 = local69;
			this.aClass389_1.aBoolean729 = true;
		}
		@Pc(647) int local647;
		@Pc(600) short[] local600;
		@Pc(568) int local568;
		if (local7) {
			if (this.aClass389_2.anInterface36_23 == null) {
				this.aClass389_2.anInterface36_23 = this.aClass86_Sub1_4.method20656(this.aBoolean154);
			}
			local69 = this.aClass389_2.anInterface36_23;
			local69.method28760(this.anInt772 * 4, 4);
			local81 = this.aClass86_Sub1_4.anUnsafe4;
			@Pc(311) int local311;
			@Pc(346) float local346;
			@Pc(366) float local366;
			@Pc(465) int local465;
			@Pc(264) short[] local264;
			if (local81 == null) {
				local149 = this.aClass86_Sub1_4.aByteBuffer7;
				local149.clear();
				if ((this.anInt787 & 0x37) == 0) {
					@Pc(604) short[] local604;
					@Pc(612) byte[] local612;
					if (this.aClass376_1 == null) {
						local600 = this.aShortArray30;
						local604 = this.aShortArray38;
						local264 = this.aShortArray39;
						local612 = this.aByteArray17;
					} else {
						local600 = this.aClass376_1.aShortArray128;
						local604 = this.aClass376_1.aShortArray127;
						local264 = this.aClass376_1.aShortArray129;
						local612 = this.aClass376_1.aByteArray84;
					}
					@Pc(635) float local635 = this.aClass86_Sub1_4.aFloat204 * 768.0F / (float) this.aShort23;
					@Pc(645) float local645 = this.aClass86_Sub1_4.aFloat208 * 768.0F / (float) this.aShort23;
					for (local647 = 0; local647 < this.anInt772; local647++) {
						@Pc(656) short local656 = this.aShortArray29[local647];
						local311 = this.method7019(this.aShortArray31[local656] & 0xFFFF, this.aShortArray32[local656], this.aShort22);
						@Pc(682) float local682 = (float) (local311 >> 16 & 0xFF) * this.aClass86_Sub1_4.aFloat195;
						@Pc(693) float local693 = (float) (local311 >> 8 & 0xFF) * this.aClass86_Sub1_4.aFloat209;
						local346 = (float) (local311 & 0xFF) * this.aClass86_Sub1_4.aFloat196;
						@Pc(706) byte local706 = local612[local647];
						if (local706 == 0) {
							local366 = (this.aClass86_Sub1_4.aFloatArray71[0] * (float) local600[local647] + this.aClass86_Sub1_4.aFloatArray71[1] * (float) local604[local647] + this.aClass86_Sub1_4.aFloatArray71[2] * (float) local264[local647]) * 0.0026041667F;
						} else {
							local366 = (this.aClass86_Sub1_4.aFloatArray71[0] * (float) local600[local647] + this.aClass86_Sub1_4.aFloatArray71[1] * (float) local604[local647] + this.aClass86_Sub1_4.aFloatArray71[2] * (float) local264[local647]) / ((float) local706 * 256.0F);
						}
						@Pc(796) float local796 = this.aClass86_Sub1_4.aFloat203 + local366 * (local366 < 0.0F ? local645 : local635);
						@Pc(801) int local801 = (int) (local682 * local796);
						if (local801 < 0) {
							local801 = 0;
						} else if (local801 > 255) {
							local801 = 255;
						}
						@Pc(816) int local816 = (int) (local693 * local796);
						if (local816 < 0) {
							local816 = 0;
						} else if (local816 > 255) {
							local816 = 255;
						}
						local465 = (int) (local346 * local796);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						local149.putInt(255 - this.aByteArray18[local656] << 24 | local801 << 16 | local816 << 8 | local465);
					}
				} else {
					for (local154 = 0; local154 < this.anInt772; local154++) {
						@Pc(876) short local876 = this.aShortArray29[local154];
						local95 = 255 - this.aByteArray18[local876] << 24 | this.method7019(this.aShortArray31[local876] & 0xFFFF, this.aShortArray32[local876], this.aShort22);
						local149.putInt(local95);
					}
				}
				local69.method28755(0, local149.position(), this.aClass86_Sub1_4.aLong121);
			} else {
				local88 = this.anInt772 * 4;
				local93 = local69.method28745(0, local88);
				if ((this.anInt787 & 0x37) == 0) {
					@Pc(268) short[] local268;
					@Pc(272) short[] local272;
					@Pc(276) byte[] local276;
					if (this.aClass376_1 == null) {
						local264 = this.aShortArray30;
						local268 = this.aShortArray38;
						local272 = this.aShortArray39;
						local276 = this.aByteArray17;
					} else {
						local264 = this.aClass376_1.aShortArray128;
						local268 = this.aClass376_1.aShortArray127;
						local272 = this.aClass376_1.aShortArray129;
						local276 = this.aClass376_1.aByteArray84;
					}
					@Pc(299) float local299 = this.aClass86_Sub1_4.aFloat204 * 768.0F / (float) this.aShort23;
					@Pc(309) float local309 = this.aClass86_Sub1_4.aFloat208 * 768.0F / (float) this.aShort23;
					for (local311 = 0; local311 < this.anInt772; local311++) {
						@Pc(320) short local320 = this.aShortArray29[local311];
						@Pc(335) int local335 = this.method7019(this.aShortArray31[local320] & 0xFFFF, this.aShortArray32[local320], this.aShort22);
						local346 = (float) (local335 >> 16 & 0xFF) * this.aClass86_Sub1_4.aFloat195;
						@Pc(357) float local357 = (float) (local335 >> 8 & 0xFF) * this.aClass86_Sub1_4.aFloat209;
						local366 = (float) (local335 & 0xFF) * this.aClass86_Sub1_4.aFloat196;
						@Pc(370) byte local370 = local276[local311];
						@Pc(407) float local407;
						if (local370 == 0) {
							local407 = (this.aClass86_Sub1_4.aFloatArray71[0] * (float) local264[local311] + this.aClass86_Sub1_4.aFloatArray71[1] * (float) local268[local311] + this.aClass86_Sub1_4.aFloatArray71[2] * (float) local272[local311]) * 0.0026041667F;
						} else {
							local407 = (this.aClass86_Sub1_4.aFloatArray71[0] * (float) local264[local311] + this.aClass86_Sub1_4.aFloatArray71[1] * (float) local268[local311] + this.aClass86_Sub1_4.aFloatArray71[2] * (float) local272[local311]) / ((float) local370 * 256.0F);
						}
						@Pc(460) float local460 = this.aClass86_Sub1_4.aFloat203 + local407 * (local407 < 0.0F ? local309 : local299);
						local465 = (int) (local346 * local460);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						@Pc(480) int local480 = (int) (local357 * local460);
						if (local480 < 0) {
							local480 = 0;
						} else if (local480 > 255) {
							local480 = 255;
						}
						@Pc(495) int local495 = (int) (local366 * local460);
						if (local495 < 0) {
							local495 = 0;
						} else if (local495 > 255) {
							local495 = 255;
						}
						local81.putInt(local93, 255 - this.aByteArray18[local320] << 24 | local465 << 16 | local480 << 8 | local495);
						local93 += 4L;
					}
				} else {
					for (local95 = 0; local95 < this.anInt772; local95++) {
						local104 = this.aShortArray29[local95];
						local568 = 255 - this.aByteArray18[local104] << 24 | this.method7019(this.aShortArray31[local104] & 0xFFFF, this.aShortArray32[local104], this.aShort22);
						local81.putInt(local93, local568);
						local93 += 4L;
					}
				}
				local69.method28746();
			}
			this.aClass389_2.anInterface36_22 = local69;
			this.aClass389_2.aBoolean729 = true;
		}
		if (local20) {
			if (this.aClass389_3.anInterface36_23 == null) {
				this.aClass389_3.anInterface36_23 = this.aClass86_Sub1_4.method20656(this.aBoolean154);
			}
			local69 = this.aClass389_3.anInterface36_23;
			local69.method28760(this.anInt772 * 12, 12);
			@Pc(956) short[] local956;
			@Pc(960) short[] local960;
			@Pc(968) byte[] local968;
			if (this.aClass376_1 == null) {
				local956 = this.aShortArray30;
				local960 = this.aShortArray38;
				local600 = this.aShortArray39;
				local968 = this.aByteArray17;
			} else {
				local956 = this.aClass376_1.aShortArray128;
				local960 = this.aClass376_1.aShortArray127;
				local600 = this.aClass376_1.aShortArray129;
				local968 = this.aClass376_1.aByteArray84;
			}
			@Pc(985) Unsafe local985 = this.aClass86_Sub1_4.anUnsafe4;
			if (local985 == null) {
				@Pc(1073) ByteBuffer local1073 = this.aClass86_Sub1_4.aByteBuffer7;
				local1073.clear();
				for (local568 = 0; local568 < this.anInt772; local568++) {
					@Pc(1098) Class447 local1098 = new Class447((float) local956[local568], (float) local960[local568], (float) local600[local568]);
					if (local1098.method29170() != 0.0F) {
						if (local968[local568] > 1) {
							local1098.method29191((float) local968[local568]);
						}
						local1098.method29145();
					}
					local1073.putFloat(local1098.aFloat277);
					local1073.putFloat(local1098.aFloat276);
					local1073.putFloat(local1098.aFloat278);
				}
				local69.method28755(0, local1073.position(), this.aClass86_Sub1_4.aLong121);
			} else {
				@Pc(992) int local992 = this.anInt772 * 12;
				@Pc(997) long local997 = local69.method28745(0, local992);
				for (local647 = 0; local647 < this.anInt772; local647++) {
					@Pc(1019) Class447 local1019 = new Class447((float) local956[local647], (float) local960[local647], (float) local600[local647]);
					if (local1019.method29170() != 0.0F) {
						if (local968[local647] > 1) {
							local1019.method29191((float) local968[local647]);
						}
						local1019.method29145();
					}
					local985.putFloat(local997, local1019.aFloat277);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat276);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat278);
					local997 += 4L;
				}
				local69.method28746();
			}
			this.aClass389_3.anInterface36_22 = local69;
			this.aClass389_3.aBoolean729 = true;
		}
		if (local36) {
			if (this.aClass389_4.anInterface36_23 == null) {
				this.aClass389_4.anInterface36_23 = this.aClass86_Sub1_4.method20656(this.aBoolean154);
			}
			local69 = this.aClass389_4.anInterface36_23;
			local69.method28760(this.anInt772 * 8, 8);
			local81 = this.aClass86_Sub1_4.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass86_Sub1_4.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt772; local154++) {
					local149.putFloat(this.aFloatArray30[local154]);
					local149.putFloat(this.aFloatArray29[local154]);
				}
				local69.method28755(0, local149.position(), this.aClass86_Sub1_4.aLong121);
			} else {
				local88 = this.anInt772 * 8;
				local93 = local69.method28745(0, local88);
				for (local95 = 0; local95 < this.anInt772; local95++) {
					local81.putFloat(local93, this.aFloatArray30[local95]);
					local93 += 4L;
					local81.putFloat(local93, this.aFloatArray29[local95]);
					local93 += 4L;
				}
				local69.method28746();
			}
			this.aClass389_4.anInterface36_22 = local69;
			this.aClass389_4.aBoolean729 = true;
		}
		return local48;
	}

	@OriginalMember(owner = "client!aey", name = "ja", descriptor = "()Z", line = 3188)
	boolean method7012() {
		@Pc(7) boolean local7 = !this.aClass389_2.aBoolean729;
		@Pc(20) boolean local20 = (this.anInt787 & 0x37) != 0 && !this.aClass389_3.aBoolean729;
		@Pc(28) boolean local28 = !this.aClass389_1.aBoolean729;
		@Pc(36) boolean local36 = !this.aClass389_4.aBoolean729;
		if (!local28 && !local7 && !local20 && !local36) {
			return true;
		}
		@Pc(48) boolean local48 = true;
		@Pc(69) Interface36 local69;
		@Pc(81) Unsafe local81;
		@Pc(149) ByteBuffer local149;
		@Pc(154) int local154;
		@Pc(95) int local95;
		@Pc(104) short local104;
		@Pc(88) int local88;
		@Pc(93) long local93;
		if (local28 && this.aShortArray27 != null) {
			if (this.aClass389_1.anInterface36_23 == null) {
				this.aClass389_1.anInterface36_23 = this.aClass86_Sub1_4.method20656(this.aBoolean154);
			}
			local69 = this.aClass389_1.anInterface36_23;
			local69.method28760(this.anInt772 * 12, 12);
			local81 = this.aClass86_Sub1_4.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass86_Sub1_4.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt772; local154++) {
					local149.putFloat((float) this.anIntArray70[this.aShortArray27[local154]]);
					local149.putFloat((float) this.anIntArray71[this.aShortArray27[local154]]);
					local149.putFloat((float) this.anIntArray75[this.aShortArray27[local154]]);
				}
				local69.method28755(0, local149.position(), this.aClass86_Sub1_4.aLong121);
			} else {
				local88 = this.anInt772 * 12;
				local93 = local69.method28745(0, local88);
				for (local95 = 0; local95 < this.anInt772; local95++) {
					local104 = this.aShortArray27[local95];
					local81.putFloat(local93, (float) this.anIntArray70[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray71[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray75[local104]);
					local93 += 4L;
				}
				local69.method28746();
			}
			this.aClass389_1.anInterface36_22 = local69;
			this.aClass389_1.aBoolean729 = true;
		}
		@Pc(647) int local647;
		@Pc(600) short[] local600;
		@Pc(568) int local568;
		if (local7) {
			if (this.aClass389_2.anInterface36_23 == null) {
				this.aClass389_2.anInterface36_23 = this.aClass86_Sub1_4.method20656(this.aBoolean154);
			}
			local69 = this.aClass389_2.anInterface36_23;
			local69.method28760(this.anInt772 * 4, 4);
			local81 = this.aClass86_Sub1_4.anUnsafe4;
			@Pc(311) int local311;
			@Pc(346) float local346;
			@Pc(366) float local366;
			@Pc(465) int local465;
			@Pc(264) short[] local264;
			if (local81 == null) {
				local149 = this.aClass86_Sub1_4.aByteBuffer7;
				local149.clear();
				if ((this.anInt787 & 0x37) == 0) {
					@Pc(604) short[] local604;
					@Pc(612) byte[] local612;
					if (this.aClass376_1 == null) {
						local600 = this.aShortArray30;
						local604 = this.aShortArray38;
						local264 = this.aShortArray39;
						local612 = this.aByteArray17;
					} else {
						local600 = this.aClass376_1.aShortArray128;
						local604 = this.aClass376_1.aShortArray127;
						local264 = this.aClass376_1.aShortArray129;
						local612 = this.aClass376_1.aByteArray84;
					}
					@Pc(635) float local635 = this.aClass86_Sub1_4.aFloat204 * 768.0F / (float) this.aShort23;
					@Pc(645) float local645 = this.aClass86_Sub1_4.aFloat208 * 768.0F / (float) this.aShort23;
					for (local647 = 0; local647 < this.anInt772; local647++) {
						@Pc(656) short local656 = this.aShortArray29[local647];
						local311 = this.method7019(this.aShortArray31[local656] & 0xFFFF, this.aShortArray32[local656], this.aShort22);
						@Pc(682) float local682 = (float) (local311 >> 16 & 0xFF) * this.aClass86_Sub1_4.aFloat195;
						@Pc(693) float local693 = (float) (local311 >> 8 & 0xFF) * this.aClass86_Sub1_4.aFloat209;
						local346 = (float) (local311 & 0xFF) * this.aClass86_Sub1_4.aFloat196;
						@Pc(706) byte local706 = local612[local647];
						if (local706 == 0) {
							local366 = (this.aClass86_Sub1_4.aFloatArray71[0] * (float) local600[local647] + this.aClass86_Sub1_4.aFloatArray71[1] * (float) local604[local647] + this.aClass86_Sub1_4.aFloatArray71[2] * (float) local264[local647]) * 0.0026041667F;
						} else {
							local366 = (this.aClass86_Sub1_4.aFloatArray71[0] * (float) local600[local647] + this.aClass86_Sub1_4.aFloatArray71[1] * (float) local604[local647] + this.aClass86_Sub1_4.aFloatArray71[2] * (float) local264[local647]) / ((float) local706 * 256.0F);
						}
						@Pc(796) float local796 = this.aClass86_Sub1_4.aFloat203 + local366 * (local366 < 0.0F ? local645 : local635);
						@Pc(801) int local801 = (int) (local682 * local796);
						if (local801 < 0) {
							local801 = 0;
						} else if (local801 > 255) {
							local801 = 255;
						}
						@Pc(816) int local816 = (int) (local693 * local796);
						if (local816 < 0) {
							local816 = 0;
						} else if (local816 > 255) {
							local816 = 255;
						}
						local465 = (int) (local346 * local796);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						local149.putInt(255 - this.aByteArray18[local656] << 24 | local801 << 16 | local816 << 8 | local465);
					}
				} else {
					for (local154 = 0; local154 < this.anInt772; local154++) {
						@Pc(876) short local876 = this.aShortArray29[local154];
						local95 = 255 - this.aByteArray18[local876] << 24 | this.method7019(this.aShortArray31[local876] & 0xFFFF, this.aShortArray32[local876], this.aShort22);
						local149.putInt(local95);
					}
				}
				local69.method28755(0, local149.position(), this.aClass86_Sub1_4.aLong121);
			} else {
				local88 = this.anInt772 * 4;
				local93 = local69.method28745(0, local88);
				if ((this.anInt787 & 0x37) == 0) {
					@Pc(268) short[] local268;
					@Pc(272) short[] local272;
					@Pc(276) byte[] local276;
					if (this.aClass376_1 == null) {
						local264 = this.aShortArray30;
						local268 = this.aShortArray38;
						local272 = this.aShortArray39;
						local276 = this.aByteArray17;
					} else {
						local264 = this.aClass376_1.aShortArray128;
						local268 = this.aClass376_1.aShortArray127;
						local272 = this.aClass376_1.aShortArray129;
						local276 = this.aClass376_1.aByteArray84;
					}
					@Pc(299) float local299 = this.aClass86_Sub1_4.aFloat204 * 768.0F / (float) this.aShort23;
					@Pc(309) float local309 = this.aClass86_Sub1_4.aFloat208 * 768.0F / (float) this.aShort23;
					for (local311 = 0; local311 < this.anInt772; local311++) {
						@Pc(320) short local320 = this.aShortArray29[local311];
						@Pc(335) int local335 = this.method7019(this.aShortArray31[local320] & 0xFFFF, this.aShortArray32[local320], this.aShort22);
						local346 = (float) (local335 >> 16 & 0xFF) * this.aClass86_Sub1_4.aFloat195;
						@Pc(357) float local357 = (float) (local335 >> 8 & 0xFF) * this.aClass86_Sub1_4.aFloat209;
						local366 = (float) (local335 & 0xFF) * this.aClass86_Sub1_4.aFloat196;
						@Pc(370) byte local370 = local276[local311];
						@Pc(407) float local407;
						if (local370 == 0) {
							local407 = (this.aClass86_Sub1_4.aFloatArray71[0] * (float) local264[local311] + this.aClass86_Sub1_4.aFloatArray71[1] * (float) local268[local311] + this.aClass86_Sub1_4.aFloatArray71[2] * (float) local272[local311]) * 0.0026041667F;
						} else {
							local407 = (this.aClass86_Sub1_4.aFloatArray71[0] * (float) local264[local311] + this.aClass86_Sub1_4.aFloatArray71[1] * (float) local268[local311] + this.aClass86_Sub1_4.aFloatArray71[2] * (float) local272[local311]) / ((float) local370 * 256.0F);
						}
						@Pc(460) float local460 = this.aClass86_Sub1_4.aFloat203 + local407 * (local407 < 0.0F ? local309 : local299);
						local465 = (int) (local346 * local460);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						@Pc(480) int local480 = (int) (local357 * local460);
						if (local480 < 0) {
							local480 = 0;
						} else if (local480 > 255) {
							local480 = 255;
						}
						@Pc(495) int local495 = (int) (local366 * local460);
						if (local495 < 0) {
							local495 = 0;
						} else if (local495 > 255) {
							local495 = 255;
						}
						local81.putInt(local93, 255 - this.aByteArray18[local320] << 24 | local465 << 16 | local480 << 8 | local495);
						local93 += 4L;
					}
				} else {
					for (local95 = 0; local95 < this.anInt772; local95++) {
						local104 = this.aShortArray29[local95];
						local568 = 255 - this.aByteArray18[local104] << 24 | this.method7019(this.aShortArray31[local104] & 0xFFFF, this.aShortArray32[local104], this.aShort22);
						local81.putInt(local93, local568);
						local93 += 4L;
					}
				}
				local69.method28746();
			}
			this.aClass389_2.anInterface36_22 = local69;
			this.aClass389_2.aBoolean729 = true;
		}
		if (local20) {
			if (this.aClass389_3.anInterface36_23 == null) {
				this.aClass389_3.anInterface36_23 = this.aClass86_Sub1_4.method20656(this.aBoolean154);
			}
			local69 = this.aClass389_3.anInterface36_23;
			local69.method28760(this.anInt772 * 12, 12);
			@Pc(956) short[] local956;
			@Pc(960) short[] local960;
			@Pc(968) byte[] local968;
			if (this.aClass376_1 == null) {
				local956 = this.aShortArray30;
				local960 = this.aShortArray38;
				local600 = this.aShortArray39;
				local968 = this.aByteArray17;
			} else {
				local956 = this.aClass376_1.aShortArray128;
				local960 = this.aClass376_1.aShortArray127;
				local600 = this.aClass376_1.aShortArray129;
				local968 = this.aClass376_1.aByteArray84;
			}
			@Pc(985) Unsafe local985 = this.aClass86_Sub1_4.anUnsafe4;
			if (local985 == null) {
				@Pc(1073) ByteBuffer local1073 = this.aClass86_Sub1_4.aByteBuffer7;
				local1073.clear();
				for (local568 = 0; local568 < this.anInt772; local568++) {
					@Pc(1098) Class447 local1098 = new Class447((float) local956[local568], (float) local960[local568], (float) local600[local568]);
					if (local1098.method29170() != 0.0F) {
						if (local968[local568] > 1) {
							local1098.method29191((float) local968[local568]);
						}
						local1098.method29145();
					}
					local1073.putFloat(local1098.aFloat277);
					local1073.putFloat(local1098.aFloat276);
					local1073.putFloat(local1098.aFloat278);
				}
				local69.method28755(0, local1073.position(), this.aClass86_Sub1_4.aLong121);
			} else {
				@Pc(992) int local992 = this.anInt772 * 12;
				@Pc(997) long local997 = local69.method28745(0, local992);
				for (local647 = 0; local647 < this.anInt772; local647++) {
					@Pc(1019) Class447 local1019 = new Class447((float) local956[local647], (float) local960[local647], (float) local600[local647]);
					if (local1019.method29170() != 0.0F) {
						if (local968[local647] > 1) {
							local1019.method29191((float) local968[local647]);
						}
						local1019.method29145();
					}
					local985.putFloat(local997, local1019.aFloat277);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat276);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat278);
					local997 += 4L;
				}
				local69.method28746();
			}
			this.aClass389_3.anInterface36_22 = local69;
			this.aClass389_3.aBoolean729 = true;
		}
		if (local36) {
			if (this.aClass389_4.anInterface36_23 == null) {
				this.aClass389_4.anInterface36_23 = this.aClass86_Sub1_4.method20656(this.aBoolean154);
			}
			local69 = this.aClass389_4.anInterface36_23;
			local69.method28760(this.anInt772 * 8, 8);
			local81 = this.aClass86_Sub1_4.anUnsafe4;
			if (local81 == null) {
				local149 = this.aClass86_Sub1_4.aByteBuffer7;
				local149.clear();
				for (local154 = 0; local154 < this.anInt772; local154++) {
					local149.putFloat(this.aFloatArray30[local154]);
					local149.putFloat(this.aFloatArray29[local154]);
				}
				local69.method28755(0, local149.position(), this.aClass86_Sub1_4.aLong121);
			} else {
				local88 = this.anInt772 * 8;
				local93 = local69.method28745(0, local88);
				for (local95 = 0; local95 < this.anInt772; local95++) {
					local81.putFloat(local93, this.aFloatArray30[local95]);
					local93 += 4L;
					local81.putFloat(local93, this.aFloatArray29[local95]);
					local93 += 4L;
				}
				local69.method28746();
			}
			this.aClass389_4.anInterface36_22 = local69;
			this.aClass389_4.aBoolean729 = true;
		}
		return local48;
	}

	@OriginalMember(owner = "client!aey", name = "it", descriptor = "()V", line = 3433)
	void method7013() {
		if (this.aClass389_1 != null) {
			this.aClass389_1.method28355();
		}
		if (this.aClass389_4 != null) {
			this.aClass389_4.method28355();
		}
		if (this.aClass389_2 != null) {
			this.aClass389_2.method28355();
		}
		if (this.aClass389_3 != null) {
			this.aClass389_3.method28355();
		}
		if (this.aClass356_1 != null) {
			this.aClass356_1.method27969();
		}
	}

	@OriginalMember(owner = "client!aey", name = "jc", descriptor = "()V", line = 3433)
	void method7014() {
		if (this.aClass389_1 != null) {
			this.aClass389_1.method28355();
		}
		if (this.aClass389_4 != null) {
			this.aClass389_4.method28355();
		}
		if (this.aClass389_2 != null) {
			this.aClass389_2.method28355();
		}
		if (this.aClass389_3 != null) {
			this.aClass389_3.method28355();
		}
		if (this.aClass356_1 != null) {
			this.aClass356_1.method27969();
		}
	}

	@OriginalMember(owner = "client!aey", name = "jm", descriptor = "()V", line = 3433)
	void method7015() {
		if (this.aClass389_1 != null) {
			this.aClass389_1.method28355();
		}
		if (this.aClass389_4 != null) {
			this.aClass389_4.method28355();
		}
		if (this.aClass389_2 != null) {
			this.aClass389_2.method28355();
		}
		if (this.aClass389_3 != null) {
			this.aClass389_3.method28355();
		}
		if (this.aClass356_1 != null) {
			this.aClass356_1.method27969();
		}
	}

	@OriginalMember(owner = "client!aey", name = "in", descriptor = "(II)I", line = 3441)
	int method7016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!aey", name = "jq", descriptor = "(II)I", line = 3441)
	int method7017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!aey", name = "ju", descriptor = "(ISI)I", line = 3448)
	int method7018(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.aClass86_Sub1_4.anIntArray261[this.method7016(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(20) Class215 local20 = this.aClass86_Sub1_4.aClass209_9.method25584(arg1 & 0xFFFF);
			@Pc(25) int local25 = local20.aByte122 & 0xFF;
			@Pc(31) int local31;
			@Pc(58) int local58;
			if (local25 != 0) {
				local31 = arg2 * 131586;
				if (arg2 < 0) {
					local31 = 0;
				} else if (arg2 > 127) {
					local31 = 16777215;
				} else {
					local31 = arg2 * 131586;
				}
				if (local25 == 256) {
					local8 = local31;
				} else {
					local58 = 256 - local25;
					local8 = ((local31 & 0xFF00FF) * local25 + (local8 & 0xFF00FF) * local58 & 0xFF00FF00) + ((local31 & 0xFF00) * local25 + (local8 & 0xFF00) * local58 & 0xFF0000) >> 8;
				}
			}
			local31 = local20.aByte117 & 0xFF;
			if (local31 != 0) {
				local31 += 256;
				@Pc(104) int local104 = (local8 >> 16 & 0xFF) * local31;
				if (local104 > 65535) {
					local104 = 65535;
				}
				local58 = (local8 >> 8 & 0xFF) * local31;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(128) int local128 = (local8 & 0xFF) * local31;
				if (local128 > 65535) {
					local128 = 65535;
				}
				local8 = ((local104 & 0xFF00) << 8) + (local58 & 0xFF00) + (local128 >> 8);
			}
		}
		return local8 & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!aey", name = "ig", descriptor = "(ISI)I", line = 3448)
	int method7019(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.aClass86_Sub1_4.anIntArray261[this.method7016(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(20) Class215 local20 = this.aClass86_Sub1_4.aClass209_9.method25584(arg1 & 0xFFFF);
			@Pc(25) int local25 = local20.aByte122 & 0xFF;
			@Pc(31) int local31;
			@Pc(58) int local58;
			if (local25 != 0) {
				local31 = arg2 * 131586;
				if (arg2 < 0) {
					local31 = 0;
				} else if (arg2 > 127) {
					local31 = 16777215;
				} else {
					local31 = arg2 * 131586;
				}
				if (local25 == 256) {
					local8 = local31;
				} else {
					local58 = 256 - local25;
					local8 = ((local31 & 0xFF00FF) * local25 + (local8 & 0xFF00FF) * local58 & 0xFF00FF00) + ((local31 & 0xFF00) * local25 + (local8 & 0xFF00) * local58 & 0xFF0000) >> 8;
				}
			}
			local31 = local20.aByte117 & 0xFF;
			if (local31 != 0) {
				local31 += 256;
				@Pc(104) int local104 = (local8 >> 16 & 0xFF) * local31;
				if (local104 > 65535) {
					local104 = 65535;
				}
				local58 = (local8 >> 8 & 0xFF) * local31;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(128) int local128 = (local8 & 0xFF) * local31;
				if (local128 > 65535) {
					local128 = 65535;
				}
				local8 = ((local104 & 0xFF00) << 8) + (local58 & 0xFF00) + (local128 >> 8);
			}
		}
		return local8 & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!aey", name = "je", descriptor = "(ISI)I", line = 3448)
	int method7020(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.aClass86_Sub1_4.anIntArray261[this.method7016(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(20) Class215 local20 = this.aClass86_Sub1_4.aClass209_9.method25584(arg1 & 0xFFFF);
			@Pc(25) int local25 = local20.aByte122 & 0xFF;
			@Pc(31) int local31;
			@Pc(58) int local58;
			if (local25 != 0) {
				local31 = arg2 * 131586;
				if (arg2 < 0) {
					local31 = 0;
				} else if (arg2 > 127) {
					local31 = 16777215;
				} else {
					local31 = arg2 * 131586;
				}
				if (local25 == 256) {
					local8 = local31;
				} else {
					local58 = 256 - local25;
					local8 = ((local31 & 0xFF00FF) * local25 + (local8 & 0xFF00FF) * local58 & 0xFF00FF00) + ((local31 & 0xFF00) * local25 + (local8 & 0xFF00) * local58 & 0xFF0000) >> 8;
				}
			}
			local31 = local20.aByte117 & 0xFF;
			if (local31 != 0) {
				local31 += 256;
				@Pc(104) int local104 = (local8 >> 16 & 0xFF) * local31;
				if (local104 > 65535) {
					local104 = 65535;
				}
				local58 = (local8 >> 8 & 0xFF) * local31;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(128) int local128 = (local8 & 0xFF) * local31;
				if (local128 > 65535) {
					local128 = 65535;
				}
				local8 = ((local104 & 0xFF00) << 8) + (local58 & 0xFF00) + (local128 >> 8);
			}
		}
		return local8 & 0xFFFFFF;
	}
}
