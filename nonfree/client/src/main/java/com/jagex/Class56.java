package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ace")
public abstract class Class56 implements Interface4 {

	@OriginalMember(owner = "client!ace", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_85;

	@OriginalMember(owner = "client!ace", name = "n", descriptor = "Lclient!eb;")
	Class240 aClass240_63;

	@OriginalMember(owner = "client!ace", name = "e", descriptor = "(I)[Lclient!hy;", line = 14)
	static Class328[] method18038() {
		return new Class328[] { Class328.aClass328_2, Class328.aClass328_4, Class328.aClass328_3 };
	}

	@OriginalMember(owner = "client!ace", name = "<init>", descriptor = "(Lclient!py;I)V", line = 97)
	Class56(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1) {
		this.aClass497_85 = arg0;
		this.aClass240_63 = new Class240(arg1);
	}

	@OriginalMember(owner = "client!ace", name = "e", descriptor = "(IB)V", line = 103)
	void method18022(@OriginalArg(0) int arg0) {
		this.aClass240_63 = new Class240(arg0);
	}

	@OriginalMember(owner = "client!ace", name = "l", descriptor = "(I)V", line = 103)
	void method18023(@OriginalArg(0) int arg0) {
		this.aClass240_63 = new Class240(arg0);
	}

	@OriginalMember(owner = "client!ace", name = "f", descriptor = "(I)V", line = 103)
	void method18026(@OriginalArg(0) int arg0) {
		this.aClass240_63 = new Class240(arg0);
	}

	@OriginalMember(owner = "client!ace", name = "w", descriptor = "(I)V", line = 103)
	void method18027(@OriginalArg(0) int arg0) {
		this.aClass240_63 = new Class240(arg0);
	}

	@OriginalMember(owner = "client!ace", name = "n", descriptor = "(I)V", line = 107)
	void method18025() {
		@Pc(3) Class240 local3 = this.aClass240_63;
		synchronized (this.aClass240_63) {
			this.aClass240_63.method25833();
		}
	}

	@OriginalMember(owner = "client!ace", name = "u", descriptor = "()V", line = 107)
	void method18029() {
		@Pc(3) Class240 local3 = this.aClass240_63;
		synchronized (this.aClass240_63) {
			this.aClass240_63.method25833();
		}
	}

	@OriginalMember(owner = "client!ace", name = "z", descriptor = "()V", line = 107)
	void method18030() {
		@Pc(3) Class240 local3 = this.aClass240_63;
		synchronized (this.aClass240_63) {
			this.aClass240_63.method25833();
		}
	}

	@OriginalMember(owner = "client!ace", name = "m", descriptor = "(II)V", line = 113)
	void method18024(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_63;
		synchronized (this.aClass240_63) {
			this.aClass240_63.method25832(arg0);
		}
	}

	@OriginalMember(owner = "client!ace", name = "k", descriptor = "(I)V", line = 119)
	void method18028() {
		@Pc(3) Class240 local3 = this.aClass240_63;
		synchronized (this.aClass240_63) {
			this.aClass240_63.method25837();
		}
	}

	@OriginalMember(owner = "client!ace", name = "p", descriptor = "()V", line = 119)
	void method18031() {
		@Pc(3) Class240 local3 = this.aClass240_63;
		synchronized (this.aClass240_63) {
			this.aClass240_63.method25837();
		}
	}

	@OriginalMember(owner = "client!ace", name = "d", descriptor = "()V", line = 119)
	void method18032() {
		@Pc(3) Class240 local3 = this.aClass240_63;
		synchronized (this.aClass240_63) {
			this.aClass240_63.method25837();
		}
	}

	@OriginalMember(owner = "client!ace", name = "k", descriptor = "(I[II)V", line = 221)
	public static void method18036(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (-1 != arg0 && Class383.method28145(arg0, arg1)) {
			@Pc(14) Class312[] local14 = Class166_Sub1.aClass320Array1[arg0].aClass312Array3;
			Class118_Sub1.method8416(local14);
		}
	}

	@OriginalMember(owner = "client!ace", name = "q", descriptor = "(Lclient!dh;Lclient!ch;Lclient!hf;IIIIIB)V", line = 616)
	static void method18035(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) Class312 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(5) Class322 local5 = (Class322) Class542.aClass32_Sub2_3.method18261(arg7);
		if (local5 != null && local5.anIntArray398 != null && local5.method27258(Class624.aClass120_1, Class624.aClass120_1)) {
			local5 = local5.method27252(Class624.aClass120_1, Class624.aClass120_1);
		}
		if (local5 == null || !local5.aBoolean710 || !local5.method27258(Class624.aClass120_1, Class624.aClass120_1)) {
			return;
		}
		@Pc(45) int local45;
		if (local5.anIntArray399 != null) {
			@Pc(43) int[] local43 = new int[local5.anIntArray399.length];
			@Pc(70) int local70;
			@Pc(95) int local95;
			@Pc(99) int local99;
			for (local45 = 0; local45 < local43.length / 2; local45++) {
				if (Class429.anInt4781 * -1453926679 == 3) {
					local70 = (int) ((double) Class65.aClass123_Sub1_2.method8962() * 2607.5945876176133D) + client.anInt3477 * -1357343303 & 0x3FFF;
				} else if (Class429.anInt4781 * -1453926679 == 4) {
					local70 = (int) client.aFloat253 & 0x3FFF;
				} else {
					local70 = (int) client.aFloat253 + client.anInt3477 * -1357343303 & 0x3FFF;
				}
				local95 = Class464.anIntArray451[local70];
				local99 = Class464.anIntArray452[local70];
				if (Class429.anInt4781 * -1453926679 != 4) {
					local95 = local95 * 256 / (client.anInt3478 * 663566609 + 256);
					local99 = local99 * 256 / (client.anInt3478 * 663566609 + 256);
				}
				local43[local45 * 2] = arg2.anInt3981 * 1215292027 / 2 + arg3 + (local95 * (arg6 + local5.anIntArray399[local45 * 2 + 1] * 4) + local99 * (local5.anIntArray399[local45 * 2] * 4 + arg5) >> 14);
				local43[local45 * 2 + 1] = arg4 + arg2.anInt3982 * -1490598249 / 2 - (local99 * (local5.anIntArray399[local45 * 2 + 1] * 4 + arg6) - (local5.anIntArray399[local45 * 2] * 4 + arg5) * local95 >> 14);
			}
			@Pc(219) Class327 local219 = arg2.method26878(arg0);
			if (local219 != null) {
				Class232.method25699(arg0, local43, local5.anInt4124 * 1475506287, local219.anIntArray406, local219.anIntArray407);
			}
			if (local5.anInt4125 * -204583541 > 0) {
				@Pc(269) int local269;
				@Pc(279) int local279;
				@Pc(284) int local284;
				for (local70 = 0; local70 < local43.length / 2 - 1; local70++) {
					local95 = local43[local70 * 2];
					local99 = local43[local70 * 2 + 1];
					local269 = local43[(local70 + 1) * 2];
					local279 = local43[(local70 + 1) * 2 + 1];
					if (local269 < local95) {
						local284 = local95;
						@Pc(286) int local286 = local99;
						local95 = local269;
						local99 = local279;
						local269 = local284;
						local279 = local286;
					} else if (local269 == local95 && local279 < local99) {
						local284 = local99;
						local99 = local279;
						local279 = local284;
					}
					if (arg1 == null) {
						arg0.method20486(local95, local99, local269, local279, local5.anIntArray400[local5.aByteArray80[local70] & 0xFF], 1, local5.anInt4125 * -204583541, local5.anInt4101 * 812190215, local5.anInt4127 * -404138527);
					} else {
						arg0.method20836(local95, local99, local269, local279, local5.anIntArray400[local5.aByteArray80[local70] & 0xFF], 1, arg1, arg3, arg4, local5.anInt4125 * -204583541, local5.anInt4101 * 812190215, local5.anInt4127 * -404138527);
					}
				}
				local70 = local43[local43.length - 2];
				local95 = local43[local43.length - 1];
				local99 = local43[0];
				local269 = local43[1];
				if (local99 < local70) {
					local279 = local70;
					local284 = local95;
					local70 = local99;
					local95 = local269;
					local99 = local279;
					local269 = local284;
				} else if (local99 == local70 && local269 < local95) {
					local279 = local95;
					local95 = local269;
					local269 = local279;
				}
				if (arg1 == null) {
					arg0.method20486(local70, local95, local99, local269, local5.anIntArray400[local5.aByteArray80[local5.aByteArray80.length - 1] & 0xFF], 1, local5.anInt4125 * -204583541, local5.anInt4101 * 812190215, local5.anInt4127 * -404138527);
				} else {
					arg0.method20836(local70, local95, local99, local269, local5.anIntArray400[local5.aByteArray80[local5.aByteArray80.length - 1] & 0xFF], 1, arg1, arg3, arg4, local5.anInt4125 * -204583541, local5.anInt4101 * 812190215, local5.anInt4127 * -404138527);
				}
			} else if (arg1 == null) {
				for (local70 = 0; local70 < local43.length / 2 - 1; local70++) {
					arg0.method20484(local43[local70 * 2], local43[local70 * 2 + 1], local43[(local70 + 1) * 2], local43[(local70 + 1) * 2 + 1], local5.anIntArray400[local5.aByteArray80[local70] & 0xFF], 1);
				}
				arg0.method20484(local43[local43.length - 2], local43[local43.length - 1], local43[0], local43[1], local5.anIntArray400[local5.aByteArray80[local5.aByteArray80.length - 1] & 0xFF], 1);
			} else {
				for (local70 = 0; local70 < local43.length / 2 - 1; local70++) {
					arg0.method20482(local43[local70 * 2], local43[local70 * 2 + 1], local43[(local70 + 1) * 2], local43[(local70 + 1) * 2 + 1], local5.anIntArray400[local5.aByteArray80[local70] & 0xFF], 1, arg1, arg3, arg4);
				}
				arg0.method20482(local43[local43.length - 2], local43[local43.length - 1], local43[0], local43[1], local5.anIntArray400[local5.aByteArray80[local5.aByteArray80.length - 1] & 0xFF], 1, arg1, arg3, arg4);
			}
		}
		@Pc(677) Class100 local677 = null;
		if (local5.anInt4126 * -498063801 != -1) {
			local677 = local5.method27253(arg0, false);
			if (local677 != null) {
				local45 = local5.anInt4130 * -971620039 > 0 ? local5.anInt4130 * -971620039 : Class93_Sub26.aClass645_15.anInt5769 * -409062297;
				Class323.method27276(arg2, arg1, arg3, arg4, arg5, arg6, local677, (double) local45, local5.aClass319_4, local5.aClass328_1);
			}
		}
		if (local5.aString174 == null) {
			return;
		}
		local45 = 0;
		if (local677 != null) {
			local45 = local677.method18165();
		}
		@Pc(736) Class106 local736 = Class707.aClass106_13;
		@Pc(738) Class5 local738 = Class584.aClass5_15;
		if (local5.anInt4116 * 1579741579 == 1) {
			local736 = Class82.aClass106_1;
			local738 = Class348.aClass5_14;
		}
		if (local5.anInt4116 * 1579741579 == 2) {
			local736 = Class118_Sub1.aClass106_3;
			local738 = Class110_Sub3.aClass5_7;
		}
		Class285.method26519(arg2, arg1, arg3, arg4, arg5, arg6, local45, local5.aString174, local736, local738, local5.anInt4099 * 2016508123);
	}

