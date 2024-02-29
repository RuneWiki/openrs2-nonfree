package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public class Class212 {

	@OriginalMember(owner = "client!dt", name = "p", descriptor = "Lclient!dt;")
	public static final Class212 aClass212_24 = new Class212(4, 3);

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "Lclient!dt;")
	public static final Class212 aClass212_18 = new Class212(0, 4);

	@OriginalMember(owner = "client!dt", name = "v", descriptor = "Lclient!dt;")
	public static final Class212 aClass212_17 = new Class212(8, 1);

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "Lclient!dt;")
	public static final Class212 aClass212_19 = new Class212(6, 1);

	@OriginalMember(owner = "client!dt", name = "y", descriptor = "Lclient!dt;")
	public static final Class212 aClass212_26 = new Class212(1, 2);

	@OriginalMember(owner = "client!dt", name = "w", descriptor = "Lclient!dt;")
	public static final Class212 aClass212_21 = new Class212(3, 1);

	@OriginalMember(owner = "client!dt", name = "t", descriptor = "Lclient!dt;")
	static final Class212 aClass212_22 = new Class212(5, 3);

	@OriginalMember(owner = "client!dt", name = "q", descriptor = "Lclient!dt;")
	static final Class212 aClass212_20 = new Class212(9, 4);

	@OriginalMember(owner = "client!dt", name = "x", descriptor = "Lclient!dt;")
	public static final Class212 aClass212_23 = new Class212(7, 1);

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "Lclient!dt;")
	public static final Class212 aClass212_25 = new Class212(2, 1);

	@OriginalMember(owner = "client!dt", name = "s", descriptor = "I")
	public final int anInt3678;

	@OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
	public final int anInt3679;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(II)V", line = 18)
	Class212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3678 = arg0 * 647220571;
		this.anInt3679 = arg1 * -1101597561;
	}

	@OriginalMember(owner = "client!dt", name = "t", descriptor = "(IB)Z", line = 56)
	public static boolean method25609(@OriginalArg(0) int arg0) {
		return arg0 >= Class593.aClass593_12.anInt5501 * 847393323 && arg0 <= Class593.aClass593_17.anInt5501 * 847393323;
	}

	@OriginalMember(owner = "client!dt", name = "u", descriptor = "(Lclient!dx;Lclient!cd;Lclient!gm;IIIIIB)V", line = 616)
	static void method25610(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) Class277 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(5) Class302 local5 = (Class302) Class251.aClass35_Sub10_3.method18319(arg7);
		if (local5 != null && local5.anIntArray420 != null && local5.method27136(Class55.aClass124_1, Class55.aClass124_1)) {
			local5 = local5.method27153(Class55.aClass124_1, Class55.aClass124_1);
		}
		if (local5 == null || !local5.aBoolean694 || !local5.method27136(Class55.aClass124_1, Class55.aClass124_1)) {
			return;
		}
		@Pc(46) int local46;
		if (local5.anIntArray422 != null) {
			@Pc(44) int[] local44 = new int[local5.anIntArray422.length];
			@Pc(71) int local71;
			@Pc(96) int local96;
			@Pc(100) int local100;
			for (local46 = 0; local46 < local44.length / 2; local46++) {
				if (Class11.anInt36 * -891094135 == 3) {
					local71 = (int) ((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) + client.anInt3462 * -2045337339 & 0x3FFF;
				} else if (Class11.anInt36 * -891094135 == 5) {
					local71 = (int) client.aFloat247 & 0x3FFF;
				} else {
					local71 = (int) client.aFloat247 + client.anInt3462 * -2045337339 & 0x3FFF;
				}
				local96 = Class436.anIntArray464[local71];
				local100 = Class436.anIntArray463[local71];
				if (Class11.anInt36 * -891094135 != 5) {
					local96 = local96 * 256 / (client.anInt3380 * -2002513841 + 256);
					local100 = local100 * 256 / (client.anInt3380 * -2002513841 + 256);
				}
				local44[local46 * 2] = arg3 + arg2.anInt3874 * -881188269 / 2 + (local100 * (arg5 + local5.anIntArray422[local46 * 2] * 4) + (local5.anIntArray422[local46 * 2 + 1] * 4 + arg6) * local96 >> 14);
				local44[local46 * 2 + 1] = arg2.anInt3875 * -1279656873 / 2 + arg4 - ((arg6 + local5.anIntArray422[local46 * 2 + 1] * 4) * local100 - (arg5 + local5.anIntArray422[local46 * 2] * 4) * local96 >> 14);
			}
			@Pc(220) Class276 local220 = arg2.method26633(arg0);
			if (local220 != null) {
				Class213.method25615(arg0, local44, local5.anInt4040 * 1393455813, local220.anIntArray393, local220.anIntArray392);
			}
			if (local5.anInt4050 * 685328963 > 0) {
				@Pc(271) int local271;
				@Pc(281) int local281;
				@Pc(286) int local286;
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					local96 = local44[local71 * 2];
					local100 = local44[local71 * 2 + 1];
					local271 = local44[(local71 + 1) * 2];
					local281 = local44[(local71 + 1) * 2 + 1];
					if (local271 < local96) {
						local286 = local96;
						@Pc(288) int local288 = local100;
						local96 = local271;
						local100 = local281;
						local271 = local286;
						local281 = local288;
					} else if (local96 == local271 && local281 < local100) {
						local286 = local100;
						local100 = local281;
						local281 = local286;
					}
					if (arg1 == null) {
						arg0.method20094(local96, local100, local271, local281, local5.anIntArray421[local5.aByteArray74[local71] & 0xFF], 1, local5.anInt4050 * 685328963, local5.anInt4042 * 1781521033, local5.anInt4043 * 290033855);
					} else {
						arg0.method20095(local96, local100, local271, local281, local5.anIntArray421[local5.aByteArray74[local71] & 0xFF], 1, arg1, arg3, arg4, local5.anInt4050 * 685328963, local5.anInt4042 * 1781521033, local5.anInt4043 * 290033855);
					}
				}
				local71 = local44[local44.length - 2];
				local96 = local44[local44.length - 1];
				local100 = local44[0];
				local271 = local44[1];
				if (local100 < local71) {
					local281 = local71;
					local286 = local96;
					local71 = local100;
					local96 = local271;
					local100 = local281;
					local271 = local286;
				} else if (local71 == local100 && local271 < local96) {
					local281 = local96;
					local96 = local271;
					local271 = local281;
				}
				if (arg1 == null) {
					arg0.method20094(local71, local96, local100, local271, local5.anIntArray421[local5.aByteArray74[local5.aByteArray74.length - 1] & 0xFF], 1, local5.anInt4050 * 685328963, local5.anInt4042 * 1781521033, local5.anInt4043 * 290033855);
				} else {
					arg0.method20095(local71, local96, local100, local271, local5.anIntArray421[local5.aByteArray74[local5.aByteArray74.length - 1] & 0xFF], 1, arg1, arg3, arg4, local5.anInt4050 * 685328963, local5.anInt4042 * 1781521033, local5.anInt4043 * 290033855);
				}
			} else if (arg1 == null) {
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					arg0.method20092(local44[local71 * 2], local44[local71 * 2 + 1], local44[(local71 + 1) * 2], local44[(local71 + 1) * 2 + 1], local5.anIntArray421[local5.aByteArray74[local71] & 0xFF], 1);
				}
				arg0.method20092(local44[local44.length - 2], local44[local44.length - 1], local44[0], local44[1], local5.anIntArray421[local5.aByteArray74[local5.aByteArray74.length - 1] & 0xFF], 1);
			} else {
				for (local71 = 0; local71 < local44.length / 2 - 1; local71++) {
					arg0.method20160(local44[local71 * 2], local44[local71 * 2 + 1], local44[(local71 + 1) * 2], local44[(local71 + 1) * 2 + 1], local5.anIntArray421[local5.aByteArray74[local71] & 0xFF], 1, arg1, arg3, arg4);
				}
				arg0.method20160(local44[local44.length - 2], local44[local44.length - 1], local44[0], local44[1], local5.anIntArray421[local5.aByteArray74[local5.aByteArray74.length - 1] & 0xFF], 1, arg1, arg3, arg4);
			}
		}
		@Pc(679) Class83 local679 = null;
		if (local5.anInt4019 * 1747122653 != -1) {
			local679 = local5.method27137(arg0, false);
			if (local679 != null) {
				local46 = local5.anInt4047 * 1484992485 > 0 ? local5.anInt4047 * 1484992485 : Class617.aClass629_1.anInt5696 * 1515024757;
				Class29.method500(arg2, arg1, arg3, arg4, arg5, arg6, local679, (double) local46, local5.aClass311_1, local5.aClass309_1);
			}
		}
		if (local5.aString189 == null) {
			return;
		}
		local46 = 0;
		if (local679 != null) {
			local46 = local679.method18171();
		}
		@Pc(737) Class94 local737 = Class248.aClass94_7;
		@Pc(739) Class17 local739 = Class143_Sub8.aClass17_8;
		if (local5.anInt4031 * 638004337 == 1) {
			local737 = Class128_Sub1.aClass94_5;
			local739 = Class611.aClass17_13;
		}
		if (local5.anInt4031 * 638004337 == 2) {
			local737 = Class260.aClass94_8;
			local739 = Class346.aClass17_12;
		}
		Class575.method31600(arg2, arg1, arg3, arg4, arg5, arg6, local46, local5.aString189, local737, local739, local5.anInt4021 * -1512587879);
	}

	@OriginalMember(owner = "client!dt", name = "gu", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 5645)
	static final void method25611(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.aBoolean673 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] == 1;
		Class461.method29531(arg0);
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class145.method15078(arg0.anInt3863 * -1278450723);
		}
	}

	@OriginalMember(owner = "client!dt", name = "pq", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;S)V", line = 7356)
	static final void method25612(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray38 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!dt", name = "alg", descriptor = "(Lclient!yf;I)V", line = 11574)
	static final void method25613(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(46) float local46 = (float) (Math.atan((double) ((float) local13 / 2.0F / (float) local33)) * 2.0D);
		@Pc(59) float local59 = (float) (Math.atan((double) ((float) local23 / 2.0F / (float) local33)) * 2.0D);
		Class597.aClass107_Sub1_2.method8842(local46, local59);
	}
}
