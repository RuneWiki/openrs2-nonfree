package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeb")
public class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!aeb", name = "b", descriptor = "I")
	public final int anInt910;

	@OriginalMember(owner = "client!aeb", name = "c", descriptor = "I")
	public final int anInt909;

	@OriginalMember(owner = "client!aeb", name = "<init>", descriptor = "(Lclient!kh;Lclient!kg;IIIIIIIIII)V", line = 10)
	Class44_Sub1(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt910 = arg10 * 1930818173;
		this.anInt909 = arg11 * 1455432963;
	}

	@OriginalMember(owner = "client!aeb", name = "x", descriptor = "(Lclient!ahb;)Lclient!kv;", line = 16)
	public static Class44 method8401(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) Class44 local3 = Class269.method25286(arg0);
		@Pc(7) int local7 = arg0.method20275();
		@Pc(11) int local11 = arg0.method20275();
		@Pc(15) int local15 = arg0.method20375();
		return new Class44_Sub1(local3.aClass277_8, local3.aClass276_7, local3.anInt2200 * 55371565, local3.anInt2195 * 2009354057, local3.anInt2198 * 338285097, local3.anInt2199 * -1628722519, local3.anInt2196 * -1540009787, local3.anInt2197 * 1924731995, local3.anInt2201 * 328557495, local7, local11, local15);
	}

	@OriginalMember(owner = "client!aeb", name = "g", descriptor = "()Lclient!ke;", line = 24)
	@Override
	public Class274 method25539() {
		return Class274.aClass274_2;
	}

	@OriginalMember(owner = "client!aeb", name = "a", descriptor = "(I)Lclient!ke;", line = 24)
	@Override
	public Class274 method25540() {
		return Class274.aClass274_2;
	}

	@OriginalMember(owner = "client!aeb", name = "h", descriptor = "(IIZZI)I", line = 61)
	public static int method8404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg3);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < local4.anIntArray178.length; local13++) {
			if (local4.anIntArray178[local13] >= 0 && local4.anIntArray178[local13] < Class44_Sub3.aClass596_1.anInt5517 * 386588925) {
				@Pc(40) Class594 local40 = Class44_Sub3.aClass596_1.method33435(local4.anIntArray178[local13]);
				@Pc(52) int local52 = local40.method33375(arg1, Class3_Sub20.aClass625_1.method33783(arg1).anInt5585 * 100041865);
				if (arg2) {
					local11 += local4.anIntArray179[local13] * local52;
				} else {
					local11 += local52;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aeb", name = "x", descriptor = "(Lclient!afk;ZI)V", line = 139)
	static final void method8405(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean256) {
			if (arg0.anInt1185 * 146675445 < 0 || Class614.method33655(client.aClass370_1.method26954(), arg0.anInt1185 * 146675445, arg0.anInt1190 * -816239815)) {
				if (arg1) {
					Class395.method27504(arg0.anInt1191 * -53574091, arg0.anInt1183 * 1349018393, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847, null);
				} else {
					Class85.method21639(arg0.anInt1191 * -53574091, arg0.anInt1183 * 1349018393, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847, arg0.anInt1185 * 146675445, arg0.anInt1186 * 2045202339, arg0.anInt1190 * -816239815, -1, 0);
				}
				arg0.method33656();
			}
		} else if (arg0.aBoolean255 && arg0.anInt1187 * -1303695121 >= 1 && arg0.anInt1184 * -2103701847 >= 1 && arg0.anInt1187 * -1303695121 <= client.aClass370_1.method26943() - 2 && arg0.anInt1184 * -2103701847 <= client.aClass370_1.method27062() - 2 && (arg0.anInt1182 * -1534639185 < 0 || Class614.method33655(client.aClass370_1.method26954(), arg0.anInt1182 * -1534639185, arg0.anInt1189 * 1076554197))) {
			if (arg1) {
				Class395.method27504(arg0.anInt1191 * -53574091, arg0.anInt1183 * 1349018393, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847, arg0.aClass462_1);
			} else {
				Class85.method21639(arg0.anInt1191 * -53574091, arg0.anInt1183 * 1349018393, arg0.anInt1187 * -1303695121, arg0.anInt1184 * -2103701847, arg0.anInt1182 * -1534639185, arg0.anInt1188 * 2046717403, arg0.anInt1189 * 1076554197, -1, 0);
			}
			arg0.aBoolean255 = false;
			if (!arg1 && arg0.anInt1182 * -1534639185 == arg0.anInt1185 * 146675445 && arg0.anInt1185 * 146675445 == -1) {
				arg0.method33656();
			} else if (!arg1 && arg0.anInt1182 * -1534639185 == arg0.anInt1185 * 146675445 && arg0.anInt1188 * 2046717403 == arg0.anInt1186 * 2045202339 && arg0.anInt1189 * 1076554197 == arg0.anInt1190 * -816239815) {
				arg0.method33656();
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "av", descriptor = "(IB)V", line = 168)
	public static void method8408(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(16, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!aeb", name = "dp", descriptor = "(Lclient!se;B)Z", line = 354)
	static boolean method8406(@OriginalArg(0) Class452 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean775) {
			return false;
		} else if (!arg0.method28402(Class58_Sub1.anInterface9_2, Class58_Sub1.anInterface8_2)) {
			return false;
		} else if (Class58_Sub1.aClass581_14.method33217((long) (arg0.anInt5025 * -1073021415)) != null) {
			return false;
		} else if (Class58_Sub1.aClass581_15.method33217((long) (arg0.anInt5054 * -589352987)) == null) {
			if (arg0.aString224 != null) {
				if (arg0.anInt5041 * 404639277 == 0 && Class58_Sub1.aBoolean320) {
					return false;
				}
				if (arg0.anInt5041 * 404639277 == 1 && Class58_Sub1.aBoolean321) {
					return false;
				}
				if (arg0.anInt5041 * 404639277 == 2 && Class58_Sub1.aBoolean322) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "iy", descriptor = "(Lclient!vs;I)V", line = 5627)
	static final void method8402(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class60_Sub29.method13925(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!aeb", name = "wv", descriptor = "(Lclient!vs;I)V", line = 8031)
	static final void method8403(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class3_Sub10.aClass61_1.method12741();
	}

	@OriginalMember(owner = "client!aeb", name = "agv", descriptor = "(Lclient!vs;I)V", line = 10124)
	static final void method8407(@OriginalArg(0) Class536 arg0) {
		Class58_Sub1.aBoolean319 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1;
	}
}
