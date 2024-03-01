package com.jagex;

import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public class Class544 {

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V", line = 9)
	Class544() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "()V", line = 13)
	static void method32601() {
	}

	@OriginalMember(owner = "client!w", name = "l", descriptor = "()V", line = 13)
	static void method32603() {
	}

	@OriginalMember(owner = "client!w", name = "x", descriptor = "()I", line = 16)
	public static int method32600() {
		@Pc(3) Canvas local3 = new Canvas();
		local3.setSize(100, 100);
		@Pc(16) Class21 local16 = method32605(0, local3, null, null, null, 0);
		@Pc(19) long local19 = Class176.method23413();
		@Pc(21) int local21;
		for (local21 = 0; local21 < 10000; local21++) {
			local16.method17070(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		}
		local21 = (int) (Class176.method23413() - local19);
		local16.method17063(0, 0, 100, 100, -16777216);
		local16.method17020();
		return local21;
	}

	@OriginalMember(owner = "client!w", name = "h", descriptor = "()I", line = 16)
	public static int method32602() {
		@Pc(3) Canvas local3 = new Canvas();
		local3.setSize(100, 100);
		@Pc(16) Class21 local16 = method32605(0, local3, null, null, null, 0);
		@Pc(19) long local19 = Class176.method23413();
		@Pc(21) int local21;
		for (local21 = 0; local21 < 10000; local21++) {
			local16.method17070(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		}
		local21 = (int) (Class176.method23413() - local19);
		local16.method17063(0, 0, 100, 100, -16777216);
		local16.method17020();
		return local21;
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "(ILjava/lang/String;I)V", line = 29)
	public static void method32611(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Class121.method22823(arg0, 0, "", "", "", arg1);
	}

	@OriginalMember(owner = "client!w", name = "p", descriptor = "(ILjava/awt/Canvas;Lclient!ds;Lclient!di;Lclient!ny;II)Lclient!de;", line = 43)
	public static Class21 method32605(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Interface11 arg3, @OriginalArg(4) Class359 arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		if (arg1 != null) {
			@Pc(9) Dimension local9 = arg1.getSize();
			local1 = local9.width;
			local3 = local9.height;
		}
		return Class21.method17109(arg0, arg1, arg2, arg3, arg4, arg5, local1, local3);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Ljava/lang/String;I)V", line = 238)
	public static void method32604(@OriginalArg(0) String arg0) {
		Class67.aString61 = arg0;
		Class67.anInt1837 = Class67.aString61.length() * 1751742251;
	}

	@OriginalMember(owner = "client!w", name = "m", descriptor = "(Lclient!act;I)V", line = 571)
	static void method32609(@OriginalArg(0) Class26_Sub1_Sub1_Sub1 arg0) {
		if (arg0 instanceof Class26_Sub1_Sub1_Sub1_Sub1) {
			@Pc(5) Class26_Sub1_Sub1_Sub1_Sub1 local5 = (Class26_Sub1_Sub1_Sub1_Sub1) arg0;
			if (local5.aClass571_1 != null) {
				Class424.method27891(local5, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 != local5.aByte101);
			}
		} else if (arg0 instanceof Class26_Sub1_Sub1_Sub1_Sub2) {
			@Pc(26) Class26_Sub1_Sub1_Sub1_Sub2 local26 = (Class26_Sub1_Sub1_Sub1_Sub2) arg0;
			Class162.method23273(local26, local26.aByte101 != Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101);
		}
	}

	@OriginalMember(owner = "client!w", name = "hf", descriptor = "(Lclient!act;IIIB)V", line = 4072)
	static void method32610(@OriginalArg(0) Class26_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class445 local3 = arg0.method16690();
		@Pc(6) Class71_Sub1 local6 = arg0.aClass71_Sub1_3;
		@Pc(19) int local19 = arg0.anInt2381 * 856615359 - arg0.aClass106_7.anInt2990 * 1871843793 & 0x3FFF;
		if (Class538.aClass538_4.aByte171 == arg1) {
			if (local19 == 0 && arg0.anInt2379 * 2059956745 <= 25) {
				if (!local6.aBoolean351 || !local3.method28320(local6.method20103())) {
					local6.method20029(local3.method28322(), false, true);
					local6.aBoolean351 = local6.method20021();
				}
			} else if (arg3 < 0 && local3.anInt4970 * -1692585515 != -1) {
				local6.method20029(local3.anInt4970 * -1692585515, false, true);
				local6.aBoolean351 = false;
			} else if (arg3 > 0 && local3.anInt4971 * 879303971 != -1) {
				local6.method20029(local3.anInt4971 * 879303971, false, true);
				local6.aBoolean351 = false;
			} else if (!local6.aBoolean351 || !local3.method28320(local6.method20103())) {
				local6.method20029(local3.method28322(), false, true);
				local6.aBoolean351 = arg0.aClass71_Sub1_3.method20021();
			}
		} else if (arg0.anInt2364 * -867983489 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(146) int local146 = client.anIntArray299[arg2] - arg0.aClass106_7.anInt2990 * 1871843793 & 0x3FFF;
			if (Class538.aClass538_2.aByte171 == arg1 && -1713051549 * local3.anInt4992 != -1) {
				if (local146 > 2048 && local146 <= 6144 && -1610219699 * local3.anInt4979 != -1) {
					local6.method20029(local3.anInt4979 * -1610219699, false, true);
				} else if (local146 >= 10240 && local146 < 14336 && -1291917697 * local3.anInt4974 != -1) {
					local6.method20029(local3.anInt4974 * -1291917697, false, true);
				} else if (local146 <= 6144 || local146 >= 10240 || local3.anInt4997 * 1647125495 == -1) {
					local6.method20029(local3.anInt4992 * -1713051549, false, true);
				} else {
					local6.method20029(local3.anInt4997 * 1647125495, false, true);
				}
			} else if (arg1 == Class538.aClass538_1.aByte171 && local3.anInt4967 * 1572273339 != -1) {
				if (local146 > 2048 && local146 <= 6144 && local3.anInt4983 * 1145375145 != -1) {
					local6.method20029(local3.anInt4983 * 1145375145, false, true);
				} else if (local146 >= 10240 && local146 < 14336 && -1520360879 * local3.anInt4982 != -1) {
					local6.method20029(local3.anInt4982 * -1520360879, false, true);
				} else if (local146 <= 6144 || local146 >= 10240 || local3.anInt4987 * -1259453855 == -1) {
					local6.method20029(local3.anInt4967 * 1572273339, false, true);
				} else {
					local6.method20029(local3.anInt4987 * -1259453855, false, true);
				}
			} else if (local146 > 2048 && local146 <= 6144 && local3.anInt4975 * -87408697 != -1) {
				local6.method20029(local3.anInt4975 * -87408697, false, true);
			} else if (local146 >= 10240 && local146 < 14336 && local3.anInt4981 * -1817130289 != -1) {
				local6.method20029(local3.anInt4981 * -1817130289, false, true);
			} else if (local146 <= 6144 || local146 >= 10240 || local3.anInt4977 * 761222317 == -1) {
				local6.method20029(local3.anInt4972 * -1291874843, false, true);
			} else {
				local6.method20029(local3.anInt4977 * 761222317, false, true);
			}
			local6.aBoolean351 = false;
		} else if (local19 == 0 && arg0.anInt2379 * 2059956745 <= 25) {
			if (arg1 == Class538.aClass538_2.aByte171 && -1713051549 * local3.anInt4992 != -1) {
				local6.method20029(local3.anInt4992 * -1713051549, false, true);
			} else if (Class538.aClass538_1.aByte171 == arg1 && local3.anInt4967 * 1572273339 != -1) {
				local6.method20029(local3.anInt4967 * 1572273339, false, true);
			} else {
				local6.method20029(local3.anInt4972 * -1291874843, false, true);
			}
			local6.aBoolean351 = false;
		} else {
			if (Class538.aClass538_2.aByte171 == arg1 && local3.anInt4992 * -1713051549 != -1) {
				if (arg3 < 0 && -501231019 * local3.anInt4986 != -1) {
					local6.method20029(local3.anInt4986 * -501231019, false, true);
				} else if (arg3 <= 0 || -1882238427 * local3.anInt4984 == -1) {
					local6.method20029(local3.anInt4992 * -1713051549, false, true);
				} else {
					local6.method20029(local3.anInt4984 * -1882238427, false, true);
				}
			} else if (Class538.aClass538_1.aByte171 == arg1 && local3.anInt4967 * 1572273339 != -1) {
				if (arg3 < 0 && local3.anInt4999 * 1035039707 != -1) {
					local6.method20029(local3.anInt4999 * 1035039707, false, true);
				} else if (arg3 <= 0 || local3.anInt4985 * -1796673701 == -1) {
					local6.method20029(local3.anInt4967 * 1572273339, false, true);
				} else {
					local6.method20029(local3.anInt4985 * -1796673701, false, true);
				}
			} else if (arg3 < 0 && -1287002171 * local3.anInt4976 != -1) {
				local6.method20029(local3.anInt4976 * -1287002171, false, true);
			} else if (arg3 <= 0 || local3.anInt4989 * -1874522319 == -1) {
				local6.method20029(local3.anInt4972 * -1291874843, false, true);
			} else {
				local6.method20029(local3.anInt4989 * -1874522319, false, true);
			}
			local6.aBoolean351 = false;
		}
	}

	@OriginalMember(owner = "client!w", name = "wm", descriptor = "(Lclient!vs;I)V", line = 8043)
	static final void method32606(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class250.anInt3811 * -1176041819;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class250.anInt3812 * 1575832235;
	}

	@OriginalMember(owner = "client!w", name = "agw", descriptor = "(Lclient!vs;B)V", line = 10073)
	static final void method32607(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(15) Class3_Sub1_Sub4 local15 = Class557.method32815();
		if (local15 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
			return;
		}
		@Pc(35) boolean local35 = local15.method18896(local12 >> 28 & 0x3, local12 >> 14 & 0x3FFF, local12 & 0x3FFF, Class525.anIntArray492);
		if (local35) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class525.anIntArray492[1];
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class525.anIntArray492[2];
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
		}
	}

	@OriginalMember(owner = "client!w", name = "ahm", descriptor = "(Lclient!vs;I)V", line = 10313)
	static final void method32608(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (local12 >= 1 && local12 <= 2) {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub11_1, local12);
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub11_2, local12);
			Class26_Sub1_Sub1_Sub1.method16728();
		}
	}
}
