package com.jagex;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!if")
public class Class320 {

	@OriginalMember(owner = "client!if", name = "p", descriptor = "Lclient!if;")
	static final Class320 aClass320_1 = new Class320(0, 4);

	@OriginalMember(owner = "client!if", name = "c", descriptor = "Lclient!if;")
	static final Class320 aClass320_3 = new Class320(1, 5);

	@OriginalMember(owner = "client!if", name = "v", descriptor = "Lclient!if;")
	static final Class320 aClass320_2 = new Class320(2, 6);

	@OriginalMember(owner = "client!if", name = "l", descriptor = "I")
	final int anInt4075;

	@OriginalMember(owner = "client!if", name = "y", descriptor = "I")
	public final int anInt4074;

	@OriginalMember(owner = "client!if", name = "l", descriptor = "()[Lclient!if;", line = 12)
	static Class320[] method27447() {
		return new Class320[] { aClass320_2, aClass320_3, aClass320_1 };
	}

	@OriginalMember(owner = "client!if", name = "v", descriptor = "()[Lclient!if;", line = 12)
	static Class320[] method27448() {
		return new Class320[] { aClass320_2, aClass320_3, aClass320_1 };
	}

	@OriginalMember(owner = "client!if", name = "y", descriptor = "()[Lclient!if;", line = 12)
	static Class320[] method27449() {
		return new Class320[] { aClass320_2, aClass320_3, aClass320_1 };
	}

