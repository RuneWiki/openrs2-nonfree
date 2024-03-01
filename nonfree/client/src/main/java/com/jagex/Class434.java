package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public class Class434 {

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V", line = 8)
	Class434() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "(FLclient!mh;Lclient!mx;Lclient!mh;Lclient!mh;Lclient!mh;FFF)V", line = 13)
	public static void method27983(@OriginalArg(0) float arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(3) Class320 arg3, @OriginalArg(4) Class320 arg4, @OriginalArg(5) Class320 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		if (arg3.method25869(arg1)) {
			return;
		}
		@Pc(9) Class320 local9 = Class320.method25891(0.0F, 0.0F, 0.0F);
		@Pc(14) Class320 local14 = Class320.method25906(Class320.method25928(arg3, arg1));
		local14.method25889(arg2);
		@Pc(21) Class320 local21 = Class320.method25928(local14, local9);
		@Pc(24) float local24 = local21.method25861();
		if (arg5.aFloat259 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat259) || local24 > arg7 || local24 < arg8) {
			arg1.method25893(arg3);
			arg4.method25868();
			return;
		}
		arg2.method26351();
		@Pc(54) Class320 local54 = Class320.method25891(1.0F, 0.0F, 0.0F);
		@Pc(59) Class320 local59 = Class320.method25891(0.0F, 1.0F, 0.0F);
		@Pc(64) Class320 local64 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local54.method25889(arg2);
		local59.method25889(arg2);
		local64.method25889(arg2);
		@Pc(84) Class320 local84 = Class320.method25891(Class320.method25962(local54, arg4), Class320.method25962(local59, arg4), Class320.method25962(local64, arg4));
		@Pc(87) Class320 local87 = Class320.method25906(local84);
		@Pc(104) Class320 local104 = Class320.method25891(local21.aFloat259 * arg5.aFloat259, local21.aFloat260 * arg5.aFloat260, local21.aFloat261 * arg5.aFloat261);
		local87.method25875(local104, arg0);
		local87.method25887(arg6);
		@Pc(116) Class320 local116 = Class320.method25888(local54, local87.aFloat259);
		local116.method25875(local59, local87.aFloat260);
		local116.method25875(local64, local87.aFloat261);
		arg4.method25893(local116);
		arg1.method25872(Class320.method25888(arg4, arg0));
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(FLclient!mh;Lclient!mx;Lclient!mh;Lclient!mh;Lclient!mh;FFF)V", line = 13)
	public static void method27984(@OriginalArg(0) float arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(3) Class320 arg3, @OriginalArg(4) Class320 arg4, @OriginalArg(5) Class320 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		if (arg3.method25869(arg1)) {
			return;
		}
		@Pc(9) Class320 local9 = Class320.method25891(0.0F, 0.0F, 0.0F);
		@Pc(14) Class320 local14 = Class320.method25906(Class320.method25928(arg3, arg1));
		local14.method25889(arg2);
		@Pc(21) Class320 local21 = Class320.method25928(local14, local9);
		@Pc(24) float local24 = local21.method25861();
		if (arg5.aFloat259 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat259) || local24 > arg7 || local24 < arg8) {
			arg1.method25893(arg3);
			arg4.method25868();
			return;
		}
		arg2.method26351();
		@Pc(54) Class320 local54 = Class320.method25891(1.0F, 0.0F, 0.0F);
		@Pc(59) Class320 local59 = Class320.method25891(0.0F, 1.0F, 0.0F);
		@Pc(64) Class320 local64 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local54.method25889(arg2);
		local59.method25889(arg2);
		local64.method25889(arg2);
		@Pc(84) Class320 local84 = Class320.method25891(Class320.method25962(local54, arg4), Class320.method25962(local59, arg4), Class320.method25962(local64, arg4));
		@Pc(87) Class320 local87 = Class320.method25906(local84);
		@Pc(104) Class320 local104 = Class320.method25891(local21.aFloat259 * arg5.aFloat259, local21.aFloat260 * arg5.aFloat260, local21.aFloat261 * arg5.aFloat261);
		local87.method25875(local104, arg0);
		local87.method25887(arg6);
		@Pc(116) Class320 local116 = Class320.method25888(local54, local87.aFloat259);
		local116.method25875(local59, local87.aFloat260);
		local116.method25875(local64, local87.aFloat261);
		arg4.method25893(local116);
		arg1.method25872(Class320.method25888(arg4, arg0));
	}

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "(FLclient!mh;Lclient!mx;Lclient!mh;Lclient!mh;Lclient!mh;FFF)V", line = 13)
	public static void method27985(@OriginalArg(0) float arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(3) Class320 arg3, @OriginalArg(4) Class320 arg4, @OriginalArg(5) Class320 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		if (arg3.method25869(arg1)) {
			return;
		}
		@Pc(9) Class320 local9 = Class320.method25891(0.0F, 0.0F, 0.0F);
		@Pc(14) Class320 local14 = Class320.method25906(Class320.method25928(arg3, arg1));
		local14.method25889(arg2);
		@Pc(21) Class320 local21 = Class320.method25928(local14, local9);
		@Pc(24) float local24 = local21.method25861();
		if (arg5.aFloat259 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat259) || local24 > arg7 || local24 < arg8) {
			arg1.method25893(arg3);
			arg4.method25868();
			return;
		}
		arg2.method26351();
		@Pc(54) Class320 local54 = Class320.method25891(1.0F, 0.0F, 0.0F);
		@Pc(59) Class320 local59 = Class320.method25891(0.0F, 1.0F, 0.0F);
		@Pc(64) Class320 local64 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local54.method25889(arg2);
		local59.method25889(arg2);
		local64.method25889(arg2);
		@Pc(84) Class320 local84 = Class320.method25891(Class320.method25962(local54, arg4), Class320.method25962(local59, arg4), Class320.method25962(local64, arg4));
		@Pc(87) Class320 local87 = Class320.method25906(local84);
		@Pc(104) Class320 local104 = Class320.method25891(local21.aFloat259 * arg5.aFloat259, local21.aFloat260 * arg5.aFloat260, local21.aFloat261 * arg5.aFloat261);
		local87.method25875(local104, arg0);
		local87.method25887(arg6);
		@Pc(116) Class320 local116 = Class320.method25888(local54, local87.aFloat259);
		local116.method25875(local59, local87.aFloat260);
		local116.method25875(local64, local87.aFloat261);
		arg4.method25893(local116);
		arg1.method25872(Class320.method25888(arg4, arg0));
	}

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "(FLclient!mh;Lclient!mx;Lclient!mh;Lclient!mh;Lclient!mh;FFF)V", line = 13)
	public static void method27986(@OriginalArg(0) float arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(3) Class320 arg3, @OriginalArg(4) Class320 arg4, @OriginalArg(5) Class320 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		if (arg3.method25869(arg1)) {
			return;
		}
		@Pc(9) Class320 local9 = Class320.method25891(0.0F, 0.0F, 0.0F);
		@Pc(14) Class320 local14 = Class320.method25906(Class320.method25928(arg3, arg1));
		local14.method25889(arg2);
		@Pc(21) Class320 local21 = Class320.method25928(local14, local9);
		@Pc(24) float local24 = local21.method25861();
		if (arg5.aFloat259 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat259) || local24 > arg7 || local24 < arg8) {
			arg1.method25893(arg3);
			arg4.method25868();
			return;
		}
		arg2.method26351();
		@Pc(54) Class320 local54 = Class320.method25891(1.0F, 0.0F, 0.0F);
		@Pc(59) Class320 local59 = Class320.method25891(0.0F, 1.0F, 0.0F);
		@Pc(64) Class320 local64 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local54.method25889(arg2);
		local59.method25889(arg2);
		local64.method25889(arg2);
		@Pc(84) Class320 local84 = Class320.method25891(Class320.method25962(local54, arg4), Class320.method25962(local59, arg4), Class320.method25962(local64, arg4));
		@Pc(87) Class320 local87 = Class320.method25906(local84);
		@Pc(104) Class320 local104 = Class320.method25891(local21.aFloat259 * arg5.aFloat259, local21.aFloat260 * arg5.aFloat260, local21.aFloat261 * arg5.aFloat261);
		local87.method25875(local104, arg0);
		local87.method25887(arg6);
		@Pc(116) Class320 local116 = Class320.method25888(local54, local87.aFloat259);
		local116.method25875(local59, local87.aFloat260);
		local116.method25875(local64, local87.aFloat261);
		arg4.method25893(local116);
		arg1.method25872(Class320.method25888(arg4, arg0));
	}

	@OriginalMember(owner = "client!rl", name = "x", descriptor = "(FLclient!mh;Lclient!mx;Lclient!mh;Lclient!mh;Lclient!mh;FFF)V", line = 13)
	public static void method27987(@OriginalArg(0) float arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(3) Class320 arg3, @OriginalArg(4) Class320 arg4, @OriginalArg(5) Class320 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		if (arg3.method25869(arg1)) {
			return;
		}
		@Pc(9) Class320 local9 = Class320.method25891(0.0F, 0.0F, 0.0F);
		@Pc(14) Class320 local14 = Class320.method25906(Class320.method25928(arg3, arg1));
		local14.method25889(arg2);
		@Pc(21) Class320 local21 = Class320.method25928(local14, local9);
		@Pc(24) float local24 = local21.method25861();
		if (arg5.aFloat259 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat259) || local24 > arg7 || local24 < arg8) {
			arg1.method25893(arg3);
			arg4.method25868();
			return;
		}
		arg2.method26351();
		@Pc(54) Class320 local54 = Class320.method25891(1.0F, 0.0F, 0.0F);
		@Pc(59) Class320 local59 = Class320.method25891(0.0F, 1.0F, 0.0F);
		@Pc(64) Class320 local64 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local54.method25889(arg2);
		local59.method25889(arg2);
		local64.method25889(arg2);
		@Pc(84) Class320 local84 = Class320.method25891(Class320.method25962(local54, arg4), Class320.method25962(local59, arg4), Class320.method25962(local64, arg4));
		@Pc(87) Class320 local87 = Class320.method25906(local84);
		@Pc(104) Class320 local104 = Class320.method25891(local21.aFloat259 * arg5.aFloat259, local21.aFloat260 * arg5.aFloat260, local21.aFloat261 * arg5.aFloat261);
		local87.method25875(local104, arg0);
		local87.method25887(arg6);
		@Pc(116) Class320 local116 = Class320.method25888(local54, local87.aFloat259);
		local116.method25875(local59, local87.aFloat260);
		local116.method25875(local64, local87.aFloat261);
		arg4.method25893(local116);
		arg1.method25872(Class320.method25888(arg4, arg0));
	}

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "(I)[Lclient!sb;", line = 14)
	static Class449[] method27990() {
		return new Class449[] { Class449.aClass449_1, Class449.aClass449_3, Class449.aClass449_2 };
	}

	@OriginalMember(owner = "client!rl", name = "hu", descriptor = "(IIIIZI)V", line = 4469)
	public static final void method27991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(13) int local13 = arg3 - 334;
		if (local13 < 0) {
			local13 = 0;
		} else if (local13 > 100) {
			local13 = 100;
		}
		@Pc(33) int local33 = local13 * (client.aShort147 - client.aShort150) / 100 + client.aShort150;
		@Pc(43) int local43 = arg3 * local33 * 512 / (arg2 * 334);
		@Pc(73) int local73;
		@Pc(79) int local79;
		@Pc(48) short local48;
		if (local43 < client.aShort154) {
			local48 = client.aShort154;
			local33 = arg2 * local48 * 334 / (arg3 * 512);
			if (local33 > client.aShort153) {
				local33 = client.aShort153;
				local73 = arg3 * local33 * 512 / (local48 * 334);
				local79 = (arg2 - local73) / 2;
				if (arg4) {
					Class613.aClass21_13.method17056();
					Class613.aClass21_13.method17063(arg0, arg1, local79, arg3, -16777216);
					Class613.aClass21_13.method17063(arg2 + arg0 - local79, arg1, local79, arg3, -16777216);
				}
				arg0 += local79;
				arg2 -= local79 * 2;
			}
		} else if (local43 > client.aShort148) {
			local48 = client.aShort148;
			local33 = local48 * 334 * arg2 / (arg3 * 512);
			if (local33 < client.aShort152) {
				local33 = client.aShort152;
				local73 = local48 * arg2 * 334 / (local33 * 512);
				local79 = (arg3 - local73) / 2;
				if (arg4) {
					Class613.aClass21_13.method17056();
					Class613.aClass21_13.method17063(arg0, arg1, arg2, local79, -16777216);
					Class613.aClass21_13.method17063(arg0, arg3 + arg1 - local79, arg2, local79, -16777216);
				}
				arg1 += local79;
				arg3 -= local79 * 2;
			}
		}
		client.anInt3171 = arg3 * local33 / 334 * 1925140967;
		client.anInt3167 = arg0 * -616792301;
		client.anInt3168 = arg1 * -225625965;
		client.anInt3169 = (short) arg2 * 850523049;
		client.anInt3047 = (short) arg3 * -1271552341;
	}

	@OriginalMember(owner = "client!rl", name = "cr", descriptor = "(Lclient!vs;I)V", line = 4544)
	static final void method27988(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class515.method29642(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!rl", name = "pz", descriptor = "(Lclient!vs;I)V", line = 6842)
	static final void method27989(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3498 * -1494060731;
	}
}
