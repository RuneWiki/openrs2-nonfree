package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zq")
public class Class699 implements Interface75 {

	@OriginalMember(owner = "client!zq", name = "p", descriptor = "Lclient!zq;")
	public static final Class699 aClass699_5 = new Class699(-2);

	@OriginalMember(owner = "client!zq", name = "c", descriptor = "Lclient!zq;")
	public static final Class699 aClass699_2 = new Class699(-3);

	@OriginalMember(owner = "client!zq", name = "v", descriptor = "Lclient!zq;")
	static final Class699 aClass699_3 = new Class699(2);

	@OriginalMember(owner = "client!zq", name = "l", descriptor = "Lclient!zq;")
	public static final Class699 aClass699_4 = new Class699(3);

	@OriginalMember(owner = "client!zq", name = "y", descriptor = "Lclient!zq;")
	static final Class699 aClass699_6 = new Class699(4);

	@OriginalMember(owner = "client!zq", name = "w", descriptor = "Lclient!zq;")
	static final Class699 aClass699_14 = new Class699(5);

	@OriginalMember(owner = "client!zq", name = "t", descriptor = "Lclient!zq;")
	static final Class699 aClass699_7 = new Class699(6);

	@OriginalMember(owner = "client!zq", name = "q", descriptor = "Lclient!zq;")
	static final Class699 aClass699_8 = new Class699(7);

	@OriginalMember(owner = "client!zq", name = "x", descriptor = "Lclient!zq;")
	static final Class699 aClass699_13 = new Class699(8);

	@OriginalMember(owner = "client!zq", name = "d", descriptor = "Lclient!zq;")
	static final Class699 aClass699_10 = new Class699(9);

	@OriginalMember(owner = "client!zq", name = "s", descriptor = "Lclient!zq;")
	static final Class699 aClass699_11 = new Class699(10);

	@OriginalMember(owner = "client!zq", name = "r", descriptor = "Lclient!zq;")
	static final Class699 aClass699_12 = new Class699(20);

	@OriginalMember(owner = "client!zq", name = "g", descriptor = "Lclient!zq;")
	static final Class699 aClass699_18 = new Class699(21);

	@OriginalMember(owner = "client!zq", name = "z", descriptor = "Lclient!zq;")
	static final Class699 aClass699_17 = new Class699(30);

	@OriginalMember(owner = "client!zq", name = "j", descriptor = "Lclient!zq;")
	static final Class699 aClass699_15 = new Class699(31);

	@OriginalMember(owner = "client!zq", name = "i", descriptor = "Lclient!zq;")
	static final Class699 aClass699_16 = new Class699(32);

	@OriginalMember(owner = "client!zq", name = "k", descriptor = "Lclient!zq;")
	static final Class699 aClass699_9 = new Class699(33);

	@OriginalMember(owner = "client!zq", name = "u", descriptor = "Lclient!zq;")
	static final Class699 aClass699_20 = new Class699(34);

	@OriginalMember(owner = "client!zq", name = "e", descriptor = "Lclient!zq;")
	static final Class699 aClass699_19 = new Class699(38);

	@OriginalMember(owner = "client!zq", name = "f", descriptor = "I")
	final int anInt5881;

	@OriginalMember(owner = "client!zq", name = "<init>", descriptor = "(I)V", line = 33)
	Class699(@OriginalArg(0) int arg0) {
		this.anInt5881 = arg0 * -1477203655;
	}

	@OriginalMember(owner = "client!zq", name = "c", descriptor = "()I", line = 38)
	@Override
	public int method36479() {
		return this.anInt5881 * -1797753591;
	}

	@OriginalMember(owner = "client!zq", name = "l", descriptor = "()I", line = 38)
	@Override
	public int method36478() {
		return this.anInt5881 * -1797753591;
	}

	@OriginalMember(owner = "client!zq", name = "y", descriptor = "()I", line = 38)
	@Override
	public int method36477() {
		return this.anInt5881 * -1797753591;
	}

