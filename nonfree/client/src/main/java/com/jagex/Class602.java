package com.jagex;

import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public class Class602 {

	@OriginalMember(owner = "client!uu", name = "dq", descriptor = "Lclient!asy;")
	static Class93_Sub1_Sub20 aClass93_Sub1_Sub20_4;

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "Ljava/util/LinkedList;")
	static LinkedList aLinkedList5 = new LinkedList();

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V", line = 15)
	Class602() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!uu", name = "z", descriptor = "(Lclient!alq;)V", line = 20)
	public static void method31854(@OriginalArg(0) Class54_Sub1 arg0) {
		Class370.method27995(arg0);
	}

	@OriginalMember(owner = "client!uu", name = "u", descriptor = "(Lclient!alq;)V", line = 20)
	public static void method31855(@OriginalArg(0) Class54_Sub1 arg0) {
		Class370.method27995(arg0);
	}

	@OriginalMember(owner = "client!uu", name = "p", descriptor = "(I)V", line = 24)
	public static void method31857(@OriginalArg(0) int arg0) {
		Class370.method27995(new Class605(arg0));
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "(Lclient!acx;)V", line = 28)
	public static void method31865(@OriginalArg(0) Class73 arg0) {
		Class370.method27995(new Class599(arg0));
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(III)V", line = 32)
	public static void method31858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class370.method27995(new Class53_Sub1(arg0, arg1, arg2, client.anInt3451 * 555943359, Class520.aClass144_3.anInt1338 * 1582435851, Class520.aClass144_3.anInt1337 * 446642039, Class520.aClass144_3.method11146(), Class520.aClass144_3.method11162(), Class477.aClass480_2.method29734()));
	}

	@OriginalMember(owner = "client!uu", name = "r", descriptor = "(III)V", line = 32)
	public static void method31859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class370.method27995(new Class53_Sub1(arg0, arg1, arg2, client.anInt3451 * 555943359, Class520.aClass144_3.anInt1338 * 1582435851, Class520.aClass144_3.anInt1337 * 446642039, Class520.aClass144_3.method11146(), Class520.aClass144_3.method11162(), Class477.aClass480_2.method29734()));
	}

	@OriginalMember(owner = "client!uu", name = "v", descriptor = "(III)V", line = 32)
	public static void method31862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class370.method27995(new Class53_Sub1(arg0, arg1, arg2, client.anInt3451 * 555943359, Class520.aClass144_3.anInt1338 * 1582435851, Class520.aClass144_3.anInt1337 * 446642039, Class520.aClass144_3.method11146(), Class520.aClass144_3.method11162(), Class477.aClass480_2.method29734()));
	}

	@OriginalMember(owner = "client!uu", name = "o", descriptor = "(Lclient!acw;Ljava/lang/String;ILjava/lang/Throwable;)V", line = 36)
	public static void method31861(@OriginalArg(0) Class72 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Throwable arg3) {
		Class370.method27995(new Class601(arg0, arg1, arg2, arg3));
	}

	@OriginalMember(owner = "client!uu", name = "s", descriptor = "(Lclient!un;)V", line = 40)
	static void method31856(@OriginalArg(0) Interface63 arg0) {
		while (aLinkedList5.size() > 10) {
			aLinkedList5.remove();
		}
		aLinkedList5.add(arg0);
	}

	@OriginalMember(owner = "client!uu", name = "y", descriptor = "(Lclient!un;)V", line = 40)
	static void method31863(@OriginalArg(0) Interface63 arg0) {
		while (aLinkedList5.size() > 10) {
			aLinkedList5.remove();
		}
		aLinkedList5.add(arg0);
	}

	@OriginalMember(owner = "client!uu", name = "q", descriptor = "(Lclient!un;)V", line = 40)
	static void method31864(@OriginalArg(0) Interface63 arg0) {
		while (aLinkedList5.size() > 10) {
			aLinkedList5.remove();
		}
		aLinkedList5.add(arg0);
	}

	@OriginalMember(owner = "client!uu", name = "x", descriptor = "()V", line = 45)
	public static void method31860() {
		if (client.anInt3435 * -849002901 != 18 && client.anInt3435 * -849002901 != 3 || client.aClass175_2 == null) {
			return;
		}
		while (true) {
			@Pc(17) Interface63 local17 = (Interface63) aLinkedList5.poll();
			if (local17 == null) {
				return;
			}
			local17.method31895();
		}
	}

	@OriginalMember(owner = "client!uu", name = "du", descriptor = "(Lclient!dh;Lclient!df;I)V", line = 89)
	static final void method31868(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class225 arg1) {
		if (Class159_Sub1.anInt1950 * -1574654625 == 100 || Class159_Sub1.aClass93_Sub1_Sub20_2 == null) {
			return;
		}
		Class305.method26796();
		Class305.method26796();
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (Class159_Sub1.anInt1950 * -1574654625 < 10) {
			for (local20 = 0; local20 < Class159_Sub1.aClass106ArrayArray1.length; local20++) {
				for (local26 = 0; local26 < Class159_Sub1.aClass106ArrayArray1[local20].length; local26++) {
					Class110_Sub7.aClass497_22.method30054(Class159_Sub1.aClass637_2.anIntArrayArray66[local20][local26]);
					Class633.aClass497_137.method30054(Class159_Sub1.aClass637_2.anIntArrayArray66[local20][local26]);
				}
			}
			if (!Class159_Sub1.aClass497_54.method30051(Class159_Sub1.aClass93_Sub1_Sub20_2.aString113)) {
				Class159_Sub1.anInt1950 = Class710.aClass497_143.method30045(Class159_Sub1.aClass93_Sub1_Sub20_2.aString113) / 10 * 1614212767;
				return;
			}
			Class159_Sub1.anInt1950 = -1037741514;
		}
		if (Class159_Sub1.anInt1950 * -1574654625 == 10) {
			Class159_Sub1.anInt1915 = Class159_Sub1.aClass93_Sub1_Sub20_2.anInt3166 * -332819059 >> 6 << 6;
			Class159_Sub1.anInt1921 = Class159_Sub1.aClass93_Sub1_Sub20_2.anInt3170 * 598304723 >> 6 << 6;
			Class159_Sub1.anInt1923 = (Class159_Sub1.aClass93_Sub1_Sub20_2.anInt3167 * -1863527503 >> 6 << 6) - Class159_Sub1.anInt1915 + 64;
			Class159_Sub1.anInt1922 = (Class159_Sub1.aClass93_Sub1_Sub20_2.anInt3169 * -1436122155 >> 6 << 6) - Class159_Sub1.anInt1921 + 64;
			@Pc(127) int[] local127 = new int[3];
			local26 = -1;
			@Pc(131) int local131 = -1;
			@Pc(135) Class472 local135 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229().aClass472_61;
			@Pc(139) Class611 local139 = client.aClass532_1.method30443();
			if (Class159_Sub1.aClass93_Sub1_Sub20_2.method23169(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, local139.anInt5623 * 270611681 + ((int) local135.aFloat317 >> 9), ((int) local135.aFloat319 >> 9) + local139.anInt5624 * -1994307635, local127)) {
				local26 = local127[1] - Class159_Sub1.anInt1915;
				local131 = local127[2] - Class159_Sub1.anInt1921;
			}
			if (!Class159_Sub1.aBoolean356 && local26 >= 0 && local26 < Class159_Sub1.anInt1923 && local131 >= 0 && local131 < Class159_Sub1.anInt1922) {
				local26 += (int) (Math.random() * 10.0D) - 5;
				local131 += (int) (Math.random() * 10.0D) - 5;
				Class93_Sub14.anInt1527 = local26 * -1845499089;
				Class159_Sub1.anInt1952 = local131 * 1415476369;
			} else if (Class159_Sub1.anInt1953 * 982555857 == -1 || Class159_Sub1.anInt1946 * -770621043 == -1) {
				Class159_Sub1.aClass93_Sub1_Sub20_2.method23168(Class159_Sub1.aClass93_Sub1_Sub20_2.anInt3163 * -1598154945 >> 14 & 0x3FFF, Class159_Sub1.aClass93_Sub1_Sub20_2.anInt3163 * -1598154945 & 0x3FFF, local127);
				Class93_Sub14.anInt1527 = (local127[1] - Class159_Sub1.anInt1915) * -1845499089;
				Class159_Sub1.anInt1952 = (local127[2] - Class159_Sub1.anInt1921) * 1415476369;
			} else {
				Class159_Sub1.aClass93_Sub1_Sub20_2.method23168(Class159_Sub1.anInt1953 * 982555857, Class159_Sub1.anInt1946 * -770621043, local127);
				if (local127 != null) {
					Class93_Sub14.anInt1527 = (local127[1] - Class159_Sub1.anInt1915) * -1845499089;
					Class159_Sub1.anInt1952 = (local127[2] - Class159_Sub1.anInt1921) * 1415476369;
				}
				Class159_Sub1.anInt1946 = 1150228155;
				Class159_Sub1.anInt1953 = 322880463;
				Class159_Sub1.aBoolean356 = false;
			}
			if (Class159_Sub1.aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 25) {
				Class159_Sub1.aFloat152 = 2.0F;
				Class159_Sub1.aFloat153 = 2.0F;
			} else if (Class159_Sub1.aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 37) {
				Class159_Sub1.aFloat152 = 3.0F;
				Class159_Sub1.aFloat153 = 3.0F;
			} else if (Class159_Sub1.aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 50) {
				Class159_Sub1.aFloat152 = 4.0F;
				Class159_Sub1.aFloat153 = 4.0F;
			} else if (Class159_Sub1.aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 75) {
				Class159_Sub1.aFloat152 = 6.0F;
				Class159_Sub1.aFloat153 = 6.0F;
			} else if (Class159_Sub1.aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 100) {
				Class159_Sub1.aFloat152 = 8.0F;
				Class159_Sub1.aFloat153 = 8.0F;
			} else if (Class159_Sub1.aClass93_Sub1_Sub20_2.anInt3165 * -2102669545 == 200) {
				Class159_Sub1.aFloat152 = 16.0F;
				Class159_Sub1.aFloat153 = 16.0F;
			} else {
				Class159_Sub1.aFloat152 = 8.0F;
				Class159_Sub1.aFloat153 = 8.0F;
			}
			Class159_Sub1.anInt1935 = (int) Class159_Sub1.aFloat153 >> 1;
			Class159_Sub1.aByteArrayArrayArray10 = Class166_Sub6.method15484(Class159_Sub1.anInt1935);
			Class358.method27780();
			Class159_Sub1.method14616();
			Class93_Sub9.aClass22_20 = new Class22();
			Class159_Sub1.anInt1917 += (int) (Math.random() * 5.0D) - 2;
			if (Class159_Sub1.anInt1917 < -8) {
				Class159_Sub1.anInt1917 = -8;
			}
			if (Class159_Sub1.anInt1917 > 8) {
				Class159_Sub1.anInt1917 = 8;
			}
			Class159_Sub1.anInt1918 += (int) (Math.random() * 5.0D) - 2;
			if (Class159_Sub1.anInt1918 < -16) {
				Class159_Sub1.anInt1918 = -16;
			}
			if (Class159_Sub1.anInt1918 > 16) {
				Class159_Sub1.anInt1918 = 16;
			}
			Class159_Sub1.method14511(arg1, Class159_Sub1.anInt1917 >> 2 << 10, Class159_Sub1.anInt1918 >> 1);
			Class159_Sub1.aClass32_Sub2_2.method16652(1024, 256);
			Class159_Sub1.aClass32_Sub20_2.method17465(256, 256);
			Class159_Sub1.aClass32_Sub14_7.method17822(4096);
			Class30.aClass32_Sub16_1.method17822(256);
			Class159_Sub1.anInt1950 = -2075483028;
		} else if (Class159_Sub1.anInt1950 * -1574654625 == 20) {
			if (!Class159_Sub1.aBoolean348) {
				Class481.method29753(true);
				Class159_Sub1.method14539(arg0, Class159_Sub1.anInt1917, Class159_Sub1.anInt1918, Class159_Sub1.aBoolean348);
				Class159_Sub1.anInt1950 = -1931481788;
				Class481.method29753(true);
				Class238.method25800();
			} else if (Class159_Sub1.method14539(arg0, Class159_Sub1.anInt1917, Class159_Sub1.anInt1918, Class159_Sub1.aBoolean348)) {
				Class159_Sub1.anInt1950 = -1931481788;
			}
		} else if (Class159_Sub1.anInt1950 * -1574654625 == 60) {
			if (Class159_Sub1.aClass497_54.method30069(Class159_Sub1.aClass93_Sub1_Sub20_2.aString113)) {
				if (!Class159_Sub1.aClass497_54.method30051(Class159_Sub1.aClass93_Sub1_Sub20_2.aString113)) {
					return;
				}
				Class159_Sub1.aClass584_2 = Class443.method28868(Class159_Sub1.aClass497_54, Class159_Sub1.aClass93_Sub1_Sub20_2.aString113, client.aBoolean620);
			} else {
				Class159_Sub1.aClass584_2 = new Class584(0);
			}
			Class159_Sub1.method14502();
			Class159_Sub1.anInt1950 = 1325743994;
			Class481.method29753(true);
			Class238.method25800();
		} else if (Class159_Sub1.anInt1950 * -1574654625 >= 70) {
			local20 = 0;
			while (true) {
				if (local20 >= 3) {
					Class159_Sub1.anInt1950 = -1787480548;
					System.gc();
					break;
				}
				for (local26 = 0; local26 < 5; local26++) {
					if (Class159_Sub1.aClass106ArrayArray1[local20][local26] == null || Class159_Sub1.aClass5ArrayArray1[local20][local26] == null) {
						Class159_Sub1.aClass106ArrayArray1[local20][local26] = (Class106) Class157.aClass462_2.method29264(client.anInterface50_1, Class159_Sub1.aClass637_2.anIntArrayArray66[local20][local26], true, true);
						Class159_Sub1.aClass5ArrayArray1[local20][local26] = Class157.aClass462_2.method29241(client.anInterface50_1, Class159_Sub1.aClass637_2.anIntArrayArray66[local20][local26]);
						if (Class159_Sub1.aClass106ArrayArray1[local20][local26] == null || Class159_Sub1.aClass5ArrayArray1[local20][local26] == null) {
							return;
						}
						Class159_Sub1.anInt1950 += 547671005;
					}
				}
				local20++;
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "li", descriptor = "(Lclient!yf;B)V", line = 6944)
	static final void method31867(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anInt5891 -= -987882558;
		@Pc(19) byte[] local19 = null;
		@Pc(21) byte[] local21 = null;
		@Pc(23) int local23;
		for (local23 = 0; local23 < 10 && arg0.anIntArray519[local23 + arg0.anInt5891 * -1497248091] >= 0; local23 += 2) {
		}
		if (local23 > 0) {
			local19 = new byte[local23 / 2];
			local21 = new byte[local23 / 2];
			for (local23 -= 2; local23 >= 0; local23 -= 2) {
				local19[local23 / 2] = (byte) arg0.anIntArray519[local23 + arg0.anInt5891 * -1497248091];
				local21[local23 / 2] = (byte) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + local23 + 1];
			}
		}
		Class392.method28295(local11, local19, local21, arg0);
	}

	@OriginalMember(owner = "client!uu", name = "aje", descriptor = "(Lclient!yf;I)V", line = 11492)
	static final void method31866(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(22) Class93_Sub1_Sub20 local22 = Class159.method14508(local12 >> 14 & 0x3FFF, local12 & 0x3FFF);
		if (local22 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local22.anInt3168 * 937363209;
		}
	}
}