	@OriginalMember(owner = "client!if", name = "<init>", descriptor = "(II)V", line = 15)
	Class320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4075 = arg0 * 1329738309;
		this.anInt4074 = arg1 * -1753174611;
	}

	@OriginalMember(owner = "client!if", name = "w", descriptor = "(I)Lclient!if;", line = 22)
	public static Class320 method27450(@OriginalArg(0) int arg0) {
		@Pc(2) Class320[] local2 = Class107.method8774();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class320 local12 = local2[local4];
			if (arg0 == local12.anInt4075 * -919727987) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!if", name = "m", descriptor = "(Lclient!yf;I)V", line = 122)
	static void method27451(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(29) Class67 local29 = (Class67) Class77_Sub13_Sub12.aClass35_Sub22_1.method18319(local23);
		if (!local29.method968()) {
			@Pc(84) int local84 = local29.anInt198 * 263946597;
			if (local13 == -1) {
				arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local84;
			} else {
				arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ((Class303) Class252.aClass42_Sub2_1.method18319(local13)).method27162(local23, local84);
			}
			return;
		}
		@Pc(36) String local36 = local29.aString13;
		if (local13 == -1) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local36;
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = ((Class303) Class252.aClass42_Sub2_1.method18319(local13)).method27164(local23, local36);
		}
	}

	@OriginalMember(owner = "client!if", name = "z", descriptor = "(Lclient!arb;ILclient!yf;I)V", line = 350)
	static void method27452(@OriginalArg(0) Class77_Sub1_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class665 arg2) {
		arg2.anInt5784 = 0;
		arg2.anInt5781 = 0;
		arg2.anInt5786 = 793595371;
		arg2.aClass77_Sub1_Sub9_2 = arg0;
		arg2.aClass520Array2 = arg2.aClass77_Sub1_Sub9_2.aClass520Array1;
		arg2.anIntArray535 = arg2.aClass77_Sub1_Sub9_2.anIntArray281;
		@Pc(23) Class520 local23 = null;
		arg2.anInt5783 = 0;
		arg2.aMap22.clear();
		arg2.aMap22.put(Class127.aClass127_63, Class55.aClass124_1.aClass608_1);
		arg2.aMap22.put(Class127.aClass127_64, Class56.aClass93_Sub1_1);
		arg2.aMap22.put(Class127.aClass127_70, Class276.aClass93_1);
		if (arg2.aClass368_3 != null) {
			arg2.aMap22.put(Class127.aClass127_71, Class92.method23490(arg2.aClass368_3));
		}
		if (arg2.aClass104_Sub1_Sub1_Sub1_4 instanceof Class104_Sub1_Sub1_Sub1_Sub1) {
			arg2.aMap22.put(Class127.aClass127_68, arg2.aClass104_Sub1_Sub1_Sub1_4.anInterface18_3);
		}
		if (arg2.aClass104_Sub1_Sub1_Sub1_4 instanceof Class104_Sub1_Sub1_Sub1_Sub2) {
			arg2.aMap23.put(Class127.aClass127_63, arg2.aClass104_Sub1_Sub1_Sub1_4.anInterface18_3);
		}
		if (client.aClass243_1 != null) {
			arg2.aMap22.put(Class127.aClass127_67, client.aClass243_1.method26059());
		}
		try {
			Class674.anInt5801 = 0;
			while (true) {
				Class674.anInt5801 += 1572408215;
				if (Class674.anInt5801 * -1006492633 > arg1) {
					throw new RuntimeException("");
				}
				local23 = arg2.aClass520Array2[(arg2.anInt5786 += -793595371) * 662605117];
				if (Class674.aBoolean858 && (Class674.aString247 == null || arg2.aClass77_Sub1_Sub9_2.aString106 != null && arg2.aClass77_Sub1_Sub9_2.aString106.indexOf(Class674.aString247) != -1)) {
					System.out.println(arg2.aClass77_Sub1_Sub9_2.aString106 + ": " + local23);
				}
				if (arg2.anIntArray535[arg2.anInt5786 * 662605117] == 1) {
					arg2.aBoolean857 = true;
				} else {
					arg2.aBoolean857 = false;
				}
				if (Class520.aClass520_306 == local23 && arg2.anInt5783 * -1712769137 == 0) {
					return;
				}
				Class632.method32647(local23, arg2);
			}
		} catch (@Pc(187) Exception local187) {
			Class50.method754(arg2, local23, local187, "S");
		} finally {
			Class538.method30878();
		}
	}

	@OriginalMember(owner = "client!if", name = "bz", descriptor = "(III)Ljava/lang/String;", line = 1602)
	static String method27453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 - arg0;
		if (local3 < -9) {
			return Class192.method25433(16711680);
		} else if (local3 < -6) {
			return Class192.method25433(16723968);
		} else if (local3 < -3) {
			return Class192.method25433(16740352);
		} else if (local3 < 0) {
			return Class192.method25433(16756736);
		} else if (local3 > 9) {
			return Class192.method25433(65280);
		} else if (local3 > 6) {
			return Class192.method25433(4259584);
		} else if (local3 > 3) {
			return Class192.method25433(8453888);
		} else if (local3 > 0) {
			return Class192.method25433(12648192);
		} else {
			return Class192.method25433(16776960);
		}
	}

	@OriginalMember(owner = "client!if", name = "fx", descriptor = "(I)V", line = 2411)
	public static void method27454() {
		if (Class184.aFrame1 != null) {
			return;
		}
		@Pc(6) int local6 = client.anInt3366 * -721302779;
		@Pc(10) int local10 = client.anInt3367 * -350211099;
		@Pc(20) int local20 = Class402.anInt4694 * -166028671 - Class149_Sub4.anInt2368 * 1771907305 - local6;
		@Pc(30) int local30 = client.anInt3365 * 8272787 - Class19.anInt108 * -1091172141 - local10;
		if (local6 <= 0 && local20 <= 0 && local10 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(41) Container local41 = Class94.method7650();
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = 0;
			if (local41 == Class460.aFrame2) {
				@Pc(51) Insets local51 = Class460.aFrame2.getInsets();
				local43 = local51.left;
				local45 = local51.top;
			}
			@Pc(60) Graphics local60 = local41.getGraphics();
			local60.setColor(Color.black);
			if (local6 > 0) {
				local60.fillRect(local43, local45, local6, client.anInt3365 * 8272787);
			}
			if (local10 > 0) {
				local60.fillRect(local43, local45, Class402.anInt4694 * -166028671, local10);
			}
			if (local20 > 0) {
				local60.fillRect(Class402.anInt4694 * -166028671 + local43 - local20, local45, local20, client.anInt3365 * 8272787);
			}
			if (local30 > 0) {
				local60.fillRect(local43, local45 + client.anInt3365 * 8272787 - local30, Class402.anInt4694 * -166028671, local30);
			}
		} catch (@Pc(117) Exception local117) {
		}
	}

	@OriginalMember(owner = "client!if", name = "if", descriptor = "(IIIIZB)V", line = 4559)
	public static final void method27455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
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
		@Pc(33) int local33 = client.aShort154 + local13 * (client.aShort155 - client.aShort154) / 100;
		@Pc(43) int local43 = local33 * 512 * arg3 / (arg2 * 334);
		@Pc(73) int local73;
		@Pc(79) int local79;
		@Pc(48) short local48;
		if (local43 < client.aShort160) {
			local48 = client.aShort160;
			local33 = arg2 * 334 * local48 / (arg3 * 512);
			if (local33 > client.aShort159) {
				local33 = client.aShort159;
				local73 = arg3 * local33 * 512 / (local48 * 334);
				local79 = (arg2 - local73) / 2;
				if (arg4) {
					Class284.aClass86_9.method20299();
					Class284.aClass86_9.method19986(arg0, arg1, local79, arg3, -16777216);
					Class284.aClass86_9.method19986(arg2 + arg0 - local79, arg1, local79, arg3, -16777216);
				}
				arg0 += local79;
				arg2 -= local79 * 2;
			}
		} else if (local43 > client.aShort161) {
			local48 = client.aShort161;
			local33 = local48 * 334 * arg2 / (arg3 * 512);
			if (local33 < client.aShort158) {
				local33 = client.aShort158;
				local73 = local48 * 334 * arg2 / (local33 * 512);
				local79 = (arg3 - local73) / 2;
				if (arg4) {
					Class284.aClass86_9.method20299();
					Class284.aClass86_9.method19986(arg0, arg1, arg2, local79, -16777216);
					Class284.aClass86_9.method19986(arg0, arg1 + arg3 - local79, arg2, local79, -16777216);
				}
				arg1 += local79;
				arg3 -= local79 * 2;
			}
		}
		client.anInt3528 = arg3 * local33 / 334 * 574465361;
		client.anInt3525 = arg0 * 521583301;
		client.anInt3526 = arg1 * -977152555;
		client.anInt3482 = (short) arg2 * -1885059811;
		client.anInt3463 = (short) arg3 * -2005869579;
	}
}