	@OriginalMember(owner = "client!zq", name = "jy", descriptor = "(Lclient!ns;I)V", line = 9034)
	static final void method36480(@OriginalArg(0) Class428 arg0) {
		@Pc(2) Class77_Sub39_Sub1 local2 = client.aClass82_2.aClass77_Sub39_Sub1_1;
		@Pc(9) int local9;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(101) int local101;
		@Pc(105) int local105;
		@Pc(19) int local19;
		@Pc(73) int local73;
		@Pc(77) int local77;
		if (arg0 == Class428.aClass428_4) {
			local9 = local2.method22478();
			local19 = (local9 >> 4 & 0xF) + Class468.anInt4988 * -740028054;
			local27 = Class86.anInt2797 * -1531537914 + (local9 & 0xF);
			local31 = local2.method22478();
			@Pc(40) boolean local40 = (local31 & 0x1) != 0;
			@Pc(49) boolean local49 = (local31 & 0x2) != 0;
			local57 = local49 ? local31 >> 2 : -1;
			local63 = local19 + local2.method22481();
			local69 = local27 + local2.method22481();
			local73 = local2.method22487();
			local77 = local2.method22487();
			local81 = local2.method22483();
			local85 = local2.method22478();
			if (local49) {
				local85 = (byte) local85;
			} else {
				local85 *= 4;
			}
			local101 = local2.method22478() * 4;
			local105 = local2.method22483();
			@Pc(109) int local109 = local2.method22483();
			@Pc(113) int local113 = local2.method22478();
			@Pc(117) int local117 = local2.method22483();
			if (local113 == 255) {
				local113 = -1;
			}
			@Pc(126) int local126 = local2.method22487();
			if (client.aClass517_1.method30395() != Class505.aClass505_1 && (local19 >= 0 && local27 >= 0 && local19 < client.aClass517_1.method30411() * 2 && local27 < client.aClass517_1.method30411() * 2 && local63 >= 0 && local69 >= 0 && local63 < client.aClass517_1.method30417() * 2 && local69 < client.aClass517_1.method30417() * 2 && local81 != 65535)) {
				local19 *= 256;
				local27 = local27 * 256;
				local63 *= 256;
				local69 = local69 * 256;
				local85 <<= 0x2;
				local101 <<= 0x2;
				local117 <<= 0x2;
				Class427.method28800(local81, local73, local77, local57, local85, local101, local19, local27, local63, local69, local105, local109, local113, local117, local40, local126);
			}
		} else if (Class428.aClass428_2 == arg0) {
			local9 = local2.method22500();
			local19 = local2.method22478();
			((Class599) client.aClass517_1.method30444().method18319(local9)).method31995(local19);
		} else {
			@Pc(274) int local274;
			@Pc(278) int local278;
			if (Class428.aClass428_11 == arg0) {
				local9 = local2.method22478();
				local19 = (local9 >> 4 & 0x7) + Class468.anInt4988 * -370014027;
				local27 = (local9 & 0x7) + Class86.anInt2797 * -765768957;
				local31 = local2.method22591();
				local274 = local31 >> 2;
				local278 = local31 & 0x3;
				local57 = client.anIntArray326[local274];
				if (client.aClass517_1.method30395().method30256() || local19 >= 0 && local27 >= 0 && local19 < client.aClass517_1.method30411() && local27 < client.aClass517_1.method30417()) {
					Class488.method29993(Class421.anInt4804 * -1729998935, local19, local27, local57, -1, local274, local278);
				}
			} else if (Class428.aClass428_5 == arg0) {
				local9 = local2.method22478();
				local19 = (local9 >> 4 & 0x7) + Class468.anInt4988 * -370014027;
				local27 = Class86.anInt2797 * -765768957 + (local9 & 0x7);
				local31 = local2.method22483();
				if (local31 == 65535) {
					local31 = -1;
				}
				local274 = local2.method22478();
				local278 = local274 >> 4 & 0xF;
				local57 = local274 & 0x7;
				local63 = local2.method22478();
				local69 = local2.method22478();
				local73 = local2.method22483();
				@Pc(383) boolean local383 = local2.method22478() == 1;
				if (client.aClass517_1.method30395() != Class505.aClass505_1 && (local19 >= 0 && local27 >= 0 && local19 < client.aClass517_1.method30411() && local27 < client.aClass517_1.method30417())) {
					local81 = local278 + 1;
					if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray274[0] >= local19 - local81 && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray274[0] <= local81 + local19 && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray275[0] >= local27 - local81 && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray275[0] <= local81 + local27) {
						@Pc(452) Class447 local452 = new Class447((float) (local19 << 9), 0.0F, (float) (local27 << 9));
						local101 = Class421.anInt4804 * -1729998935;
						local105 = local383 ? Class220.aClass220_2.method25727() : Class220.aClass220_8.method25727();
						Class94_Sub4.aClass261_1.method26335(Class239.aClass239_10, local31, local57, local69, local105, Class235.aClass235_3, 0.0F, (float) (local278 << 9), local452, local101, local73, local63);
					}
				}
			} else if (Class428.aClass428_6 == arg0) {
				local9 = local2.method22478();
				@Pc(500) boolean local500 = (local9 & 0x80) != 0;
				local27 = Class468.anInt4988 * -370014027 + (local9 >> 3 & 0x7);
				local31 = Class86.anInt2797 * -765768957 + (local9 & 0x7);
				local274 = local27 + local2.method22481();
				local278 = local31 + local2.method22481();
				local57 = local2.method22487();
				local63 = local2.method22483();
				local69 = local2.method22478() * 4;
				local73 = local2.method22478() * 4;
				local77 = local2.method22483();
				local81 = local2.method22483();
				local85 = local2.method22478();
				local101 = local2.method22483();
				local105 = local2.method22487();
				if (local85 == 255) {
					local85 = -1;
				}
				if (client.aClass517_1.method30395() != Class505.aClass505_1 && (local27 >= 0 && local31 >= 0 && local27 < client.aClass517_1.method30411() && local31 < client.aClass517_1.method30417() && local274 >= 0 && local278 >= 0 && local274 < client.aClass517_1.method30411() && local278 < client.aClass517_1.method30417() && local63 != 65535)) {
					local27 = local27 * 512 + 256;
					local31 = local31 * 512 + 256;
					local274 = local274 * 512 + 256;
					local278 = local278 * 512 + 256;
					local69 <<= 0x2;
					local73 <<= 0x2;
					local101 <<= 0x2;
					@Pc(679) Class104_Sub1_Sub1_Sub6 local679 = new Class104_Sub1_Sub1_Sub6(client.aClass517_1.method30435(), local63, Class421.anInt4804 * -1729998935, Class421.anInt4804 * -1729998935, local27, local31, local69, client.anInt3414 + local77, client.anInt3414 + local81, local85, local101, 0, local57, local73, local500, -1, local105);
					local679.method24184(local274, local278, Class277.method26658(local274, local278, Class421.anInt4804 * -1729998935) - local73, client.anInt3414 + local77);
					client.aClass695_45.method36383(new Class77_Sub1_Sub4(local679));
				}
			} else if (arg0 == Class428.aClass428_13) {
				local9 = local2.method22612();
				local19 = local2.method22621();
				local27 = local2.method22598();
				@Pc(723) Class595 local723 = client.aClass517_1.method30409();
				local274 = (local27 & 0x7) + Class86.anInt2797 * -765768957;
				local278 = local723.anInt5506 * -1166289421 + local274;
				local57 = Class468.anInt4988 * -370014027 + (local27 >> 4 & 0x7);
				local63 = local57 + local723.anInt5504 * -424199969;
				@Pc(773) boolean local773 = local57 >= 0 && local274 >= 0 && local57 < client.aClass517_1.method30411() && local274 < client.aClass517_1.method30417();
				if (local773 || client.aClass517_1.method30395().method30256()) {
					Class501.method30224(Class421.anInt4804 * -1729998935, local63, local278, new Class77_Sub24(local19, local9));
					if (local773) {
						Class138.method14218(Class421.anInt4804 * -1729998935, local57, local274);
					}
				}
			} else if (arg0 == Class428.aClass428_10) {
				local9 = local2.method22621();
				local19 = local2.method22478();
				@Pc(818) Class595 local818 = client.aClass517_1.method30409();
				local31 = Class86.anInt2797 * -765768957 + (local19 & 0x7);
				local274 = local31 + local818.anInt5506 * -1166289421;
				local278 = (local19 >> 4 & 0x7) + Class468.anInt4988 * -370014027;
				local57 = local278 + local818.anInt5504 * -424199969;
				@Pc(866) Class77_Sub9 local866 = (Class77_Sub9) client.aClass12_19.method173((long) (Class421.anInt4804 * -1729998935 << 28 | local274 << 14 | local57));
				if (local866 != null) {
					for (@Pc(875) Class77_Sub24 local875 = (Class77_Sub24) local866.aClass695_19.method36395(); local875 != null; local875 = (Class77_Sub24) local866.aClass695_19.method36406()) {
						if (local9 == local875.anInt1549 * -400233975) {
							local875.method24063();
							break;
						}
					}
					if (local866.aClass695_19.method36416()) {
						local866.method24063();
					}
					if (local278 >= 0 && local31 >= 0 && local278 < client.aClass517_1.method30411() && local31 < client.aClass517_1.method30417()) {
						Class138.method14218(Class421.anInt4804 * -1729998935, local278, local31);
					}
				}
			} else {
				@Pc(936) Class595 local936;
				if (arg0 == Class428.aClass428_15) {
					local9 = local2.method22478();
					local936 = client.aClass517_1.method30409();
					local27 = (local9 & 0x7) + Class86.anInt2797 * -765768957;
					local31 = local936.anInt5506 * -1166289421 + local27;
					local274 = Class468.anInt4988 * -370014027 + (local9 >> 4 & 0x7);
					local278 = local274 + local936.anInt5504 * -424199969;
					local57 = local2.method22483();
					local63 = local2.method22483();
					local69 = local2.method22612();
					if (local63 != client.anInt3389 * -643758853) {
						@Pc(1003) boolean local1003 = local274 >= 0 && local27 >= 0 && local274 < client.aClass517_1.method30411() && local27 < client.aClass517_1.method30417();
						if (local1003 || client.aClass517_1.method30395().method30256()) {
							Class501.method30224(Class421.anInt4804 * -1729998935, local278, local31, new Class77_Sub24(local69, local57));
							if (local1003) {
								Class138.method14218(Class421.anInt4804 * -1729998935, local274, local27);
							}
						}
					}
				} else if (arg0 == Class428.aClass428_3) {
					local9 = local2.method22648();
					local19 = local2.method22589();
					local27 = local19 >> 2;
					local31 = local19 & 0x3;
					local274 = client.anIntArray326[local27];
					local278 = local2.method22478();
					local57 = Class468.anInt4988 * -370014027 + (local278 >> 4 & 0x7);
					local63 = (local278 & 0x7) + Class86.anInt2797 * -765768957;
					if (client.aClass517_1.method30395().method30256() || local57 >= 0 && local63 >= 0 && local57 < client.aClass517_1.method30411() && local63 < client.aClass517_1.method30417()) {
						Class488.method29993(Class421.anInt4804 * -1729998935, local57, local63, local274, local9, local27, local31);
					}
				} else if (arg0 == Class428.aClass428_7) {
					local9 = local2.method22478();
					local19 = Class468.anInt4988 * -370014027 + (local9 >> 4 & 0x7);
					local27 = (local9 & 0x7) + Class86.anInt2797 * -765768957;
					local31 = local2.method22483();
					if (local31 == 65535) {
						local31 = -1;
					}
					local274 = local2.method22483();
					local278 = local2.method22483();
					local57 = local2.method22478();
					local63 = local2.method22487();
					if (client.aClass517_1.method30395() != Class505.aClass505_1 && (local19 >= 0 && local27 >= 0 && local19 < client.aClass517_1.method30411() && local27 < client.aClass517_1.method30417())) {
						if (local31 == -1) {
							@Pc(1193) Class77_Sub1_Sub5 local1193 = (Class77_Sub1_Sub5) client.aClass12_21.method173((long) (local19 << 16 | local27));
							if (local1193 != null) {
								local1193.aClass104_Sub1_Sub1_Sub5_1.method23997();
								local1193.method24063();
							}
						} else {
							local69 = local19 * 512 + 256;
							local73 = local27 * 512 + 256;
							local77 = Class421.anInt4804 * -1729998935;
							if (local77 < 3 && client.aClass517_1.method30441().method29665(local19, local27)) {
								local77++;
							}
							@Pc(1262) Class104_Sub1_Sub1_Sub5 local1262 = new Class104_Sub1_Sub1_Sub5(client.aClass517_1.method30435(), local31, local278, Class421.anInt4804 * -1729998935, local77, local69, Class277.method26658(local69, local73, Class421.anInt4804 * -1729998935) - local274, local73, local19, local19, local27, local27, local57, false, local63);
							client.aClass12_21.method184(new Class77_Sub1_Sub5(local1262), (long) (local19 << 16 | local27));
						}
					}
				} else if (Class428.aClass428_12 == arg0) {
					local9 = local2.method22591();
					local19 = (local9 >> 4 & 0x7) + Class468.anInt4988 * -370014027;
					local27 = Class86.anInt2797 * -765768957 + (local9 & 0x7);
					local31 = local2.method22478();
					local274 = local2.method22500();
					local278 = local2.method22589();
					local57 = local278 >> 2;
					local63 = local278 & 0x3;
					local69 = client.anIntArray326[local57];
					if (client.aClass517_1.method30395() != Class505.aClass505_1) {
						Class40.method686(Class421.anInt4804 * -1729998935, local19, local27, local69, local57, local63, local274, local31);
					}
				} else if (arg0 == Class428.aClass428_1) {
					local9 = local2.method22478();
					local19 = Class468.anInt4988 * -370014027 + (local9 >> 4 & 0x7);
					local27 = Class86.anInt2797 * -765768957 + (local9 & 0x7);
					local31 = local2.method22483();
					if (local31 == 65535) {
						local31 = -1;
					}
					local274 = local2.method22478();
					local278 = local274 >> 4 & 0xF;
					local57 = local274 & 0x7;
					local63 = local2.method22478();
					local69 = local2.method22478();
					local73 = local2.method22483();
					if (client.aClass517_1.method30395() != Class505.aClass505_1 && (local19 >= 0 && local27 >= 0 && local19 < client.aClass517_1.method30411() && local27 < client.aClass517_1.method30417())) {
						local77 = local278 + 1;
						if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray274[0] >= local19 - local77 && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray274[0] <= local19 + local77 && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray275[0] >= local27 - local77 && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray275[0] <= local27 + local77) {
							@Pc(1472) Class447 local1472 = new Class447((float) (local19 << 9), 0.0F, (float) (local27 << 9));
							local85 = Class421.anInt4804 * -1729998935;
							Class94_Sub4.aClass261_1.method26335(Class239.aClass239_10, local31, local57, local69, Class220.aClass220_8.method25727(), Class235.aClass235_3, 0.0F, (float) (local278 << 9), local1472, local85, local73, local63);
						}
					}
				} else if (arg0 == Class428.aClass428_9) {
					local9 = local2.method22591();
					local19 = Class468.anInt4988 * -370014027 + (local9 >> 4 & 0x7);
					local27 = (local9 & 0x7) + Class86.anInt2797 * -765768957;
					local31 = local2.method22648();
					local274 = local2.method22589();
					local278 = local2.method22591();
					local57 = local278 >> 2;
					local63 = client.anIntArray326[local57];
					if (Class593.aClass593_23.anInt5501 * 847393323 == local57) {
						local57 = Class593.aClass593_9.anInt5501 * 847393323;
					}
					if ((local274 & 0x1) == 1) {
						Class298.method27056(Class421.anInt4804 * -1729998935, local19, local27, local63, local31, local57, null);
					} else {
						@Pc(1572) int[] local1572 = null;
						if ((local274 & 0x2) == 2) {
							local73 = local2.method22478();
							local1572 = new int[local73];
							for (local77 = 0; local77 < local73; local77++) {
								local1572[local77] = local2.method22500();
							}
						}
						@Pc(1599) short[] local1599 = null;
						if ((local274 & 0x4) == 4) {
							local77 = local2.method22478();
							local1599 = new short[local77];
							for (local81 = 0; local81 < local77; local81++) {
								local1599[local81] = (short) local2.method22483();
							}
						}
						@Pc(1627) short[] local1627 = null;
						if ((local274 & 0x8) == 8) {
							local81 = local2.method22478();
							local1627 = new short[local81];
							for (local85 = 0; local85 < local81; local85++) {
								local1627[local85] = (short) local2.method22483();
							}
						}
						Class298.method27056(Class421.anInt4804 * -1729998935, local19, local27, local63, local31, local57, new Class594(Class77_Sub4.aLong59 * 611374076583165065L, local1572, local1599, local1627));
						Class77_Sub4.aLong59 += 4551746311500396985L;
					}
				} else if (arg0 == Class428.aClass428_14) {
					local9 = local2.method22478();
					local936 = client.aClass517_1.method30409();
					local27 = Class86.anInt2797 * -765768957 + (local9 & 0x7);
					local31 = local936.anInt5506 * -1166289421 + local27;
					local274 = Class468.anInt4988 * -370014027 + (local9 >> 4 & 0x7);
					local278 = local936.anInt5504 * -424199969 + local274;
					local57 = local2.method22483();
					local63 = local2.method22483();
					local69 = local2.method22483();
					if (client.aClass12_19 != null) {
						@Pc(1751) Class77_Sub9 local1751 = (Class77_Sub9) client.aClass12_19.method173((long) (Class421.anInt4804 * -1729998935 << 28 | local31 << 14 | local278));
						if (local1751 != null) {
							for (@Pc(1759) Class77_Sub24 local1759 = (Class77_Sub24) local1751.aClass695_19.method36395(); local1759 != null; local1759 = (Class77_Sub24) local1751.aClass695_19.method36406()) {
								if (local57 == local1759.anInt1549 * -400233975 && local1759.anInt1548 * -491988633 == local63) {
									local1759.method24063();
									local1759.anInt1548 = local69 * -917228969;
									Class501.method30224(Class421.anInt4804 * -1729998935, local278, local31, local1759);
									break;
								}
							}
							if (local274 >= 0 && local27 >= 0 && local274 < client.aClass517_1.method30411() && local27 < client.aClass517_1.method30417()) {
								Class138.method14218(Class421.anInt4804 * -1729998935, local274, local27);
							}
						}
					}
				} else if (arg0 == Class428.aClass428_8) {
					local2.method22478();
					local9 = local2.method22478();
					local19 = (local9 >> 4 & 0x7) + Class468.anInt4988 * -370014027;
					local27 = (local9 & 0x7) + Class86.anInt2797 * -765768957;
					local31 = local2.method22483();
					local274 = local2.method22478();
					local278 = local2.method22492();
					@Pc(1865) String local1865 = local2.method22523();
					if (client.aClass517_1.method30395() != Class505.aClass505_1) {
						Class397.method28440(Class421.anInt4804 * -1729998935, local19, local27, local274, local31, local278, local1865);
					}
				} else {
					Class293.method27014("" + arg0, new RuntimeException());
					Class619.method32395(false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!zq", name = "ace", descriptor = "(Lclient!yf;I)V", line = 9499)
	static final void method36481(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 1544997815;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(43) int local43 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3];
		@Pc(53) int local53 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 4];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (local23 - local13) * (local53 - local33) / (local43 - local33) + local13;
	}
}