	@OriginalMember(owner = "client!ace", name = "ej", descriptor = "(II)Z", line = 1772)
	public static boolean method18034(@OriginalArg(0) int arg0) {
		return arg0 == 13 || arg0 == 6 || arg0 == 15 || arg0 == 16;
	}

	@OriginalMember(owner = "client!ace", name = "aw", descriptor = "(Lclient!yf;I)V", line = 4919)
	static final void method18039(@OriginalArg(0) Class681 arg0) throws Exception_Sub7 {
		@Pc(9) Class379 local9 = (Class379) arg0.aClass93_Sub1_Sub13_1.anObjectArray5[arg0.anInt5889 * -709694321];
		@Pc(33) Interface20 local33 = (Interface20) (arg0.anIntArray520[arg0.anInt5889 * -709694321] == 0 ? arg0.aMap26.get(local9.aClass108_1.aClass138_6) : arg0.aMap25.get(local9.aClass108_1.aClass138_6));
		try {
			local33.method33469(local9, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091]);
		} catch (@Pc(51) Exception_Sub7 local51) {
			if (!(local33 instanceof Class647)) {
				throw local51;
			}
			Class361.method27804(arg0, Class560.aClass560_5, local51, "VO");
		}
	}

	@OriginalMember(owner = "client!ace", name = "sl", descriptor = "(Lclient!yf;I)V", line = 8251)
	static final void method18033(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local11.anInt4035 * -220894753;
	}

	@OriginalMember(owner = "client!ace", name = "bfr", descriptor = "(Lclient!yf;B)V", line = 15115)
	static final void method18037(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class5 local18 = Class157.aClass462_2.method29241(client.anInterface50_1, local12);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.anInt7 * -2059082111;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.anInt6 * -8978697;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.anInt10 * -1093354073;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.anInt9 * 1796177149;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.anInt8 * 1717993965;
	}
}
